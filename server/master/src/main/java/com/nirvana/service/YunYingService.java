package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import java.util.Date;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\t=t!B\001\003\021\003I\021AD-v]fKgnZ*feZL7-\032\006\003\007\021\tqa]3sm&\034WM\003\002\006\r\0059a.\033:wC:\f'\"A\004\002\007\r|Wn\001\001\021\005)YQ\"\001\002\007\0131\021\001\022A\007\003\035e+h.W5oON+'O^5dKN\0211B\004\t\003\025=I!\001\005\002\003\037\005\0237\017\036:bGR\034VM\035<jG\026DQAE\006\005\002M\ta\001P5oSRtD#A\005\t\013UYA\021\001\f\002\037\035,GoU3wK:$\025-\037'jgR$2aF\0241!\rAb$\t\b\0033qi\021A\007\006\0027\005)1oY1mC&\021QDG\001\ba\006\0347.Y4f\023\ty\002E\001\003MSN$(BA\017\033!\t\021S%D\001$\025\t!C!\001\003d_J,\027B\001\024$\005\035i\025\r\035\"fC:DQ\001\013\013A\002%\n\001\002\0357bs\026\024\030\n\032\t\003U5r!!G\026\n\0051R\022A\002)sK\022,g-\003\002/_\t11\013\036:j]\036T!\001\f\016\t\013E\"\002\031\001\032\002\023e,h._5oO&#\007CA\r4\023\t!$DA\002J]RDQAN\006\005\002]\nqbZ3u\023R,W.\022=dQ\006tw-\032\013\004/aJ\004\"\002\0256\001\004I\003\"B\0316\001\004\021\004\"B\036\f\t\003a\024aD1eI&#X-\\#yG\"\fgnZ3\025\tIjdh\020\005\006Qi\002\r!\013\005\006ci\002\rA\r\005\006\001j\002\rAM\001\007SR,W.\0233\t\013\t[A\021A\"\0025%t7M]3bg\026LE/Z7Fq\016D\027M\\4f\007>,h\016^:\025\tI\"UI\022\005\006Q\005\003\r!\013\005\006c\005\003\rA\r\005\006\001\006\003\rA\r\005\006\021.!\t!S\001\fO\026$8)Y:i\017&4G\017F\002\030\025.CQ\001K$A\002%BQ!M$A\002IBQ!T\006\005\0029\013abZ3u%\026\034\007.\031:hK\022\013\027\020\006\003\030\037B\023\006\"\002\025M\001\004I\003\"B)M\001\004\021\024\001B<fK.DQa\025'A\002I\nA\001Z1zg\")Qk\003C\001-\006\001\022N\\:feR<u\016\0343t\t\006LG.\037\013\006/j[F,\030\t\0033aK!!\027\016\003\tUs\027\016\036\005\006QQ\003\r!\013\005\006#R\003\rA\r\005\006'R\003\rA\r\005\006=R\003\rAM\001\006O>dGm\035\005\006A.!\t!Y\001\021kB$\027\r^3H_2$7\017R1jYf$Ra\0262dI\026DQ\001K0A\002%BQ!U0A\002IBQaU0A\002IBQAX0A\002IBQaZ\006\005\002!\f\021#\0338tKJ$H+[7fg^+Wm\0337z)\0259\026N[6m\021\025Ac\r1\001*\021\025\tf\r1\0013\021\025\031f\r1\0013\021\025qf\r1\0013\021\025q7\002\"\001p\003E)\b\017Z1uKRKW.Z:XK\026\\G.\037\013\006/B\f(o\035\005\006Q5\004\r!\013\005\006#6\004\rA\r\005\006'6\004\rA\r\005\006i6\004\rAM\001\006i&lWm\035\005\006m.!\ta^\001\022kB$\027\r^3SK\016D\027M]4f\t\006LH\003\002\032ysnDQ\001K;A\002%BQA_;A\002I\n!!\0333\t\013Q,\b\031\001\032\t\013u\\A\021\001@\002#%t7/\032:u%\026\034\007.\031:hK\022\013\027\020\006\0073\006\005\0211AA\003\003\017\tY\001C\003)y\002\007\021\006C\003Ry\002\007!\007C\003Ty\002\007!\007C\003{y\002\007!\007\003\004\002\nq\004\rAM\001\005if\004X\rC\003uy\002\007!\007C\004\002\020-!\t!!\005\002-\035,GOT8u!&\0347.\0323HS\032$8\017R1jYf$RaFA\n\003+Aa!UA\007\001\004\021\004BB*\002\016\001\007!\007C\004\002\032-!\t!a\007\002\037\rdW-\031:HS\032$8\017R1jYf$RAMA\017\003?Aa!UA\f\001\004\021\004BB*\002\030\001\007!\007C\004\002$-!\t!!\n\002/\035,GOT8u!&\0347.\0323HS\032$8oV3fW2LHcA\f\002(!1\021+!\tA\002IBq!a\013\f\t\003\ti#\001\tdY\026\f'oR5giN<V-Z6msR\031!'a\f\t\rE\013I\0031\0013\021\035\t\031d\003C\001\003k\t\001cZ3u\007\006\034\bnR5giRKW.Z:\025\017I\n9$!\017\002<!1\001&!\rA\002%Ba!MA\031\001\004\021\004bBA\037\003c\001\rAM\001\013e\026\034\007.\031:hK&#\007bBA!\027\021\005\0211I\001\fC\022$7)Y:i\017&4G\017F\0043\003\013\n9%!\023\t\r!\ny\0041\001*\021\031\t\024q\ba\001e!9\021QHA \001\004\021\004bBA'\027\021\005\021qJ\001\027S:\034'/Z1tK\016\0137\017[$jMR\034u.\0368ugR9!'!\025\002T\005U\003B\002\025\002L\001\007\021\006\003\0042\003\027\002\rA\r\005\b\003{\tY\0051\0013\021\035\tIf\003C\001\0037\na\"\0369eCR,7+\032<f]\022\013\027\020F\006X\003;\ny&!\031\002d\005\035\004B\002\025\002X\001\007\021\006\003\004{\003/\002\rA\r\005\007c\005]\003\031\001\032\t\017\005\025\024q\013a\001e\00511\017^1ukNDq!!\033\002X\001\007!'A\002ok6Dq!!\034\f\t\003\ty'A\013hKR\034VM^3o\t\006L(+Z<be\022d\025n\035;\025\013]\t\t(a\035\t\r!\nY\0071\001*\021\031\t\0241\016a\001e!9\021qO\006\005\002\005e\024\001F;qI\006$XmU3wK:$\025-\037*fo\006\024H\rF\005X\003w\ni(a \002\002\"1\001&!\036A\002%BaA_A;\001\004\021\004BB\031\002v\001\007!\007C\004\002f\005U\004\031\001\032\t\017\005\0255\002\"\001\002\b\006yq-\032;Zk:L\026N\\4US6,7\017F\001\030\021\035\tYi\003C\001\003\033\0131\"\0313e\005VLH+[7fgR)!'a$\002\024\"9\021\021SAE\001\004\021\024!\001;\t\017\005U\025\021\022a\001e\005)Ao\034;bY\"9\021\021T\006\005\002\005m\025AE1eIf+h.W5oO\n+\030\020V5nKN$rAMAO\003C\013\031\013C\004\002 \006]\005\031A\025\002\023Ad\027-_3s?&$\007bBAI\003/\003\rA\r\005\b\003S\n9\n1\0013\021\035\t9k\003C\001\003S\013qbZ3u!2\f\0270\032:SK\016|'\017\032\013\004/\005-\006bBA\005\003K\003\rA\r\005\b\003_[A\021AAY\003=\tG\r\032)mCf,'OU3d_J$Gc\002\032\0024\006U\026q\027\005\b\003?\013i\0131\001*\021\035\tI!!,A\002IBq!!\033\002.\002\007!\007C\004\002<.!\t!!0\002%\021,G.\032;f!2\f\0270\032:SK\016|'\017\032\013\004/\006}\006bBA\005\003s\003\rA\r\005\b\003\007\\A\021AAc\003E\tG\r\032%jY\006\024\030\016^=SK\016|'\017\032\013\be\005\035\027\021ZAg\021\035\ty*!1A\002%Bq!a3\002B\002\007!'\001\005iS2\f'/\033;z\021\035\ty-!1A\002I\nQA^1mk\026Dq!a5\f\t\003\t).\001\013eK2,G/\032%jY\006\024\030\016^=SK\016|'\017\032\013\002e!9\021\021\\\006\005\002\005m\027!E1eIBc\027-_3s\021&d\027M]5usRI!'!8\002`\006\r\030q\035\005\b\003?\0139\0161\001*\021\035\t\t/a6A\002%\nQB]3xCJ$wL]3d_J$\007bBAs\003/\004\rAM\001\017Q&d\027M]5us~3\030\r\\;f\021\035\tI/a6A\002I\nA\003[5mCJLG/_0wC2,Xm\030;pi\006d\007bBAw\027\021\005\021Q[\001\025I\026dW\r^3QY\006LXM\035%jY\006\024\030\016^=\t\017\005E8\002\"\001\002t\006\021r-\032;QY\006LXM]'jI\006+H/^7o)\r\t\023Q\037\005\b\003?\013y\0171\001*\021\035\tIp\003C\001\003w\f!#\0313e!2\f\0270\032:NS\022\fU\017^;n]R9!'!@\002\000\n\r\001bBAP\003o\004\r!\013\005\b\005\003\t9\0201\0013\003)awnZ5o?\022\f\027p\035\005\b\005\013\t9\0201\001*\003!9W\r^0eCf\034\bb\002B\005\027\021\005!1B\001\022C\022$\007\013\\1zKJ\034En\\;e\005VLH#\004\032\003\016\t=!1\003B\f\0057\021y\003C\004\002 \n\035\001\031A\025\t\017\tE!q\001a\001e\005!1.\0338e\021\035\021)Ba\002A\002%\nAA\\1nK\"9!\021\004B\004\001\004\021\024!\0032vs~#\030.\\3t\021)\021iBa\002\021\002\003\007!qD\001\tC\022$w\f^5nKB!!\021\005B\026\033\t\021\031C\003\003\003&\t\035\022\001B;uS2T!A!\013\002\t)\fg/Y\005\005\005[\021\031C\001\003ECR,\007b\002B\031\005\017\001\rAM\001\002g\"9!QG\006\005\002\005\035\025!E4fiBc\027-_3s\0072|W\017\032\"vs\"9!\021H\006\005\002\005U\027aE2mK\006\024\b\013\\1zKJ\034En\\;e\005VL\bb\002B\037\027\021\005!qH\001\022C\022$7\t\\8vI^KgNU3d_J$G#\004\032\003B\t\025#\021\nB&\005\033\022y\005C\004\003D\tm\002\031\001\032\002\025e,h._5oO~KG\rC\004\003H\tm\002\031\001\032\002\007%$\007\020C\004\002 \nm\002\031A\025\t\017\tE!1\ba\001e!9!Q\003B\036\001\004I\003B\002;\003<\001\007!\007C\004\003T-!\t!a\"\002\035\035,Go\0217pk\022\024VmY8sI\"I!qK\006\022\002\023\005!\021L\001\034C\022$\007\013\\1zKJ\034En\\;e\005VLH\005Z3gCVdG\017J\033\026\005\tm#\006\002B\020\005;Z#Aa\030\021\t\t\005$1N\007\003\005GRAA!\032\003h\005IQO\\2iK\016\\W\r\032\006\004\005SR\022AC1o]>$\030\r^5p]&!!Q\016B2\005E)hn\0315fG.,GMV1sS\006t7-\032")
public final class YunYingService {
  public static Date addPlayerCloudBuy$default$5() {
    return YunYingService$.MODULE$.addPlayerCloudBuy$default$5();
  }
  
  public static List<MapBean> getCloudRecord() {
    return YunYingService$.MODULE$.getCloudRecord();
  }
  
  public static int addCloudWinRecord(int paramInt1, int paramInt2, String paramString1, int paramInt3, String paramString2, int paramInt4) {
    return YunYingService$.MODULE$.addCloudWinRecord(paramInt1, paramInt2, paramString1, paramInt3, paramString2, paramInt4);
  }
  
  public static int clearPlayerCloudBuy() {
    return YunYingService$.MODULE$.clearPlayerCloudBuy();
  }
  
  public static List<MapBean> getPlayerCloudBuy() {
    return YunYingService$.MODULE$.getPlayerCloudBuy();
  }
  
  public static int addPlayerCloudBuy(String paramString1, int paramInt1, String paramString2, int paramInt2, Date paramDate, int paramInt3) {
    return YunYingService$.MODULE$.addPlayerCloudBuy(paramString1, paramInt1, paramString2, paramInt2, paramDate, paramInt3);
  }
  
  public static int addPlayerMidAutumn(String paramString1, int paramInt, String paramString2) {
    return YunYingService$.MODULE$.addPlayerMidAutumn(paramString1, paramInt, paramString2);
  }
  
  public static MapBean getPlayerMidAutumn(String paramString) {
    return YunYingService$.MODULE$.getPlayerMidAutumn(paramString);
  }
  
  public static int deletePlayerHilarity() {
    return YunYingService$.MODULE$.deletePlayerHilarity();
  }
  
  public static int addPlayerHilarity(String paramString1, String paramString2, int paramInt1, int paramInt2) {
    return YunYingService$.MODULE$.addPlayerHilarity(paramString1, paramString2, paramInt1, paramInt2);
  }
  
  public static int deleteHilarityRecord() {
    return YunYingService$.MODULE$.deleteHilarityRecord();
  }
  
  public static int addHilarityRecord(String paramString, int paramInt1, int paramInt2) {
    return YunYingService$.MODULE$.addHilarityRecord(paramString, paramInt1, paramInt2);
  }
  
  public static void deletePlayerRecord(int paramInt) {
    YunYingService$.MODULE$.deletePlayerRecord(paramInt);
  }
  
  public static int addPlayerRecord(String paramString, int paramInt1, int paramInt2) {
    return YunYingService$.MODULE$.addPlayerRecord(paramString, paramInt1, paramInt2);
  }
  
  public static List<MapBean> getPlayerRecord(int paramInt) {
    return YunYingService$.MODULE$.getPlayerRecord(paramInt);
  }
  
  public static int addYunYingBuyTimes(String paramString, int paramInt1, int paramInt2) {
    return YunYingService$.MODULE$.addYunYingBuyTimes(paramString, paramInt1, paramInt2);
  }
  
  public static int addBuyTimes(int paramInt1, int paramInt2) {
    return YunYingService$.MODULE$.addBuyTimes(paramInt1, paramInt2);
  }
  
  public static List<MapBean> getYunYingTimes() {
    return YunYingService$.MODULE$.getYunYingTimes();
  }
  
  public static void updateSevenDayReward(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    YunYingService$.MODULE$.updateSevenDayReward(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public static List<MapBean> getSevenDayRewardList(String paramString, int paramInt) {
    return YunYingService$.MODULE$.getSevenDayRewardList(paramString, paramInt);
  }
  
  public static void updateSevenDay(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    YunYingService$.MODULE$.updateSevenDay(paramString, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static int increaseCashGiftCounts(String paramString, int paramInt1, int paramInt2) {
    return YunYingService$.MODULE$.increaseCashGiftCounts(paramString, paramInt1, paramInt2);
  }
  
  public static int addCashGift(String paramString, int paramInt1, int paramInt2) {
    return YunYingService$.MODULE$.addCashGift(paramString, paramInt1, paramInt2);
  }
  
  public static int getCashGiftTimes(String paramString, int paramInt1, int paramInt2) {
    return YunYingService$.MODULE$.getCashGiftTimes(paramString, paramInt1, paramInt2);
  }
  
  public static int clearGiftsWeekly(int paramInt) {
    return YunYingService$.MODULE$.clearGiftsWeekly(paramInt);
  }
  
  public static List<MapBean> getNotPickedGiftsWeekly(int paramInt) {
    return YunYingService$.MODULE$.getNotPickedGiftsWeekly(paramInt);
  }
  
  public static int clearGiftsDaily(int paramInt1, int paramInt2) {
    return YunYingService$.MODULE$.clearGiftsDaily(paramInt1, paramInt2);
  }
  
  public static List<MapBean> getNotPickedGiftsDaily(int paramInt1, int paramInt2) {
    return YunYingService$.MODULE$.getNotPickedGiftsDaily(paramInt1, paramInt2);
  }
  
  public static int insertRechargeDay(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    return YunYingService$.MODULE$.insertRechargeDay(paramString, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public static int updateRechargeDay(String paramString, int paramInt1, int paramInt2) {
    return YunYingService$.MODULE$.updateRechargeDay(paramString, paramInt1, paramInt2);
  }
  
  public static void updateTimesWeekly(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    YunYingService$.MODULE$.updateTimesWeekly(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public static void insertTimesWeekly(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    YunYingService$.MODULE$.insertTimesWeekly(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public static void updateGoldsDaily(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    YunYingService$.MODULE$.updateGoldsDaily(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public static void insertGoldsDaily(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    YunYingService$.MODULE$.insertGoldsDaily(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public static List<MapBean> getRechargeDay(String paramString, int paramInt1, int paramInt2) {
    return YunYingService$.MODULE$.getRechargeDay(paramString, paramInt1, paramInt2);
  }
  
  public static List<MapBean> getCashGift(String paramString, int paramInt) {
    return YunYingService$.MODULE$.getCashGift(paramString, paramInt);
  }
  
  public static int increaseItemExchangeCounts(String paramString, int paramInt1, int paramInt2) {
    return YunYingService$.MODULE$.increaseItemExchangeCounts(paramString, paramInt1, paramInt2);
  }
  
  public static int addItemExchange(String paramString, int paramInt1, int paramInt2) {
    return YunYingService$.MODULE$.addItemExchange(paramString, paramInt1, paramInt2);
  }
  
  public static List<MapBean> getItemExchange(String paramString, int paramInt) {
    return YunYingService$.MODULE$.getItemExchange(paramString, paramInt);
  }
  
  public static List<MapBean> getSevenDayList(String paramString, int paramInt) {
    return YunYingService$.MODULE$.getSevenDayList(paramString, paramInt);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    YunYingService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    YunYingService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return YunYingService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    YunYingService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    YunYingService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return YunYingService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    YunYingService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    YunYingService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return YunYingService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    YunYingService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    YunYingService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return YunYingService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    YunYingService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    YunYingService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return YunYingService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return YunYingService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return YunYingService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\YunYingService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */