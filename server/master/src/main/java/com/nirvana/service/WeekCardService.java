package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import scala.Function0;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\001;Q!\001\002\t\002%\tqbV3fW\016\013'\017Z*feZL7-\032\006\003\007\021\tqa]3sm&\034WM\003\002\006\r\0059a.\033:wC:\f'\"A\004\002\007\r|Wn\001\001\021\005)YQ\"\001\002\007\0131\021\001\022A\007\003\037]+Wm[\"be\022\034VM\035<jG\026\034\"a\003\b\021\005)y\021B\001\t\003\005=\t%m\035;sC\016$8+\032:wS\016,\007\"\002\n\f\t\003\031\022A\002\037j]&$h\bF\001\n\021\025)2\002\"\001\027\003-9W\r^,fK.\034\025M\0353\025\005]i\002C\001\r\034\033\005I\"B\001\016\005\003\021\031wN]3\n\005qI\"aB'ba\n+\027M\034\005\006=Q\001\raH\001\ta2\f\0270\032:JIB\021\001E\n\b\003C\021j\021A\t\006\002G\005)1oY1mC&\021QEI\001\007!J,G-\0324\n\005\035B#AB*ue&twM\003\002&E!)!f\003C\001W\005\031!-^=\025\0051z\003CA\021.\023\tq#E\001\003V]&$\b\"\002\020*\001\004y\002\"B\031\f\t\003\021\024A\0029jG.,\b\017F\002-gQBQA\b\031A\002}AQ!\016\031A\002Y\nq\001\\1ti\022\f\027\020\005\002\"o%\021\001H\t\002\004\023:$\b\"\002\036\f\t\003Y\024AB3ya&\024X\r\006\002-y!)Q'\017a\001m!)ah\003C\001\005a1\r\\3be&sg/\0317jIR\tA\006")
public final class WeekCardService {
  public static void clearInvalid() {
    WeekCardService$.MODULE$.clearInvalid();
  }
  
  public static void expire(int paramInt) {
    WeekCardService$.MODULE$.expire(paramInt);
  }
  
  public static void pickup(String paramString, int paramInt) {
    WeekCardService$.MODULE$.pickup(paramString, paramInt);
  }
  
  public static void buy(String paramString) {
    WeekCardService$.MODULE$.buy(paramString);
  }
  
  public static MapBean getWeekCard(String paramString) {
    return WeekCardService$.MODULE$.getWeekCard(paramString);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    WeekCardService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    WeekCardService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return WeekCardService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    WeekCardService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    WeekCardService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return WeekCardService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    WeekCardService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    WeekCardService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return WeekCardService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    WeekCardService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    WeekCardService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return WeekCardService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    WeekCardService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    WeekCardService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return WeekCardService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return WeekCardService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return WeekCardService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\WeekCardService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */