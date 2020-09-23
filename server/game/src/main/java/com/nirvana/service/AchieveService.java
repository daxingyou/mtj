package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\025;Q!\001\002\t\002%\ta\"Q2iS\0264XmU3sm&\034WM\003\002\004\t\00591/\032:wS\016,'BA\003\007\003\035q\027N\035<b]\006T\021aB\001\004G>l7\001\001\t\003\025-i\021A\001\004\006\031\tA\t!\004\002\017\003\016D\027.\032<f'\026\024h/[2f'\tYa\002\005\002\013\037%\021\001C\001\002\020\003\n\034HO]1diN+'O^5dK\")!c\003C\001'\0051A(\0338jiz\"\022!\003\005\006+-!\tAF\001\fO\026$\030i\0315jKZ,7\017\006\002\030OA\031\001DH\021\017\005eaR\"\001\016\013\003m\tQa]2bY\006L!!\b\016\002\017A\f7m[1hK&\021q\004\t\002\005\031&\034HO\003\002\0365A\021!%J\007\002G)\021A\005B\001\005G>\024X-\003\002'G\t9Q*\0319CK\006t\007\"\002\025\025\001\004I\023\001\0039mCf,'/\0233\021\005)jcBA\r,\023\ta#$\001\004Qe\026$WMZ\005\003]=\022aa\025;sS:<'B\001\027\033\021\025\t4\002\"\0013\003)9W\r^!dQ&,g/\032\013\004CM\"\004\"\002\0251\001\004I\003\"B\0331\001\0041\024!C1dQ&,g/Z%e!\tIr'\003\00295\t\031\021J\034;\t\013iZA\021A\036\002\033U\004H-\031;f\003\016D\027.\032<f)\025at\bQ!D!\tIR(\003\002?5\t!QK\\5u\021\025A\023\b1\001*\021\025)\024\b1\0017\021\025\021\025\b1\0017\003\031\031H/\031;vg\")A)\017a\001m\005\031a.^7")
public final class AchieveService {
  public static void updateAchieve(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    AchieveService$.MODULE$.updateAchieve(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public static MapBean getAchieve(String paramString, int paramInt) {
    return AchieveService$.MODULE$.getAchieve(paramString, paramInt);
  }
  
  public static List<MapBean> getAchieves(String paramString) {
    return AchieveService$.MODULE$.getAchieves(paramString);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    AchieveService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    AchieveService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return AchieveService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    AchieveService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    AchieveService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return AchieveService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    AchieveService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    AchieveService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return AchieveService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    AchieveService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    AchieveService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return AchieveService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    AchieveService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    AchieveService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return AchieveService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return AchieveService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return AchieveService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\AchieveService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */