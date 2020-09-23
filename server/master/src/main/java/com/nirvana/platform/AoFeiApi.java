package com.nirvana.platform;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import scala.Function0;
import scala.collection.immutable.Set;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005Eq!B\001\003\021\003I\021\001C!p\r\026L\027\t]5\013\005\r!\021\001\0039mCR4wN]7\013\005\0251\021a\0028jeZ\fg.\031\006\002\017\005\0311m\\7\004\001A\021!bC\007\002\005\031)AB\001E\001\033\tA\021i\034$fS\006\003\030nE\002\f\035Q\001\"a\004\n\016\003AQ\021!E\001\006g\016\fG.Y\005\003'A\021a!\0218z%\0264\007CA\013\033\033\0051\"BA\f\031\003\025\031HN\032\033k\025\005I\022\001C4sSjTH.\0323\n\005m1\"a\002'pO\036Lgn\032\005\006;-!\tAH\001\007y%t\027\016\036 \025\003%Aq\001I\006C\002\023\025\021%A\003baBLE)F\001#!\ty1%\003\002%!\t\031\021J\034;\t\r\031Z\001\025!\004#\003\031\t\007\017]%EA!9\001f\003b\001\n\013I\023AB1qa.+\0270F\001+!\tY\003'D\001-\025\tic&\001\003mC:<'\"A\030\002\t)\fg/Y\005\003c1\022aa\025;sS:<\007BB\032\fA\0035!&A\004baB\\U-\037\021\t\017UZ!\031!C\003S\005I\021\r\0359TK\016\024X\r\036\005\007o-\001\013Q\002\026\002\025\005\004\boU3de\026$\b\005C\004:\027\t\007IQA\025\002\007U\024H\016\003\004<\027\001\006iAK\001\005kJd\007\005C\004>\027\t\007IQ\001 \002\025%\004x\013[5uKN+G/F\001@!\r\001UIK\007\002\003*\021!iQ\001\nS6lW\017^1cY\026T!\001\022\t\002\025\r|G\016\\3di&|g.\003\002G\003\n\0311+\032;\t\r![\001\025!\004@\003-I\007o\0265ji\026\034V\r\036\021\t\013)[A\021A&\002\023\rDWmY6Vg\026\024Hc\002'S5rs\006M\031\t\003\033Bk\021A\024\006\003\037\022\tAaY8sK&\021\021K\024\002\b\033\006\004()Z1o\021\025\031\026\n1\001U\003!Qw.\037+pW\026t\007CA+Y\035\tya+\003\002X!\0051\001K]3eK\032L!!M-\013\005]\003\002\"B.J\001\004\021\023!C2iC:tW\r\\%E\021\025i\026\n1\001U\003\021)H-\0333\t\013}K\005\031\001+\002\0215\f7mX1eIJDQ!Y%A\002Q\013!!\0339\t\017\rL\005\023!a\001)\006!1m\0343f\021\025)7\002\"\001g\003)9W\r^(sI\026\024\030\n\032\013\003\031\036DQ\001\0333A\0021\013A!\0338g_\")!n\003C\001W\00691\r[3dW&\003HC\0017p!\tyQ.\003\002o!\t9!i\\8mK\006t\007\"B1j\001\004!\006\"B9\f\t\003\021\030\001B7bS:$\"a\035<\021\005=!\030BA;\021\005\021)f.\033;\t\013]\004\b\031\001=\002\t\005\024xm\035\t\004\037e$\026B\001>\021\005\025\t%O]1z\021\035a8\"%A\005\002u\f1c\0315fG.,6/\032:%I\0264\027-\0367uIY*\022A \026\003)~\\#!!\001\021\t\005\r\021QB\007\003\003\013QA!a\002\002\n\005IQO\\2iK\016\\W\r\032\006\004\003\027\001\022AC1o]>$\030\r^5p]&!\021qBA\003\005E)hn\0315fG.,GMV1sS\006t7-\032")
public final class AoFeiApi {
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    AoFeiApi$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    AoFeiApi$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return AoFeiApi$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    AoFeiApi$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    AoFeiApi$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return AoFeiApi$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    AoFeiApi$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    AoFeiApi$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return AoFeiApi$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    AoFeiApi$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    AoFeiApi$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return AoFeiApi$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    AoFeiApi$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    AoFeiApi$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return AoFeiApi$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return AoFeiApi$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return AoFeiApi$.MODULE$.logger();
  }
  
  public static String checkUser$default$6() {
    return AoFeiApi$.MODULE$.checkUser$default$6();
  }
  
  public static void main(String[] paramArrayOfString) {
    AoFeiApi$.MODULE$.main(paramArrayOfString);
  }
  
  public static boolean checkIp(String paramString) {
    return AoFeiApi$.MODULE$.checkIp(paramString);
  }
  
  public static MapBean getOrderId(MapBean paramMapBean) {
    return AoFeiApi$.MODULE$.getOrderId(paramMapBean);
  }
  
  public static MapBean checkUser(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5) {
    return AoFeiApi$.MODULE$.checkUser(paramString1, paramInt, paramString2, paramString3, paramString4, paramString5);
  }
  
  public static Set<String> ipWhiteSet() {
    return AoFeiApi$.MODULE$.ipWhiteSet();
  }
  
  public static String url() {
    return AoFeiApi$.MODULE$.url();
  }
  
  public static String appSecret() {
    return AoFeiApi$.MODULE$.appSecret();
  }
  
  public static String appKey() {
    return AoFeiApi$.MODULE$.appKey();
  }
  
  public static int appID() {
    return AoFeiApi$.MODULE$.appID();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\platform\AoFeiApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */