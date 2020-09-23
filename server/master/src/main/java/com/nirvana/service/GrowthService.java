package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001E;Q!\001\002\t\002%\tQb\022:poRD7+\032:wS\016,'BA\002\005\003\035\031XM\035<jG\026T!!\002\004\002\0179L'O^1oC*\tq!A\002d_6\034\001\001\005\002\013\0275\t!AB\003\r\005!\005QBA\007He><H\017[*feZL7-Z\n\003\0279\001\"AC\b\n\005A\021!aD!cgR\024\030m\031;TKJ4\030nY3\t\013IYA\021A\n\002\rqJg.\033;?)\005I\001\"B\013\f\t\0031\022!C4fi\036\023xn\036;i)\r9R$\013\t\0031mi\021!\007\006\0035\021\tAaY8sK&\021A$\007\002\b\033\006\004()Z1o\021\025qB\0031\001 \003%\001H.Y=fe~KG\r\005\002!M9\021\021\005J\007\002E)\t1%A\003tG\006d\027-\003\002&E\0051\001K]3eK\032L!a\n\025\003\rM#(/\0338h\025\t)#\005C\003+)\001\0071&A\005he><H\017[0jIB\021\021\005L\005\003[\t\0221!\0238u\021\025y3\002\"\0011\003M9W\r^$s_^$\bNQ=QY\006LXM]%e)\t\tT\bE\0023u]q!a\r\035\017\005Q:T\"A\033\013\005YB\021A\002\037s_>$h(C\001$\023\tI$%A\004qC\016\\\027mZ3\n\005mb$\001\002'jgRT!!\017\022\t\013yq\003\031A\020\t\013}ZA\021\001!\002\027\t\fGo\0315He><H\017\033\013\005\003\022+\005\n\005\002\"\005&\0211I\t\002\005+:LG\017C\003\037}\001\007q\004C\003G}\001\007q)\001\006he><H\017[0jIN\0042A\r\036,\021\025Ie\b1\001,\003\031\021W/_0mm\")1j\003C\001\031\006aQ\017\0353bi\026<%o\\<uQR!1&\024(P\021\025q\"\n1\001 \021\025Q#\n1\001,\021\025\001&\n1\001,\003%\021XmY0d_VtG\017")
public final class GrowthService {
  public static int updateGrowth(String paramString, int paramInt1, int paramInt2) {
    return GrowthService$.MODULE$.updateGrowth(paramString, paramInt1, paramInt2);
  }
  
  public static void batchGrowth(String paramString, List<Object> paramList, int paramInt) {
    GrowthService$.MODULE$.batchGrowth(paramString, paramList, paramInt);
  }
  
  public static List<MapBean> getGrowthByPlayerId(String paramString) {
    return GrowthService$.MODULE$.getGrowthByPlayerId(paramString);
  }
  
  public static MapBean getGrowth(String paramString, int paramInt) {
    return GrowthService$.MODULE$.getGrowth(paramString, paramInt);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    GrowthService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    GrowthService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return GrowthService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    GrowthService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    GrowthService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return GrowthService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    GrowthService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    GrowthService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return GrowthService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    GrowthService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    GrowthService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return GrowthService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    GrowthService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    GrowthService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return GrowthService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return GrowthService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return GrowthService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\GrowthService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */