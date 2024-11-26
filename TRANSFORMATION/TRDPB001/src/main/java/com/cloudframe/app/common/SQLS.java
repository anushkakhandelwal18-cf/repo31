package com.cloudframe.app.common;
/* Java Code Generated by CloudFrame */ 
public class SQLS {
 
public static final char[] SQL_1273972904 = "SELECT POS_BALANCE FROM TBTRDPOS WHERE POS_CURRENCY = ? AND POS_SAC_NUMBER = ? AND POS_FIGI = ? FOR UPDATE OF POS_BALANCE".toCharArray() ;
public static final char[] SQL_1354410233 = "SELECT SUM_CUSTOMER_ID , SUM_OVERDUE , SUM_REJECTED , SUM_SETTLED , SUM_CURRENCY , SUM_OPEN_BALANCE , SUM_TOTAL_DEBIT , SUM_TOTAL_CREDIT , SUM_CLOSE_BALANCE FROM TBTRDSUM WHERE SUM_CUSTOMER_ID = ? FOR UPDATE OF SUM_OVERDUE , SUM_REJECTED , SUM_SETTLED , SUM_CURRENCY , SUM_OPEN_BALANCE , SUM_TOTAL_DEBIT , SUM_TOTAL_CREDIT , SUM_CLOSE_BALANCE".toCharArray() ;
public static final char[] SQL_150892171 = "INSERT INTO TBTRDEXC ( EXC_TYPE , EXC_DESCRIPTION ) VALUES ( ? , ? )".toCharArray() ;
public static final char[] SQL_150892171_1 = "INSERT INTO TBTRDEXC ( EXC_TYPE , EXC_DESCRIPTION ) VALUES ( ? , ? )".toCharArray() ;
public static final char[] SQL_150892171_2 = "INSERT INTO TBTRDEXC ( EXC_TYPE , EXC_DESCRIPTION ) VALUES ( ? , ? )".toCharArray() ;
public static final char[] SQL_1886454020 = "UPDATE TBTRDMAC SET MAC_BALANCE = ? WHERE MAC_CURRENCY = ? AND MAC_NUMBER = ?".toCharArray() ;
public static final char[] SQL_203945070 = "UPDATE TBTRDLOG SET LOG_END_TS = ? WHERE LOG_TRANSACTION = ? AND LOG_CURRENCY = ?".toCharArray() ;
public static final char[] SQL_203945070_1 = "UPDATE TBTRDLOG SET LOG_END_TS = ? WHERE LOG_TRANSACTION = ? AND LOG_CURRENCY = ?".toCharArray() ;
public static final char[] SQL_2131911232 = "SELECT MAC_BALANCE FROM TBTRDMAC WHERE MAC_CURRENCY = ? AND MAC_NUMBER = ? FOR UPDATE OF MAC_BALANCE".toCharArray() ;
public static final char[] SQL_312959442 = "UPDATE TBTRDSUM SET SUM_OVERDUE = ? , SUM_REJECTED = ? , SUM_SETTLED = ? , SUM_CURRENCY = ? , SUM_OPEN_BALANCE = ? , SUM_TOTAL_DEBIT = ? , SUM_TOTAL_CREDIT = ? , SUM_CLOSE_BALANCE = ? WHERE SUM_CUSTOMER_ID = ?".toCharArray() ;
public static final char[] SQL_337073571 = "UPDATE TBTRDORD SET ORD_STATUS = ? WHERE ORD_CURRENCY = ? AND ORD_TRADING_XCHNG = ? AND ORD_TRADEID = ? AND ORD_FIGI = ? AND ORD_BUY_SELL_IND = ?".toCharArray() ;
public static final char[] SQL_480142874 = "INSERT INTO TBTRDSUM VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? )".toCharArray() ;
public static final char[] SQL_523195946 = "INSERT INTO TBTRDLOG VALUES ( ? , ? , ? , ? )".toCharArray() ;
public static final char[] SQL_644545964 = "SELECT MAC_BALANCE FROM TBTRDMAC WHERE MAC_CURRENCY = ? AND MAC_NUMBER = ? WITH UR".toCharArray() ;
public static final char[] SQL_716332205 = "DELETE FROM TBTRDSTQ WHERE STQ_CURRENCY = ? AND STQ_ID = ?".toCharArray() ;
public static final char[] SQL_716332205_1 = "DELETE FROM TBTRDSTQ WHERE STQ_CURRENCY = ? AND STQ_ID = ?".toCharArray() ;
public static final char[] SQL_727592218 = "SELECT STQ_ID , STQ_TRADE_DATA FROM TBTRDSTQ WHERE STQ_CURRENCY = ? ORDER BY STQ_CURRENCY ASC , STQ_ID ASC".toCharArray() ;
public static final char[] SQL_950136353 = "UPDATE TBTRDPOS SET POS_BALANCE = ? WHERE POS_CURRENCY = ? AND POS_SAC_NUMBER = ? AND POS_FIGI = ?".toCharArray() ;
 
}
