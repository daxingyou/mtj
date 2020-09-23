package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import java.util.Date;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005-u!B\001\003\021\003I\021AE$jMR\004\026mY6bO\026\034VM\035<jG\026T!a\001\003\002\017M,'O^5dK*\021QAB\001\b]&\024h/\0318b\025\0059\021aA2p[\016\001\001C\001\006\f\033\005\021a!\002\007\003\021\003i!AE$jMR\004\026mY6bO\026\034VM\035<jG\026\034\"a\003\b\021\005)y\021B\001\t\003\005=\t%m\035;sC\016$8+\032:wS\016,\007\"\002\n\f\t\003\031\022A\002\037j]&$h\bF\001\n\021\025)2\002\"\001\027\003M9W\r^$jMR\004\026mY6bO\026\034u.\0368u)\0059\002C\001\r\034\033\005I\"\"\001\016\002\013M\034\027\r\\1\n\005qI\"aA%oi\")ad\003C\001?\005\021r-\032;HS\032$\b+Y2lC\036,G*[:u)\r\001#\007\016\t\004C%bcB\001\022(\035\t\031c%D\001%\025\t)\003\"\001\004=e>|GOP\005\0025%\021\001&G\001\ba\006\0347.Y4f\023\tQ3F\001\003MSN$(B\001\025\032!\ti\003'D\001/\025\tyC!\001\003d_J,\027BA\031/\005\035i\025\r\035\"fC:DQaM\017A\002]\t!b\035;beR|&o\\<t\021\025)T\0041\001\030\003%\001\030mZ3`g&TX\rC\0038\027\021\005\001(\001\bhKR<\025N\032;QC\016\\\027mZ3\025\0051J\004\"\002\0367\001\0049\022AA5e\021\025a4\002\"\001>\0039\tG\rZ$jMR\004\026mY6bO\026$R\002\f H\023.ku*W.^?\006\034\007\"B <\001\004\001\025\001\0028b[\026\004\"!\021#\017\005a\021\025BA\"\032\003\031\001&/\0323fM&\021QI\022\002\007'R\024\030N\\4\013\005\rK\002\"\002%<\001\004\001\025\001C1di&4\030\016^=\t\013)[\004\031A\f\002\023\035Lg\r^0usB,\007\"\002'<\001\0049\022a\0028v[\n,'o\035\005\006\035n\002\r\001Q\001\fG\"\fgN\\3m?&$7\017C\003Qw\001\007\021+\001\006ti\006\024Ho\030;j[\026\004\"AU,\016\003MS!\001V+\002\tU$\030\016\034\006\002-\006!!.\031<b\023\tA6K\001\003ECR,\007\"\002.<\001\004\t\026\001C3oI~#\030.\\3\t\013q[\004\031A\f\002\027Q|G/\0317`G>,h\016\036\005\006=n\002\raF\001\016gV\024\b\017\\;t?\016|WO\034;\t\013\001\\\004\031A\f\002\027\035Lg\r^0ti\006$Xo\035\005\006En\002\raF\001\006E\006$8\r\033\005\006In\002\r\001Q\001\nO&4Go\0304pkJDQAZ\006\005\002\035\f\021#\0369eCR,w)\0334u!\006\0347.Y4f)\0359\002.\0336lY6DQAO3A\002]AQ\001S3A\002\001CQ\001U3A\002ECQAW3A\002ECQ\001X3A\002]AQAX3A\002]AQa\\\006\005\002A\fa\002Z3m\017&4G\017U1dW\006<W\r\006\002\030c\")!H\034a\001/!)1o\003C\001i\006YA-\0327HS\032$8i\0343f)\t9R\017C\003we\002\007q#A\004hS\032$x,\0333\t\013a\\A\021A=\002#\t\fGo\0315HK:,'/\031;f\007>$W\rF\004{{~\f\t!!\002\021\005aY\030B\001?\032\005\021)f.\033;\t\013y<\b\031\001!\002\023\035Lg\r^0oC6,\007\"\002<x\001\0049\002BBA\002o\002\007q#\001\006vg\026|f.^7cKJDa!a\002x\001\0049\022!B2pk:$\b\"CA\006\027\t\007IQBA\007\003!\031\025I\025#`'R\023VCAA\b\037\t\t\t\"\t\002\002\024\005I$g\r\0336m]B\024(\0312dI\0264w\r[5kW6t\007/\035:tiV4x\017_={\003\n\033E)\022$H\021&S5\nT'O!F\0236\013V+W/bK&\f\003\005\002\030-\001\013QBA\b\003%\031\025I\025#`'R\023\006\005C\004\002\034-!I!!\b\002\025\035,GOU1oIN#(\017F\002A\003?Aq!!\t\002\032\001\007q#\001\004mK:<G\017\033\005\b\003KYA\021AA\024\003Y)\b\017Z1uK\036Kg\r\036)bG.\fw-Z\"pk:$HcB\f\002*\005-\022Q\006\005\007m\006\r\002\031A\f\t\rq\013\031\0031\001\030\021\031q\0261\005a\001/!9\021\021G\006\005\002\005M\022!E;qI\006$XmR5gi:+XNY3sgR\031q#!\016\t\017\005]\022q\006a\001\001\006!1m\0343f\021\035\tYd\003C\001\003{\ta\"\0313e\017&4GoQ8om\026\024H\017F\005\030\003\t\031%!\022\002J!9\021\021IA\035\001\004\001\025!\0039mCf,'oX5e\021\0311\030\021\ba\001/!9\021qIA\035\001\0049\022!C:feZ,'oX5e\021\035\t9$!\017A\002\001Cq!!\024\f\t\003\ty%\001\rhKR<\025N\032;D_:4XM\035;CsBc\027-_3s\023\022$R\001IA)\003'Bq!!\021\002L\001\007\001\t\003\004w\003\027\002\ra\006\005\b\003/ZA\021AA-\00399W\r^$jMR\034uN\034<feR$R\001LA.\003;Bq!!\021\002V\001\007\001\tC\004\002`\005U\003\031\001!\002\023\035Lg\r^0d_\022,\007bBA2\027\021\005\021QM\001\027O\026$x)\0334u\007>tg/\032:u\005f\034u\016Z3JIR)\001%a\032\002j!9\021qGA1\001\004\001\005B\002<\002b\001\007q\003C\004\002n-!\t!a\034\002\027\035,GoR5gi\016{G-\032\013\004Y\005E\004bBA\034\003W\002\r\001\021\005\b\003kZA\021AA<\003M!W\r\\$jMR\034u\016Z3Cs\036Kg\r^%e)\r9\022\021\020\005\007m\006M\004\031A\f\t\017\005u4\002\"\001\002\000\005\031r-\032;HS\032$8i\0343f\005f<\025N\032;JIR\031\001%!!\t\rY\fY\b1\001\030\021\035\t)i\003C\001\003\017\0131dZ3u\017&4GoQ8om\026\024HOQ=HS\032$\030\nZ\"pk:$HcA\f\002\n\"1a/a!A\002]\001")
public final class GiftPackageService {
  public static int getGiftConvertByGiftIdCount(int paramInt) {
    return GiftPackageService$.MODULE$.getGiftConvertByGiftIdCount(paramInt);
  }
  
  public static List<MapBean> getGiftCodeByGiftId(int paramInt) {
    return GiftPackageService$.MODULE$.getGiftCodeByGiftId(paramInt);
  }
  
  public static int delGiftCodeByGiftId(int paramInt) {
    return GiftPackageService$.MODULE$.delGiftCodeByGiftId(paramInt);
  }
  
  public static MapBean getGiftCode(String paramString) {
    return GiftPackageService$.MODULE$.getGiftCode(paramString);
  }
  
  public static List<MapBean> getGiftConvertByCodeId(String paramString, int paramInt) {
    return GiftPackageService$.MODULE$.getGiftConvertByCodeId(paramString, paramInt);
  }
  
  public static MapBean getGiftConvert(String paramString1, String paramString2) {
    return GiftPackageService$.MODULE$.getGiftConvert(paramString1, paramString2);
  }
  
  public static List<MapBean> getGiftConvertByPlayerId(String paramString, int paramInt) {
    return GiftPackageService$.MODULE$.getGiftConvertByPlayerId(paramString, paramInt);
  }
  
  public static int addGiftConvert(String paramString1, int paramInt1, int paramInt2, String paramString2) {
    return GiftPackageService$.MODULE$.addGiftConvert(paramString1, paramInt1, paramInt2, paramString2);
  }
  
  public static int updateGiftNumbers(String paramString) {
    return GiftPackageService$.MODULE$.updateGiftNumbers(paramString);
  }
  
  public static int updateGiftPackageCount(int paramInt1, int paramInt2, int paramInt3) {
    return GiftPackageService$.MODULE$.updateGiftPackageCount(paramInt1, paramInt2, paramInt3);
  }
  
  public static void batchGenerateCode(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    GiftPackageService$.MODULE$.batchGenerateCode(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public static int delGiftCode(int paramInt) {
    return GiftPackageService$.MODULE$.delGiftCode(paramInt);
  }
  
  public static int delGiftPackage(int paramInt) {
    return GiftPackageService$.MODULE$.delGiftPackage(paramInt);
  }
  
  public static int updateGiftPackage(int paramInt1, String paramString, Date paramDate1, Date paramDate2, int paramInt2, int paramInt3) {
    return GiftPackageService$.MODULE$.updateGiftPackage(paramInt1, paramString, paramDate1, paramDate2, paramInt2, paramInt3);
  }
  
  public static MapBean addGiftPackage(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, Date paramDate1, Date paramDate2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, String paramString4) {
    return GiftPackageService$.MODULE$.addGiftPackage(paramString1, paramString2, paramInt1, paramInt2, paramString3, paramDate1, paramDate2, paramInt3, paramInt4, paramInt5, paramInt6, paramString4);
  }
  
  public static MapBean getGiftPackage(int paramInt) {
    return GiftPackageService$.MODULE$.getGiftPackage(paramInt);
  }
  
  public static List<MapBean> getGiftPackageList(int paramInt1, int paramInt2) {
    return GiftPackageService$.MODULE$.getGiftPackageList(paramInt1, paramInt2);
  }
  
  public static int getGiftPackageCount() {
    return GiftPackageService$.MODULE$.getGiftPackageCount();
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    GiftPackageService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    GiftPackageService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return GiftPackageService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    GiftPackageService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    GiftPackageService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return GiftPackageService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    GiftPackageService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    GiftPackageService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return GiftPackageService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    GiftPackageService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    GiftPackageService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return GiftPackageService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    GiftPackageService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    GiftPackageService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return GiftPackageService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return GiftPackageService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return GiftPackageService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\GiftPackageService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */