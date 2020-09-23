package com.nirvana.platform;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import scala.Function0;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001y:Q!\001\002\t\002%\t!\002R3gCVdG/\0219j\025\t\031A!\001\005qY\006$hm\034:n\025\t)a!A\004oSJ4\030M\\1\013\003\035\t1aY8n\007\001\001\"AC\006\016\003\t1Q\001\004\002\t\0025\021!\002R3gCVdG/\0219j'\rYa\002\006\t\003\037Ii\021\001\005\006\002#\005)1oY1mC&\0211\003\005\002\007\003:L(+\0324\021\005UQR\"\001\f\013\005]A\022!B:mMRR'\"A\r\002\021\035\024\030N\037>mK\022L!a\007\f\003\0171{wmZ5oO\")Qd\003C\001=\0051A(\0338jiz\"\022!\003\005\006A-!\t!I\001\nG\",7m[+tKJ$rA\t\0252gaRD\b\005\002$M5\tAE\003\002&\t\005!1m\034:f\023\t9CEA\004NCB\024U-\0318\t\013%z\002\031\001\026\002\021U\034XM\0358b[\026\004\"a\013\030\017\005=a\023BA\027\021\003\031\001&/\0323fM&\021q\006\r\002\007'R\024\030N\\4\013\0055\002\002\"\002\032 \001\004Q\023\001\0039bgN<xN\0353\t\013Qz\002\031A\033\002\023\rD\027M\0348fY&#\005CA\b7\023\t9\004CA\002J]RDQ!O\020A\002)\nA!\0363jI\")1h\ba\001U\005AQ.Y2`C\022$'\017C\003>?\001\007!&\001\002ja\002")
public final class DefaultApi {
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    DefaultApi$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    DefaultApi$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return DefaultApi$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    DefaultApi$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    DefaultApi$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return DefaultApi$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    DefaultApi$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    DefaultApi$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return DefaultApi$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    DefaultApi$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    DefaultApi$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return DefaultApi$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    DefaultApi$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    DefaultApi$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return DefaultApi$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return DefaultApi$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return DefaultApi$.MODULE$.logger();
  }
  
  public static MapBean checkUser(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4, String paramString5) {
    return DefaultApi$.MODULE$.checkUser(paramString1, paramString2, paramInt, paramString3, paramString4, paramString5);
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\platform\DefaultApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */