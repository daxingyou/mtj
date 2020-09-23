package com.nirvana.util;

import com.nirvana.bean.BaseAttr;
import com.nirvana.bean.GiveItem;
import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import java.io.BufferedInputStream;
import scala.Function0;
import scala.Tuple2;
import scala.collection.Seq;
import scala.collection.immutable.List;
import scala.collection.mutable.ListBuffer;
import scala.collection.mutable.Map;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005<Q!\001\002\t\002%\t1\"T3tg\006<W-S\0319]*\0211\001B\001\005kRLGN\003\002\006\r\0059a.\033:wC:\f'\"A\004\002\007\r|Wn\001\001\021\005)YQ\"\001\002\007\0131\021\001\022A\007\003\0275+7o]1hK&\013\004H\\\n\004\0279!\002CA\b\023\033\005\001\"\"A\t\002\013M\034\027\r\\1\n\005M\001\"AB!osJ+g\r\005\002\02615\taC\003\002\030\t\005\031\0010\0347\n\005e1\"!\003-nY\016{gNZ5h\021\025Y2\002\"\001\035\003\031a\024N\\5u}Q\t\021\002C\004\037\027\t\007I\021I\020\002\t\031LG.Z\013\002AA\021\021EJ\007\002E)\0211\005J\001\005Y\006twMC\001&\003\021Q\027M^1\n\005\035\022#AB*ue&tw\r\003\004*\027\001\006I\001I\001\006M&dW\r\t\005\bW-\001\r\021\"\003-\003\ri\027\r]\013\002[A!afM\0336\033\005y#B\001\0312\003\035iW\017^1cY\026T!A\r\t\002\025\r|G\016\\3di&|g.\003\0025_\t\031Q*\0319\021\005YJdBA\b8\023\tA\004#\001\004Qe\026$WMZ\005\003OiR!\001\017\t\t\017qZ\001\031!C\005{\0059Q.\0319`I\025\fHC\001 B!\tyq(\003\002A!\t!QK\\5u\021\035\0215(!AA\0025\n1\001\037\0232\021\031!5\002)Q\005[\005!Q.\0319!\021\02515\002\"\021H\003\021Ig.\033;\026\003yBQ!S\006\005\n\035\0131\002\\8bI6+7o]1hK\")1j\003C\001\031\006Iq-\032;TiJLgn\032\013\003k5CQA\024&A\002U\n1a[3z\021\025Y5\002\"\001Q)\r)\024K\025\005\006\035>\003\r!\016\005\006'>\003\r\001V\001\005CJ<7\017E\002\020+^K!A\026\t\003\025q\022X\r]3bi\026$g\b\005\002\0201&\021\021\f\005\002\004\003:L\b\"B.\f\t\003a\026\001B7bS:$\"AP/\t\013MS\006\031\0010\021\007=yV'\003\002a!\t)\021I\035:bs\002")
public final class MessageI18n {
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MessageI18n$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    MessageI18n$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return MessageI18n$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MessageI18n$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    MessageI18n$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return MessageI18n$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MessageI18n$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    MessageI18n$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return MessageI18n$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MessageI18n$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    MessageI18n$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return MessageI18n$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MessageI18n$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    MessageI18n$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return MessageI18n$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return MessageI18n$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return MessageI18n$.MODULE$.logger();
  }
  
  public static String strToArrayInt$default$2() {
    return MessageI18n$.MODULE$.strToArrayInt$default$2();
  }
  
  public static BaseAttr buildAttrFromMapBean(MapBean paramMapBean) {
    return MessageI18n$.MODULE$.buildAttrFromMapBean(paramMapBean);
  }
  
  public static String anyToString(Object paramObject) {
    return MessageI18n$.MODULE$.anyToString(paramObject);
  }
  
  public static <T> T loader(String paramString, MapBean paramMapBean) {
    return MessageI18n$.MODULE$.loader(paramString, paramMapBean);
  }
  
  public static List<Tuple2<Object, Object>> changeToList(String paramString) {
    return MessageI18n$.MODULE$.changeToList(paramString);
  }
  
  public static List<GiveItem> strToGiveItem(String paramString) {
    return MessageI18n$.MODULE$.strToGiveItem(paramString);
  }
  
  public static List<Tuple2<Object, Object>> strToFormatList(String paramString) {
    return MessageI18n$.MODULE$.strToFormatList(paramString);
  }
  
  public static int[] strToArrayInt(String paramString1, String paramString2) {
    return MessageI18n$.MODULE$.strToArrayInt(paramString1, paramString2);
  }
  
  public static BufferedInputStream getBufferedInputStream(String paramString) {
    return MessageI18n$.MODULE$.getBufferedInputStream(paramString);
  }
  
  public static BufferedInputStream getBufferedInputStream() {
    return MessageI18n$.MODULE$.getBufferedInputStream();
  }
  
  public static ListBuffer<MapBean> loadXml(String paramString1, String paramString2) {
    return MessageI18n$.MODULE$.loadXml(paramString1, paramString2);
  }
  
  public static void com$nirvana$xml$XmlConfig$_setter_$md5Map_$eq(Map paramMap) {
    MessageI18n$.MODULE$.com$nirvana$xml$XmlConfig$_setter_$md5Map_$eq(paramMap);
  }
  
  public static void com$nirvana$xml$XmlConfig$_setter_$configPath_$eq(String paramString) {
    MessageI18n$.MODULE$.com$nirvana$xml$XmlConfig$_setter_$configPath_$eq(paramString);
  }
  
  public static Map<String, String> md5Map() {
    return MessageI18n$.MODULE$.md5Map();
  }
  
  public static String configPath() {
    return MessageI18n$.MODULE$.configPath();
  }
  
  public static void main(String[] paramArrayOfString) {
    MessageI18n$.MODULE$.main(paramArrayOfString);
  }
  
  public static String getString(String paramString, Seq<Object> paramSeq) {
    return MessageI18n$.MODULE$.getString(paramString, paramSeq);
  }
  
  public static String getString(String paramString) {
    return MessageI18n$.MODULE$.getString(paramString);
  }
  
  public static void init() {
    MessageI18n$.MODULE$.init();
  }
  
  public static String file() {
    return MessageI18n$.MODULE$.file();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvan\\util\MessageI18n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */