package com.nirvana.core;

import grizzled.slf4j.Logger;
import java.util.Properties;
import scala.Function0;
import scala.collection.immutable.Set;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\0055q!B\001\003\021\003I\021\001D*feZ,'oQ8oM&<'BA\002\005\003\021\031wN]3\013\005\0251\021a\0028jeZ\fg.\031\006\002\017\005\0311m\\7\004\001A\021!bC\007\002\005\031)AB\001E\001\033\ta1+\032:wKJ\034uN\0344jON\0311B\004\013\021\005=\021R\"\001\t\013\003E\tQa]2bY\006L!a\005\t\003\r\005s\027PU3g!\t)\"$D\001\027\025\t9\002$A\003tY\032$$NC\001\032\003!9'/\033>{Y\026$\027BA\016\027\005\035aunZ4j]\036DQ!H\006\005\002y\ta\001P5oSRtD#A\005\t\017\001Z!\031!C\001C\005)\001O]8qgV\t!\005\005\002$Q5\tAE\003\002&M\005!Q\017^5m\025\0059\023\001\0026bm\006L!!\013\023\003\025A\023x\016]3si&,7\017\003\004,\027\001\006IAI\001\007aJ|\007o\035\021\t\0175Z!\031!C\003]\0059!\016\0322d+JdW#A\030\021\005A\032dBA\b2\023\t\021\004#\001\004Qe\026$WMZ\005\003iU\022aa\025;sS:<'B\001\032\021\021\03194\002)A\007_\005A!\016\0322d+Jd\007\005C\004:\027\t\007IQ\001\030\002\021)$'mY+tKJDaaO\006!\002\033y\023!\0036eE\016,6/\032:!\021\035i4B1A\005\0069\nAB\0333cGB\0137o]<pe\022DaaP\006!\002\033y\023!\0046eE\016\004\026m]:x_J$\007\005C\004B\027\t\007IQ\001\"\002\021M,'O^3s\023\022,\022a\021\t\003\037\021K!!\022\t\003\007%sG\017\003\004H\027\001\006iaQ\001\ng\026\024h/\032:JI\002Bq!S\006C\002\023\025!*A\007jg\022+'-^4TKJ4XM]\013\002\027B\021q\002T\005\003\033B\021qAQ8pY\026\fg\016\003\004P\027\001\006iaS\001\017SN$UMY;h'\026\024h/\032:!\021\035\t6B1A\005\006)\013AB\\3fIR+7\017^\"pI\026DaaU\006!\002\033Y\025!\0048fK\022$Vm\035;D_\022,\007\005C\004V\027\t\007IQ\001\030\002\0235\f7\017^3s+Jd\007BB,\fA\0035q&\001\006nCN$XM]+sY\002Bq!W\006C\002\023\025a&\001\003jcar\007BB.\fA\0035q&A\003jcar\007\005C\004^\027\t\007IQ\002\030\002\017alG\016U1uQ\"1ql\003Q\001\016=\n\001\002_7m!\006$\b\016\t\005\bC.\021\r\021\"\002c\003=\021xNY8u'\016,g.Z\"pk:$X#A2\021\005\021<W\"A3\013\005\0314\023\001\0027b]\036L!\001N3\t\r%\\\001\025!\004d\003A\021xNY8u'\016,g.Z\"pk:$\b\005C\004l\027\t\007IQ\0012\002\031\005|g)Z5M_\036\004\026\r\0365\t\r5\\\001\025!\004d\0035\twNR3j\031><\007+\031;iA!9qn\003b\001\n\013\021\027\001D6fsN#xN]3GS2,\007BB9\fA\00351-A\007lKf\034Fo\034:f\r&dW\r\t\005\bg.\021\r\021\"\002c\003AYW-_*u_J,\007+Y:to>\024H\r\003\004v\027\001\006iaY\001\022W\026L8\013^8sKB\0137o]<pe\022\004\003\"B<\f\t\003\021\027!D4fi\016{gNZ5h!\006$\b\016C\003z\027\021\005!-A\bhKR\\U-_*u_J,g)\0337f\021\025Y8\002\"\001}\003A9W\r^'bgR,'/\026:m\031&\034H/F\001~!\r\001dpL\005\003V\0221aU3u\021\031\t\031a\003C\001\005\006QQ.Y:uKJ\004vN\035;\t\r\005\0351\002\"\001C\0035i\027m\035;feN\033H\016U8si\"1\0211B\006\005\002\t\013\021\"\0313nS:\004vN\035;")
public final class ServerConfig {
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ServerConfig$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    ServerConfig$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return ServerConfig$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ServerConfig$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    ServerConfig$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return ServerConfig$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ServerConfig$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    ServerConfig$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return ServerConfig$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ServerConfig$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    ServerConfig$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return ServerConfig$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ServerConfig$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    ServerConfig$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return ServerConfig$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return ServerConfig$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return ServerConfig$.MODULE$.logger();
  }
  
  public static int adminPort() {
    return ServerConfig$.MODULE$.adminPort();
  }
  
  public static int masterSslPort() {
    return ServerConfig$.MODULE$.masterSslPort();
  }
  
  public static int masterPort() {
    return ServerConfig$.MODULE$.masterPort();
  }
  
  public static Set<String> getMasterUrlList() {
    return ServerConfig$.MODULE$.getMasterUrlList();
  }
  
  public static String getKeyStoreFile() {
    return ServerConfig$.MODULE$.getKeyStoreFile();
  }
  
  public static String getConfigPath() {
    return ServerConfig$.MODULE$.getConfigPath();
  }
  
  public static String keyStorePassword() {
    return ServerConfig$.MODULE$.keyStorePassword();
  }
  
  public static String keyStoreFile() {
    return ServerConfig$.MODULE$.keyStoreFile();
  }
  
  public static String aoFeiLogPath() {
    return ServerConfig$.MODULE$.aoFeiLogPath();
  }
  
  public static String robotSceneCount() {
    return ServerConfig$.MODULE$.robotSceneCount();
  }
  
  public static String i18n() {
    return ServerConfig$.MODULE$.i18n();
  }
  
  public static String masterUrl() {
    return ServerConfig$.MODULE$.masterUrl();
  }
  
  public static boolean needTestCode() {
    return ServerConfig$.MODULE$.needTestCode();
  }
  
  public static boolean isDebugServer() {
    return ServerConfig$.MODULE$.isDebugServer();
  }
  
  public static int serverId() {
    return ServerConfig$.MODULE$.serverId();
  }
  
  public static String jdbcPassword() {
    return ServerConfig$.MODULE$.jdbcPassword();
  }
  
  public static String jdbcUser() {
    return ServerConfig$.MODULE$.jdbcUser();
  }
  
  public static String jdbcUrl() {
    return ServerConfig$.MODULE$.jdbcUrl();
  }
  
  public static Properties props() {
    return ServerConfig$.MODULE$.props();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\core\ServerConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */