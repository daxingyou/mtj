/*     */ package com.nirvana.net;
/*     */ 
/*     */ import com.nirvana.core.MapBean;
/*     */ import com.nirvana.exception.BusinessException;
/*     */ import grizzled.slf4j.Logger;
/*     */ import io.netty.buffer.ByteBuf;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import scala.Function0;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005Mv!B\001\003\021\003I\021aB'fgN\fw-\032\006\003\007\021\t1A\\3u\025\t)a!A\004oSJ4\030M\\1\013\003\035\t1aY8n\007\001\001\"AC\006\016\003\t1Q\001\004\002\t\0025\021q!T3tg\006<WmE\002\f\035Q\001\"a\004\n\016\003AQ\021!E\001\006g\016\fG.Y\005\003'A\021a!\0218z%\0264\007CA\013\033\033\0051\"BA\f\031\003\025\031HN\032\033k\025\005I\022\001C4sSjTH.\0323\n\005m1\"a\002'pO\036Lgn\032\005\006;-!\tAH\001\007y%t\027\016\036 \025\003%Aq\001I\006C\002\023\025\021%\001\006N\003b{F*\022(H)\"+\022AI\b\002Gu\031\021\001%\001\t\r\025Z\001\025!\004#\003-i\025\tW0M\013:;E\013\023\021\t\017\035Z!\031!C\003Q\005Y1iT'N\003:#u,T!Y+\005I\003CA\b+\023\tY\003CA\002J]RDa!L\006!\002\033I\023\001D\"P\0336\013e\nR0N\003b\003\003bB\030\f\005\004%)\001M\001\006\0136\003F+W\013\002cA\021!'N\007\002g)\021A\007B\001\005G>\024X-\003\0027g\t9Q*\0319CK\006t\007B\002\035\fA\0035\021'\001\004F\033B#\026\f\t\005\006u-!\taO\001\006CB\004H.\037\013\006y\005u\022\021\t\t\003\025u2A\001\004\002\001}M\021QH\004\005\t\001v\022)\031!C\001Q\005AqlY8n[\006tG\r\003\005C{\t\005\t\025!\003*\003%y6m\\7nC:$\007\005\003\005E{\t\005\r\021\"\001)\003\031y6\017^1na\"Aa)\020BA\002\023\005q)\001\006`gR\fW\016]0%KF$\"\001S&\021\005=I\025B\001&\021\005\021)f.\033;\t\0171+\025\021!a\001S\005\031\001\020J\031\t\0219k$\021!Q!\n%\nqaX:uC6\004\b\005\003\005Q{\t\005\r\021\"\0031\003\025y&m\0343z\021!\021VH!a\001\n\023\031\026!C0c_\022Lx\fJ3r)\tAE\013C\004M#\006\005\t\031A\031\t\021Yk$\021!Q!\nE\naa\0302pIf\004\003\"B\017>\t\003AF\003\002\037Z5nCQ\001Q,A\002%BQ\001R,A\002%BQ\001U,A\002EBQ!X\037\005\002!\n!bZ3u\007>lW.\0318e\021\025yV\b\"\001)\003!9W\r^*uC6\004\b\"B1>\t\003\001\024aB4fi\n{G-\037\005\006Gv\"\t\001Z\001\te\026\034\bo\0348tKR\021A(\032\005\bM\n\004\n\0211\0012\003\021\021w\016Z=\t\013\rlD\021\0015\025\005qJ\007\"\0026h\001\004Y\027!C3yG\026\004H/[8o!\tag.D\001n\025\tQG!\003\002p[\n\t\")^:j]\026\0348/\022=dKB$\030n\0348\t\013ElD\021\001:\002\017Q|gI]1nKV\t1\017\005\002uw6\tQO\003\002wo\0061!-\0364gKJT!\001_=\002\0139,G\017^=\013\003i\f!![8\n\005q,(a\002\"zi\026\024UO\032\005\006}v\"\ta`\001\bi>\024\025\020^3t+\t\t\t\001E\003\020\003\007\t9!C\002\002\006A\021Q!\021:sCf\0042aDA\005\023\r\tY\001\005\002\005\005f$X\rC\004\002\020u\"\t%!\005\002\021Q|7\013\036:j]\036$\"!a\005\021\t\005U\021qD\007\003\003/QA!!\007\002\034\005!A.\0318h\025\t\ti\"\001\003kCZ\f\027\002BA\021\003/\021aa\025;sS:<\007\"CA\023{E\005I\021AA\024\003I\021Xm\0359p]N,G\005Z3gCVdG\017J\031\026\005\005%\"fA\031\002,-\022\021Q\006\t\005\003_\tI$\004\002\0022)!\0211GA\033\003%)hn\0315fG.,GMC\002\0028A\t!\"\0318o_R\fG/[8o\023\021\tY$!\r\003#Ut7\r[3dW\026$g+\031:jC:\034W\r\003\004\002@e\002\r!K\001\bG>lW.\0318e\021\0351\027\b%AA\002EBq!!\022\f\t\003\t9%A\005ge>lgI]1nKR\031A(!\023\t\017\005-\0231\ta\001g\006)aM]1nK\"9\021qJ\006\005\002\005E\023aB3oGJL\b\017\036\013\t\003\003\t\031&!\026\002Z!9\021qHA'\001\004I\003bBA,\003\033\002\r!K\001\006gR\fW\016\035\005\t\0037\ni\0051\001\002\002\005)!-\037;fg\"9\021qL\006\005\002\005\005\024A\0023fG>$W\rF\0042\003G\n)'a\032\t\017\005}\022Q\fa\001S!9\021qKA/\001\004I\003b\0024\002^\001\007\021\021\001\005\b\003WZA\021AA7\003\031)gnY8eKRA\021\021AA8\003c\n\031\bC\004\002@\005%\004\031A\025\t\017\005]\023\021\016a\001S!1a-!\033A\002EBq!a\036\f\t\003\tI(A\004eK\016|G-Z\031\025\017E\nY(! \002\000!9\021qHA;\001\004I\003bBA,\003k\002\r!\013\005\bM\006U\004\031AA\001Q\021\t)(a!\021\t\005U\021QQ\005\005\003\017\0139B\001\006EKB\024XmY1uK\022Dq!a#\f\t\003\ti)A\004f]\016|G-Z\031\025\021\005\005\021qRAI\003'Cq!a\020\002\n\002\007\021\006C\004\002X\005%\005\031A\025\t\r\031\fI\t1\0012Q\021\tI)a!\t\017\005e5\002\"\001\002\034\006!Q.Y5o)\rA\025Q\024\005\t\003?\0139\n1\001\002\"\006!\021M]4t!\025y\0211AAR!\021\t)+a+\017\007=\t9+C\002\002*B\ta\001\025:fI\0264\027\002BA\021\003[S1!!+\021\021%\t\tlCI\001\n\003\t9#A\bbaBd\027\020\n3fM\006,H\016\036\0233\001")
/*     */ public class Message
/*     */ {
/*     */   private final int _command;
/*     */   private int _stamp;
/*     */   private MapBean _body;
/*     */   
/*     */   public int _command() {
/* 113 */     return this._command; } public int _stamp() { return this._stamp; } public void _stamp_$eq(int x$1) { this._stamp = x$1; } private MapBean _body() { return this._body; } private void _body_$eq(MapBean x$1) { this._body = x$1; }
/*     */    public Message(int _command, int _stamp, MapBean _body) {} public int getCommand() {
/* 115 */     return _command();
/*     */   } public int getStamp() {
/* 117 */     return _stamp();
/*     */   } public MapBean getBody() {
/* 119 */     return _body();
/*     */   }
/*     */ 
/*     */   
/*     */   public MapBean response$default$1() {
/* 124 */     return Message$.MODULE$.EMPTY(); } public Message response(MapBean body) {
/* 125 */     _body_$eq(body);
/* 126 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Message response(BusinessException exception) {
/* 133 */     _body_$eq(exception.getErrMapBean());
/* 134 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ByteBuf toFrame() {
/* 149 */     byte[] bodyBytes = Message$.MODULE$.encode(_command(), _stamp(), _body());
/* 150 */     int size = bodyBytes.length + 8;
/* 151 */     ByteBuf buffer = Unpooled.directBuffer(size);
/* 152 */     buffer.writeInt(_command());
/* 153 */     buffer.writeInt(_stamp());
/* 154 */     buffer.writeBytes(bodyBytes);
/* 155 */     return buffer;
/*     */   }
/*     */   
/*     */   public byte[] toBytes() {
/* 159 */     byte[] bodyBytes = Message$.MODULE$.encode(_command(), _stamp(), _body());
/* 160 */     int size = bodyBytes.length + 8;
/* 161 */     ByteBuf buffer = Unpooled.directBuffer(size);
/* 162 */     buffer.writeInt(_command());
/* 163 */     buffer.writeInt(_stamp());
/* 164 */     buffer.writeBytes(bodyBytes);
/* 165 */     byte[] bytes = new byte[size];
/* 166 */     buffer.readBytes(bytes);
/* 167 */     buffer.release();
/* 168 */     return bytes;
/*     */   }
/*     */   public String toString() {
/* 171 */     return (new StringBuilder()).append("Message:[0x").append(Integer.toHexString(_command())).append(",").append(BoxesRunTime.boxToInteger(_stamp()).toString()).append(",").append(getBody()).append("]").toString();
/*     */   }
/*     */   
/*     */   public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
/*     */     Message$.MODULE$.warn(paramFunction0, paramFunction01);
/*     */   }
/*     */   
/*     */   public static void warn(Function0<Object> paramFunction0) {
/*     */     Message$.MODULE$.warn(paramFunction0);
/*     */   }
/*     */   
/*     */   public static boolean isWarnEnabled() {
/*     */     return Message$.MODULE$.isWarnEnabled();
/*     */   }
/*     */   
/*     */   public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
/*     */     Message$.MODULE$.info(paramFunction0, paramFunction01);
/*     */   }
/*     */   
/*     */   public static void info(Function0<Object> paramFunction0) {
/*     */     Message$.MODULE$.info(paramFunction0);
/*     */   }
/*     */   
/*     */   public static boolean isInfoEnabled() {
/*     */     return Message$.MODULE$.isInfoEnabled();
/*     */   }
/*     */   
/*     */   public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
/*     */     Message$.MODULE$.error(paramFunction0, paramFunction01);
/*     */   }
/*     */   
/*     */   public static void error(Function0<Object> paramFunction0) {
/*     */     Message$.MODULE$.error(paramFunction0);
/*     */   }
/*     */   
/*     */   public static boolean isErrorEnabled() {
/*     */     return Message$.MODULE$.isErrorEnabled();
/*     */   }
/*     */   
/*     */   public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
/*     */     Message$.MODULE$.debug(paramFunction0, paramFunction01);
/*     */   }
/*     */   
/*     */   public static void debug(Function0<Object> paramFunction0) {
/*     */     Message$.MODULE$.debug(paramFunction0);
/*     */   }
/*     */   
/*     */   public static boolean isDebugEnabled() {
/*     */     return Message$.MODULE$.isDebugEnabled();
/*     */   }
/*     */   
/*     */   public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
/*     */     Message$.MODULE$.trace(paramFunction0, paramFunction01);
/*     */   }
/*     */   
/*     */   public static void trace(Function0<Object> paramFunction0) {
/*     */     Message$.MODULE$.trace(paramFunction0);
/*     */   }
/*     */   
/*     */   public static boolean isTraceEnabled() {
/*     */     return Message$.MODULE$.isTraceEnabled();
/*     */   }
/*     */   
/*     */   public static String loggerName() {
/*     */     return Message$.MODULE$.loggerName();
/*     */   }
/*     */   
/*     */   public static Logger logger() {
/*     */     return Message$.MODULE$.logger();
/*     */   }
/*     */   
/*     */   public static MapBean apply$default$2() {
/*     */     return Message$.MODULE$.apply$default$2();
/*     */   }
/*     */   
/*     */   public static void main(String[] paramArrayOfString) {
/*     */     Message$.MODULE$.main(paramArrayOfString);
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static byte[] encode1(int paramInt1, int paramInt2, MapBean paramMapBean) {
/*     */     return Message$.MODULE$.encode1(paramInt1, paramInt2, paramMapBean);
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static MapBean decode1(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {
/*     */     return Message$.MODULE$.decode1(paramInt1, paramInt2, paramArrayOfbyte);
/*     */   }
/*     */   
/*     */   public static byte[] encode(int paramInt1, int paramInt2, MapBean paramMapBean) {
/*     */     return Message$.MODULE$.encode(paramInt1, paramInt2, paramMapBean);
/*     */   }
/*     */   
/*     */   public static MapBean decode(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {
/*     */     return Message$.MODULE$.decode(paramInt1, paramInt2, paramArrayOfbyte);
/*     */   }
/*     */   
/*     */   public static byte[] encrypt(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {
/*     */     return Message$.MODULE$.encrypt(paramInt1, paramInt2, paramArrayOfbyte);
/*     */   }
/*     */   
/*     */   public static Message fromFrame(ByteBuf paramByteBuf) {
/*     */     return Message$.MODULE$.fromFrame(paramByteBuf);
/*     */   }
/*     */   
/*     */   public static Message apply(int paramInt, MapBean paramMapBean) {
/*     */     return Message$.MODULE$.apply(paramInt, paramMapBean);
/*     */   }
/*     */   
/*     */   public static MapBean EMPTY() {
/*     */     return Message$.MODULE$.EMPTY();
/*     */   }
/*     */   
/*     */   public static int COMMAND_MAX() {
/*     */     return Message$.MODULE$.COMMAND_MAX();
/*     */   }
/*     */   
/*     */   public static int MAX_LENGTH() {
/*     */     return Message$.MODULE$.MAX_LENGTH();
/*     */   }
/*     */ }


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\net\Message.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */