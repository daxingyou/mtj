package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import java.util.Date;
import scala.Function0;
import scala.Tuple2;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\0055u!B\001\003\021\003I\021a\003$be6\034VM\035<jG\026T!a\001\003\002\017M,'O^5dK*\021QAB\001\b]&\024h/\0318b\025\0059\021aA2p[\016\001\001C\001\006\f\033\005\021a!\002\007\003\021\003i!a\003$be6\034VM\035<jG\026\034\"a\003\b\021\005)y\021B\001\t\003\005=\t%m\035;sC\016$8+\032:wS\016,\007\"\002\n\f\t\003\031\022A\002\037j]&$h\bF\001\n\021\025)2\002\"\001\027\003)\031G.Z1s)&lWm\035\013\002/A\021\001dG\007\0023)\t!$A\003tG\006d\027-\003\002\0353\t!QK\\5u\021\025q2\002\"\001 \0035\tG\r\032)mCf,'OR1s[Raq\003I\025/aIbd\b\021\"E\r\")\021%\ba\001E\005A\001\017\\1zKJLE\r\005\002$M9\021\001\004J\005\003Ke\ta\001\025:fI\0264\027BA\024)\005\031\031FO]5oO*\021Q%\007\005\006Uu\001\raK\001\fo\006$XM]0uS6,7\017\005\002\031Y%\021Q&\007\002\004\023:$\b\"B\030\036\001\004Y\023aC4vCJ$w\f^5nKNDQ!M\017A\002\t\nqbZ;be\022|\006\017\\1zKJ|\026\016\032\005\006gu\001\r\001N\001\013OV\f'\017Z0uS6,\007CA\033;\033\0051$BA\0349\003\021)H/\0337\013\003e\nAA[1wC&\0211H\016\002\005\t\006$X\rC\003>;\001\0071&\001\007ti>dWM\\0uS6,7\017C\003@;\001\007A'A\006ti>dWM\\0uS6,\007\"B!\036\001\004Y\023!C4vCJ$wl\0343e\021\025\031U\0041\001,\003\r)\007\020\035\005\006\013v\001\raK\001\006Y\0264X\r\034\005\006\017v\001\raK\001\bK2,W.\0328u\021\025I5\002\"\001K\003=)\b\017Z1uK\036+\030M\0353US6,G#B\fL\0316s\005\"B\021I\001\004\021\003\"B\032I\001\004!\004\"B!I\001\004Y\003\"B\031I\001\004\021\003\"\002)\f\t\003\t\026!D1eI\036+\030M\0353US6,7\017F\002\030%NCQ!I(A\002\tBQaL(A\002-BQ!V\006\005\002Y\013\001#\0369eCR,7\013^8mK:$\026.\\3\025\t]9\006,\027\005\006CQ\003\rA\t\005\006Q\003\r\001\016\005\006{Q\003\ra\013\005\0067.!\t\001X\001\bO\026$h)\031:n)\ti&\017\005\003\031=\0024\027BA0\032\005\031!V\017\0357feA\021\021\rZ\007\002E*\0211\rB\001\005G>\024X-\003\002fE\n9Q*\0319CK\006t\007cA4pA:\021\001.\034\b\003S2l\021A\033\006\003W\"\ta\001\020:p_Rt\024\"\001\016\n\0059L\022a\0029bG.\fw-Z\005\003aF\024A\001T5ti*\021a.\007\005\006Ci\003\rA\t\005\006i.!\t!^\001\016O\026$\b\013\\1zKJ4\025M]7\025\005\0014\b\"B\021t\001\004\021\003\"\002=\f\t\003I\030!E4fi\036+\030M\0353QY\006LXM]%oMR\021\001M\037\005\006C]\004\rA\t\005\006y.!\t!`\001\017O\026$\b\013\\1zKJ4\025M]7t)\t1g\020\003\004\000w\002\007\021\021A\001\na2\f\0270\032:JIN\0042aZ8#\021\035\t)a\003C\001\003\017\t\001bZ3u\r\006\024Xn\035\013\004M\006%\001BB\021\002\004\001\007!\005C\004\002\006-!\t!!\004\025\007\031\fy\001C\004\000\003\027\001\r!!\001\t\017\005M1\002\"\001\002\026\0059\021\r\0323GCJlG#E\f\002\030\005e\021QDA\021\003K\t9#a\013\0020!1\021%!\005A\002\tBq!a\007\002\022\001\0071&A\003j]\022,\007\020C\004\002 \005E\001\031\001\022\002\017M,W\rZ0jI\"9\0211EA\t\001\004!\024!C4bS:|F/[7f\021\031Q\023\021\003a\001W!9\021\021FA\t\001\004\021\023\001D<bi\026\024x\f\0357bs\026\024\bbBA\027\003#\001\rAI\001\016gR|G.\0328`a2\f\0270\032:\t\ru\n\t\0021\001,\021\035\t\031d\003C\001\003k\tQ#\0369eCR,g)\031:n'R|G.\0328US6,7\017F\005\030\003o\tY$!\020\002@!9\021\021HA\031\001\004\021\023!\0039mCf,'oX5e\021\035\tY\"!\rA\002-Bq!!\f\0022\001\007!\005\003\004>\003c\001\ra\013\005\b\003\007ZA\021AA#\003m)\b\017Z1uKBc\027-_3s\r\006\024Xn\025;pY\026tG+[7fgR)q#a\022\002J!9\021\021HA!\001\004\021\003BB\037\002B\001\0071\006C\004\002N-!\t!a\024\0025U\004H-\031;f!2\f\0270\032:GCJlw+\031;feRKW.Z:\025\013]\t\t&a\025\t\017\005e\0221\na\001E!1!&a\023A\002-Bq!a\026\f\t\003\tI&\001\006bI\0224\025M]7M_\036$RaFA.\003;Bq!!\017\002V\001\007!\005C\004\002`\005U\003\031\001\022\002\0175,7o]1hK\"9\0211M\006\005\002\005\025\024AC4fi\032\013'/\034'pOR1\021qMA6\003[\002B!!\033pA:\021\001$\034\005\b\003s\t\t\0071\001#\021\035\ty'!\031A\002-\naA\\;nE\026\024\bbBA:\027\021\005\021QO\001\022O\026$x)Y5o\r\006\024XNT;nE\026\024HcA\026\002x!9\021\021HA9\001\004\021\003bBA>\027\021\005\021QP\001\016I\026dW\r^3GCJlGj\\4\025\007]\ty\bC\004\002:\005e\004\031\001\022\t\017\005\r5\002\"\001\002\006\006iQ\017\0353bi\0264\025M]7FqB$raFAD\003\023\013Y\tC\004\002:\005\005\005\031\001\022\t\r\r\013\t\t1\001,\021\031)\025\021\021a\001W\001")
public final class FarmService {
  public static void updateFarmExp(String paramString, int paramInt1, int paramInt2) {
    FarmService$.MODULE$.updateFarmExp(paramString, paramInt1, paramInt2);
  }
  
  public static void deleteFarmLog(String paramString) {
    FarmService$.MODULE$.deleteFarmLog(paramString);
  }
  
  public static int getGainFarmNumber(String paramString) {
    return FarmService$.MODULE$.getGainFarmNumber(paramString);
  }
  
  public static List<MapBean> getFarmLog(String paramString, int paramInt) {
    return FarmService$.MODULE$.getFarmLog(paramString, paramInt);
  }
  
  public static void addFarmLog(String paramString1, String paramString2) {
    FarmService$.MODULE$.addFarmLog(paramString1, paramString2);
  }
  
  public static void updatePlayerFarmWaterTimes(String paramString, int paramInt) {
    FarmService$.MODULE$.updatePlayerFarmWaterTimes(paramString, paramInt);
  }
  
  public static void updatePlayerFarmStolenTimes(String paramString, int paramInt) {
    FarmService$.MODULE$.updatePlayerFarmStolenTimes(paramString, paramInt);
  }
  
  public static void updateFarmStolenTimes(String paramString1, int paramInt1, String paramString2, int paramInt2) {
    FarmService$.MODULE$.updateFarmStolenTimes(paramString1, paramInt1, paramString2, paramInt2);
  }
  
  public static void addFarm(String paramString1, int paramInt1, String paramString2, Date paramDate, int paramInt2, String paramString3, String paramString4, int paramInt3) {
    FarmService$.MODULE$.addFarm(paramString1, paramInt1, paramString2, paramDate, paramInt2, paramString3, paramString4, paramInt3);
  }
  
  public static List<MapBean> getFarms(List<String> paramList) {
    return FarmService$.MODULE$.getFarms(paramList);
  }
  
  public static List<MapBean> getFarms(String paramString) {
    return FarmService$.MODULE$.getFarms(paramString);
  }
  
  public static List<MapBean> getPlayerFarms(List<String> paramList) {
    return FarmService$.MODULE$.getPlayerFarms(paramList);
  }
  
  public static MapBean getGuardPlayerInf(String paramString) {
    return FarmService$.MODULE$.getGuardPlayerInf(paramString);
  }
  
  public static MapBean getPlayerFarm(String paramString) {
    return FarmService$.MODULE$.getPlayerFarm(paramString);
  }
  
  public static Tuple2<MapBean, List<MapBean>> getFarm(String paramString) {
    return FarmService$.MODULE$.getFarm(paramString);
  }
  
  public static void updateStolenTime(String paramString, Date paramDate, int paramInt) {
    FarmService$.MODULE$.updateStolenTime(paramString, paramDate, paramInt);
  }
  
  public static void addGuardTimes(String paramString, int paramInt) {
    FarmService$.MODULE$.addGuardTimes(paramString, paramInt);
  }
  
  public static void updateGuardTime(String paramString1, Date paramDate, int paramInt, String paramString2) {
    FarmService$.MODULE$.updateGuardTime(paramString1, paramDate, paramInt, paramString2);
  }
  
  public static void addPlayerFarm(String paramString1, int paramInt1, int paramInt2, String paramString2, Date paramDate1, int paramInt3, Date paramDate2, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    FarmService$.MODULE$.addPlayerFarm(paramString1, paramInt1, paramInt2, paramString2, paramDate1, paramInt3, paramDate2, paramInt4, paramInt5, paramInt6, paramInt7);
  }
  
  public static void clearTimes() {
    FarmService$.MODULE$.clearTimes();
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    FarmService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    FarmService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return FarmService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    FarmService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    FarmService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return FarmService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    FarmService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    FarmService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return FarmService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    FarmService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    FarmService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return FarmService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    FarmService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    FarmService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return FarmService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return FarmService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return FarmService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\FarmService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */