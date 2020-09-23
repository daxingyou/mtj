package com.nirvana.core;

import grizzled.slf4j.Logger;
import java.util.concurrent.atomic.AtomicLong;
import scala.Function0;
import scala.collection.mutable.Map;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\0011<Q!\001\002\t\002%\tqB\022:fcV,g\016^\"iK\016\\WM\035\006\003\007\021\tAaY8sK*\021QAB\001\b]&\024h/\0318b\025\0059\021aA2p[\016\001\001C\001\006\f\033\005\021a!\002\007\003\021\003i!a\004$sKF,XM\034;DQ\026\0347.\032:\024\007-qA\003\005\002\020%5\t\001CC\001\022\003\025\0318-\0317b\023\t\031\002C\001\004B]f\024VM\032\t\003+ii\021A\006\006\003/a\tQa\0357gi)T\021!G\001\tOJL'P\0377fI&\0211D\006\002\b\031><w-\0338h\021\025i2\002\"\001\037\003\031a\024N\\5u}Q\t\021\002C\004!\027\t\007I\021A\021\002\025\r|W.\\1oI6\013\007/F\001#!\021\031\003FK\027\016\003\021R!!\n\024\002\0175,H/\0312mK*\021q\005E\001\013G>dG.Z2uS>t\027BA\025%\005\ri\025\r\035\t\003\037-J!\001\f\t\003\007%sG\017\005\002/o5\tqF\003\0021c\0051\021\r^8nS\016T!AM\032\002\025\r|gnY;se\026tGO\003\0025k\005!Q\017^5m\025\0051\024\001\0026bm\006L!\001O\030\003\025\005#x.\\5d\031>tw\r\003\004;\027\001\006IAI\001\fG>lW.\0318e\033\006\004\b\005C\004=\027\t\007I\021A\037\002\rM\fH.T1q+\005q\004\003B\022)5\002\"\001Q\"\017\005=\t\025B\001\"\021\003\031\001&/\0323fM&\021A)\022\002\007'R\024\030N\\4\013\005\t\003\002BB$\fA\003%a(A\004tc2l\025\r\035\021\t\017%[!\031!C\001C\005y1m\\7nC:$G*[7ji6\013\007\017\003\004L\027\001\006IAI\001\021G>lW.\0318e\031&l\027\016^'ba\002Bq!T\006C\002\023\005a*A\007jg\022+'-^4TKJ4XM]\013\002\037B\021q\002U\005\003#B\021qAQ8pY\026\fg\016\003\004T\027\001\006IaT\001\017SN$UMY;h'\026\024h/\032:!\021\025)6\002\"\001W\0035\031w.\\7b]\022\024VmY8sIR\021qK\027\t\003\037aK!!\027\t\003\tUs\027\016\036\005\0067R\003\rAK\001\bG>lW.\0318e\021\025i6\002\"\001_\003-\031w.\\7b]\022\034F/\031;\026\003]CQ\001Y\006\005\002\005\f!cY8n[\006tG\rT5nSR\024VmY8sIR\021qK\031\005\0067~\003\rA\013\005\006I.!\tAX\001\021G>lW.\0318e\031&l\027\016^*uCRDQAZ\006\005\002\035\f\021b]9m%\026\034wN\0353\025\005]C\007\"B5f\001\004y\024aA:rY\")1n\003C\001=\00691/\0357Ti\006$\b")
public final class FrequentChecker {
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    FrequentChecker$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    FrequentChecker$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return FrequentChecker$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    FrequentChecker$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    FrequentChecker$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return FrequentChecker$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    FrequentChecker$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    FrequentChecker$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return FrequentChecker$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    FrequentChecker$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    FrequentChecker$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return FrequentChecker$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    FrequentChecker$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    FrequentChecker$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return FrequentChecker$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return FrequentChecker$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return FrequentChecker$.MODULE$.logger();
  }
  
  public static void sqlStat() {
    FrequentChecker$.MODULE$.sqlStat();
  }
  
  public static void sqlRecord(String paramString) {
    FrequentChecker$.MODULE$.sqlRecord(paramString);
  }
  
  public static void commandLimitStat() {
    FrequentChecker$.MODULE$.commandLimitStat();
  }
  
  public static void commandLimitRecord(int paramInt) {
    FrequentChecker$.MODULE$.commandLimitRecord(paramInt);
  }
  
  public static void commandStat() {
    FrequentChecker$.MODULE$.commandStat();
  }
  
  public static void commandRecord(int paramInt) {
    FrequentChecker$.MODULE$.commandRecord(paramInt);
  }
  
  public static boolean isDebugServer() {
    return FrequentChecker$.MODULE$.isDebugServer();
  }
  
  public static Map<Object, AtomicLong> commandLimitMap() {
    return FrequentChecker$.MODULE$.commandLimitMap();
  }
  
  public static Map<String, AtomicLong> sqlMap() {
    return FrequentChecker$.MODULE$.sqlMap();
  }
  
  public static Map<Object, AtomicLong> commandMap() {
    return FrequentChecker$.MODULE$.commandMap();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\core\FrequentChecker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */