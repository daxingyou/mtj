package com.nirvana.xml;

import com.nirvana.bean.BaseAttr;
import com.nirvana.bean.GiveItem;
import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import java.io.BufferedInputStream;
import scala.Function0;
import scala.Tuple2;
import scala.collection.immutable.List;
import scala.collection.mutable.ListBuffer;
import scala.collection.mutable.Map;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\025<Q!\001\002\t\002%\tQb\0215b]:,GnQ8oM&<'BA\002\005\003\rAX\016\034\006\003\013\031\tqA\\5sm\006t\027MC\001\b\003\r\031w.\\\002\001!\tQ1\"D\001\003\r\025a!\001#\001\016\0055\031\005.\0318oK2\034uN\0344jON\0311B\004\013\021\005=\021R\"\001\t\013\003E\tQa]2bY\006L!a\005\t\003\r\005s\027PU3g!\tQQ#\003\002\027\005\tI\001,\0347D_:4\027n\032\005\0061-!\t!G\001\007y%t\027\016\036 \025\003%AqaG\006C\002\023\005C$\001\003gS2,W#A\017\021\005y\031S\"A\020\013\005\001\n\023\001\0027b]\036T\021AI\001\005U\0064\030-\003\002%?\t11\013\036:j]\036DaAJ\006!\002\023i\022!\0024jY\026\004\003b\002\025\f\001\004%I!K\001\004[\006\004X#\001\026\021\t-\002$'N\007\002Y)\021QFL\001\b[V$\030M\0317f\025\ty\003#\001\006d_2dWm\031;j_:L!!\r\027\003\0075\013\007\017\005\002\020g%\021A\007\005\002\004\023:$\bC\001\0067\023\t9$A\001\006DQ\006tg.\0327EK\032Dq!O\006A\002\023%!(A\004nCB|F%Z9\025\005mr\004CA\b=\023\ti\004C\001\003V]&$\bbB 9\003\003\005\rAK\001\004q\022\n\004BB!\fA\003&!&\001\003nCB\004\003\"B\"\f\t\003\"\025\001B5oSR,\022a\017\005\006\r.!\taR\001\016O\026$\030\t\0359DQ\006tg.\0327\025\005!s\005CA%M\035\ty!*\003\002L!\0051\001K]3eK\032L!\001J'\013\005-\003\002\"B(F\001\004\021\024!C2iC:tW\r\\%e\021\025\t6\002\"\001S\00319W\r^!mY\016C\027M\\3m+\005\031\006c\001+]?:\021QK\027\b\003-fk\021a\026\006\0031\"\ta\001\020:p_Rt\024\"A\t\n\005m\003\022a\0029bG.\fw-Z\005\003;z\023A\001T5ti*\0211\f\005\t\003A\016l\021!\031\006\003E\022\tAaY8sK&\021A-\031\002\b\033\006\004()Z1o\001")
public final class ChannelConfig {
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ChannelConfig$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    ChannelConfig$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return ChannelConfig$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ChannelConfig$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    ChannelConfig$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return ChannelConfig$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ChannelConfig$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    ChannelConfig$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return ChannelConfig$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ChannelConfig$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    ChannelConfig$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return ChannelConfig$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ChannelConfig$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    ChannelConfig$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return ChannelConfig$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return ChannelConfig$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return ChannelConfig$.MODULE$.logger();
  }
  
  public static String strToArrayInt$default$2() {
    return ChannelConfig$.MODULE$.strToArrayInt$default$2();
  }
  
  public static BaseAttr buildAttrFromMapBean(MapBean paramMapBean) {
    return ChannelConfig$.MODULE$.buildAttrFromMapBean(paramMapBean);
  }
  
  public static String anyToString(Object paramObject) {
    return ChannelConfig$.MODULE$.anyToString(paramObject);
  }
  
  public static <T> T loader(String paramString, MapBean paramMapBean) {
    return ChannelConfig$.MODULE$.loader(paramString, paramMapBean);
  }
  
  public static List<Tuple2<Object, Object>> changeToList(String paramString) {
    return ChannelConfig$.MODULE$.changeToList(paramString);
  }
  
  public static List<GiveItem> strToGiveItem(String paramString) {
    return ChannelConfig$.MODULE$.strToGiveItem(paramString);
  }
  
  public static List<Tuple2<Object, Object>> strToFormatList(String paramString) {
    return ChannelConfig$.MODULE$.strToFormatList(paramString);
  }
  
  public static int[] strToArrayInt(String paramString1, String paramString2) {
    return ChannelConfig$.MODULE$.strToArrayInt(paramString1, paramString2);
  }
  
  public static BufferedInputStream getBufferedInputStream(String paramString) {
    return ChannelConfig$.MODULE$.getBufferedInputStream(paramString);
  }
  
  public static BufferedInputStream getBufferedInputStream() {
    return ChannelConfig$.MODULE$.getBufferedInputStream();
  }
  
  public static ListBuffer<MapBean> loadXml(String paramString1, String paramString2) {
    return ChannelConfig$.MODULE$.loadXml(paramString1, paramString2);
  }
  
  public static void com$nirvana$xml$XmlConfig$_setter_$md5Map_$eq(Map paramMap) {
    ChannelConfig$.MODULE$.com$nirvana$xml$XmlConfig$_setter_$md5Map_$eq(paramMap);
  }
  
  public static void com$nirvana$xml$XmlConfig$_setter_$configPath_$eq(String paramString) {
    ChannelConfig$.MODULE$.com$nirvana$xml$XmlConfig$_setter_$configPath_$eq(paramString);
  }
  
  public static Map<String, String> md5Map() {
    return ChannelConfig$.MODULE$.md5Map();
  }
  
  public static String configPath() {
    return ChannelConfig$.MODULE$.configPath();
  }
  
  public static List<MapBean> getAllChanel() {
    return ChannelConfig$.MODULE$.getAllChanel();
  }
  
  public static String getAppChannel(int paramInt) {
    return ChannelConfig$.MODULE$.getAppChannel(paramInt);
  }
  
  public static void init() {
    ChannelConfig$.MODULE$.init();
  }
  
  public static String file() {
    return ChannelConfig$.MODULE$.file();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\xml\ChannelConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */