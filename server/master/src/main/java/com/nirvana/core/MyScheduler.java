package com.nirvana.core;

import java.util.concurrent.TimeUnit;
import scala.Function0;
import scala.reflect.ScalaSignature;
import scala.runtime.BoxedUnit;

@ScalaSignature(bytes = "\006\001\t;Q!\001\002\t\002%\t1\"T=TG\",G-\0367fe*\0211\001B\001\005G>\024XM\003\002\006\r\0059a.\033:wC:\f'\"A\004\002\007\r|Wn\001\001\021\005)YQ\"\001\002\007\0131\021\001\022A\007\003\0275K8k\0315fIVdWM]\n\003\0279\001\"a\004\n\016\003AQ\021!E\001\006g\016\fG.Y\005\003'A\021a!\0218z%\0264\007\"B\013\f\t\0031\022A\002\037j]&$h\bF\001\n\021\035A2B1A\005\ne\t\001\"\032=fGV$xN]\013\0025A\0211DI\007\0029)\021QDH\001\013G>t7-\036:sK:$(BA\020!\003\021)H/\0337\013\003\005\nAA[1wC&\0211\005\b\002\031'\016DW\rZ;mK\022,\0050Z2vi>\0248+\032:wS\016,\007BB\023\fA\003%!$A\005fq\026\034W\017^8sA!)qe\003C\001Q\005A1o\0315fIVdW\r\006\003*YE2\004CA\b+\023\tY\003C\001\003V]&$\bBB\027'\t\003\007a&\001\003gk:\034\007cA\b0S%\021\001\007\005\002\ty\tLh.Y7f}!)!G\na\001g\005)A-\0327bsB\021q\002N\005\003kA\021A\001T8oO\")qG\na\001q\005!QO\\5u!\tY\022(\003\002;9\tAA+[7f+:LG\017C\003=\027\021\005Q(A\ntG\",G-\0367f\003R4\025\016_3e%\006$X\r\006\003*}}\n\005BB\027<\t\003\007a\006C\003Aw\001\0071'\001\004qKJLw\016\032\005\006om\002\r\001\017")
public final class MyScheduler {
  public static void scheduleAtFixedRate(Function0<BoxedUnit> paramFunction0, long paramLong, TimeUnit paramTimeUnit) {
    MyScheduler$.MODULE$.scheduleAtFixedRate(paramFunction0, paramLong, paramTimeUnit);
  }
  
  public static void schedule(Function0<BoxedUnit> paramFunction0, long paramLong, TimeUnit paramTimeUnit) {
    MyScheduler$.MODULE$.schedule(paramFunction0, paramLong, paramTimeUnit);
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\core\MyScheduler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */