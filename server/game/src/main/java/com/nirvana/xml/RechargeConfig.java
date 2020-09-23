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

@ScalaSignature(bytes = "\006\001\005%v!B\001\003\021\003I\021A\004*fG\"\f'oZ3D_:4\027n\032\006\003\007\021\t1\001_7m\025\t)a!A\004oSJ4\030M\\1\013\003\035\t1aY8n\007\001\001\"AC\006\016\003\t1Q\001\004\002\t\0025\021aBU3dQ\006\024x-Z\"p]\032LwmE\002\f\035Q\001\"a\004\n\016\003AQ\021!E\001\006g\016\fG.Y\005\003'A\021a!\0218z%\0264\007C\001\006\026\023\t1\"AA\005Y[2\034uN\0344jO\")\001d\003C\0013\0051A(\0338jiz\"\022!\003\005\b7-\021\r\021\"\021\035\003\0211\027\016\\3\026\003u\001\"AH\022\016\003}Q!\001I\021\002\t1\fgn\032\006\002E\005!!.\031<b\023\t!sD\001\004TiJLgn\032\005\007M-\001\013\021B\017\002\013\031LG.\032\021\t\017!Z\001\031!C\005S\005I!/Z2iCJ<Wm]\013\002UA!1\006\r\0326\033\005a#BA\027/\003\035iW\017^1cY\026T!a\f\t\002\025\r|G\016\\3di&|g.\003\0022Y\t\031Q*\0319\021\005=\031\024B\001\033\021\005\rIe\016\036\t\003\025YJ!a\016\002\003\027I+7\r[1sO\026$UM\032\005\bs-\001\r\021\"\003;\0035\021Xm\0315be\036,7o\030\023fcR\0211H\020\t\003\037qJ!!\020\t\003\tUs\027\016\036\005\ba\n\t\0211\001+\003\rAH%\r\005\007\003.\001\013\025\002\026\002\025I,7\r[1sO\026\034\b\005C\004D\027\001\007I\021\002#\002\037I,7\r[1sO\026\024Vm^1sIN,\022!\022\t\005WA2\025\n\005\003\020\017J\022\024B\001%\021\005\031!V\017\0357feA\021!BS\005\003\027\n\021\021CU3dQ\006\024x-\032*fo\006\024H\rR3g\021\035i5\0021A\005\n9\0131C]3dQ\006\024x-\032*fo\006\024Hm]0%KF$\"aO(\t\017}b\025\021!a\001\013\"1\021k\003Q!\n\025\013\001C]3dQ\006\024x-\032*fo\006\024Hm\035\021\t\017M[\001\031!C\005)\006\031\"/Z2iCJ<WMM!qa2,\027\nZ'baV\tQ\013\005\003,a\031\023\004bB,\f\001\004%I\001W\001\030e\026\034\007.\031:hKJ\n\005\017\0357f\023\022l\025\r]0%KF$\"aO-\t\017}2\026\021!a\001+\"11l\003Q!\nU\013AC]3dQ\006\024x-\032\032BaBdW-\0233NCB\004\003bB/\f\001\004%I\001V\001\022CB\004H.\032\032SK\016D\027M]4f\033\006\004\bbB0\f\001\004%I\001Y\001\026CB\004H.\032\032SK\016D\027M]4f\033\006\004x\fJ3r)\tY\024\rC\004@=\006\005\t\031A+\t\r\r\\\001\025)\003V\003I\t\007\017\0357feI+7\r[1sO\026l\025\r\035\021\t\017\025\\\001\031!C\005M\006\t\"/Z2iCJ<WM\r(pq&#W*\0319\026\003\035\004Ba\013\031GQB\021\021\016\034\b\003\037)L!a\033\t\002\rA\023X\rZ3g\023\t!SN\003\002l!!9qn\003a\001\n\023\001\030!\006:fG\"\f'oZ33\035>D\030\nZ'ba~#S-\035\013\003wEDqa\0208\002\002\003\007q\r\003\004t\027\001\006KaZ\001\023e\026\034\007.\031:hKJru\016_%e\033\006\004\b\005C\004v\027\001\007I\021\002<\002\021A\024\030N_3NCB,\022a\036\t\005WA\022\004\020\005\002\013s&\021!P\001\002\t!JL'0\032#fM\"9Ap\003a\001\n\023i\030\001\0049sSj,W*\0319`I\025\fHCA\036\021\035y40!AA\002]Dq!!\001\fA\003&q/A\005qe&TX-T1qA!9\021QA\006\005B\005\035\021\001B5oSR,\022a\017\005\b\003\027YA\021BA\004\003Eaw.\0313SK\016D\027M]4f\003B\004H.\032\005\b\003\037YA\021BA\004\003=aw.\0313SK\016D\027M]4f\035>D\bbBA\n\027\021\005\021QC\001\017O\026$(+Z2iCJ<W\rR3g)\r)\024q\003\005\b\0033\t\t\0021\0013\003)\021Xm\0315be\036,\027\n\032\005\b\003;YA\021AA\020\003E9W\r^!mYJ+7\r[1sO\026$UMZ\013\003\003C\001R!a\t\002*Ur1aDA\023\023\r\t9\003E\001\ba\006\0347.Y4f\023\021\tY#!\f\003\t1K7\017\036\006\004\003O\001\002bBA\031\027\021\005\0211G\001\025O\026$(+Z2iCJ<W\rR3g\005f$\026\020]3\025\t\005\005\022Q\007\005\b\003o\ty\0031\0013\003\021!\030\020]3\t\017\005m2\002\"\001\002>\005!r-\032;SK\016D\027M]4f%\026<\030M\0353EK\032$R!SA \003\003Bq!a\016\002:\001\007!\007C\004\002D\005e\002\031\001\032\002\t-Lg\016\032\005\b\003\017ZA\021AA%\003e9W\r\036*fG\"\f'oZ3SK^\f'\017Z:EK\032\024\0250\0233\025\007%\013Y\005C\004\002N\005\025\003\031\001\032\002\005%$\007bBA\036\027\021\005\021\021\013\013\005\003'\n\t\007E\003\002V\005%\022J\004\003\002X\005\025b\002BA-\003?j!!a\027\013\007\005u\003\"\001\004=e>|GOP\005\002#!9\021qGA(\001\004\021\004bBA3\027\021\005\021qM\001\013O\026$\030\t\0359mK&#G#\002\032\002j\0055\004bBA6\003G\002\rAM\001\nG\"\fgN\\3m\023\022Dq!!\007\002d\001\007!\007C\004\002r-!\t!a\035\002\033\035,GOU3dQ\006\024x-Z%e)\025\021\024QOA<\021\035\tY'a\034A\002IBq!!\037\002p\001\007!'A\004baBdW-\0233\t\017\005u4\002\"\001\002\000\005Aq-\032;O_bLE\rF\003i\003\003\013\031\tC\004\002l\005m\004\031\001\032\t\017\005e\0211\020a\001e!9\021qQ\006\005\002\005%\025aD4fiB\023\030N_3EK\032d\025n\035;\025\t\005-\025Q\022\t\006\003+\nI\003\037\005\b\003\037\013)\t1\0013\003%IXO\\-j]\036LE\rC\004\002\024.!\t!!&\002\027\035,G\017\025:ju\026$UM\032\013\004q\006]\005bBA'\003#\003\rA\r\005\b\0037[A\021AAO\003\021i\027-\0338\025\007m\ny\n\003\005\002\"\006e\005\031AAR\003\021\t'oZ:\021\t=\t)\013[\005\004\003O\003\"!B!se\006L\b")
public final class RechargeConfig {
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    RechargeConfig$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    RechargeConfig$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return RechargeConfig$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    RechargeConfig$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    RechargeConfig$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return RechargeConfig$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    RechargeConfig$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    RechargeConfig$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return RechargeConfig$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    RechargeConfig$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    RechargeConfig$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return RechargeConfig$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    RechargeConfig$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    RechargeConfig$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return RechargeConfig$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return RechargeConfig$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return RechargeConfig$.MODULE$.logger();
  }
  
  public static String strToArrayInt$default$2() {
    return RechargeConfig$.MODULE$.strToArrayInt$default$2();
  }
  
  public static BaseAttr buildAttrFromMapBean(MapBean paramMapBean) {
    return RechargeConfig$.MODULE$.buildAttrFromMapBean(paramMapBean);
  }
  
  public static String anyToString(Object paramObject) {
    return RechargeConfig$.MODULE$.anyToString(paramObject);
  }
  
  public static <T> T loader(String paramString, MapBean paramMapBean) {
    return RechargeConfig$.MODULE$.loader(paramString, paramMapBean);
  }
  
  public static List<Tuple2<Object, Object>> changeToList(String paramString) {
    return RechargeConfig$.MODULE$.changeToList(paramString);
  }
  
  public static List<GiveItem> strToGiveItem(String paramString) {
    return RechargeConfig$.MODULE$.strToGiveItem(paramString);
  }
  
  public static List<Tuple2<Object, Object>> strToFormatList(String paramString) {
    return RechargeConfig$.MODULE$.strToFormatList(paramString);
  }
  
  public static int[] strToArrayInt(String paramString1, String paramString2) {
    return RechargeConfig$.MODULE$.strToArrayInt(paramString1, paramString2);
  }
  
  public static BufferedInputStream getBufferedInputStream(String paramString) {
    return RechargeConfig$.MODULE$.getBufferedInputStream(paramString);
  }
  
  public static BufferedInputStream getBufferedInputStream() {
    return RechargeConfig$.MODULE$.getBufferedInputStream();
  }
  
  public static ListBuffer<MapBean> loadXml(String paramString1, String paramString2) {
    return RechargeConfig$.MODULE$.loadXml(paramString1, paramString2);
  }
  
  public static void com$nirvana$xml$XmlConfig$_setter_$md5Map_$eq(Map paramMap) {
    RechargeConfig$.MODULE$.com$nirvana$xml$XmlConfig$_setter_$md5Map_$eq(paramMap);
  }
  
  public static void com$nirvana$xml$XmlConfig$_setter_$configPath_$eq(String paramString) {
    RechargeConfig$.MODULE$.com$nirvana$xml$XmlConfig$_setter_$configPath_$eq(paramString);
  }
  
  public static Map<String, String> md5Map() {
    return RechargeConfig$.MODULE$.md5Map();
  }
  
  public static String configPath() {
    return RechargeConfig$.MODULE$.configPath();
  }
  
  public static void main(String[] paramArrayOfString) {
    RechargeConfig$.MODULE$.main(paramArrayOfString);
  }
  
  public static PrizeDef getPrizeDef(int paramInt) {
    return RechargeConfig$.MODULE$.getPrizeDef(paramInt);
  }
  
  public static List<PrizeDef> getPrizeDefList(int paramInt) {
    return RechargeConfig$.MODULE$.getPrizeDefList(paramInt);
  }
  
  public static String getNoxId(int paramInt1, int paramInt2) {
    return RechargeConfig$.MODULE$.getNoxId(paramInt1, paramInt2);
  }
  
  public static int getRechargeId(int paramInt1, int paramInt2) {
    return RechargeConfig$.MODULE$.getRechargeId(paramInt1, paramInt2);
  }
  
  public static int getAppleId(int paramInt1, int paramInt2) {
    return RechargeConfig$.MODULE$.getAppleId(paramInt1, paramInt2);
  }
  
  public static List<RechargeRewardDef> getRechargeRewardDef(int paramInt) {
    return RechargeConfig$.MODULE$.getRechargeRewardDef(paramInt);
  }
  
  public static RechargeRewardDef getRechargeRewardsDefById(int paramInt) {
    return RechargeConfig$.MODULE$.getRechargeRewardsDefById(paramInt);
  }
  
  public static RechargeRewardDef getRechargeRewardDef(int paramInt1, int paramInt2) {
    return RechargeConfig$.MODULE$.getRechargeRewardDef(paramInt1, paramInt2);
  }
  
  public static List<RechargeDef> getRechargeDefByType(int paramInt) {
    return RechargeConfig$.MODULE$.getRechargeDefByType(paramInt);
  }
  
  public static List<RechargeDef> getAllRechargeDef() {
    return RechargeConfig$.MODULE$.getAllRechargeDef();
  }
  
  public static RechargeDef getRechargeDef(int paramInt) {
    return RechargeConfig$.MODULE$.getRechargeDef(paramInt);
  }
  
  public static void init() {
    RechargeConfig$.MODULE$.init();
  }
  
  public static String file() {
    return RechargeConfig$.MODULE$.file();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\xml\RechargeConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */