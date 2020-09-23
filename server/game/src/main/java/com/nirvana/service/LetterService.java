package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import java.util.Date;
import scala.Enumeration;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005Mt!B\001\003\021\003I\021!\004'fiR,'oU3sm&\034WM\003\002\004\t\00591/\032:wS\016,'BA\003\007\003\035q\027N\035<b]\006T\021aB\001\004G>l7\001\001\t\003\025-i\021A\001\004\006\031\tA\t!\004\002\016\031\026$H/\032:TKJ4\030nY3\024\005-q\001C\001\006\020\023\t\001\"AA\bBEN$(/Y2u'\026\024h/[2f\021\025\0212\002\"\001\024\003\031a\024N\\5u}Q\t\021\002C\004\026\027\t\007IQ\001\f\002\025\025C\006+\023*F?\022\013\025,F\001\030\037\005Ab$\002\001\033~\"\007\001B\002\016\fA\0035q#A\006F1BK%+R0E\003f\003\003\"\002\017\f\t\023i\022!C:v[\026C\b/\033:f+\005q\002CA\020%\033\005\001#BA\021#\003\021)H/\0337\013\003\r\nAA[1wC&\021Q\005\t\002\005\t\006$X\rC\003(\027\021\005\001&A\bdQ\026\0347\016T1ti2+G\017^3s)\tIs\006\005\002+[5\t1FC\001-\003\025\0318-\0317b\023\tq3F\001\003V]&$\b\"\002\031'\001\004\t\024\001\0039mCf,'/\0233\021\005I*dB\001\0264\023\t!4&\001\004Qe\026$WMZ\005\003m]\022aa\025;sS:<'B\001\033,\021\025I4\002\"\003;\003IIgn]3si2+G\017^3s!2\f\0270\032:\025\t%ZDH\020\005\006aa\002\r!\r\005\006{a\002\r!M\001\tY\026$H/\032:JI\")q\b\017a\001=\0051Q\r\0379je\026DQ!Q\006\005\002\t\013!#\0369eCR,G*\032;uKJ\034F/\031;vgR!1IR$I!\tQC)\003\002FW\t\031\021J\034;\t\013A\002\005\031A\031\t\013u\002\005\031A\031\t\013%\003\005\031A\"\002\rM$\030\r^;t\021\025Y5\002\"\001M\003)9W\r\036'fiR,'o\035\013\003\033j\0032AT)U\035\tQs*\003\002QW\0059\001/Y2lC\036,\027B\001*T\005\021a\025n\035;\013\005A[\003CA+Y\033\0051&BA,\005\003\021\031wN]3\n\005e3&aB'ba\n+\027M\034\005\006a)\003\r!\r\005\0069.!\t!X\001\nO\026$H*\032;uKJ$2\001\0260`\021\025\0014\f1\0012\021\025i4\f1\0012\021\025\t7\002\"\001c\003\035I7/\022=jgR$\"a\0314\021\005)\"\027BA3,\005\035\021un\0347fC:DQ!\0201A\002EBQ\001[\006\005\002%\fAcZ3u\035>$X\t\037;sC\016$H*\032;uKJ\034HCA'k\021\025\001t\r1\0012\021\025a7\002\"\001n\0031Ign]3si2+G\017^3s)E\td\016\035:umb\fY!a\004\002\024\005]\0211\004\005\006_.\004\r!M\001\003S\022DQ!]6A\002\r\013!\002\\3ui\026\024H+\0379f\021\025\0318\0161\0012\003\031\031XM\0343U_\")Qo\033a\001c\005)A/\033;mK\")qo\033a\001c\00591m\0348uK:$\b\"B=l\001\004Q\030\001C5uK6$\026\020]3\021\007m\f\031A\004\002}6\tQP\003\002\t\005)A/\0379fg&\031\021\021A?\002\021%#X-\034+za\026LA!!\002\002\b\t)a+\0317vK&\031\021\021B\026\003\027\025sW/\\3sCRLwN\034\005\007\003\033Y\007\031A\031\002\r\005$H/Y2i\021!\t\tb\033I\001\002\004\031\025A\0037fm\026dG*[7ji\"A\021QC6\021\002\003\007a$A\005ti\006\024H\017V5nK\"A\021\021D6\021\002\003\007a$A\004f]\022$\026.\\3\t\021\005u1\016%AA\002E\n\021\002\0357bs\026\024\030\nZ:\t\017\005\0052\002\"\001\002$\005aA-\0327fi\026dU\r\036;feR)\021&!\n\002(!1\001'a\bA\002EBa!PA\020\001\004\t\004bBA\026\027\021\005\021QF\001\025I\026dW\r^3MKR$XM\035\"z\033\006LG.\0233\025\007%\ny\003C\004\0022\005%\002\031A\031\002\r5\f\027\016\\%e\021\035\t)d\003C\001\003o\tacZ3u\013b\004\030N]3Q\031\006LXM\035'fiR,'o]\013\002\033\"9\0211H\006\005\002\005u\022!E4fi:+w\017T3ui\026\0248i\\;oiR\0311)a\020\t\rA\nI\0041\0012\021\035\t\031e\003C\001\003o\t\021cZ3u\035>$8+\0328e\031\026$H/\032:t\021%\t9eCI\001\n\003\tI%\001\fj]N,'\017\036'fiR,'\017\n3fM\006,H\016\036\0239+\t\tYEK\002D\003\033Z#!a\024\021\t\005E\0231L\007\003\003'RA!!\026\002X\005IQO\\2iK\016\\W\r\032\006\004\0033Z\023AC1o]>$\030\r^5p]&!\021QLA*\005E)hn\0315fG.,GMV1sS\006t7-\032\005\n\003CZ\021\023!C\001\003G\na#\0338tKJ$H*\032;uKJ$C-\0324bk2$H%O\013\003\003KR3AHA'\021%\tIgCI\001\n\003\t\031'A\fj]N,'\017\036'fiR,'\017\n3fM\006,H\016\036\0232a!I\021QN\006\022\002\023\005\021qN\001\030S:\034XM\035;MKR$XM\035\023eK\032\fW\017\034;%cE*\"!!\035+\007E\ni\005")
public final class LetterService {
  public static String insertLetter$default$11() {
    return LetterService$.MODULE$.insertLetter$default$11();
  }
  
  public static Date insertLetter$default$10() {
    return LetterService$.MODULE$.insertLetter$default$10();
  }
  
  public static Date insertLetter$default$9() {
    return LetterService$.MODULE$.insertLetter$default$9();
  }
  
  public static int insertLetter$default$8() {
    return LetterService$.MODULE$.insertLetter$default$8();
  }
  
  public static List<MapBean> getNotSendLetters() {
    return LetterService$.MODULE$.getNotSendLetters();
  }
  
  public static int getNewLetterCount(String paramString) {
    return LetterService$.MODULE$.getNewLetterCount(paramString);
  }
  
  public static List<MapBean> getExpirePLayerLetters() {
    return LetterService$.MODULE$.getExpirePLayerLetters();
  }
  
  public static void deleteLetterByMailId(String paramString) {
    LetterService$.MODULE$.deleteLetterByMailId(paramString);
  }
  
  public static void deleteLetter(String paramString1, String paramString2) {
    LetterService$.MODULE$.deleteLetter(paramString1, paramString2);
  }
  
  public static String insertLetter(String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, Enumeration.Value paramValue, String paramString5, int paramInt2, Date paramDate1, Date paramDate2, String paramString6) {
    return LetterService$.MODULE$.insertLetter(paramString1, paramInt1, paramString2, paramString3, paramString4, paramValue, paramString5, paramInt2, paramDate1, paramDate2, paramString6);
  }
  
  public static List<MapBean> getNotExtractLetters(String paramString) {
    return LetterService$.MODULE$.getNotExtractLetters(paramString);
  }
  
  public static boolean isExist(String paramString) {
    return LetterService$.MODULE$.isExist(paramString);
  }
  
  public static MapBean getLetter(String paramString1, String paramString2) {
    return LetterService$.MODULE$.getLetter(paramString1, paramString2);
  }
  
  public static List<MapBean> getLetters(String paramString) {
    return LetterService$.MODULE$.getLetters(paramString);
  }
  
  public static int updateLetterStatus(String paramString1, String paramString2, int paramInt) {
    return LetterService$.MODULE$.updateLetterStatus(paramString1, paramString2, paramInt);
  }
  
  public static void checkLastLetter(String paramString) {
    LetterService$.MODULE$.checkLastLetter(paramString);
  }
  
  public static long EXPIRE_DAY() {
    return LetterService$.MODULE$.EXPIRE_DAY();
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    LetterService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    LetterService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return LetterService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    LetterService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    LetterService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return LetterService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    LetterService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    LetterService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return LetterService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    LetterService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    LetterService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return LetterService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    LetterService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    LetterService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return LetterService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return LetterService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return LetterService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\LetterService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */