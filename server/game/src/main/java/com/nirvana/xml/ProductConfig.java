package com.nirvana.xml;

import com.nirvana.bean.BaseAttr;
import com.nirvana.bean.GiveItem;
import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import java.io.BufferedInputStream;
import scala.Function0;
import scala.Tuple2;
import scala.collection.immutable.List;
import scala.collection.mutable.ListBuffer;
import scala.collection.mutable.Map;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\r-x!B\001\003\021\003I\021!\004)s_\022,8\r^\"p]\032LwM\003\002\004\t\005\031\0010\0347\013\005\0251\021a\0028jeZ\fg.\031\006\002\017\005\0311m\\7\004\001A\021!bC\007\002\005\031)AB\001E\001\033\ti\001K]8ek\016$8i\0348gS\036\0342a\003\b\025!\ty!#D\001\021\025\005\t\022!B:dC2\f\027BA\n\021\005\031\te.\037*fMB\021!\"F\005\003-\t\021\021\002W7m\007>tg-[4\t\013aYA\021A\r\002\rqJg.\033;?)\005I\001bB\016\f\005\004%)\001H\001\013\0136\003F+W0B)R\023V#A\017\021\005y\tS\"A\020\013\005\001\"\021\001\0022fC:L!AI\020\003\021\t\0137/Z!uiJDa\001J\006!\002\033i\022aC#N!RKv,\021+U%\002BqAJ\006A\002\023%q%\001\005qe>$Wo\031;t+\005A\003\003B\025/aMj\021A\013\006\003W1\nq!\\;uC\ndWM\003\002.!\005Q1m\0347mK\016$\030n\0348\n\005=R#aA'baB\021q\"M\005\003eA\0211!\0238u!\tQA'\003\0026\005\t9\001K]8ek\016$\bbB\034\f\001\004%I\001O\001\raJ|G-^2ug~#S-\035\013\003sq\002\"a\004\036\n\005m\002\"\001B+oSRDq!\020\034\002\002\003\007\001&A\002yIEBaaP\006!B\023A\023!\0039s_\022,8\r^:!\021\035\t5\0021A\005\n\t\013a!Z9vSB\034X#A\"\021\t%rC)\b\t\005\037\025\003\004'\003\002G!\t1A+\0369mKJBq\001S\006A\002\023%\021*\001\006fcVL\007o]0%KF$\"!\017&\t\017u:\025\021!a\001\007\"1Aj\003Q!\n\r\013q!Z9vSB\034\b\005C\004O\027\001\007I\021B(\002\027M$(/\0328hi\",\005\020]\013\002!B!\021F\f#1\021\035\0216\0021A\005\nM\013qb\035;sK:<G\017[#ya~#S-\035\013\003sQCq!P)\002\002\003\007\001\013\003\004W\027\001\006K\001U\001\rgR\024XM\\4uQ\026C\b\017\t\005\b1.\001\r\021\"\003Z\003I)\027/^5q[\026tGo\025;s_:<W*\0319\026\003i\003B!\013\030E7B\021!\002X\005\003;\n\021!#R9vSBlWM\034;TiJ|gn\032#fM\"9ql\003a\001\n\023\001\027AF3rk&\004X.\0328u'R\024xN\\4NCB|F%Z9\025\005e\n\007bB\037_\003\003\005\rA\027\005\007G.\001\013\025\002.\002'\025\fX/\0339nK:$8\013\036:p]\036l\025\r\035\021\t\017\025\\\001\031!C\005M\0069R-];ja6,g\016^*ue>twMU1uS>l\025\r]\013\002OB!\021F\f#i!\tQ\021.\003\002k\005\t9R)];ja6,g\016^*ue>twMU1uS>$UM\032\005\bY.\001\r\021\"\003n\003m)\027/^5q[\026tGo\025;s_:<'+\031;j_6\013\007o\030\023fcR\021\021H\034\005\b{-\f\t\0211\001h\021\031\0018\002)Q\005O\006AR-];ja6,g\016^*ue>twMU1uS>l\025\r\035\021\t\017I\\\001\031!C\005M\006AR-];ja6,g\016\036)s_6|G/\032*bi&|W*\0319\t\017Q\\\001\031!C\005k\006aR-];ja6,g\016\036)s_6|G/\032*bi&|W*\0319`I\025\fHCA\035w\021\035i4/!AA\002\035Da\001_\006!B\0239\027!G3rk&\004X.\0328u!J|Wn\034;f%\006$\030n\\'ba\002BqA_\006A\002\023%10\001\nfcVL\007/\\3oiJ+g-\0338f\033\006\004X#\001?\021\013%rS0!\001\021\013=q\b\007\r\031\n\005}\004\"A\002+va2,7\007E\002\013\003\007I1!!\002\003\005I)\025/^5q[\026tGOU3gS:,G)\0324\t\023\005%1\0021A\005\n\005-\021AF3rk&\004X.\0328u%\0264\027N\\3NCB|F%Z9\025\007e\ni\001\003\005>\003\017\t\t\0211\001}\021\035\t\tb\003Q!\nq\f1#Z9vSBlWM\034;SK\032Lg.Z'ba\002B\021\"!\006\f\005\004%I!a\006\002\035\r|gn]5h]RK\b/Z'baV\021\021\021\004\t\006S9\"\0251\004\t\004\025\005u\021bAA\020\005\tq1i\0348tS\036tG+\0379f\t\0264\007\002CA\022\027\001\006I!!\007\002\037\r|gn]5h]RK\b/Z'ba\002B\021\"a\n\f\005\004%I!!\013\002\017MLwM\\'baV\021\0211\006\t\006S9\"\025Q\006\t\004\025\005=\022bAA\031\005\t91+[4o\t\0264\007\002CA\033\027\001\006I!a\013\002\021MLwM\\'ba\002B\021\"!\017\f\005\004%I!a\017\002\033MLwM\\#ya\026tG-T1q+\t\ti\004E\003*]A\ny\004E\002\013\003\003J1!a\021\003\0055\031\026n\0328FqB,g\016\032#fM\"A\021qI\006!\002\023\ti$\001\btS\036tW\t\0379f]\022l\025\r\035\021\t\023\005-3B1A\005\n\0055\023A\0034pe6,H.Y'baV\021\021q\n\t\006S9\002\024\021\013\t\004\025\005M\023bAA+\005\tQai\034:nk2\fG)\0324\t\021\005e3\002)A\005\003\037\n1BZ8s[Vd\027-T1qA!I\021QL\006A\002\023%\021qL\001\017aJ|Wn\034;f%\006$X-T1q+\t\t\t\007E\003*]A\n\031\007E\002\013\003KJ1!a\032\003\0059\001&o\\7pi\026\024\026\r^3EK\032D\021\"a\033\f\001\004%I!!\034\002%A\024x.\\8uKJ\013G/Z'ba~#S-\035\013\004s\005=\004\"C\037\002j\005\005\t\031AA1\021!\t\031h\003Q!\n\005\005\024a\0049s_6|G/\032*bi\026l\025\r\035\021\t\023\005]4\0021A\005\002\005e\024!\005)S\0376{E+R0N\003b{F*\022,F\031V\t\001\007C\005\002~-\001\r\021\"\001\002\000\005)\002KU(N\037R+u,T!Y?2+e+\022'`I\025\fHcA\035\002\002\"AQ(a\037\002\002\003\007\001\007C\004\002\006.\001\013\025\002\031\002%A\023v*T(U\013~k\025\tW0M\013Z+E\n\t\005\n\003\023[\001\031!C\005\003\027\013a\002\035:p[>$X\r\0257vg\006\023\0300\006\002\002\016B)q\"a$\002\024&\031\021\021\023\t\003\013\005\023(/Y=\021\007)\t)*C\002\002\030\n\021a\002\025:p[>$X\r\0257vg\022+g\rC\005\002\034.\001\r\021\"\003\002\036\006\021\002O]8n_R,\007\013\\;t\003JLx\fJ3r)\rI\024q\024\005\n{\005e\025\021!a\001\003\033C\001\"a)\fA\003&\021QR\001\020aJ|Wn\034;f!2,8/\021:zA!A\021qU\006A\002\023%!)\001\nqe>lw\016^3Q_NLG/[8o\033\006\004\b\"CAV\027\001\007I\021BAW\003Y\001(o\\7pi\026\004vn]5uS>tW*\0319`I\025\fHcA\035\0020\"AQ(!+\002\002\003\0071\tC\004\0024.\001\013\025B\"\002'A\024x.\\8uKB{7/\033;j_:l\025\r\035\021\t\023\005]6\0021A\005\n\005e\026aB:vSRl\025\r]\013\003\003w\003R!\013\030~\003{\0032ACA`\023\r\t\tM\001\002\b'VLG\017R3g\021%\t)m\003a\001\n\023\t9-A\006tk&$X*\0319`I\025\fHcA\035\002J\"IQ(a1\002\002\003\007\0211\030\005\t\003\033\\\001\025)\003\002<\006A1/^5u\033\006\004\b\005C\005\002R.\001\r\021\"\003\002T\006Y1/^5u'BLE-T1q+\t\t)\016\005\003*]A\002\004\"CAm\027\001\007I\021BAn\003=\031X/\033;Ta&#W*\0319`I\025\fHcA\035\002^\"IQ(a6\002\002\003\007\021Q\033\005\t\003C\\\001\025)\003\002V\006a1/^5u'BLE-T1qA!I\021Q]\006A\002\023%\021q]\001\rgVLG/\021;ue2K7\017^\013\003\003S\004b!a;\002r\006UXBAAw\025\r\ty\017L\001\nS6lW\017^1cY\026LA!a=\002n\n!A*[:u!\035y\021q\037\0311auI1!!?\021\005\031!V\017\0357fi!I\021Q`\006A\002\023%\021q`\001\021gVLG/\021;ue2K7\017^0%KF$2!\017B\001\021%i\0241`A\001\002\004\tI\017\003\005\003\006-\001\013\025BAu\0035\031X/\033;BiR\024H*[:uA!I!\021B\006A\002\023%!1B\001\tO\026lW\013]'baV\021!Q\002\t\006S9\002$q\002\t\004\025\tE\021b\001B\n\005\tAq)Z7Va\022+g\rC\005\003\030-\001\r\021\"\003\003\032\005aq-Z7Va6\013\007o\030\023fcR\031\021Ha\007\t\023u\022)\"!AA\002\t5\001\002\003B\020\027\001\006KA!\004\002\023\035,W.\0269NCB\004\003\"\003B\022\027\001\007I\021\002B\023\003-9W-\\\"pY>\024X*\0319\026\005\t\035\002#B\025/a\t%\002c\001\006\003,%\031!Q\006\002\003\027\035+WnQ8m_J$UM\032\005\n\005cY\001\031!C\005\005g\tqbZ3n\007>dwN]'ba~#S-\035\013\004s\tU\002\"C\037\0030\005\005\t\031\001B\024\021!\021Id\003Q!\n\t\035\022\001D4f[\016{Gn\034:NCB\004\003\"\003B\037\027\t\007I\021\tB \003\0211\027\016\\3\026\005\t\005\003\003\002B\"\005\033j!A!\022\013\t\t\035#\021J\001\005Y\006twM\003\002\003L\005!!.\031<b\023\021\021yE!\022\003\rM#(/\0338h\021!\021\031f\003Q\001\n\t\005\023!\0024jY\026\004\003b\002B,\027\021\005#\021L\001\005S:LG/F\001:\021\035\021if\003C\005\0053\n1\002\\8bIB\023x\016Z;di\"9!\021M\006\005\n\te\023\001\0037pC\022\fE\017\036:\t\017\t\0254\002\"\003\003Z\005yAn\\1e'R\024XM\\4uQ\026C\b\017C\004\003j-!\tAa\033\002#\035,Go\025;sK:<G\017[#ya6\013\007\017F\001Q\021\035\021yg\003C\005\0053\n!\002\\8bIJ+g-\0338f\021\035\021\031h\003C\005\005k\n1\003\\8bI\026\013X/\0339nK:$8\013\036:p]\036$\022!\017\005\b\005sZA\021\001B;\003aaw.\0313FcVL\007/\\3oiN#(o\0348h%\006$\030n\034\005\b\005{ZA\021\001B;\003eaw.\0313FcVL\007/\\3oiB\023x.\\8uKJ\013G/[8\t\017\t\0055\002\"\001\003v\005yAn\\1e\007>t7/[4o)f\004X\rC\004\003\006.!\tA!\036\002\0211|\027\rZ*jO:DqA!#\f\t\003\021)(\001\bm_\006$7+[4o\013b\004XM\0343\t\017\t55\002\"\001\003v\005YAn\\1e\r>\024X.\0367b\021\035\021\tj\003C\001\0053\n1\002\\8bIB\023x.\\8uK\"9!QS\006\005\n\te\023\001\0037pC\022\034V/\033;\t\017\te5\002\"\003\003v\005IAn\\1e\017\026lW\013\035\005\b\005;[A\021\002B;\003Eaw.\0313HK6Lg\016\\1z\007>dwN\035\005\b\005C[A\021\001BR\003-9W\r^$f[V\003H)\0324\025\t\t=!Q\025\005\b\005O\023y\n1\0011\003\025aWM^3m\021\035\021Yk\003C\001\005[\013\001cZ3u'f\034H/Z7Qe>$Wo\031;\025\007M\022y\013C\004\0032\n%\006\031\001\031\002\005%$\007b\002B[\027\021\005!qW\001\027O\026$8+_:uK6\004&o\0343vGR|%/\0227tKR\0311G!/\t\017\tE&1\027a\001a!9!QX\006\005\002\t}\026\001D4fi\026\013X/\0339BiR\024H#B\017\003B\n\025\007b\002Bb\005w\003\r\001M\001\005gBLE\rC\004\003(\nm\006\031\001\031\t\017\t%7\002\"\001\003L\006\tr-\032;Qe>$Wo\031;t\005f$\026\020]3\025\t\t5'1\035\t\006\005\037\024yn\r\b\005\005#\024YN\004\003\003T\neWB\001Bk\025\r\0219\016C\001\007yI|w\016\036 \n\003EI1A!8\021\003\035\001\030mY6bO\026LA!a=\003b*\031!Q\034\t\t\017\t\025(q\031a\001a\005Y\001O]8ek\016$H+\0379f\021\035\021Io\003C\001\005W\f\021cZ3u'R\024XM\\4uQ6\013\0070\022=q)\025\001$Q\036By\021\035\021yOa:A\002A\nAa[5oI\"9!1\037Bt\001\004\001\024a\0017fm\"9!q_\006\005\002\te\030!D4fiJ+g-\0338f\003R$(\017F\004\036\005w\024yp!\001\t\017\tu(Q\037a\001a\00511-\031:fKJDqAa<\003v\002\007\001\007C\004\004\004\tU\b\031\001\031\002\027I,g-\0338f\031\0264X\r\034\005\b\007\017YA\021AB\005\00359W\r\036$pe6,H.\031#fMR!\021\021KB\006\021\035\021\031m!\002A\002ABqaa\004\f\t\003\031\t\"\001\thKR\024VMZ5oK&#X-\034#fMRA\021\021AB\n\007+\0319\002C\004\003~\0165\001\031\001\031\t\017\t=8Q\002a\001a!911AB\007\001\004\001\004bBB\016\027\021\005\021\021P\001\022O\026$(+\0324j]\026l\025\r\037'fm\026d\007bBB\020\027\021\0051\021E\001\023O\026$X)];ja6,g\016^*ue>tw\rF\003\\\007G\031)\003C\004\003~\016u\001\031\001\031\t\017\t\0356Q\004a\001a!91\021F\006\005\002\r-\022aF4fi\026\013X/\0339nK:$8\013\036:p]\036\024\026\r^5p)\025A7QFB\031\021\035\031yca\nA\002A\nq!];bY&$\030\020C\004\003p\016\035\002\031\001\031\t\017\rU2\002\"\001\0048\005Ar-\032;FcVL\007/\\3oiB\023x.\\8uKJ\013G/[8\025\013!\034Ida\017\t\017\r=21\007a\001a!9!q^B\032\001\004\001\004bBB \027\021\0051\021I\001\013O\026$8+[4o\t\0264GCBA\027\007\007\0329\005C\004\004F\ru\002\031\001\031\002\033e,\027M]0pM~kwN\034;i\021\035\031Ie!\020A\002A\nA\"\\8oi\"|vNZ0eCfDqa!\024\f\t\003\031y%\001\thKR\034\026n\0328FqB,g\016\032#fMR!\021qHB)\021\035\021\tla\023A\002ABqa!\026\f\t\003\0319&A\thKR\034uN\\:jO:$\026\020]3EK\032$b!a\007\004Z\ru\003bBB.\007'\002\r\001M\001\002i\"91qLB*\001\004\001\024!A6\t\017\r\r4\002\"\001\004f\005)r-\032;BY2\034\006/\0233B]\022t\025-\\3J]\032|WCAB4!\031\021yMa8\004jA!11NB9\033\t\031iGC\002\004p\021\tAaY8sK&!11OB7\005\035i\025\r\035\"fC:Dqaa\036\f\t\003\tY)A\nhKR\004&o\\7pi\026\004F.^:BeJ\f\027\020C\004\004|-!\ta! \002#\035,G\017\025:p[>$X\r\0257vg\022+g\r\006\003\002\024\016}\004b\002BY\007s\002\r\001\r\005\b\007\007[A\021ABC\00399W\r\036)s_6|G/\032*bi\026$B!a\031\004\b\"9!qUBA\001\004\001\004bBBF\027\021\0051QR\001\031O\026$\bK]8n_R,'+\031;f\031V\0347.\037'j[&$Hc\001\031\004\020\"9!\021WBE\001\004\001\004bBBJ\027\021\0051QS\001\027O\026$\bK]8n_R,\007k\\:ji&|g.\021;ueR)Qda&\004\032\"9!Q`BI\001\004\001\004b\002BT\007#\003\r\001\r\005\b\007;[A\021ABP\003)9W\r^*vSR$UM\032\013\t\003{\033\tk!*\004*\"911UBN\001\004\001\024AB:vSRLE\rC\004\004(\016m\005\031\001\031\002\023M,\030\016\036'fm\026d\007b\002B\0077\003\r\001\r\005\b\007[[A\021ABX\00359W\r^!mYN+\030\016\036#fMV\0211\021\027\t\007\007g\023y.!0\017\007=\021Y\016C\004\0048.!\ta!/\002\037\035,GoU;ji&#')_*q\023\022$2\001MB^\021\035\021\031m!.A\002ABqaa0\f\t\003\031\t-A\006hKR\034V/\033;BiR\024HcB\017\004D\016\0257q\031\005\b\007G\033i\f1\0011\021\035\0319k!0A\002ABqa!3\004>\002\007\001'A\002tk6Dqa!4\f\t\003\031y-\001\bhKR<U-\\\"pY>\024H)\0324\025\t\t%2\021\033\005\b\005O\033Y\r1\0011\021\035\031)n\003C\001\007/\fA!\\1j]R\031\021h!7\t\021\rm71\033a\001\007;\fA!\031:hgB)q\"a$\004`B!1\021]Bt\035\ry11]\005\004\007K\004\022A\002)sK\022,g-\003\003\003P\r%(bABs!\001")
public final class ProductConfig {
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ProductConfig$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    ProductConfig$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return ProductConfig$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ProductConfig$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    ProductConfig$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return ProductConfig$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ProductConfig$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    ProductConfig$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return ProductConfig$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ProductConfig$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    ProductConfig$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return ProductConfig$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ProductConfig$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    ProductConfig$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return ProductConfig$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return ProductConfig$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return ProductConfig$.MODULE$.logger();
  }
  
  public static String strToArrayInt$default$2() {
    return ProductConfig$.MODULE$.strToArrayInt$default$2();
  }
  
  public static BaseAttr buildAttrFromMapBean(MapBean paramMapBean) {
    return ProductConfig$.MODULE$.buildAttrFromMapBean(paramMapBean);
  }
  
  public static String anyToString(Object paramObject) {
    return ProductConfig$.MODULE$.anyToString(paramObject);
  }
  
  public static <T> T loader(String paramString, MapBean paramMapBean) {
    return ProductConfig$.MODULE$.loader(paramString, paramMapBean);
  }
  
  public static List<Tuple2<Object, Object>> changeToList(String paramString) {
    return ProductConfig$.MODULE$.changeToList(paramString);
  }
  
  public static List<GiveItem> strToGiveItem(String paramString) {
    return ProductConfig$.MODULE$.strToGiveItem(paramString);
  }
  
  public static List<Tuple2<Object, Object>> strToFormatList(String paramString) {
    return ProductConfig$.MODULE$.strToFormatList(paramString);
  }
  
  public static int[] strToArrayInt(String paramString1, String paramString2) {
    return ProductConfig$.MODULE$.strToArrayInt(paramString1, paramString2);
  }
  
  public static BufferedInputStream getBufferedInputStream(String paramString) {
    return ProductConfig$.MODULE$.getBufferedInputStream(paramString);
  }
  
  public static BufferedInputStream getBufferedInputStream() {
    return ProductConfig$.MODULE$.getBufferedInputStream();
  }
  
  public static ListBuffer<MapBean> loadXml(String paramString1, String paramString2) {
    return ProductConfig$.MODULE$.loadXml(paramString1, paramString2);
  }
  
  public static void com$nirvana$xml$XmlConfig$_setter_$md5Map_$eq(Map paramMap) {
    ProductConfig$.MODULE$.com$nirvana$xml$XmlConfig$_setter_$md5Map_$eq(paramMap);
  }
  
  public static void com$nirvana$xml$XmlConfig$_setter_$configPath_$eq(String paramString) {
    ProductConfig$.MODULE$.com$nirvana$xml$XmlConfig$_setter_$configPath_$eq(paramString);
  }
  
  public static Map<String, String> md5Map() {
    return ProductConfig$.MODULE$.md5Map();
  }
  
  public static String configPath() {
    return ProductConfig$.MODULE$.configPath();
  }
  
  public static void main(String[] paramArrayOfString) {
    ProductConfig$.MODULE$.main(paramArrayOfString);
  }
  
  public static GemColorDef getGemColorDef(int paramInt) {
    return ProductConfig$.MODULE$.getGemColorDef(paramInt);
  }
  
  public static BaseAttr getSuitAttr(int paramInt1, int paramInt2, int paramInt3) {
    return ProductConfig$.MODULE$.getSuitAttr(paramInt1, paramInt2, paramInt3);
  }
  
  public static int getSuitIdBySpId(int paramInt) {
    return ProductConfig$.MODULE$.getSuitIdBySpId(paramInt);
  }
  
  public static List<SuitDef> getAllSuitDef() {
    return ProductConfig$.MODULE$.getAllSuitDef();
  }
  
  public static SuitDef getSuitDef(int paramInt1, int paramInt2, int paramInt3) {
    return ProductConfig$.MODULE$.getSuitDef(paramInt1, paramInt2, paramInt3);
  }
  
  public static BaseAttr getPromotePositionAttr(int paramInt1, int paramInt2) {
    return ProductConfig$.MODULE$.getPromotePositionAttr(paramInt1, paramInt2);
  }
  
  public static int getPromoteRateLuckyLimit(int paramInt) {
    return ProductConfig$.MODULE$.getPromoteRateLuckyLimit(paramInt);
  }
  
  public static PromoteRateDef getPromoteRate(int paramInt) {
    return ProductConfig$.MODULE$.getPromoteRate(paramInt);
  }
  
  public static PromotePlusDef getPromotePlusDef(int paramInt) {
    return ProductConfig$.MODULE$.getPromotePlusDef(paramInt);
  }
  
  public static PromotePlusDef[] getPromotePlusArray() {
    return ProductConfig$.MODULE$.getPromotePlusArray();
  }
  
  public static List<MapBean> getAllSpIdAndNameInfo() {
    return ProductConfig$.MODULE$.getAllSpIdAndNameInfo();
  }
  
  public static ConsignTypeDef getConsignTypeDef(int paramInt1, int paramInt2) {
    return ProductConfig$.MODULE$.getConsignTypeDef(paramInt1, paramInt2);
  }
  
  public static SignExpendDef getSignExpendDef(int paramInt) {
    return ProductConfig$.MODULE$.getSignExpendDef(paramInt);
  }
  
  public static SignDef getSignDef(int paramInt1, int paramInt2) {
    return ProductConfig$.MODULE$.getSignDef(paramInt1, paramInt2);
  }
  
  public static EquipmentStrongRatioDef getEquipmentPromoteRatio(int paramInt1, int paramInt2) {
    return ProductConfig$.MODULE$.getEquipmentPromoteRatio(paramInt1, paramInt2);
  }
  
  public static EquipmentStrongRatioDef getEquipmentStrongRatio(int paramInt1, int paramInt2) {
    return ProductConfig$.MODULE$.getEquipmentStrongRatio(paramInt1, paramInt2);
  }
  
  public static EquipmentStrongDef getEquipmentStrong(int paramInt1, int paramInt2) {
    return ProductConfig$.MODULE$.getEquipmentStrong(paramInt1, paramInt2);
  }
  
  public static int getRefineMaxLevel() {
    return ProductConfig$.MODULE$.getRefineMaxLevel();
  }
  
  public static EquipmentRefineDef getRefineItemDef(int paramInt1, int paramInt2, int paramInt3) {
    return ProductConfig$.MODULE$.getRefineItemDef(paramInt1, paramInt2, paramInt3);
  }
  
  public static FormulaDef getFormulaDef(int paramInt) {
    return ProductConfig$.MODULE$.getFormulaDef(paramInt);
  }
  
  public static BaseAttr getRefineAttr(int paramInt1, int paramInt2, int paramInt3) {
    return ProductConfig$.MODULE$.getRefineAttr(paramInt1, paramInt2, paramInt3);
  }
  
  public static int getStrengthMaxExp(int paramInt1, int paramInt2) {
    return ProductConfig$.MODULE$.getStrengthMaxExp(paramInt1, paramInt2);
  }
  
  public static List<Product> getProductsByType(int paramInt) {
    return ProductConfig$.MODULE$.getProductsByType(paramInt);
  }
  
  public static BaseAttr getEquipAttr(int paramInt1, int paramInt2) {
    return ProductConfig$.MODULE$.getEquipAttr(paramInt1, paramInt2);
  }
  
  public static Product getSystemProductOrElse(int paramInt) {
    return ProductConfig$.MODULE$.getSystemProductOrElse(paramInt);
  }
  
  public static Product getSystemProduct(int paramInt) {
    return ProductConfig$.MODULE$.getSystemProduct(paramInt);
  }
  
  public static GemUpDef getGemUpDef(int paramInt) {
    return ProductConfig$.MODULE$.getGemUpDef(paramInt);
  }
  
  public static void loadPromote() {
    ProductConfig$.MODULE$.loadPromote();
  }
  
  public static void loadFormula() {
    ProductConfig$.MODULE$.loadFormula();
  }
  
  public static void loadSignExpend() {
    ProductConfig$.MODULE$.loadSignExpend();
  }
  
  public static void loadSign() {
    ProductConfig$.MODULE$.loadSign();
  }
  
  public static void loadConsignType() {
    ProductConfig$.MODULE$.loadConsignType();
  }
  
  public static void loadEquipmentPromoteRatio() {
    ProductConfig$.MODULE$.loadEquipmentPromoteRatio();
  }
  
  public static void loadEquipmentStrongRatio() {
    ProductConfig$.MODULE$.loadEquipmentStrongRatio();
  }
  
  public static Map<Tuple2<Object, Object>, Object> getStrengthExpMap() {
    return ProductConfig$.MODULE$.getStrengthExpMap();
  }
  
  public static void init() {
    ProductConfig$.MODULE$.init();
  }
  
  public static String file() {
    return ProductConfig$.MODULE$.file();
  }
  
  public static void PROMOTE_MAX_LEVEL_$eq(int paramInt) {
    ProductConfig$.MODULE$.PROMOTE_MAX_LEVEL_$eq(paramInt);
  }
  
  public static int PROMOTE_MAX_LEVEL() {
    return ProductConfig$.MODULE$.PROMOTE_MAX_LEVEL();
  }
  
  public static BaseAttr EMPTY_ATTR() {
    return ProductConfig$.MODULE$.EMPTY_ATTR();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\xml\ProductConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */