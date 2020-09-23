package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001Q;Q!\001\002\t\002%\tq\"Q2uSZLG/_*feZL7-\032\006\003\007\021\tqa]3sm&\034WM\003\002\006\r\0059a.\033:wC:\f'\"A\004\002\007\r|Wn\001\001\021\005)YQ\"\001\002\007\0131\021\001\022A\007\003\037\005\033G/\033<jif\034VM\035<jG\026\034\"a\003\b\021\005)y\021B\001\t\003\005=\t%m\035;sC\016$8+\032:wS\016,\007\"\002\n\f\t\003\031\022A\002\037j]&$h\bF\001\n\021\025)2\002\"\001\027\003A\tG\r\032$jK2$'i\\:t%\006t7\016\006\003\030;\tZ\003C\001\r\034\033\005I\"\"\001\016\002\013M\034\027\r\\1\n\005qI\"\001B+oSRDQA\b\013A\002}\t!!\0333\021\005a\001\023BA\021\032\005\rIe\016\036\005\006GQ\001\r\001J\001\005i&lW\r\005\002&Q9\021\001DJ\005\003Oe\ta\001\025:fI\0264\027BA\025+\005\031\031FO]5oO*\021q%\007\005\006YQ\001\r\001J\001\013W&dG.\032:OC6,\007\"\002\030\f\t\003y\023\001E4fi\032KW\r\0343C_N\034(+\0318l+\005\001\004cA\0315o9\021\001DM\005\003ge\tq\001]1dW\006<W-\003\0026m\t!A*[:u\025\t\031\024\004\005\0029w5\t\021H\003\002;\t\005!1m\034:f\023\ta\024HA\004NCB\024U-\0318\t\013yZA\021A \002%\rdW-\031:GS\026dGMQ8tgJ\013gn[\013\002?!)\021i\003C\001\005\006\031\022\r\0323WSB4\025.\0327e\005>\0348OU1oWR!qc\021#F\021\025q\002\t1\001 \021\025\031\003\t1\001%\021\025a\003\t1\001%\021\02595\002\"\0010\003M9W\r\036,ja\032KW\r\0343C_N\034(+\0318l\021\025I5\002\"\001@\003U\031G.Z1s-&\004h)[3mI\n{7o\035*b].DQaS\006\005\0021\013AbZ3u/>\024H\016\032\"pgN,\022a\016\005\006\035.!\taT\001\020kB$\027\r^3X_JdGMQ8tgR\031q\004\025*\t\013Ek\005\031A\020\002\023\t|7o\035'fm\026d\007\"B*N\001\004y\022AC6jY2\034VmY8oI\002")
public final class ActivityService {
  public static int updateWorldBoss(int paramInt1, int paramInt2) {
    return ActivityService$.MODULE$.updateWorldBoss(paramInt1, paramInt2);
  }
  
  public static MapBean getWorldBoss() {
    return ActivityService$.MODULE$.getWorldBoss();
  }
  
  public static int clearVipFieldBossRank() {
    return ActivityService$.MODULE$.clearVipFieldBossRank();
  }
  
  public static List<MapBean> getVipFieldBossRank() {
    return ActivityService$.MODULE$.getVipFieldBossRank();
  }
  
  public static void addVipFieldBossRank(int paramInt, String paramString1, String paramString2) {
    ActivityService$.MODULE$.addVipFieldBossRank(paramInt, paramString1, paramString2);
  }
  
  public static int clearFieldBossRank() {
    return ActivityService$.MODULE$.clearFieldBossRank();
  }
  
  public static List<MapBean> getFieldBossRank() {
    return ActivityService$.MODULE$.getFieldBossRank();
  }
  
  public static void addFieldBossRank(int paramInt, String paramString1, String paramString2) {
    ActivityService$.MODULE$.addFieldBossRank(paramInt, paramString1, paramString2);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ActivityService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    ActivityService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return ActivityService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ActivityService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    ActivityService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return ActivityService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ActivityService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    ActivityService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return ActivityService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ActivityService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    ActivityService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return ActivityService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ActivityService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    ActivityService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return ActivityService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return ActivityService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return ActivityService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\ActivityService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */