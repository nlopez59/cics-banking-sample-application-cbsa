/*
 *
 *    Copyright IBM Corp. 2023
 *
 *
 */

package com.ibm.cics.cip.bankliberty.datainterfaces;
import com.ibm.jzos.fields.*;

// Generated by IBM Record Generator for Java V3.0.2 Build 20221206-1121 on: Tue Feb 14 06:51:17 CST 2023

public class CRECUST {
	protected static CobolDatatypeFactory factory = new CobolDatatypeFactory();
	static { factory.setStringTrimDefault(false); } 

	/** <pre>
	 LINKAGE SECTION. </pre> */
	public static final int DFHCOMMAREA_LEN = 261; 

	/** <pre>
	 01 DFHCOMMAREA.
	     COPY CRECUST.
    *
    *
    *    Copyright IBM Corp. 2023
    *
    *
    *
	    03 COMM-EYECATCHER                 PIC X(4). </pre> */
	protected static final StringField COMM_EYECATCHER = factory.getStringField(4);

	/** <pre>
	******************************************************************
	    03 COMM-EYECATCHER                 PIC X(4). </pre> */
	public static final int COMM_KEY_LEN = 16; 
	public static final int COMM_KEY_OFFSET = factory.getOffset();

	/** <pre>
	    03 COMM-EYECATCHER                 PIC X(4). </pre> */
	protected static final ExternalDecimalAsIntField COMM_SORTCODE = factory.getExternalDecimalAsIntField(6, false, false, false, false);

	/** <pre>
	    03 COMM-KEY. </pre> */
	protected static final ExternalDecimalAsLongField COMM_NUMBER = factory.getExternalDecimalAsLongField(10, false, false, false, false);

	/** <pre>
	       05 COMM-SORTCODE                PIC 9(6) DISPLAY. </pre> */
	protected static final StringField COMM_NAME = factory.getStringField(60);

	/** <pre>
	       05 COMM-NUMBER                  PIC 9(10) DISPLAY. </pre> */
	protected static final StringField COMM_ADDRESS = factory.getStringField(160);

	/** <pre>
	    03 COMM-NAME                       PIC X(60). </pre> */
	protected static final ExternalDecimalAsIntField COMM_DATE_OF_BIRTH = factory.getExternalDecimalAsIntField(8, false, false, false, false);

	/** <pre>
	    03 COMM-ADDRESS                    PIC X(160). </pre> */
	static { factory.pushOffset(); } 
	static { factory.setOffset(COMM_DATE_OF_BIRTH.getOffset()); } 
	public static final int COMM_DOB_GROUP_LEN = 8; 
	public static final int COMM_DOB_GROUP_OFFSET = factory.getOffset();

	/** <pre>
	    03 COMM-DATE-OF-BIRTH              PIC 9(8). </pre> */
	protected static final ExternalDecimalAsIntField COMM_BIRTH_DAY = factory.getExternalDecimalAsIntField(2, false, false, false, false);

	/** <pre>
	    03 COMM-DOB-GROUP REDEFINES COMM-DATE-OF-BIRTH. </pre> */
	protected static final ExternalDecimalAsIntField COMM_BIRTH_MONTH = factory.getExternalDecimalAsIntField(2, false, false, false, false);

	/** <pre>
	       05 COMM-BIRTH-DAY               PIC 99. </pre> */
	protected static final ExternalDecimalAsIntField COMM_BIRTH_YEAR = factory.getExternalDecimalAsIntField(4, false, false, false, false);
	static { factory.popOffset(); } 

	/** <pre>
	       05 COMM-BIRTH-MONTH             PIC 99. </pre> */
	protected static final ExternalDecimalAsIntField COMM_CREDIT_SCORE = factory.getExternalDecimalAsIntField(3, false, false, false, false);

	/** <pre>
	       05 COMM-BIRTH-YEAR              PIC 9999. </pre> */
	protected static final ExternalDecimalAsIntField COMM_CS_REVIEW_DATE = factory.getExternalDecimalAsIntField(8, false, false, false, false);

	/** <pre>
	    03 COMM-CREDIT-SCORE               PIC 999. </pre> */
	static { factory.pushOffset(); } 
	static { factory.setOffset(COMM_CS_REVIEW_DATE.getOffset()); } 
	public static final int COMM_CS_REVIEW_DATE_GROUP_LEN = 8; 
	public static final int COMM_CS_REVIEW_DATE_GROUP_OFFSET = factory.getOffset();

	/** <pre>
	    03 COMM-CS-REVIEW-DATE             PIC 9(8). </pre> */
	protected static final ExternalDecimalAsIntField COMM_CS_REVIEW_DD = factory.getExternalDecimalAsIntField(2, false, false, false, false);

	/** <pre>
	    03 COMM-CS-REVIEW-DATE-GROUP REDEFINES COMM-CS-REVIEW-DATE. </pre> */
	protected static final ExternalDecimalAsIntField COMM_CS_REVIEW_MM = factory.getExternalDecimalAsIntField(2, false, false, false, false);

	/** <pre>
	       05 COMM-CS-REVIEW-DD            PIC 99. </pre> */
	protected static final ExternalDecimalAsIntField COMM_CS_REVIEW_YYYY = factory.getExternalDecimalAsIntField(4, false, false, false, false);
	static { factory.popOffset(); } 

	/** <pre>
	       05 COMM-CS-REVIEW-MM            PIC 99. </pre> */
	protected static final StringField COMM_SUCCESS = factory.getStringField(1);

	/** <pre>
	       05 COMM-CS-REVIEW-YYYY          PIC 9999. </pre> */
	protected static final StringField COMM_FAIL_CODE = factory.getStringField(1);

	protected byte[] byteBuffer;
	// Instance variables used to cache field values
	protected String commEyecatcher;
	protected int commSortcode;
	protected boolean commSortcodeIsSet;
	protected long commNumber;
	protected boolean commNumberIsSet;
	protected String commName;
	protected String commAddress;
	protected int commCreditScore;
	protected boolean commCreditScoreIsSet;
	protected String commSuccess;
	protected String commFailCode;


	public CRECUST (byte[] buffer) {
		this.byteBuffer = buffer;
	}

	public CRECUST () {
		this.byteBuffer = new byte[DFHCOMMAREA_LEN];
	}

	public byte[] getByteBuffer() {
		return byteBuffer;
	}


	public String getCommEyecatcher() {
		if (commEyecatcher == null) {
			commEyecatcher = COMM_EYECATCHER.getString(byteBuffer);
		}
		return commEyecatcher;
	}

	public void setCommEyecatcher(String commEyecatcher) {
		if (COMM_EYECATCHER.equals(this.commEyecatcher, commEyecatcher)) {
			return;
		}
		COMM_EYECATCHER.putString(commEyecatcher, byteBuffer);
		this.commEyecatcher = commEyecatcher;
	}

	public int getCommSortcode() {
		if (!commSortcodeIsSet) {
			commSortcode = COMM_SORTCODE.getInt(byteBuffer);
			commSortcodeIsSet = true;
		}
		return commSortcode;
	}

	public void setCommSortcode(int commSortcode) {
		if (commSortcodeIsSet && COMM_SORTCODE.equals(this.commSortcode, commSortcode)) {
			return;
		}
		COMM_SORTCODE.putInt(commSortcode, byteBuffer);
		this.commSortcode = commSortcode;
		commSortcodeIsSet = true;
	}

	public long getCommNumber() {
		if (!commNumberIsSet) {
			commNumber = COMM_NUMBER.getLong(byteBuffer);
			commNumberIsSet = true;
		}
		return commNumber;
	}

	public void setCommNumber(long commNumber) {
		if (commNumberIsSet && COMM_NUMBER.equals(this.commNumber, commNumber)) {
			return;
		}
		COMM_NUMBER.putLong(commNumber, byteBuffer);
		this.commNumber = commNumber;
		commNumberIsSet = true;
	}

	public String getCommName() {
		if (commName == null) {
			commName = COMM_NAME.getString(byteBuffer);
		}
		return commName;
	}

	public void setCommName(String commName) {
		if (COMM_NAME.equals(this.commName, commName)) {
			return;
		}
		COMM_NAME.putString(commName, byteBuffer);
		this.commName = commName;
	}

	public String getCommAddress() {
		if (commAddress == null) {
			commAddress = COMM_ADDRESS.getString(byteBuffer);
		}
		return commAddress;
	}

	public void setCommAddress(String commAddress) {
		if (COMM_ADDRESS.equals(this.commAddress, commAddress)) {
			return;
		}
		COMM_ADDRESS.putString(commAddress, byteBuffer);
		this.commAddress = commAddress;
	}

	public int getCommDateOfBirth() {
		return COMM_DATE_OF_BIRTH.getInt(byteBuffer);
	}

	public void setCommDateOfBirth(int commDateOfBirth) {
		COMM_DATE_OF_BIRTH.putInt(commDateOfBirth, byteBuffer);
	}

	public int getCommBirthDay() {
		return COMM_BIRTH_DAY.getInt(byteBuffer);
	}

	public void setCommBirthDay(int commBirthDay) {
		COMM_BIRTH_DAY.putInt(commBirthDay, byteBuffer);
	}

	public int getCommBirthMonth() {
		return COMM_BIRTH_MONTH.getInt(byteBuffer);
	}

	public void setCommBirthMonth(int commBirthMonth) {
		COMM_BIRTH_MONTH.putInt(commBirthMonth, byteBuffer);
	}

	public int getCommBirthYear() {
		return COMM_BIRTH_YEAR.getInt(byteBuffer);
	}

	public void setCommBirthYear(int commBirthYear) {
		COMM_BIRTH_YEAR.putInt(commBirthYear, byteBuffer);
	}

	public int getCommCreditScore() {
		if (!commCreditScoreIsSet) {
			commCreditScore = COMM_CREDIT_SCORE.getInt(byteBuffer);
			commCreditScoreIsSet = true;
		}
		return commCreditScore;
	}

	public void setCommCreditScore(int commCreditScore) {
		if (commCreditScoreIsSet && COMM_CREDIT_SCORE.equals(this.commCreditScore, commCreditScore)) {
			return;
		}
		COMM_CREDIT_SCORE.putInt(commCreditScore, byteBuffer);
		this.commCreditScore = commCreditScore;
		commCreditScoreIsSet = true;
	}

	public int getCommCsReviewDate() {
		return COMM_CS_REVIEW_DATE.getInt(byteBuffer);
	}

	public void setCommCsReviewDate(int commCsReviewDate) {
		COMM_CS_REVIEW_DATE.putInt(commCsReviewDate, byteBuffer);
	}

	public int getCommCsReviewDd() {
		return COMM_CS_REVIEW_DD.getInt(byteBuffer);
	}

	public void setCommCsReviewDd(int commCsReviewDd) {
		COMM_CS_REVIEW_DD.putInt(commCsReviewDd, byteBuffer);
	}

	public int getCommCsReviewMm() {
		return COMM_CS_REVIEW_MM.getInt(byteBuffer);
	}

	public void setCommCsReviewMm(int commCsReviewMm) {
		COMM_CS_REVIEW_MM.putInt(commCsReviewMm, byteBuffer);
	}

	public int getCommCsReviewYyyy() {
		return COMM_CS_REVIEW_YYYY.getInt(byteBuffer);
	}

	public void setCommCsReviewYyyy(int commCsReviewYyyy) {
		COMM_CS_REVIEW_YYYY.putInt(commCsReviewYyyy, byteBuffer);
	}

	public String getCommSuccess() {
		if (commSuccess == null) {
			commSuccess = COMM_SUCCESS.getString(byteBuffer);
		}
		return commSuccess;
	}

	public void setCommSuccess(String commSuccess) {
		if (COMM_SUCCESS.equals(this.commSuccess, commSuccess)) {
			return;
		}
		COMM_SUCCESS.putString(commSuccess, byteBuffer);
		this.commSuccess = commSuccess;
	}

	public String getCommFailCode() {
		if (commFailCode == null) {
			commFailCode = COMM_FAIL_CODE.getString(byteBuffer);
		}
		return commFailCode;
	}

	public void setCommFailCode(String commFailCode) {
		if (COMM_FAIL_CODE.equals(this.commFailCode, commFailCode)) {
			return;
		}
		COMM_FAIL_CODE.putString(commFailCode, byteBuffer);
		this.commFailCode = commFailCode;
	}

}