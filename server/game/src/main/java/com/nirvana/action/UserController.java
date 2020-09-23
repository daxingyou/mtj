/*     */ package com.nirvana.action;
/*     */ 
/*     */ import com.nirvana.cache.MasterCache$;
/*     */ import com.nirvana.core.MapBean;
/*     */ import com.nirvana.core.MapBean$;
/*     */ import com.nirvana.core.ServerConfig$;
/*     */ import com.nirvana.exception.BusinessException;
/*     */ import com.nirvana.exception.BusinessException$;
/*     */ import com.nirvana.service.GiftPackageService$;
/*     */ import com.nirvana.service.PlayerService$;
/*     */ import com.nirvana.service.SequenceService$;
/*     */ import com.nirvana.service.UserService$;
/*     */ import com.nirvana.util.MessageI18n$;
/*     */ import com.nirvana.util.SignUtils$;
/*     */ import com.nirvana.util.Tool$;
/*     */ import com.nirvana.web.AbstractController;
/*     */ import com.nirvana.web.ResponseUtil$;
/*     */ import java.text.SimpleDateFormat;
/*     */ import javax.servlet.ServletRequest;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import org.apache.commons.lang.StringUtils;
/*     */ import org.springframework.stereotype.Controller;
/*     */ import org.springframework.web.bind.ServletRequestUtils;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.List;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.reflect.ScalaSignature;
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
/*     */ 
/*     */ 
/*     */ @Controller
/*     */ @RequestMapping({"/user"})
/*     */ @ScalaSignature(bytes = "\006\001e4A!\001\002\001\023\tqQk]3s\007>tGO]8mY\026\024(BA\002\005\003\031\t7\r^5p]*\021QAB\001\b]&\024h/\0318b\025\0059\021aA2p[\016\0011C\001\001\013!\tYa\"D\001\r\025\tiA!A\002xK\nL!a\004\007\003%\005\0237\017\036:bGR\034uN\034;s_2dWM\035\005\006#\001!\tAE\001\007y%t\027\016\036 \025\003M\001\"\001\006\001\016\003\tAQA\006\001\005\002]\tQ\001\\8hS:$2\001\007\020+!\tIB$D\001\033\025\005Y\022!B:dC2\f\027BA\017\033\005\021)f.\033;\t\013})\002\031\001\021\002\017I,\027/^3tiB\021\021\005K\007\002E)\0211\005J\001\005QR$\bO\003\002&M\00591/\032:wY\026$(\"A\024\002\013)\fg/\031=\n\005%\022#A\005%uiB\034VM\035<mKR\024V-];fgRDQaK\013A\0021\n\001B]3ta>t7/\032\t\003C5J!A\f\022\003'!#H\017]*feZdW\r\036*fgB|gn]3)\tU\001TH\020\t\003cmj\021A\r\006\003gQ\n!\"\0318o_R\fG/[8o\025\t)d'\001\003cS:$'BA\0078\025\tA\024(A\btaJLgn\0324sC6,wo\034:l\025\005Q\024aA8sO&\021AH\r\002\017%\026\fX/Z:u\033\006\004\b/\0338h\003\0251\030\r\\;fY\005y\024%\001!\002\r=bwnZ5o\021\025\021\005\001\"\001D\003)\031\007.Z2l)>\\WM\034\013\0041\021+\005\"B\020B\001\004\001\003\"B\026B\001\004a\003\006B!1{\035c\023\001S\021\002\023\006Yqf\0315fG.$vn[3o\021\025Y\005\001\"\001M\003I)\b\017Z1uK\016+g\016^3s!2\f\0270\032:\025\007aie\nC\003 \025\002\007\001\005C\003,\025\002\007A\006\013\003Kau\002F&A)\"\003I\0131cL;qI\006$XmQ3oi\026\024\b\013\\1zKJDQ\001\026\001\005\002U\013\021CY;jY\022\034UM\034;feBc\027-_3s)\rAbk\026\005\006?M\003\r\001\t\005\006WM\003\r\001\f\025\005'Bj\024\fL\001[C\005Y\026AE\030ck&dGmQ3oi\026\024\b\013\\1zKJDQ!\030\001\005\002y\013\021\002^3ti~\033w\016Z3\025\007ay\006\rC\003 9\002\007\001\005C\003,9\002\007A\006\013\003]au\022G&A2\"\003\021\f!b\f;fgR|6m\0343f\021\0251\007\001\"\001h\003\0219\027N\032;\025\007aA\027\016C\003 K\002\007\001\005C\003,K\002\007A\006\013\003fauZG&\0017\"\0035\fQaL4jMRDC\001\001\031>_2\n\001/I\001r\003\025ySo]3sQ\t\0011\017\005\002uo6\tQO\003\002wo\005Q1\017^3sK>$\030\020]3\n\005a,(AC\"p]R\024x\016\0347fe\002")
/*     */ public class UserController
/*     */   extends AbstractController
/*     */ {
/*     */   @RequestMapping({"/login"})
/*     */   public void login(HttpServletRequest request, HttpServletResponse response) {
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
/*     */     //   38: ldc 'sid'
/*     */     //   40: ldc ''
/*     */     //   42: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   45: astore_3
/*     */     //   46: aload_1
/*     */     //   47: ldc 'uid'
/*     */     //   49: ldc ''
/*     */     //   51: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   54: astore #4
/*     */     //   56: aload_1
/*     */     //   57: ldc 'sdkun'
/*     */     //   59: ldc ''
/*     */     //   61: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   64: astore #5
/*     */     //   66: aload_1
/*     */     //   67: ldc 'game'
/*     */     //   69: ldc ''
/*     */     //   71: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   74: astore #6
/*     */     //   76: aload_1
/*     */     //   77: ldc 'un'
/*     */     //   79: ldc ''
/*     */     //   81: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   84: astore #7
/*     */     //   86: aload_1
/*     */     //   87: ldc 'pw'
/*     */     //   89: ldc ''
/*     */     //   91: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   94: astore #8
/*     */     //   96: aload_1
/*     */     //   97: ldc 'pf'
/*     */     //   99: invokestatic getIntParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;)Ljava/lang/Integer;
/*     */     //   102: astore #9
/*     */     //   104: aload_0
/*     */     //   105: aload_1
/*     */     //   106: invokevirtual getRemoteIp : (Ljavax/servlet/http/HttpServletRequest;)Ljava/lang/String;
/*     */     //   109: astore #10
/*     */     //   111: aload_1
/*     */     //   112: ldc 'device_model'
/*     */     //   114: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   117: astore #11
/*     */     //   119: aload_1
/*     */     //   120: ldc 'os_name'
/*     */     //   122: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   125: astore #12
/*     */     //   127: aload_1
/*     */     //   128: ldc 'os_ver'
/*     */     //   130: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   133: astore #13
/*     */     //   135: aload_1
/*     */     //   136: ldc 'mac_addr'
/*     */     //   138: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   141: astore #14
/*     */     //   143: aload_1
/*     */     //   144: ldc 'udid'
/*     */     //   146: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   149: astore #15
/*     */     //   151: aload_1
/*     */     //   152: ldc 'app_ver'
/*     */     //   154: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   157: astore #16
/*     */     //   159: aload_1
/*     */     //   160: ldc 'network'
/*     */     //   162: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   165: astore #17
/*     */     //   167: aload_1
/*     */     //   168: ldc 'platform_tag'
/*     */     //   170: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   173: astore #18
/*     */     //   175: aload_1
/*     */     //   176: ldc 'group_id'
/*     */     //   178: iconst_2
/*     */     //   179: invokestatic getIntParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;I)I
/*     */     //   182: istore #19
/*     */     //   184: aload_1
/*     */     //   185: ldc 'channel_id'
/*     */     //   187: iconst_0
/*     */     //   188: invokestatic getIntParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;I)I
/*     */     //   191: istore #20
/*     */     //   193: getstatic com/nirvana/xml/ChannelConfig$.MODULE$ : Lcom/nirvana/xml/ChannelConfig$;
/*     */     //   196: iload #20
/*     */     //   198: invokevirtual getAppChannel : (I)Ljava/lang/String;
/*     */     //   201: astore #21
/*     */     //   203: aload_1
/*     */     //   204: ldc 'code'
/*     */     //   206: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   209: astore #22
/*     */     //   211: aload_1
/*     */     //   212: ldc 'sign'
/*     */     //   214: invokestatic getStringParameter : (Ljavax/servlet/ServletRequest;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   217: astore #23
/*     */     //   219: aload #23
/*     */     //   221: getstatic com/nirvana/util/SignUtils$.MODULE$ : Lcom/nirvana/util/SignUtils$;
/*     */     //   224: new scala/collection/mutable/StringBuilder
/*     */     //   227: dup
/*     */     //   228: invokespecial <init> : ()V
/*     */     //   231: aload_3
/*     */     //   232: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   235: aload #7
/*     */     //   237: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   240: aload #8
/*     */     //   242: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   245: aload #9
/*     */     //   247: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   250: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   253: invokevirtual makeClientSign : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   256: astore #24
/*     */     //   258: dup
/*     */     //   259: ifnonnull -> 271
/*     */     //   262: pop
/*     */     //   263: aload #24
/*     */     //   265: ifnull -> 279
/*     */     //   268: goto -> 780
/*     */     //   271: aload #24
/*     */     //   273: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   276: ifeq -> 780
/*     */     //   279: aconst_null
/*     */     //   280: astore #25
/*     */     //   282: getstatic com/nirvana/platform/UserPlatformType$.MODULE$ : Lcom/nirvana/platform/UserPlatformType$;
/*     */     //   285: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   288: aload #9
/*     */     //   290: invokevirtual Integer2int : (Ljava/lang/Integer;)I
/*     */     //   293: invokevirtual apply : (I)Lscala/Enumeration$Value;
/*     */     //   296: astore #26
/*     */     //   298: aload #26
/*     */     //   300: astore #27
/*     */     //   302: getstatic com/nirvana/platform/UserPlatformType$.MODULE$ : Lcom/nirvana/platform/UserPlatformType$;
/*     */     //   305: invokevirtual DEFAULT : ()Lscala/Enumeration$Value;
/*     */     //   308: aload #27
/*     */     //   310: astore #28
/*     */     //   312: dup
/*     */     //   313: ifnonnull -> 325
/*     */     //   316: pop
/*     */     //   317: aload #28
/*     */     //   319: ifnull -> 333
/*     */     //   322: goto -> 361
/*     */     //   325: aload #28
/*     */     //   327: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   330: ifeq -> 361
/*     */     //   333: getstatic com/nirvana/platform/DefaultApi$.MODULE$ : Lcom/nirvana/platform/DefaultApi$;
/*     */     //   336: aload #7
/*     */     //   338: aload #8
/*     */     //   340: iload #20
/*     */     //   342: aload #15
/*     */     //   344: aload #14
/*     */     //   346: aload #10
/*     */     //   348: invokevirtual checkUser : (Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/nirvana/core/MapBean;
/*     */     //   351: astore #25
/*     */     //   353: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   356: astore #29
/*     */     //   358: goto -> 532
/*     */     //   361: getstatic com/nirvana/platform/UserPlatformType$.MODULE$ : Lcom/nirvana/platform/UserPlatformType$;
/*     */     //   364: invokevirtual AOFEI : ()Lscala/Enumeration$Value;
/*     */     //   367: aload #27
/*     */     //   369: astore #30
/*     */     //   371: dup
/*     */     //   372: ifnonnull -> 384
/*     */     //   375: pop
/*     */     //   376: aload #30
/*     */     //   378: ifnull -> 392
/*     */     //   381: goto -> 419
/*     */     //   384: aload #30
/*     */     //   386: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   389: ifeq -> 419
/*     */     //   392: getstatic com/nirvana/platform/AoFeiApi$.MODULE$ : Lcom/nirvana/platform/AoFeiApi$;
/*     */     //   395: aload_3
/*     */     //   396: iload #20
/*     */     //   398: aload #15
/*     */     //   400: aload #14
/*     */     //   402: aload #10
/*     */     //   404: aload #22
/*     */     //   406: invokevirtual checkUser : (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/nirvana/core/MapBean;
/*     */     //   409: astore #25
/*     */     //   411: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   414: astore #29
/*     */     //   416: goto -> 532
/*     */     //   419: getstatic com/nirvana/platform/UserPlatformType$.MODULE$ : Lcom/nirvana/platform/UserPlatformType$;
/*     */     //   422: invokevirtual AOFEI_IOS : ()Lscala/Enumeration$Value;
/*     */     //   425: aload #27
/*     */     //   427: astore #31
/*     */     //   429: dup
/*     */     //   430: ifnonnull -> 442
/*     */     //   433: pop
/*     */     //   434: aload #31
/*     */     //   436: ifnull -> 450
/*     */     //   439: goto -> 479
/*     */     //   442: aload #31
/*     */     //   444: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   447: ifeq -> 479
/*     */     //   450: getstatic com/nirvana/platform/AoFeiIOSApi$.MODULE$ : Lcom/nirvana/platform/AoFeiIOSApi$;
/*     */     //   453: aload #4
/*     */     //   455: aload_3
/*     */     //   456: iload #20
/*     */     //   458: aload #15
/*     */     //   460: aload #14
/*     */     //   462: aload #10
/*     */     //   464: aload #22
/*     */     //   466: invokevirtual checkUser : (Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/nirvana/core/MapBean;
/*     */     //   469: astore #25
/*     */     //   471: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   474: astore #29
/*     */     //   476: goto -> 532
/*     */     //   479: getstatic com/nirvana/platform/UserPlatformType$.MODULE$ : Lcom/nirvana/platform/UserPlatformType$;
/*     */     //   482: invokevirtual NOX : ()Lscala/Enumeration$Value;
/*     */     //   485: aload #27
/*     */     //   487: astore #32
/*     */     //   489: dup
/*     */     //   490: ifnonnull -> 502
/*     */     //   493: pop
/*     */     //   494: aload #32
/*     */     //   496: ifnull -> 510
/*     */     //   499: goto -> 772
/*     */     //   502: aload #32
/*     */     //   504: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   507: ifeq -> 772
/*     */     //   510: getstatic com/nirvana/platform/NoxApi$.MODULE$ : Lcom/nirvana/platform/NoxApi$;
/*     */     //   513: aload_3
/*     */     //   514: iload #20
/*     */     //   516: aload #15
/*     */     //   518: aload #14
/*     */     //   520: aload #10
/*     */     //   522: invokevirtual checkUser : (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/nirvana/core/MapBean;
/*     */     //   525: astore #25
/*     */     //   527: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   530: astore #29
/*     */     //   532: aload #25
/*     */     //   534: ldc 'username'
/*     */     //   536: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   539: astore #33
/*     */     //   541: getstatic com/nirvana/cache/MasterCache$.MODULE$ : Lcom/nirvana/cache/MasterCache$;
/*     */     //   544: aload #33
/*     */     //   546: invokevirtual getTokenByUsername : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   549: astore #34
/*     */     //   551: getstatic com/nirvana/service/PlayerService$.MODULE$ : Lcom/nirvana/service/PlayerService$;
/*     */     //   554: aload #33
/*     */     //   556: invokevirtual getCenterPlayerByUsername : (Ljava/lang/String;)Lscala/collection/immutable/List;
/*     */     //   559: astore #35
/*     */     //   561: getstatic com/nirvana/aofei/AoFeiMasterLog$.MODULE$ : Lcom/nirvana/aofei/AoFeiMasterLog$;
/*     */     //   564: aload #10
/*     */     //   566: aload #11
/*     */     //   568: aload #12
/*     */     //   570: aload #13
/*     */     //   572: aload #14
/*     */     //   574: aload #15
/*     */     //   576: aload #21
/*     */     //   578: aload #16
/*     */     //   580: aload #17
/*     */     //   582: aload #18
/*     */     //   584: iload #19
/*     */     //   586: iload #20
/*     */     //   588: aload #33
/*     */     //   590: invokevirtual logIdentification : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V
/*     */     //   593: getstatic com/nirvana/service/NoticeService$.MODULE$ : Lcom/nirvana/service/NoticeService$;
/*     */     //   596: iload #20
/*     */     //   598: invokevirtual getNoticeUpdateByChannelId : (I)Lcom/nirvana/core/MapBean;
/*     */     //   601: astore #36
/*     */     //   603: aload #36
/*     */     //   605: ifnonnull -> 613
/*     */     //   608: ldc ''
/*     */     //   610: goto -> 620
/*     */     //   613: aload #36
/*     */     //   615: ldc 'content'
/*     */     //   617: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   620: astore #37
/*     */     //   622: aload #36
/*     */     //   624: ifnonnull -> 632
/*     */     //   627: ldc ''
/*     */     //   629: goto -> 639
/*     */     //   632: aload #36
/*     */     //   634: ldc 'bug'
/*     */     //   636: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   639: astore #38
/*     */     //   641: getstatic com/nirvana/core/MapBean$.MODULE$ : Lcom/nirvana/core/MapBean$;
/*     */     //   644: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   647: iconst_2
/*     */     //   648: anewarray scala/Tuple2
/*     */     //   651: dup
/*     */     //   652: iconst_0
/*     */     //   653: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   656: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   659: ldc_w 'token'
/*     */     //   662: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   665: aload #34
/*     */     //   667: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   670: aastore
/*     */     //   671: dup
/*     */     //   672: iconst_1
/*     */     //   673: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   676: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   679: ldc_w 'l'
/*     */     //   682: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   685: aload #35
/*     */     //   687: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   690: aastore
/*     */     //   691: checkcast [Ljava/lang/Object;
/*     */     //   694: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   697: invokevirtual apply : (Lscala/collection/Seq;)Lcom/nirvana/core/MapBean;
/*     */     //   700: astore #39
/*     */     //   702: aload #37
/*     */     //   704: invokestatic isNotBlank : (Ljava/lang/String;)Z
/*     */     //   707: ifeq -> 758
/*     */     //   710: aload #39
/*     */     //   712: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   715: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   718: ldc_w 'notice'
/*     */     //   721: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   724: aload #37
/*     */     //   726: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   729: invokevirtual $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/HashMap;
/*     */     //   732: pop
/*     */     //   733: aload #39
/*     */     //   735: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   738: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   741: ldc_w 'bug_notice'
/*     */     //   744: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   747: aload #38
/*     */     //   749: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   752: invokevirtual $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/HashMap;
/*     */     //   755: goto -> 761
/*     */     //   758: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   761: pop
/*     */     //   762: getstatic com/nirvana/web/ResponseUtil$.MODULE$ : Lcom/nirvana/web/ResponseUtil$;
/*     */     //   765: aload_2
/*     */     //   766: aload #39
/*     */     //   768: invokevirtual responseJson : (Ljavax/servlet/http/HttpServletResponse;Lcom/nirvana/core/MapBean;)V
/*     */     //   771: return
/*     */     //   772: new java/lang/IllegalArgumentException
/*     */     //   775: dup
/*     */     //   776: invokespecial <init> : ()V
/*     */     //   779: athrow
/*     */     //   780: aload_0
/*     */     //   781: invokevirtual webLogger : ()Lorg/slf4j/Logger;
/*     */     //   784: ldc_w '校验失败:{},{},{}'
/*     */     //   787: iconst_3
/*     */     //   788: anewarray java/lang/Object
/*     */     //   791: dup
/*     */     //   792: iconst_0
/*     */     //   793: aload_1
/*     */     //   794: aastore
/*     */     //   795: dup
/*     */     //   796: iconst_1
/*     */     //   797: aload_1
/*     */     //   798: invokeinterface getParameterMap : ()Ljava/util/Map;
/*     */     //   803: aastore
/*     */     //   804: dup
/*     */     //   805: iconst_2
/*     */     //   806: aload_1
/*     */     //   807: invokeinterface getQueryString : ()Ljava/lang/String;
/*     */     //   812: aastore
/*     */     //   813: invokeinterface error : (Ljava/lang/String;[Ljava/lang/Object;)V
/*     */     //   818: new com/nirvana/exception/BusinessException
/*     */     //   821: dup
/*     */     //   822: getstatic com/nirvana/util/MessageI18n$.MODULE$ : Lcom/nirvana/util/MessageI18n$;
/*     */     //   825: ldc_w 'UserController_1'
/*     */     //   828: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   831: getstatic com/nirvana/exception/BusinessException$.MODULE$ : Lcom/nirvana/exception/BusinessException$;
/*     */     //   834: invokevirtual $lessinit$greater$default$2 : ()Lscala/Enumeration$Value;
/*     */     //   837: invokespecial <init> : (Ljava/lang/String;Lscala/Enumeration$Value;)V
/*     */     //   840: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #26	-> 0
/*     */     //   #27	-> 37
/*     */     //   #28	-> 46
/*     */     //   #29	-> 56
/*     */     //   #30	-> 66
/*     */     //   #32	-> 76
/*     */     //   #33	-> 86
/*     */     //   #34	-> 96
/*     */     //   #36	-> 104
/*     */     //   #37	-> 111
/*     */     //   #38	-> 119
/*     */     //   #39	-> 127
/*     */     //   #40	-> 135
/*     */     //   #41	-> 143
/*     */     //   #43	-> 151
/*     */     //   #44	-> 159
/*     */     //   #45	-> 167
/*     */     //   #46	-> 175
/*     */     //   #47	-> 184
/*     */     //   #48	-> 193
/*     */     //   #50	-> 203
/*     */     //   #52	-> 211
/*     */     //   #53	-> 219
/*     */     //   #57	-> 279
/*     */     //   #58	-> 282
/*     */     //   #59	-> 298
/*     */     //   #60	-> 302
/*     */     //   #61	-> 361
/*     */     //   #62	-> 419
/*     */     //   #63	-> 479
/*     */     //   #66	-> 532
/*     */     //   #67	-> 541
/*     */     //   #69	-> 551
/*     */     //   #70	-> 561
/*     */     //   #71	-> 593
/*     */     //   #72	-> 603
/*     */     //   #73	-> 622
/*     */     //   #74	-> 641
/*     */     //   #75	-> 702
/*     */     //   #76	-> 710
/*     */     //   #77	-> 733
/*     */     //   #75	-> 758
/*     */     //   #79	-> 762
/*     */     //   #25	-> 771
/*     */     //   #64	-> 772
/*     */     //   #54	-> 780
/*     */     //   #55	-> 818
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	841	0	this	Lcom/nirvana/action/UserController;
/*     */     //   0	841	1	request	Ljavax/servlet/http/HttpServletRequest;
/*     */     //   0	841	2	response	Ljavax/servlet/http/HttpServletResponse;
/*     */     //   46	795	3	sessionId	Ljava/lang/String;
/*     */     //   56	785	4	uid	Ljava/lang/String;
/*     */     //   66	775	5	sdkUsername	Ljava/lang/String;
/*     */     //   76	765	6	game	Ljava/lang/String;
/*     */     //   86	755	7	un	Ljava/lang/String;
/*     */     //   96	745	8	password	Ljava/lang/String;
/*     */     //   104	737	9	pf	Ljava/lang/Integer;
/*     */     //   111	730	10	ip	Ljava/lang/String;
/*     */     //   119	722	11	device_model	Ljava/lang/String;
/*     */     //   127	714	12	os_name	Ljava/lang/String;
/*     */     //   135	706	13	os_ver	Ljava/lang/String;
/*     */     //   143	698	14	mac_addr	Ljava/lang/String;
/*     */     //   151	690	15	udid	Ljava/lang/String;
/*     */     //   159	682	16	app_ver	Ljava/lang/String;
/*     */     //   167	674	17	network	Ljava/lang/String;
/*     */     //   175	666	18	platform_tag	Ljava/lang/String;
/*     */     //   184	657	19	group_id	I
/*     */     //   193	648	20	channel_id	I
/*     */     //   203	638	21	app_channel	Ljava/lang/String;
/*     */     //   211	630	22	testCode	Ljava/lang/String;
/*     */     //   219	622	23	sign	Ljava/lang/String;
/*     */     //   282	489	25	user	Lcom/nirvana/core/MapBean;
/*     */     //   298	473	26	platformType	Lscala/Enumeration$Value;
/*     */     //   541	230	33	username	Ljava/lang/String;
/*     */     //   551	220	34	token	Ljava/lang/String;
/*     */     //   561	210	35	list	Lscala/collection/immutable/List;
/*     */     //   603	168	36	noticeBean	Lcom/nirvana/core/MapBean;
/*     */     //   622	149	37	notice	Ljava/lang/String;
/*     */     //   641	130	38	bug	Ljava/lang/String;
/*     */     //   702	69	39	ret	Lcom/nirvana/core/MapBean;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/checkToken"})
/*     */   public void checkToken(HttpServletRequest request, HttpServletResponse response) {
/*  85 */     String token = ServletRequestUtils.getStringParameter((ServletRequest)request, "token");
/*     */     
/*  87 */     if (StringUtils.isBlank(token)) throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_2"), BusinessException$.MODULE$.$lessinit$greater$default$2()); 
/*  88 */     String sign = ServletRequestUtils.getStringParameter((ServletRequest)request, "sign");
/*  89 */     String str1 = SignUtils$.MODULE$.makeSign(token); if (sign == null) { if (str1 != null)
/*  90 */       { webLogger().error("校验失败:{},{},{}", new Object[] { request, request.getParameterMap(), request.getQueryString() });
/*  91 */         throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_1"), BusinessException$.MODULE$.$lessinit$greater$default$2()); }  } else if (!sign.equals(str1)) { webLogger().error("校验失败:{},{},{}", new Object[] { request, request.getParameterMap(), request.getQueryString() }); throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_1"), BusinessException$.MODULE$.$lessinit$greater$default$2()); }
/*     */     
/*  93 */     MapBean user = MasterCache$.MODULE$.getCenterUserByToken(token);
/*  94 */     if (user == null) {
/*  95 */       throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_2"), BusinessException$.MODULE$.$lessinit$greater$default$2());
/*     */     }
/*  97 */     ResponseUtil$.MODULE$.responseJson(response, user);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"/updateCenterPlayer"})
/*     */   public void updateCenterPlayer(HttpServletRequest request, HttpServletResponse response) {
/* 104 */     MapBean params = getRequestJson(request);
/*     */     
/* 106 */     String sign = params.getString("sign");
/* 107 */     String playerId = params.getString("player_id");
/* 108 */     int level = params.getInt("level");
/* 109 */     String str1 = SignUtils$.MODULE$.makeSign((new StringBuilder()).append(playerId).append(BoxesRunTime.boxToInteger(level)).toString()); if (sign == null) { if (str1 != null) {
/* 110 */         webLogger().error("校验失败:{},{},{}", new Object[] { request, params, sign });
/* 111 */         (new scala.Tuple2[1])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("resultCode"), BoxesRunTime.boxToInteger(0)); ResponseUtil$.MODULE$.responseJson(response, MapBean$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[1])));
/*     */       }  }
/* 113 */     else { if (sign.equals(str1)) { String username = params.getString("username");
/* 114 */         int serverId = params.getInt("server_id");
/* 115 */         String name = params.getString("name");
/* 116 */         int kind = params.getInt("kind");
/* 117 */         int sex = params.getInt("sex");
/* 118 */         PlayerService$.MODULE$.updateCenterPlayer(playerId, username, serverId, name, kind, sex, level);
/* 119 */         (new scala.Tuple2[1])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("resultCode"), BoxesRunTime.boxToInteger(1)); ResponseUtil$.MODULE$.responseJson(response, MapBean$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[1]))); return; }  webLogger().error("校验失败:{},{},{}", new Object[] { request, params, sign }); (new scala.Tuple2[1])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("resultCode"), BoxesRunTime.boxToInteger(0)); ResponseUtil$.MODULE$.responseJson(response, MapBean$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[1]))); }  String str2 = params.getString("username"); int i = params.getInt("server_id"); String str3 = params.getString("name"); int j = params.getInt("kind"); int k = params.getInt("sex"); PlayerService$.MODULE$.updateCenterPlayer(playerId, str2, i, str3, j, k, level); (new scala.Tuple2[1])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("resultCode"), BoxesRunTime.boxToInteger(1)); ResponseUtil$.MODULE$.responseJson(response, MapBean$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[1])));
/*     */   }
/*     */ 
/*     */   
/*     */   @RequestMapping({"/buildCenterPlayer"})
/*     */   public void buildCenterPlayer(HttpServletRequest request, HttpServletResponse response) {
/* 125 */     MapBean params = getRequestJson(request);
/*     */     
/* 127 */     String sign = params.getString("sign");
/* 128 */     String username = params.getString("username");
/* 129 */     String str1 = SignUtils$.MODULE$.makeSign(username); if (sign == null) { if (str1 != null)
/* 130 */       { webLogger().error("校验失败:{},{},{}", new Object[] { request, params, sign });
/* 131 */         throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_1"), BusinessException$.MODULE$.$lessinit$greater$default$2()); }  } else if (!sign.equals(str1)) { webLogger().error("校验失败:{},{},{}", new Object[] { request, params, sign }); throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_1"), BusinessException$.MODULE$.$lessinit$greater$default$2()); }
/*     */     
/* 133 */     String playerId = SequenceService$.MODULE$.askForNewPlayerId();
/* 134 */     int serverId = params.getInt("server_id");
/* 135 */     String name = params.getString("name");
/* 136 */     int kind = params.getInt("kind");
/* 137 */     int sex = params.getInt("sex");
/* 138 */     PlayerService$.MODULE$.updateCenterPlayer(playerId, username, serverId, name, kind, sex, 1);
/* 139 */     (new scala.Tuple2[1])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("id"), playerId); ResponseUtil$.MODULE$.responseJson(response, MapBean$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[1])));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"/test_code"})
/*     */   public void test_code(HttpServletRequest request, HttpServletResponse response) {
/* 146 */     webLogger().warn("{},{},{}", new Object[] { request, request.getParameterMap(), request.getQueryString() });
/* 147 */     String username = ServletRequestUtils.getStringParameter((ServletRequest)request, "username", "");
/*     */     
/* 149 */     String sign = ServletRequestUtils.getStringParameter((ServletRequest)request, "sign");
/* 150 */     String str1 = SignUtils$.MODULE$.makeClientSign(username); if (sign == null) { if (str1 != null)
/* 151 */       { webLogger().error("校验失败:{},{},{}", new Object[] { request, request.getParameterMap(), request.getQueryString() });
/* 152 */         throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_1"), BusinessException$.MODULE$.$lessinit$greater$default$2()); }  } else if (!sign.equals(str1)) { webLogger().error("校验失败:{},{},{}", new Object[] { request, request.getParameterMap(), request.getQueryString() }); throw new BusinessException(MessageI18n$.MODULE$.getString("UserController_1"), BusinessException$.MODULE$.$lessinit$greater$default$2()); }
/*     */     
/* 154 */     if (ServerConfig$.MODULE$.needTestCode()) {
/* 155 */       if (StringUtils.isBlank(username)) throw new BusinessException("账号不能为空", BusinessException$.MODULE$.$lessinit$greater$default$2()); 
/* 156 */       MapBean code = UserService$.MODULE$.getTestCodeByUsername(username);
/* 157 */       int need = (code == null) ? 1 : 0;
/* 158 */       (new scala.Tuple2[1])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("need"), BoxesRunTime.boxToInteger(need)); ResponseUtil$.MODULE$.responseJson(response, MapBean$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[1])));
/*     */     } else {
/* 160 */       (new scala.Tuple2[1])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("need"), BoxesRunTime.boxToInteger(0)); ResponseUtil$.MODULE$.responseJson(response, MapBean$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[1])));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @RequestMapping({"/gift"})
/*     */   public void gift(HttpServletRequest request, HttpServletResponse response) {
/* 167 */     MapBean params = getRequestJson(request);
/*     */     
/* 169 */     String sign = params.getString("sign");
/* 170 */     String code = params.getString("code");
/* 171 */     String str1 = SignUtils$.MODULE$.makeSign(code); if (sign == null) { if (str1 != null)
/*     */       
/* 173 */       { webLogger().error("校验失败:{},{},{}", new Object[] { request, params, sign });
/* 174 */         throw new BusinessException(MessageI18n$.MODULE$.getString("Command11_2"), BusinessException$.MODULE$.$lessinit$greater$default$2()); }  } else if (!sign.equals(str1)) { webLogger().error("校验失败:{},{},{}", new Object[] { request, params, sign }); throw new BusinessException(MessageI18n$.MODULE$.getString("Command11_2"), BusinessException$.MODULE$.$lessinit$greater$default$2()); }
/*     */ 
/*     */     
/* 177 */     String playerId = params.getString("player_id");
/* 178 */     String username = params.getString("username");
/* 179 */     int serverId = params.getInt("server_id");
/* 180 */     MapBean giftCode = GiftPackageService$.MODULE$.getGiftCode(code);
/* 181 */     int gift_type = 0;
/* 182 */     if (giftCode == null)
/*     */     
/*     */     { 
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
/* 227 */       gift_type = -1; } else { int giftId = giftCode.getInt("gift_id"); MapBean gift = GiftPackageService$.MODULE$.getGiftPackage(giftId); MapBean giftConvert = GiftPackageService$.MODULE$.getGiftConvert(playerId, code); if (giftConvert == null) { SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); String start_time = df.format(gift.getUtilDate("start_time")); String end_time = df.format(gift.getUtilDate("end_time")); int numbers = gift.getInt("numbers"); int gift_status = gift.getInt("gift_status"); if (Tool$.MODULE$.checkTime(System.currentTimeMillis(), start_time, end_time) && gift_status != 0) { List convertList = GiftPackageService$.MODULE$.getGiftConvertByCodeId(code, giftId); if (numbers == 2 && !convertList.isEmpty()) { gift_type = 0; } else { List giftConverts = GiftPackageService$.MODULE$.getGiftConvertByPlayerId(playerId, giftId); if (giftConverts.isEmpty()) { MapBean user = MasterCache$.MODULE$.getCenterUserByUsername(username); int channel_id = user.getInt("channel_id"); String[] channel_ids = gift.getString("channel_ids").split(","); if (Predef$.MODULE$.refArrayOps((Object[])channel_ids).contains(BoxesRunTime.boxToInteger(channel_id).toString())) { GiftPackageService$.MODULE$.addGiftConvert(playerId, giftId, serverId, code); GiftPackageService$.MODULE$.updateGiftNumbers(code); gift_type = gift.getInt("gift_type"); } else { gift_type = -1; }  } else { gift_type = -2; }  }  } else { gift_type = -1; }  } else { gift_type = 0; }
/*     */        }
/* 229 */      (new scala.Tuple2[1])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("gift_id"), BoxesRunTime.boxToInteger(gift_type)); ResponseUtil$.MODULE$.responseJson(response, MapBean$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[1])));
/*     */   }
/*     */ }


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\action\UserController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */