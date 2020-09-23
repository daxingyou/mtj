package com.nirvana.cache;

import com.nirvana.core.MapBean;
import org.ehcache.Cache;
import org.ehcache.CacheManager;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001A<Q!\001\002\t\002%\t1\"T1ti\026\0248)Y2iK*\0211\001B\001\006G\006\034\007.\032\006\003\013\031\tqA\\5sm\006t\027MC\001\b\003\r\031w.\\\002\001!\tQ1\"D\001\003\r\025a!\001#\001\016\005-i\025m\035;fe\016\0137\r[3\024\005-q\001CA\b\023\033\005\001\"\"A\t\002\013M\034\027\r\\1\n\005M\001\"AB!osJ+g\rC\003\026\027\021\005a#\001\004=S:LGO\020\013\002\023!I\001d\003a\001\002\004%\t!G\001\rG\006\034\007.Z'b]\006<WM]\013\0025A\0211\004I\007\0029)\021QDH\001\bK\"\034\027m\0315f\025\005y\022aA8sO&\021\021\005\b\002\r\007\006\034\007.Z'b]\006<WM\035\005\nG-\001\r\0211A\005\002\021\n\001cY1dQ\026l\025M\\1hKJ|F%Z9\025\005\025B\003CA\b'\023\t9\003C\001\003V]&$\bbB\025#\003\003\005\rAG\001\004q\022\n\004BB\026\fA\003&!$A\007dC\016DW-T1oC\036,'\017\t\005\n[-\001\r\0211A\005\0029\n\021\"^:fe\016\0137\r[3\026\003=\002Ba\007\0313s%\021\021\007\b\002\006\007\006\034\007.\032\t\003gYr!a\004\033\n\005U\002\022A\002)sK\022,g-\003\0028q\t11\013\036:j]\036T!!\016\t\021\005ijT\"A\036\013\005q\"\021\001B2pe\026L!AP\036\003\0175\013\007OQ3b]\"I\001i\003a\001\002\004%\t!Q\001\016kN,'oQ1dQ\026|F%Z9\025\005\025\022\005bB\025@\003\003\005\ra\f\005\007\t.\001\013\025B\030\002\025U\034XM]\"bG\",\007\005C\005G\027\001\007\t\031!C\001\017\006qQo]3s)>\\WM\\\"bG\",W#\001%\021\tm\001$G\r\005\n\025.\001\r\0211A\005\002-\013!#^:feR{7.\0328DC\016DWm\030\023fcR\021Q\005\024\005\bS%\013\t\0211\001I\021\031q5\002)Q\005\021\006yQo]3s)>\\WM\\\"bG\",\007\005C\005Q\027\001\007\t\031!C\001\017\006qAo\\6f]V\033XM]\"bG\",\007\"\003*\f\001\004\005\r\021\"\001T\003I!xn[3o+N,'oQ1dQ\026|F%Z9\025\005\025\"\006bB\025R\003\003\005\r\001\023\005\007-.\001\013\025\002%\002\037Q|7.\0328Vg\026\0248)Y2iK\002BQ\001W\006\005\002e\013A!\0338jiV\tQ\005C\003\\\027\021\005A,A\fhKR\034UM\034;feV\033XM\035\"z+N,'O\\1nKR\021\021(\030\005\006=j\003\rAM\001\tkN,'O\\1nK\")\001m\003C\001C\006\021r-\032;U_.,gNQ=Vg\026\024h.Y7f)\t\021$\rC\003_?\002\007!\007C\003e\027\021\005Q-\001\013hKR\034UM\034;feV\033XM\035\"z)>\\WM\034\013\003s\031DQaZ2A\002I\nQ\001^8lK:DQ![\006\005\002)\fA!\\1j]R\021Qe\033\005\006Y\"\004\r!\\\001\005CJ<7\017E\002\020]JJ!a\034\t\003\013\005\023(/Y=")
public final class MasterCache {
  public static void main(String[] paramArrayOfString) {
    MasterCache$.MODULE$.main(paramArrayOfString);
  }
  
  public static MapBean getCenterUserByToken(String paramString) {
    return MasterCache$.MODULE$.getCenterUserByToken(paramString);
  }
  
  public static String getTokenByUsername(String paramString) {
    return MasterCache$.MODULE$.getTokenByUsername(paramString);
  }
  
  public static MapBean getCenterUserByUsername(String paramString) {
    return MasterCache$.MODULE$.getCenterUserByUsername(paramString);
  }
  
  public static void init() {
    MasterCache$.MODULE$.init();
  }
  
  public static void tokenUserCache_$eq(Cache<String, String> paramCache) {
    MasterCache$.MODULE$.tokenUserCache_$eq(paramCache);
  }
  
  public static Cache<String, String> tokenUserCache() {
    return MasterCache$.MODULE$.tokenUserCache();
  }
  
  public static void userTokenCache_$eq(Cache<String, String> paramCache) {
    MasterCache$.MODULE$.userTokenCache_$eq(paramCache);
  }
  
  public static Cache<String, String> userTokenCache() {
    return MasterCache$.MODULE$.userTokenCache();
  }
  
  public static void userCache_$eq(Cache<String, MapBean> paramCache) {
    MasterCache$.MODULE$.userCache_$eq(paramCache);
  }
  
  public static Cache<String, MapBean> userCache() {
    return MasterCache$.MODULE$.userCache();
  }
  
  public static void cacheManager_$eq(CacheManager paramCacheManager) {
    MasterCache$.MODULE$.cacheManager_$eq(paramCacheManager);
  }
  
  public static CacheManager cacheManager() {
    return MasterCache$.MODULE$.cacheManager();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\cache\MasterCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */