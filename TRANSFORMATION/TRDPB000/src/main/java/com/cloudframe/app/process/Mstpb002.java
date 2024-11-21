package com.cloudframe.app.process;

import com.cloudframe.app.mstpb002.Mstpb002Ctx.GetSecurityOutCtx;
import com.cloudframe.app.mstpb002.Mstpb002Ctx.MainlineOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.mstpb002.Mstpb002Ctx;
import com.cloudframe.app.mstpb002.Mstpb002Ctx.GetSecurityInCtx;



public interface Mstpb002 {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Mstpb002Ctx programCtx, String parm) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Mstpb002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(Mstpb002Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-GET-SECURITY
     *
     * @return 
     */
    public GetSecurityOutCtx getSecurity(GetSecurityInCtx methodIn) throws Exception;


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
