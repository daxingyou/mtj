package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import java.util.Date;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005\005v!B\001\003\021\003I\021A\003)bsN+'O^5dK*\0211\001B\001\bg\026\024h/[2f\025\t)a!A\004oSJ4\030M\\1\013\003\035\t1aY8n\007\001\001\"AC\006\016\003\t1Q\001\004\002\t\0025\021!\002U1z'\026\024h/[2f'\tYa\002\005\002\013\037%\021\001C\001\002\020\003\n\034HO]1diN+'O^5dK\")!c\003C\001'\0051A(\0338jiz\"\022!\003\005\006+-!\tAF\001\na\006LH)\033:fGR$\022bF\017'Q)bc\006\r\032\021\005aYR\"A\r\013\003i\tQa]2bY\006L!\001H\r\003\007%sG\017C\003\037)\001\007q$\001\002jIB\021\001e\t\b\0031\005J!AI\r\002\rA\023X\rZ3g\023\t!SE\001\004TiJLgn\032\006\003EeAQa\n\013A\002}\tqa\034:eKJLE\rC\003*)\001\007q$\001\005vg\026\024h.Y7f\021\025YC\0031\001 \003!\001H.Y=fe&#\007\"B\027\025\001\0049\022A\0019g\021\025yC\0031\001\030\003%\031\007.\0318oK2LE\rC\0032)\001\007q#A\002s[\nDQa\r\013A\002]\t\021\002\035:pIV\034G/\0233\t\013UZA\021\001\034\002\037%\034h)\033:tiJ+7\r[1sO\026$2a\016\036=!\tA\002(\003\002:3\t9!i\\8mK\006t\007\"B\0365\001\004y\022!\0039mCf,'oX5e\021\025\031D\0071\001\030\021\025q4\002\"\001@\003\0319W\r\036)bsR\021\001I\022\t\003\003\022k\021A\021\006\003\007\022\tAaY8sK&\021QI\021\002\b\033\006\004()Z1o\021\025qR\b1\001 \021\025A5\002\"\001J\003%9W\r^*v[B\013\027\020\006\003\030\025.+\006\"B\036H\001\004y\002\"\002'H\001\004i\025AC:uCJ$x\f^5nKB\021ajU\007\002\037*\021\001+U\001\005kRLGNC\001S\003\021Q\027M^1\n\005Q{%\001\002#bi\026DQAV$A\0025\013\001\"\0328e?RLW.\032\005\0061.!\t!W\001\fO\026$\b+Y=D_VtG\017F\002\0305nCQaO,A\002}AQaM,A\002]AQ!X\006\005\002y\0131\"\0313e!\006LxJ\0353feRQqLY2eM\036D\027N[6\021\005a\001\027BA1\032\005\021)f.\033;\t\013ya\006\031A\020\t\013\035b\006\031A\020\t\013\025d\006\031A\f\002\021M,'O^3s\023\022DQ!\013/A\002}AQa\013/A\002}AQ!\f/A\002]AQa\f/A\002]AQ!\r/A\002]AQa\r/A\002]AQ!\\\006\005\0029\fQ\"\0313e!\006LxJ\0353fe\036kGCC0paF\0248\017^;wo\")a\004\034a\001?!)q\005\034a\001?!)Q\r\034a\001/!)\021\006\034a\001?!)1\006\034a\001?!)Q\006\034a\001/!)q\006\034a\001/!)\021\007\034a\001/!)1\007\034a\001/!)\021p\003C\001u\006Yq-\032;QCf|%\017Z3s)\t\0015\020C\003\037q\002\007q\004C\003~\027\021\005a0\001\013hKR\004\026-_(sI\026\024()_(sI\026\024\030\n\032\013\003\001~DQa\n?A\002}Aq!a\001\f\t\003\t)!\001\013va\022\fG/\032)bs>\023H-\032:Ti\006$Xo\035\013\b?\006\035\021\021BA\007\021\031q\022\021\001a\001?!9\0211BA\001\001\0049\022AB:uCR,8\017\003\004(\003\003\001\ra\b\005\b\003#YA\021AA\n\003e)\b\017Z1uKB\013\027p\024:eKJ\034VoY2fgN4E.Y4\025\007}\013)\002\003\004\037\003\037\001\ra\b\005\b\0033YA\021AA\016\003U9W\r\036(pi\032Kg.[:i!\006LxJ\0353feN,\"!!\b\021\013\005}\021Q\005!\017\007a\t\t#C\002\002$e\tq\001]1dW\006<W-\003\003\002(\005%\"\001\002'jgRT1!a\t\032\021\035\tic\003C\001\0037\tQdZ3u\035>$h)\0338jg\"\004\026-_(sI\026\0248OR8s#V,'/\037\005\b\003cYA\021AA\032\003-\tG\r\032)bs>#\b.\032:\025\013}\013)$!\017\t\017\005]\022q\006a\001?\005)\001/Y=JI\"9\0211HA\030\001\004y\022aB2p]R,g\016\036\005\b\003YA\021AA!\003-9W\r\036)bs>#\b.\032:\025\007\001\013\031\005C\004\0028\005u\002\031A\020\t\017\005\0353\002\"\001\002J\005Ir-\032;DkJ,g\016\036#bsB\023x.\0363di&#G*[:u)\021\tY%!\027\021\013\0055\023QE\f\017\t\005=\023\021\005\b\005\003#\n9&\004\002\002T)\031\021Q\013\005\002\rq\022xn\034;?\023\005Q\002BB\026\002F\001\007q\004C\004\002^-!\t!a\030\002)\035,GOU3dQ\006\024x-\032)bs>\023H-\032:t)\031\t\t'a\031\002hA)\021QJA\023\001\"9\021QMA.\001\0049\022!C:uCJ$(k\\<t\021\035\tI'a\027A\002]\t\001\002]1hKNK'0\032\005\b\003[ZA\021AA8\003a9W\r\036*fG\"\f'oZ3QCf|%\017Z3s\007>,h\016^\013\002/!9\0211O\006\005\002\005U\024AD1eIf+h.W5oO\036Kg\r\036\013\n?\006]\024\021PA?\003BaaOA9\001\004y\002bBA>\003c\002\raF\001\bO&4GoX5e\021\035\tY!!\035A\002]Aq!!!\002r\001\007q#\001\004dCJ,WM\035\005\b\003\013[A\021AAD\00399W\r^-v]fKgnZ$jMR$B!!\b\002\n\"11(a!A\002}Aq!!$\f\t\003\ty)\001\nhKRLVO\\-j]\036\024U/\037+j[\026\034H\003BA\017\003#CaaOAF\001\004y\002bBAK\027\021\005\021qS\001\020O\026$\030,\0368ZS:<w)\0334ugR\021\021Q\004\005\b\0037[A\021AAO\003I)\b\017Z1uKf+h.W5oO\036Kg\r^:\025\007}\013y\nC\004\002\f\005e\005\031A\f")
public final class PayService {
  public static void updateYunYingGifts(int paramInt) {
    PayService$.MODULE$.updateYunYingGifts(paramInt);
  }
  
  public static List<MapBean> getYunYingGifts() {
    return PayService$.MODULE$.getYunYingGifts();
  }
  
  public static List<MapBean> getYunYingBuyTimes(String paramString) {
    return PayService$.MODULE$.getYunYingBuyTimes(paramString);
  }
  
  public static List<MapBean> getYunYingGift(String paramString) {
    return PayService$.MODULE$.getYunYingGift(paramString);
  }
  
  public static void addYunYingGift(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    PayService$.MODULE$.addYunYingGift(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public static int getRechargePayOrderCount() {
    return PayService$.MODULE$.getRechargePayOrderCount();
  }
  
  public static List<MapBean> getRechargePayOrders(int paramInt1, int paramInt2) {
    return PayService$.MODULE$.getRechargePayOrders(paramInt1, paramInt2);
  }
  
  public static List<Object> getCurentDayProudctIdList(String paramString) {
    return PayService$.MODULE$.getCurentDayProudctIdList(paramString);
  }
  
  public static MapBean getPayOther(String paramString) {
    return PayService$.MODULE$.getPayOther(paramString);
  }
  
  public static void addPayOther(String paramString1, String paramString2) {
    PayService$.MODULE$.addPayOther(paramString1, paramString2);
  }
  
  public static List<MapBean> getNotFinishPayOrdersForQuery() {
    return PayService$.MODULE$.getNotFinishPayOrdersForQuery();
  }
  
  public static List<MapBean> getNotFinishPayOrders() {
    return PayService$.MODULE$.getNotFinishPayOrders();
  }
  
  public static void updatePayOrderSuccessFlag(String paramString) {
    PayService$.MODULE$.updatePayOrderSuccessFlag(paramString);
  }
  
  public static void updatePayOrderStatus(String paramString1, int paramInt, String paramString2) {
    PayService$.MODULE$.updatePayOrderStatus(paramString1, paramInt, paramString2);
  }
  
  public static MapBean getPayOrderByOrderId(String paramString) {
    return PayService$.MODULE$.getPayOrderByOrderId(paramString);
  }
  
  public static MapBean getPayOrder(String paramString) {
    return PayService$.MODULE$.getPayOrder(paramString);
  }
  
  public static void addPayOrderGm(String paramString1, String paramString2, int paramInt1, String paramString3, String paramString4, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    PayService$.MODULE$.addPayOrderGm(paramString1, paramString2, paramInt1, paramString3, paramString4, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public static void addPayOrder(String paramString1, String paramString2, int paramInt1, String paramString3, String paramString4, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    PayService$.MODULE$.addPayOrder(paramString1, paramString2, paramInt1, paramString3, paramString4, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public static int getPayCount(String paramString, int paramInt) {
    return PayService$.MODULE$.getPayCount(paramString, paramInt);
  }
  
  public static int getSumPay(String paramString, Date paramDate1, Date paramDate2) {
    return PayService$.MODULE$.getSumPay(paramString, paramDate1, paramDate2);
  }
  
  public static MapBean getPay(String paramString) {
    return PayService$.MODULE$.getPay(paramString);
  }
  
  public static boolean isFirstRecharge(String paramString, int paramInt) {
    return PayService$.MODULE$.isFirstRecharge(paramString, paramInt);
  }
  
  public static int payDirect(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return PayService$.MODULE$.payDirect(paramString1, paramString2, paramString3, paramString4, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    PayService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    PayService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return PayService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    PayService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    PayService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return PayService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    PayService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    PayService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return PayService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    PayService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    PayService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return PayService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    PayService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    PayService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return PayService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return PayService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return PayService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\PayService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */