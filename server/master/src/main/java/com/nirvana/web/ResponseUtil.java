package com.nirvana.web;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import javax.servlet.http.HttpServletResponse;
import scala.Function0;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001U;Q!\001\002\t\002%\tABU3ta>t7/Z+uS2T!a\001\003\002\007],'M\003\002\006\r\0059a.\033:wC:\f'\"A\004\002\007\r|Wn\001\001\021\005)YQ\"\001\002\007\0131\021\001\022A\007\003\031I+7\017]8og\026,F/\0337\024\007-qA\003\005\002\020%5\t\001CC\001\022\003\025\0318-\0317b\023\t\031\002C\001\004B]f\024VM\032\t\003+ii\021A\006\006\003/a\tQa\0357gi)T\021!G\001\tOJL'P\0377fI&\0211D\006\002\b\031><w-\0338h\021\025i2\002\"\001\037\003\031a\024N\\5u}Q\t\021\002C\003!\027\021\005\021%\001\007sKN\004xN\\:f\035VdG\016\006\002#KA\021qbI\005\003IA\021A!\0268ji\")ae\ba\001O\005A!/Z:q_:\034X\r\005\002)_5\t\021F\003\002+W\005!\001\016\036;q\025\taS&A\004tKJ4H.\032;\013\0039\nQA[1wCbL!\001M\025\003'!#H\017]*feZdW\r\036*fgB|gn]3\t\013\031ZA\021\001\032\025\007\t\032D\007C\003'c\001\007q\005C\0036c\001\007a'A\004d_:$XM\034;\021\005]RdBA\b9\023\tI\004#\001\004Qe\026$WMZ\005\003wq\022aa\025;sS:<'BA\035\021\021\025q4\002\"\001@\0031\021Xm\0359p]N,'j]8o)\r\021\003)\021\005\006Mu\002\ra\n\005\006\005v\002\raQ\001\005E\026\fg\016\005\002E\0176\tQI\003\002G\t\005!1m\034:f\023\tAUIA\004NCB\024U-\0318\t\013)[A\021B&\002\025]\024\030\016^3CsR,7\017F\002#\0316CQAJ%A\002\035BQAT%A\002=\013QAY=uKN\0042a\004)S\023\t\t\006CA\003BeJ\f\027\020\005\002\020'&\021A\013\005\002\005\005f$X\r")
public final class ResponseUtil {
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ResponseUtil$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    ResponseUtil$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return ResponseUtil$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ResponseUtil$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    ResponseUtil$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return ResponseUtil$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ResponseUtil$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    ResponseUtil$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return ResponseUtil$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ResponseUtil$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    ResponseUtil$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return ResponseUtil$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ResponseUtil$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    ResponseUtil$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return ResponseUtil$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return ResponseUtil$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return ResponseUtil$.MODULE$.logger();
  }
  
  public static void responseJson(HttpServletResponse paramHttpServletResponse, MapBean paramMapBean) {
    ResponseUtil$.MODULE$.responseJson(paramHttpServletResponse, paramMapBean);
  }
  
  public static void response(HttpServletResponse paramHttpServletResponse, String paramString) {
    ResponseUtil$.MODULE$.response(paramHttpServletResponse, paramString);
  }
  
  public static void responseNull(HttpServletResponse paramHttpServletResponse) {
    ResponseUtil$.MODULE$.responseNull(paramHttpServletResponse);
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\web\ResponseUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */