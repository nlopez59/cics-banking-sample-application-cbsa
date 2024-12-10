      ******************************************************************
      *                                                                *
      *  Copyright IBM Corp. 2023                                      *
      *                                                                *
      *                                                                *
      ******************************************************************
      * to use this have EIBRESP-STRING PIC X(40).
      * add this copybook somewhere in the PROCEDURE DIVISION
      * perform EIBRESP-TOSTRING
       EIBRESP-TOSTRING.
           MOVE SPACES TO EIBRESP-STRING.
           EVALUATE EIBRESP
           WHEN DFHRESP(NORMAL)
             MOVE 'NORMAL' TO EIBRESP-STRING
           WHEN DFHRESP(ERROR)
             MOVE 'ERROR' TO EIBRESP-STRING
           WHEN DFHRESP(RDATT)
             MOVE 'RDATT' TO EIBRESP-STRING
           WHEN DFHRESP(WRBRK)
             MOVE 'WRBRK' TO EIBRESP-STRING
           WHEN DFHRESP(EOF)
             MOVE 'EOF' TO EIBRESP-STRING
           WHEN DFHRESP(EODS)
             MOVE 'EODS' TO EIBRESP-STRING
           WHEN DFHRESP(EOC)
             MOVE 'EOC' TO EIBRESP-STRING
           WHEN DFHRESP(INBFMH)
             MOVE 'INBFMH' TO EIBRESP-STRING
           WHEN DFHRESP(ENDINPT)
             MOVE 'ENDINPT' TO EIBRESP-STRING
           WHEN DFHRESP(NONVAL)
             MOVE 'NONVAL' TO EIBRESP-STRING
           WHEN DFHRESP(NOSTART)
             MOVE 'NOSTART' TO EIBRESP-STRING
           WHEN DFHRESP(TERMIDERR)
             MOVE 'TERMIDERR' TO EIBRESP-STRING
           WHEN DFHRESP(FILENOTFOUND)
             MOVE 'FILENOTFOUND' TO EIBRESP-STRING
           WHEN DFHRESP(NOTFND)
             MOVE 'NOTFND' TO EIBRESP-STRING
           WHEN DFHRESP(DUPREC)
             MOVE 'DUPREC' TO EIBRESP-STRING
           WHEN DFHRESP(DUPKEY)
             MOVE 'DUPKEY' TO EIBRESP-STRING
           WHEN DFHRESP(INVREQ)
             MOVE 'INVREQ' TO EIBRESP-STRING
           WHEN DFHRESP(IOERR)
             MOVE 'IOERR' TO EIBRESP-STRING
           WHEN DFHRESP(NOSPACE)
             MOVE 'NOSPACE' TO EIBRESP-STRING
           WHEN DFHRESP(NOTOPEN)
             MOVE 'NOTOPEN' TO EIBRESP-STRING
           WHEN DFHRESP(ENDFILE)
             MOVE 'ENDFILE' TO EIBRESP-STRING
           WHEN DFHRESP(ILLOGIC)
             MOVE 'ILLOGIC' TO EIBRESP-STRING
           WHEN DFHRESP(LENGERR)
             MOVE 'LENGERR' TO EIBRESP-STRING
           WHEN DFHRESP(QZERO)
             MOVE 'QZERO' TO EIBRESP-STRING
           WHEN DFHRESP(SIGNAL)
             MOVE 'SIGNAL' TO EIBRESP-STRING
           WHEN DFHRESP(QBUSY)
             MOVE 'QBUSY' TO EIBRESP-STRING
           WHEN DFHRESP(ITEMERR)
             MOVE 'ITEMERR' TO EIBRESP-STRING
           WHEN DFHRESP(PGMIDERR)
             MOVE 'PGMIDERR' TO EIBRESP-STRING
           WHEN DFHRESP(TRANSIDERR)
             MOVE 'TRANSIDERR' TO EIBRESP-STRING
           WHEN DFHRESP(ENDDATA)
             MOVE 'ENDDATA' TO EIBRESP-STRING
           WHEN DFHRESP(INVTSREQ)
             MOVE 'INVTSREQ' TO EIBRESP-STRING
           WHEN DFHRESP(EXPIRED)
             MOVE 'EXPIRED' TO EIBRESP-STRING
           WHEN DFHRESP(RETPAGE)
             MOVE 'RETPAGE' TO EIBRESP-STRING
           WHEN DFHRESP(RTEFAIL)
             MOVE 'RTEFAIL' TO EIBRESP-STRING
           WHEN DFHRESP(RTESOME)
             MOVE 'RTESOME' TO EIBRESP-STRING
           WHEN DFHRESP(TSIOERR)
             MOVE 'TSIOERR' TO EIBRESP-STRING
           WHEN DFHRESP(MAPFAIL)
             MOVE 'MAPFAIL' TO EIBRESP-STRING
           WHEN DFHRESP(INVERRTERM)
             MOVE 'INVERRTERM' TO EIBRESP-STRING
           WHEN DFHRESP(INVMPSZ)
             MOVE 'INVMPSZ' TO EIBRESP-STRING
           WHEN DFHRESP(IGREQID)
             MOVE 'IGREQID' TO EIBRESP-STRING
           WHEN DFHRESP(OVERFLOW)
             MOVE 'OVERFLOW' TO EIBRESP-STRING
           WHEN DFHRESP(INVLDC)
             MOVE 'INVLDC' TO EIBRESP-STRING
           WHEN DFHRESP(NOSTG)
             MOVE 'NOSTG' TO EIBRESP-STRING
           WHEN DFHRESP(JIDERR)
             MOVE 'JIDERR' TO EIBRESP-STRING
           WHEN DFHRESP(QIDERR)
             MOVE 'QIDERR' TO EIBRESP-STRING
           WHEN DFHRESP(NOJBUFSP)
             MOVE 'NOJBUFSP' TO EIBRESP-STRING
           WHEN DFHRESP(DSSTAT)
             MOVE 'DSSTAT' TO EIBRESP-STRING
           WHEN DFHRESP(SELNERR)
             MOVE 'SELNERR' TO EIBRESP-STRING
           WHEN DFHRESP(FUNCERR)
             MOVE 'FUNCERR' TO EIBRESP-STRING
           WHEN DFHRESP(UNEXPIN)
             MOVE 'UNEXPIN' TO EIBRESP-STRING
           WHEN DFHRESP(NOPASSBKRD)
             MOVE 'NOPASSBKRD' TO EIBRESP-STRING
           WHEN DFHRESP(NOPASSBKWR)
             MOVE 'NOPASSBKWR' TO EIBRESP-STRING
           WHEN DFHRESP(SYSIDERR)
             MOVE 'SYSIDERR' TO EIBRESP-STRING
           WHEN DFHRESP(ISCINVREQ)
             MOVE 'ISCINVREQ' TO EIBRESP-STRING
           WHEN DFHRESP(ENQBUSY)
             MOVE 'ENQBUSY' TO EIBRESP-STRING
           WHEN DFHRESP(ENVDEFERR)
             MOVE 'ENVDEFERR' TO EIBRESP-STRING
           WHEN DFHRESP(IGREQCD)
             MOVE 'IGREQCD' TO EIBRESP-STRING
           WHEN DFHRESP(SESSIONERR)
             MOVE 'SESSIONERR' TO EIBRESP-STRING
           WHEN DFHRESP(SYSBUSY)
             MOVE 'SYSBUSY' TO EIBRESP-STRING
           WHEN DFHRESP(SESSBUSY)
             MOVE 'SESSBUSY' TO EIBRESP-STRING
           WHEN DFHRESP(NOTALLOC)
             MOVE 'NOTALLOC' TO EIBRESP-STRING
           WHEN DFHRESP(CBIDERR)
             MOVE 'CBIDERR' TO EIBRESP-STRING
           WHEN DFHRESP(INVEXITREQ)
             MOVE 'INVEXITREQ' TO EIBRESP-STRING
           WHEN DFHRESP(INVPARTNSET)
             MOVE 'INVPARTNSET' TO EIBRESP-STRING
           WHEN DFHRESP(PARTNFAIL)
             MOVE 'PARTNFAIL' TO EIBRESP-STRING
           WHEN DFHRESP(USERIDERR)
             MOVE 'USERIDERR' TO EIBRESP-STRING
           WHEN DFHRESP(NOTAUTH)
             MOVE 'NOTAUTH' TO EIBRESP-STRING
           WHEN DFHRESP(SUPPRESSED)
             MOVE 'SUPPRESSED' TO EIBRESP-STRING
           WHEN DFHRESP(RESIDERR)
             MOVE 'RESIDERR' TO EIBRESP-STRING
           WHEN DFHRESP(NOSPOOL)
             MOVE 'NOSPOOL' TO EIBRESP-STRING
           WHEN DFHRESP(TERMERR)
             MOVE 'TERMERR' TO EIBRESP-STRING
           WHEN DFHRESP(ROLLEDBACK)
             MOVE 'ROLLEDBACK' TO EIBRESP-STRING
           WHEN DFHRESP(END)
             MOVE 'END' TO EIBRESP-STRING
           WHEN DFHRESP(DISABLED)
             MOVE 'DISABLED' TO EIBRESP-STRING
           WHEN DFHRESP(ALLOCERR)
             MOVE 'ALLOCERR' TO EIBRESP-STRING
           WHEN DFHRESP(STRELERR)
             MOVE 'STRELERR' TO EIBRESP-STRING
           WHEN DFHRESP(OPENERR)
             MOVE 'OPENERR' TO EIBRESP-STRING
           WHEN DFHRESP(SPOLBUSY)
             MOVE 'SPOLBUSY' TO EIBRESP-STRING
           WHEN DFHRESP(SPOLERR)
             MOVE 'SPOLERR' TO EIBRESP-STRING
           WHEN DFHRESP(NODEIDERR)
             MOVE 'NODEIDERR' TO EIBRESP-STRING
           WHEN DFHRESP(TASKIDERR)
             MOVE 'TASKIDERR' TO EIBRESP-STRING
           WHEN DFHRESP(DSNNOTFOUND)
             MOVE 'DSNNOTFOUND' TO EIBRESP-STRING
           WHEN DFHRESP(LOADING)
             MOVE 'LOADING' TO EIBRESP-STRING
           WHEN DFHRESP(MODELIDERR)
             MOVE 'MODELIDERR' TO EIBRESP-STRING
           WHEN DFHRESP(SESSIONERR)
             MOVE 'SESSIONERR' TO EIBRESP-STRING
           WHEN DFHRESP(OUTDESCRERR)
             MOVE 'OUTDESCRERR' TO EIBRESP-STRING
           WHEN DFHRESP(PARTNERIDERR)
             MOVE 'PARTNERIDERR' TO EIBRESP-STRING
           WHEN DFHRESP(PROFILEIDERR)
             MOVE 'PROFILEIDERR' TO EIBRESP-STRING
           WHEN DFHRESP(NETNAMEIDERR)
             MOVE 'NETNAMEIDERR' TO EIBRESP-STRING
           WHEN DFHRESP(LOCKED)
             MOVE 'LOCKED' TO EIBRESP-STRING
           WHEN DFHRESP(RECORDBUSY)
             MOVE 'RECORDBUSY' TO EIBRESP-STRING
           WHEN DFHRESP(UOWNOTFOUND)
             MOVE 'UOWNOTFOUND' TO EIBRESP-STRING
           WHEN DFHRESP(UOWLNOTFOUND)
             MOVE 'UOWLNOTFOUND' TO EIBRESP-STRING
           WHEN DFHRESP(LINKABEND)
             MOVE 'LINKABEND' TO EIBRESP-STRING
           WHEN DFHRESP(CHANGED)
             MOVE 'CHANGED' TO EIBRESP-STRING
           WHEN DFHRESP(PROCESSBUSY)
             MOVE 'PROCESSBUSY' TO EIBRESP-STRING
           WHEN DFHRESP(ACTIVITYBUSY)
             MOVE 'ACTIVITYBUSY' TO EIBRESP-STRING
           WHEN DFHRESP(PROCESSERR)
             MOVE 'PROCESSERR' TO EIBRESP-STRING
           WHEN DFHRESP(ACTIVITYERR)
             MOVE 'ACTIVITYERR' TO EIBRESP-STRING
           WHEN DFHRESP(CONTAINERERR)
             MOVE 'CONTAINERERR' TO EIBRESP-STRING
           WHEN DFHRESP(EVENTERR)
             MOVE 'EVENTERR' TO EIBRESP-STRING
           WHEN DFHRESP(TOKENERR)
             MOVE 'TOKENERR' TO EIBRESP-STRING
           WHEN DFHRESP(NOTFINISHED)
             MOVE 'NOTFINISHED' TO EIBRESP-STRING
           WHEN DFHRESP(POOLERR)
             MOVE 'POOLERR' TO EIBRESP-STRING
           WHEN DFHRESP(TIMERERR)
             MOVE 'TIMERERR' TO EIBRESP-STRING
           WHEN DFHRESP(SYMBOLERR)
             MOVE 'SYMBOLERR' TO EIBRESP-STRING
           WHEN DFHRESP(TEMPLATERR)
             MOVE 'TEMPLATERR' TO EIBRESP-STRING
           WHEN DFHRESP(NOTSUPERUSER)
             MOVE 'NOTSUPERUSER' TO EIBRESP-STRING
           WHEN DFHRESP(CSDERR)
             MOVE 'CSDERR' TO EIBRESP-STRING
           WHEN DFHRESP(DUPRES)
             MOVE 'DUPRES' TO EIBRESP-STRING
           WHEN DFHRESP(RESUNAVAIL)
             MOVE 'RESUNAVAIL' TO EIBRESP-STRING
           WHEN DFHRESP(CHANNELERR)
             MOVE 'CHANNELERR' TO EIBRESP-STRING
           WHEN DFHRESP(CCSIDERR)
             MOVE 'CCSIDERR' TO EIBRESP-STRING
           WHEN DFHRESP(TIMEDOUT)
             MOVE 'TIMEDOUT' TO EIBRESP-STRING
           WHEN DFHRESP(CODEPAGEERR)
             MOVE 'CODEPAGEERR' TO EIBRESP-STRING
           WHEN DFHRESP(INCOMPLETE)
             MOVE 'INCOMPLETE' TO EIBRESP-STRING
           END-EVALUATE.
       EIBRESP-TOSTRING-EXIT.
           EXIT.