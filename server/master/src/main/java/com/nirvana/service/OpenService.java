package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001-;Q!\001\002\t\002%\t1b\0249f]N+'O^5dK*\0211\001B\001\bg\026\024h/[2f\025\t)a!A\004oSJ4\030M\\1\013\003\035\t1aY8n\007\001\001\"AC\006\016\003\t1Q\001\004\002\t\0025\0211b\0249f]N+'O^5dKN\0211B\004\t\003\025=I!\001\005\002\003\037\005\0237\017\036:bGR\034VM\035<jG\026DQAE\006\005\002M\ta\001P5oSRtD#A\005\t\013UYA\021\001\f\002\031\035,Go\0249f]2+g/\0327\025\007]i\022\006\005\002\03175\t\021D\003\002\033\t\005!1m\034:f\023\ta\022DA\004NCB\024U-\0318\t\013y!\002\031A\020\002\023Ad\027-_3s?&$\007C\001\021'\035\t\tC%D\001#\025\005\031\023!B:dC2\f\027BA\023#\003\031\001&/\0323fM&\021q\005\013\002\007'R\024\030N\\4\013\005\025\022\003\"\002\026\025\001\004Y\023\001\0037fm\026dw,\0333\021\005\005b\023BA\027#\005\rIe\016\036\005\006_-!\t\001M\001\025O\026$x\n]3o\031\0264X\r\034\"z!2\f\0270\032:\025\005Ej\004c\001\032;/9\0211\007\017\b\003i]j\021!\016\006\003m!\ta\001\020:p_Rt\024\"A\022\n\005e\022\023a\0029bG.\fw-Z\005\003wq\022A\001T5ti*\021\021H\t\005\006=9\002\ra\b\005\006-!\t\001Q\001\rC\022$w\n]3o\031\0264X\r\034\013\005W\005\0235\tC\003\037}\001\007q\004C\003+}\001\0071\006C\003E}\001\0071&A\005sK\016|6m\\;oi\")ai\003C\001\017\006yQ\017\0353bi\026|\005/\0328MKZ,G\016\006\003,\021&S\005\"\002\020F\001\004y\002\"\002\026F\001\004Y\003\"\002#F\001\004Y\003")
public final class OpenService {
  public static int updateOpenLevel(String paramString, int paramInt1, int paramInt2) {
    return OpenService$.MODULE$.updateOpenLevel(paramString, paramInt1, paramInt2);
  }
  
  public static int addOpenLevel(String paramString, int paramInt1, int paramInt2) {
    return OpenService$.MODULE$.addOpenLevel(paramString, paramInt1, paramInt2);
  }
  
  public static List<MapBean> getOpenLevelByPlayer(String paramString) {
    return OpenService$.MODULE$.getOpenLevelByPlayer(paramString);
  }
  
  public static MapBean getOpenLevel(String paramString, int paramInt) {
    return OpenService$.MODULE$.getOpenLevel(paramString, paramInt);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    OpenService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    OpenService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return OpenService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    OpenService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    OpenService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return OpenService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    OpenService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    OpenService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return OpenService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    OpenService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    OpenService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return OpenService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    OpenService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    OpenService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return OpenService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return OpenService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return OpenService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\OpenService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */