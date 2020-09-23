package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import java.util.Date;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001];Q!\001\002\t\002%\tQB\022:jK:$7+\032:wS\016,'BA\002\005\003\035\031XM\035<jG\026T!!\002\004\002\0179L'O^1oC*\tq!A\002d_6\034\001\001\005\002\013\0275\t!AB\003\r\005!\005QBA\007Ge&,g\016Z*feZL7-Z\n\003\0279\001\"AC\b\n\005A\021!aD!cgR\024\030m\031;TKJ4\030nY3\t\013IYA\021A\n\002\rqJg.\033;?)\005I\001\"B\013\f\t\0031\022!C1eI\032\023\030.\0328e)\0259\022eI\023+!\tAbD\004\002\03295\t!DC\001\034\003\025\0318-\0317b\023\ti\"$\001\004Qe\026$WMZ\005\003?\001\022aa\025;sS:<'BA\017\033\021\025\021C\0031\001\030\003!\001H.Y=fe&#\007\"\002\023\025\001\0049\022\001\0034sS\026tG-\0233\t\013\031\"\002\031A\024\002\tQL\b/\032\t\0033!J!!\013\016\003\007%sG\017C\003,)\001\007A&A\007mCN$Hk\\;dQRKW.\032\t\003[Ij\021A\f\006\003_A\nA!\036;jY*\t\021'\001\003kCZ\f\027BA\032/\005\021!\025\r^3\t\013UZA\021\001\034\002'U\004H-\031;f\031\006\034H\017V8vG\"$\026.\\3\025\007]RD\b\005\002\032q%\021\021H\007\002\005+:LG\017C\003<i\001\007q#\001\002jI\")Q\b\016a\001Y\005yA.Y:u?R|Wo\0315`i&lW\rC\003@\027\021\005\001)\001\006hKR4%/[3oIN$\"!\021(\021\007\t+\005J\004\002\032\007&\021AIG\001\ba\006\0347.Y4f\023\t1uI\001\003MSN$(B\001#\033!\tIE*D\001K\025\tYE!\001\003d_J,\027BA'K\005\035i\025\r\035\"fC:DQA\t A\002]AQ\001U\006\005\002E\013A\002Z3mKR,gI]5f]\022$\"a\n*\t\013mz\005\031A\f\t\013Q[A\021A+\002#\035,GOU3wKJ\034XM\022:jK:$7\017\006\002B-\")!e\025a\001/\001")
public final class FriendService {
  public static List<MapBean> getReverseFriends(String paramString) {
    return FriendService$.MODULE$.getReverseFriends(paramString);
  }
  
  public static int deleteFriend(String paramString) {
    return FriendService$.MODULE$.deleteFriend(paramString);
  }
  
  public static List<MapBean> getFriends(String paramString) {
    return FriendService$.MODULE$.getFriends(paramString);
  }
  
  public static void updateLastTouchTime(String paramString, Date paramDate) {
    FriendService$.MODULE$.updateLastTouchTime(paramString, paramDate);
  }
  
  public static String addFriend(String paramString1, String paramString2, int paramInt, Date paramDate) {
    return FriendService$.MODULE$.addFriend(paramString1, paramString2, paramInt, paramDate);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    FriendService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    FriendService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return FriendService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    FriendService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    FriendService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return FriendService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    FriendService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    FriendService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return FriendService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    FriendService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    FriendService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return FriendService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    FriendService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    FriendService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return FriendService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return FriendService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return FriendService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\FriendService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */