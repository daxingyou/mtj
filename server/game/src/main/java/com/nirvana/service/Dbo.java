package com.nirvana.service;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nirvana.core.MapBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.support.TransactionTemplate;
import scala.collection.Seq;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005\ru!B\001\003\021\003I\021a\001#c_*\0211\001B\001\bg\026\024h/[2f\025\t)a!A\004oSJ4\030M\\1\013\003\035\t1aY8n\007\001\001\"AC\006\016\003\t1Q\001\004\002\t\0025\0211\001\0222p'\tYa\002\005\002\020%5\t\001CC\001\022\003\025\0318-\0317b\023\t\031\002C\001\004B]f\024VM\032\005\006+-!\tAF\001\007y%t\027\016\036 \025\003%Aq\001G\006C\002\023\005\021$\001\006eCR\f7k\\;sG\026,\022A\007\t\0037\tj\021\001\b\006\003;y\tAaY\032qa)\021q\004I\001\003mJR!!\t\004\002\0175\034\007.\0318hK&\0211\005\b\002\026\007>l'm\034)p_2,G\rR1uCN{WO]2f\021\031)3\002)A\0055\005YA-\031;b'>,(oY3!\021\03593B1A\005\002!\nAB\0333cGR+W\016\0357bi\026,\022!\013\t\003UMj\021a\013\006\003Y5\nAaY8sK*\021afL\001\005U\022\0247M\003\0021c\005y1\017\035:j]\0364'/Y7fo>\0248NC\0013\003\ry'oZ\005\003i-\022AB\0233cGR+W\016\0357bi\026DaAN\006!\002\023I\023!\0046eE\016$V-\0349mCR,\007\005C\0049\027\t\007I\021A\035\002'Q\024\030M\\:bGRLwN\034+f[Bd\027\r^3\026\003i\002\"a\017!\016\003qR!!\020 \002\017M,\b\017]8si*\021qhL\001\fiJ\fgn]1di&|g.\003\002By\t\031BK]1og\006\034G/[8o)\026l\007\017\\1uK\"11i\003Q\001\ni\nA\003\036:b]N\f7\r^5p]R+W\016\0357bi\026\004\003bB#\f\005\004%\tAR\001\027G>dW/\0348NCB\024U-\0318S_^l\025\r\0359feV\tqIE\002I\031R3A!\023&\001\017\naAH]3gS:,W.\0328u}!11j\003Q\001\n\035\013qcY8mk6tW*\0319CK\006t'k\\<NCB\004XM\035\021\021\0055\023V\"\001(\013\005=\003\026\001\0027b]\036T\021!U\001\005U\0064\030-\003\002T\035\n1qJ\0316fGR\0042AK+X\023\t16FA\005S_^l\025\r\0359feB\021\001LW\007\0023*\021A\006B\005\0037f\023q!T1q\005\026\fg\016C\003^\027\021\005a,\001\nj]N,'\017^!oIJ+G/\036:o\027\026LHcA0cWB\021q\002Y\005\003CB\0211!\0238u\021\025\031G\f1\001e\003\r\031\030\017\034\t\003K\"t!a\0044\n\005\035\004\022A\002)sK\022,g-\003\002jU\n11\013\036:j]\036T!a\032\t\t\0131d\006\031A7\002\t\005\024xm\035\t\004\0379\004\030BA8\021\005)a$/\0329fCR,GM\020\t\003\037EL!A\035\t\003\007\005s\027\020C\003u\027\021\005Q/A\006rk\026\024\030PR8s\023:$HcA0wo\")1m\035a\001I\")An\035a\001[\")\021p\003C\001u\0061Q\017\0353bi\026$\"aX>\t\013\rD\b\031\0013\t\013e\\A\021A?\025\007}sx\020C\003dy\002\007A\rC\003my\002\007Q\016C\004\002\004-!\t!!\002\002\031E,XM]=G_Jd\025n\035;\026\t\005\035\0211\004\013\t\003\023\t9#!\013\0024A1\0211BA\t\003/q1aDA\007\023\r\ty\001E\001\ba\006\0347.Y4f\023\021\t\031\"!\006\003\t1K7\017\036\006\004\003\037\001\002\003BA\r\0037a\001\001\002\005\002\036\005\005!\031AA\020\005\005!\026cAA\021aB\031q\"a\t\n\007\005\025\002CA\004O_RD\027N\\4\t\r\r\f\t\0011\001e\021!\tY#!\001A\002\0055\022\001\004:fcVL'/\0323UsB,\007#B3\0020\005]\021bAA\031U\n)1\t\\1tg\"1A.!\001A\0025Dq!a\016\f\t\003\tI$A\brk\026\024\030PR8s\033\006\004()Z1o)\0259\0261HA\037\021\031\031\027Q\007a\001I\"1A.!\016A\0025Dq!!\021\f\t\003\t\031%\001\brk\026\024\030PR8s'R\024\030N\\4\025\013\021\f)%a\022\t\r\r\fy\0041\001e\021\031a\027q\ba\001[\"9\0211A\006\005\002\005-CCBA'\003\037\n\t\006E\003\002\f\005Eq\013\003\004d\003\023\002\r\001\032\005\007Y\006%\003\031A7\t\017\005U3\002\"\001\002X\005YQ\017\0353bi\026\024\025\r^2i)\031\tI&a\030\002bA\031q\"a\027\n\007\005u\003C\001\003V]&$\bBB2\002T\001\007A\r\003\005\002d\005M\003\031AA3\003\035\t'o\032'jgR\004b!a\032\002\022\005Md\002BA5\003\033qA!a\033\002r5\021\021Q\016\006\004\003_B\021A\002\037s_>$h(C\001\022!\021y\021Q\0179\n\007\005]\004CA\003BeJ\f\027\020C\004\002|-!\t!! \002\t5\f\027N\034\013\005\0033\ny\bC\004m\003s\002\r!!!\021\t=\t)\b\032")
public final class Dbo {
  public static void main(String[] paramArrayOfString) {
    Dbo$.MODULE$.main(paramArrayOfString);
  }
  
  public static void updateBatch(String paramString, List<Object[]> paramList) {
    Dbo$.MODULE$.updateBatch(paramString, paramList);
  }
  
  public static List<MapBean> queryForList(String paramString, Seq<Object> paramSeq) {
    return Dbo$.MODULE$.queryForList(paramString, paramSeq);
  }
  
  public static String queryForString(String paramString, Seq<Object> paramSeq) {
    return Dbo$.MODULE$.queryForString(paramString, paramSeq);
  }
  
  public static MapBean queryForMapBean(String paramString, Seq<Object> paramSeq) {
    return Dbo$.MODULE$.queryForMapBean(paramString, paramSeq);
  }
  
  public static <T> List<T> queryForList(String paramString, Class<T> paramClass, Seq<Object> paramSeq) {
    return Dbo$.MODULE$.queryForList(paramString, paramClass, paramSeq);
  }
  
  public static int update(String paramString, Seq<Object> paramSeq) {
    return Dbo$.MODULE$.update(paramString, paramSeq);
  }
  
  public static int update(String paramString) {
    return Dbo$.MODULE$.update(paramString);
  }
  
  public static int queryForInt(String paramString, Seq<Object> paramSeq) {
    return Dbo$.MODULE$.queryForInt(paramString, paramSeq);
  }
  
  public static int insertAndReturnKey(String paramString, Seq<Object> paramSeq) {
    return Dbo$.MODULE$.insertAndReturnKey(paramString, paramSeq);
  }
  
  public static Object columnMapBeanRowMapper() {
    return Dbo$.MODULE$.columnMapBeanRowMapper();
  }
  
  public static TransactionTemplate transactionTemplate() {
    return Dbo$.MODULE$.transactionTemplate();
  }
  
  public static JdbcTemplate jdbcTemplate() {
    return Dbo$.MODULE$.jdbcTemplate();
  }
  
  public static ComboPooledDataSource dataSource() {
    return Dbo$.MODULE$.dataSource();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\Dbo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */