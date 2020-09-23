/*     */ package com.nirvana.action;
/*     */ import com.nirvana.core.MapBean;
/*     */ import com.nirvana.exception.BusinessException;
/*     */ import com.nirvana.exception.BusinessException$;
/*     */ import com.nirvana.platform.AoFeiApi$;
/*     */ import com.nirvana.service.PayService$;
/*     */ import com.nirvana.util.MessageI18n$;
/*     */ import com.nirvana.util.SignUtils$;
/*     */ import com.nirvana.web.ResponseUtil$;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import scala.Predef$;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @Controller
/*     */ @RequestMapping({"/pay"})
/*     */ @ScalaSignature(bytes = "\006\001A4A!\001\002\001\023\ti\001+Y=D_:$(o\0347mKJT!a\001\003\002\r\005\034G/[8o\025\t)a!A\004oSJ4\030M\\1\013\003\035\t1aY8n\007\001\031\"\001\001\006\021\005-qQ\"\001\007\013\0055!\021aA<fE&\021q\002\004\002\023\003\n\034HO]1di\016{g\016\036:pY2,'\017C\003\022\001\021\005!#\001\004=S:LGO\020\013\002'A\021A\003A\007\002\005!)a\003\001C\001/\005\021\022m\0344fS\006\0338NR8s\037J$WM]%e)\rAbD\013\t\0033qi\021A\007\006\0027\005)1oY1mC&\021QD\007\002\005+:LG\017C\003 +\001\007\001%A\004sKF,Xm\035;\021\005\005BS\"\001\022\013\005\r\"\023\001\0025uiBT!!\n\024\002\017M,'O\0367fi*\tq%A\003kCZ\f\0070\003\002*E\t\021\002\n\036;q'\026\024h\017\\3u%\026\fX/Z:u\021\025YS\0031\001-\003!\021Xm\0359p]N,\007CA\021.\023\tq#EA\nIiR\0048+\032:wY\026$(+Z:q_:\034X\r\013\003\026aur\004CA\031<\033\005\021$BA\0325\003)\tgN\\8uCRLwN\034\006\003kY\nAAY5oI*\021Qb\016\006\003qe\nqb\0359sS:<gM]1nK^|'o\033\006\002u\005\031qN]4\n\005q\022$A\004*fcV,7\017^'baBLgnZ\001\006m\006dW/\032\027\002\005\n\001)A\n0C>4W-[!tW\032{'o\024:eKJLE\rC\003C\001\021\0051)A\003b_\032,\027\016F\002\031\t\026CQaH!A\002\001BQaK!A\0021BC!\021\031>\0172\n\001*I\001J\003\031y\023m\0344fS\")1\n\001C\001\031\006)\022m\0344fS&{5+Q:l\r>\024xJ\0353fe&#Gc\001\rN\035\")qD\023a\001A!)1F\023a\001Y!\"!\nM\037QY\005\t\026%\001*\002-=\nwNZ3j\023>\033\026i]6G_J|%\017Z3s\023\022DQ\001\026\001\005\002U\013\001\"Y8gK&Luj\025\013\0041Y;\006\"B\020T\001\004\001\003\"B\026T\001\004a\003\006B*1{ec\023AW\021\0027\006Qq&Y8gK&l\023n\\:\t\013u\003A\021\0010\002\0079|\007\020F\002\031?\002DQa\b/A\002\001BQa\013/A\0021BC\001\030\031>E2\n1-I\001e\003\021ycn\034=)\t\001\001TH\032\027\002O\006\n\001.\001\0030a\006L\bF\001\001k!\tYg.D\001m\025\tiw'\001\006ti\026\024Xm\034;za\026L!a\0347\003\025\r{g\016\036:pY2,'\017")
/*     */ public class PayController extends AbstractController {
/*     */   @RequestMapping({"/aofeiAskForOrderId"})
/*     */   public void aofeiAskForOrderId(HttpServletRequest request, HttpServletResponse response) {
/*  23 */     MapBean params = getRequestJson(request);
/*  24 */     webLogger().warn("{}", new Object[] { params });
/*  25 */     String sign = params.getString("sign");
/*  26 */     String str1 = SignUtils$.MODULE$.makeSign(params.getLong("id")); if (sign == null) { if (str1 != null)
/*  27 */       { webLogger().error("校验失败:{},{},{}", new Object[] { request, params, request.getParameterMap(), request.getQueryString() });
/*  28 */         throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_1"), BusinessException$.MODULE$.$lessinit$greater$default$2()); }  } else if (!sign.equals(str1)) { webLogger().error("校验失败:{},{},{}", new Object[] { request, params, request.getParameterMap(), request.getQueryString() }); throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_1"), BusinessException$.MODULE$.$lessinit$greater$default$2()); }
/*     */     
/*  30 */     params.$minus$eq("sign");
/*  31 */     params.$minus$eq("id");
/*  32 */     MapBean ret = AoFeiApi$.MODULE$.getOrderId(params);
/*  33 */     webLogger().warn((new StringBuilder()).append("pay:").append(ret.toJsonString()).toString());
/*     */     
/*  35 */     ResponseUtil$.MODULE$.responseJson(response, ret);
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
/*     */   @RequestMapping({"/aofei"})
/*     */   public void aofei(HttpServletRequest request, HttpServletResponse response) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual webLogger : ()Lorg/slf4j/Logger;
/*     */     //   4: ldc '{},{},{}'
/*     */     //   6: iconst_3
/*     */     //   7: anewarray java/lang/Object
/*     */     //   10: dup
/*     */     //   11: iconst_0
/*     */     //   12: aload_1
/*     */     //   13: aastore
/*     */     //   14: dup
/*     */     //   15: iconst_1
/*     */     //   16: aload_1
/*     */     //   17: invokeinterface getParameterMap : ()Ljava/util/Map;
/*     */     //   22: aastore
/*     */     //   23: dup
/*     */     //   24: iconst_2
/*     */     //   25: aload_1
/*     */     //   26: invokeinterface getQueryString : ()Ljava/lang/String;
/*     */     //   31: aastore
/*     */     //   32: invokeinterface warn : (Ljava/lang/String;[Ljava/lang/Object;)V
/*     */     //   37: aload_1
/*     */     //   38: ldc 'signature'
/*     */     //   40: ldc ''
/*     */     //   42: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   45: astore_3
/*     */     //   46: aload_1
/*     */     //   47: ldc 'signType'
/*     */     //   49: ldc ''
/*     */     //   51: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   54: astore #4
/*     */     //   56: aload_1
/*     */     //   57: ldc 'orderID'
/*     */     //   59: ldc ''
/*     */     //   61: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   64: astore #5
/*     */     //   66: aload_1
/*     */     //   67: ldc 'cpOrderID'
/*     */     //   69: ldc ''
/*     */     //   71: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   74: astore #6
/*     */     //   76: aload_1
/*     */     //   77: ldc 'username'
/*     */     //   79: ldc ''
/*     */     //   81: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   84: astore #7
/*     */     //   86: aload_1
/*     */     //   87: ldc 'money'
/*     */     //   89: iconst_0
/*     */     //   90: invokestatic getIntParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;I)I
/*     */     //   93: istore #8
/*     */     //   95: aload_1
/*     */     //   96: ldc 'serverID'
/*     */     //   98: iconst_0
/*     */     //   99: invokestatic getIntParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;I)I
/*     */     //   102: istore #9
/*     */     //   104: aload_1
/*     */     //   105: ldc 'roleID'
/*     */     //   107: ldc ''
/*     */     //   109: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   112: astore #10
/*     */     //   114: aload_1
/*     */     //   115: ldc 'productID'
/*     */     //   117: ldc ''
/*     */     //   119: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   122: astore #11
/*     */     //   124: getstatic com/nirvana/util/Tool$.MODULE$ : Lcom/nirvana/util/Tool$;
/*     */     //   127: new scala/collection/mutable/StringBuilder
/*     */     //   130: dup
/*     */     //   131: invokespecial <init> : ()V
/*     */     //   134: aload #5
/*     */     //   136: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   139: aload #6
/*     */     //   141: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   144: aload #7
/*     */     //   146: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   149: iload #8
/*     */     //   151: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   154: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   157: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   160: iload #9
/*     */     //   162: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   165: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   168: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   171: aload #10
/*     */     //   173: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   176: aload #11
/*     */     //   178: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   181: getstatic com/nirvana/platform/AoFeiApi$.MODULE$ : Lcom/nirvana/platform/AoFeiApi$;
/*     */     //   184: invokevirtual appSecret : ()Ljava/lang/String;
/*     */     //   187: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   190: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   193: invokevirtual md5Hex : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   196: astore #12
/*     */     //   198: aload_3
/*     */     //   199: aload #12
/*     */     //   201: astore #13
/*     */     //   203: dup
/*     */     //   204: ifnonnull -> 216
/*     */     //   207: pop
/*     */     //   208: aload #13
/*     */     //   210: ifnull -> 224
/*     */     //   213: goto -> 906
/*     */     //   216: aload #13
/*     */     //   218: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   221: ifeq -> 906
/*     */     //   224: aload_0
/*     */     //   225: aload_1
/*     */     //   226: invokevirtual getRemoteIp : (Ljavax/servlet/http/HttpServletRequest;)Ljava/lang/String;
/*     */     //   229: astore #14
/*     */     //   231: getstatic com/nirvana/platform/AoFeiApi$.MODULE$ : Lcom/nirvana/platform/AoFeiApi$;
/*     */     //   234: aload #14
/*     */     //   236: invokevirtual checkIp : (Ljava/lang/String;)Z
/*     */     //   239: ifeq -> 815
/*     */     //   242: getstatic com/nirvana/service/PayService$.MODULE$ : Lcom/nirvana/service/PayService$;
/*     */     //   245: aload #6
/*     */     //   247: invokevirtual getPayOrder : (Ljava/lang/String;)Lcom/nirvana/core/MapBean;
/*     */     //   250: astore #15
/*     */     //   252: aload #15
/*     */     //   254: ifnonnull -> 346
/*     */     //   257: getstatic com/nirvana/web/ResponseUtil$.MODULE$ : Lcom/nirvana/web/ResponseUtil$;
/*     */     //   260: aload_2
/*     */     //   261: getstatic com/nirvana/core/MapBean$.MODULE$ : Lcom/nirvana/core/MapBean$;
/*     */     //   264: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   267: iconst_3
/*     */     //   268: anewarray scala/Tuple2
/*     */     //   271: dup
/*     */     //   272: iconst_0
/*     */     //   273: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   276: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   279: ldc 'result'
/*     */     //   281: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   284: iconst_0
/*     */     //   285: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   288: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   291: aastore
/*     */     //   292: dup
/*     */     //   293: iconst_1
/*     */     //   294: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   297: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   300: ldc 'msg'
/*     */     //   302: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   305: ldc '参数错误，无此订单记录[cpOrderID]'
/*     */     //   307: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   310: aastore
/*     */     //   311: dup
/*     */     //   312: iconst_2
/*     */     //   313: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   316: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   319: ldc_w 'code'
/*     */     //   322: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   325: iconst_m1
/*     */     //   326: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   329: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   332: aastore
/*     */     //   333: checkcast [Ljava/lang/Object;
/*     */     //   336: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   339: invokevirtual apply : (Lscala/collection/Seq;)Lcom/nirvana/core/MapBean;
/*     */     //   342: invokevirtual responseJson : (Ljavax/servlet/http/HttpServletResponse;Lcom/nirvana/core/MapBean;)V
/*     */     //   345: return
/*     */     //   346: aload #15
/*     */     //   348: ldc_w 'status'
/*     */     //   351: invokevirtual getInt : (Ljava/lang/String;)I
/*     */     //   354: iconst_1
/*     */     //   355: if_icmpne -> 449
/*     */     //   358: getstatic com/nirvana/web/ResponseUtil$.MODULE$ : Lcom/nirvana/web/ResponseUtil$;
/*     */     //   361: aload_2
/*     */     //   362: getstatic com/nirvana/core/MapBean$.MODULE$ : Lcom/nirvana/core/MapBean$;
/*     */     //   365: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   368: iconst_3
/*     */     //   369: anewarray scala/Tuple2
/*     */     //   372: dup
/*     */     //   373: iconst_0
/*     */     //   374: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   377: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   380: ldc 'result'
/*     */     //   382: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   385: iconst_0
/*     */     //   386: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   389: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   392: aastore
/*     */     //   393: dup
/*     */     //   394: iconst_1
/*     */     //   395: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   398: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   401: ldc 'msg'
/*     */     //   403: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   406: ldc_w '重复发货'
/*     */     //   409: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   412: aastore
/*     */     //   413: dup
/*     */     //   414: iconst_2
/*     */     //   415: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   418: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   421: ldc_w 'code'
/*     */     //   424: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   427: bipush #-10
/*     */     //   429: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   432: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   435: aastore
/*     */     //   436: checkcast [Ljava/lang/Object;
/*     */     //   439: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   442: invokevirtual apply : (Lscala/collection/Seq;)Lcom/nirvana/core/MapBean;
/*     */     //   445: invokevirtual responseJson : (Ljavax/servlet/http/HttpServletResponse;Lcom/nirvana/core/MapBean;)V
/*     */     //   448: return
/*     */     //   449: aload #15
/*     */     //   451: ldc_w 'rmb'
/*     */     //   454: invokevirtual getInt : (Ljava/lang/String;)I
/*     */     //   457: iload #8
/*     */     //   459: if_icmpne -> 725
/*     */     //   462: aload #15
/*     */     //   464: ldc_w 'product_id'
/*     */     //   467: invokevirtual getInt : (Ljava/lang/String;)I
/*     */     //   470: new scala/collection/immutable/StringOps
/*     */     //   473: dup
/*     */     //   474: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   477: aload #11
/*     */     //   479: invokevirtual augmentString : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   482: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   485: invokevirtual toInt : ()I
/*     */     //   488: if_icmpne -> 725
/*     */     //   491: aload #10
/*     */     //   493: aload #15
/*     */     //   495: ldc_w 'player_id'
/*     */     //   498: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   501: astore #16
/*     */     //   503: dup
/*     */     //   504: ifnonnull -> 516
/*     */     //   507: pop
/*     */     //   508: aload #16
/*     */     //   510: ifnull -> 524
/*     */     //   513: goto -> 725
/*     */     //   516: aload #16
/*     */     //   518: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   521: ifeq -> 725
/*     */     //   524: iload #9
/*     */     //   526: aload #15
/*     */     //   528: ldc_w 'server_id'
/*     */     //   531: invokevirtual getInt : (Ljava/lang/String;)I
/*     */     //   534: if_icmpne -> 725
/*     */     //   537: aload #5
/*     */     //   539: aload #15
/*     */     //   541: ldc_w 'order_id'
/*     */     //   544: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   547: astore #17
/*     */     //   549: dup
/*     */     //   550: ifnonnull -> 562
/*     */     //   553: pop
/*     */     //   554: aload #17
/*     */     //   556: ifnull -> 570
/*     */     //   559: goto -> 725
/*     */     //   562: aload #17
/*     */     //   564: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   567: ifeq -> 725
/*     */     //   570: getstatic com/nirvana/service/PayService$.MODULE$ : Lcom/nirvana/service/PayService$;
/*     */     //   573: aload #6
/*     */     //   575: iconst_1
/*     */     //   576: aload #5
/*     */     //   578: invokevirtual updatePayOrderStatus : (Ljava/lang/String;ILjava/lang/String;)V
/*     */     //   581: getstatic com/nirvana/thread/PayThread$.MODULE$ : Lcom/nirvana/thread/PayThread$;
/*     */     //   584: aload #6
/*     */     //   586: aload #5
/*     */     //   588: iload #9
/*     */     //   590: aload #7
/*     */     //   592: aload #10
/*     */     //   594: aload #15
/*     */     //   596: ldc_w 'pf'
/*     */     //   599: invokevirtual getInt : (Ljava/lang/String;)I
/*     */     //   602: aload #15
/*     */     //   604: ldc_w 'channel_id'
/*     */     //   607: invokevirtual getInt : (Ljava/lang/String;)I
/*     */     //   610: iload #8
/*     */     //   612: new scala/collection/immutable/StringOps
/*     */     //   615: dup
/*     */     //   616: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   619: aload #11
/*     */     //   621: invokevirtual augmentString : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   624: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   627: invokevirtual toInt : ()I
/*     */     //   630: invokevirtual payDispatch : (Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIII)V
/*     */     //   633: getstatic com/nirvana/web/ResponseUtil$.MODULE$ : Lcom/nirvana/web/ResponseUtil$;
/*     */     //   636: aload_2
/*     */     //   637: getstatic com/nirvana/core/MapBean$.MODULE$ : Lcom/nirvana/core/MapBean$;
/*     */     //   640: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   643: iconst_3
/*     */     //   644: anewarray scala/Tuple2
/*     */     //   647: dup
/*     */     //   648: iconst_0
/*     */     //   649: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   652: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   655: ldc 'result'
/*     */     //   657: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   660: iconst_1
/*     */     //   661: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   664: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   667: aastore
/*     */     //   668: dup
/*     */     //   669: iconst_1
/*     */     //   670: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   673: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   676: ldc 'msg'
/*     */     //   678: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   681: ldc_w '发货成功'
/*     */     //   684: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   687: aastore
/*     */     //   688: dup
/*     */     //   689: iconst_2
/*     */     //   690: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   693: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   696: ldc_w 'code'
/*     */     //   699: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   702: iconst_1
/*     */     //   703: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   706: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   709: aastore
/*     */     //   710: checkcast [Ljava/lang/Object;
/*     */     //   713: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   716: invokevirtual apply : (Lscala/collection/Seq;)Lcom/nirvana/core/MapBean;
/*     */     //   719: invokevirtual responseJson : (Ljavax/servlet/http/HttpServletResponse;Lcom/nirvana/core/MapBean;)V
/*     */     //   722: goto -> 1016
/*     */     //   725: getstatic com/nirvana/web/ResponseUtil$.MODULE$ : Lcom/nirvana/web/ResponseUtil$;
/*     */     //   728: aload_2
/*     */     //   729: getstatic com/nirvana/core/MapBean$.MODULE$ : Lcom/nirvana/core/MapBean$;
/*     */     //   732: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   735: iconst_3
/*     */     //   736: anewarray scala/Tuple2
/*     */     //   739: dup
/*     */     //   740: iconst_0
/*     */     //   741: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   744: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   747: ldc 'result'
/*     */     //   749: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   752: iconst_0
/*     */     //   753: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   756: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   759: aastore
/*     */     //   760: dup
/*     */     //   761: iconst_1
/*     */     //   762: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   765: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   768: ldc 'msg'
/*     */     //   770: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   773: ldc_w '关联性参数校验失败'
/*     */     //   776: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   779: aastore
/*     */     //   780: dup
/*     */     //   781: iconst_2
/*     */     //   782: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   785: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   788: ldc_w 'code'
/*     */     //   791: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   794: iconst_0
/*     */     //   795: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   798: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   801: aastore
/*     */     //   802: checkcast [Ljava/lang/Object;
/*     */     //   805: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   808: invokevirtual apply : (Lscala/collection/Seq;)Lcom/nirvana/core/MapBean;
/*     */     //   811: invokevirtual responseJson : (Ljavax/servlet/http/HttpServletResponse;Lcom/nirvana/core/MapBean;)V
/*     */     //   814: return
/*     */     //   815: getstatic com/nirvana/web/ResponseUtil$.MODULE$ : Lcom/nirvana/web/ResponseUtil$;
/*     */     //   818: aload_2
/*     */     //   819: getstatic com/nirvana/core/MapBean$.MODULE$ : Lcom/nirvana/core/MapBean$;
/*     */     //   822: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   825: iconst_3
/*     */     //   826: anewarray scala/Tuple2
/*     */     //   829: dup
/*     */     //   830: iconst_0
/*     */     //   831: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   834: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   837: ldc 'result'
/*     */     //   839: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   842: iconst_0
/*     */     //   843: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   846: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   849: aastore
/*     */     //   850: dup
/*     */     //   851: iconst_1
/*     */     //   852: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   855: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   858: ldc 'msg'
/*     */     //   860: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   863: ldc_w '⾮法IP'
/*     */     //   866: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   869: aastore
/*     */     //   870: dup
/*     */     //   871: iconst_2
/*     */     //   872: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   875: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   878: ldc_w 'code'
/*     */     //   881: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   884: bipush #-6
/*     */     //   886: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   889: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   892: aastore
/*     */     //   893: checkcast [Ljava/lang/Object;
/*     */     //   896: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   899: invokevirtual apply : (Lscala/collection/Seq;)Lcom/nirvana/core/MapBean;
/*     */     //   902: invokevirtual responseJson : (Ljavax/servlet/http/HttpServletResponse;Lcom/nirvana/core/MapBean;)V
/*     */     //   905: return
/*     */     //   906: aload_0
/*     */     //   907: invokevirtual webLogger : ()Lorg/slf4j/Logger;
/*     */     //   910: ldc_w '校验失败:{}'
/*     */     //   913: iconst_1
/*     */     //   914: anewarray java/lang/Object
/*     */     //   917: dup
/*     */     //   918: iconst_0
/*     */     //   919: aload_1
/*     */     //   920: aastore
/*     */     //   921: invokeinterface error : (Ljava/lang/String;[Ljava/lang/Object;)V
/*     */     //   926: getstatic com/nirvana/web/ResponseUtil$.MODULE$ : Lcom/nirvana/web/ResponseUtil$;
/*     */     //   929: aload_2
/*     */     //   930: getstatic com/nirvana/core/MapBean$.MODULE$ : Lcom/nirvana/core/MapBean$;
/*     */     //   933: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   936: iconst_3
/*     */     //   937: anewarray scala/Tuple2
/*     */     //   940: dup
/*     */     //   941: iconst_0
/*     */     //   942: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   945: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   948: ldc 'result'
/*     */     //   950: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   953: iconst_0
/*     */     //   954: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   957: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   960: aastore
/*     */     //   961: dup
/*     */     //   962: iconst_1
/*     */     //   963: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   966: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   969: ldc 'msg'
/*     */     //   971: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   974: ldc_w '校验失败'
/*     */     //   977: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   980: aastore
/*     */     //   981: dup
/*     */     //   982: iconst_2
/*     */     //   983: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   986: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   989: ldc_w 'code'
/*     */     //   992: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   995: bipush #-3
/*     */     //   997: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   1000: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   1003: aastore
/*     */     //   1004: checkcast [Ljava/lang/Object;
/*     */     //   1007: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   1010: invokevirtual apply : (Lscala/collection/Seq;)Lcom/nirvana/core/MapBean;
/*     */     //   1013: invokevirtual responseJson : (Ljavax/servlet/http/HttpServletResponse;Lcom/nirvana/core/MapBean;)V
/*     */     //   1016: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #41	-> 0
/*     */     //   #42	-> 37
/*     */     //   #43	-> 46
/*     */     //   #44	-> 56
/*     */     //   #45	-> 66
/*     */     //   #46	-> 76
/*     */     //   #48	-> 86
/*     */     //   #49	-> 95
/*     */     //   #50	-> 104
/*     */     //   #51	-> 114
/*     */     //   #53	-> 124
/*     */     //   #54	-> 198
/*     */     //   #58	-> 224
/*     */     //   #59	-> 231
/*     */     //   #63	-> 242
/*     */     //   #64	-> 252
/*     */     //   #65	-> 257
/*     */     //   #66	-> 345
/*     */     //   #68	-> 346
/*     */     //   #69	-> 358
/*     */     //   #70	-> 448
/*     */     //   #72	-> 449
/*     */     //   #73	-> 491
/*     */     //   #77	-> 570
/*     */     //   #78	-> 581
/*     */     //   #79	-> 633
/*     */     //   #74	-> 725
/*     */     //   #75	-> 814
/*     */     //   #60	-> 815
/*     */     //   #61	-> 905
/*     */     //   #55	-> 906
/*     */     //   #56	-> 926
/*     */     //   #40	-> 1016
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	1017	0	this	Lcom/nirvana/action/PayController;
/*     */     //   0	1017	1	request	Ljavax/servlet/http/HttpServletRequest;
/*     */     //   0	1017	2	response	Ljavax/servlet/http/HttpServletResponse;
/*     */     //   46	971	3	signature	Ljava/lang/String;
/*     */     //   56	961	4	signType	Ljava/lang/String;
/*     */     //   66	951	5	orderID	Ljava/lang/String;
/*     */     //   76	941	6	cpOrderId	Ljava/lang/String;
/*     */     //   86	931	7	username	Ljava/lang/String;
/*     */     //   95	922	8	money	I
/*     */     //   104	913	9	serverID	I
/*     */     //   114	903	10	roleID	Ljava/lang/String;
/*     */     //   124	893	11	productID	Ljava/lang/String;
/*     */     //   198	819	12	sign	Ljava/lang/String;
/*     */     //   231	491	14	ip	Ljava/lang/String;
/*     */     //   252	470	15	payOrder	Lcom/nirvana/core/MapBean;
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
/*     */   @RequestMapping({"/aofeiIOSAskForOrderId"})
/*     */   public void aofeiIOSAskForOrderId(HttpServletRequest request, HttpServletResponse response) {
/*  85 */     MapBean params = getRequestJson(request);
/*  86 */     webLogger().warn("{}", new Object[] { params });
/*  87 */     String sign = params.getString("sign");
/*  88 */     String str1 = SignUtils$.MODULE$.makeSign(params.getLong("id")); if (sign == null) { if (str1 != null)
/*  89 */       { webLogger().error("校验失败:{},{},{}", new Object[] { request, params, request.getParameterMap(), request.getQueryString() });
/*  90 */         throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_1"), BusinessException$.MODULE$.$lessinit$greater$default$2()); }  } else if (!sign.equals(str1)) { webLogger().error("校验失败:{},{},{}", new Object[] { request, params, request.getParameterMap(), request.getQueryString() }); throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_1"), BusinessException$.MODULE$.$lessinit$greater$default$2()); }
/*     */     
/*  92 */     MapBean ret = AoFeiIOSApi$.MODULE$.getOrderId(params);
/*  93 */     webLogger().warn((new StringBuilder()).append("pay:").append(ret.toJsonString()).toString());
/*     */     
/*  95 */     ResponseUtil$.MODULE$.responseJson(response, ret);
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
/*     */   @RequestMapping({"/aofei-ios"})
/*     */   public void aofeiIOS(HttpServletRequest request, HttpServletResponse response) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual webLogger : ()Lorg/slf4j/Logger;
/*     */     //   4: ldc '{},{},{}'
/*     */     //   6: iconst_3
/*     */     //   7: anewarray java/lang/Object
/*     */     //   10: dup
/*     */     //   11: iconst_0
/*     */     //   12: aload_1
/*     */     //   13: aastore
/*     */     //   14: dup
/*     */     //   15: iconst_1
/*     */     //   16: aload_1
/*     */     //   17: invokeinterface getParameterMap : ()Ljava/util/Map;
/*     */     //   22: aastore
/*     */     //   23: dup
/*     */     //   24: iconst_2
/*     */     //   25: aload_1
/*     */     //   26: invokeinterface getQueryString : ()Ljava/lang/String;
/*     */     //   31: aastore
/*     */     //   32: invokeinterface warn : (Ljava/lang/String;[Ljava/lang/Object;)V
/*     */     //   37: aload_1
/*     */     //   38: ldc 'signature'
/*     */     //   40: ldc ''
/*     */     //   42: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   45: astore_3
/*     */     //   46: aload_1
/*     */     //   47: ldc 'signType'
/*     */     //   49: ldc ''
/*     */     //   51: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   54: astore #4
/*     */     //   56: aload_1
/*     */     //   57: ldc 'orderID'
/*     */     //   59: ldc ''
/*     */     //   61: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   64: astore #5
/*     */     //   66: aload_1
/*     */     //   67: ldc 'cpOrderID'
/*     */     //   69: ldc ''
/*     */     //   71: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   74: astore #6
/*     */     //   76: aload_1
/*     */     //   77: ldc_w 'userID'
/*     */     //   80: ldc ''
/*     */     //   82: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   85: astore #7
/*     */     //   87: aload_1
/*     */     //   88: ldc 'money'
/*     */     //   90: iconst_0
/*     */     //   91: invokestatic getIntParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;I)I
/*     */     //   94: istore #8
/*     */     //   96: aload_1
/*     */     //   97: ldc 'serverID'
/*     */     //   99: iconst_0
/*     */     //   100: invokestatic getIntParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;I)I
/*     */     //   103: istore #9
/*     */     //   105: aload_1
/*     */     //   106: ldc 'roleID'
/*     */     //   108: ldc ''
/*     */     //   110: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   113: astore #10
/*     */     //   115: aload_1
/*     */     //   116: ldc 'productID'
/*     */     //   118: ldc ''
/*     */     //   120: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   123: astore #11
/*     */     //   125: getstatic com/nirvana/util/Tool$.MODULE$ : Lcom/nirvana/util/Tool$;
/*     */     //   128: new scala/collection/mutable/StringBuilder
/*     */     //   131: dup
/*     */     //   132: invokespecial <init> : ()V
/*     */     //   135: aload #5
/*     */     //   137: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   140: aload #6
/*     */     //   142: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   145: aload #7
/*     */     //   147: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   150: iload #8
/*     */     //   152: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   155: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   158: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   161: iload #9
/*     */     //   163: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   166: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   169: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   172: aload #10
/*     */     //   174: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   177: aload #11
/*     */     //   179: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   182: getstatic com/nirvana/platform/AoFeiIOSApi$.MODULE$ : Lcom/nirvana/platform/AoFeiIOSApi$;
/*     */     //   185: invokevirtual appSecret : ()Ljava/lang/String;
/*     */     //   188: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   191: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   194: invokevirtual md5Hex : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   197: astore #12
/*     */     //   199: aload_3
/*     */     //   200: aload #12
/*     */     //   202: astore #13
/*     */     //   204: dup
/*     */     //   205: ifnonnull -> 217
/*     */     //   208: pop
/*     */     //   209: aload #13
/*     */     //   211: ifnull -> 225
/*     */     //   214: goto -> 874
/*     */     //   217: aload #13
/*     */     //   219: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   222: ifeq -> 874
/*     */     //   225: aload_0
/*     */     //   226: aload_1
/*     */     //   227: invokevirtual getRemoteIp : (Ljavax/servlet/http/HttpServletRequest;)Ljava/lang/String;
/*     */     //   230: astore #14
/*     */     //   232: getstatic com/nirvana/platform/AoFeiIOSApi$.MODULE$ : Lcom/nirvana/platform/AoFeiIOSApi$;
/*     */     //   235: aload #14
/*     */     //   237: invokevirtual checkIp : (Ljava/lang/String;)Z
/*     */     //   240: ifeq -> 783
/*     */     //   243: getstatic com/nirvana/service/PayService$.MODULE$ : Lcom/nirvana/service/PayService$;
/*     */     //   246: aload #6
/*     */     //   248: invokevirtual getPayOrder : (Ljava/lang/String;)Lcom/nirvana/core/MapBean;
/*     */     //   251: astore #15
/*     */     //   253: aload #15
/*     */     //   255: ifnonnull -> 347
/*     */     //   258: getstatic com/nirvana/web/ResponseUtil$.MODULE$ : Lcom/nirvana/web/ResponseUtil$;
/*     */     //   261: aload_2
/*     */     //   262: getstatic com/nirvana/core/MapBean$.MODULE$ : Lcom/nirvana/core/MapBean$;
/*     */     //   265: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   268: iconst_3
/*     */     //   269: anewarray scala/Tuple2
/*     */     //   272: dup
/*     */     //   273: iconst_0
/*     */     //   274: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   277: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   280: ldc 'result'
/*     */     //   282: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   285: iconst_0
/*     */     //   286: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   289: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   292: aastore
/*     */     //   293: dup
/*     */     //   294: iconst_1
/*     */     //   295: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   298: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   301: ldc 'msg'
/*     */     //   303: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   306: ldc '参数错误，无此订单记录[cpOrderID]'
/*     */     //   308: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   311: aastore
/*     */     //   312: dup
/*     */     //   313: iconst_2
/*     */     //   314: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   317: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   320: ldc_w 'code'
/*     */     //   323: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   326: iconst_m1
/*     */     //   327: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   330: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   333: aastore
/*     */     //   334: checkcast [Ljava/lang/Object;
/*     */     //   337: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   340: invokevirtual apply : (Lscala/collection/Seq;)Lcom/nirvana/core/MapBean;
/*     */     //   343: invokevirtual responseJson : (Ljavax/servlet/http/HttpServletResponse;Lcom/nirvana/core/MapBean;)V
/*     */     //   346: return
/*     */     //   347: aload #15
/*     */     //   349: ldc_w 'status'
/*     */     //   352: invokevirtual getInt : (Ljava/lang/String;)I
/*     */     //   355: iconst_1
/*     */     //   356: if_icmpne -> 450
/*     */     //   359: getstatic com/nirvana/web/ResponseUtil$.MODULE$ : Lcom/nirvana/web/ResponseUtil$;
/*     */     //   362: aload_2
/*     */     //   363: getstatic com/nirvana/core/MapBean$.MODULE$ : Lcom/nirvana/core/MapBean$;
/*     */     //   366: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   369: iconst_3
/*     */     //   370: anewarray scala/Tuple2
/*     */     //   373: dup
/*     */     //   374: iconst_0
/*     */     //   375: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   378: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   381: ldc 'result'
/*     */     //   383: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   386: iconst_0
/*     */     //   387: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   390: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   393: aastore
/*     */     //   394: dup
/*     */     //   395: iconst_1
/*     */     //   396: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   399: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   402: ldc 'msg'
/*     */     //   404: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   407: ldc_w '重复发货'
/*     */     //   410: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   413: aastore
/*     */     //   414: dup
/*     */     //   415: iconst_2
/*     */     //   416: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   419: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   422: ldc_w 'code'
/*     */     //   425: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   428: bipush #-10
/*     */     //   430: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   433: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   436: aastore
/*     */     //   437: checkcast [Ljava/lang/Object;
/*     */     //   440: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   443: invokevirtual apply : (Lscala/collection/Seq;)Lcom/nirvana/core/MapBean;
/*     */     //   446: invokevirtual responseJson : (Ljavax/servlet/http/HttpServletResponse;Lcom/nirvana/core/MapBean;)V
/*     */     //   449: return
/*     */     //   450: aload #15
/*     */     //   452: ldc_w 'rmb'
/*     */     //   455: invokevirtual getInt : (Ljava/lang/String;)I
/*     */     //   458: iload #8
/*     */     //   460: if_icmpne -> 693
/*     */     //   463: aload #15
/*     */     //   465: ldc_w 'product_id'
/*     */     //   468: invokevirtual getInt : (Ljava/lang/String;)I
/*     */     //   471: new scala/collection/immutable/StringOps
/*     */     //   474: dup
/*     */     //   475: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   478: aload #11
/*     */     //   480: invokevirtual augmentString : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   483: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   486: invokevirtual toInt : ()I
/*     */     //   489: if_icmpne -> 693
/*     */     //   492: aload #10
/*     */     //   494: aload #15
/*     */     //   496: ldc_w 'player_id'
/*     */     //   499: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   502: astore #16
/*     */     //   504: dup
/*     */     //   505: ifnonnull -> 517
/*     */     //   508: pop
/*     */     //   509: aload #16
/*     */     //   511: ifnull -> 525
/*     */     //   514: goto -> 693
/*     */     //   517: aload #16
/*     */     //   519: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   522: ifeq -> 693
/*     */     //   525: iload #9
/*     */     //   527: aload #15
/*     */     //   529: ldc_w 'server_id'
/*     */     //   532: invokevirtual getInt : (Ljava/lang/String;)I
/*     */     //   535: if_icmpne -> 693
/*     */     //   538: getstatic com/nirvana/service/PayService$.MODULE$ : Lcom/nirvana/service/PayService$;
/*     */     //   541: aload #6
/*     */     //   543: iconst_1
/*     */     //   544: aload #5
/*     */     //   546: invokevirtual updatePayOrderStatus : (Ljava/lang/String;ILjava/lang/String;)V
/*     */     //   549: getstatic com/nirvana/thread/PayThread$.MODULE$ : Lcom/nirvana/thread/PayThread$;
/*     */     //   552: aload #6
/*     */     //   554: aload #5
/*     */     //   556: iload #9
/*     */     //   558: aload #7
/*     */     //   560: aload #10
/*     */     //   562: aload #15
/*     */     //   564: ldc_w 'pf'
/*     */     //   567: invokevirtual getInt : (Ljava/lang/String;)I
/*     */     //   570: aload #15
/*     */     //   572: ldc_w 'channel_id'
/*     */     //   575: invokevirtual getInt : (Ljava/lang/String;)I
/*     */     //   578: iload #8
/*     */     //   580: new scala/collection/immutable/StringOps
/*     */     //   583: dup
/*     */     //   584: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   587: aload #11
/*     */     //   589: invokevirtual augmentString : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   592: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   595: invokevirtual toInt : ()I
/*     */     //   598: invokevirtual payDispatch : (Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIII)V
/*     */     //   601: getstatic com/nirvana/web/ResponseUtil$.MODULE$ : Lcom/nirvana/web/ResponseUtil$;
/*     */     //   604: aload_2
/*     */     //   605: getstatic com/nirvana/core/MapBean$.MODULE$ : Lcom/nirvana/core/MapBean$;
/*     */     //   608: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   611: iconst_3
/*     */     //   612: anewarray scala/Tuple2
/*     */     //   615: dup
/*     */     //   616: iconst_0
/*     */     //   617: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   620: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   623: ldc 'result'
/*     */     //   625: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   628: iconst_1
/*     */     //   629: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   632: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   635: aastore
/*     */     //   636: dup
/*     */     //   637: iconst_1
/*     */     //   638: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   641: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   644: ldc 'msg'
/*     */     //   646: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   649: ldc_w '发货成功'
/*     */     //   652: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   655: aastore
/*     */     //   656: dup
/*     */     //   657: iconst_2
/*     */     //   658: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   661: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   664: ldc_w 'code'
/*     */     //   667: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   670: iconst_1
/*     */     //   671: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   674: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   677: aastore
/*     */     //   678: checkcast [Ljava/lang/Object;
/*     */     //   681: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   684: invokevirtual apply : (Lscala/collection/Seq;)Lcom/nirvana/core/MapBean;
/*     */     //   687: invokevirtual responseJson : (Ljavax/servlet/http/HttpServletResponse;Lcom/nirvana/core/MapBean;)V
/*     */     //   690: goto -> 984
/*     */     //   693: getstatic com/nirvana/web/ResponseUtil$.MODULE$ : Lcom/nirvana/web/ResponseUtil$;
/*     */     //   696: aload_2
/*     */     //   697: getstatic com/nirvana/core/MapBean$.MODULE$ : Lcom/nirvana/core/MapBean$;
/*     */     //   700: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   703: iconst_3
/*     */     //   704: anewarray scala/Tuple2
/*     */     //   707: dup
/*     */     //   708: iconst_0
/*     */     //   709: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   712: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   715: ldc 'result'
/*     */     //   717: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   720: iconst_0
/*     */     //   721: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   724: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   727: aastore
/*     */     //   728: dup
/*     */     //   729: iconst_1
/*     */     //   730: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   733: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   736: ldc 'msg'
/*     */     //   738: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   741: ldc_w '关联性参数校验失败'
/*     */     //   744: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   747: aastore
/*     */     //   748: dup
/*     */     //   749: iconst_2
/*     */     //   750: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   753: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   756: ldc_w 'code'
/*     */     //   759: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   762: iconst_0
/*     */     //   763: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   766: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   769: aastore
/*     */     //   770: checkcast [Ljava/lang/Object;
/*     */     //   773: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   776: invokevirtual apply : (Lscala/collection/Seq;)Lcom/nirvana/core/MapBean;
/*     */     //   779: invokevirtual responseJson : (Ljavax/servlet/http/HttpServletResponse;Lcom/nirvana/core/MapBean;)V
/*     */     //   782: return
/*     */     //   783: getstatic com/nirvana/web/ResponseUtil$.MODULE$ : Lcom/nirvana/web/ResponseUtil$;
/*     */     //   786: aload_2
/*     */     //   787: getstatic com/nirvana/core/MapBean$.MODULE$ : Lcom/nirvana/core/MapBean$;
/*     */     //   790: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   793: iconst_3
/*     */     //   794: anewarray scala/Tuple2
/*     */     //   797: dup
/*     */     //   798: iconst_0
/*     */     //   799: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   802: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   805: ldc 'result'
/*     */     //   807: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   810: iconst_0
/*     */     //   811: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   814: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   817: aastore
/*     */     //   818: dup
/*     */     //   819: iconst_1
/*     */     //   820: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   823: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   826: ldc 'msg'
/*     */     //   828: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   831: ldc_w '⾮法IP'
/*     */     //   834: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   837: aastore
/*     */     //   838: dup
/*     */     //   839: iconst_2
/*     */     //   840: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   843: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   846: ldc_w 'code'
/*     */     //   849: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   852: bipush #-6
/*     */     //   854: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   857: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   860: aastore
/*     */     //   861: checkcast [Ljava/lang/Object;
/*     */     //   864: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   867: invokevirtual apply : (Lscala/collection/Seq;)Lcom/nirvana/core/MapBean;
/*     */     //   870: invokevirtual responseJson : (Ljavax/servlet/http/HttpServletResponse;Lcom/nirvana/core/MapBean;)V
/*     */     //   873: return
/*     */     //   874: aload_0
/*     */     //   875: invokevirtual webLogger : ()Lorg/slf4j/Logger;
/*     */     //   878: ldc_w '校验失败:{}'
/*     */     //   881: iconst_1
/*     */     //   882: anewarray java/lang/Object
/*     */     //   885: dup
/*     */     //   886: iconst_0
/*     */     //   887: aload_1
/*     */     //   888: aastore
/*     */     //   889: invokeinterface error : (Ljava/lang/String;[Ljava/lang/Object;)V
/*     */     //   894: getstatic com/nirvana/web/ResponseUtil$.MODULE$ : Lcom/nirvana/web/ResponseUtil$;
/*     */     //   897: aload_2
/*     */     //   898: getstatic com/nirvana/core/MapBean$.MODULE$ : Lcom/nirvana/core/MapBean$;
/*     */     //   901: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   904: iconst_3
/*     */     //   905: anewarray scala/Tuple2
/*     */     //   908: dup
/*     */     //   909: iconst_0
/*     */     //   910: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   913: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   916: ldc 'result'
/*     */     //   918: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   921: iconst_0
/*     */     //   922: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   925: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   928: aastore
/*     */     //   929: dup
/*     */     //   930: iconst_1
/*     */     //   931: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   934: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   937: ldc 'msg'
/*     */     //   939: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   942: ldc_w '校验失败'
/*     */     //   945: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   948: aastore
/*     */     //   949: dup
/*     */     //   950: iconst_2
/*     */     //   951: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   954: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   957: ldc_w 'code'
/*     */     //   960: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   963: bipush #-3
/*     */     //   965: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   968: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   971: aastore
/*     */     //   972: checkcast [Ljava/lang/Object;
/*     */     //   975: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   978: invokevirtual apply : (Lscala/collection/Seq;)Lcom/nirvana/core/MapBean;
/*     */     //   981: invokevirtual responseJson : (Ljavax/servlet/http/HttpServletResponse;Lcom/nirvana/core/MapBean;)V
/*     */     //   984: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #101	-> 0
/*     */     //   #102	-> 37
/*     */     //   #103	-> 46
/*     */     //   #104	-> 56
/*     */     //   #105	-> 66
/*     */     //   #106	-> 76
/*     */     //   #108	-> 87
/*     */     //   #109	-> 96
/*     */     //   #110	-> 105
/*     */     //   #111	-> 115
/*     */     //   #113	-> 125
/*     */     //   #114	-> 199
/*     */     //   #118	-> 225
/*     */     //   #119	-> 232
/*     */     //   #123	-> 243
/*     */     //   #124	-> 253
/*     */     //   #125	-> 258
/*     */     //   #126	-> 346
/*     */     //   #128	-> 347
/*     */     //   #129	-> 359
/*     */     //   #130	-> 449
/*     */     //   #132	-> 450
/*     */     //   #133	-> 492
/*     */     //   #137	-> 538
/*     */     //   #138	-> 549
/*     */     //   #139	-> 601
/*     */     //   #134	-> 693
/*     */     //   #135	-> 782
/*     */     //   #120	-> 783
/*     */     //   #121	-> 873
/*     */     //   #115	-> 874
/*     */     //   #116	-> 894
/*     */     //   #100	-> 984
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	985	0	this	Lcom/nirvana/action/PayController;
/*     */     //   0	985	1	request	Ljavax/servlet/http/HttpServletRequest;
/*     */     //   0	985	2	response	Ljavax/servlet/http/HttpServletResponse;
/*     */     //   46	939	3	signature	Ljava/lang/String;
/*     */     //   56	929	4	signType	Ljava/lang/String;
/*     */     //   66	919	5	orderID	Ljava/lang/String;
/*     */     //   76	909	6	cpOrderId	Ljava/lang/String;
/*     */     //   87	898	7	username	Ljava/lang/String;
/*     */     //   96	889	8	money	I
/*     */     //   105	880	9	serverID	I
/*     */     //   115	870	10	roleID	Ljava/lang/String;
/*     */     //   125	860	11	productID	Ljava/lang/String;
/*     */     //   199	786	12	sign	Ljava/lang/String;
/*     */     //   232	458	14	ip	Ljava/lang/String;
/*     */     //   253	437	15	payOrder	Lcom/nirvana/core/MapBean;
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
/*     */   @RequestMapping({"/nox"})
/*     */   public void nox(HttpServletRequest request, HttpServletResponse response) {
/* 145 */     MapBean params = getRequestJson(request);
/* 146 */     webLogger().warn("{}", new Object[] { params });
/* 147 */     String orderID = params.getString("orderId");
/* 148 */     String token = params.getString("token");
/* 149 */     String username = params.getString("username");
/* 150 */     String roleID = params.getString("roleID");
/* 151 */     int serverID = params.getInt("serverID");
/* 152 */     int money = params.getInt("money");
/* 153 */     int productID = params.getInt("productID");
/* 154 */     String sign = params.getString("sign");
/*     */     
/* 156 */     String str1 = SignUtils$.MODULE$.makeSign(params.getLong("id")); if (sign == null) { if (str1 != null)
/* 157 */       { webLogger().error("校验失败:{},{},{}", new Object[] { request, params, request.getParameterMap(), request.getQueryString() });
/* 158 */         throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_1"), BusinessException$.MODULE$.$lessinit$greater$default$2()); }  } else if (!sign.equals(str1)) { webLogger().error("校验失败:{},{},{}", new Object[] { request, params, request.getParameterMap(), request.getQueryString() }); throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_1"), BusinessException$.MODULE$.$lessinit$greater$default$2()); }
/*     */     
/* 160 */     MapBean user = MasterCache$.MODULE$.getCenterUserByUsername(username);
/* 161 */     if (user == null) throw new BusinessException(MessageI18n$.MODULE$.getString("AoFeiApi_1"), BusinessException$.MODULE$.$lessinit$greater$default$2()); 
/* 162 */     int channelID = user.getInt("channel_id");
/* 163 */     MapBean payOrder = PayService$.MODULE$.getPayOrderByOrderId(orderID);
/* 164 */     String cpOrderID = "";
/* 165 */     if (payOrder == null) {
/* 166 */       cpOrderID = SequenceService$.MODULE$.askForNewPayOrderId();
/* 167 */       PayService$.MODULE$.addPayOrder(cpOrderID, orderID, serverID, username, roleID, UserPlatformType$.MODULE$.NOX().id(), channelID, money, productID);
/* 168 */       PayService$.MODULE$.addPayOther(cpOrderID, token);
/* 169 */       payOrder = PayService$.MODULE$.getPayOrder(cpOrderID);
/*     */     } 
/*     */     
/* 172 */     if (payOrder.getInt("status") == 0 && NoxApi$.MODULE$.checkPay(channelID, roleID, serverID, orderID, productID, token)) {
/* 173 */       PayThread$.MODULE$.payDispatch(cpOrderID, orderID, serverID, username, roleID, payOrder.getInt("pf"), payOrder.getInt("channel_id"), money, productID);
/* 174 */       (new scala.Tuple2[1])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("result"), BoxesRunTime.boxToInteger(1)); ResponseUtil$.MODULE$.responseJson(response, MapBean$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[1])));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\action\PayController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */