package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import java.util.Date;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\t\005v!B\001\003\021\003I\021!D*feZ,'oU3sm&\034WM\003\002\004\t\00591/\032:wS\016,'BA\003\007\003\035q\027N\035<b]\006T\021aB\001\004G>l7\001\001\t\003\025-i\021A\001\004\006\031\tA\t!\004\002\016'\026\024h/\032:TKJ4\030nY3\024\005-q\001C\001\006\020\023\t\001\"AA\bBEN$(/Y2u'\026\024h/[2f\021\025\0212\002\"\001\024\003\031a\024N\\5u}Q\t\021\002C\003\026\027\021\005a#\001\006hKR\fE\016\034.p]\026,\022a\006\t\0041\t*cBA\r \035\tQR$D\001\034\025\ta\002\"\001\004=e>|GOP\005\002=\005)1oY1mC&\021\001%I\001\ba\006\0347.Y4f\025\005q\022BA\022%\005\021a\025n\035;\013\005\001\n\003C\001\024*\033\0059#B\001\025\005\003\021\031wN]3\n\005):#aB'ba\n+\027M\034\005\006Y-!\tAF\001\rO\026$\030\t\0347TKJ4XM\035\005\006]-!\taL\001\017O\026$\030\t\0359s_Z\fGNV3s+\005)\003\"B\031\f\t\0031\022!E4fi\006cGNW8oK\016C\027M\0348fY\")1g\003C\001-\005\031r-\032;BY2\034VM\035<fe\016C\027M\0348fY\")Qg\003C\001-\005qq-\032;XQ&$X-\0239MSN$\b\"B\034\f\t\003A\024!C4fiN+'O^3s)\t)\023\bC\003;m\001\0071(\001\005tKJ4XM]%e!\taT(D\001\"\023\tq\024EA\002J]RDQ\001Q\006\005\002Y\t!cZ3u\007J|7o]*feZ,'\017T5ti\")!i\003C\001\007\006Yq-\032;Ja^C\027\016^3t)\t!E\nE\002\031E\025\003\"AR%\017\005q:\025B\001%\"\003\031\001&/\0323fM&\021!j\023\002\007'R\024\030N\\4\013\005!\013\003\"\002\036B\001\004Y\004\"\002(\f\t\003y\025AC4fi\016{WNY%egR\021\001+\025\t\0041\tZ\004\"\002\036N\001\004Y\004\"B*\f\t\003!\026AC;qI\006$XMW8oKR\031Q\013\027.\021\005q2\026BA,\"\005\021)f.\033;\t\013e\023\006\031A\036\002\ri|g.Z%e\021\025Y&\0131\001F\003!QxN\\3OC6,\007\"B/\f\t\003q\026AD4fiN+'O^3s\007>,h\016\036\013\002w!)\001m\003C\001C\006iq-\032;TKJ4XM\035'jgR$2a\0062e\021\025\031w\f1\001<\003%\031H/\031:u%><8\017C\003f?\002\0071(\001\005qC\036,7+\033>f\021\02597\002\"\001i\003%\tG\rZ*feZ,'\017F\017<S.lw.]:vof\\Xp`A\002\003\017\tY!a\004\002\024\005]\0211DA\030\021\025Qg\r1\001<\003\tIG\rC\003mM\002\007Q)\001\003oC6,\007\"\0028g\001\004Y\024aC:feZ,'o\030;za\026DQ\001\0354A\002m\nqA_8oK~KG\rC\003sM\002\0071(A\004d_6\024w,\0333\t\013Q4\007\031A#\002\t!|7\017\036\005\006m\032\004\r!R\001\003SBDQ\001\0374A\002m\nA\001]8si\")!P\032a\001w\00511\017^1ukNDQ\001 4A\002m\nA![2p]\")aP\032a\001w\005!\001.\0333f\021\031\t\tA\032a\001w\005\031\001/Y=\t\r\005\025a\r1\001<\003!I\007oX<iSR,\007BBA\005M\002\0071(A\006de\026\fG/Z0s_2,\007BBA\007M\002\0071(A\005nCb|Fn\\4j]\"1\021\021\0034A\002m\nAb]3d_:$w\f\\8hS:Da!!\006g\001\004Y\024aC<bSR|6/Z2p]\022Da!!\007g\001\004)\025\001D2m_N,w\f\035:p[B$\bbBA\017M\002\007\021qD\001\n_B,gn\030;j[\026\004B!!\t\002,5\021\0211\005\006\005\003K\t9#\001\003vi&d'BAA\025\003\021Q\027M^1\n\t\0055\0221\005\002\005\t\006$X\r\003\004\0022\031\004\r!R\001\005[\026lw\016C\004\0026-!\t!a\016\002\031U\004H-\031;f'\026\024h/\032:\025Sm\nI$a\017\002>\005}\022\021IA\"\003\013\n9%!\023\002L\0055\023qJA)\003'\n)&a\026\002Z\005m\023QLA0\021\031Q\0271\007a\001w!1A.a\rA\002\025CaA\\A\032\001\004Y\004B\0029\0024\001\0071\b\003\004s\003g\001\ra\017\005\007i\006M\002\031A#\t\rY\f\031\0041\001F\021\031A\0301\007a\001w!1!0a\rA\002mBa\001`A\032\001\004Y\004B\002@\0024\001\0071\bC\004\002\002\005M\002\031A\036\t\017\005\025\0211\007a\001w!9\021\021BA\032\001\004Y\004bBA\007\003g\001\ra\017\005\b\003#\t\031\0041\001<\021\035\t)\"a\rA\002mBq!!\007\0024\001\007Q\t\003\005\002\036\005M\002\031AA\020\021\035\t\t$a\rA\002\025Cq!a\031\f\t\003\t)'A\005eK2\034VM\035<feR\0311(a\032\t\r)\f\t\0071\001<\021\035\tYg\003C\001\003[\nAcZ3u'\026\024h/\032:D_VtGOQ=[_:,GcA\036\002p!1\021,!\033A\002mBq!a\035\f\t\003\t)(A\004eK2TvN\\3\025\007m\n9\b\003\004Z\003c\002\ra\017\005\b\003wZA\021AA?\003E)\b\017Z1uK\006\003\bO]8wC24VM\035\013\004w\005}\004bBAA\003s\002\r!R\001\004m\026\024\bbBAC\027\021\005\021qQ\001\017O\026$\030\t\0347TKJ4XM]%e+\005\001\006BBAF\027\021\005a#A\013hKR\fE\016\\*feZ,'/\0233B]\022t\025-\\3\t\017\005=5\002\"\001\002\022\006iq-\032;TKJ4XM\035(b[\026$2!RAJ\021\031Q\024Q\022a\001w!9\021qS\006\005\002\005e\025!D4fiN+'O^3s5>tW\rF\002&\0037Cq!!(\002\026\002\0071(\001\007tKJ4XM\035.p]\026LE\rC\004\002\".!\t!a)\002\035\035,G/\0239XQ&$X\rT5tiR1\021QUAU\003W\003B!a*#K9\021Ah\b\005\007G\006}\005\031A\036\t\r\025\fy\n1\001<\021\035\tyk\003C\001\003c\013qbZ3u\023B<\006.\033;f\007>,h\016^\013\002w!9\021QW\006\005\002\005]\026!D;qI\006$X-\0239XQ&$X\rF\003<\003s\013Y\f\003\004;\003g\003\ra\017\005\007m\006M\006\031A#\t\017\005}6\002\"\001\002B\006QA-\0327Ja^C\027\016^3\025\013m\n\031-!2\t\ri\ni\f1\001<\021\0311\030Q\030a\001\013\"1\021\021Z\006\005\002y\0131cZ3u\007\"\fgN\\3m5>tWmQ8v]RDq!!4\f\t\003\ty-\001\nhKR\034\005.\0318oK2TvN\\3MSN$H#B\f\002R\006M\007BB2\002L\002\0071\b\003\004f\003\027\004\ra\017\005\007\003/\\A\021\0010\002+\035,Go\0215b]:,GnU3sm\026\0248i\\;oi\"9\0211\\\006\005\002\005u\027\001F4fi\016C\027M\0348fYN+'O^3s\031&\034H\017F\003\030\003?\f\t\017\003\004d\0033\004\ra\017\005\007K\006e\007\031A\036\t\017\005\0258\002\"\001\002h\006\021r-\032;DQ\006tg.\0327[_:,')_%e)\025)\023\021^Aw\021\035\tY/a9A\002m\n\021b\0315b]:,G.\0233\t\re\013\031\0171\001<\021\035\t\tp\003C\001\003g\fAcZ3u\007\"\fgN\\3m'\026\024h/\032:Cs&#G#B\023\002v\006]\bbBAv\003_\004\ra\017\005\007u\005=\b\031A\036\t\017\005m8\002\"\001\002~\006\tR\017\0353bi\026\034VM\035<fe\n\013Go\0315\025\023m\nyP!\001\003\004\t\025\001B\002\036\002z\002\0071\b\003\004{\003s\004\ra\017\005\007}\006e\b\031A\036\t\017\005\025\021\021 a\001w!9!\021B\006\005\002\t-\021AD1eI\016C\027M\0348fYj{g.\032\013\bw\t5!q\002B\t\021\035\tYOa\002A\002mBa!\027B\004\001\004Y\004B\0027\003\b\001\007Q\tC\004\003\026-!\tAa\006\002#U\004H-\031;f\007\"\fgN\\3m5>tW\rF\004<\0053\021YB!\b\t\017\005-(1\003a\001w!1\021La\005A\002mBa\001\034B\n\001\004)\005b\002B\021\027\021\005!1E\001\017I\026d7\t[1o]\026d'l\0348f)\025Y$Q\005B\024\021\031I&q\004a\001w!9\0211\036B\020\001\004Y\004b\002B\026\027\021\005!QF\001\021C\022$7\t[1o]\026d7+\032:wKJ$ra\017B\030\005c\021\031\004C\004\002l\n%\002\031A\036\t\ri\022I\0031\001<\021\031a'\021\006a\001\013\"9!qG\006\005\002\te\022\001\0053fY\016C\027M\0348fYN+'O^3s)\025Y$1\bB\037\021\035\tYO!\016A\002mBaA\017B\033\001\004Y\004b\002B!\027\021\005!1I\001\024kB$\027\r^3DQ\006tg.\0327TKJ4XM\035\013\bw\t\025#q\tB%\021\035\tYOa\020A\002mBaA\017B \001\004Y\004B\0027\003@\001\007Q\tC\004\003N-!\tAa\024\002\037U\004H-\031;f/\006\024h\016T5nSR$2e\017B)\005+\022IF!\030\003b\t\025$\021\016B7\005c\022)H!\037\003~\t\005%Q\021BE\005\027\023y\tC\004\003T\t-\003\031A\036\002\017]\f'O\\0jI\"9!q\013B&\001\004Y\024!B7p]\026L\bb\002B.\005\027\002\raO\001\005O>dG\rC\004\003`\t-\003\031A\036\002\023\tLg\016Z0h_2$\007b\002B2\005\027\002\raO\001\004Kb\004\bb\002B4\005\027\002\raO\001\005QV\024H\017C\004\003l\t-\003\031A\036\002\0175|g.Z=`i\"9!q\016B&\001\004Y\024AB4pY\022|F\017C\004\003t\t-\003\031A\036\002\027\tLg\016Z0h_2$w\f\036\005\b\005o\022Y\0051\001<\003\025)\007\020]0u\021\035\021YHa\023A\002m\na\001[;si~#\bb\002B@\005\027\002\r!R\001\006K6\f\027\016\034\005\b\005\007\023Y\0051\001F\003\021\tW\017\0365\t\017\t\035%1\na\001\013\006A!/Z2`[\006LG\016\003\004u\005\027\002\r!\022\005\b\005\033\023Y\0051\001F\003!\001(o\034;pG>d\007B\002=\003L\001\0071\bC\004\003\024.!\tA!&\002\031\035,GoV1s]2KW.\033;\025\007\025\0229\nC\004\003T\tE\005\031A\036\t\017\tm5\002\"\001\003\036\006aA-\0327XCJtG*[7jiR\031QKa(\t\017\tM#\021\024a\001w\001")
public final class ServerService {
  public static void delWarnLimit(int paramInt) {
    ServerService$.MODULE$.delWarnLimit(paramInt);
  }
  
  public static MapBean getWarnLimit(int paramInt) {
    return ServerService$.MODULE$.getWarnLimit(paramInt);
  }
  
  public static int updateWarnLimit(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt12) {
    return ServerService$.MODULE$.updateWarnLimit(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramString1, paramString2, paramString3, paramString4, paramString5, paramInt12);
  }
  
  public static int updateChannelServer(int paramInt1, int paramInt2, String paramString) {
    return ServerService$.MODULE$.updateChannelServer(paramInt1, paramInt2, paramString);
  }
  
  public static int delChannelServer(int paramInt1, int paramInt2) {
    return ServerService$.MODULE$.delChannelServer(paramInt1, paramInt2);
  }
  
  public static int addChannelServer(int paramInt1, int paramInt2, String paramString) {
    return ServerService$.MODULE$.addChannelServer(paramInt1, paramInt2, paramString);
  }
  
  public static int delChannelZone(int paramInt1, int paramInt2) {
    return ServerService$.MODULE$.delChannelZone(paramInt1, paramInt2);
  }
  
  public static int updateChannelZone(int paramInt1, int paramInt2, String paramString) {
    return ServerService$.MODULE$.updateChannelZone(paramInt1, paramInt2, paramString);
  }
  
  public static int addChannelZone(int paramInt1, int paramInt2, String paramString) {
    return ServerService$.MODULE$.addChannelZone(paramInt1, paramInt2, paramString);
  }
  
  public static int updateServerBatch(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return ServerService$.MODULE$.updateServerBatch(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static MapBean getChannelServerById(int paramInt1, int paramInt2) {
    return ServerService$.MODULE$.getChannelServerById(paramInt1, paramInt2);
  }
  
  public static MapBean getChannelZoneById(int paramInt1, int paramInt2) {
    return ServerService$.MODULE$.getChannelZoneById(paramInt1, paramInt2);
  }
  
  public static List<MapBean> getChannelServerList(int paramInt1, int paramInt2) {
    return ServerService$.MODULE$.getChannelServerList(paramInt1, paramInt2);
  }
  
  public static int getChannelServerCount() {
    return ServerService$.MODULE$.getChannelServerCount();
  }
  
  public static List<MapBean> getChannelZoneList(int paramInt1, int paramInt2) {
    return ServerService$.MODULE$.getChannelZoneList(paramInt1, paramInt2);
  }
  
  public static int getChannelZoneCount() {
    return ServerService$.MODULE$.getChannelZoneCount();
  }
  
  public static int delIpWhite(int paramInt, String paramString) {
    return ServerService$.MODULE$.delIpWhite(paramInt, paramString);
  }
  
  public static int updateIpWhite(int paramInt, String paramString) {
    return ServerService$.MODULE$.updateIpWhite(paramInt, paramString);
  }
  
  public static int getIpWhiteCount() {
    return ServerService$.MODULE$.getIpWhiteCount();
  }
  
  public static List<MapBean> getIpWhiteList(int paramInt1, int paramInt2) {
    return ServerService$.MODULE$.getIpWhiteList(paramInt1, paramInt2);
  }
  
  public static MapBean getServerZone(int paramInt) {
    return ServerService$.MODULE$.getServerZone(paramInt);
  }
  
  public static String getServerName(int paramInt) {
    return ServerService$.MODULE$.getServerName(paramInt);
  }
  
  public static List<MapBean> getAllServerIdAndName() {
    return ServerService$.MODULE$.getAllServerIdAndName();
  }
  
  public static List<Object> getAllServerId() {
    return ServerService$.MODULE$.getAllServerId();
  }
  
  public static int updateApprovalVer(String paramString) {
    return ServerService$.MODULE$.updateApprovalVer(paramString);
  }
  
  public static int delZone(int paramInt) {
    return ServerService$.MODULE$.delZone(paramInt);
  }
  
  public static int getServerCountByZone(int paramInt) {
    return ServerService$.MODULE$.getServerCountByZone(paramInt);
  }
  
  public static int delServer(int paramInt) {
    return ServerService$.MODULE$.delServer(paramInt);
  }
  
  public static int updateServer(int paramInt1, String paramString1, int paramInt2, int paramInt3, int paramInt4, String paramString2, String paramString3, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, String paramString4, Date paramDate, String paramString5) {
    return ServerService$.MODULE$.updateServer(paramInt1, paramString1, paramInt2, paramInt3, paramInt4, paramString2, paramString3, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12, paramInt13, paramInt14, paramString4, paramDate, paramString5);
  }
  
  public static int addServer(int paramInt1, String paramString1, int paramInt2, int paramInt3, int paramInt4, String paramString2, String paramString3, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, String paramString4, Date paramDate, String paramString5) {
    return ServerService$.MODULE$.addServer(paramInt1, paramString1, paramInt2, paramInt3, paramInt4, paramString2, paramString3, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12, paramInt13, paramInt14, paramString4, paramDate, paramString5);
  }
  
  public static List<MapBean> getServerList(int paramInt1, int paramInt2) {
    return ServerService$.MODULE$.getServerList(paramInt1, paramInt2);
  }
  
  public static int getServerCount() {
    return ServerService$.MODULE$.getServerCount();
  }
  
  public static void updateZone(int paramInt, String paramString) {
    ServerService$.MODULE$.updateZone(paramInt, paramString);
  }
  
  public static List<Object> getCombIds(int paramInt) {
    return ServerService$.MODULE$.getCombIds(paramInt);
  }
  
  public static List<String> getIpWhites(int paramInt) {
    return ServerService$.MODULE$.getIpWhites(paramInt);
  }
  
  public static List<MapBean> getCrossServerList() {
    return ServerService$.MODULE$.getCrossServerList();
  }
  
  public static MapBean getServer(int paramInt) {
    return ServerService$.MODULE$.getServer(paramInt);
  }
  
  public static List<MapBean> getWhiteIpList() {
    return ServerService$.MODULE$.getWhiteIpList();
  }
  
  public static List<MapBean> getAllServerChannel() {
    return ServerService$.MODULE$.getAllServerChannel();
  }
  
  public static List<MapBean> getAllZoneChannel() {
    return ServerService$.MODULE$.getAllZoneChannel();
  }
  
  public static MapBean getApprovalVer() {
    return ServerService$.MODULE$.getApprovalVer();
  }
  
  public static List<MapBean> getAllServer() {
    return ServerService$.MODULE$.getAllServer();
  }
  
  public static List<MapBean> getAllZone() {
    return ServerService$.MODULE$.getAllZone();
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ServerService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    ServerService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return ServerService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ServerService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    ServerService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return ServerService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ServerService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    ServerService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return ServerService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ServerService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    ServerService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return ServerService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ServerService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    ServerService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return ServerService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return ServerService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return ServerService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\ServerService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */