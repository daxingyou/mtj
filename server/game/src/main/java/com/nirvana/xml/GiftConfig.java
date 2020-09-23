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

@ScalaSignature(bytes = "\006\0015<Q!\001\002\t\002%\t!bR5gi\016{gNZ5h\025\t\031A!A\002y[2T!!\002\004\002\0179L'O^1oC*\tq!A\002d_6\034\001\001\005\002\013\0275\t!AB\003\r\005!\005QB\001\006HS\032$8i\0348gS\036\0342a\003\b\025!\ty!#D\001\021\025\005\t\022!B:dC2\f\027BA\n\021\005\031\te.\037*fMB\021!\"F\005\003-\t\021\021\002W7m\007>tg-[4\t\013aYA\021A\r\002\rqJg.\033;?)\005I\001bB\016\f\005\004%\t\005H\001\005M&dW-F\001\036!\tq2%D\001 \025\t\001\023%\001\003mC:<'\"\001\022\002\t)\fg/Y\005\003I}\021aa\025;sS:<\007B\002\024\fA\003%Q$A\003gS2,\007\005C\004)\027\001\007I\021B\025\002\0075\f\007/F\001+!\021Y\003GM\033\016\0031R!!\f\030\002\0175,H/\0312mK*\021q\006E\001\013G>dG.Z2uS>t\027BA\031-\005\ri\025\r\035\t\003\037MJ!\001\016\t\003\007%sG\017\005\002\013m%\021qG\001\002\b\017&4G\017R3g\021\035I4\0021A\005\ni\nq!\\1q?\022*\027\017\006\002<}A\021q\002P\005\003{A\021A!\0268ji\"9q\bOA\001\002\004Q\023a\001=%c!1\021i\003Q!\n)\nA!\\1qA!)1i\003C!\t\006!\021N\\5u+\005Y\004\"\002$\f\t\0039\025!C4fi\036Kg\r^%e)\t\021\004\nC\003J\013\002\007!'\001\004usB,\027\n\032\005\006\027.!\t\001T\001\013O\026$\030\t\0347HS\032$X#A'\021\00793\026L\004\002P):\021\001kU\007\002#*\021!\013C\001\007yI|w\016\036 \n\003EI!!\026\t\002\017A\f7m[1hK&\021q\013\027\002\005\031&\034HO\003\002V!A\021!,X\007\0027*\021A\fB\001\005G>\024X-\003\002_7\n9Q*\0319CK\006t\007\"\0021\f\t\003\t\027\001B7bS:$\"a\0172\t\013\r|\006\031\0013\002\t\005\024xm\035\t\004\037\025<\027B\0014\021\005\025\t%O]1z!\tA7N\004\002\020S&\021!\016E\001\007!J,G-\0324\n\005\021b'B\0016\021\001")
public final class GiftConfig {
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    GiftConfig$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    GiftConfig$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return GiftConfig$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    GiftConfig$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    GiftConfig$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return GiftConfig$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    GiftConfig$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    GiftConfig$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return GiftConfig$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    GiftConfig$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    GiftConfig$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return GiftConfig$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    GiftConfig$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    GiftConfig$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return GiftConfig$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return GiftConfig$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return GiftConfig$.MODULE$.logger();
  }
  
  public static String strToArrayInt$default$2() {
    return GiftConfig$.MODULE$.strToArrayInt$default$2();
  }
  
  public static BaseAttr buildAttrFromMapBean(MapBean paramMapBean) {
    return GiftConfig$.MODULE$.buildAttrFromMapBean(paramMapBean);
  }
  
  public static String anyToString(Object paramObject) {
    return GiftConfig$.MODULE$.anyToString(paramObject);
  }
  
  public static <T> T loader(String paramString, MapBean paramMapBean) {
    return GiftConfig$.MODULE$.loader(paramString, paramMapBean);
  }
  
  public static List<Tuple2<Object, Object>> changeToList(String paramString) {
    return GiftConfig$.MODULE$.changeToList(paramString);
  }
  
  public static List<GiveItem> strToGiveItem(String paramString) {
    return GiftConfig$.MODULE$.strToGiveItem(paramString);
  }
  
  public static List<Tuple2<Object, Object>> strToFormatList(String paramString) {
    return GiftConfig$.MODULE$.strToFormatList(paramString);
  }
  
  public static int[] strToArrayInt(String paramString1, String paramString2) {
    return GiftConfig$.MODULE$.strToArrayInt(paramString1, paramString2);
  }
  
  public static BufferedInputStream getBufferedInputStream(String paramString) {
    return GiftConfig$.MODULE$.getBufferedInputStream(paramString);
  }
  
  public static BufferedInputStream getBufferedInputStream() {
    return GiftConfig$.MODULE$.getBufferedInputStream();
  }
  
  public static ListBuffer<MapBean> loadXml(String paramString1, String paramString2) {
    return GiftConfig$.MODULE$.loadXml(paramString1, paramString2);
  }
  
  public static void com$nirvana$xml$XmlConfig$_setter_$md5Map_$eq(Map paramMap) {
    GiftConfig$.MODULE$.com$nirvana$xml$XmlConfig$_setter_$md5Map_$eq(paramMap);
  }
  
  public static void com$nirvana$xml$XmlConfig$_setter_$configPath_$eq(String paramString) {
    GiftConfig$.MODULE$.com$nirvana$xml$XmlConfig$_setter_$configPath_$eq(paramString);
  }
  
  public static Map<String, String> md5Map() {
    return GiftConfig$.MODULE$.md5Map();
  }
  
  public static String configPath() {
    return GiftConfig$.MODULE$.configPath();
  }
  
  public static void main(String[] paramArrayOfString) {
    GiftConfig$.MODULE$.main(paramArrayOfString);
  }
  
  public static List<MapBean> getAllGift() {
    return GiftConfig$.MODULE$.getAllGift();
  }
  
  public static int getGiftId(int paramInt) {
    return GiftConfig$.MODULE$.getGiftId(paramInt);
  }
  
  public static void init() {
    GiftConfig$.MODULE$.init();
  }
  
  public static String file() {
    return GiftConfig$.MODULE$.file();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\xml\GiftConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */