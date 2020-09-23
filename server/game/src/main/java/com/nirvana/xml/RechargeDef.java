/*     */ package com.nirvana.xml;
/*     */ 
/*     */ import com.nirvana.bean.GiveItem;
/*     */ import com.nirvana.bean.GiveItem$;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.immutable.List;
/*     */ import scala.collection.immutable.List$;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.ObjectRef;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005eb\001B\001\003\001%\0211BU3dQ\006\024x-\032#fM*\0211\001B\001\004q6d'BA\003\007\003\035q\027N\035<b]\006T\021aB\001\004G>l7\001A\n\003\001)\001\"a\003\b\016\0031Q\021!D\001\006g\016\fG.Y\005\003\0371\021a!\0218z%\0264\007\"B\t\001\t\003\021\022A\002\037j]&$h\bF\001\024!\t!\002!D\001\003\021%1\002\0011AA\002\023\005q#\001\002jIV\t\001\004\005\002\f3%\021!\004\004\002\004\023:$\b\"\003\017\001\001\004\005\r\021\"\001\036\003\031IGm\030\023fcR\021a$\t\t\003\027}I!\001\t\007\003\tUs\027\016\036\005\bEm\t\t\0211\001\031\003\rAH%\r\005\007I\001\001\013\025\002\r\002\007%$\007\005C\005'\001\001\007\t\031!C\001/\005!A/\0379f\021%A\003\0011AA\002\023\005\021&\001\005usB,w\fJ3r)\tq\"\006C\004#O\005\005\t\031\001\r\t\r1\002\001\025)\003\031\003\025!\030\020]3!\021%q\003\0011AA\002\023\005q&\001\007qe>$Wo\031;`]\006lW-F\0011!\t\tDG\004\002\fe%\0211\007D\001\007!J,G-\0324\n\005U2$AB*ue&twM\003\0024\031!I\001\b\001a\001\002\004%\t!O\001\021aJ|G-^2u?:\fW.Z0%KF$\"A\b\036\t\017\t:\024\021!a\001a!1A\b\001Q!\nA\nQ\002\035:pIV\034Go\0308b[\026\004\003\"\003 \001\001\004\005\r\021\"\001\030\003\r\021XN\031\005\n\001\002\001\r\0211A\005\002\005\013qA]7c?\022*\027\017\006\002\037\005\"9!ePA\001\002\004A\002B\002#\001A\003&\001$\001\003s[\n\004\003\"\003$\001\001\004\005\r\021\"\001\030\003\0219w\016\0343\t\023!\003\001\031!a\001\n\003I\025\001C4pY\022|F%Z9\025\005yQ\005b\002\022H\003\003\005\r\001\007\005\007\031\002\001\013\025\002\r\002\013\035|G\016\032\021\t\0239\003\001\031!a\001\n\0039\022!B2pk:$\b\"\003)\001\001\004\005\r\021\"\001R\003%\031w.\0368u?\022*\027\017\006\002\037%\"9!eTA\001\002\004A\002B\002+\001A\003&\001$\001\004d_VtG\017\t\005\n-\002\001\r\0211A\005\002]\t\021BY5oI~;w\016\0343\t\023a\003\001\031!a\001\n\003I\026!\0042j]\022|vm\0347e?\022*\027\017\006\002\0375\"9!eVA\001\002\004A\002B\002/\001A\003&\001$\001\006cS:$wlZ8mI\002B\021B\030\001A\002\003\007I\021A\030\002\021\035|G\016Z0eKND\021\002\031\001A\002\003\007I\021A1\002\031\035|G\016Z0eKN|F%Z9\025\005y\021\007b\002\022`\003\003\005\r\001\r\005\007I\002\001\013\025\002\031\002\023\035|G\016Z0eKN\004\003\"\0034\001\001\004\005\r\021\"\001\030\003)1\027N]:u?\036|G\016\032\005\nQ\002\001\r\0211A\005\002%\faBZ5sgR|vm\0347e?\022*\027\017\006\002\037U\"9!eZA\001\002\004A\002B\0027\001A\003&\001$A\006gSJ\034HoX4pY\022\004\003\"\0038\001\001\004\005\r\021\"\001\030\003%1\030\016]0mKZ,G\016C\005q\001\001\007\t\031!C\001c\006ia/\0339`Y\0264X\r\\0%KF$\"A\b:\t\017\tz\027\021!a\0011!1A\017\001Q!\na\t!B^5q?2,g/\0327!\021%1\b\0011AA\002\023\005q/A\004sK^\f'\017Z:\026\003a\004R!_A\002\003\023q!A_@\017\005mtX\"\001?\013\005uD\021A\002\037s_>$h(C\001\016\023\r\t\t\001D\001\ba\006\0347.Y4f\023\021\t)!a\002\003\t1K7\017\036\006\004\003\003a\001#B\006\002\faA\022bAA\007\031\t1A+\0369mKJB1\"!\005\001\001\004\005\r\021\"\001\002\024\005Y!/Z<be\022\034x\fJ3r)\rq\022Q\003\005\tE\005=\021\021!a\001q\"9\021\021\004\001!B\023A\030\001\003:fo\006\024Hm\035\021\t\017\005u\001\001\"\001\002 \005Qq-\032;SK^\f'\017Z:\025\t\005\005\022q\006\t\006s\006\r\0211\005\t\005\003K\tY#\004\002\002()\031\021\021\006\003\002\t\t,\027M\\\005\005\003[\t9C\001\005HSZ,\027\n^3n\021!\t\t$a\007A\002\005M\022!D5t?\032L'o\035;`O>dG\rE\002\f\003kI1!a\016\r\005\035\021un\0347fC:\004")
/*     */ public class RechargeDef
/*     */ {
/*     */   private int id;
/*     */   private int type;
/*     */   private String product_name;
/*     */   private int rmb;
/*     */   private int gold;
/*     */   private int count;
/*     */   private int bind_gold;
/*     */   private String gold_des;
/*     */   private int first_gold;
/*     */   private int vip_level;
/*     */   private List<Tuple2<Object, Object>> rewards;
/*     */   
/*     */   public int id() {
/* 196 */     return this.id; } public void id_$eq(int x$1) { this.id = x$1; }
/* 197 */   public int type() { return this.type; } public void type_$eq(int x$1) { this.type = x$1; }
/* 198 */   public String product_name() { return this.product_name; } public void product_name_$eq(String x$1) { this.product_name = x$1; }
/* 199 */   public int rmb() { return this.rmb; } public void rmb_$eq(int x$1) { this.rmb = x$1; }
/* 200 */   public int gold() { return this.gold; } public void gold_$eq(int x$1) { this.gold = x$1; }
/* 201 */   public int count() { return this.count; } public void count_$eq(int x$1) { this.count = x$1; }
/* 202 */   public int bind_gold() { return this.bind_gold; } public void bind_gold_$eq(int x$1) { this.bind_gold = x$1; }
/* 203 */   public String gold_des() { return this.gold_des; } public void gold_des_$eq(String x$1) { this.gold_des = x$1; }
/* 204 */   public int first_gold() { return this.first_gold; } public void first_gold_$eq(int x$1) { this.first_gold = x$1; }
/* 205 */   public int vip_level() { return this.vip_level; } public void vip_level_$eq(int x$1) { this.vip_level = x$1; }
/* 206 */   public List<Tuple2<Object, Object>> rewards() { return this.rewards; } public void rewards_$eq(List<Tuple2<Object, Object>> x$1) { this.rewards = x$1; }
/*     */ 
/*     */   
/*     */   public List<GiveItem> getRewards(boolean is_first_gold) {
/* 210 */     ObjectRef list = ObjectRef.create(List$.MODULE$.empty());
/* 211 */     int giveGold = gold();
/* 212 */     int giveBindGold = 0;
/* 213 */     if (is_first_gold)
/* 214 */     { giveBindGold += first_gold(); }
/*     */     
/* 216 */     else if (type() != 1) { giveBindGold += bind_gold(); }
/*     */     
/* 218 */     if (giveGold > 0) list.elem = ((List)list.elem).$colon$colon(new GiveItem(2, giveGold, GiveItem$.MODULE$.$lessinit$greater$default$3())); 
/* 219 */     if (giveBindGold > 0) list.elem = ((List)list.elem).$colon$colon(new GiveItem(3, giveBindGold, GiveItem$.MODULE$.$lessinit$greater$default$3())); 
/* 220 */     rewards().foreach((Function1)new RechargeDef$$anonfun$getRewards$1(this, list));
/*     */ 
/*     */     
/* 223 */     return (List<GiveItem>)list.elem;
/*     */   }
/*     */   
/*     */   public final class RechargeDef$$anonfun$getRewards$1 extends AbstractFunction1<Tuple2<Object, Object>, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final ObjectRef list$1;
/*     */     
/*     */     public RechargeDef$$anonfun$getRewards$1(RechargeDef $outer, ObjectRef list$1) {}
/*     */     
/*     */     public final void apply(Tuple2 p) {
/*     */       this.list$1.elem = ((List)this.list$1.elem).$colon$colon(new GiveItem(p._1$mcI$sp(), p._2$mcI$sp(), GiveItem$.MODULE$.$lessinit$greater$default$3()));
/*     */     }
/*     */   }
/*     */ }


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\xml\RechargeDef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */