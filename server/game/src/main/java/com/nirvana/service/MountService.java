package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import java.util.Date;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001e;Q!\001\002\t\002%\tA\"T8v]R\034VM\035<jG\026T!a\001\003\002\017M,'O^5dK*\021QAB\001\b]&\024h/\0318b\025\0059\021aA2p[\016\001\001C\001\006\f\033\005\021a!\002\007\003\021\003i!\001D'pk:$8+\032:wS\016,7CA\006\017!\tQq\"\003\002\021\005\ty\021IY:ue\006\034GoU3sm&\034W\rC\003\023\027\021\0051#\001\004=S:LGO\020\013\002\023!)Qc\003C\001-\005A\021\r\0323N_VtG\017\006\003\030;\031Z\003C\001\r\034\033\005I\"\"\001\016\002\013M\034\027\r\\1\n\005qI\"\001B+oSRDQA\b\013A\002}\t\001\002\0357bs\026\024\030\n\032\t\003A\rr!\001G\021\n\005\tJ\022A\002)sK\022,g-\003\002%K\t11\013\036:j]\036T!AI\r\t\013\035\"\002\031\001\025\002\0175|WO\034;JIB\021\001$K\005\003Ue\0211!\0238u\021\025aC\0031\001.\003))\007\020]5sKRKW.\032\t\003]Mj\021a\f\006\003aE\nA!\036;jY*\t!'\001\003kCZ\f\027B\001\0330\005\021!\025\r^3\t\013YZA\021A\034\002\027\021,G.\032;f\033>,h\016\036\013\004/aJ\004\"\002\0206\001\004y\002\"B\0246\001\004A\003\"B\036\f\t\003a\024!C4fi6{WO\034;t)\tit\nE\002?\r&s!a\020#\017\005\001\033U\"A!\013\005\tC\021A\002\037s_>$h(C\001\033\023\t)\025$A\004qC\016\\\027mZ3\n\005\035C%\001\002'jgRT!!R\r\021\005)kU\"A&\013\0051#\021\001B2pe\026L!AT&\003\0175\013\007OQ3b]\")aD\017a\001?!)\021k\003C\001%\006aQ\017\0353bi\0264E.\037)feR)qc\025+V/\")a\004\025a\001?!)q\005\025a\001Q!)a\013\025a\001?\005\031!/\0333\t\013a\003\006\031\001\025\002\007A,'\017")
public final class MountService {
  public static void updateFlyPer(String paramString1, int paramInt1, String paramString2, int paramInt2) {
    MountService$.MODULE$.updateFlyPer(paramString1, paramInt1, paramString2, paramInt2);
  }
  
  public static List<MapBean> getMounts(String paramString) {
    return MountService$.MODULE$.getMounts(paramString);
  }
  
  public static void deleteMount(String paramString, int paramInt) {
    MountService$.MODULE$.deleteMount(paramString, paramInt);
  }
  
  public static void addMount(String paramString, int paramInt, Date paramDate) {
    MountService$.MODULE$.addMount(paramString, paramInt, paramDate);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MountService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    MountService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return MountService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MountService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    MountService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return MountService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MountService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    MountService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return MountService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MountService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    MountService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return MountService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MountService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    MountService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return MountService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return MountService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return MountService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\MountService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */