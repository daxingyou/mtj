/*     */ package com.nirvana.action;
/*     */ 
/*     */ import com.nirvana.bean.ServerDef;
/*     */ import com.nirvana.cache.MasterCache$;
/*     */ import com.nirvana.core.MapBean;
/*     */ import com.nirvana.core.MapBean$;
/*     */ import com.nirvana.exception.BusinessException;
/*     */ import com.nirvana.exception.BusinessException$;
/*     */ import com.nirvana.exception.ForbiddenException;
/*     */ import com.nirvana.holder.ServerHolder$;
/*     */ import com.nirvana.platform.UserPlatformType$;
/*     */ import com.nirvana.util.MessageI18n$;
/*     */ import com.nirvana.util.SignUtils$;
/*     */ import com.nirvana.web.AbstractController;
/*     */ import com.nirvana.web.ResponseUtil$;
/*     */ import javax.servlet.ServletRequest;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import org.apache.commons.lang.StringUtils;
/*     */ import org.springframework.stereotype.Controller;
/*     */ import org.springframework.web.bind.ServletRequestUtils;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import scala.Enumeration;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.List;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
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
/*     */ @Controller
/*     */ @RequestMapping({"/server"})
/*     */ @ScalaSignature(bytes = "\006\001\0354A!\001\002\001\023\t\0012+\032:wKJ\034uN\034;s_2dWM\035\006\003\007\021\ta!Y2uS>t'BA\003\007\003\035q\027N\035<b]\006T\021aB\001\004G>l7\001A\n\003\001)\001\"a\003\b\016\0031Q!!\004\003\002\007],'-\003\002\020\031\t\021\022IY:ue\006\034GoQ8oiJ|G\016\\3s\021\025\t\002\001\"\001\023\003\031a\024N\\5u}Q\t1\003\005\002\025\0015\t!\001C\003\027\001\021\005q#\001\005tK24\027J\0344p)\rAbD\013\t\0033qi\021A\007\006\0027\005)1oY1mC&\021QD\007\002\005+:LG\017C\003 +\001\007\001%A\004sKF,Xm\035;\021\005\005BS\"\001\022\013\005\r\"\023\001\0025uiBT!!\n\024\002\017M,'O\0367fi*\tq%A\003kCZ\f\0070\003\002*E\t\021\002\n\036;q'\026\024h\017\\3u%\026\fX/Z:u\021\025YS\0031\001-\003!\021Xm\0359p]N,\007CA\021.\023\tq#EA\nIiR\0048+\032:wY\026$(+Z:q_:\034X\r\013\003\026aur\004CA\031<\033\005\021$BA\0325\003)\tgN\\8uCRLwN\034\006\003kY\nAAY5oI*\021Qb\016\006\003qe\nqb\0359sS:<gM]1nK^|'o\033\006\002u\005\031qN]4\n\005q\022$A\004*fcV,7\017^'baBLgnZ\001\006m\006dW/\032\027\002\005\n\001)A\0050g\026dg-\0238g_\")!\t\001C\001\007\006Q1/\032:wKJd\025n\035;\025\007a!U\tC\003 \003\002\007\001\005C\003,\003\002\007A\006\013\003Bau:E&\001%\"\003%\013AbL:feZ,'o\0307jgRDQa\023\001\005\0021\013Ab]3sm\026\0248\013^1ukN$2\001G'O\021\025y\"\n1\001!\021\025Y#\n1\001-Q\021Q\005'\020)-\003E\013\023AU\001\017_M,'O^3s?N$\030\r^;t\021\025!\006\001\"\001V\003\031\021X\r\\8bIR\031\001DV,\t\013}\031\006\031\001\021\t\013-\032\006\031\001\027)\tM\003T(\027\027\0025\006\n1,A\0040e\026dw.\0313)\t\001\001T(\030\027\002=\006\nq,A\0040g\026\024h/\032:)\005\001\t\007C\0012f\033\005\031'B\00138\003)\031H/\032:f_RL\b/Z\005\003M\016\024!bQ8oiJ|G\016\\3s\001")
/*     */ public class ServerController
/*     */   extends AbstractController
/*     */ {
/*     */   @RequestMapping({"/selfInfo"})
/*     */   public void selfInfo(HttpServletRequest request, HttpServletResponse response) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokevirtual getRequestJson : (Ljavax/servlet/http/HttpServletRequest;)Lcom/nirvana/core/MapBean;
/*     */     //   5: astore_3
/*     */     //   6: aload_3
/*     */     //   7: ldc 'id'
/*     */     //   9: invokevirtual getLong : (Ljava/lang/String;)J
/*     */     //   12: lstore #4
/*     */     //   14: aload_3
/*     */     //   15: ldc 'server_id'
/*     */     //   17: invokevirtual getInt : (Ljava/lang/String;)I
/*     */     //   20: istore #6
/*     */     //   22: aload_3
/*     */     //   23: ldc 'sign'
/*     */     //   25: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   28: astore #7
/*     */     //   30: aload #7
/*     */     //   32: getstatic com/nirvana/util/SignUtils$.MODULE$ : Lcom/nirvana/util/SignUtils$;
/*     */     //   35: new scala/collection/mutable/StringBuilder
/*     */     //   38: dup
/*     */     //   39: invokespecial <init> : ()V
/*     */     //   42: lload #4
/*     */     //   44: invokestatic boxToLong : (J)Ljava/lang/Long;
/*     */     //   47: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   50: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   53: iload #6
/*     */     //   55: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   58: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   61: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   64: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   67: invokevirtual makeSign : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   70: astore #8
/*     */     //   72: dup
/*     */     //   73: ifnonnull -> 85
/*     */     //   76: pop
/*     */     //   77: aload #8
/*     */     //   79: ifnull -> 93
/*     */     //   82: goto -> 324
/*     */     //   85: aload #8
/*     */     //   87: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   90: ifeq -> 324
/*     */     //   93: getstatic com/nirvana/core/MapBean$.MODULE$ : Lcom/nirvana/core/MapBean$;
/*     */     //   96: invokevirtual empty : ()Lcom/nirvana/core/MapBean;
/*     */     //   99: astore #9
/*     */     //   101: getstatic com/nirvana/service/ServerService$.MODULE$ : Lcom/nirvana/service/ServerService$;
/*     */     //   104: iload #6
/*     */     //   106: invokevirtual getServer : (I)Lcom/nirvana/core/MapBean;
/*     */     //   109: astore #10
/*     */     //   111: aload #10
/*     */     //   113: ifnonnull -> 142
/*     */     //   116: aload #9
/*     */     //   118: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   121: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   124: ldc 'resultCode'
/*     */     //   126: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   129: iconst_0
/*     */     //   130: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   133: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   136: invokevirtual $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/HashMap;
/*     */     //   139: goto -> 187
/*     */     //   142: aload #9
/*     */     //   144: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   147: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   150: ldc 'resultCode'
/*     */     //   152: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   155: iconst_1
/*     */     //   156: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   159: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   162: invokevirtual $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/HashMap;
/*     */     //   165: pop
/*     */     //   166: aload #9
/*     */     //   168: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   171: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   174: ldc 'server'
/*     */     //   176: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   179: aload #10
/*     */     //   181: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   184: invokevirtual $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/HashMap;
/*     */     //   187: pop
/*     */     //   188: getstatic com/nirvana/service/ServerService$.MODULE$ : Lcom/nirvana/service/ServerService$;
/*     */     //   191: iconst_1
/*     */     //   192: invokevirtual getWarnLimit : (I)Lcom/nirvana/core/MapBean;
/*     */     //   195: astore #11
/*     */     //   197: aload #11
/*     */     //   199: ifnonnull -> 208
/*     */     //   202: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   205: goto -> 229
/*     */     //   208: aload #9
/*     */     //   210: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   213: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   216: ldc 'warn'
/*     */     //   218: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   221: aload #11
/*     */     //   223: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   226: invokevirtual $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/HashMap;
/*     */     //   229: pop
/*     */     //   230: aload #9
/*     */     //   232: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   235: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   238: ldc 'cross'
/*     */     //   240: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   243: getstatic com/nirvana/service/ServerService$.MODULE$ : Lcom/nirvana/service/ServerService$;
/*     */     //   246: invokevirtual getCrossServerList : ()Lscala/collection/immutable/List;
/*     */     //   249: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   252: invokevirtual $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/HashMap;
/*     */     //   255: pop
/*     */     //   256: aload #9
/*     */     //   258: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   261: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   264: ldc 'ipWhites'
/*     */     //   266: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   269: getstatic com/nirvana/service/ServerService$.MODULE$ : Lcom/nirvana/service/ServerService$;
/*     */     //   272: iload #6
/*     */     //   274: invokevirtual getIpWhites : (I)Lscala/collection/immutable/List;
/*     */     //   277: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   280: invokevirtual $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/HashMap;
/*     */     //   283: pop
/*     */     //   284: aload #9
/*     */     //   286: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   289: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   292: ldc 'combIds'
/*     */     //   294: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   297: getstatic com/nirvana/service/ServerService$.MODULE$ : Lcom/nirvana/service/ServerService$;
/*     */     //   300: iload #6
/*     */     //   302: invokevirtual getCombIds : (I)Lscala/collection/immutable/List;
/*     */     //   305: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   308: invokevirtual $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/HashMap;
/*     */     //   311: pop
/*     */     //   312: getstatic com/nirvana/web/ResponseUtil$.MODULE$ : Lcom/nirvana/web/ResponseUtil$;
/*     */     //   315: aload_2
/*     */     //   316: aload #9
/*     */     //   318: invokevirtual responseJson : (Ljavax/servlet/http/HttpServletResponse;Lcom/nirvana/core/MapBean;)V
/*     */     //   321: goto -> 408
/*     */     //   324: aload_0
/*     */     //   325: invokevirtual webLogger : ()Lorg/slf4j/Logger;
/*     */     //   328: ldc '校验失败:{},{},{}'
/*     */     //   330: iconst_3
/*     */     //   331: anewarray java/lang/Object
/*     */     //   334: dup
/*     */     //   335: iconst_0
/*     */     //   336: aload_1
/*     */     //   337: aastore
/*     */     //   338: dup
/*     */     //   339: iconst_1
/*     */     //   340: aload_1
/*     */     //   341: invokeinterface getParameterMap : ()Ljava/util/Map;
/*     */     //   346: aastore
/*     */     //   347: dup
/*     */     //   348: iconst_2
/*     */     //   349: aload_1
/*     */     //   350: invokeinterface getQueryString : ()Ljava/lang/String;
/*     */     //   355: aastore
/*     */     //   356: invokeinterface error : (Ljava/lang/String;[Ljava/lang/Object;)V
/*     */     //   361: getstatic com/nirvana/web/ResponseUtil$.MODULE$ : Lcom/nirvana/web/ResponseUtil$;
/*     */     //   364: aload_2
/*     */     //   365: getstatic com/nirvana/core/MapBean$.MODULE$ : Lcom/nirvana/core/MapBean$;
/*     */     //   368: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   371: iconst_1
/*     */     //   372: anewarray scala/Tuple2
/*     */     //   375: dup
/*     */     //   376: iconst_0
/*     */     //   377: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   380: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   383: ldc 'resultCode'
/*     */     //   385: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   388: iconst_0
/*     */     //   389: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   392: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   395: aastore
/*     */     //   396: checkcast [Ljava/lang/Object;
/*     */     //   399: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   402: invokevirtual apply : (Lscala/collection/Seq;)Lcom/nirvana/core/MapBean;
/*     */     //   405: invokevirtual responseJson : (Ljavax/servlet/http/HttpServletResponse;Lcom/nirvana/core/MapBean;)V
/*     */     //   408: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #24	-> 0
/*     */     //   #25	-> 6
/*     */     //   #26	-> 14
/*     */     //   #28	-> 22
/*     */     //   #29	-> 30
/*     */     //   #33	-> 93
/*     */     //   #34	-> 101
/*     */     //   #35	-> 111
/*     */     //   #39	-> 116
/*     */     //   #36	-> 142
/*     */     //   #37	-> 166
/*     */     //   #35	-> 187
/*     */     //   #41	-> 188
/*     */     //   #42	-> 197
/*     */     //   #43	-> 208
/*     */     //   #42	-> 229
/*     */     //   #45	-> 230
/*     */     //   #46	-> 256
/*     */     //   #47	-> 284
/*     */     //   #48	-> 312
/*     */     //   #30	-> 324
/*     */     //   #31	-> 361
/*     */     //   #23	-> 408
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	409	0	this	Lcom/nirvana/action/ServerController;
/*     */     //   0	409	1	request	Ljavax/servlet/http/HttpServletRequest;
/*     */     //   0	409	2	response	Ljavax/servlet/http/HttpServletResponse;
/*     */     //   6	403	3	params	Lcom/nirvana/core/MapBean;
/*     */     //   14	395	4	id	J
/*     */     //   22	387	6	serverId	I
/*     */     //   30	379	7	sign	Ljava/lang/String;
/*     */     //   101	220	9	ret	Lcom/nirvana/core/MapBean;
/*     */     //   111	210	10	serverInfo	Lcom/nirvana/core/MapBean;
/*     */     //   197	124	11	warn	Lcom/nirvana/core/MapBean;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/server_list"})
/*     */   public void serverList(HttpServletRequest request, HttpServletResponse response) {
/*  55 */     String token = ServletRequestUtils.getStringParameter((ServletRequest)request, "token");
/*  56 */     String ver = ServletRequestUtils.getStringParameter((ServletRequest)request, "ver", "");
/*  57 */     String ip = getRemoteIp(request);
/*     */     
/*  59 */     if (StringUtils.isBlank(token)) throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_2"), BusinessException$.MODULE$.$lessinit$greater$default$2()); 
/*  60 */     String sign = ServletRequestUtils.getStringParameter((ServletRequest)request, "sign");
/*  61 */     String str1 = SignUtils$.MODULE$.makeClientSign(token); if (sign == null) { if (str1 != null)
/*  62 */       { webLogger().error("校验失败:{},{},{}", new Object[] { request, request.getParameterMap(), request.getQueryString() });
/*  63 */         throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_1"), BusinessException$.MODULE$.$lessinit$greater$default$2()); }  } else if (!sign.equals(str1)) { webLogger().error("校验失败:{},{},{}", new Object[] { request, request.getParameterMap(), request.getQueryString() }); throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_1"), BusinessException$.MODULE$.$lessinit$greater$default$2()); }
/*     */     
/*  65 */     MapBean user = MasterCache$.MODULE$.getCenterUserByToken(token);
/*  66 */     if (user == null) throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_2"), BusinessException$.MODULE$.$lessinit$greater$default$2()); 
/*  67 */     int pf = user.getInt("pf");
/*  68 */     Enumeration.Value platformType = UserPlatformType$.MODULE$.apply(pf);
/*  69 */     int channelId = user.getInt("channel_id");
/*  70 */     List list = ServerHolder$.MODULE$.getServerList(platformType, channelId, ver, ip);
/*  71 */     (new scala.Tuple2[1])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("l"), list); ResponseUtil$.MODULE$.responseJson(response, MapBean$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[1])));
/*     */   }
/*     */ 
/*     */   
/*     */   @RequestMapping({"/server_status"})
/*     */   public void serverStatus(HttpServletRequest request, HttpServletResponse response) {
/*  77 */     String token = ServletRequestUtils.getStringParameter((ServletRequest)request, "token");
/*  78 */     int serverId = ServletRequestUtils.getIntParameter((ServletRequest)request, "serverId", 0);
/*  79 */     String ip = getRemoteIp(request);
/*     */     
/*  81 */     if (StringUtils.isBlank(token)) throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_2"), BusinessException$.MODULE$.$lessinit$greater$default$2()); 
/*  82 */     String sign = ServletRequestUtils.getStringParameter((ServletRequest)request, "sign");
/*  83 */     String str1 = SignUtils$.MODULE$.makeClientSign(token); if (sign == null) { if (str1 != null)
/*  84 */       { webLogger().error("校验失败:{},{},{}", new Object[] { request, request.getParameterMap(), request.getQueryString() });
/*  85 */         throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_1"), BusinessException$.MODULE$.$lessinit$greater$default$2()); }  } else if (!sign.equals(str1)) { webLogger().error("校验失败:{},{},{}", new Object[] { request, request.getParameterMap(), request.getQueryString() }); throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_1"), BusinessException$.MODULE$.$lessinit$greater$default$2()); }
/*     */     
/*  87 */     MapBean user = MasterCache$.MODULE$.getCenterUserByToken(token);
/*  88 */     if (user == null) throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_2"), BusinessException$.MODULE$.$lessinit$greater$default$2()); 
/*  89 */     ServerDef server = ServerHolder$.MODULE$.getServer(serverId);
/*  90 */     if (server == null) throw new ForbiddenException(); 
/*  91 */     (new scala.Tuple2[1])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("serverId"), BoxesRunTime.boxToInteger(serverId)); MapBean ret = MapBean$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[1]));
/*  92 */     int flag = (server.status() >= 3 || ServerHolder$.MODULE$.ipCheck(serverId, ip)) ? 1 : 0;
/*  93 */     ret.$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("flag"), BoxesRunTime.boxToInteger(flag)));
/*  94 */     (flag == 0) ? ret.$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("close_prompt"), server.close_prompt())) : BoxedUnit.UNIT;
/*  95 */     ResponseUtil$.MODULE$.responseJson(response, ret);
/*     */   }
/*     */ 
/*     */   
/*     */   @RequestMapping({"/reload"})
/*     */   public void reload(HttpServletRequest request, HttpServletResponse response) {
/* 101 */     MapBean params = getRequestJson(request);
/* 102 */     long id = params.getLong("id");
/*     */     
/* 104 */     String sign = params.getString("sign");
/* 105 */     String str1 = SignUtils$.MODULE$.makeSign(id); if (sign == null) { if (str1 != null) {
/* 106 */         webLogger().error("校验失败:{},{},{}", new Object[] { request, request.getParameterMap(), request.getQueryString() });
/* 107 */         (new scala.Tuple2[1])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("resultCode"), BoxesRunTime.boxToInteger(0)); ResponseUtil$.MODULE$.responseJson(response, MapBean$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[1])));
/*     */       }  }
/* 109 */     else { if (sign.equals(str1)) { ServerHolder$.MODULE$.reload(); return; }  webLogger().error("校验失败:{},{},{}", new Object[] { request, request.getParameterMap(), request.getQueryString() }); (new scala.Tuple2[1])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("resultCode"), BoxesRunTime.boxToInteger(0)); ResponseUtil$.MODULE$.responseJson(response, MapBean$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[1]))); }  ServerHolder$.MODULE$.reload();
/*     */   }
/*     */ }


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\action\ServerController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */