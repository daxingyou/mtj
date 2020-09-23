package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001m;Q!\001\002\t\002%\tA\"\021:f]\006\034VM\035<jG\026T!a\001\003\002\017M,'O^5dK*\021QAB\001\b]&\024h/\0318b\025\0059\021aA2p[\016\001\001C\001\006\f\033\005\021a!\002\007\003\021\003i!\001D!sK:\f7+\032:wS\016,7CA\006\017!\tQq\"\003\002\021\005\ty\021IY:ue\006\034GoU3sm&\034W\rC\003\023\027\021\0051#\001\004=S:LGO\020\013\002\023!)Qc\003C\001-\005iq-\032;Be\026t\027MU1oWN$\022a\006\t\0041y\tcBA\r\035\033\005Q\"\"A\016\002\013M\034\027\r\\1\n\005uQ\022a\0029bG.\fw-Z\005\003?\001\022A\001T5ti*\021QD\007\t\003E\025j\021a\t\006\003I\021\tAaY8sK&\021ae\t\002\b\033\006\004()Z1o\021\025A3\002\"\001*\0031\tG\rZ!sK:\f'+\0318l)\031QSf\f\035;yA\021\021dK\005\003Yi\0211!\0238u\021\025qs\0051\001+\003\021\021\030M\\6\t\013A:\003\031A\031\002\021Ad\027-_3s\023\022\004\"AM\033\017\005e\031\024B\001\033\033\003\031\001&/\0323fM&\021ag\016\002\007'R\024\030N\\4\013\005QR\002\"B\035(\001\004\t\024\001\0028b[\026DQaO\024A\002)\naaY1sK\026\024\b\"B\037(\001\004Q\023!\0027fm\026d\007\"B \f\t\003\001\025AD4fiBc\027-_3s\003J,g.\031\013\003C\005CQ\001\r A\002EBQaQ\006\005\002\021\013\001\"\0313e\003J,g.\031\013\006U\0253\005J\023\005\006a\t\003\r!\r\005\006\017\n\003\rAK\001\006i&lWm\035\005\006\023\n\003\rAK\001\bEVLH+[7f\021\025Y%\t1\001+\003!i\027\r_0sC:\\\007\"B'\f\t\003q\025aD;qI\006$X-\021:f]\006$\026.\\3\025\007)z\005\013C\0031\031\002\007\021\007C\003H\031\002\007!\006C\003S\027\021\0051+\001\nva\022\fG/Z!sK:\f')^=US6,G\003\002\026U+^CQ\001M)A\002EBQAV)A\002)\n\001BY;z)&lWm\035\005\006\017F\003\rA\013\005\0063.!\tAW\001\013e\026\034X\r\036+j[\026\034H#\001\026")
public final class ArenaService {
  public static int resetTimes() {
    return ArenaService$.MODULE$.resetTimes();
  }
  
  public static int updateArenaBuyTime(String paramString, int paramInt1, int paramInt2) {
    return ArenaService$.MODULE$.updateArenaBuyTime(paramString, paramInt1, paramInt2);
  }
  
  public static int updateArenaTime(String paramString, int paramInt) {
    return ArenaService$.MODULE$.updateArenaTime(paramString, paramInt);
  }
  
  public static int addArena(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    return ArenaService$.MODULE$.addArena(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public static MapBean getPlayerArena(String paramString) {
    return ArenaService$.MODULE$.getPlayerArena(paramString);
  }
  
  public static int addArenaRank(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3) {
    return ArenaService$.MODULE$.addArenaRank(paramInt1, paramString1, paramString2, paramInt2, paramInt3);
  }
  
  public static List<MapBean> getArenaRanks() {
    return ArenaService$.MODULE$.getArenaRanks();
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ArenaService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    ArenaService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return ArenaService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ArenaService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    ArenaService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return ArenaService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ArenaService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    ArenaService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return ArenaService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ArenaService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    ArenaService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return ArenaService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ArenaService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    ArenaService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return ArenaService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return ArenaService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return ArenaService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\ArenaService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */