package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import java.util.Date;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005]s!B\001\003\021\003I\021!\004(pi&\034WmU3sm&\034WM\003\002\004\t\00591/\032:wS\016,'BA\003\007\003\035q\027N\035<b]\006T\021aB\001\004G>l7\001\001\t\003\025-i\021A\001\004\006\031\tA\t!\004\002\016\035>$\030nY3TKJ4\030nY3\024\005-q\001C\001\006\020\023\t\001\"AA\bBEN$(/Y2u'\026\024h/[2f\021\025\0212\002\"\001\024\003\031a\024N\\5u}Q\t\021\002C\003\026\027\021\005a#\001\013hKRtu\016^5dKV\003H-\031;f\007>,h\016\036\013\002/A\021\001dG\007\0023)\t!$A\003tG\006d\027-\003\002\0353\t\031\021J\034;\t\013yYA\021\001\f\002+\021,G.\032;f\0032dgj\034;jG\026,\006\017Z1uK\")\001e\003C\001C\005\031r-\032;O_RL7-Z+qI\006$X\rT5tiR\031!\005\016\034\021\007\rZcF\004\002%S9\021Q\005K\007\002M)\021q\005C\001\007yI|w\016\036 \n\003iI!AK\r\002\017A\f7m[1hK&\021A&\f\002\005\031&\034HO\003\002+3A\021qFM\007\002a)\021\021\007B\001\005G>\024X-\003\0024a\t9Q*\0319CK\006t\007\"B\033 \001\0049\022AC:uCJ$xL]8xg\")qg\ba\001/\005I\001/Y4f?NL'0\032\005\006s-!\tAO\001\020O\026$hj\034;jG\026,\006\017Z1uKR\021af\017\005\006ya\002\raF\001\n]>$\030nY3`S\022DQAP\006\005\002}\nq\"\0313e\035>$\030nY3Va\022\fG/\032\013\006/\001\0235*\024\005\006\003v\002\raF\001\013G\"\fgN\\3m?&$\007\"B\">\001\004!\025aB2p]R,g\016\036\t\003\013\"s!\001\007$\n\005\035K\022A\002)sK\022,g-\003\002J\025\n11\013\036:j]\036T!aR\r\t\0131k\004\031\001#\002\007\t,x\rC\003O{\001\007q*A\006va\022\fG/Z0uS6,\007C\001)V\033\005\t&B\001*T\003\021)H/\0337\013\003Q\013AA[1wC&\021a+\025\002\005\t\006$X\rC\003Y\027\021\005\021,\001\nva\022\fG/\032(pi&\034W-\0269eCR,G\003B\f[7rCQ\001P,A\002]AQaQ,A\002\021CQ\001T,A\002\021CQAX\006\005\002}\013q\002Z3m\035>$\030nY3Va\022\fG/\032\013\003/\001DQ\001P/A\002]AQAY\006\005\002\r\f!dZ3u\035>$\030nY3Va\022\fG/\032\"z\007\"\fgN\\3m\023\022$\"A\f3\t\013\005\013\007\031A\f\t\013\031\\A\021\001\f\002!\035,GOT8uS\016,\027J\\\"pk:$\b\"\0025\f\t\003I\027aD4fi:{G/[2f\023:d\025n\035;\025\007\tR7\016C\0036O\002\007q\003C\0038O\002\007q\003C\003n\027\021\005a.A\006hKRtu\016^5dK&sGC\001\030p\021\025aD\0161\001\030\021\025\t8\002\"\001s\003-!W\r\034(pi&\034W-\0238\025\005]\031\b\"\002\037q\001\0049\002\"B;\f\t\0031\030aC1eI:{G/[2f\023:$BBL<zwv|\0301AA\004\003\027AQ\001\037;A\002]\t\021b]3sm\026\024x,\0333\t\013i$\b\031A\f\002\0259|G/[2f?^\f\027\020C\003}i\002\007q#\001\005tQ><xl^1z\021\025qH\0171\001P\003)\031H/\031:u?RLW.\032\005\007\003\003!\b\031A(\002\021\025tGm\030;j[\026Da!!\002u\001\0049\022!C5oi\026\024h/\0317t\021\031\tI\001\036a\001\t\006)A\017[3nK\")1\t\036a\001\t\"9\021qB\006\005\002\005E\021AD;qI\006$XMT8uS\016,\027J\034\013\016/\005M\021QCA\f\0033\tY\"!\b\t\rq\ni\0011\001\030\021\031q\030Q\002a\001\037\"9\021\021AA\007\001\004y\005bBA\003\003\033\001\ra\006\005\b\003\023\ti\0011\001E\021\031\031\025Q\002a\001\t\"9\021\021E\006\005\002\005\r\022!D1eI:{G/[2f\017\006lW\rF\n\030\003K\t9#!\013\002,\0055\022qFA\032\003k\t9\004\003\004=\003?\001\r\001\022\005\007u\006}\001\031A\f\t\rq\fy\0021\001\030\021\031q\030q\004a\001\037\"9\021\021AA\020\001\004y\005bBA\031\003?\001\raT\001\nY\006\034Ho\030;j[\026Dq!!\002\002 \001\007q\003C\004\002\n\005}\001\031\001#\t\r\r\013y\0021\001E\021\035\tYd\003C\001\003{\t\001$\0369eCR,gj\034;jG\026<\025-\\3MCN$H+[7f)\0259\022qHA!\021\031a\024\021\ba\001\t\"9\021\021GA\035\001\004y\005bBA#\027\021\005\021qI\001\016I\026dgj\034;jG\026<\025-\\3\025\t\005%\023q\n\t\0041\005-\023bAA'3\t!QK\\5u\021\031a\0241\ta\001\t\"9\0211K\006\005\002\005U\023aE4fi:{G/[2f\005f\034UO\035:US6,G#\001\022")
public final class NoticeService {
  public static List<MapBean> getNoticeByCurrTime() {
    return NoticeService$.MODULE$.getNoticeByCurrTime();
  }
  
  public static void delNoticeGame(String paramString) {
    NoticeService$.MODULE$.delNoticeGame(paramString);
  }
  
  public static int updateNoticeGameLastTime(String paramString, Date paramDate) {
    return NoticeService$.MODULE$.updateNoticeGameLastTime(paramString, paramDate);
  }
  
  public static int addNoticeGame(String paramString1, int paramInt1, int paramInt2, Date paramDate1, Date paramDate2, Date paramDate3, int paramInt3, String paramString2, String paramString3) {
    return NoticeService$.MODULE$.addNoticeGame(paramString1, paramInt1, paramInt2, paramDate1, paramDate2, paramDate3, paramInt3, paramString2, paramString3);
  }
  
  public static int updateNoticeIn(int paramInt1, Date paramDate1, Date paramDate2, int paramInt2, String paramString1, String paramString2) {
    return NoticeService$.MODULE$.updateNoticeIn(paramInt1, paramDate1, paramDate2, paramInt2, paramString1, paramString2);
  }
  
  public static MapBean addNoticeIn(int paramInt1, int paramInt2, int paramInt3, Date paramDate1, Date paramDate2, int paramInt4, String paramString1, String paramString2) {
    return NoticeService$.MODULE$.addNoticeIn(paramInt1, paramInt2, paramInt3, paramDate1, paramDate2, paramInt4, paramString1, paramString2);
  }
  
  public static int delNoticeIn(int paramInt) {
    return NoticeService$.MODULE$.delNoticeIn(paramInt);
  }
  
  public static MapBean getNoticeIn(int paramInt) {
    return NoticeService$.MODULE$.getNoticeIn(paramInt);
  }
  
  public static List<MapBean> getNoticeInList(int paramInt1, int paramInt2) {
    return NoticeService$.MODULE$.getNoticeInList(paramInt1, paramInt2);
  }
  
  public static int getNoticeInCount() {
    return NoticeService$.MODULE$.getNoticeInCount();
  }
  
  public static MapBean getNoticeUpdateByChannelId(int paramInt) {
    return NoticeService$.MODULE$.getNoticeUpdateByChannelId(paramInt);
  }
  
  public static int delNoticeUpdate(int paramInt) {
    return NoticeService$.MODULE$.delNoticeUpdate(paramInt);
  }
  
  public static int updateNoticeUpdate(int paramInt, String paramString1, String paramString2) {
    return NoticeService$.MODULE$.updateNoticeUpdate(paramInt, paramString1, paramString2);
  }
  
  public static int addNoticeUpdate(int paramInt, String paramString1, String paramString2, Date paramDate) {
    return NoticeService$.MODULE$.addNoticeUpdate(paramInt, paramString1, paramString2, paramDate);
  }
  
  public static MapBean getNoticeUpdate(int paramInt) {
    return NoticeService$.MODULE$.getNoticeUpdate(paramInt);
  }
  
  public static List<MapBean> getNoticeUpdateList(int paramInt1, int paramInt2) {
    return NoticeService$.MODULE$.getNoticeUpdateList(paramInt1, paramInt2);
  }
  
  public static int deleteAllNoticeUpdate() {
    return NoticeService$.MODULE$.deleteAllNoticeUpdate();
  }
  
  public static int getNoticeUpdateCount() {
    return NoticeService$.MODULE$.getNoticeUpdateCount();
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    NoticeService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    NoticeService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return NoticeService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    NoticeService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    NoticeService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return NoticeService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    NoticeService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    NoticeService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return NoticeService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    NoticeService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    NoticeService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return NoticeService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    NoticeService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    NoticeService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return NoticeService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return NoticeService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return NoticeService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\NoticeService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */