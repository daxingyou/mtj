package com.nirvana.util;

import grizzled.slf4j.Logger;
import scala.Function0;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001m;Q!\001\002\t\002%\tA\"Q;u_:\013W.Z+uS2T!a\001\003\002\tU$\030\016\034\006\003\013\031\tqA\\5sm\006t\027MC\001\b\003\r\031w.\\\002\001!\tQ1\"D\001\003\r\025a!\001#\001\016\0051\tU\017^8OC6,W\013^5m'\rYa\002\006\t\003\037Ii\021\001\005\006\002#\005)1oY1mC&\0211\003\005\002\007\003:L(+\0324\021\005UQR\"\001\f\013\005]A\022!B:mMRR'\"A\r\002\021\035\024\030N\037>mK\022L!a\007\f\003\0171{wmZ5oO\")Qd\003C\001=\0051A(\0338jiz\"\022!\003\005\bA-\021\r\021\"\004\"\003\025q\027-\\3B+\005\021\003cA\022)U5\tAE\003\002&M\0059Q.\036;bE2,'BA\024\021\003)\031w\016\0347fGRLwN\\\005\003S\021\022!\002T5ti\n+hMZ3s!\tYcF\004\002\020Y%\021Q\006E\001\007!J,G-\0324\n\005=\002$AB*ue&twM\003\002.!!1!g\003Q\001\016\t\naA\\1nK\006\003\003b\002\033\f\005\004%i!I\001\007]\006lWM\021\031\t\rYZ\001\025!\004#\003\035q\027-\\3Ca\001Bq\001O\006C\002\0235\021%\001\004oC6,')\r\005\007u-\001\013Q\002\022\002\0179\fW.\032\"2A!9Ah\003b\001\n\033\t\023A\0028b[\026\034\005\007\003\004?\027\001\006iAI\001\b]\006lWm\021\031!\021\035\0015B1A\005\016\005\naA\\1nK\016\013\004B\002\"\fA\0035!%A\004oC6,7)\r\021\t\013\021[A\021A#\002\033\035,GOU1oI>lg*Y7f)\tQc\tC\003H\007\002\007\001*A\002tKb\004\"aD%\n\005)\003\"aA%oi\")Aj\003C\005\033\006)q\f\\8bIR\021!E\024\005\006\037.\003\rAK\001\ta\006$\bNT1nK\")\021k\003C\001%\006!Q.Y5o)\t\031f\013\005\002\020)&\021Q\013\005\002\005+:LG\017C\003X!\002\007\001,\001\003be\036\034\bcA\bZU%\021!\f\005\002\006\003J\024\030-\037")
public final class AutoNameUtil {
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    AutoNameUtil$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    AutoNameUtil$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return AutoNameUtil$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    AutoNameUtil$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    AutoNameUtil$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return AutoNameUtil$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    AutoNameUtil$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    AutoNameUtil$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return AutoNameUtil$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    AutoNameUtil$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    AutoNameUtil$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return AutoNameUtil$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    AutoNameUtil$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    AutoNameUtil$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return AutoNameUtil$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return AutoNameUtil$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return AutoNameUtil$.MODULE$.logger();
  }
  
  public static void main(String[] paramArrayOfString) {
    AutoNameUtil$.MODULE$.main(paramArrayOfString);
  }
  
  public static String getRandomName(int paramInt) {
    return AutoNameUtil$.MODULE$.getRandomName(paramInt);
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvan\\util\AutoNameUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */