package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001I;Q!\001\002\t\002%\tAbU6jY2\034VM\035<jG\026T!a\001\003\002\017M,'O^5dK*\021QAB\001\b]&\024h/\0318b\025\0059\021aA2p[\016\001\001C\001\006\f\033\005\021a!\002\007\003\021\003i!\001D*lS2d7+\032:wS\016,7CA\006\017!\tQq\"\003\002\021\005\ty\021IY:ue\006\034GoU3sm&\034W\rC\003\023\027\021\0051#\001\004=S:LGO\020\013\002\023!)Qc\003C\001-\005Iq-\032;TW&dGn\035\013\003/\035\0022\001\007\020\"\035\tIB$D\001\033\025\005Y\022!B:dC2\f\027BA\017\033\003\035\001\030mY6bO\026L!a\b\021\003\t1K7\017\036\006\003;i\001\"AI\023\016\003\rR!\001\n\003\002\t\r|'/Z\005\003M\r\022q!T1q\005\026\fg\016C\003))\001\007\021&\001\005qY\006LXM]%e!\tQSF\004\002\032W%\021AFG\001\007!J,G-\0324\n\0059z#AB*ue&twM\003\002-5!)\021g\003C\001e\005YQ\017\0353bi\026\0346.\0337m)\021\031dg\016\037\021\005e!\024BA\033\033\005\021)f.\033;\t\013!\002\004\031A\025\t\013a\002\004\031A\035\002\017M\\\027\016\0347JIB\021\021DO\005\003wi\0211!\0238u\021\025i\004\0071\001:\003)\0318.\0337m\031\0264X\r\034\005\006-!\t\001Q\001\tO\026$()\0364ggR\021\021&\021\005\006Qy\002\r!\013\005\006\007.!\t\001R\001\013kB$\027\r^3Ck\0324GcA\032F\r\")\001F\021a\001S!)qI\021a\001S\005A!-\0364g\025N|g\016C\003J\027\021\005!*A\006hKR\0346.\0337m'\026$HCA\025L\021\025A\003\n1\001*\021\025i5\002\"\001O\0039)\b\017Z1uKN[\027\016\0347TKR$2aM(Q\021\025AC\n1\001*\021\025\tF\n1\001*\003\031\031wN\0344jO\002")
public final class SkillService {
  public static void updateSkillSet(String paramString1, String paramString2) {
    SkillService$.MODULE$.updateSkillSet(paramString1, paramString2);
  }
  
  public static String getSkillSet(String paramString) {
    return SkillService$.MODULE$.getSkillSet(paramString);
  }
  
  public static void updateBuff(String paramString1, String paramString2) {
    SkillService$.MODULE$.updateBuff(paramString1, paramString2);
  }
  
  public static String getBuffs(String paramString) {
    return SkillService$.MODULE$.getBuffs(paramString);
  }
  
  public static void updateSkill(String paramString, int paramInt1, int paramInt2) {
    SkillService$.MODULE$.updateSkill(paramString, paramInt1, paramInt2);
  }
  
  public static List<MapBean> getSkills(String paramString) {
    return SkillService$.MODULE$.getSkills(paramString);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    SkillService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    SkillService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return SkillService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    SkillService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    SkillService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return SkillService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    SkillService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    SkillService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return SkillService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    SkillService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    SkillService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return SkillService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    SkillService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    SkillService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return SkillService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return SkillService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return SkillService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\SkillService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */