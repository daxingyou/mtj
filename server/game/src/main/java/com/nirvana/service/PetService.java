package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001u;Q!\001\002\t\002%\t!\002U3u'\026\024h/[2f\025\t\031A!A\004tKJ4\030nY3\013\005\0251\021a\0028jeZ\fg.\031\006\002\017\005\0311m\\7\004\001A\021!bC\007\002\005\031)AB\001E\001\033\tQ\001+\032;TKJ4\030nY3\024\005-q\001C\001\006\020\023\t\001\"AA\bBEN$(/Y2u'\026\024h/[2f\021\025\0212\002\"\001\024\003\031a\024N\\5u}Q\t\021\002C\003\026\027\021\005a#\001\006hKR\004\026M\035;oKJ$\"aF\017\021\005aYR\"A\r\013\005i!\021\001B2pe\026L!\001H\r\003\0175\013\007OQ3b]\")a\004\006a\001?\005I\001\017\\1zKJ|\026\016\032\t\003A\031r!!\t\023\016\003\tR\021aI\001\006g\016\fG.Y\005\003K\t\na\001\025:fI\0264\027BA\024)\005\031\031FO]5oO*\021QE\t\005\006U-!\taK\001\025O\026$\b+\031:u]\026\024HK]1og\032|'/\\:\025\0051\032\004cA\0271/9\021\021EL\005\003_\t\nq\001]1dW\006<W-\003\0022e\t!A*[:u\025\ty#\005C\003\037S\001\007q\004C\0036\027\021\005a'A\007va\022\fG/\032)beRtWM\035\013\toibTHQ$J\027B\021\021\005O\005\003s\t\022A!\0268ji\")1\b\016a\001?\005\021\021\016\032\005\006=Q\002\ra\b\005\006}Q\002\raP\001\006Y\0264X\r\034\t\003C\001K!!\021\022\003\007%sG\017C\003Di\001\007A)A\002fqB\004\"!I#\n\005\031\023#\001\002'p]\036DQ\001\023\033A\002}\nAa\035;be\")!\n\016a\001\t\0069\021\r\032<`Kb\004\b\"\002'5\001\004y\024AB;tK~KG\rC\003O\027\021\005q*\001\006bI\022\004\026M\035;oKJ$ra\b)S'R+f\013C\003R\033\002\007q$\001\005qY\006LXM]%e\021\025qT\n1\001@\021\025\031U\n1\001@\021\025AU\n1\001@\021\025QU\n1\001@\021\025aU\n1\001@\021\025A6\002\"\001Z\003M\tG\r\032)beRtWM\035+sC:\034hm\034:n)\0219$l\027/\t\013y9\006\031A\020\t\013m:\006\031A \t\013y:\006\031A ")
public final class PetService {
  public static void addPartnerTransform(String paramString, int paramInt1, int paramInt2) {
    PetService$.MODULE$.addPartnerTransform(paramString, paramInt1, paramInt2);
  }
  
  public static String addPartner(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    return PetService$.MODULE$.addPartner(paramString, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public static void updatePartner(String paramString1, String paramString2, int paramInt1, long paramLong1, int paramInt2, long paramLong2, int paramInt3) {
    PetService$.MODULE$.updatePartner(paramString1, paramString2, paramInt1, paramLong1, paramInt2, paramLong2, paramInt3);
  }
  
  public static List<MapBean> getPartnerTransforms(String paramString) {
    return PetService$.MODULE$.getPartnerTransforms(paramString);
  }
  
  public static MapBean getPartner(String paramString) {
    return PetService$.MODULE$.getPartner(paramString);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    PetService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    PetService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return PetService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    PetService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    PetService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return PetService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    PetService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    PetService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return PetService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    PetService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    PetService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return PetService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    PetService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    PetService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return PetService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return PetService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return PetService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\PetService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */