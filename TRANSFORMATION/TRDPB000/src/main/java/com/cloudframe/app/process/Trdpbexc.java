package com.cloudframe.app.process;

import com.cloudframe.app.trdpbexc.TrdpbexcCtx.MainlineOutCtx;
import com.cloudframe.app.trdpbexc.TrdpbexcCtx.MainlineInCtx;
import com.cloudframe.app.trdpbexc.TrdpbexcCtx;
import com.cloudframe.app.trdpbexc.TrdpbexcCtx.AbendDumpInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.trdpbexc.TrdpbexcCtx.AbendDumpOutCtx;



public interface Trdpbexc {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(TrdpbexcCtx programCtx, String parm, String parm2) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(TrdpbexcCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9999-ABEND-DUMP
     *
     * @return 
     */
    public AbendDumpOutCtx abendDump(AbendDumpInCtx methodIn) throws Exception;


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
