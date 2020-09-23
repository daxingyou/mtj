package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005=q!B\001\003\021\003I\021\001\005*fIB\0137m[3u'\026\024h/[2f\025\t\031A!A\004tKJ4\030nY3\013\005\0251\021a\0028jeZ\fg.\031\006\002\017\005\0311m\\7\004\001A\021!bC\007\002\005\031)AB\001E\001\033\t\001\"+\0323QC\016\\W\r^*feZL7-Z\n\003\0279\001\"AC\b\n\005A\021!aD!cgR\024\030m\031;TKJ4\030nY3\t\013IYA\021A\n\002\rqJg.\033;?)\005I\001\"B\013\f\t\0031\022\001D1eIJ+G\rU1dW\026$HcB\f\"G\025RCF\f\t\0031yq!!\007\017\016\003iQ\021aG\001\006g\016\fG.Y\005\003;i\ta\001\025:fI\0264\027BA\020!\005\031\031FO]5oO*\021QD\007\005\006EQ\001\raF\001\ta2\f\0270\032:JI\")A\005\006a\001/\0051Ao\0348h\023\022DQA\n\013A\002\035\naB]3e!\006\0347.\032;EK\032LE\r\005\002\032Q%\021\021F\007\002\004\023:$\b\"B\026\025\001\0049\023!\0022h_2$\007\"B\027\025\001\0049\023a\0018v[\")q\006\006a\001O\005AQ.\031=US6,7\017C\0032\027\021\005!'\001\007va\022\fG/\032+p]\036LE\rF\0024m]\002\"!\007\033\n\005UR\"\001B+oSRDQA\t\031A\002]AQ\001\n\031A\002]AQ!O\006\005\002i\n!\"[:Qk2dGi\\<o)\rYdh\020\t\0033qJ!!\020\016\003\017\t{w\016\\3b]\")!\005\017a\001/!)\001\t\017a\001/\005Y!/\0323QC\016\\W\r^%e\021\025\0215\002\"\001D\003%9W\r^'z\031&\034H\017F\002E-^\0032!R'Q\035\t15J\004\002H\0256\t\001J\003\002J\021\0051AH]8pizJ\021aG\005\003\031j\tq\001]1dW\006<W-\003\002O\037\n!A*[:u\025\ta%\004\005\002R)6\t!K\003\002T\t\005!1m\034:f\023\t)&KA\004NCB\024U-\0318\t\013\t\n\005\031A\f\t\013\021\n\005\031A\f\t\013e[A\021\001.\002\027\035,G\017V8oO2K7\017\036\013\004\tnc\006\"\002\022Y\001\0049\002\"\002\023Y\001\0049\002\"\0020\f\t\003y\026\001D4fiJ+G\rU1dW\026$HC\001)a\021\025\tW\f1\001\030\003\tIG\rC\003d\027\021\005A-\001\nva\022\fG/\032*fIB\0137m[3u\035VlGcA\024fM\")\021M\031a\001/!)QF\031a\001O!)\001n\003C\001S\006)R\017\0353bi\026\024V\r\032)bG.,GOU3nC&tG#B\032kW6|\007\"B1h\001\0049\002\"\0027h\001\0049\023a\003:f[\006LgNQ4pY\022DQA\\4A\002\035\n\021B]3nC&tg*^7\t\013A<\007\031A\024\002\rM$\030\r^;t\021\025\0218\002\"\001t\003%\tG\r\032#fi\006LG\016\006\003(iV4\b\"B1r\001\0049\002\"\002\022r\001\0049\002\"B\026r\001\0049\003\"\002=\f\t\003I\030\001E4fiJ+G\rU1dW\026$\030J\0344p)\t\001&\020C\003bo\002\007q\003C\003}\027\021\005Q0A\007hKR$U\r^1jY2K7\017\036\013\004}\006\005\001cA@N!:\021\021d\023\005\006Cn\004\ra\006\005\b\003\013YA\021AA\004\003=9W\r^!vi>\034VM\0343MSN$X#\001@\t\017\005-1\002\"\001\002\016\005q1\r\\3b]J+G\rU1dW\026$X#A\032")
public final class RedPacketService {
  public static void cleanRedPacket() {
    RedPacketService$.MODULE$.cleanRedPacket();
  }
  
  public static List<MapBean> getAutoSendList() {
    return RedPacketService$.MODULE$.getAutoSendList();
  }
  
  public static List<MapBean> getDetailList(String paramString) {
    return RedPacketService$.MODULE$.getDetailList(paramString);
  }
  
  public static MapBean getRedPacketInfo(String paramString) {
    return RedPacketService$.MODULE$.getRedPacketInfo(paramString);
  }
  
  public static int addDetail(String paramString1, String paramString2, int paramInt) {
    return RedPacketService$.MODULE$.addDetail(paramString1, paramString2, paramInt);
  }
  
  public static void updateRedPacketRemain(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    RedPacketService$.MODULE$.updateRedPacketRemain(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public static int updateRedPacketNum(String paramString, int paramInt) {
    return RedPacketService$.MODULE$.updateRedPacketNum(paramString, paramInt);
  }
  
  public static MapBean getRedPacket(String paramString) {
    return RedPacketService$.MODULE$.getRedPacket(paramString);
  }
  
  public static List<MapBean> getTongList(String paramString1, String paramString2) {
    return RedPacketService$.MODULE$.getTongList(paramString1, paramString2);
  }
  
  public static List<MapBean> getMyList(String paramString1, String paramString2) {
    return RedPacketService$.MODULE$.getMyList(paramString1, paramString2);
  }
  
  public static boolean isPullDown(String paramString1, String paramString2) {
    return RedPacketService$.MODULE$.isPullDown(paramString1, paramString2);
  }
  
  public static void updateTongId(String paramString1, String paramString2) {
    RedPacketService$.MODULE$.updateTongId(paramString1, paramString2);
  }
  
  public static String addRedPacket(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return RedPacketService$.MODULE$.addRedPacket(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    RedPacketService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    RedPacketService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return RedPacketService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    RedPacketService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    RedPacketService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return RedPacketService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    RedPacketService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    RedPacketService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return RedPacketService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    RedPacketService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    RedPacketService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return RedPacketService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    RedPacketService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    RedPacketService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return RedPacketService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return RedPacketService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return RedPacketService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\RedPacketService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */