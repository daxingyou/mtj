/*     */ package com.nirvana.web;
/*     */ import com.nirvana.core.MapBean;
/*     */ import com.nirvana.core.MapBean$;
/*     */ import com.nirvana.service.ServerService$;
/*     */ import java.io.IOException;
/*     */ import java.util.Calendar;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.Future;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Serializable;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.List;
/*     */ import scala.collection.immutable.List$;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.ObjectRef;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005\025e!B\001\003\003\003I!AE!cgR\024\030m\031;D_:$(o\0347mKJT!a\001\003\002\007],'M\003\002\006\r\0059a.\033:wC:\f'\"A\004\002\007\r|Wn\001\001\024\005\001Q\001CA\006\030\033\005a!BA\007\017\003-iW\017\034;jC\016$\030n\0348\013\005=\001\022aA7wG*\021\021CE\001\bg\026\024h\017\\3u\025\t\0311C\003\002\025+\005y1\017\035:j]\0364'/Y7fo>\0248NC\001\027\003\ry'oZ\005\00311\021Q#T;mi&\f5\r^5p]\016{g\016\036:pY2,'\017C\003\033\001\021\0051$\001\004=S:LGO\020\013\0029A\021Q\004A\007\002\005!)q\004\001C\001A\005\0012i\024(T)\006sEkU0S\013N+F\nV\013\002CA\021!eJ\007\002G)\021A%J\001\005Y\006twMC\001'\003\021Q\027M^1\n\005!\032#AB*ue&tw\rC\004+\001\t\007I\021C\026\002\023],'\rT8hO\026\024X#\001\027\021\0055\002T\"\001\030\013\005=*\022!B:mMRR\027BA\031/\005\031aunZ4fe\"11\007\001Q\001\n1\n!b^3c\031><w-\032:!\021\035)\004A1A\005\026Y\n\021\002U!H\013~\023vjV*\026\003]z\021\001O\017\0023!1!\b\001Q\001\016]\n!\002U!H\013~\023vjV*!\021\025a\004\001\"\005>\003!Q7\017],sSR,Gc\001 E\037B\021qHQ\007\002\001*\t\021)A\003tG\006d\027-\003\002D\001\n!QK\\5u\021\025)5\b1\001G\003!\021Xm\0359p]N,\007CA$N\033\005A%BA%K\003\021AG\017\0369\013\005EY%\"\001'\002\013)\fg/\031=\n\0059C%a\005%uiB\034VM\035<mKR\024Vm\0359p]N,\007\"\002)<\001\004\t\026aB2p]R,g\016\036\t\003%Vs!aP*\n\005Q\003\025A\002)sK\022,g-\003\002)-*\021A\013\021\005\006y\001!\t\002\027\013\004}eS\006\"B#X\001\0041\005\"\002)X\001\004Y\006CA ]\023\ti\006IA\002J]RDQa\030\001\005\022\001\f!bZ3u'FdG)\031;f)\r\tw\r\034\t\003E\026l\021a\031\006\003I\026\n1a]9m\023\t17M\001\003ECR,\007\"\0025_\001\004I\027a\002:fcV,7\017\036\t\003\017*L!a\033%\003%!#H\017]*feZdW\r\036*fcV,7\017\036\005\006[z\003\r!U\001\005]\006lW\rC\003p\001\021E\001/A\006hKR,F/\0337ECR,GcA9woB\021!/^\007\002g*\021A/J\001\005kRLG.\003\002gg\")\001N\034a\001S\")QN\034a\001#\")\021\020\001C\tu\006\021r-\032;QC\036,Gk\034;bY:+XNY3s)\tY6\020C\003}q\002\0071,A\006u_R\fGNT;nE\026\024\b\"\002@\001\t\003y\030A\003;p\025\0064\030\rT5tiR!\021\021AA\n!\025\021\0301AA\004\023\r\t)a\035\002\005\031&\034H\017\005\004s\003\023\t\026QB\005\004\003\027\031(aA'baB\031q(a\004\n\007\005E\001IA\002B]fDq!!\006~\001\004\t9\"\001\003mSN$\bCBA\r\003S\tiC\004\003\002\034\005\025b\002BA\017\003Gi!!a\b\013\007\005\005\002\"\001\004=e>|GOP\005\002\003&\031\021q\005!\002\017A\f7m[1hK&!\021QAA\026\025\r\t9\003\021\t\005\003_\t)$\004\002\0022)\031\0211\007\003\002\t\r|'/Z\005\005\003o\t\tDA\004NCB\024U-\0318\t\017\005m\002\001\"\001\002>\005Qq-\032;TKJ4XM]:\025\005\005\005\001bBA!\001\021\005\0211I\001\017O\026$(+Z9vKN$(j]8o)\021\ti#!\022\t\r!\fy\0041\001j\021%\tI\005\001b\001\n\023\tY%A\005jaB\013G\017^3s]V\021\021Q\n\t\005\003\037\n)&\004\002\002R)\031\0211K:\002\013I,w-\032=\n\t\005]\023\021\013\002\b!\006$H/\032:o\021!\tY\006\001Q\001\n\0055\023AC5q!\006$H/\032:oA!9\021q\f\001\005\002\005\005\024aC4fiJ+Wn\034;f\023B$2!UA2\021\031A\027Q\fa\001S\"9\021q\r\001\005\002\005%\024!E:fi\036\013W.Z*feZ,'\017R1uCRA\021qCA6\003c\n)\b\003\005\002n\005\025\004\031AA8\003%\031XM\035<fe&#7\017E\003\002\032\005%2\fC\004\002t\005\025\004\031A)\002\017M,'O^5dK\"9\001.!\032A\002\0055\002bBA=\001\021\005\0211P\001\024cV,'/_$b[\026\034VM\035<fe\022\013G/\031\013\t\003\033\ti(!!\002\004\"9\021qPA<\001\004Y\026\001C:feZ,'/\0233\t\017\005M\024q\017a\001#\"9\001.a\036A\002\0055\002")
/*     */ public abstract class AbstractController extends MultiActionController {
/*     */   public String CONSTANTS_RESULT() {
/*  23 */     return "result";
/*     */   }
/*  25 */   private final Logger webLogger = LoggerFactory.getLogger(getClass()); private final int PAGE_ROWS; public Logger webLogger() { return this.webLogger; } public final int PAGE_ROWS() {
/*  26 */     return 25;
/*     */   }
/*     */   public void jspWrite(HttpServletResponse response, String content) {
/*     */     try {
/*  30 */       response.getWriter().println(content);
/*     */     } catch (IOException iOException) {
/*     */       webLogger().error("", iOException);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void jspWrite(HttpServletResponse response, int content) {
/*     */     try {
/*  38 */       response.getWriter().println(content);
/*     */     } catch (IOException iOException) {
/*     */       webLogger().error("", iOException);
/*     */     } 
/*     */   }
/*     */   
/*     */   public Date getSqlDate(HttpServletRequest request, String name) {
/*  45 */     String dateStr = ServletRequestUtils.getStringParameter((ServletRequest)request, name, ""); try {  }
/*  46 */     catch (ParseException parseException)
/*     */     
/*     */     { 
/*     */       
/*  50 */       Calendar cal = Calendar.getInstance();
/*  51 */       cal.set(11, 0);
/*  52 */       cal.set(12, 0);
/*  53 */       cal.set(13, 0);
/*  54 */       cal.set(14, 0); }
/*  55 */      return new Date(cal.getTimeInMillis());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getUtilDate(HttpServletRequest request, String name) {
/*  61 */     String dateStr = ServletRequestUtils.getStringParameter((ServletRequest)request, name, ""); try {  }
/*  62 */     catch (ParseException parseException) {} return new Date();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPageTotalNumber(int totalNumber) {
/*  70 */     int fullPage = totalNumber / 25;
/*  71 */     return (totalNumber % 25 > 0) ? (fullPage + 1) : ((fullPage == 0) ? 1 : fullPage);
/*     */   }
/*     */   
/*  74 */   public List<Map<String, Object>> toJavaList(List list) { return (List<Map<String, Object>>)JavaConverters$.MODULE$.seqAsJavaListConverter((Seq)list.map((Function1)new AbstractController$$anonfun$toJavaList$1(this), List$.MODULE$.canBuildFrom())).asJava(); } public final class AbstractController$$anonfun$toJavaList$1 extends AbstractFunction1<MapBean, Map<String, Object>> implements Serializable { public static final long serialVersionUID = 0L; public final Map<String, Object> apply(MapBean x$1) { return x$1.toJavaMap(); }
/*     */ 
/*     */     
/*     */     public AbstractController$$anonfun$toJavaList$1(AbstractController $outer) {} }
/*     */   
/*     */   public List<Map<String, Object>> getServers() {
/*  80 */     return toJavaList(ServerService$.MODULE$.getAllServerIdAndName());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MapBean getRequestJson(HttpServletRequest request) {
/*     */     // Byte code:
/*     */     //   0: new scala/collection/mutable/StringBuilder
/*     */     //   3: dup
/*     */     //   4: invokespecial <init> : ()V
/*     */     //   7: astore_2
/*     */     //   8: aconst_null
/*     */     //   9: astore_3
/*     */     //   10: new java/io/BufferedReader
/*     */     //   13: dup
/*     */     //   14: new java/io/InputStreamReader
/*     */     //   17: dup
/*     */     //   18: aload_1
/*     */     //   19: invokeinterface getInputStream : ()Ljavax/servlet/ServletInputStream;
/*     */     //   24: ldc 'utf-8'
/*     */     //   26: invokespecial <init> : (Ljava/io/InputStream;Ljava/lang/String;)V
/*     */     //   29: invokespecial <init> : (Ljava/io/Reader;)V
/*     */     //   32: astore_3
/*     */     //   33: aload_3
/*     */     //   34: invokevirtual readLine : ()Ljava/lang/String;
/*     */     //   37: astore #6
/*     */     //   39: aload #6
/*     */     //   41: ifnonnull -> 57
/*     */     //   44: getstatic com/nirvana/core/MapBean$.MODULE$ : Lcom/nirvana/core/MapBean$;
/*     */     //   47: aload_2
/*     */     //   48: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   51: invokevirtual toMutableMap : (Ljava/lang/Object;)Lcom/nirvana/core/MapBean;
/*     */     //   54: goto -> 128
/*     */     //   57: aload_2
/*     */     //   58: aload #6
/*     */     //   60: invokevirtual append : (Ljava/lang/String;)Lscala/collection/mutable/StringBuilder;
/*     */     //   63: pop
/*     */     //   64: aload_2
/*     */     //   65: ldc '\\r\\n'
/*     */     //   67: invokevirtual append : (Ljava/lang/String;)Lscala/collection/mutable/StringBuilder;
/*     */     //   70: pop
/*     */     //   71: aload_3
/*     */     //   72: invokevirtual readLine : ()Ljava/lang/String;
/*     */     //   75: astore #6
/*     */     //   77: goto -> 39
/*     */     //   80: astore #4
/*     */     //   82: aload_0
/*     */     //   83: invokevirtual webLogger : ()Lorg/slf4j/Logger;
/*     */     //   86: new scala/collection/mutable/StringBuilder
/*     */     //   89: dup
/*     */     //   90: invokespecial <init> : ()V
/*     */     //   93: ldc 'read request err:'
/*     */     //   95: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   98: aload_1
/*     */     //   99: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   102: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   105: invokeinterface error : (Ljava/lang/String;)V
/*     */     //   110: getstatic com/nirvana/core/MapBean$.MODULE$ : Lcom/nirvana/core/MapBean$;
/*     */     //   113: invokevirtual empty : ()Lcom/nirvana/core/MapBean;
/*     */     //   116: goto -> 128
/*     */     //   119: astore #5
/*     */     //   121: aload_3
/*     */     //   122: invokevirtual close : ()V
/*     */     //   125: aload #5
/*     */     //   127: athrow
/*     */     //   128: aload_3
/*     */     //   129: invokevirtual close : ()V
/*     */     //   132: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #83	-> 0
/*     */     //   #84	-> 8
/*     */     //   #86	-> 10
/*     */     //   #87	-> 33
/*     */     //   #88	-> 39
/*     */     //   #93	-> 44
/*     */     //   #89	-> 57
/*     */     //   #90	-> 64
/*     */     //   #91	-> 71
/*     */     //   #95	-> 80
/*     */     //   #85	-> 80
/*     */     //   #96	-> 110
/*     */     //   #98	-> 119
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	133	0	this	Lcom/nirvana/web/AbstractController;
/*     */     //   0	133	1	request	Ljavax/servlet/http/HttpServletRequest;
/*     */     //   8	124	2	stringBuffer	Lscala/collection/mutable/StringBuilder;
/*     */     //   10	122	3	in	Ljava/io/BufferedReader;
/*     */     //   39	15	6	ln	Ljava/lang/String;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   10	80	80	java/lang/Exception
/*     */     //   10	119	119	finally
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 102 */   private final Pattern ipPattern = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"); private Pattern ipPattern() { return this.ipPattern; }
/*     */   public final class AbstractController$$anonfun$setGameServerData$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final MapBean params$1; private final ObjectRef fs$1; public final void apply(int serverId) { apply$mcVI$sp(serverId); } public AbstractController$$anonfun$setGameServerData$1(AbstractController $outer, MapBean params$1, ObjectRef fs$1) {} public void apply$mcVI$sp(int serverId) { MapBean server = ServerService$.MODULE$.getServer(serverId); if (server != null) { String ip = server.getString("ip"); int port = server.getInt("port") + 1; String url = (new StringBuilder()).append("http://").append(ip).append(":").append(BoxesRunTime.boxToInteger(port)).append("/invoke/game/data").toString(); this.fs$1.elem = ((List)this.fs$1.elem).$colon$colon(AdminExecutor$.MODULE$.submit((Function0)new AbstractController$$anonfun$setGameServerData$1$$anonfun$apply$mcVI$sp$1(this, url, serverId))); }  } public final class AbstractController$$anonfun$setGameServerData$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction0<MapBean> implements Serializable {
/* 105 */       public static final long serialVersionUID = 0L; private final String url$1; private final int serverId$1; public AbstractController$$anonfun$setGameServerData$1$$anonfun$apply$mcVI$sp$1(AbstractController$$anonfun$setGameServerData$1 $outer, String url$1, int serverId$1) {} public final MapBean apply() { try { MapBean ret = HttpService$.MODULE$.doPostJson(this.url$1, this.$outer.params$1); MapBean data = MapBean$.MODULE$.empty(); data.$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("run_server_id"), BoxesRunTime.boxToInteger(this.serverId$1))); data.$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("err"), BoxesRunTime.boxToInteger(1))); data.$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(this.$outer.com$nirvana$web$AbstractController$$anonfun$$$outer().CONSTANTS_RESULT()), ret.getString("err"))); MapBean mapBean1 = ret.getMap("data"); mapBean1.$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("run_server_id"), BoxesRunTime.boxToInteger(this.serverId$1))); mapBean1.$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("err"), BoxesRunTime.boxToInteger(0))); } catch (Exception exception) { (new scala.Tuple2[3])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("run_server_id"), BoxesRunTime.boxToInteger(this.serverId$1)); (new scala.Tuple2[3])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(this.$outer.com$nirvana$web$AbstractController$$anonfun$$$outer().CONSTANTS_RESULT()), "失败"); (new scala.Tuple2[3])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("err"), BoxesRunTime.boxToInteger(1)); }  return MapBean$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[3])); } } } public String getRemoteIp(HttpServletRequest request) { String remoteIp = request.getHeader("X-Forwarded-For");
/*     */ 
/*     */     
/* 108 */     Matcher mather = ipPattern().matcher(remoteIp);
/* 109 */     return StringUtils.isBlank(remoteIp) ? request.getRemoteAddr() : (mather.find() ? mather.group() : remoteIp); }
/*     */ 
/*     */ 
/*     */   
/*     */   public List<MapBean> setGameServerData(List serverIds, String service, MapBean request) {
/* 114 */     if (serverIds.isEmpty()) return List$.MODULE$.empty(); 
/* 115 */     long id = System.currentTimeMillis();
/* 116 */     (new scala.Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("id"), BoxesRunTime.boxToLong(id)); (new scala.Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("sign"), SignUtils$.MODULE$.makeSign(id)); (new scala.Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("service"), service); (new scala.Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("data"), request); MapBean params = MapBean$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[4]));
/*     */     
/* 118 */     ObjectRef fs = ObjectRef.create(List$.MODULE$.empty());
/* 119 */     serverIds.foreach((Function1)new AbstractController$$anonfun$setGameServerData$1(this, params, fs));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 146 */     return (List<MapBean>)((List)fs.elem).map((Function1)new AbstractController$$anonfun$setGameServerData$2(this), List$.MODULE$.canBuildFrom()); } public final class AbstractController$$anonfun$setGameServerData$2 extends AbstractFunction1<Future<MapBean>, MapBean> implements Serializable { public static final long serialVersionUID = 0L; public final MapBean apply(Future<MapBean> x$2) { return x$2.get(); }
/*     */     
/*     */     public AbstractController$$anonfun$setGameServerData$2(AbstractController $outer) {} }
/*     */   public Object queryGameServerData(int serverId, String service, MapBean request) {
/* 150 */     MapBean server = ServerService$.MODULE$.getServer(serverId);
/* 151 */     if (server == null) return MapBean$.MODULE$.empty(); 
/* 152 */     long id = System.currentTimeMillis();
/* 153 */     (new scala.Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("id"), BoxesRunTime.boxToLong(id)); (new scala.Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("sign"), SignUtils$.MODULE$.makeSign(id)); (new scala.Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("service"), service); (new scala.Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("data"), request); MapBean params = MapBean$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[4]));
/*     */     
/* 155 */     String ip = server.getString("ip");
/* 156 */     int port = server.getInt("port") + 1;
/* 157 */     String url = (new StringBuilder()).append("http://").append(ip).append(":").append(BoxesRunTime.boxToInteger(port)).append("/invoke/game/data").toString(); try {  }
/* 158 */     catch (Exception exception) {} return "";
/*     */   }
/*     */ }


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\web\AbstractController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */