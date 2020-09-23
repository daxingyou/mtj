package com.nirvana.thread;

import grizzled.slf4j.Logger;
import scala.Function0;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001I;Q!\001\002\t\002%\t\021\002U1z)\"\024X-\0313\013\005\r!\021A\002;ie\026\fGM\003\002\006\r\0059a.\033:wC:\f'\"A\004\002\007\r|Wn\001\001\021\005)YQ\"\001\002\007\0131\021\001\022A\007\003\023A\013\027\020\0265sK\006$7\003B\006\017-q\001\"a\004\013\016\003AQ!!\005\n\002\t1\fgn\032\006\002'\005!!.\031<b\023\t)\002C\001\004PE*,7\r\036\t\003/ii\021\001\007\006\0033\021\tAaY8sK&\0211\004\007\002\r\003V$xNU;o]\006\024G.\032\t\003;\tj\021A\b\006\003?\001\nQa\0357gi)T\021!I\001\tOJL'P\0377fI&\0211E\b\002\b\031><w-\0338h\021\025)3\002\"\001'\003\031a\024N\\5u}Q\t\021\002C\003)\027\021\005\021&A\006qCf$\025n\0359bi\016DGC\003\0261sm\002%\t\022$I\025B\0211FL\007\002Y)\tQ&A\003tG\006d\027-\003\0020Y\t!QK\\5u\021\025\tt\0051\0013\003)\001\030-_(sI\026\024\030\n\032\t\003gYr!a\013\033\n\005Ub\023A\002)sK\022,g-\003\0028q\t11\013\036:j]\036T!!\016\027\t\013i:\003\031\001\032\002\017=\024H-\032:J\t\")Ah\na\001{\005A1/\032:wKJLE\r\005\002,}%\021q\b\f\002\004\023:$\b\"B!(\001\004\021\024\001C;tKJt\027-\\3\t\013\r;\003\031\001\032\002\021Ad\027-_3s\023\022DQ!R\024A\002u\n!\001\0354\t\013\035;\003\031A\037\002\023\rD\027M\0348fY&#\007\"B%(\001\004i\024a\001:nE\")1j\na\001{\005I\001O]8ek\016$\030\n\032\005\006\033.!IAT\001\027G\",7m[)vKJLhj\034;GS:L7\017\033)bsV\t!\006C\003Q\027\021\005\023+A\002sk:$\022A\013")
public final class PayThread {
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    PayThread$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    PayThread$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return PayThread$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    PayThread$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    PayThread$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return PayThread$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    PayThread$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    PayThread$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return PayThread$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    PayThread$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    PayThread$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return PayThread$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    PayThread$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    PayThread$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return PayThread$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return PayThread$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return PayThread$.MODULE$.logger();
  }
  
  public static void run() {
    PayThread$.MODULE$.run();
  }
  
  public static void payDispatch(String paramString1, String paramString2, int paramInt1, String paramString3, String paramString4, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    PayThread$.MODULE$.payDispatch(paramString1, paramString2, paramInt1, paramString3, paramString4, paramInt2, paramInt3, paramInt4, paramInt5);
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\thread\PayThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */