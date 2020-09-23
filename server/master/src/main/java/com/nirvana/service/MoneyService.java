package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import scala.Enumeration;
import scala.Function0;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\0055v!B\001\003\021\003I\021\001D'p]\026L8+\032:wS\016,'BA\002\005\003\035\031XM\035<jG\026T!!\002\004\002\0179L'O^1oC*\tq!A\002d_6\034\001\001\005\002\013\0275\t!AB\003\r\005!\005QB\001\007N_:,\027pU3sm&\034Wm\005\002\f\035A\021!bD\005\003!\t\021q\"\0212tiJ\f7\r^*feZL7-\032\005\006%-!\taE\001\007y%t\027\016\036 \025\003%AQ!F\006\005\002Y\tab]=t!V$x*\036;N_:,\027\020F\003\030;\031\032\004\b\005\002\03175\t\021DC\001\033\003\025\0318-\0317b\023\ta\022D\001\003V]&$\b\"\002\020\025\001\004y\022A\003;p!2\f\0270\032:JIB\021\001e\t\b\0031\005J!AI\r\002\rA\023X\rZ3g\023\t!SE\001\004TiJLgn\032\006\003EeAQa\n\013A\002!\n\001\"\033;f[RK\b/\032\t\003S=r!AK\027\016\003-R!\001\f\003\002\013QL\b/Z:\n\0059Z\023\001C%uK6$\026\020]3\n\005A\n$!\002,bYV,\027B\001\032\032\005-)e.^7fe\006$\030n\0348\t\013Q\"\002\031A\033\002\0135|g.Z=\021\005a1\024BA\034\032\005\rIe\016\036\005\006sQ\001\raH\001\be\026l\027M]6t\021\025Y4\002\"\001=\003A\031\030p\035*fG>4XM]=N_:,\027\020F\003\030{}\002\025\tC\003?u\001\007q$\001\007ge>l\007\013\\1zKJLE\rC\003(u\001\007\001\006C\0035u\001\007Q\007C\003:u\001\007q\004C\003D\027\021\005A)\001\006rk\026\024\0300T8oKf$\"!N#\t\013\031\023\005\031A\020\002\021Ad\027-_3s\023\022DQ\001S\006\005\002%\013Qb]=t!V$x*\036;H_2$G#B\fK\0272s\005\"\002\020H\001\004y\002\"B\024H\001\004A\003\"B'H\001\004)\024\001B4pY\022DQ!O$A\002}AQ\001U\006\005\002E\013qb]=t%\026\034wN^3ss\036{G\016\032\013\006/I\033F+\026\005\006}=\003\ra\b\005\006O=\003\r\001\013\005\006\033>\003\r!\016\005\006s=\003\ra\b\005\006/.!\t\001W\001\ncV,'/_$pY\022$\"!N-\t\013\0313\006\031A\020\t\013m[A\021\001/\002\035ML8\017U;u\037V$(iR8mIR)q#\0300`C\")aD\027a\001?!)qE\027a\001Q!)\001M\027a\001k\005)!mR8mI\")\021H\027a\001?!)1m\003C\001I\006\0012/_:SK\016|g/\032:z\005\036{G\016\032\013\006/\0254w\r\033\005\006}\t\004\ra\b\005\006O\t\004\r\001\013\005\006A\n\004\r!\016\005\006s\t\004\ra\b\005\006U.!\ta[\001\013cV,'/\037\"H_2$GCA\033m\021\0251\025\0161\001 \021\025q7\002\"\001p\003A\tX/\032:z!2\f\0270\032:N_:,\027\020\006\002qmB\021\021\017^\007\002e*\0211\017B\001\005G>\024X-\003\002ve\n9Q*\0319CK\006t\007\"\002$n\001\004y\002\"\002=\f\t\003I\030AC4fi\032{'\017^;oKR\021\001O\037\005\006\r^\004\ra\b\005\006y.!\t!`\001\024gf\034\b+\036;PkR\034F/\031:EK\n\024\030n\035\013\006/y|\030\021\001\005\006=m\004\ra\b\005\006Om\004\r\001\013\005\007\003\007Y\b\031A\033\002\025M$\030M\035#fEJL7\017C\004\002\b-!\t!!\003\002+ML8OU3d_Z,'/_*uCJ$UM\031:jgR9q#a\003\002\016\005=\001B\002 \002\006\001\007q\004\003\004(\003\013\001\r\001\013\005\b\003\007\t)\0011\0016\021\035\t\031b\003C\001\003+\t\021c]=t!V$x*\036;Ti\006\0248i\\5o)\0359\022qCA\r\0037AaAHA\t\001\004y\002BB\024\002\022\001\007\001\006C\004\002\036\005E\001\031A\033\002\021M$\030M]\"pS:Dq!!\t\f\t\003\t\031#A\ntsN\024VmY8wKJL8\013^1s\007>Lg\016F\004\030\003K\t9#!\013\t\ry\ny\0021\001 \021\0319\023q\004a\001Q!9\021QDA\020\001\004)\004bBA\027\027\021\005\021qF\001\024gf\034\b+\036;PkR\f%/\0328b'\016|'/\032\013\b/\005E\0221GA\033\021\031q\0221\006a\001?!1q%a\013A\002!Bq!a\016\002,\001\007Q'\001\006be\026t\027mU2pe\026Dq!a\017\f\t\003\ti$A\013tsN\024VmY8wKJL\030I]3oCN\033wN]3\025\017]\ty$!\021\002D!1a(!\017A\002}AaaJA\035\001\004A\003bBA\034\003s\001\r!\016\005\b\003\017ZA\021AA%\003e\031\030p\035)vi>+H\017V8oON[\027\016\0347DCBLG/\0317\025\017]\tY%!\024\002P!1a$!\022A\002}AaaJA#\001\004A\003bBA)\003\013\002\r!N\001\021i>twmU6jY2\034\025\r]5uC2Dq!!\026\f\t\003\t9&A\016tsN\024VmY8wKJLHk\0348h'.LG\016\\\"ba&$\030\r\034\013\b/\005e\0231LA/\021\031q\0241\013a\001?!1q%a\025A\002!Bq!!\025\002T\001\007Q\007C\004\002b-!\t!a\031\002\027ML8\017U;u\037V$h\013\035\013\b/\005\025\024qMA5\021\031q\022q\fa\001?!1q%a\030A\002!Bq!a\033\002`\001\007Q'\001\002wa\"9\021qN\006\005\002\005E\024!D:zgJ+7m\034<fef4\006\017F\004\030\003g\n)(a\036\t\ry\ni\0071\001 \021\0319\023Q\016a\001Q!9\0211NA7\001\004)\004bBA>\027\021\005\021QP\001\017gf\034\b+\036;PkR\034\006/\0328e)\0359\022qPAA\003\007CaAHA=\001\004y\002BB\024\002z\001\007\001\006C\004\002\006\006e\004\031A\033\002\013M\004XM\0343\t\017\005%5\002\"\001\002\f\006\0012/_:SK\016|g/\032:z'B,g\016\032\013\b/\0055\025qRAI\021\031q\024q\021a\001?!1q%a\"A\002!Bq!!\"\002\b\002\007Q\007C\004\002\026.!\t!a&\002)ML8\017U;u\037V$()\031;uY\026\0346m\034:f)\0359\022\021TAN\003;CaAHAJ\001\004y\002BB\024\002\024\002\007\001\006C\004\002 \006M\005\031A\033\002\027\t\fG\017\0367f'\016|'/\032\005\b\003G[A\021AAS\003Y\031\030p\035*fG>4XM]=CCR$H.Z*d_J,GcB\f\002(\006%\0261\026\005\007}\005\005\006\031A\020\t\r\035\n\t\0131\001)\021\035\ty*!)A\002U\002")
public final class MoneyService {
  public static void sysRecoveryBattleScore(String paramString, Enumeration.Value paramValue, int paramInt) {
    MoneyService$.MODULE$.sysRecoveryBattleScore(paramString, paramValue, paramInt);
  }
  
  public static void sysPutOutBattleScore(String paramString, Enumeration.Value paramValue, int paramInt) {
    MoneyService$.MODULE$.sysPutOutBattleScore(paramString, paramValue, paramInt);
  }
  
  public static void sysRecoverySpend(String paramString, Enumeration.Value paramValue, int paramInt) {
    MoneyService$.MODULE$.sysRecoverySpend(paramString, paramValue, paramInt);
  }
  
  public static void sysPutOutSpend(String paramString, Enumeration.Value paramValue, int paramInt) {
    MoneyService$.MODULE$.sysPutOutSpend(paramString, paramValue, paramInt);
  }
  
  public static void sysRecoveryVp(String paramString, Enumeration.Value paramValue, int paramInt) {
    MoneyService$.MODULE$.sysRecoveryVp(paramString, paramValue, paramInt);
  }
  
  public static void sysPutOutVp(String paramString, Enumeration.Value paramValue, int paramInt) {
    MoneyService$.MODULE$.sysPutOutVp(paramString, paramValue, paramInt);
  }
  
  public static void sysRecoveryTongSkillCapital(String paramString, Enumeration.Value paramValue, int paramInt) {
    MoneyService$.MODULE$.sysRecoveryTongSkillCapital(paramString, paramValue, paramInt);
  }
  
  public static void sysPutOutTongSkillCapital(String paramString, Enumeration.Value paramValue, int paramInt) {
    MoneyService$.MODULE$.sysPutOutTongSkillCapital(paramString, paramValue, paramInt);
  }
  
  public static void sysRecoveryArenaScore(String paramString, Enumeration.Value paramValue, int paramInt) {
    MoneyService$.MODULE$.sysRecoveryArenaScore(paramString, paramValue, paramInt);
  }
  
  public static void sysPutOutArenaScore(String paramString, Enumeration.Value paramValue, int paramInt) {
    MoneyService$.MODULE$.sysPutOutArenaScore(paramString, paramValue, paramInt);
  }
  
  public static void sysRecoveryStarCoin(String paramString, Enumeration.Value paramValue, int paramInt) {
    MoneyService$.MODULE$.sysRecoveryStarCoin(paramString, paramValue, paramInt);
  }
  
  public static void sysPutOutStarCoin(String paramString, Enumeration.Value paramValue, int paramInt) {
    MoneyService$.MODULE$.sysPutOutStarCoin(paramString, paramValue, paramInt);
  }
  
  public static void sysRecoveryStarDebris(String paramString, Enumeration.Value paramValue, int paramInt) {
    MoneyService$.MODULE$.sysRecoveryStarDebris(paramString, paramValue, paramInt);
  }
  
  public static void sysPutOutStarDebris(String paramString, Enumeration.Value paramValue, int paramInt) {
    MoneyService$.MODULE$.sysPutOutStarDebris(paramString, paramValue, paramInt);
  }
  
  public static MapBean getFortune(String paramString) {
    return MoneyService$.MODULE$.getFortune(paramString);
  }
  
  public static MapBean queryPlayerMoney(String paramString) {
    return MoneyService$.MODULE$.queryPlayerMoney(paramString);
  }
  
  public static int queryBGold(String paramString) {
    return MoneyService$.MODULE$.queryBGold(paramString);
  }
  
  public static void sysRecoveryBGold(String paramString1, Enumeration.Value paramValue, int paramInt, String paramString2) {
    MoneyService$.MODULE$.sysRecoveryBGold(paramString1, paramValue, paramInt, paramString2);
  }
  
  public static void sysPutOutBGold(String paramString1, Enumeration.Value paramValue, int paramInt, String paramString2) {
    MoneyService$.MODULE$.sysPutOutBGold(paramString1, paramValue, paramInt, paramString2);
  }
  
  public static int queryGold(String paramString) {
    return MoneyService$.MODULE$.queryGold(paramString);
  }
  
  public static void sysRecoveryGold(String paramString1, Enumeration.Value paramValue, int paramInt, String paramString2) {
    MoneyService$.MODULE$.sysRecoveryGold(paramString1, paramValue, paramInt, paramString2);
  }
  
  public static void sysPutOutGold(String paramString1, Enumeration.Value paramValue, int paramInt, String paramString2) {
    MoneyService$.MODULE$.sysPutOutGold(paramString1, paramValue, paramInt, paramString2);
  }
  
  public static int queryMoney(String paramString) {
    return MoneyService$.MODULE$.queryMoney(paramString);
  }
  
  public static void sysRecoveryMoney(String paramString1, Enumeration.Value paramValue, int paramInt, String paramString2) {
    MoneyService$.MODULE$.sysRecoveryMoney(paramString1, paramValue, paramInt, paramString2);
  }
  
  public static void sysPutOutMoney(String paramString1, Enumeration.Value paramValue, int paramInt, String paramString2) {
    MoneyService$.MODULE$.sysPutOutMoney(paramString1, paramValue, paramInt, paramString2);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MoneyService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    MoneyService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return MoneyService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MoneyService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    MoneyService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return MoneyService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MoneyService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    MoneyService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return MoneyService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MoneyService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    MoneyService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return MoneyService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MoneyService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    MoneyService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return MoneyService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return MoneyService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return MoneyService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\MoneyService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */