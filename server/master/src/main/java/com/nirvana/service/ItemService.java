package com.nirvana.service;

import com.nirvana.bean.Item;
import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005\035u!B\001\003\021\003I\021aC%uK6\034VM\035<jG\026T!a\001\003\002\017M,'O^5dK*\021QAB\001\b]&\024h/\0318b\025\0059\021aA2p[\016\001\001C\001\006\f\033\005\021a!\002\007\003\021\003i!aC%uK6\034VM\035<jG\026\034\"a\003\b\021\005)y\021B\001\t\003\005=\t%m\035;sC\016$8+\032:wS\016,\007\"\002\n\f\t\003\031\022A\002\037j]&$h\bF\001\n\021\025)2\002\"\001\027\0035)\b\017Z1uK&#X-\\%eqR\031q#\b\024\021\005aYR\"A\r\013\003i\tQa]2bY\006L!\001H\r\003\007%sG\017C\003\037)\001\007q$\001\004ji\026l\027\n\032\t\003A\rr!\001G\021\n\005\tJ\022A\002)sK\022,g-\003\002%K\t11\013\036:j]\036T!AI\r\t\013\035\"\002\031A\f\002\007%$\007\020C\003*\027\021\005!&\001\tva\022\fG/Z%uK6\fUn\\;oiR\031qc\013\027\t\013yA\003\031A\020\t\0135B\003\031A\f\002\r\005lw.\0368u\021\025y3\002\"\0011\003Y)\b\017Z1uK&#X-\\!n_VtG/\0218e\023\022DH\003B\f2eMBQA\b\030A\002}AQ!\f\030A\002]AQa\n\030A\002]AQ!N\006\005\002Y\na\"\0369eCR,\027\n^3n\t\006$\030\rF\002\030oaBQA\b\033A\002}AQ!\017\033A\002}\tA\001Z1uC\")1h\003C\001y\005QQ\017\0353bi\026LE/Z7\025\013]id\b\021\"\t\013yQ\004\031A\020\t\013}R\004\031A\020\002\025Q|\007k\\:ji&|g\016C\003Bu\001\007q#\001\005u_N#\030\r^;t\021\025\031%\b1\001\030\003\025!x.\0233y\021\025Y4\002\"\001F)\t1\025\n\005\002\031\017&\021\001*\007\002\005+:LG\017C\003K\t\002\0071*\001\003ji\026l\007C\001'P\033\005i%B\001(\005\003\021\021W-\0318\n\005Ak%\001B%uK6DQAU\006\005\002M\013!\002Z3mKR,\027\n^3n)\t9B\013C\003\037#\002\007q\004C\003W\027\021\005q+A\004bI\022LE/Z7\025\021]A\026lW/`A\006DQAH+A\002}AQAW+A\002}\t\001\002]8tSRLwN\034\005\0069V\003\raF\001\007gR\fG/^:\t\013y+\006\031A\f\002\tM\004\030\n\032\005\006[U\003\ra\006\005\006OU\003\ra\006\005\006sU\003\ra\b\005\006G.!\t\001Z\001\tO\026$\030\n^3ngR\031Q-\035:\021\007\031t7J\004\002hY:\021\001n[\007\002S*\021!\016C\001\007yI|w\016\036 \n\003iI!!\\\r\002\017A\f7m[1hK&\021q\016\035\002\005\031&\034HO\003\002n3!)!L\031a\001?!)AL\031a\001/!)Ao\003C\001k\0069q-\032;Ji\026lGCA&w\021\02598\0171\001 \003\tIG\rC\003z\027\021\005!0A\006eK2,G/Z%uK6\034HC\001$|\021\025a\b\0201\001~\003\035IG/Z7JIN\0042A\0328 \021\025I8\002\"\001\000)\0251\025\021AA\002\021\025Qf\0201\001 \021\025af\0201\001\030\021\035\t9a\003C\001\003\023\tAbZ3u\tJ,7o]%oM>$B!a\003\002\030A!\021QBA\n\033\t\tyAC\002\002\022\021\tAaY8sK&!\021QCA\b\005\035i\025\r\035\"fC:Dq!!\007\002\006\001\007q$\001\005qY\006LXM]%e\021\035\tib\003C\005\003?\t1bZ3u\023R,Wn\0259JIR9q#!\t\002$\005\025\002B\002.\002\034\001\007q\004\003\004]\0037\001\ra\006\005\007O\005m\001\031A\f\t\017\005%2\002\"\001\002,\005iq-\032;FcVL\007\017T3wK2$B!!\f\0022A)\021q\0068\002\f9\021\001\004\034\005\b\0033\t9\0031\001 \021\035\t)d\003C\001\003o\t\001cZ3u\013b$X)];ja2+g/\0327\025\t\0055\022\021\b\005\b\0033\t\031\0041\001 \021\035\tid\003C\001\003\t\001#\0369eCR,W)];ja2+g/\0327\025+\031\013\t%a\021\002F\005%\023QJA)\003+\nI&!\030\002b!9\021\021DA\036\001\004y\002BB\024\002<\001\007q\003C\004\002H\005m\002\031A\f\002\033M$(/\0328hi\"dUM^3m\021\035\tY%a\017A\002]\t1b\035;sK:<G\017[#ya\"9\021qJA\036\001\0049\022a\003:fM&tW\rT3wK2Dq!a\025\002<\001\007q$\001\003hK6\034\bbBA,\003w\001\raF\001\raJ|Wn\034;f\031\0264X\r\034\005\b\0037\nY\0041\001\030\0031\001(o\\7pi\026dUoY6z\021\035\ty&a\017A\002]\t\021\003\035:p[>$X\rT;dWfl\025\r_%e\021\035\t\031'a\017A\002]\t\021b];ji2+g/\0327\t\017\005\0354\002\"\001\002j\005aq-\032;FcVL\007/\021;ueR!\0211BA6\021\035\tI\"!\032A\002}Aq!a\034\f\t\003\t\t(A\bva\022\fG/Z#rk&\004\030\t\036;s)\0251\0251OA;\021\035\tI\"!\034A\002}Aq!a\036\002n\001\007q#A\007qe>lw\016^3QYV\034\030\n\032\005\b\003wZA\021AA?\003])\b\017Z1uK\026CH/R9vSBdUM^3m\t\006$\030\rF\004\030\003\n\031)!\"\t\017\005\005\025\021\020a\001?\005I\001\017\\1zKJ|\026\016\032\005\007s\005e\004\031A\020\t\r\035\nI\b1\001\030\001")
public final class ItemService {
  public static int updateExtEquipLevelData(String paramString1, String paramString2, int paramInt) {
    return ItemService$.MODULE$.updateExtEquipLevelData(paramString1, paramString2, paramInt);
  }
  
  public static void updateEquipAttr(String paramString, int paramInt) {
    ItemService$.MODULE$.updateEquipAttr(paramString, paramInt);
  }
  
  public static MapBean getEquipAttr(String paramString) {
    return ItemService$.MODULE$.getEquipAttr(paramString);
  }
  
  public static void updateEquipLevel(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString2, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    ItemService$.MODULE$.updateEquipLevel(paramString1, paramInt1, paramInt2, paramInt3, paramInt4, paramString2, paramInt5, paramInt6, paramInt7, paramInt8);
  }
  
  public static List<MapBean> getExtEquipLevel(String paramString) {
    return ItemService$.MODULE$.getExtEquipLevel(paramString);
  }
  
  public static List<MapBean> getEquipLevel(String paramString) {
    return ItemService$.MODULE$.getEquipLevel(paramString);
  }
  
  public static MapBean getDressInfo(String paramString) {
    return ItemService$.MODULE$.getDressInfo(paramString);
  }
  
  public static void deleteItems(String paramString, int paramInt) {
    ItemService$.MODULE$.deleteItems(paramString, paramInt);
  }
  
  public static void deleteItems(List<String> paramList) {
    ItemService$.MODULE$.deleteItems(paramList);
  }
  
  public static Item getItem(String paramString) {
    return ItemService$.MODULE$.getItem(paramString);
  }
  
  public static List<Item> getItems(String paramString, int paramInt) {
    return ItemService$.MODULE$.getItems(paramString, paramInt);
  }
  
  public static int addItem(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString3) {
    return ItemService$.MODULE$.addItem(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramString3);
  }
  
  public static int deleteItem(String paramString) {
    return ItemService$.MODULE$.deleteItem(paramString);
  }
  
  public static void updateItem(Item paramItem) {
    ItemService$.MODULE$.updateItem(paramItem);
  }
  
  public static int updateItem(String paramString1, String paramString2, int paramInt1, int paramInt2) {
    return ItemService$.MODULE$.updateItem(paramString1, paramString2, paramInt1, paramInt2);
  }
  
  public static int updateItemData(String paramString1, String paramString2) {
    return ItemService$.MODULE$.updateItemData(paramString1, paramString2);
  }
  
  public static int updateItemAmountAndIdx(String paramString, int paramInt1, int paramInt2) {
    return ItemService$.MODULE$.updateItemAmountAndIdx(paramString, paramInt1, paramInt2);
  }
  
  public static int updateItemAmount(String paramString, int paramInt) {
    return ItemService$.MODULE$.updateItemAmount(paramString, paramInt);
  }
  
  public static int updateItemIdx(String paramString, int paramInt) {
    return ItemService$.MODULE$.updateItemIdx(paramString, paramInt);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ItemService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    ItemService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return ItemService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ItemService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    ItemService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return ItemService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ItemService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    ItemService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return ItemService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ItemService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    ItemService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return ItemService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    ItemService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    ItemService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return ItemService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return ItemService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return ItemService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\ItemService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */