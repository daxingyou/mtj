/*   */ package com.nirvana.exception;
/*   */ @ScalaSignature(bytes = "\006\001-4A!\001\002\001\023\t\t\")^:j]\026\0348/\022=dKB$\030n\0348\013\005\r!\021!C3yG\026\004H/[8o\025\t)a!A\004oSJ4\030M\\1\013\003\035\t1aY8n\007\001\031\"\001\001\006\021\005-)bB\001\007\023\035\ti\001#D\001\017\025\ty\001\"\001\004=e>|GOP\005\002#\005)1oY1mC&\0211\003F\001\ba\006\0347.Y4f\025\005\t\022B\001\f\030\005A\021VO\034;j[\026,\005pY3qi&|gN\003\002\024)!A\021\004\001B\001B\003%!$A\004nKN\034\030mZ3\021\005mybB\001\017\036\033\005!\022B\001\020\025\003\031\001&/\0323fM&\021\001%\t\002\007'R\024\030N\\4\013\005y!\002\002C\022\001\005\003\005\013\021\002\023\002\033\025D8-\0329uS>tG+\0379f!\t)\023F\004\002'O5\t!!\003\002)\005\005iQ\t_2faRLwN\034+za\026L!AK\026\003\013Y\013G.^3\n\0051\"\"aC#ok6,'/\031;j_:DQA\f\001\005\002=\na\001P5oSRtDc\001\0312eA\021a\005\001\005\00635\002\rA\007\005\bG5\002\n\0211\001%\021\035!\004A1A\005\nU\n1!\032:s+\0051\004CA\034;\033\005A$BA\035\005\003\021\031wN]3\n\005mB$aB'ba\n+\027M\034\005\007{\001\001\013\021\002\034\002\t\025\024(\017\t\005\006\001!\t!N\001\016O\026$XI\035:NCB\024U-\0318)\t\001\tE)\022\t\0039\tK!a\021\013\003!M+'/[1m-\026\0248/[8o+&#\025!\002<bYV,g\004\003{\037rQ@`(5a\b\017\035\023\021\021!E\001\021\006\t\")^:j]\026\0348/\022=dKB$\030n\0348\021\005\031JeaB\001\003\003\003E\tAS\n\004\023.s\005C\001\017M\023\tiEC\001\004B]f\024VM\032\t\0039=K!\001\025\013\003\031M+'/[1mSj\f'\r\\3\t\0139JE\021\001*\025\003!Cq\001V%\022\002\023\005Q+A\016%Y\026\0348/\0338ji\022:'/Z1uKJ$C-\0324bk2$HEM\013\002-*\022AeV\026\0021B\021\021LX\007\0025*\0211\fX\001\nk:\034\007.Z2lK\022T!!\030\013\002\025\005tgn\034;bi&|g.\003\002`5\n\tRO\\2iK\016\\W\r\032,be&\fgnY3\t\017\005L\025\021!C\005E\006Y!/Z1e%\026\034x\016\034<f)\005\031\007C\0013j\033\005)'B\0014h\003\021a\027M\\4\013\003!\fAA[1wC&\021!.\032\002\007\037\nTWm\031;")
/*   */ public class BusinessException extends RuntimeException {
/*   */   public static final long serialVersionUID = -820155457363652160L;
/*   */   
/* 6 */   public BusinessException(String message, Enumeration.Value exceptionType) { super(message);
/* 7 */     (new scala.Tuple2[2])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("errCode"), BoxesRunTime.boxToInteger(exceptionType.id())); (new scala.Tuple2[2])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("errMsg"), message); this.err = MapBean$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[2])); } private final MapBean err; private MapBean err() { return this.err; }
/*   */    public MapBean getErrMapBean() {
/* 9 */     return err();
/*   */   }
/*   */   
/*   */   public static Enumeration.Value $lessinit$greater$default$2() {
/*   */     return BusinessException$.MODULE$.$lessinit$greater$default$2();
/*   */   }
/*   */ }


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\exception\BusinessException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */