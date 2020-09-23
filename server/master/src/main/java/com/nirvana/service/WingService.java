package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001q;Q!\001\002\t\002%\t1bV5oON+'O^5dK*\0211\001B\001\bg\026\024h/[2f\025\t)a!A\004oSJ4\030M\\1\013\003\035\t1aY8n\007\001\001\"AC\006\016\003\t1Q\001\004\002\t\0025\0211bV5oON+'O^5dKN\0211B\004\t\003\025=I!\001\005\002\003\037\005\0237\017\036:bGR\034VM\035<jG\026DQAE\006\005\002M\ta\001P5oSRtD#A\005\t\013UYA\021\001\f\002\017\035,GoV5oOR\021q#\b\t\0031mi\021!\007\006\0035\021\tAaY8sK&\021A$\007\002\b\033\006\004()Z1o\021\025qB\0031\001 \003!\001H.Y=fe&#\007C\001\021'\035\t\tC%D\001#\025\005\031\023!B:dC2\f\027BA\023#\003\031\001&/\0323fM&\021q\005\013\002\007'R\024\030N\\4\013\005\025\022\003\"\002\026\f\t\003Y\023AB;qI\006$X\rF\005-_A*t'O\036>A\021\021%L\005\003]\t\022A!\0268ji\")a$\013a\001?!)\021'\013a\001e\0051q/\0338h\023\022\004\"!I\032\n\005Q\022#aA%oi\")a'\013a\001e\005!!/\0318l\021\025A\024\0061\0013\003\025aWM^3m\021\025Q\024\0061\0013\003\r)\007\020\035\005\006y%\002\rAM\001\013kB<'/\0313f\035Vl\007\"\002 *\001\004\021\024aB2sSRtU/\034\005\006\001&\002\rAM\001\nkN,w+\0338h\023\022DQAQ\006\005\002\r\013abZ3u/&twMR1tQ&|g\016\006\002E\027B\031Q\tS\f\017\005\0052\025BA$#\003\035\001\030mY6bO\026L!!\023&\003\t1K7\017\036\006\003\017\nBQ\001T!A\002}\t\021\002\0357bs\026\024x,\0333\t\0139[A\021A(\002#U\004H-\031;f/&twMR1tQ&|g\016\006\003-!F\033\006\"\002'N\001\004y\002\"\002*N\001\004\021\024A\0034bg\"LwN\\0jI\")A+\024a\001+\006AQM\0343`i&lW\r\005\002\"-&\021qK\t\002\005\031>tw\rC\003Z\027\021\005!,\001\007hKR,6/Z,j]\036LE\r\006\00237\")a\004\027a\001?\001")
public final class WingService {
  public static int getUseWingId(String paramString) {
    return WingService$.MODULE$.getUseWingId(paramString);
  }
  
  public static void updateWingFashion(String paramString, int paramInt, long paramLong) {
    WingService$.MODULE$.updateWingFashion(paramString, paramInt, paramLong);
  }
  
  public static List<MapBean> getWingFashion(String paramString) {
    return WingService$.MODULE$.getWingFashion(paramString);
  }
  
  public static void update(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    WingService$.MODULE$.update(paramString, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
  }
  
  public static MapBean getWing(String paramString) {
    return WingService$.MODULE$.getWing(paramString);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    WingService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    WingService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return WingService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    WingService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    WingService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return WingService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    WingService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    WingService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return WingService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    WingService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    WingService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return WingService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    WingService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    WingService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return WingService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return WingService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return WingService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\WingService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */