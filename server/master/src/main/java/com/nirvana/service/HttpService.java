package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import scala.Function0;
import scala.collection.mutable.Map;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001I<Q!\001\002\t\002%\t1\002\023;uaN+'O^5dK*\0211\001B\001\bg\026\024h/[2f\025\t)a!A\004oSJ4\030M\\1\013\003\035\t1aY8n\007\001\001\"AC\006\016\003\t1Q\001\004\002\t\0025\0211\002\023;uaN+'O^5dKN\0311B\004\013\021\005=\021R\"\001\t\013\003E\tQa]2bY\006L!a\005\t\003\r\005s\027PU3g!\t)\"$D\001\027\025\t9\002$A\003tY\032$$NC\001\032\003!9'/\033>{Y\026$\027BA\016\027\005\035aunZ4j]\036DQ!H\006\005\002y\ta\001P5oSRtD#A\005\t\017\001Z!\031!C\005C\005Q\001\016\036;q\0072LWM\034;\026\003\t\002\"a\t\027\016\003\021R!!\n\024\002\r\rd\027.\0328u\025\t9\003&\001\003iiR\004(BA\025+\003\031\t\007/Y2iK*\t1&A\002pe\036L!!\f\023\003\025!#H\017]\"mS\026tG\017\003\0040\027\001\006IAI\001\fQR$\bo\0217jK:$\b\005C\0032\027\021%\021%\001\013hKR$UMZ1vYRDE\017\0369DY&,g\016\036\005\006g-!I\001N\001\024O\026$8k\025'T_\016\\W\r\036$bGR|'/_\013\002kA\021agO\007\002o)\021\001(O\001\004gNd'B\001\036'\003\021\031wN\0348\n\005q:$AG*T\031\016{gN\\3di&|gnU8dW\026$h)Y2u_JL\b\"\002 \f\t\003y\024!\0023p\017\026$HC\001!H!\t\tEI\004\002\020\005&\0211\tE\001\007!J,G-\0324\n\005\0253%AB*ue&twM\003\002D!!)\001*\020a\001\001\006\031QO\0357\t\013)[A\021A&\002\r\021|\007k\\:u)\ra%k\025\t\003\033Bk\021A\024\006\003\037\022\tAaY8sK&\021\021K\024\002\b\033\006\004()Z1o\021\025A\025\n1\001A\021\025!\026\n1\001V\003\031\001\030M]1ngB!ak\027!A\033\0059&B\001-Z\003\035iW\017^1cY\026T!A\027\t\002\025\r|G\016\\3di&|g.\003\002]/\n\031Q*\0319\t\013y[A\021A0\002\025\021|\007k\\:u\025N|g\016F\002MA\006DQ\001S/A\002\001CQAY/A\002\001\013!B[:p]N#(/\0338h\021\025q6\002\"\001e)\raUM\032\005\006\021\016\004\r\001\021\005\006)\016\004\r\001\024\005\006Q.!\t![\001\005[\006Lg\016\006\002k[B\021qb[\005\003YB\021A!\0268ji\")an\032a\001_\006!\021M]4t!\ry\001\017Q\005\003cB\021Q!\021:sCf\004")
public final class HttpService {
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    HttpService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    HttpService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return HttpService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    HttpService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    HttpService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return HttpService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    HttpService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    HttpService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return HttpService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    HttpService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    HttpService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return HttpService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    HttpService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    HttpService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return HttpService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return HttpService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return HttpService$.MODULE$.logger();
  }
  
  public static void main(String[] paramArrayOfString) {
    HttpService$.MODULE$.main(paramArrayOfString);
  }
  
  public static MapBean doPostJson(String paramString, MapBean paramMapBean) {
    return HttpService$.MODULE$.doPostJson(paramString, paramMapBean);
  }
  
  public static MapBean doPostJson(String paramString1, String paramString2) {
    return HttpService$.MODULE$.doPostJson(paramString1, paramString2);
  }
  
  public static MapBean doPost(String paramString, Map<String, String> paramMap) {
    return HttpService$.MODULE$.doPost(paramString, paramMap);
  }
  
  public static String doGet(String paramString) {
    return HttpService$.MODULE$.doGet(paramString);
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\HttpService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */