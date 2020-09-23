package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import java.util.Date;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005ut!B\001\003\021\003I\021\001D(uQ\026\0248+\032:wS\016,'BA\002\005\003\035\031XM\035<jG\026T!!\002\004\002\0179L'O^1oC*\tq!A\002d_6\034\001\001\005\002\013\0275\t!AB\003\r\005!\005QB\001\007Pi\",'oU3sm&\034Wm\005\002\f\035A\021!bD\005\003!\t\021q\"\0212tiJ\f7\r^*feZL7-\032\005\006%-!\taE\001\007y%t\027\016\036 \025\003%AQ!F\006\005\002Y\t\021cZ3u\t\006LG.\037+j[\026\034H*[:u)\t9r\005E\002\031=\005r!!\007\017\016\003iQ\021aG\001\006g\016\fG.Y\005\003;i\tq\001]1dW\006<W-\003\002 A\t!A*[:u\025\ti\"\004\005\002#K5\t1E\003\002%\t\005!1m\034:f\023\t13EA\004NCB\024U-\0318\t\013!\"\002\031A\025\002\021Ad\027-_3s\023\022\004\"AK\027\017\005eY\023B\001\027\033\003\031\001&/\0323fM&\021af\f\002\007'R\024\030N\\4\013\0051R\002\"B\031\f\t\003\021\024\001E;qI\006$X\rR1jYf$\026.\\3t)\025\031dgN\035?!\tIB'\003\00265\t!QK\\5u\021\025A\003\0071\001*\021\025A\004\0071\001*\003\tIG\rC\003;a\001\0071(\001\005vg\026$\026.\\3t!\tIB(\003\002>5\t\031\021J\034;\t\013}\002\004\031A\036\002\021\t,\030\020V5nKNDQ!Q\006\005\002\t\013\021#\0338d\t\006LG._+tK\022$\026.\\3t)\021\0314\tR#\t\013!\002\005\031A\025\t\013a\002\005\031A\025\t\017\031\003\005\023!a\001w\005)1m\\;oi\")\001j\003C\001\023\006qA-\0327fi\026\fE\016\034+j[\026\034X#A\032\t\013-[A\021\001'\002\033\035,GOR;oG\016#E*[:u)\t9R\nC\003)\025\002\007\021\006C\003P\027\021\005\001+A\006sKN,GOR;oG\016#E#B\032R%Rs\006\"\002\025O\001\004I\003\"B*O\001\004I\023aA6fs\")QK\024a\001-\006I1\017^1siRKW.\032\t\003/rk\021\001\027\006\0033j\013A!\036;jY*\t1,\001\003kCZ\f\027BA/Y\005\021!\025\r^3\t\013}s\005\031A\036\002\031=tG.\0338f'\026\034wN\0343\t\013\005\\A\021\0012\002\031\021,G.\032;f\rVt7m\021#\025\007M\032G\rC\003)A\002\007\021\006C\003TA\002\007\021\006C\003g\027\021\005q-\001\004hKR4\026\016\035\013\003C!DQ\001K3A\002%BQA[\006\005\002-\f\021\"\0369eCR,g+\0339\025\021MbWn\\9tk^DQ\001K5A\002%BQA\\5A\002m\nQ\001\\3wK2DQ\001]5A\002m\n1!\032=q\021\025\021\030\0161\001<\003\r\021XN\031\005\006i&\004\raO\001\017M&\0248\017^0sK\016D\027M]4f\021\0251\030\0161\001<\003E1\027N]:u?N\002tL]3dQ\006\024x-\032\005\006q&\004\rAV\001\013Kb\004\030N]3US6,\007\"\002>\f\t\003Y\030\001F;qI\006$XMV5q\031\0264X\r\\!oIJk'\rF\0034yvtx\020C\003)s\002\007\021\006C\003ss\002\0071\bC\003us\002\0071\bC\003ws\002\0071\bC\004\002\004-!\t!!\002\002#U\004H-\031;f-&\004H*\032<fY\026C\b\017F\0044\003\017\tI!a\003\t\r!\n\t\0011\001*\021\031q\027\021\001a\001w!1\001/!\001A\002mBq!a\004\f\t\003\t\t\"A\005hKR\fE\016\034,jaV\tq\003C\004\002\026-!\t!a\006\002%\035,GoR5gi&#\027I\0343Ti\006$Xo\035\013\006/\005e\021Q\004\005\b\0037\t\031\0021\001*\003%\001H.Y=fe~KG\rC\004\002 \005M\001\031\001,\002\tQLW.\032\005\b\003GYA\021AA\023\003!9W\r^$jMR\034H#B\f\002(\005%\002bBA\016\003C\001\r!\013\005\b\003?\t\t\0031\001W\021\035\tic\003C\001\003_\t\021cZ3u+:\034G.Y5nK\022<\025N\032;t)\0059\002bBA\032\027\021\005\021QG\001\013kB$\027\r^3HS\032$H#B\036\0028\005m\002bBA\035\003c\001\raO\001\007gR\fG/^:\t\017\005u\022\021\007a\001w\005Qa.Z<`gR\fG/^:\t\017\005\0053\002\"\001\002D\0059\021\r\0323HS\032$H#D\032\002F\005\035\0231JA'\003#\n)\006C\004\002\034\005}\002\031A\025\t\017\005%\023q\ba\001w\0059q-\0334u?&$\007bBA\035\003\001\ra\017\005\b\003\037\ny\0041\001*\003\035\021Xm^1sINDq!a\025\002@\001\007a+\001\005bI\022|F/[7f\021\035\t9&a\020A\002Y\013\001\"\0328e?RLW.\032\005\b\003gYA\021AA.)\035Y\024QLA0\003CBq!a\007\002Z\001\007\021\006C\004\002J\005e\003\031A\036\t\017\005e\022\021\fa\001w!I\021QM\006\022\002\023\005\021qM\001\034S:\034G)Y5msV\033X\r\032+j[\026\034H\005Z3gCVdG\017J\032\026\005\005%$fA\036\002l-\022\021Q\016\t\005\003_\nI(\004\002\002r)!\0211OA;\003%)hn\0315fG.,GMC\002\002xi\t!\"\0318o_R\fG/[8o\023\021\tY(!\035\003#Ut7\r[3dW\026$g+\031:jC:\034W\r")
public final class OtherService {
  public static int incDailyUsedTimes$default$3() {
    return OtherService$.MODULE$.incDailyUsedTimes$default$3();
  }
  
  public static int updateGift(String paramString, int paramInt1, int paramInt2) {
    return OtherService$.MODULE$.updateGift(paramString, paramInt1, paramInt2);
  }
  
  public static void addGift(String paramString1, int paramInt1, int paramInt2, String paramString2, Date paramDate1, Date paramDate2) {
    OtherService$.MODULE$.addGift(paramString1, paramInt1, paramInt2, paramString2, paramDate1, paramDate2);
  }
  
  public static int updateGift(int paramInt1, int paramInt2) {
    return OtherService$.MODULE$.updateGift(paramInt1, paramInt2);
  }
  
  public static List<MapBean> getUnclaimedGifts() {
    return OtherService$.MODULE$.getUnclaimedGifts();
  }
  
  public static List<MapBean> getGifts(String paramString, Date paramDate) {
    return OtherService$.MODULE$.getGifts(paramString, paramDate);
  }
  
  public static List<MapBean> getGiftIdAndStatus(String paramString, Date paramDate) {
    return OtherService$.MODULE$.getGiftIdAndStatus(paramString, paramDate);
  }
  
  public static List<MapBean> getAllVip() {
    return OtherService$.MODULE$.getAllVip();
  }
  
  public static void updateVipLevelExp(String paramString, int paramInt1, int paramInt2) {
    OtherService$.MODULE$.updateVipLevelExp(paramString, paramInt1, paramInt2);
  }
  
  public static void updateVipLevelAndRmb(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    OtherService$.MODULE$.updateVipLevelAndRmb(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public static void updateVip(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Date paramDate) {
    OtherService$.MODULE$.updateVip(paramString, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramDate);
  }
  
  public static MapBean getVip(String paramString) {
    return OtherService$.MODULE$.getVip(paramString);
  }
  
  public static void deleteFuncCD(String paramString1, String paramString2) {
    OtherService$.MODULE$.deleteFuncCD(paramString1, paramString2);
  }
  
  public static void resetFuncCD(String paramString1, String paramString2, Date paramDate, int paramInt) {
    OtherService$.MODULE$.resetFuncCD(paramString1, paramString2, paramDate, paramInt);
  }
  
  public static List<MapBean> getFuncCDList(String paramString) {
    return OtherService$.MODULE$.getFuncCDList(paramString);
  }
  
  public static void deleteAllTimes() {
    OtherService$.MODULE$.deleteAllTimes();
  }
  
  public static void incDailyUsedTimes(String paramString1, String paramString2, int paramInt) {
    OtherService$.MODULE$.incDailyUsedTimes(paramString1, paramString2, paramInt);
  }
  
  public static void updateDailyTimes(String paramString1, String paramString2, int paramInt1, int paramInt2) {
    OtherService$.MODULE$.updateDailyTimes(paramString1, paramString2, paramInt1, paramInt2);
  }
  
  public static List<MapBean> getDailyTimesList(String paramString) {
    return OtherService$.MODULE$.getDailyTimesList(paramString);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    OtherService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    OtherService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return OtherService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    OtherService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    OtherService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return OtherService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    OtherService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    OtherService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return OtherService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    OtherService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    OtherService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return OtherService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    OtherService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    OtherService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return OtherService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return OtherService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return OtherService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\OtherService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */