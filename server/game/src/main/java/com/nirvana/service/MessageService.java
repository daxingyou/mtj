package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001q;Q!\001\002\t\002%\ta\"T3tg\006<WmU3sm&\034WM\003\002\004\t\00591/\032:wS\016,'BA\003\007\003\035q\027N\035<b]\006T\021aB\001\004G>l7\001\001\t\003\025-i\021A\001\004\006\031\tA\t!\004\002\017\033\026\0348/Y4f'\026\024h/[2f'\tYa\002\005\002\013\037%\021\001C\001\002\020\003\n\034HO]1diN+'O^5dK\")!c\003C\001'\0051A(\0338jiz\"\022!\003\005\006+-!\tAF\001\021C\022$\007\013\\1zKJlUm]:bO\026$\022bF\017'W5z\023gM\033\021\005aYR\"A\r\013\003i\tQa]2bY\006L!\001H\r\003\tUs\027\016\036\005\006=Q\001\raH\001\ta2\f\0270\032:JIB\021\001e\t\b\0031\005J!AI\r\002\rA\023X\rZ3g\023\t!SE\001\004TiJLgn\032\006\003EeAQa\n\013A\002!\nA\001^=qKB\021\001$K\005\003Ue\0211!\0238u\021\025aC\0031\001 \003\031\031XM\0343JI\")a\006\006a\001Q\005!1.\0338e\021\025\001D\0031\001 \003!\031XM\0343OC6,\007\"\002\032\025\001\004y\022aA7tO\")A\007\006a\001?\005\031QO\0357\t\013Y\"\002\031\001\025\002\0215\034xm\030;j[\026DQ\001O\006\005\002e\n\001#\0313e\033\026\0348/Y4f%\026\034wN\0353\025\007!RD\bC\003<o\001\007q$A\005qY\006LXM]0jI\")Qh\016a\001Q\005q1\017\036:b]\036,'o\030;j[\026\034\b\"B \f\t\003\001\025\001E4fi6+7o]1hKJ+7m\034:e)\t\tu\t\005\002C\0136\t1I\003\002E\t\005!1m\034:f\023\t15IA\004NCB\024U-\0318\t\013yq\004\031A\020\t\013%[A\021\001&\002=\035,G\017\0257bs\026\024X*Z:tC\036,\027I\0343EK2,G/\032*b]\036,GCA&X!\raE+\021\b\003\033Js!AT)\016\003=S!\001\025\005\002\rq\022xn\034;?\023\005Q\022BA*\032\003\035\001\030mY6bO\026L!!\026,\003\t1K7\017\036\006\003'fAQA\b%A\002}AQ!W\006\005\002i\0131\003Z3mKR,\007\013\\1zKJlUm]:bO\026$\"\001K.\t\013mB\006\031A\020")
public final class MessageService {
  public static int deletePlayerMessage(String paramString) {
    return MessageService$.MODULE$.deletePlayerMessage(paramString);
  }
  
  public static List<MapBean> getPlayerMessageAndDeleteRange(String paramString) {
    return MessageService$.MODULE$.getPlayerMessageAndDeleteRange(paramString);
  }
  
  public static MapBean getMessageRecord(String paramString) {
    return MessageService$.MODULE$.getMessageRecord(paramString);
  }
  
  public static int addMessageRecord(String paramString, int paramInt) {
    return MessageService$.MODULE$.addMessageRecord(paramString, paramInt);
  }
  
  public static void addPlayerMessage(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3, String paramString4, String paramString5, int paramInt3) {
    MessageService$.MODULE$.addPlayerMessage(paramString1, paramInt1, paramString2, paramInt2, paramString3, paramString4, paramString5, paramInt3);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MessageService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    MessageService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return MessageService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MessageService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    MessageService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return MessageService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MessageService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    MessageService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return MessageService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MessageService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    MessageService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return MessageService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MessageService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    MessageService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return MessageService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return MessageService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return MessageService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\MessageService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */