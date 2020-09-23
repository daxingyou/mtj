/*    */ package com.nirvana.aofei;
/*    */ 
/*    */ import java.util.Calendar;
/*    */ import java.util.concurrent.ExecutorService;
/*    */ import java.util.concurrent.ThreadPoolExecutor;
/*    */ import scala.Enumeration;
/*    */ import scala.Predef$;
/*    */ import scala.collection.immutable.List;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005ua!B\001\003\003\003I!AD!p\r\026LGj\\4UQJ,\027\r\032\006\003\007\021\tQ!Y8gK&T!!\002\004\002\0179L'O^1oC*\tq!A\002d_6\034\001a\005\003\001\025IA\002CA\006\021\033\005a!BA\007\017\003\021a\027M\\4\013\003=\tAA[1wC&\021\021\003\004\002\007\037\nTWm\031;\021\005M1R\"\001\013\013\005U!\021\001B2pe\026L!a\006\013\003\031\005+Ho\034*v]:\f'\r\\3\021\005MI\022B\001\016\025\005!\031F/\031;CK\006t\007\"\002\017\001\t\003i\022A\002\037j]&$h\bF\001\037!\ty\002!D\001\003\021\035\t\003A1A\005\006\t\n!\002V%N\013~\033\006+Q\"F+\005\031s\"\001\023\036\007\021\031\n\035\003\004'\001\001\006iaI\001\f)&kUiX*Q\003\016+\005\005C\004)\001\t\007I\021A\025\002\t1|wm]\013\002UA!1F\r\033@\033\005a#BA\027/\003\035iW\017^1cY\026T!a\f\031\002\025\r|G\016\\3di&|gNC\0012\003\025\0318-\0317b\023\t\031DFA\002NCB\004\"!N\036\017\005YJT\"A\034\013\005a\"\021!\002;za\026\034\030B\001\0368\0031\tuNR3j\031><G+\0379f\023\taTHA\003WC2,X-\003\002?a\tYQI\\;nKJ\fG/[8o!\ty\002)\003\002B\005\tA\021i\034$fS2{w\r\003\004D\001\001\006IAK\001\006Y><7\017\t\005\b\013\002\021\r\021\"\001G\003!)\0070Z2vi>\024X#A$\021\005!kU\"A%\013\005)[\025AC2p]\016,(O]3oi*\021AJD\001\005kRLG.\003\002O\023\nyQ\t_3dkR|'oU3sm&\034W\r\003\004Q\001\001\006IaR\001\nKb,7-\036;pe\002BQA\025\001\007\002M\013A!\0338jiV\tA\013\005\002V-6\t\001'\003\002Xa\t!QK\\5u\021\025I\006\001\"\001[\003!\021XmZ5ti\026\024HC\001+\\\021\025a\006\f1\0015\0031\twNR3j\031><G+\0379f\021\025q\006\001\"\021`\003\r\021XO\034\013\002)\")\021\r\001C\tE\006\031An\\4\025\007Q\033G\rC\003]A\002\007A\007C\003fA\002\007a-\001\003mS:,\007cA4pe:\021\001.\034\b\003S2l\021A\033\006\003W\"\ta\001\020:p_Rt\024\"A\031\n\0059\004\024a\0029bG.\fw-Z\005\003aF\024A\001T5ti*\021a\016\r\t\003+NL!\001\036\031\003\007\005s\027\020C\003w\001\021Eq/A\006hKR$\025\r^3J]\032|W#\001=\021\007\035|\027\020\005\002Vu&\0211\020\r\002\004\023:$\b\"B?\001\t\003q\030\001D4fiRKW.Z:uC6\004X#A@\021\007U\013\t!C\002\002\004A\022A\001T8oO\"1\021q\001\001\005\002M\013!\002Z5tG>tg.Z2u\021\035\tY\001\001C!\003\033\tqaZ3u'R\fG/\006\002\002\020A!\021\021CA\f\035\r)\0261C\005\004\003+\001\024A\002)sK\022,g-\003\003\002\032\005m!AB*ue&twMC\002\002\026A\002")
/*    */ public abstract class AoFeiLogThread implements AutoRunnable, StatBean {
/*    */   private final int TIME_SPACE;
/*    */   
/* 16 */   public AoFeiLogThread() { this.logs = Map$.MODULE$.empty();
/* 17 */     this.executor = Executors.newFixedThreadPool(5);
/* 18 */     init(); }
/*    */   private final Map<Enumeration.Value, AoFeiLog> logs;
/*    */   private final ExecutorService executor; public final int TIME_SPACE() { return 300000; } public Map<Enumeration.Value, AoFeiLog> logs() { return this.logs; } public ExecutorService executor() {
/*    */     return this.executor;
/*    */   } public void register(Enumeration.Value aoFeiLogType) {
/* 23 */     if (!logs().contains(aoFeiLogType)) logs().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(aoFeiLogType), new AoFeiLog(aoFeiLogType))); 
/*    */   }
/*    */   
/*    */   public void run() {
/*    */     while (true) {
/*    */       try {
/* 29 */         Thread.sleep(300000L);
/*    */       } catch (InterruptedException interruptedException) {}
/*    */ 
/*    */       
/* 33 */       executor().execute(new AoFeiLogThread$$anon$1(this));
/*    */     } 
/* 35 */   } public final class AoFeiLogThread$$anon$1 implements Runnable { public AoFeiLogThread$$anon$1(AoFeiLogThread $outer) {} public void run() { this.$outer.logs().values().foreach((Function1)new AoFeiLogThread$$anon$1$$anonfun$run$1(this)); } public final class AoFeiLogThread$$anon$1$$anonfun$run$1 extends AbstractFunction1<AoFeiLog, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(AoFeiLog x$1) { x$1.timeToWriteFile(); }
/*    */ 
/*    */       
/*    */       public AoFeiLogThread$$anon$1$$anonfun$run$1(AoFeiLogThread$$anon$1 $outer) {} } }
/*    */ 
/*    */   
/*    */   public void log(Enumeration.Value aoFeiLogType, List line) {
/* 42 */     executor().execute(new AoFeiLogThread$$anon$2(this, aoFeiLogType, line));
/*    */   } public final class AoFeiLogThread$$anon$2 implements Runnable { private final Enumeration.Value aoFeiLogType$1; private final List line$1; public AoFeiLogThread$$anon$2(AoFeiLogThread $outer, Enumeration.Value aoFeiLogType$1, List line$1) {} public void run() {
/* 44 */       String str = (new StringBuilder()).append("\"").append(StringUtils.join((Collection)JavaConverters$.MODULE$.seqAsJavaListConverter((Seq)this.line$1).asJava(), "\",\"")).append("\"").toString();
/* 45 */       ((AoFeiLog)this.$outer.logs().apply(this.aoFeiLogType$1)).write(str);
/*    */     } }
/*    */ 
/*    */ 
/*    */   
/*    */   public List<Object> getDateInfo() {
/* 51 */     Calendar cal = Calendar.getInstance();
/* 52 */     int year = cal.get(1);
/* 53 */     int month = cal.get(2) + 1;
/* 54 */     int day = cal.get(5);
/* 55 */     int hour = cal.get(11);
/* 56 */     int minute = cal.get(12);
/* 57 */     int week = cal.get(3);
/* 58 */     return List$.MODULE$.apply((Seq)Predef$.MODULE$.wrapIntArray(new int[] { year * 10000 + month * 100 + day, year * 100 + month, year, month, day, hour, minute, week }));
/*    */   }
/*    */   public long getTimestamp() {
/* 61 */     return System.currentTimeMillis() / 1000L;
/*    */   }
/*    */   
/* 64 */   public void disconnect() { logs().values().foreach((Function1)new AoFeiLogThread$$anonfun$disconnect$1(this)); } public final class AoFeiLogThread$$anonfun$disconnect$1 extends AbstractFunction1<AoFeiLog, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(AoFeiLog x$2) { x$2.timeToWriteFile(); }
/*    */     
/*    */     public AoFeiLogThread$$anonfun$disconnect$1(AoFeiLogThread $outer) {} }
/*    */   public String getStat() {
/* 68 */     ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executor();
/* 69 */     long completedTaskCount = threadPoolExecutor.getCompletedTaskCount();
/* 70 */     BlockingQueue<Runnable> queue = threadPoolExecutor.getQueue();
/* 71 */     StringBuilder builder = new StringBuilder();
/* 72 */     builder.append("active: ").append(threadPoolExecutor.getActiveCount());
/* 73 */     builder.append(", all completed: ").append(completedTaskCount);
/* 74 */     builder.append(", pool size: ").append(threadPoolExecutor.getPoolSize());
/* 75 */     builder.append(", queue size: ").append(queue.size());
/* 76 */     return builder.toString();
/*    */   }
/*    */   
/*    */   public abstract void init();
/*    */ }


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\aofei\AoFeiLogThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */