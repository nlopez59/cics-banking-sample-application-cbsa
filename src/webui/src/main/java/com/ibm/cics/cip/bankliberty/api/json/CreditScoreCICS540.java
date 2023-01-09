/*
 *
 *    Copyright IBM Corp. 2022
 *
 */
package com.ibm.cics.cip.bankliberty.api.json;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Future;

import com.ibm.cics.cip.bankliberty.dataInterfaces.CRECUST;
import com.ibm.cics.server.AsyncService;
import com.ibm.cics.server.AsyncServiceImpl;
import com.ibm.cics.server.CCSIDErrorException;
import com.ibm.cics.server.Channel;
import com.ibm.cics.server.ChannelErrorException;
import com.ibm.cics.server.ChildResponse;
import com.ibm.cics.server.CodePageErrorException;
import com.ibm.cics.server.Container;
import com.ibm.cics.server.ContainerErrorException;
import com.ibm.cics.server.InvalidRequestException;
import com.ibm.cics.server.InvalidTransactionIdException;
import com.ibm.cics.server.NotAuthorisedException;
import com.ibm.cics.server.NotFoundException;
import com.ibm.cics.server.ResourceDisabledException;
import com.ibm.cics.server.Task;
import com.ibm.cics.server.ChildResponse.CompletionStatus;

/**
 * This class is used with the jCICS ASYNC API to generate multiple credit scores
 * 
 */



public class CreditScoreCICS540 {

    static final String COPYRIGHT =
      "Copyright IBM Corp. 2022";
	
	

	public static CustomerJSON populateCreditScoreAndReviewDate(CustomerJSON customer)
	{
		
		int creditAgencyCount = 5;

		/*                Set up a random CS review date within the next 21 days */

		Calendar calendar = Calendar.getInstance();
		long nowMs = calendar.getTimeInMillis();
		int next21Days = new Random(calendar.getTimeInMillis()).nextInt(20);
		next21Days++;
		nowMs = nowMs + (1000L * 60L * 60L * 24L * next21Days);
		customer.setReviewDate(new Date(nowMs));
		Channel myCreditScoreChannel = null;

		try {
			myCreditScoreChannel = Task.getTask().createChannel("CIPCREDCHANN");
		} catch (ChannelErrorException e1) {
			e1.printStackTrace();
		}

		String[] transactionID = new String[creditAgencyCount];
		String[] containerID = new String[creditAgencyCount];
//		Future<ChildResponse>[] children = new Future[creditAgencyCount];
		List<Future<ChildResponse>> children = new ArrayList<Future<ChildResponse>>();
//		Object[] children = new Object[creditAgencyCount];
		int creditScoreTotal = 0;

		AsyncService asService = new AsyncServiceImpl();

		for(int i=0;i < creditAgencyCount;i++)
		{
			transactionID[i] = new String("O" + "CR" + (i +1));
			switch(i)
			{
			case 0:
				containerID[i] = new String("CIPA");
				break;
			case 1:
				containerID[i] = new String("CIPB");
				break;
			case 2:
				containerID[i] = new String("CIPC");
				break;
			case 3:
				containerID[i] = new String("CIPD");
				break;
			case 4:
				containerID[i] = new String("CIPE");
				break;
			case 5:
				containerID[i] = new String("CIPF");
				break;
			case 6:
				containerID[i] = new String("CIPG");
				break;
			case 7:
				containerID[i] = new String("CIPH");
				break;
			case 8:
				containerID[i] = new String("CIPI");
				break;					
			}

			CRECUST myCRECUST = new CRECUST();
			myCRECUST.setCommAddress(customer.getCustomerAddress());
			Calendar myCalendar = Calendar.getInstance();
			myCalendar.setTime(customer.getDateOfBirth());
			myCRECUST.setCommBirthDay(myCalendar.get(Calendar.DAY_OF_MONTH));
			myCRECUST.setCommBirthMonth(myCalendar.get(Calendar.MONTH) + 1);
			myCRECUST.setCommBirthYear(myCalendar.get(Calendar.YEAR));
			myCRECUST.setCommName(customer.getCustomerName());
			myCRECUST.setCommNumber(new Long(customer.getId()));
			myCalendar.setTime(customer.getReviewDate());
			myCRECUST.setCommCsReviewDd(myCalendar.get(Calendar.DAY_OF_MONTH));
			myCRECUST.setCommCsReviewMm(myCalendar.get(Calendar.MONTH) + 1);
			myCRECUST.setCommCsReviewYyyy(myCalendar.get(Calendar.YEAR));
			myCRECUST.setCommSortcode(new Integer(customer.getSortCode()));

			try {
				Container myContainer = myCreditScoreChannel.createContainer(containerID[i]);
				myContainer.put(myCRECUST.getByteBuffer());
			} catch (ContainerErrorException e1) {
				e1.printStackTrace();
			} catch (ChannelErrorException e1) {
				e1.printStackTrace();
			} catch (InvalidRequestException e) {
				e.printStackTrace();
			} catch (CCSIDErrorException e) {
				e.printStackTrace();
			} catch (CodePageErrorException e) {
				e.printStackTrace();
			}

			try {
				children.add(asService.runTransactionId(transactionID[i],myCreditScoreChannel));
			} catch (InvalidRequestException e) {
				e.printStackTrace();
			} catch (InvalidTransactionIdException e) {
				e.printStackTrace();
			} catch (NotAuthorisedException e) {
				e.printStackTrace();
			} catch (ResourceDisabledException e) {
				e.printStackTrace();
			} catch (ChannelErrorException e) {
				e.printStackTrace();
			}
		}



		//* Wait three seconds */
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{}
		
		int completedRequests = 0;
		while(completedRequests < creditAgencyCount)
		{
			ChildResponse anyOneWillDo = null;
			try {
				anyOneWillDo = asService.getAny();
			} catch (InvalidRequestException e1) {
				e1.printStackTrace();
			} catch (NotFoundException e1) {
				e1.printStackTrace();
			}
			if(anyOneWillDo.getCompletionStatus().equals(CompletionStatus.NORMAL))
			{
				Channel responseChannel = anyOneWillDo.getChannel();
				customer.setCreditScore("123");
				Container myContainer;
				boolean foundIt = false;
				for(int j = 0; !foundIt;j++)
				{
					try 
					{
						if(anyOneWillDo.equals(children.get(j)))
						{
							myContainer = responseChannel.getContainer(containerID[j]);
							byte[] myContainerBytes = myContainer.get();
							CRECUST myCRECUST = new CRECUST(myContainerBytes);
							creditScoreTotal = creditScoreTotal + myCRECUST.getCommCreditScore();
							foundIt = true;
							completedRequests++;
						}
					}
					catch(ContainerErrorException e)
					{
					} catch (ChannelErrorException e) {
						e.printStackTrace();
						Task.getTask().abend("CRDT");
					} catch (CCSIDErrorException e) {
						e.printStackTrace();
						Task.getTask().abend("CRDT");
					} catch (CodePageErrorException e) {
						e.printStackTrace();
						Task.getTask().abend("CRDT");
					}
				}

			} 
			else
			{
				System.err.println("One of the agencies didn't work");
				creditAgencyCount--;
			}
		}



		int creditScoreAverage = creditScoreTotal / creditAgencyCount;
		customer.setCreditScore(new Integer(creditScoreAverage).toString());
		return customer;
	}
	


}
