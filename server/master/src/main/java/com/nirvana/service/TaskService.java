package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001E<Q!\001\002\t\002%\t1\002V1tWN+'O^5dK*\0211\001B\001\bg\026\024h/[2f\025\t)a!A\004oSJ4\030M\\1\013\003\035\t1aY8n\007\001\001\"AC\006\016\003\t1Q\001\004\002\t\0025\0211\002V1tWN+'O^5dKN\0211B\004\t\003\025=I!\001\005\002\003\037\005\0237\017\036:bGR\034VM\035<jG\026DQAE\006\005\002M\ta\001P5oSRtD#A\005\t\013UYA\021\001\f\002\021\035,G\017V1tWN$\"aF\024\021\007aq\022E\004\002\03295\t!DC\001\034\003\025\0318-\0317b\023\ti\"$A\004qC\016\\\027mZ3\n\005}\001#\001\002'jgRT!!\b\016\021\005\t*S\"A\022\013\005\021\"\021\001B2pe\026L!AJ\022\003\0175\013\007OQ3b]\")\001\006\006a\001S\005A\001\017\\1zKJLE\r\005\002+[9\021\021dK\005\003Yi\ta\001\025:fI\0264\027B\001\0300\005\031\031FO]5oO*\021AF\007\005\006c-!\tAM\001\bO\026$H+Y:l)\r\t3\007\016\005\006QA\002\r!\013\005\006kA\002\rAN\001\007i\006\0348.\0233\021\005e9\024B\001\035\033\005\rIe\016\036\005\006u-!\taO\001\013kB$\027\r^3UCN\\GC\002\034={y\002%\tC\003)s\001\007\021\006C\0036s\001\007a\007C\003@s\001\007a'\001\005uCN\\G+\0379f\021\025\t\025\b1\0017\003\031\031H/\031;vg\")1)\017a\001m\005\031a.^7\t\013\025[A\021\001$\002\025\021,G.\032;f)\006\0348\016F\0027\017\"CQ\001\013#A\002%BQ!\016#A\002YBQAS\006\005\002-\013\001\003Z3mKR,G+Y:l\005f$\026\020]3\025\007YbU\nC\003)\023\002\007\021\006C\003@\023\002\007a\007C\003P\027\021\005\001+A\005bI\022DU\r\0349feR!a'U*U\021\025\021f\n1\001*\003\031!xN\\4JI\")\001F\024a\001S!)QG\024a\001m!)ak\003C\001/\006IA-\0327IK2\004XM\035\013\005maK&\fC\003S+\002\007\021\006C\003)+\002\007\021\006C\0036+\002\007a\007C\003W\027\021\005A\fF\0027;zCQAU.A\002%BQ\001K.A\002%BQ\001Y\006\005\002\005\fQbZ3u\021\026d\007/\032:MSN$HCA\fc\021\025\021v\f1\001*\021\025!7\002\"\001f\003]9W\r\036%fYB,'\017T5ti\nK\b\013\\1zKJLE\r\006\002\030M\")\001f\031a\001S!)\001n\003C\001S\006Iq-\032;IK2\004XM\035\013\005C)\\G\016C\003SO\002\007\021\006C\003)O\002\007\021\006C\0036O\002\007a\007C\003o\027\021\005q.\001\bhKRDU\r\0349fe\016{WO\034;\025\005Y\002\b\"\002*n\001\004I\003")
public final class TaskService {
  public static int getHelperCount(String paramString) {
    return TaskService$.MODULE$.getHelperCount(paramString);
  }
  
  public static MapBean getHelper(String paramString1, String paramString2, int paramInt) {
    return TaskService$.MODULE$.getHelper(paramString1, paramString2, paramInt);
  }
  
  public static List<MapBean> getHelperListByPlayerId(String paramString) {
    return TaskService$.MODULE$.getHelperListByPlayerId(paramString);
  }
  
  public static List<MapBean> getHelperList(String paramString) {
    return TaskService$.MODULE$.getHelperList(paramString);
  }
  
  public static int delHelper(String paramString1, String paramString2) {
    return TaskService$.MODULE$.delHelper(paramString1, paramString2);
  }
  
  public static int delHelper(String paramString1, String paramString2, int paramInt) {
    return TaskService$.MODULE$.delHelper(paramString1, paramString2, paramInt);
  }
  
  public static int addHelper(String paramString1, String paramString2, int paramInt) {
    return TaskService$.MODULE$.addHelper(paramString1, paramString2, paramInt);
  }
  
  public static int deleteTaskByType(String paramString, int paramInt) {
    return TaskService$.MODULE$.deleteTaskByType(paramString, paramInt);
  }
  
  public static int deleteTask(String paramString, int paramInt) {
    return TaskService$.MODULE$.deleteTask(paramString, paramInt);
  }
  
  public static int updateTask(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return TaskService$.MODULE$.updateTask(paramString, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static MapBean getTask(String paramString, int paramInt) {
    return TaskService$.MODULE$.getTask(paramString, paramInt);
  }
  
  public static List<MapBean> getTasks(String paramString) {
    return TaskService$.MODULE$.getTasks(paramString);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    TaskService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    TaskService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return TaskService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    TaskService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    TaskService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return TaskService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    TaskService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    TaskService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return TaskService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    TaskService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    TaskService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return TaskService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    TaskService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    TaskService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return TaskService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return TaskService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return TaskService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\TaskService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */