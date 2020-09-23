package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001-;Q!\001\002\t\002%\tq\"T5oSB\f7m[*feZL7-\032\006\003\007\021\tqa]3sm&\034WM\003\002\006\r\0059a.\033:wC:\f'\"A\004\002\007\r|Wn\001\001\021\005)YQ\"\001\002\007\0131\021\001\022A\007\003\0375Kg.\0339bG.\034VM\035<jG\026\034\"a\003\b\021\005)y\021B\001\t\003\005=\t%m\035;sC\016$8+\032:wS\016,\007\"\002\n\f\t\003\031\022A\002\037j]&$h\bF\001\n\021\025)2\002\"\001\027\003-9W\r^'j]&\004\030mY6\025\007]i\022\006\005\002\03175\t\021D\003\002\033\t\005!1m\034:f\023\ta\022DA\004NCB\024U-\0318\t\013y!\002\031A\020\002\023Ad\027-_3s?&$\007C\001\021'\035\t\tC%D\001#\025\005\031\023!B:dC2\f\027BA\023#\003\031\001&/\0323fM&\021q\005\013\002\007'R\024\030N\\4\013\005\025\022\003\"\002\026\025\001\004Y\023a\0029bG.|\026\016\032\t\003C1J!!\f\022\003\007%sG\017C\0030\027\021\005\001'A\013hKRl\025N\\5qC\016\\')\037)mCf,'/\0233\025\005Ej\004c\001\032;/9\0211\007\017\b\003i]j\021!\016\006\003m!\ta\001\020:p_Rt\024\"A\022\n\005e\022\023a\0029bG.\fw-Z\005\003wq\022A\001T5ti*\021\021H\t\005\006=9\002\ra\b\005\006-!\t\001Q\001\fC\022$W*\0338ja\006\0347\016\006\003,\003\n\033\005\"\002\020?\001\004y\002\"\002\026?\001\004Y\003\"\002#?\001\004Y\023!\003:fG~\033w.\0368u\021\02515\002\"\001H\003=)\b\017Z1uK>\003XM\034'fm\026dG\003B\026I\023*CQAH#A\002}AQAK#A\002-BQ\001R#A\002-\002")
public final class MinipackService {
  public static int updateOpenLevel(String paramString, int paramInt1, int paramInt2) {
    return MinipackService$.MODULE$.updateOpenLevel(paramString, paramInt1, paramInt2);
  }
  
  public static int addMinipack(String paramString, int paramInt1, int paramInt2) {
    return MinipackService$.MODULE$.addMinipack(paramString, paramInt1, paramInt2);
  }
  
  public static List<MapBean> getMinipackByPlayerId(String paramString) {
    return MinipackService$.MODULE$.getMinipackByPlayerId(paramString);
  }
  
  public static MapBean getMinipack(String paramString, int paramInt) {
    return MinipackService$.MODULE$.getMinipack(paramString, paramInt);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MinipackService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    MinipackService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return MinipackService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MinipackService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    MinipackService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return MinipackService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MinipackService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    MinipackService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return MinipackService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MinipackService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    MinipackService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return MinipackService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MinipackService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    MinipackService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return MinipackService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return MinipackService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return MinipackService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\MinipackService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */