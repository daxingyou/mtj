package com.nirvana.net;

import org.msgpack.type.Value;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001m;Q!\001\002\t\002%\t1\"T3tg\006<W\rU1dW*\0211\001B\001\004]\026$(BA\003\007\003\035q\027N\035<b]\006T\021aB\001\004G>l7\001\001\t\003\025-i\021A\001\004\006\031\tA\t!\004\002\f\033\026\0348/Y4f!\006\0347n\005\002\f\035A\021qBE\007\002!)\t\021#A\003tG\006d\027-\003\002\024!\t1\021I\\=SK\032DQ!F\006\005\002Y\ta\001P5oSRtD#A\005\t\013aYA\021A\r\002\tI,\027\r\032\013\0035u\001\"aD\016\n\005q\001\"aA!os\")ad\006a\0015\005!A-\031;b\021\025\0013\002\"\001\"\003\0259(/\033;f)\t\021\003\006E\002\020G\025J!\001\n\t\003\013\005\023(/Y=\021\005=1\023BA\024\021\005\021\021\025\020^3\t\013%z\002\031\001\016\002\007=\024'\016C\003,\027\021\005A&A\004d_:4XM\035;\025\007ii\023\bC\003/U\001\007q&A\003wC2,X\r\005\0021o5\t\021G\003\0023g\005!A/\0379f\025\t!T'A\004ng\036\004\030mY6\013\003Y\n1a\034:h\023\tA\024GA\003WC2,X\rC\004;UA\005\t\031A\036\002\017%\034()\037;fgB\021q\002P\005\003{A\021qAQ8pY\026\fg\016C\003@\027\021\005\001)\001\003nC&tGCA!E!\ty!)\003\002D!\t!QK\\5u\021\025)e\b1\001G\003\021\t'oZ:\021\007=\031s\t\005\002I\027:\021q\"S\005\003\025B\ta\001\025:fI\0264\027B\001'N\005\031\031FO]5oO*\021!\n\005\005\b\037.\t\n\021\"\001Q\003E\031wN\034<feR$C-\0324bk2$HEM\013\002#*\0221HU\026\002'B\021A+W\007\002+*\021akV\001\nk:\034\007.Z2lK\022T!\001\027\t\002\025\005tgn\034;bi&|g.\003\002[+\n\tRO\\2iK\016\\W\r\032,be&\fgnY3")
public final class MessagePack {
  public static boolean convert$default$2() {
    return MessagePack$.MODULE$.convert$default$2();
  }
  
  public static void main(String[] paramArrayOfString) {
    MessagePack$.MODULE$.main(paramArrayOfString);
  }
  
  public static Object convert(Value paramValue, boolean paramBoolean) {
    return MessagePack$.MODULE$.convert(paramValue, paramBoolean);
  }
  
  public static byte[] write(Object paramObject) {
    return MessagePack$.MODULE$.write(paramObject);
  }
  
  public static Object read(Object paramObject) {
    return MessagePack$.MODULE$.read(paramObject);
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\net\MessagePack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */