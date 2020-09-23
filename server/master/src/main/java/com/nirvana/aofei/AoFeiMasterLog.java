package com.nirvana.aofei;

import java.util.concurrent.ExecutorService;
import scala.Enumeration;
import scala.collection.mutable.Map;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001e<Q!\001\002\t\002%\ta\"Q8GK&l\025m\035;fe2{wM\003\002\004\t\005)\021m\0344fS*\021QAB\001\b]&\024h/\0318b\025\0059\021aA2p[\016\001\001C\001\006\f\033\005\021a!\002\007\003\021\003i!AD!p\r\026LW*Y:uKJdunZ\n\003\0279\001\"AC\b\n\005A\021!AD!p\r\026LGj\\4UQJ,\027\r\032\005\006%-!\taE\001\007y%t\027\016\036 \025\003%AQ!F\006\005BY\tA!\0338jiV\tq\003\005\002\03175\t\021DC\001\033\003\025\0318-\0317b\023\ta\022D\001\003V]&$\b\"\002\020\f\t\003y\022!\0047pO\006\033G/\033<bi&|g\016F\007\030A%ZSfL\0314k]J4\b\021\005\006Cu\001\rAI\001\003SB\004\"a\t\024\017\005a!\023BA\023\032\003\031\001&/\0323fM&\021q\005\013\002\007'R\024\030N\\4\013\005\025J\002\"\002\026\036\001\004\021\023\001\0043fm&\034WmX7pI\026d\007\"\002\027\036\001\004\021\023aB8t?:\fW.\032\005\006]u\001\rAI\001\007_N|f/\032:\t\013Aj\002\031\001\022\002\0215\f7mX1eIJDQAM\017A\002\t\nA!\0363jI\")A'\ba\001E\005Y\021\r\0359`G\"\fgN\\3m\021\0251T\0041\001#\003\035\t\007\017]0wKJDQ\001O\017A\002\t\nqA\\3uo>\0248\016C\003;;\001\007!%\001\007qY\006$hm\034:n?R\fw\rC\003=;\001\007Q(\001\005he>,\boX5e!\tAb(\003\002@3\t\031\021J\034;\t\013\005k\002\031A\037\002\025\rD\027M\0348fY~KG\rC\003D\027\021\005A)A\005m_\036,\006\017Z1uKR\tr#\022$H\021&S5\nT'O\037B\0136+V,\t\013\005\022\005\031\001\022\t\013)\022\005\031\001\022\t\0131\022\005\031\001\022\t\0139\022\005\031\001\022\t\013A\022\005\031\001\022\t\013I\022\005\031\001\022\t\013Q\022\005\031\001\022\t\013Y\022\005\031\001\022\t\013a\022\005\031\001\022\t\013i\022\005\031\001\022\t\013q\022\005\031A\037\t\013\005\023\005\031A\037\t\013I\023\005\031A\037\002#I,\027m\0315`kB$\027\r^3`i&lW\rC\003U\005\002\007Q(A\007va\022\fG/Z0ti\006$Xo\035\005\006-\n\003\r!P\001\fkB$\027\r^3`i&lW\rC\003Y\005\002\007Q(\001\005vg\026|F/[7f\021\025Q6\002\"\001\\\003\035awn\032'pC\022$Rb\006/^=~\003\027MY2eK\032<\007\"B\021Z\001\004\021\003\"\002\026Z\001\004\021\003\"\002\027Z\001\004\021\003\"\002\030Z\001\004\021\003\"\002\031Z\001\004\021\003\"\002\032Z\001\004\021\003\"\002\033Z\001\004\021\003\"\002\034Z\001\004\021\003\"\002\035Z\001\004\021\003\"\002\036Z\001\004\021\003\"\002\037Z\001\004i\004\"B!Z\001\004i\004\"B5\f\t\003Q\027!\0057pO&#WM\034;jM&\034\027\r^5p]Rqqc\0337n]>\004\030O]:ukZ<\b\"B\021i\001\004\021\003\"\002\026i\001\004\021\003\"\002\027i\001\004\021\003\"\002\030i\001\004\021\003\"\002\031i\001\004\021\003\"\002\032i\001\004\021\003\"\002\033i\001\004\021\003\"\002\034i\001\004\021\003\"\002\035i\001\004\021\003\"\002\036i\001\004\021\003\"\002\037i\001\004i\004\"B!i\001\004i\004\"\002=i\001\004\021\023AC1dG>,h\016^0jI\002")
public final class AoFeiMasterLog {
  public static void logIdentification(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, int paramInt1, int paramInt2, String paramString11) {
    AoFeiMasterLog$.MODULE$.logIdentification(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramString9, paramString10, paramInt1, paramInt2, paramString11);
  }
  
  public static void logLoad(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, int paramInt1, int paramInt2) {
    AoFeiMasterLog$.MODULE$.logLoad(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramString9, paramString10, paramInt1, paramInt2);
  }
  
  public static void logUpdate(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    AoFeiMasterLog$.MODULE$.logUpdate(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramString9, paramString10, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
  }
  
  public static void logActivation(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, int paramInt1, int paramInt2) {
    AoFeiMasterLog$.MODULE$.logActivation(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramString9, paramString10, paramInt1, paramInt2);
  }
  
  public static void init() {
    AoFeiMasterLog$.MODULE$.init();
  }
  
  public static String getStat() {
    return AoFeiMasterLog$.MODULE$.getStat();
  }
  
  public static void disconnect() {
    AoFeiMasterLog$.MODULE$.disconnect();
  }
  
  public static long getTimestamp() {
    return AoFeiMasterLog$.MODULE$.getTimestamp();
  }
  
  public static void run() {
    AoFeiMasterLog$.MODULE$.run();
  }
  
  public static void register(Enumeration.Value paramValue) {
    AoFeiMasterLog$.MODULE$.register(paramValue);
  }
  
  public static ExecutorService executor() {
    return AoFeiMasterLog$.MODULE$.executor();
  }
  
  public static Map<Enumeration.Value, AoFeiLog> logs() {
    return AoFeiMasterLog$.MODULE$.logs();
  }
  
  public static int TIME_SPACE() {
    return AoFeiMasterLog$.MODULE$.TIME_SPACE();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\aofei\AoFeiMasterLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */