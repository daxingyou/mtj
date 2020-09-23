package com.nirvana.net;

import grizzled.slf4j.Logger;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import java.net.SocketAddress;
import java.util.concurrent.atomic.AtomicLong;
import scala.Function0;
import scala.collection.immutable.Set;
import scala.reflect.ScalaSignature;

@Sharable
@ScalaSignature(bytes = "\006\001\005\035r!B\001\003\021\003I\021AD'fgN\fw-Z#oG>$WM\035\006\003\007\021\t1A\\3u\025\t)a!A\004oSJ4\030M\\1\013\003\035\t1aY8n\007\001\001\"AC\006\016\003\t1Q\001\004\002\t\0025\021a\"T3tg\006<W-\0228d_\022,'o\005\003\f\035\001B\003cA\b\03155\t\001C\003\002\022%\005)1m\0343fG*\0211\003F\001\bQ\006tG\r\\3s\025\t)b#A\003oKR$\030PC\001\030\003\tIw.\003\002\032!\t!R*Z:tC\036,Gk\034\"zi\026,enY8eKJ\004\"a\007\020\016\003qQ\021!H\001\006g\016\fG.Y\005\003?q\021a!\0218z%\0264\007CA\021'\033\005\021#BA\022%\003\025\031HN\032\033k\025\005)\023\001C4sSjTH.\0323\n\005\035\022#a\002'pO\036Lgn\032\t\003S1j\021A\013\006\003W\021\tAaY8sK&\021QF\013\002\t'R\fGOQ3b]\")qf\003C\001a\0051A(\0338jiz\"\022!\003\005\be-\021\r\021\"\0024\003A1\027\016\034;fe\016{W.\\1oIN+G/F\0015!\r)$\bP\007\002m)\021q\007O\001\nS6lW\017^1cY\026T!!\017\017\002\025\r|G\016\\3di&|g.\003\002<m\t\0311+\032;\021\005mi\024B\001 \035\005\rIe\016\036\005\007\001.\001\013Q\002\033\002#\031LG\016^3s\007>lW.\0318e'\026$\b\005C\004C\027\t\007I\021A\"\002\tML'0Z\013\002\tB\021QIT\007\002\r*\021q\tS\001\007CR|W.[2\013\005%S\025AC2p]\016,(O]3oi*\0211\nT\001\005kRLGNC\001N\003\021Q\027M^1\n\005=3%AC!u_6L7\rT8oO\"1\021k\003Q\001\n\021\013Qa]5{K\002BqaU\006A\002\023\005A+A\002o_^,\022!\026\t\0037YK!a\026\017\003\t1{gn\032\005\b3.\001\r\021\"\001[\003\035qwn^0%KF$\"a\0270\021\005ma\026BA/\035\005\021)f.\033;\t\017}C\026\021!a\001+\006\031\001\020J\031\t\r\005\\\001\025)\003V\003\021qwn\036\021\t\013\r\\A\021\0133\002\r\025t7m\0343f)\021YV-\\8\t\013\031\024\007\031A4\002\007\r$\b\020\005\002iW6\t\021N\003\002k)\00591\r[1o]\026d\027B\0017j\005U\031\005.\0318oK2D\025M\0343mKJ\034uN\034;fqRDQA\0342A\002i\t1!\\:h\021\025\001(\r1\001r\003\ryW\017\036\t\003eVl\021a\035\006\003iR\taAY;gM\026\024\030B\001<t\005\035\021\025\020^3Ck\032DQ\001_\006\005Be\fqaZ3u'R\fG/F\001{!\tYhP\004\002\034y&\021Q\020H\001\007!J,G-\0324\n\007}\f\tA\001\004TiJLgn\032\006\003{rA3aCA\003!\021\t9!a\b\017\t\005%\0211\004\b\005\003\027\tIB\004\003\002\016\005]a\002BA\b\003+i!!!\005\013\007\005M\001\"\001\004=e>|GOP\005\002/%\021QCF\005\003URI1!!\bj\0039\031\005.\0318oK2D\025M\0343mKJLA!!\t\002$\tA1\013[1sC\ndWMC\002\002\036%D3\001AA\003\001")
public final class MessageEncoder {
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MessageEncoder$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    MessageEncoder$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return MessageEncoder$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MessageEncoder$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    MessageEncoder$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return MessageEncoder$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MessageEncoder$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    MessageEncoder$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return MessageEncoder$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MessageEncoder$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    MessageEncoder$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return MessageEncoder$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    MessageEncoder$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    MessageEncoder$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return MessageEncoder$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return MessageEncoder$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return MessageEncoder$.MODULE$.logger();
  }
  
  public static String getStat() {
    return MessageEncoder$.MODULE$.getStat();
  }
  
  public static void now_$eq(long paramLong) {
    MessageEncoder$.MODULE$.now_$eq(paramLong);
  }
  
  public static long now() {
    return MessageEncoder$.MODULE$.now();
  }
  
  public static AtomicLong size() {
    return MessageEncoder$.MODULE$.size();
  }
  
  public static Set<Object> filterCommandSet() {
    return MessageEncoder$.MODULE$.filterCommandSet();
  }
  
  public static void write(ChannelHandlerContext paramChannelHandlerContext, Object paramObject, ChannelPromise paramChannelPromise) throws Exception {
    MessageEncoder$.MODULE$.write(paramChannelHandlerContext, paramObject, paramChannelPromise);
  }
  
  public static boolean acceptOutboundMessage(Object paramObject) throws Exception {
    return MessageEncoder$.MODULE$.acceptOutboundMessage(paramObject);
  }
  
  public static void flush(ChannelHandlerContext paramChannelHandlerContext) throws Exception {
    MessageEncoder$.MODULE$.flush(paramChannelHandlerContext);
  }
  
  public static void read(ChannelHandlerContext paramChannelHandlerContext) throws Exception {
    MessageEncoder$.MODULE$.read(paramChannelHandlerContext);
  }
  
  public static void deregister(ChannelHandlerContext paramChannelHandlerContext, ChannelPromise paramChannelPromise) throws Exception {
    MessageEncoder$.MODULE$.deregister(paramChannelHandlerContext, paramChannelPromise);
  }
  
  public static void close(ChannelHandlerContext paramChannelHandlerContext, ChannelPromise paramChannelPromise) throws Exception {
    MessageEncoder$.MODULE$.close(paramChannelHandlerContext, paramChannelPromise);
  }
  
  public static void disconnect(ChannelHandlerContext paramChannelHandlerContext, ChannelPromise paramChannelPromise) throws Exception {
    MessageEncoder$.MODULE$.disconnect(paramChannelHandlerContext, paramChannelPromise);
  }
  
  public static void connect(ChannelHandlerContext paramChannelHandlerContext, SocketAddress paramSocketAddress1, SocketAddress paramSocketAddress2, ChannelPromise paramChannelPromise) throws Exception {
    MessageEncoder$.MODULE$.connect(paramChannelHandlerContext, paramSocketAddress1, paramSocketAddress2, paramChannelPromise);
  }
  
  public static void bind(ChannelHandlerContext paramChannelHandlerContext, SocketAddress paramSocketAddress, ChannelPromise paramChannelPromise) throws Exception {
    MessageEncoder$.MODULE$.bind(paramChannelHandlerContext, paramSocketAddress, paramChannelPromise);
  }
  
  public static void exceptionCaught(ChannelHandlerContext paramChannelHandlerContext, Throwable paramThrowable) throws Exception {
    MessageEncoder$.MODULE$.exceptionCaught(paramChannelHandlerContext, paramThrowable);
  }
  
  public static void handlerRemoved(ChannelHandlerContext paramChannelHandlerContext) throws Exception {
    MessageEncoder$.MODULE$.handlerRemoved(paramChannelHandlerContext);
  }
  
  public static void handlerAdded(ChannelHandlerContext paramChannelHandlerContext) throws Exception {
    MessageEncoder$.MODULE$.handlerAdded(paramChannelHandlerContext);
  }
  
  public static boolean isSharable() {
    return MessageEncoder$.MODULE$.isSharable();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\net\MessageEncoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */