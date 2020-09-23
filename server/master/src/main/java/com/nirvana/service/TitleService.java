package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import java.util.Date;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001=;Q!\001\002\t\002%\tA\002V5uY\026\034VM\035<jG\026T!a\001\003\002\017M,'O^5dK*\021QAB\001\b]&\024h/\0318b\025\0059\021aA2p[\016\001\001C\001\006\f\033\005\021a!\002\007\003\021\003i!\001\004+ji2,7+\032:wS\016,7CA\006\017!\tQq\"\003\002\021\005\ty\021IY:ue\006\034GoU3sm&\034W\rC\003\023\027\021\0051#\001\004=S:LGO\020\013\002\023!)Qc\003C\001-\005Iq-\032;USRdWm\035\013\003/\035\0022\001\007\020\"\035\tIB$D\001\033\025\005Y\022!B:dC2\f\027BA\017\033\003\035\001\030mY6bO\026L!a\b\021\003\t1K7\017\036\006\003;i\001\"AI\023\016\003\rR!\001\n\003\002\t\r|'/Z\005\003M\r\022q!T1q\005\026\fg\016C\003))\001\007\021&\001\005qY\006LXM]%e!\tQSF\004\002\032W%\021AFG\001\007!J,G-\0324\n\0059z#AB*ue&twM\003\002-5!)\021g\003C\001e\005YQ\017\0353bi\026$\026\016\0367f)\031\031dg\016\037?\001B\021\021\004N\005\003ki\021A!\0268ji\")\001\006\ra\001S!)\001\b\ra\001s\0059A/\033;mK&#\007CA\r;\023\tY$DA\002J]RDQ!\020\031A\002e\naa\035;biV\034\b\"B 1\001\004I\024a\0018v[\")\021\t\ra\001\005\006QQ\r\0379je\026$\026.\\3\021\005\rCU\"\001#\013\005\0253\025\001B;uS2T\021aR\001\005U\0064\030-\003\002J\t\n!A)\031;f\021\025Y5\002\"\001M\003!9W\r\036+ji2,GcA\021N\035\")\001F\023a\001S!)\001H\023a\001s\001")
public final class TitleService {
  public static MapBean getTitle(String paramString, int paramInt) {
    return TitleService$.MODULE$.getTitle(paramString, paramInt);
  }
  
  public static void updateTitle(String paramString, int paramInt1, int paramInt2, int paramInt3, Date paramDate) {
    TitleService$.MODULE$.updateTitle(paramString, paramInt1, paramInt2, paramInt3, paramDate);
  }
  
  public static List<MapBean> getTitles(String paramString) {
    return TitleService$.MODULE$.getTitles(paramString);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    TitleService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    TitleService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return TitleService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    TitleService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    TitleService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return TitleService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    TitleService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    TitleService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return TitleService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    TitleService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    TitleService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return TitleService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    TitleService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    TitleService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return TitleService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return TitleService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return TitleService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\TitleService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */