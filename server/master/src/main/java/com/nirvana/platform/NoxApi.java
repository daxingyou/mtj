package com.nirvana.platform;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import scala.Function0;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005-s!B\001\003\021\003I\021A\002(pq\006\003\030N\003\002\004\t\005A\001\017\\1uM>\024XN\003\002\006\r\0059a.\033:wC:\f'\"A\004\002\007\r|Wn\001\001\021\005)YQ\"\001\002\007\0131\021\001\022A\007\003\r9{\0070\0219j'\rYa\002\006\t\003\037Ii\021\001\005\006\002#\005)1oY1mC&\0211\003\005\002\007\003:L(+\0324\021\005UQR\"\001\f\013\005]A\022!B:mMRR'\"A\r\002\021\035\024\030N\037>mK\022L!a\007\f\003\0171{wmZ5oO\")Qd\003C\001=\0051A(\0338jiz\"\022!\003\005\006A-!\t!I\001\nG\",7m[+tKJ$bA\t\0252maR\004CA\022'\033\005!#BA\023\005\003\021\031wN]3\n\005\035\"#aB'ba\n+\027M\034\005\006S}\001\rAK\001\ng\026\0348/[8o\023\022\004\"a\013\030\017\005=a\023BA\027\021\003\031\001&/\0323fM&\021q\006\r\002\007'R\024\030N\\4\013\0055\002\002\"\002\032 \001\004\031\024!C2iC:tW\r\\%E!\tyA'\003\0026!\t\031\021J\034;\t\013]z\002\031\001\026\002\tU$\027\016\032\005\006s}\001\rAK\001\t[\006\034w,\0313ee\")1h\ba\001U\005\021\021\016\035\005\006{-!\tAP\001\tG\",7m\033)bsR9qH\021#G\021*c\005CA\bA\023\t\t\005CA\004C_>dW-\0318\t\013\rc\004\031A\032\002\023\rD\027M\0348fY&#\007\"B#=\001\004Q\023\001\0039mCf,'/\0233\t\013\035c\004\031A\032\002\021M,'O^3s\023\022DQ!\023\037A\002)\nqa\034:eKJLE\rC\003Ly\001\0071'A\005qe>$Wo\031;JI\")Q\n\020a\001U\005)Ao\\6f]\")qj\003C\001!\006A\021/^3ssB\013\027\020\006\005@#N+v+W.^\021\025\021f\n1\0014\003%\031Ho\034:fif\004X\rC\003U\035\002\007!&\001\004vg\026\024\030\n\032\005\006-:\003\rAK\001\fa\006\0347.Y4f]\006lW\rC\003Y\035\002\007!&A\006pe\022,'O\\;nE\026\024\b\"\002.O\001\004Q\023!\0039s_\022,8\r^5e\021\025af\n1\001+\0035\001XO]2iCN,Go\\6f]\"9aL\024I\001\002\004y\024\001\003;fgR\034w\016Z3\t\013\001\\A\021A1\002\tM,g\016\032\013\004E\026|\007CA\bd\023\t!\007C\001\003V]&$\b\"\0024`\001\0049\027AB8viB,H\017\005\002i[6\t\021N\003\002kW\006\021\021n\034\006\002Y\006!!.\031<b\023\tq\027N\001\tECR\fw*\036;qkR\034FO]3b[\")\001o\030a\001c\006\031\021.\0319\021\005)\021\030BA:\003\005%\001\026mY6fi&\013\007\017C\003v\027\021\005a/A\004sK\016,\027N^3\025\005]T\bC\001\006y\023\tI(A\001\007QC\016\\W\r\036*fgVdG\017C\003|i\002\007A0A\003j]B,H\017\005\002i{&\021a0\033\002\020\t\006$\030-\0238qkR\034FO]3b[\"9\021\021A\006\005\002\005\r\021!\0049mCf\034Fo\034:f)\026\034H\017F\001c\021\035\t9a\003C\001\003\023\t\001bR3u\005f$Xm\035\013\005\003\027\t9\002E\003\020\003\033\t\t\"C\002\002\020A\021Q!\021:sCf\0042aDA\n\023\r\t)\002\005\002\005\005f$X\rC\004\002\032\005\025\001\031A\032\002\013Y\fG.^3\t\017\005u1\002\"\001\002 \005yq-\032;V]NLwM\\3e\005f$X\r\006\003\002\022\005\005\002\002CA\022\0037\001\r!!\005\002\t\tLH/\032\005\b\003OYA\021AA\025\003\021i\027-\0338\025\007\t\fY\003\003\005\002.\005\025\002\031AA\030\003\021\t'oZ:\021\t=\tiA\013\005\n\003gY\021\023!C\001\003k\t!#];fef\004\026-\037\023eK\032\fW\017\034;%oU\021\021q\007\026\004\005e2FAA\036!\021\ti$a\022\016\005\005}\"\002BA!\003\007\n\021\"\0368dQ\026\0347.\0323\013\007\005\025\003#\001\006b]:|G/\031;j_:LA!!\023\002@\t\tRO\\2iK\016\\W\r\032,be&\fgnY3")
public final class NoxApi {
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    NoxApi$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    NoxApi$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return NoxApi$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    NoxApi$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    NoxApi$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return NoxApi$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    NoxApi$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    NoxApi$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return NoxApi$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    NoxApi$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    NoxApi$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return NoxApi$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    NoxApi$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    NoxApi$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return NoxApi$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return NoxApi$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return NoxApi$.MODULE$.logger();
  }
  
  public static boolean queryPay$default$7() {
    return NoxApi$.MODULE$.queryPay$default$7();
  }
  
  public static void main(String[] paramArrayOfString) {
    NoxApi$.MODULE$.main(paramArrayOfString);
  }
  
  public static byte getUnsignedByte(byte paramByte) {
    return NoxApi$.MODULE$.getUnsignedByte(paramByte);
  }
  
  public static byte[] GetBytes(int paramInt) {
    return NoxApi$.MODULE$.GetBytes(paramInt);
  }
  
  public static void playStoreTest() {
    NoxApi$.MODULE$.playStoreTest();
  }
  
  public static PacketResult receive(DataInputStream paramDataInputStream) {
    return NoxApi$.MODULE$.receive(paramDataInputStream);
  }
  
  public static void send(DataOutputStream paramDataOutputStream, PacketIap paramPacketIap) {
    NoxApi$.MODULE$.send(paramDataOutputStream, paramPacketIap);
  }
  
  public static boolean queryPay(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean) {
    return NoxApi$.MODULE$.queryPay(paramInt, paramString1, paramString2, paramString3, paramString4, paramString5, paramBoolean);
  }
  
  public static boolean checkPay(int paramInt1, String paramString1, int paramInt2, String paramString2, int paramInt3, String paramString3) {
    return NoxApi$.MODULE$.checkPay(paramInt1, paramString1, paramInt2, paramString2, paramInt3, paramString3);
  }
  
  public static MapBean checkUser(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4) {
    return NoxApi$.MODULE$.checkUser(paramString1, paramInt, paramString2, paramString3, paramString4);
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\platform\NoxApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */