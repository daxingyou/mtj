/*     */ package com.nirvana.core;
/*     */ 
/*     */ import grizzled.slf4j.Logger;
/*     */ import java.io.IOException;
/*     */ import java.sql.Date;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
/*     */ import java.util.Map;
/*     */ import org.codehaus.jackson.map.ObjectMapper;
/*     */ import scala.Array$;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.MatchError;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.Set;
/*     */ import scala.collection.immutable.List;
/*     */ import scala.collection.immutable.List$;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.collection.mutable.HashMap;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.collection.mutable.MapLike;
/*     */ import scala.reflect.ClassTag$;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.ScalaRunTime$;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t}r!B\001\003\021\003I\021aB'ba\n+\027M\034\006\003\007\021\tAaY8sK*\021QAB\001\b]&\024h/\0318b\025\0059\021aA2p[\016\001\001C\001\006\f\033\005\021a!\002\007\003\021\003i!aB'ba\n+\027M\\\n\005\0279!B\004\005\002\020%5\t\001CC\001\022\003\025\0318-\0317b\023\t\031\002C\001\004B]f\024VM\032\t\003+ii\021A\006\006\003/a\tQa\0357gi)T\021!G\001\tOJL'P\0377fI&\0211D\006\002\b\031><w-\0338h!\tyQ$\003\002\037!\ta1+\032:jC2L'0\0312mK\")\001e\003C\001C\0051A(\0338jiz\"\022!\003\005\bG-\021\r\021\"\002%\003\025)U\n\025+Z+\005)\003C\001\006'\r\021a!\001A\024\024\005\031B\003\003B\025/a]j\021A\013\006\003W1\nq!\\;uC\ndWM\003\002.!\005Q1m\0347mK\016$\030n\0348\n\005=R#a\002%bg\"l\025\r\035\t\003cQr!a\004\032\n\005M\002\022A\002)sK\022,g-\003\0026m\t11\013\036:j]\036T!a\r\t\021\005=A\024BA\035\021\005\r\te.\037\005\006A\031\"\ta\017\013\002K!)QH\nC\001}\005\031q-\032;\026\005}\022Ec\001!I\025B\021\021I\021\007\001\t\025\031EH1\001E\005\005!\026CA#8!\tya)\003\002H!\t9aj\034;iS:<\007\"B%=\001\004\001\024aA6fs\")1\n\020a\001\001\006aA-\0324bk2$h+\0317vK\")QJ\nC\001\035\0061q-\032;J]R$\"a\024*\021\005=\001\026BA)\021\005\rIe\016\036\005\006\0232\003\r\001\r\005\006\033\032\"\t\001\026\013\004\037V3\006\"B%T\001\004\001\004\"B&T\001\004y\005\"\002-'\t\003I\026!C4fi:+XNY3s)\rQ&m\031\t\0037\002l\021\001\030\006\003;z\013A\001\\1oO*\tq,\001\003kCZ\f\027BA1]\005\031qU/\0342fe\")\021j\026a\001a!)1j\026a\0015\")QM\nC\001M\006Aq-\032;GY>\fG\017\006\002hUB\021q\002[\005\003SB\021QA\0227pCRDQ!\0233A\002ABQ!\032\024\005\0021$2aZ7o\021\025I5\0161\0011\021\025Y5\0161\001h\021\025\001h\005\"\001r\003\0359W\r\036'p]\036$\"A];\021\005=\031\030B\001;\021\005\021auN\\4\t\013%{\007\031\001\031\t\013A4C\021A<\025\007ID\030\020C\003Jm\002\007\001\007C\003Lm\002\007!\017C\003|M\021\005A0A\005hKR$u.\0362mKR\031Q0!\001\021\005=q\030BA@\021\005\031!u.\0362mK\")\021J\037a\001a!11P\nC\001\003\013!R!`A\004\003\023Aa!SA\002\001\004\001\004BB&\002\004\001\007Q\020C\004\002\016\031\"\t!a\004\002\023\035,Go\025;sS:<Gc\001\031\002\022!1\021*a\003A\002ABq!!\004'\t\003\t)\002F\0031\003/\tI\002\003\004J\003'\001\r\001\r\005\007\027\006M\001\031\001\031\t\017\005ua\005\"\001\002 \005Qq-\032;C_>dW-\0318\025\t\005\005\022q\005\t\004\037\005\r\022bAA\023!\t9!i\\8mK\006t\007BB%\002\034\001\007\001\007C\004\002,\031\"\t!!\f\002\017\035,G\017T5tiV!\021qFA&)\021\t\t$!\024\021\r\005M\0221IA%\035\021\t)$a\020\017\t\005]\022QH\007\003\003sQ1!a\017\t\003\031a$o\\8u}%\t\021#C\002\002BA\tq\001]1dW\006<W-\003\003\002F\005\035#\001\002'jgRT1!!\021\021!\r\t\0251\n\003\007\007\006%\"\031\001#\t\r%\013I\0031\0011\021\035\t\tF\nC\001\003'\naaZ3u\033\006\004HcA\023\002V!1\021*a\024A\002ABq!!\027'\t\003\tY&A\005hKR|%M[3diV!\021QLA1)\021\ty&a\031\021\007\005\013\t\007\002\004D\003/\022\r\001\022\005\007\023\006]\003\031\001\031\t\017\005\035d\005\"\001\002j\005Aq-\032;CsR,7\017\006\003\002l\005]\004#B\b\002n\005E\024bAA8!\t)\021I\035:bsB\031q\"a\035\n\007\005U\004C\001\003CsR,\007BB%\002f\001\007\001\007C\004\002|\031\"\t!! \002\027\035,G/\026;jY\022\013G/\032\013\005\003\nY\t\005\003\002\002\006\035UBAAB\025\r\t)IX\001\005kRLG.\003\003\002\n\006\r%\001\002#bi\026Da!SA=\001\004\001\004bBAHM\021\005\021\021S\001\013O\026$8+\0357ECR,G\003BAJ\003;\003B!!&\002\0346\021\021q\023\006\004\0033s\026aA:rY&!\021\021RAL\021\031I\025Q\022a\001a!9\021\021\025\024\005\002\005\r\026\001\004;p\025N|gn\025;sS:<W#\001\031\t\017\005\035f\005\"\001\002*\006IAo\034&bm\006l\025\r]\013\003\003W\003b!!!\002.B:\024\002BAX\003\007\0231!T1q\021\035\t\031L\nC\005\003k\0131bY8om\026\024HOS1wCR\031q'a.\t\017\005e\026\021\027a\001o\005)a/\0317vK\"1\021Q\030\024\005Bm\nQa\0317p]\026DsAJAa\003s\0139\rE\002\020\003\007L1!!2\021\005A\031VM]5bYZ+'o]5p]VKEIH\004\037+[HFL\001`\t\017\005-7\002)A\007K\0051Q)\024)U3\002B\021\"a4\f\005\004%)!!5\002\031=\024'.Z2u\033\006\004\b/\032:\026\005\005M\007\003BAk\003Ol!!a6\013\t\005e\0271\\\001\004[\006\004(\002BAo\003?\fqA[1dWN|gN\003\003\002b\006\r\030\001C2pI\026D\027-^:\013\005\005\025\030aA8sO&!\021\021^Al\0051y%M[3di6\013\007\017]3s\021!\tio\003Q\001\016\005M\027!D8cU\026\034G/T1qa\026\024\b\005C\004\002r.!\t!a=\002\013\025l\007\017^=\026\013\021\n)0a>\005\rU\nyO1\001E\t\031I\024q\036b\001\t\"9\0211`\006\005\002\005u\030!B1qa2LHcA\023\002\000\"A!\021AA}\001\004\021\031!A\003fY\026l7\017E\003\020\005\013\021I!C\002\003\bA\021!\002\020:fa\026\fG/\0323?!\025y!1\002\0318\023\r\021i\001\005\002\007)V\004H.\032\032\t\017\tE1\002\"\001\003\024\005aAo\\'vi\006\024G.Z'baR\031QE!\006\t\017\t]!q\002a\001o\005\031qN\0316\t\017\tm1\002\"\003\003\036\005a1m\0348wKJ$8kY1mCR\031qGa\b\t\017\005e&\021\004a\001o!9!1E\006\005\002\t\025\022\001B7bS:$BAa\n\003.A\031qB!\013\n\007\t-\002C\001\003V]&$\b\002\003B\030\005C\001\rA!\r\002\t\005\024xm\035\t\005\037\0055\004\007C\005\0036-\t\t\021\"\003\0038\005Y!/Z1e%\026\034x\016\034<f)\t\021I\004E\002\\\005wI1A!\020]\005\031y%M[3di\002")
/*     */ public class MapBean
/*     */   extends HashMap<String, Object>
/*     */ {
/*     */   public static final long serialVersionUID = 8609134578238142L;
/*     */   
/*     */   public <T> T get(String key, Object defaultValue) {
/*  70 */     Option v = get(key);
/*  71 */     None$ none$ = None$.MODULE$; if (v == null) { if (none$ != null); } else if (v.equals(none$))
/*     */     {  }
/*     */      } public int getInt(String key) {
/*  74 */     return getInt(key, 0);
/*     */   } public int getInt(String key, int defaultValue) {
/*  76 */     return getNumber(key, Predef$.MODULE$.int2Integer(defaultValue)).intValue();
/*     */   } public Number getNumber(String key, Number defaultValue) {
/*  78 */     return get(key, defaultValue);
/*     */   } public float getFloat(String key) {
/*  80 */     return getFloat(key, 0.0F);
/*     */   } public float getFloat(String key, float defaultValue) {
/*  82 */     return getNumber(key, Predef$.MODULE$.float2Float(defaultValue)).floatValue();
/*     */   } public long getLong(String key) {
/*  84 */     return getLong(key, 0L);
/*     */   } public long getLong(String key, long defaultValue) {
/*  86 */     return getNumber(key, Predef$.MODULE$.long2Long(defaultValue)).longValue();
/*     */   } public double getDouble(String key) {
/*  88 */     return getDouble(key, 0.0D);
/*     */   } public double getDouble(String key, double defaultValue) {
/*  90 */     return getNumber(key, Predef$.MODULE$.double2Double(defaultValue)).doubleValue();
/*     */   } public String getString(String key) {
/*  92 */     return getString(key, (String)null);
/*     */   } public String getString(String key, String defaultValue) {
/*  94 */     return get(key, defaultValue);
/*     */   } public boolean getBoolean(String key) {
/*  96 */     return BoxesRunTime.unboxToBoolean(get(key, BoxesRunTime.boxToBoolean(false)));
/*     */   } public <T> List<T> getList(String key) {
/*  98 */     return get(key, List$.MODULE$.empty());
/*     */   } public MapBean getMap(String key) {
/* 100 */     return get(key, MapBean$.MODULE$.empty());
/*     */   } public <T> T getObject(String key) {
/* 102 */     return get(key, (T)null);
/*     */   } public byte[] getBytes(String key) {
/* 104 */     return (byte[])get(key, Array$.MODULE$.empty(ClassTag$.MODULE$.Byte()));
/*     */   } public Date getUtilDate(String key) {
/* 106 */     return get(key, (Date)null);
/*     */   } public Date getSqlDate(String key) {
/* 108 */     return get(key, (Date)null);
/*     */   } public String toJsonString() {
/*     */     try {
/* 111 */       return 
/* 112 */         MapBean$.MODULE$.objectMapper().writeValueAsString(toJavaMap());
/*     */     } catch (IOException iOException) {
/* 114 */       throw new RuntimeException(iOException);
/*     */     } 
/*     */   }
/*     */   public Map<String, Object> toJavaMap() {
/* 118 */     return (HashMap)com$nirvana$core$MapBean$$convertJava(this);
/*     */   }
/* 120 */   public Object com$nirvana$core$MapBean$$convertJava(Object value) { Object object2, object1 = value;
/* 121 */     if (ScalaRunTime$.MODULE$.isArray(object1, 1)) { Object object = object1;
/* 122 */       ArrayList list = new ArrayList();
/* 123 */       Predef$.MODULE$.genericArrayOps(object).foreach((Function1)new MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$1(this, list));
/*     */ 
/*     */       
/* 126 */       object2 = list; }
/* 127 */     else if (object1 instanceof Seq) { Seq seq = (Seq)object1;
/* 128 */       ArrayList list = new ArrayList();
/* 129 */       seq.foreach((Function1)new MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$2(this, list));
/*     */ 
/*     */       
/* 132 */       object2 = list; }
/* 133 */     else if (object1 instanceof Set) { Set set1 = (Set)object1;
/* 134 */       HashSet set = new HashSet();
/* 135 */       set1.foreach((Function1)new MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$3(this, set));
/*     */ 
/*     */       
/* 138 */       object2 = set; }
/* 139 */     else if (object1 instanceof Map) { Map map1 = (Map)object1;
/* 140 */       HashMap<Object, Object> map = new HashMap<Object, Object>();
/* 141 */       map1.withFilter((Function1)new MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$4(this)).foreach((Function1)new MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$5(this, map));
/*     */ 
/*     */       
/* 144 */       object2 = map; }
/* 145 */     else if (object1 instanceof Map) { Map map1 = (Map)object1;
/* 146 */       HashMap<Object, Object> map = new HashMap<Object, Object>();
/* 147 */       map1.withFilter((Function1)new MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$6(this)).foreach((Function1)new MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$7(this, map));
/*     */ 
/*     */       
/* 150 */       object2 = map; }
/*     */     else
/* 152 */     { object2 = value; }
/*     */     
/*     */     return object2; } public MapBean clone() {
/* 155 */     return MapBean$.MODULE$.toMutableMap(MapLike.class.clone((MapLike)this));
/*     */   }
/*     */   
/*     */   public final class MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$1 extends AbstractFunction1<Object, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final ArrayList list$1;
/*     */     
/*     */     public MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$1(MapBean $outer, ArrayList list$1) {}
/*     */     
/*     */     public final boolean apply(Object e) {
/*     */       return this.list$1.add(this.$outer.com$nirvana$core$MapBean$$convertJava(e));
/*     */     }
/*     */   }
/*     */   
/*     */   public final class MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$2 extends AbstractFunction1<Object, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final ArrayList list$2;
/*     */     
/*     */     public MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$2(MapBean $outer, ArrayList list$2) {}
/*     */     
/*     */     public final boolean apply(Object e) {
/*     */       return this.list$2.add(this.$outer.com$nirvana$core$MapBean$$convertJava(e));
/*     */     }
/*     */   }
/*     */   
/*     */   public final class MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$3 extends AbstractFunction1<Object, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final HashSet set$1;
/*     */     
/*     */     public MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$3(MapBean $outer, HashSet set$1) {}
/*     */     
/*     */     public final boolean apply(Object e) {
/*     */       return this.set$1.add(this.$outer.com$nirvana$core$MapBean$$convertJava(e));
/*     */     }
/*     */   }
/*     */   
/*     */   public final class MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$4 extends AbstractFunction1<Tuple2<String, Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(Tuple2 check$ifrefutable$2) {
/*     */       boolean bool;
/*     */       Tuple2 tuple2 = check$ifrefutable$2;
/*     */       if (tuple2 != null) {
/*     */         bool = true;
/*     */       } else {
/*     */         bool = false;
/*     */       } 
/*     */       return bool;
/*     */     }
/*     */     
/*     */     public MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$4(MapBean $outer) {}
/*     */   }
/*     */   
/*     */   public final class MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$5 extends AbstractFunction1<Tuple2<String, Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final HashMap map$2;
/*     */     
/*     */     public final Object apply(Tuple2 x$4) {
/*     */       Tuple2 tuple2 = x$4;
/*     */       if (tuple2 != null) {
/*     */         String k = (String)tuple2._1();
/*     */         Object v = tuple2._2();
/*     */         return this.map$2.put(k, this.$outer.com$nirvana$core$MapBean$$convertJava(v));
/*     */       } 
/*     */       throw new MatchError(tuple2);
/*     */     }
/*     */     
/*     */     public MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$5(MapBean $outer, HashMap map$2) {}
/*     */   }
/*     */   
/*     */   public final class MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$6 extends AbstractFunction1<Tuple2<String, Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(Tuple2 check$ifrefutable$3) {
/*     */       boolean bool;
/*     */       Tuple2 tuple2 = check$ifrefutable$3;
/*     */       if (tuple2 != null) {
/*     */         bool = true;
/*     */       } else {
/*     */         bool = false;
/*     */       } 
/*     */       return bool;
/*     */     }
/*     */     
/*     */     public MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$6(MapBean $outer) {}
/*     */   }
/*     */   
/*     */   public final class MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$7 extends AbstractFunction1<Tuple2<String, Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final HashMap map$3;
/*     */     
/*     */     public final Object apply(Tuple2 x$5) {
/*     */       Tuple2 tuple2 = x$5;
/*     */       if (tuple2 != null) {
/*     */         String k = (String)tuple2._1();
/*     */         Object v = tuple2._2();
/*     */         return this.map$3.put(k, this.$outer.com$nirvana$core$MapBean$$convertJava(v));
/*     */       } 
/*     */       throw new MatchError(tuple2);
/*     */     }
/*     */     
/*     */     public MapBean$$anonfun$com$nirvana$core$MapBean$$convertJava$7(MapBean $outer, HashMap map$3) {}
/*     */   }
/*     */   
/*     */   public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
/*     */     MapBean$.MODULE$.warn(paramFunction0, paramFunction01);
/*     */   }
/*     */   
/*     */   public static void warn(Function0<Object> paramFunction0) {
/*     */     MapBean$.MODULE$.warn(paramFunction0);
/*     */   }
/*     */   
/*     */   public static boolean isWarnEnabled() {
/*     */     return MapBean$.MODULE$.isWarnEnabled();
/*     */   }
/*     */   
/*     */   public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
/*     */     MapBean$.MODULE$.info(paramFunction0, paramFunction01);
/*     */   }
/*     */   
/*     */   public static void info(Function0<Object> paramFunction0) {
/*     */     MapBean$.MODULE$.info(paramFunction0);
/*     */   }
/*     */   
/*     */   public static boolean isInfoEnabled() {
/*     */     return MapBean$.MODULE$.isInfoEnabled();
/*     */   }
/*     */   
/*     */   public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
/*     */     MapBean$.MODULE$.error(paramFunction0, paramFunction01);
/*     */   }
/*     */   
/*     */   public static void error(Function0<Object> paramFunction0) {
/*     */     MapBean$.MODULE$.error(paramFunction0);
/*     */   }
/*     */   
/*     */   public static boolean isErrorEnabled() {
/*     */     return MapBean$.MODULE$.isErrorEnabled();
/*     */   }
/*     */   
/*     */   public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
/*     */     MapBean$.MODULE$.debug(paramFunction0, paramFunction01);
/*     */   }
/*     */   
/*     */   public static void debug(Function0<Object> paramFunction0) {
/*     */     MapBean$.MODULE$.debug(paramFunction0);
/*     */   }
/*     */   
/*     */   public static boolean isDebugEnabled() {
/*     */     return MapBean$.MODULE$.isDebugEnabled();
/*     */   }
/*     */   
/*     */   public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
/*     */     MapBean$.MODULE$.trace(paramFunction0, paramFunction01);
/*     */   }
/*     */   
/*     */   public static void trace(Function0<Object> paramFunction0) {
/*     */     MapBean$.MODULE$.trace(paramFunction0);
/*     */   }
/*     */   
/*     */   public static boolean isTraceEnabled() {
/*     */     return MapBean$.MODULE$.isTraceEnabled();
/*     */   }
/*     */   
/*     */   public static String loggerName() {
/*     */     return MapBean$.MODULE$.loggerName();
/*     */   }
/*     */   
/*     */   public static Logger logger() {
/*     */     return MapBean$.MODULE$.logger();
/*     */   }
/*     */   
/*     */   public static void main(String[] paramArrayOfString) {
/*     */     MapBean$.MODULE$.main(paramArrayOfString);
/*     */   }
/*     */   
/*     */   public static MapBean toMutableMap(Object paramObject) {
/*     */     return MapBean$.MODULE$.toMutableMap(paramObject);
/*     */   }
/*     */   
/*     */   public static ObjectMapper objectMapper() {
/*     */     return MapBean$.MODULE$.objectMapper();
/*     */   }
/*     */   
/*     */   public static MapBean EMPTY() {
/*     */     return MapBean$.MODULE$.EMPTY();
/*     */   }
/*     */ }


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\core\MapBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */