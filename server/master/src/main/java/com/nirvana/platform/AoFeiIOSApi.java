package com.nirvana.platform;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import scala.Function0;
import scala.collection.immutable.Set;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005Uq!B\001\003\021\003I\021aC!p\r\026L\027jT*Ba&T!a\001\003\002\021Ad\027\r\0364pe6T!!\002\004\002\0179L'O^1oC*\tq!A\002d_6\034\001\001\005\002\013\0275\t!AB\003\r\005!\005QBA\006B_\032+\027.S(T\003BL7cA\006\017)A\021qBE\007\002!)\t\021#A\003tG\006d\027-\003\002\024!\t1\021I\\=SK\032\004\"!\006\016\016\003YQ!a\006\r\002\013Mdg\r\0166\013\003e\t\001b\032:jujdW\rZ\005\0037Y\021q\001T8hO&tw\rC\003\036\027\021\005a$\001\004=S:LGO\020\013\002\023!9\001e\003b\001\n\013\t\023!B1qa&#U#\001\022\021\005=\031\023B\001\023\021\005\rIe\016\036\005\007M-\001\013Q\002\022\002\r\005\004\b/\023#!\021\035A3B1A\005\006%\na!\0319q\027\026LX#\001\026\021\005-\002T\"\001\027\013\0055r\023\001\0027b]\036T\021aL\001\005U\0064\030-\003\0022Y\t11\013\036:j]\036DaaM\006!\002\033Q\023aB1qa.+\027\020\t\005\bk-\021\r\021\"\002*\003%\t\007\017]*fGJ,G\017\003\0048\027\001\006iAK\001\013CB\0048+Z2sKR\004\003bB\035\f\005\004%)!K\001\004kJd\007BB\036\fA\0035!&\001\003ve2\004\003bB\037\f\005\004%)AP\001\013SB<\006.\033;f'\026$X#A \021\007\001+%&D\001B\025\t\0215)A\005j[6,H/\0312mK*\021A\tE\001\013G>dG.Z2uS>t\027B\001$B\005\r\031V\r\036\005\007\021.\001\013QB \002\027%\004x\013[5uKN+G\017\t\005\006\025.!\taS\001\nG\",7m[+tKJ$\002\002\024*[9z\003'\r\032\t\003\033Bk\021A\024\006\003\037\022\tAaY8sK&\021\021K\024\002\b\033\006\004()Z1o\021\025\031\026\n1\001U\003\r)\030\016\032\t\003+bs!a\004,\n\005]\003\022A\002)sK\022,g-\003\00223*\021q\013\005\005\0067&\003\r\001V\001\fC\016\034Wm]:U_.,g\016C\003^\023\002\007!%A\005dQ\006tg.\0327J\t\")q,\023a\001)\006!Q\017Z5e\021\025\t\027\n1\001U\003!i\027mY0bI\022\024\b\"B2J\001\004!\026AA5q\021\035)\027\n%AA\002Q\013AaY8eK\")qm\003C\001Q\006Qq-\032;Pe\022,'/\0233\025\0051K\007\"\0026g\001\004a\025\001B5oM>DQ\001\\\006\005\0025\fqa\0315fG.L\005\017\006\002ocB\021qb\\\005\003aB\021qAQ8pY\026\fg\016C\003dW\002\007A\013C\003t\027\021\005A/\001\003nC&tGCA;y!\tya/\003\002x!\t!QK\\5u\021\025I(\0171\001{\003\021\t'oZ:\021\007=YH+\003\002}!\t)\021I\035:bs\"9apCI\001\n\003y\030aE2iK\016\\Wk]3sI\021,g-Y;mi\022:TCAA\001U\r!\0261A\026\003\003\013\001B!a\002\002\0225\021\021\021\002\006\005\003\027\ti!A\005v]\016DWmY6fI*\031\021q\002\t\002\025\005tgn\034;bi&|g.\003\003\002\024\005%!!E;oG\",7m[3e-\006\024\030.\0318dK\002")
public final class AoFeiIOSApi {
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    AoFeiIOSApi$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    AoFeiIOSApi$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return AoFeiIOSApi$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    AoFeiIOSApi$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    AoFeiIOSApi$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return AoFeiIOSApi$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    AoFeiIOSApi$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    AoFeiIOSApi$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return AoFeiIOSApi$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    AoFeiIOSApi$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    AoFeiIOSApi$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return AoFeiIOSApi$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    AoFeiIOSApi$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    AoFeiIOSApi$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return AoFeiIOSApi$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return AoFeiIOSApi$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return AoFeiIOSApi$.MODULE$.logger();
  }
  
  public static String checkUser$default$7() {
    return AoFeiIOSApi$.MODULE$.checkUser$default$7();
  }
  
  public static void main(String[] paramArrayOfString) {
    AoFeiIOSApi$.MODULE$.main(paramArrayOfString);
  }
  
  public static boolean checkIp(String paramString) {
    return AoFeiIOSApi$.MODULE$.checkIp(paramString);
  }
  
  public static MapBean getOrderId(MapBean paramMapBean) {
    return AoFeiIOSApi$.MODULE$.getOrderId(paramMapBean);
  }
  
  public static MapBean checkUser(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4, String paramString5, String paramString6) {
    return AoFeiIOSApi$.MODULE$.checkUser(paramString1, paramString2, paramInt, paramString3, paramString4, paramString5, paramString6);
  }
  
  public static Set<String> ipWhiteSet() {
    return AoFeiIOSApi$.MODULE$.ipWhiteSet();
  }
  
  public static String url() {
    return AoFeiIOSApi$.MODULE$.url();
  }
  
  public static String appSecret() {
    return AoFeiIOSApi$.MODULE$.appSecret();
  }
  
  public static String appKey() {
    return AoFeiIOSApi$.MODULE$.appKey();
  }
  
  public static int appID() {
    return AoFeiIOSApi$.MODULE$.appID();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\platform\AoFeiIOSApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */