/*   */ package com.nirvana.exception;
/*   */ 
/*   */ @ScalaSignature(bytes = "\006\001m1A!\001\002\001\023\t\021bi\034:cS\022$WM\\#yG\026\004H/[8o\025\t\031A!A\005fq\016,\007\017^5p]*\021QAB\001\b]&\024h/\0318b\025\0059\021aA2p[\016\0011C\001\001\013!\tYA\"D\001\003\023\ti!AA\tCkNLg.Z:t\013b\034W\r\035;j_:DQa\004\001\005\002A\ta\001P5oSRtD#A\t\021\005-\001\001\006\002\001\0243i\001\"\001F\f\016\003UQ\021AF\001\006g\016\fG.Y\005\0031U\021\001cU3sS\006dg+\032:tS>tW+\023#\002\013Y\fG.^3\037\021)\021\nG`<8<\007")
/*   */ public class ForbiddenException extends BusinessException {
/*   */   public ForbiddenException() {
/* 6 */     super(MessageI18n$.MODULE$.getString("ForbiddenException"), ExceptionType$.MODULE$.FORBIDDEN());
/*   */   }
/*   */   
/*   */   public static final long serialVersionUID = 761724606716238798L;
/*   */ }


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\exception\ForbiddenException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */