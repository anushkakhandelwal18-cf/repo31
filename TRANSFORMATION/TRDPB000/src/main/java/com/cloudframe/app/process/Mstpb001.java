package com.cloudframe.app.process;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.mstpb001.Mstpb001Ctx.GetCustomerOutCtx;
import com.cloudframe.app.mstpb001.Mstpb001Ctx.GetCustomerInCtx;
import com.cloudframe.app.mstpb001.Mstpb001Ctx;
import com.cloudframe.app.mstpb001.Mstpb001Ctx.MainlineOutCtx;



public interface Mstpb001 {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Mstpb001Ctx programCtx, String parm) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Mstpb001Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(Mstpb001Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-GET-CUSTOMER
     *
     * @return 
     */
    public GetCustomerOutCtx getCustomer(GetCustomerInCtx methodIn) throws Exception;


     /**
	 * This will invoke the program given parameters from the
      * caller program.
	 *
	 * @return return code of the program
	 */
     public int call(Object[] parameters) throws Exception;

     /**
	 * This will invoke the program given Field parameters from
      * the caller program.
	 *
	 * @return return code of the program
	 */
     public int call(Field... parameters) throws Exception;
}
