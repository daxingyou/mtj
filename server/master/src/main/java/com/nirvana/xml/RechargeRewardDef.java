/*     */ package com.nirvana.xml;
/*     */ 
/*     */ import com.nirvana.bean.GiveItem;
/*     */ import java.util.Date;
/*     */ import scala.collection.immutable.List;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.collection.mutable.Map$;
/*     */ import scala.reflect.ScalaSignature;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005\025d\001B\001\003\001%\021\021CU3dQ\006\024x-\032*fo\006\024H\rR3g\025\t\031A!A\002y[2T!!\002\004\002\0179L'O^1oC*\tq!A\002d_6\034\001a\005\002\001\025A\0211BD\007\002\031)\tQ\"A\003tG\006d\027-\003\002\020\031\t1\021I\\=SK\032DQ!\005\001\005\002I\ta\001P5oSRtD#A\n\021\005Q\001Q\"\001\002\t\023Y\001\001\031!a\001\n\0039\022AA5e+\005A\002CA\006\032\023\tQBBA\002J]RD\021\002\b\001A\002\003\007I\021A\017\002\r%$w\fJ3r)\tq\022\005\005\002\f?%\021\001\005\004\002\005+:LG\017C\004#7\005\005\t\031\001\r\002\007a$\023\007\003\004%\001\001\006K\001G\001\004S\022\004\003\"\003\024\001\001\004\005\r\021\"\001\030\003\021!\030\020]3\t\023!\002\001\031!a\001\n\003I\023\001\003;za\026|F%Z9\025\005yQ\003b\002\022(\003\003\005\r\001\007\005\007Y\001\001\013\025\002\r\002\013QL\b/\032\021\t\0239\002\001\031!a\001\n\0039\022\001B6j]\022D\021\002\r\001A\002\003\007I\021A\031\002\021-Lg\016Z0%KF$\"A\b\032\t\017\tz\023\021!a\0011!1A\007\001Q!\na\tQa[5oI\002B\021B\016\001A\002\003\007I\021A\f\002\rA\f'/Y72\021%A\004\0011AA\002\023\005\021(\001\006qCJ\fW.M0%KF$\"A\b\036\t\017\t:\024\021!a\0011!1A\b\001Q!\na\tq\001]1sC6\f\004\005C\005?\001\001\007\t\031!C\001/\0051\001/\031:b[JB\021\002\021\001A\002\003\007I\021A!\002\025A\f'/Y73?\022*\027\017\006\002\037\005\"9!ePA\001\002\004A\002B\002#\001A\003&\001$A\004qCJ\fWN\r\021\t\023\031\003\001\031!a\001\n\0039\022a\004;pi\006d7m\\;oi2LW.\033;\t\023!\003\001\031!a\001\n\003I\025a\005;pi\006d7m\\;oi2LW.\033;`I\025\fHC\001\020K\021\035\021s)!AA\002aAa\001\024\001!B\023A\022\001\005;pi\006d7m\\;oi2LW.\033;!\021%q\005\0011AA\002\023\005q*A\004sK^\f'\017Z:\026\003A\0032!U-]\035\t\021vK\004\002T-6\tAK\003\002V\021\0051AH]8pizJ\021!D\005\00312\tq\001]1dW\006<W-\003\002[7\n!A*[:u\025\tAF\002\005\002^A6\taL\003\002`\t\005!!-Z1o\023\t\tgL\001\005HSZ,\027\n^3n\021%\031\007\0011AA\002\023\005A-A\006sK^\f'\017Z:`I\025\fHC\001\020f\021\035\021#-!AA\002ACaa\032\001!B\023\001\026\001\003:fo\006\024Hm\035\021\t\017%\004\001\031!C\001U\006q1-\031:fKJ\fu/\031:e\033\006\004X#A6\021\t1\f\b\004U\007\002[*\021an\\\001\b[V$\030M\0317f\025\t\001H\"\001\006d_2dWm\031;j_:L!A]7\003\0075\013\007\017C\004u\001\001\007I\021A;\002%\r\f'/Z3s\003^\f'\017Z'ba~#S-\035\013\003=YDqAI:\002\002\003\0071\016\003\004y\001\001\006Ka[\001\020G\006\024X-\032:Bo\006\024H-T1qA!I!\020\001a\001\002\004%\ta_\001\007e\026<\030M\0353\026\003q\0042!`A\001\035\tYa0\003\002\000\031\0051\001K]3eK\032LA!a\001\002\006\t11\013\036:j]\036T!a \007\t\027\005%\001\0011AA\002\023\005\0211B\001\013e\026<\030M\0353`I\025\fHc\001\020\002\016!A!%a\002\002\002\003\007A\020C\004\002\022\001\001\013\025\002?\002\017I,w/\031:eA!Q\021Q\003\001A\002\003\007I\021A>\002\035M$\030M\035;`i&lWmX:ue\"Y\021\021\004\001A\002\003\007I\021AA\016\003I\031H/\031:u?RLW.Z0tiJ|F%Z9\025\007y\ti\002\003\005#\003/\t\t\0211\001}\021\035\t\t\003\001Q!\nq\fqb\035;beR|F/[7f?N$(\017\t\005\f\003K\001\001\031!a\001\n\003\t9#\001\006ti\006\024Ho\030;j[\026,\"!!\013\021\t\005-\022QG\007\003\003[QA!a\f\0022\005!Q\017^5m\025\t\t\031$\001\003kCZ\f\027\002BA\034\003[\021A\001R1uK\"Y\0211\b\001A\002\003\007I\021AA\037\0039\031H/\031:u?RLW.Z0%KF$2AHA \021%\021\023\021HA\001\002\004\tI\003\003\005\002D\001\001\013\025BA\025\003-\031H/\031:u?RLW.\032\021\t\025\005\035\003\0011AA\002\023\00510\001\007f]\022|F/[7f?N$(\017C\006\002L\001\001\r\0211A\005\002\0055\023\001E3oI~#\030.\\3`gR\024x\fJ3r)\rq\022q\n\005\tE\005%\023\021!a\001y\"9\0211\013\001!B\023a\030!D3oI~#\030.\\3`gR\024\b\005C\006\002X\001\001\r\0211A\005\002\005\035\022\001C3oI~#\030.\\3\t\027\005m\003\0011AA\002\023\005\021QL\001\rK:$w\f^5nK~#S-\035\013\004=\005}\003\"\003\022\002Z\005\005\t\031AA\025\021!\t\031\007\001Q!\n\005%\022!C3oI~#\030.\\3!\001")
/*     */ public class RechargeRewardDef
/*     */ {
/*     */   private int id;
/*     */   private int type;
/*     */   private int kind;
/*     */   private int param1;
/*     */   private int param2;
/*     */   private int totalcountlimit;
/*     */   private List<GiveItem> rewards;
/*     */   
/*     */   public int id() {
/* 228 */     return this.id; } public void id_$eq(int x$1) { this.id = x$1; }
/* 229 */   public int type() { return this.type; } public void type_$eq(int x$1) { this.type = x$1; }
/* 230 */   public int kind() { return this.kind; } public void kind_$eq(int x$1) { this.kind = x$1; }
/* 231 */   public int param1() { return this.param1; } public void param1_$eq(int x$1) { this.param1 = x$1; }
/* 232 */   public int param2() { return this.param2; } public void param2_$eq(int x$1) { this.param2 = x$1; }
/* 233 */   public int totalcountlimit() { return this.totalcountlimit; } public void totalcountlimit_$eq(int x$1) { this.totalcountlimit = x$1; }
/* 234 */   public List<GiveItem> rewards() { return this.rewards; } public void rewards_$eq(List<GiveItem> x$1) { this.rewards = x$1; }
/* 235 */    private String reward; private String start_time_str; private Date start_time; private Map<Object, List<GiveItem>> careerAwardMap = Map$.MODULE$.empty(); private String end_time_str; private Date end_time; public Map<Object, List<GiveItem>> careerAwardMap() { return this.careerAwardMap; } public void careerAwardMap_$eq(Map<Object, List<GiveItem>> x$1) { this.careerAwardMap = x$1; }
/* 236 */   public String reward() { return this.reward; } public void reward_$eq(String x$1) { this.reward = x$1; }
/* 237 */   public String start_time_str() { return this.start_time_str; } public void start_time_str_$eq(String x$1) { this.start_time_str = x$1; }
/* 238 */   public Date start_time() { return this.start_time; } public void start_time_$eq(Date x$1) { this.start_time = x$1; }
/* 239 */   public String end_time_str() { return this.end_time_str; } public void end_time_str_$eq(String x$1) { this.end_time_str = x$1; }
/* 240 */   public Date end_time() { return this.end_time; } public void end_time_$eq(Date x$1) { this.end_time = x$1; }
/*     */ 
/*     */ }


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\xml\RechargeRewardDef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */