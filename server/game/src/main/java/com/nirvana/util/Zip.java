package com.nirvana.util;

import grizzled.slf4j.Logger;
import scala.Function0;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\0019:Q!\001\002\t\002%\t1AW5q\025\t\031A!\001\003vi&d'BA\003\007\003\035q\027N\035<b]\006T\021aB\001\004G>l7\001\001\t\003\025-i\021A\001\004\006\031\tA\t!\004\002\0045&\0048cA\006\017)A\021qBE\007\002!)\t\021#A\003tG\006d\027-\003\002\024!\t1\021I\\=SK\032\004\"!\006\016\016\003YQ!a\006\r\002\013Mdg\r\0166\013\003e\t\001b\032:jujdW\rZ\005\0037Y\021q\001T8hO&tw\rC\003\036\027\021\005a$\001\004=S:LGO\020\013\002\023!)\001e\003C\001C\005A1m\\7qe\026\0348\017\006\002#QA\031qbI\023\n\005\021\002\"!B!se\006L\bCA\b'\023\t9\003C\001\003CsR,\007\"B\025 \001\004\021\023!\0022zi\026\034\b\"B\026\f\t\003a\023AC;o\007>l\007O]3tgR\021!%\f\005\006S)\002\rA\t")
public final class Zip {
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    Zip$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    Zip$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return Zip$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    Zip$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    Zip$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return Zip$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    Zip$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    Zip$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return Zip$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    Zip$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    Zip$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return Zip$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    Zip$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    Zip$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return Zip$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return Zip$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return Zip$.MODULE$.logger();
  }
  
  public static byte[] unCompress(byte[] paramArrayOfbyte) {
    return Zip$.MODULE$.unCompress(paramArrayOfbyte);
  }
  
  public static byte[] compress(byte[] paramArrayOfbyte) {
    return Zip$.MODULE$.compress(paramArrayOfbyte);
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvan\\util\Zip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */