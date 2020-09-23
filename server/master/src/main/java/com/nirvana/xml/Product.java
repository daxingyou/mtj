/*     */ package com.nirvana.xml;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t\025c\001B\001\003\001%\021q\001\025:pIV\034GO\003\002\004\t\005\031\0010\0347\013\005\0251\021a\0028jeZ\fg.\031\006\002\017\005\0311m\\7\004\001M\021\001A\003\t\003\0279i\021\001\004\006\002\033\005)1oY1mC&\021q\002\004\002\007\003:L(+\0324\t\021E\001!Q1A\005\002I\t!!\0333\026\003M\001\"a\003\013\n\005Ua!aA%oi\"Aq\003\001B\001B\003%1#A\002jI\002BQ!\007\001\005\002i\ta\001P5oSRtDCA\016\036!\ta\002!D\001\003\021\025\t\002\0041\001\024\021%y\002\0011AA\002\023\005!#A\006qe>$Wo\031;UsB,\007\"C\021\001\001\004\005\r\021\"\001#\003=\001(o\0343vGR$\026\020]3`I\025\fHCA\022'!\tYA%\003\002&\031\t!QK\\5u\021\0359\003%!AA\002M\t1\001\037\0232\021\031I\003\001)Q\005'\005a\001O]8ek\016$H+\0379fA!91\006\001a\001\n\003\021\022\001B6j]\022Dq!\f\001A\002\023\005a&\001\005lS:$w\fJ3r)\t\031s\006C\004(Y\005\005\t\031A\n\t\rE\002\001\025)\003\024\003\025Y\027N\0343!\021%\031\004\0011AA\002\023\005A'\001\003oC6,W#A\033\021\005YJdBA\0068\023\tAD\"\001\004Qe\026$WMZ\005\003um\022aa\025;sS:<'B\001\035\r\021%i\004\0011AA\002\023\005a(\001\005oC6,w\fJ3r)\t\031s\bC\004(y\005\005\t\031A\033\t\r\005\003\001\025)\0036\003\025q\027-\\3!\021%\031\005\0011AA\002\023\005A'\001\003eKN\034\007\"C#\001\001\004\005\r\021\"\001G\003!!Wm]2`I\025\fHCA\022H\021\0359C)!AA\002UBa!\023\001!B\023)\024!\0023fg\016\004\003bB&\001\001\004%\tAE\001\006Y\0264X\r\034\005\b\033\002\001\r\021\"\001O\003%aWM^3m?\022*\027\017\006\002$\037\"9q\005TA\001\002\004\031\002BB)\001A\003&1#\001\004mKZ,G\016\t\005\b'\002\001\r\021\"\001\023\003\035\021X-]0mKZDq!\026\001A\002\023\005a+A\006sKF|F.\032<`I\025\fHCA\022X\021\0359C+!AA\002MAa!\027\001!B\023\031\022\001\003:fc~cWM\036\021\t\017m\003\001\031!C\001%\0059\021/^1mSRL\bbB/\001\001\004%\tAX\001\fcV\fG.\033;z?\022*\027\017\006\002$?\"9q\005XA\001\002\004\031\002BB1\001A\003&1#\001\005rk\006d\027\016^=!\021\035\031\007\0011A\005\002I\tqa\034<fe2\f\027\020C\004f\001\001\007I\021\0014\002\027=4XM\0357bs~#S-\035\013\003G\035Dqa\n3\002\002\003\0071\003\003\004j\001\001\006KaE\001\t_Z,'\017\\1zA!91\016\001a\001\n\003\021\022!B7p]\026L\bbB7\001\001\004%\tA\\\001\n[>tW-_0%KF$\"aI8\t\017\035b\027\021!a\001'!1\021\017\001Q!\nM\ta!\\8oKf\004\003bB:\001\001\004%\tAE\001\007G\006\024X-\032:\t\017U\004\001\031!C\001m\006Q1-\031:fKJ|F%Z9\025\005\r:\bbB\024u\003\003\005\ra\005\005\007s\002\001\013\025B\n\002\017\r\f'/Z3sA!91\020\001a\001\n\003\021\022a\002<ja~cWM\036\005\b{\002\001\r\021\"\001\003-1\030\016]0mKZ|F%Z9\025\005\rz\bbB\024}\003\003\005\ra\005\005\b\003\007\001\001\025)\003\024\003!1\030\016]0mKZ\004\003\002CA\004\001\001\007I\021\001\n\002\005\r$\007\"CA\006\001\001\007I\021AA\007\003\031\031Gm\030\023fcR\0311%a\004\t\021\035\nI!!AA\002MAq!a\005\001A\003&1#A\002dI\002B\001\"a\006\001\001\004%\tAE\001\nE&tGm\030;za\026D\021\"a\007\001\001\004%\t!!\b\002\033\tLg\016Z0usB,w\fJ3r)\r\031\023q\004\005\tO\005e\021\021!a\001'!9\0211\005\001!B\023\031\022A\0032j]\022|F/\0379fA!Q\021q\005\001A\002\003\007I\021\001\n\002\023\025D\bo\030<bYV,\007bCA\026\001\001\007\t\031!C\001\003[\tQ\"\032=q?Z\fG.^3`I\025\fHcA\022\0020!Aq%!\013\002\002\003\0071\003C\004\0024\001\001\013\025B\n\002\025\025D\bo\030<bYV,\007\005\003\006\0028\001\001\r\0211A\005\002Q\n!BZ;o?N\034'/\0339u\021-\tY\004\001a\001\002\004%\t!!\020\002\035\031,hnX:de&\004Ho\030\023fcR\0311%a\020\t\021\035\nI$!AA\002UBq!a\021\001A\003&Q'A\006gk:|6o\031:jaR\004\003bCA$\001\001\007\t\031!C\001\003\023\n\001BZ;o?B\f'/Y\013\003\003\027\002BaCA'k%\031\021q\n\007\003\013\005\023(/Y=\t\027\005M\003\0011AA\002\023\005\021QK\001\rMVtw\f]1sC~#S-\035\013\004G\005]\003\"C\024\002R\005\005\t\031AA&\021!\tY\006\001Q!\n\005-\023!\0034v]~\003\030M]1!\021!\ty\006\001a\001\n\003\021\022aB5d_:|\026\016\032\005\n\003G\002\001\031!C\001\003K\n1\"[2p]~KGm\030\023fcR\0311%a\032\t\021\035\n\t'!AA\002MAq!a\033\001A\003&1#\001\005jG>tw,\0333!\021!\ty\007\001a\001\n\003\021\022AC3ySN$x\f^=qK\"I\0211\017\001A\002\023\005\021QO\001\017KbL7\017^0usB,w\fJ3r)\r\031\023q\017\005\tO\005E\024\021!a\001'!9\0211\020\001!B\023\031\022aC3ySN$x\f^=qK\002B\001\"a \001\001\004%\tAE\001\005MJ|W\016C\005\002\004\002\001\r\021\"\001\002\006\006AaM]8n?\022*\027\017F\002$\003\017C\001bJAA\003\003\005\ra\005\005\b\003\027\003\001\025)\003\024\003\0251'o\\7!\021!\ty\t\001a\001\n\003\021\022!C4pY\022|&-Y:f\021%\t\031\n\001a\001\n\003\t)*A\007h_2$wLY1tK~#S-\035\013\004G\005]\005\002C\024\002\022\006\005\t\031A\n\t\017\005m\005\001)Q\005'\005Qqm\0347e?\n\f7/\032\021\t\021\005}\005\0011A\005\002I\t1B\0327pCR|&/\031;j_\"I\0211\025\001A\002\023\005\021QU\001\020M2|\027\r^0sCRLwn\030\023fcR\0311%a*\t\021\035\n\t+!AA\002MAq!a+\001A\003&1#\001\007gY>\fGo\030:bi&|\007\005\003\005\0020\002\001\r\021\"\001\023\003%i\027\r_0gY>\fG\017C\005\0024\002\001\r\021\"\001\0026\006iQ.\031=`M2|\027\r^0%KF$2aIA\\\021!9\023\021WA\001\002\004\031\002bBA^\001\001\006KaE\001\013[\006DxL\0327pCR\004\003\002CA`\001\001\007I\021\001\n\002\0235|g.Z=`M\026,\007\"CAb\001\001\007I\021AAc\0035iwN\\3z?\032,Wm\030\023fcR\0311%a2\t\021\035\n\t-!AA\002MAq!a3\001A\003&1#\001\006n_:,\027p\0304fK\002B\001\"a4\001\001\004%\tAE\001\tO>dGm\0304fK\"I\0211\033\001A\002\023\005\021Q[\001\rO>dGm\0304fK~#S-\035\013\004G\005]\007\002C\024\002R\006\005\t\031A\n\t\017\005m\007\001)Q\005'\005Iqm\0347e?\032,W\r\t\005\n\003?\004\001\031!C\001\003C\f\021\"[:`]>$\030nY3\026\005\005\r\bcA\006\002f&\031\021q\035\007\003\017\t{w\016\\3b]\"I\0211\036\001A\002\023\005\021Q^\001\016SN|fn\034;jG\026|F%Z9\025\007\r\ny\017C\005(\003S\f\t\0211\001\002d\"A\0211\037\001!B\023\t\031/\001\006jg~sw\016^5dK\002B\001\"a>\001\001\004%\tAE\001\013[\026\0348/Y4f?&$\007\"CA~\001\001\007I\021AA\0039iWm]:bO\026|\026\016Z0%KF$2aIA\000\021!9\023\021`A\001\002\004\031\002b\002B\002\001\001\006KaE\001\f[\026\0348/Y4f?&$\007\005C\006\003\b\001\001\r\0211A\005\002\t%\021\001C4f[RK\b/Z:\026\005\t-\001\003B\006\002NMA1Ba\004\001\001\004\005\r\021\"\001\003\022\005aq-Z7UsB,7o\030\023fcR\0311Ea\005\t\023\035\022i!!AA\002\t-\001\002\003B\f\001\001\006KAa\003\002\023\035,W\016V=qKN\004\003b\002B\016\001\021\005\021\021]\001\bSN,\025/^5q\021\035\021y\002\001C\001\003C\f1\"[:TW&dGNQ8pW\"9!1\005\001\005\002\005\005\030aB5t\tJ,7o\035\005\b\005O\001A\021AAq\003!I7oQ1o+N,\007b\002B\026\001\021\005\021\021]\001\016SN4\026N\035;vC2LE/Z7\t\017\t=\002\001\"\001\002b\0069\021n]*u_:,\007b\002B\032\001\021\005\021\021]\001\007SN\034F/\031:\t\017\t]\002\001\"\001\002b\0061\021n\035$be6DqAa\017\001\t\003\t\t/\001\005jg\026c\027\016_5s\021\035\021y\004\001C\001\003C\f\021\"[:QKRLE/Z7\t\017\t\r\003\001\"\001\002b\006y\021n\035#je\026\034G/V:f\023R,W\016")
/*     */ public class Product
/*     */ {
/*     */   private final int id;
/*     */   private int productType;
/*     */   
/*     */   public int id() {
/* 393 */     return this.id;
/* 394 */   } public int productType() { return this.productType; } public void productType_$eq(int x$1) { this.productType = x$1; }
/* 395 */    private int kind = 0; private String name; private String desc; public int kind() { return this.kind; } public void kind_$eq(int x$1) { this.kind = x$1; }
/* 396 */   public String name() { return this.name; } public void name_$eq(String x$1) { this.name = x$1; }
/* 397 */   public String desc() { return this.desc; } public void desc_$eq(String x$1) { this.desc = x$1; }
/* 398 */    private int level = 1; public int level() { return this.level; } public void level_$eq(int x$1) { this.level = x$1; }
/* 399 */    private int req_lev = 1; public int req_lev() { return this.req_lev; } public void req_lev_$eq(int x$1) { this.req_lev = x$1; }
/*     */   
/* 401 */   private int quality = 0; public int quality() { return this.quality; } public void quality_$eq(int x$1) { this.quality = x$1; }
/* 402 */    private int overlay = 1; public int overlay() { return this.overlay; } public void overlay_$eq(int x$1) { this.overlay = x$1; }
/* 403 */    private int money = 0; public int money() { return this.money; } public void money_$eq(int x$1) { this.money = x$1; }
/*     */   
/* 405 */   private int career = 0; public int career() { return this.career; } public void career_$eq(int x$1) { this.career = x$1; }
/* 406 */    private int vip_lev = 0; public int vip_lev() { return this.vip_lev; } public void vip_lev_$eq(int x$1) { this.vip_lev = x$1; }
/* 407 */    private int cd = 0; public int cd() { return this.cd; } public void cd_$eq(int x$1) { this.cd = x$1; }
/*     */   
/* 409 */   private int exp_value; private String fun_script; private int bind_type = 2; private String[] fun_para; public int bind_type() { return this.bind_type; } public void bind_type_$eq(int x$1) { this.bind_type = x$1; }
/*     */   
/* 411 */   public int exp_value() { return this.exp_value; } public void exp_value_$eq(int x$1) { this.exp_value = x$1; }
/*     */   
/* 413 */   public String fun_script() { return this.fun_script; } public void fun_script_$eq(String x$1) { this.fun_script = x$1; }
/* 414 */   public String[] fun_para() { return this.fun_para; } public void fun_para_$eq(String[] x$1) { this.fun_para = x$1; }
/* 415 */    private int icon_id = 0; public int icon_id() { return this.icon_id; } public void icon_id_$eq(int x$1) { this.icon_id = x$1; }
/*     */   
/* 417 */   private int exist_type = 0; public int exist_type() { return this.exist_type; } public void exist_type_$eq(int x$1) { this.exist_type = x$1; }
/*     */   
/* 419 */   private int from = 0; public int from() { return this.from; } public void from_$eq(int x$1) { this.from = x$1; }
/*     */ 
/*     */ 
/*     */   
/* 423 */   private int gold_base = 0; public int gold_base() { return this.gold_base; } public void gold_base_$eq(int x$1) { this.gold_base = x$1; }
/*     */   
/* 425 */   private int float_ratio = 0; public int float_ratio() { return this.float_ratio; } public void float_ratio_$eq(int x$1) { this.float_ratio = x$1; }
/*     */   
/* 427 */   private int max_float = 0; public int max_float() { return this.max_float; } public void max_float_$eq(int x$1) { this.max_float = x$1; }
/*     */   
/* 429 */   private int money_fee = 0; public int money_fee() { return this.money_fee; } public void money_fee_$eq(int x$1) { this.money_fee = x$1; }
/*     */   
/* 431 */   private int gold_fee = 0; public int gold_fee() { return this.gold_fee; } public void gold_fee_$eq(int x$1) { this.gold_fee = x$1; }
/*     */   
/*     */   private boolean is_notice = false;
/* 434 */   public boolean is_notice() { return this.is_notice; } public void is_notice_$eq(boolean x$1) { this.is_notice = x$1; }
/* 435 */    private int message_id = 0; private int[] gemTypes; public int message_id() { return this.message_id; } public void message_id_$eq(int x$1) { this.message_id = x$1; }
/*     */ 
/*     */   
/*     */   public int[] gemTypes() {
/* 439 */     return this.gemTypes; } public void gemTypes_$eq(int[] x$1) { this.gemTypes = x$1; }
/*     */    public boolean isEquip() {
/* 441 */     return (productType() == 1);
/*     */   } public boolean isSkillBook() {
/* 443 */     return (productType() == 10);
/*     */   } public boolean isDress() {
/* 445 */     return (isEquip() && (kind() == 1 || kind() == 6));
/*     */   } public boolean isCanUse() {
/* 447 */     return (productType() == 3 || productType() == 4 || productType() == 5 || productType() == 6 || productType() == 10);
/*     */   } public boolean isVirtualItem() {
/* 449 */     return (productType() == 0);
/*     */   } public boolean isStone() {
/* 451 */     return (productType() == 2);
/*     */   } public boolean isStar() {
/* 453 */     return (productType() == 8);
/*     */   } public boolean isFarm() {
/* 455 */     return (productType() == 13);
/*     */   } public boolean isElixir() {
/* 457 */     return (productType() == 6);
/*     */   } public boolean isPetItem() {
/* 459 */     return (productType() == 15);
/*     */   } public boolean isDirectUseItem() {
/* 461 */     return (productType() == 14);
/*     */   }
/*     */   
/*     */   public Product(int id) {}
/*     */ }


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\xml\Product.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */