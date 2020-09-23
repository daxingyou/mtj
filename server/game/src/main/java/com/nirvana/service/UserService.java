package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import scala.Function0;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001A<Q!\001\002\t\002%\t1\"V:feN+'O^5dK*\0211\001B\001\bg\026\024h/[2f\025\t)a!A\004oSJ4\030M\\1\013\003\035\t1aY8n\007\001\001\"AC\006\016\003\t1Q\001\004\002\t\0025\0211\"V:feN+'O^5dKN\0211B\004\t\003\025=I!\001\005\002\003\037\005\0237\017\036:bGR\034VM\035<jG\026DQAE\006\005\002M\ta\001P5oSRtD#A\005\t\013UYA\021\001\f\002\0179,w/V:feRAq#\b\024,[=\n4\007\005\002\03175\t\021DC\001\033\003\025\0318-\0317b\023\ta\022D\001\003V]&$\b\"\002\020\025\001\004y\022\001C;tKJt\027-\\3\021\005\001\032cB\001\r\"\023\t\021\023$\001\004Qe\026$WMZ\005\003I\025\022aa\025;sS:<'B\001\022\032\021\0259C\0031\001)\003!\031XM\035<fe&#\007C\001\r*\023\tQ\023DA\002J]RDQ\001\f\013A\002!\n!\001\0354\t\0139\"\002\031\001\025\002\023\rD\027M\0348fY&#\007\"\002\031\025\001\004y\022\001B;eS\022DQA\r\013A\002}\tq!\\1d\003\022$'\017C\0035)\001\007q$\001\002ja\")ag\003C\001o\005\tr-\032;Vg\026\024()_+tKJt\027-\\3\025\007art\b\005\002:y5\t!H\003\002<\t\005!1m\034:f\023\ti$HA\004NCB\024U-\0318\t\013y)\004\031A\020\t\013\035*\004\031\001\025\t\013\005[A\021\001\"\002/\035,GoQ3oi\026\024Xk]3s\005f,6/\032:oC6,GC\001\035D\021\025q\002\t1\001 \021\025)5\002\"\001G\0035qWm^\"f]R,'/V:feRAqc\022%K\0272ke\nC\003\037\t\002\007q\004C\003J\t\002\007q$\001\005qCN\034xo\034:e\021\025aC\t1\001)\021\025qC\t1\001)\021\025\001D\t1\001 \021\025\021D\t1\001 \021\025!D\t1\001 \021\025\0016\002\"\001R\003I9W\r\036+pW\026t')_+tKJt\027-\\3\025\005}\021\006\"\002\020P\001\004y\002\"\002+\f\t\003)\026\001F4fi\016+g\016^3s+N,'OQ=U_.,g\016\006\0029-\")qk\025a\001?\005)Ao\\6f]\")\021l\003C\0015\006\021r-\032;Vg\026\024h.Y7f\005f$vn[3o)\ty2\fC\003X1\002\007q\004C\003^\027\021\005a,\001\nva\022\fG/\032'bgR\004F.Y=fe&#Gc\001\025`A\")a\004\030a\001?!)\021\r\030a\001?\005aA.Y:u!2\f\0270\032:JI\")1m\003C\001I\006Yq-\032;UKN$8i\0343f)\tAT\rC\003gE\002\007q$\001\003d_\022,\007\"\0025\f\t\003I\027!F4fiR+7\017^\"pI\026\024\0250V:fe:\fW.\032\013\003q)DQAH4A\002}AQ\001\\\006\005\0025\fa\"\0369eCR,G+Z:u\007>$W\rF\002)]>DQAZ6A\002}AQAH6A\002}\001")
public final class UserService {
  public static int updateTestCode(String paramString1, String paramString2) {
    return UserService$.MODULE$.updateTestCode(paramString1, paramString2);
  }
  
  public static MapBean getTestCodeByUsername(String paramString) {
    return UserService$.MODULE$.getTestCodeByUsername(paramString);
  }
  
  public static MapBean getTestCode(String paramString) {
    return UserService$.MODULE$.getTestCode(paramString);
  }
  
  public static int updateLastPlayerId(String paramString1, String paramString2) {
    return UserService$.MODULE$.updateLastPlayerId(paramString1, paramString2);
  }
  
  public static String getUsernameByToken(String paramString) {
    return UserService$.MODULE$.getUsernameByToken(paramString);
  }
  
  public static MapBean getCenterUserByToken(String paramString) {
    return UserService$.MODULE$.getCenterUserByToken(paramString);
  }
  
  public static String getTokenByUsername(String paramString) {
    return UserService$.MODULE$.getTokenByUsername(paramString);
  }
  
  public static void newCenterUser(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, String paramString4, String paramString5) {
    UserService$.MODULE$.newCenterUser(paramString1, paramString2, paramInt1, paramInt2, paramString3, paramString4, paramString5);
  }
  
  public static MapBean getCenterUserByUsername(String paramString) {
    return UserService$.MODULE$.getCenterUserByUsername(paramString);
  }
  
  public static MapBean getUserByUsername(String paramString, int paramInt) {
    return UserService$.MODULE$.getUserByUsername(paramString, paramInt);
  }
  
  public static void newUser(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, String paramString3, String paramString4) {
    UserService$.MODULE$.newUser(paramString1, paramInt1, paramInt2, paramInt3, paramString2, paramString3, paramString4);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    UserService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    UserService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return UserService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    UserService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    UserService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return UserService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    UserService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    UserService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return UserService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    UserService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    UserService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return UserService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    UserService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    UserService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return UserService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return UserService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return UserService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\UserService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */