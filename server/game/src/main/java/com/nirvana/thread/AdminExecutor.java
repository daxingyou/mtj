package com.nirvana.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import scala.Function0;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001u:Q!\001\002\t\002%\tQ\"\0213nS:,\0050Z2vi>\024(BA\002\005\003\031!\bN]3bI*\021QAB\001\b]&\024h/\0318b\025\0059\021aA2p[\016\001\001C\001\006\f\033\005\021a!\002\007\003\021\003i!!D!e[&tW\t_3dkR|'o\005\002\f\035A\021qBE\007\002!)\t\021#A\003tG\006d\027-\003\002\024!\t1\021I\\=SK\032DQ!F\006\005\002Y\ta\001P5oSRtD#A\005\t\017aY!\031!C\0013\005AQ\r_3dkR|'/F\001\033!\tY\"%D\001\035\025\tib$\001\006d_:\034WO\035:f]RT!a\b\021\002\tU$\030\016\034\006\002C\005!!.\031<b\023\t\031CDA\bFq\026\034W\017^8s'\026\024h/[2f\021\031)3\002)A\0055\005IQ\r_3dkR|'\017\t\005\006O-!\t\001K\001\007gV\024W.\033;\026\005%zCC\001\0269!\rY2&L\005\003Yq\021aAR;ukJ,\007C\001\0300\031\001!Q\001\r\024C\002E\022\021\001V\t\003eU\002\"aD\032\n\005Q\002\"a\002(pi\"Lgn\032\t\003\037YJ!a\016\t\003\007\005s\027\020\003\004:M\021\005\rAO\001\b_V$8/\0333f!\ry1(L\005\003yA\021\001\002\0202z]\006lWM\020")
public final class AdminExecutor {
  public static <T> Future<T> submit(Function0<T> paramFunction0) {
    return AdminExecutor$.MODULE$.submit(paramFunction0);
  }
  
  public static ExecutorService executor() {
    return AdminExecutor$.MODULE$.executor();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\thread\AdminExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */