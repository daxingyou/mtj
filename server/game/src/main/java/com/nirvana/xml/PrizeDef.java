/*     */ package com.nirvana.xml;
/*     */ 
/*     */ import com.nirvana.bean.GiveItem;
/*     */ import scala.collection.GenTraversableOnce;
/*     */ import scala.collection.immutable.List;
/*     */ import scala.collection.immutable.List$;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.collection.mutable.Map$;
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
/*     */ @ScalaSignature(bytes = "\006\00194A!\001\002\001\023\tA\001K]5{K\022+gM\003\002\004\t\005\031\0010\0347\013\005\0251\021a\0028jeZ\fg.\031\006\002\017\005\0311m\\7\004\001M\021\001A\003\t\003\0279i\021\001\004\006\002\033\005)1oY1mC&\021q\002\004\002\007\003:L(+\0324\t\013E\001A\021\001\n\002\rqJg.\033;?)\005\031\002C\001\013\001\033\005\021\001\"\003\f\001\001\004\005\r\021\"\001\030\003\tIG-F\001\031!\tY\021$\003\002\033\031\t\031\021J\034;\t\023q\001\001\031!a\001\n\003i\022AB5e?\022*\027\017\006\002\037CA\0211bH\005\003A1\021A!\0268ji\"9!eGA\001\002\004A\022a\001=%c!1A\005\001Q!\na\t1!\0333!\021%1\003\0011AA\002\023\005q#\001\006zk:L\030N\\4`S\022D\021\002\013\001A\002\003\007I\021A\025\002\035e,h._5oO~KGm\030\023fcR\021aD\013\005\bE\035\n\t\0211\001\031\021\031a\003\001)Q\0051\005Y\0210\0368zS:<w,\0333!\021%q\003\0011AA\002\023\005q#\001\003d_N$\b\"\003\031\001\001\004\005\r\021\"\0012\003!\031wn\035;`I\025\fHC\001\0203\021\035\021s&!AA\002aAa\001\016\001!B\023A\022!B2pgR\004\003\"\003\034\001\001\004\005\r\021\"\001\030\0035\021Xm^1sIN|f/\0317vK\"I\001\b\001a\001\002\004%\t!O\001\022e\026<\030M\0353t?Z\fG.^3`I\025\fHC\001\020;\021\035\021s'!AA\002aAa\001\020\001!B\023A\022A\004:fo\006\024Hm]0wC2,X\r\t\005\n}\001\001\r\0211A\005\002}\nqA]3xCJ$7/F\001A!\r\t\025\n\024\b\003\005\036s!a\021$\016\003\021S!!\022\005\002\rq\022xn\034;?\023\005i\021B\001%\r\003\035\001\030mY6bO\026L!AS&\003\t1K7\017\036\006\003\0212\001\"!\024)\016\0039S!a\024\003\002\t\t,\027M\\\005\003#:\023\001bR5wK&#X-\034\005\n'\002\001\r\0211A\005\002Q\0131B]3xCJ$7o\030\023fcR\021a$\026\005\bEI\013\t\0211\001A\021\0319\006\001)Q\005\001\006A!/Z<be\022\034\b\005C\004Z\001\001\007I\021\001.\002\031\r\f'/Z3s\003^\f'\017Z:\026\003m\003B\001X1\031\0016\tQL\003\002_?\0069Q.\036;bE2,'B\0011\r\003)\031w\016\0347fGRLwN\\\005\003Ev\0231!T1q\021\035!\007\0011A\005\002\025\f\001cY1sK\026\024\030i^1sIN|F%Z9\025\005y1\007b\002\022d\003\003\005\ra\027\005\007Q\002\001\013\025B.\002\033\r\f'/Z3s\003^\f'\017Z:!\021\025Q\007\001\"\001l\003)9W\r\036*fo\006\024Hm\035\013\003\0012DQ!\\5A\002a\taaY1sK\026\024\b")
/*     */ public class PrizeDef
/*     */ {
/*     */   private int id;
/*     */   private int yunying_id;
/*     */   private int cost;
/*     */   private int rewards_value;
/*     */   private List<GiveItem> rewards;
/*     */   
/*     */   public int id() {
/* 259 */     return this.id; } public void id_$eq(int x$1) { this.id = x$1; }
/* 260 */   public int yunying_id() { return this.yunying_id; } public void yunying_id_$eq(int x$1) { this.yunying_id = x$1; }
/* 261 */   public int cost() { return this.cost; } public void cost_$eq(int x$1) { this.cost = x$1; }
/* 262 */   public int rewards_value() { return this.rewards_value; } public void rewards_value_$eq(int x$1) { this.rewards_value = x$1; }
/* 263 */   public List<GiveItem> rewards() { return this.rewards; } public void rewards_$eq(List<GiveItem> x$1) { this.rewards = x$1; }
/* 264 */    private Map<Object, List<GiveItem>> careerAwards = Map$.MODULE$.empty(); public Map<Object, List<GiveItem>> careerAwards() { return this.careerAwards; } public void careerAwards_$eq(Map<Object, List<GiveItem>> x$1) { this.careerAwards = x$1; }
/*     */   
/*     */   public List<GiveItem> getRewards(int career) {
/* 267 */     List<GiveItem> list = List$.MODULE$.empty();
/* 268 */     list = (List)list.$plus$plus((GenTraversableOnce)rewards(), List$.MODULE$.canBuildFrom());
/* 269 */     if (careerAwards().contains(BoxesRunTime.boxToInteger(career))) list = (List)list.$plus$plus((GenTraversableOnce)careerAwards().apply(BoxesRunTime.boxToInteger(career)), List$.MODULE$.canBuildFrom()); 
/* 270 */     return list;
/*     */   }
/*     */ }


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\xml\PrizeDef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */