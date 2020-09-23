package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import java.util.Date;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\021<Q!\001\002\t\002%\t1BU5eKN+'O^5dK*\0211\001B\001\bg\026\024h/[2f\025\t)a!A\004oSJ4\030M\\1\013\003\035\t1aY8n\007\001\001\"AC\006\016\003\t1Q\001\004\002\t\0025\0211BU5eKN+'O^5dKN\0211B\004\t\003\025=I!\001\005\002\003\037\005\0237\017\036:bGR\034VM\035<jG\026DQAE\006\005\002M\ta\001P5oSRtD#A\005\t\013UYA\021\001\f\002\021\035,GOU5eKN$\"aF\026\021\007a\021SE\004\002\032?9\021!$H\007\0027)\021A\004C\001\007yI|w\016\036 \n\003y\tQa]2bY\006L!\001I\021\002\017A\f7m[1hK*\ta$\003\002$I\t!A*[:u\025\t\001\023\005\005\002'S5\tqE\003\002)\t\005!1m\034:f\023\tQsEA\004NCB\024U-\0318\t\0131\"\002\031A\027\002\021Ad\027-_3s\023\022\004\"A\f\032\017\005=\002T\"A\021\n\005E\n\023A\002)sK\022,g-\003\0024i\t11\013\036:j]\036T!!M\021\t\013YZA\021A\034\002\017\005$GMU5eKR)\001h\017\037B\007B\021q&O\005\003u\005\022A!\0268ji\")A&\016a\001[!)Q(\016a\001}\0051!/\0333f\023\022\004\"aL \n\005\001\013#aA%oi\")!)\016a\001}\00511\017^1ukNDQ\001R\033A\002\025\013!\"\032=qSJ,G+[7f!\t15*D\001H\025\tA\025*\001\003vi&d'\"\001&\002\t)\fg/Y\005\003\031\036\023A\001R1uK\")aj\003C\001\037\0069A-\0327SS\022,Gc\001\035Q#\")A&\024a\001[!)Q(\024a\001}!)1k\003C\001)\006aQ\017\0353bi\026\034F/\031;vgR!\001(\026,X\021\025a#\0131\001.\021\025i$\0131\001?\021\025\021%\0131\001?\021\025I6\002\"\001[\003-9W\r\036*jI\0264U-\0323\025\005\025Z\006\"\002\027Y\001\004i\003\"B/\f\t\003q\026AD;qI\006$XMU5eK\032+W\r\032\013\005q}\003'\rC\003-9\002\007Q\006C\003b9\002\007a(A\003mKZ,G\016C\003d9\002\007a(A\002fqB\004")
public final class RideService {
  public static void updateRideFeed(String paramString, int paramInt1, int paramInt2) {
    RideService$.MODULE$.updateRideFeed(paramString, paramInt1, paramInt2);
  }
  
  public static MapBean getRideFeed(String paramString) {
    return RideService$.MODULE$.getRideFeed(paramString);
  }
  
  public static void updateStatus(String paramString, int paramInt1, int paramInt2) {
    RideService$.MODULE$.updateStatus(paramString, paramInt1, paramInt2);
  }
  
  public static void delRide(String paramString, int paramInt) {
    RideService$.MODULE$.delRide(paramString, paramInt);
  }
  
  public static void addRide(String paramString, int paramInt1, int paramInt2, Date paramDate) {
    RideService$.MODULE$.addRide(paramString, paramInt1, paramInt2, paramDate);
  }
  
  public static List<MapBean> getRides(String paramString) {
    return RideService$.MODULE$.getRides(paramString);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    RideService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    RideService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return RideService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    RideService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    RideService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return RideService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    RideService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    RideService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return RideService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    RideService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    RideService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return RideService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    RideService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    RideService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return RideService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return RideService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return RideService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\RideService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */