/*     */ package com.nirvana.bean;
/*     */ 
/*     */ import com.nirvana.core.MapBean;
/*     */ import com.nirvana.core.MapBean$;
/*     */ import com.nirvana.xml.EquipmentStrongDef;
/*     */ import com.nirvana.xml.EquipmentStrongRatioDef;
/*     */ import com.nirvana.xml.ProductConfig$;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.collection.immutable.List;
/*     */ import scala.collection.immutable.List$;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t\035q!B\001\003\021\003I\021\001B%uK6T!a\001\003\002\t\t,\027M\034\006\003\013\031\tqA\\5sm\006t\027MC\001\b\003\r\031w.\\\002\001!\tQ1\"D\001\003\r\025a!\001#\001\016\005\021IE/Z7\024\005-q\001CA\b\023\033\005\001\"\"A\t\002\013M\034\027\r\\1\n\005M\001\"AB!osJ+g\rC\003\026\027\021\005a#\001\004=S:LGO\020\013\002\023!)\001d\003C\0013\005)\021\r\0359msR\031!$a:\021\005)Yb\001\002\007\003\001q\031\"a\007\b\t\021yY\"Q1A\005\002}\tAa\0359JIV\t\001\005\005\002\020C%\021!\005\005\002\004\023:$\b\002\003\023\034\005\003\005\013\021\002\021\002\013M\004\030\n\032\021\t\013UYB\021\001\024\025\005i9\003\"\002\020&\001\004\001\003bB\025\034\005\004%\tAK\001\003gB,\022a\013\t\003Y=j\021!\f\006\003]\021\t1\001_7m\023\t\001TFA\004Qe>$Wo\031;\t\rIZ\002\025!\003,\003\r\031\b\017\t\005\nim\001\r\0211A\005\002U\n!!\0333\026\003Y\002\"a\016\036\017\005=A\024BA\035\021\003\031\001&/\0323fM&\0211\b\020\002\007'R\024\030N\\4\013\005e\002\002\"\003 \034\001\004\005\r\021\"\001@\003\031IGm\030\023fcR\021\001i\021\t\003\037\005K!A\021\t\003\tUs\027\016\036\005\b\tv\n\t\0211\0017\003\rAH%\r\005\007\rn\001\013\025\002\034\002\007%$\007\005C\005I7\001\007\t\031!C\001k\005A\001o\\:ji&|g\016C\005K7\001\007\t\031!C\001\027\006a\001o\\:ji&|gn\030\023fcR\021\001\t\024\005\b\t&\013\t\0211\0017\021\031q5\004)Q\005m\005I\001o\\:ji&|g\016\t\005\b!n\001\r\021\"\001 \003\031\031H/\031;vg\"9!k\007a\001\n\003\031\026AC:uCR,8o\030\023fcR\021\001\t\026\005\b\tF\013\t\0211\001!\021\03116\004)Q\005A\00591\017^1ukN\004\003b\002-\034\001\004%\taH\001\007C6|WO\034;\t\017i[\002\031!C\0017\006Q\021-\\8v]R|F%Z9\025\005\001c\006b\002#Z\003\003\005\r\001\t\005\007=n\001\013\025\002\021\002\017\005lw.\0368uA!I\001m\007a\001\002\004%\taH\001\004S\022D\b\"\0032\034\001\004\005\r\021\"\001d\003\035IG\r_0%KF$\"\001\0213\t\017\021\013\027\021!a\001A!1am\007Q!\n\001\nA!\0333yA!9\001n\007a\001\n#I\027aA7baV\t!\016\005\002l]6\tAN\003\002n\t\005!1m\034:f\023\tyGNA\004NCB\024U-\0318\t\017E\\\002\031!C\te\0069Q.\0319`I\025\fHC\001!t\021\035!\005/!AA\002)Da!^\016!B\023Q\027\001B7ba\002BQa^\016\005\002U\nqaZ3u\t\006$\030\rC\003z7\021\005!0A\004tKR$\025\r^1\025\005\001[\b\"\002?y\001\0041\024\001\0026t_:DQa^\016\005\ny,2a`A\003)\031\t\t!a\006\002\034A!\0211AA\003\031\001!q!a\002~\005\004\tIAA\001U#\021\tY!!\005\021\007=\ti!C\002\002\020A\021qAT8uQ&tw\rE\002\020\003'I1!!\006\021\005\r\te.\037\005\007\0033i\b\031\001\034\002\007-,\027\020C\004\002\036u\004\r!!\001\002\031\021,g-Y;miZ\013G.^3\t\re\\B\021BA\021)\025\001\0251EA\023\021\035\tI\"a\bA\002YB\001\"a\n\002 \001\007\021\021C\001\006m\006dW/\032\005\b\003WYB\021AA\027\003)\021X-\\8wK\022\013G/\031\013\004\001\006=\002bBA\r\003S\001\rA\016\005\007\003gYB\021A5\002\013Q|W*\0319\t\017\005]2\004\"\021\002:\005)1\r\\8oKR\t!\004\003\004\002>m!\taH\001\tO\026$H*\032<fY\"9\021\021I\016\005\002\005\r\023\001C:fi2+g/\0327\025\007\001\013)\005C\004\002H\005}\002\031\001\021\002\0131,g/\0327\t\r\005-3\004\"\001 \003\0319W\r^#ya\"9\021qJ\016\005\002\005E\023AB:fi\026C\b\017F\002A\003'Bq!!\026\002N\001\007\001%A\002fqBDq!!\027\034\t\003\tY&\001\006hKR\fV/\0317jif$\022\001\t\005\b\003?ZB\021AA1\003)\031X\r^)vC2LG/\037\013\004\001\006\r\004bBA3\003;\002\r\001I\001\bcV\fG.\033;z\021\035\tIg\007C\001\0037\nqaZ3u'R\f'\017C\004\002nm!\t!a\034\002\017M,Go\025;beR\031\001)!\035\t\017\005M\0241\016a\001A\005!1\017^1s\021\035\t9h\007C\001\003s\n\021b]3u'R|g.Z:\025\007\001\013Y\b\003\005\002~\005U\004\031AA@\003\031\031Ho\0348fgB)\021\021QAIU:!\0211QAG\035\021\t))a#\016\005\005\035%bAAE\021\0051AH]8pizJ\021!E\005\004\003\037\003\022a\0029bG.\fw-Z\005\005\003'\013)J\001\003MSN$(bAAH!!9\021\021T\016\005\002\005m\025!C4fiN#xN\\3t+\t\ty\bC\004\002 n!\t!!)\002\031\035,G/R9vSB\fE\017\036:\026\005\005\r\006c\001\006\002&&\031\021q\025\002\003\021\t\0137/Z!uiJDq!a+\034\t\003\ti+\001\013hKR,\025/^5q'R\024XM\\4uQ\006#HO\035\013\005\003G\013y\013C\004\0022\006%\006\031\001\021\002\033M$(/\0328hi\"dUM^3m\021\031\t)l\007C\001?\0059q-\032;CS:$\007bBA]7\021\005\0211X\001\007SN\024\025N\0343\026\005\005u\006cA\b\002@&\031\021\021\031\t\003\017\t{w\016\\3b]\"9\021QY\016\005\002\005\035\027\001\0022j]\022,\022\001\021\005\007\003\027\\B\021A\020\002\035\035,GOU3gS:,G*\032<fY\"9\021qZ\016\005\002\005E\027AD:fiJ+g-\0338f\031\0264X\r\034\013\004\001\006M\007bBAk\003\033\004\r\001I\001\fe\0264\027N\\3MKZ,G\016C\004\002Zn!\t!a7\002\035M,GOR1jef<%o\\8wKR\031\001)!8\t\021\005}\027q\033a\001\003\n!AZ7\t\017\005\r8\004\"\001\002f\006qq-\032;GC&\024\030p\022:p_Z,GCAA@\021\025qr\0031\001!\021\035\tYo\003C\001\003[\fq\"\033;f[N$v.T1q\005\026\fgn\035\013\005\003\ny\017\003\005\002r\006%\b\031AAz\003\025IG/Z7t!\025\t\t)!%\033\021\035\t9p\003C\001\003s\fa\"\\1q\005\026\fg\016V8Ji\026l7\017\006\003\002t\006m\b\002CA\003k\004\r!a \002\013\t,\027M\\:\t\017\t\0051\002\"\001\003\004\005iQ.\0319CK\006tGk\\%uK6$2A\007B\003\021\031\031\021q a\001U\002")
/*     */ public class Item {
/*     */   private final int spId;
/*     */   private final Product sp;
/*     */   private String id;
/*     */   private String position;
/*     */   private int status;
/*     */   private int amount;
/*     */   private int idx;
/*     */   private MapBean map;
/*     */   
/*  25 */   public int spId() { return this.spId; }
/*  26 */   public Product sp() { return this.sp; } public String id() { return this.id; } public void id_$eq(String x$1) { this.id = x$1; } public String position() { return this.position; } public void position_$eq(String x$1) { this.position = x$1; } public int status() { return this.status; } public Item(int spId) { this.sp = ProductConfig$.MODULE$.getSystemProduct(spId);
/*     */ 
/*     */     
/*  29 */     this.status = 0;
/*  30 */     this.amount = 1;
/*     */     
/*  32 */     this.map = MapBean$.MODULE$.empty(); } public void status_$eq(int x$1) { this.status = x$1; } public int amount() { return this.amount; } public void amount_$eq(int x$1) { this.amount = x$1; } public int idx() { return this.idx; } public void idx_$eq(int x$1) { this.idx = x$1; } public MapBean map() { return this.map; } public void map_$eq(MapBean x$1) { this.map = x$1; }
/*     */    public String getData() {
/*  34 */     return map().toJsonString();
/*     */   }
/*     */   public void setData(String json) {
/*  37 */     map_$eq(MapBean$.MODULE$.toMutableMap(json));
/*     */   }
/*     */   
/*     */   private <T> T getData(String key, Object defaultValue) {
/*  41 */     return map().contains(key) ? (T)map().apply(key) : (T)defaultValue;
/*     */   }
/*     */   private void setData(String key, Object value) {
/*  44 */     map().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(key), value));
/*     */   }
/*     */   
/*     */   public void removeData(String key) {
/*  48 */     if (map().contains(key)) map().$minus$eq(key); 
/*     */   }
/*     */   public MapBean toMap() {
/*  51 */     (new scala.Tuple2[6])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("id"), id()); (new scala.Tuple2[6])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("pt"), position()); (new scala.Tuple2[6])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("st"), BoxesRunTime.boxToInteger(status())); (new scala.Tuple2[6])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("spId"), BoxesRunTime.boxToInteger(spId())); (new scala.Tuple2[6])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("am"), BoxesRunTime.boxToInteger(amount())); (new scala.Tuple2[6])[5] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("idx"), BoxesRunTime.boxToInteger(idx())); return (MapBean)MapBean$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[6])).$plus$plus$eq((TraversableOnce)map());
/*     */   }
/*     */   public Item clone() {
/*  54 */     Item item = Item$.MODULE$.apply(spId());
/*  55 */     item.id_$eq(id());
/*  56 */     item.position_$eq(position());
/*  57 */     item.status_$eq(status());
/*  58 */     item.amount_$eq(amount());
/*  59 */     item.idx_$eq(idx());
/*  60 */     item.map().$plus$plus$eq((TraversableOnce)map());
/*  61 */     return item;
/*     */   }
/*     */   public int getLevel() {
/*  64 */     return BoxesRunTime.unboxToInt(getData("level", BoxesRunTime.boxToInteger(sp().level())));
/*     */   } public void setLevel(int level) {
/*  66 */     setData("level", BoxesRunTime.boxToInteger(level));
/*     */   } public int getExp() {
/*  68 */     return BoxesRunTime.unboxToInt(getData("exp", BoxesRunTime.boxToInteger(0)));
/*     */   } public void setExp(int exp) {
/*  70 */     setData("exp", BoxesRunTime.boxToInteger(exp));
/*     */   } public int getQuality() {
/*  72 */     return BoxesRunTime.unboxToInt(getData("quality", BoxesRunTime.boxToInteger(sp().quality())));
/*     */   } public void setQuality(int quality) {
/*  74 */     setData("quality", BoxesRunTime.boxToInteger(quality));
/*     */   }
/*     */   public int getStar() {
/*  77 */     return BoxesRunTime.unboxToInt(getData("star", BoxesRunTime.boxToInteger(0)));
/*     */   } public void setStar(int star) {
/*  79 */     setData("star", BoxesRunTime.boxToInteger(star));
/*     */   }
/*     */   public void setStones(List stones) {
/*  82 */     if (stones != null) setData("stones", stones); 
/*     */   }
/*     */   public List<MapBean> getStones() {
/*  85 */     return getData("stones", List$.MODULE$.empty());
/*     */   } public BaseAttr getEquipAttr() {
/*  87 */     return ProductConfig$.MODULE$.getEquipAttr(spId(), 0);
/*     */   }
/*     */   public BaseAttr getEquipStrengthAttr(int strengthLevel) {
/*  90 */     if (strengthLevel == 0) return new BaseAttr(); 
/*  91 */     EquipmentStrongDef equipmentStrongDef = ProductConfig$.MODULE$.getEquipmentStrong(sp().career(), strengthLevel);
/*  92 */     EquipmentStrongRatioDef equipmentStrongRatioDef = ProductConfig$.MODULE$.getEquipmentStrongRatio(sp().quality(), sp().kind());
/*  93 */     if (equipmentStrongDef == null || equipmentStrongRatioDef == null) return new BaseAttr();
/*     */     
/*  95 */     BaseAttr equipBaseAtt = new BaseAttr();
/*  96 */     equipBaseAtt.hp_max_$eq((int)(equipmentStrongDef.hp_max() * equipmentStrongRatioDef.hp_max() / 'Ϩ'));
/*  97 */     equipBaseAtt.mp_max_$eq((int)(equipmentStrongDef.mp_max() * equipmentStrongRatioDef.mp_max() / 'Ϩ'));
/*  98 */     equipBaseAtt.phy_att_$eq(equipmentStrongDef.phy_att() * equipmentStrongRatioDef.phy_att() / 1000);
/*  99 */     equipBaseAtt.phy_def_$eq(equipmentStrongDef.phy_def() * equipmentStrongRatioDef.phy_def() / 1000);
/* 100 */     equipBaseAtt.hit_$eq(equipmentStrongDef.hit() * equipmentStrongRatioDef.hit() / 1000);
/* 101 */     equipBaseAtt.eva_$eq(equipmentStrongDef.eva() * equipmentStrongRatioDef.eva() / 1000);
/* 102 */     equipBaseAtt.crit_$eq(equipmentStrongDef.crit() * equipmentStrongRatioDef.crit() / 1000);
/* 103 */     equipBaseAtt.tough_$eq(equipmentStrongDef.tough() * equipmentStrongRatioDef.tough() / 1000);
/* 104 */     equipBaseAtt.fatal_$eq(equipmentStrongDef.fatal() * equipmentStrongRatioDef.fatal() / 1000);
/* 105 */     equipBaseAtt.block_$eq(equipmentStrongDef.block() * equipmentStrongRatioDef.block() / 1000);
/* 106 */     return equipBaseAtt;
/*     */   }
/*     */   public int getBind() {
/* 109 */     return BoxesRunTime.unboxToInt(getData("bind", BoxesRunTime.boxToInteger(0)));
/*     */   } public boolean isBind() {
/* 111 */     return (getBind() == 1);
/*     */   }
/*     */   public void bind() {
/* 114 */     setData("bind", BoxesRunTime.boxToInteger(1));
/*     */   }
/*     */   
/*     */   public int getRefineLevel() {
/* 118 */     return BoxesRunTime.unboxToInt(getData("refine_lev", BoxesRunTime.boxToInteger(0)));
/*     */   }
/*     */   public void setRefineLevel(int refineLevel) {
/* 121 */     setData("refine_lev", BoxesRunTime.boxToInteger(refineLevel));
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFairyGroove(List fm) {
/* 126 */     setData("fm", fm);
/*     */   }
/*     */ 
/*     */   
/*     */   public List<MapBean> getFairyGroove() {
/* 131 */     return getData("fm", List$.MODULE$.empty());
/*     */   }
/*     */   
/*     */   public static Item mapBeanToItem(MapBean paramMapBean) {
/*     */     return Item$.MODULE$.mapBeanToItem(paramMapBean);
/*     */   }
/*     */   
/*     */   public static List<Item> mapBeanToItems(List<MapBean> paramList) {
/*     */     return Item$.MODULE$.mapBeanToItems(paramList);
/*     */   }
/*     */   
/*     */   public static List<MapBean> itemsToMapBeans(List<Item> paramList) {
/*     */     return Item$.MODULE$.itemsToMapBeans(paramList);
/*     */   }
/*     */   
/*     */   public static Item apply(int paramInt) {
/*     */     return Item$.MODULE$.apply(paramInt);
/*     */   }
/*     */ }


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\bean\Item.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */