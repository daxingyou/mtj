package com.nirvana.util;

import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001y:Q!\001\002\t\002%\t\021bU5h]V#\030\016\\:\013\005\r!\021\001B;uS2T!!\002\004\002\0179L'O^1oC*\tq!A\002d_6\034\001\001\005\002\013\0275\t!AB\003\r\005!\005QBA\005TS\036tW\013^5mgN\0211B\004\t\003\037Ii\021\001\005\006\002#\005)1oY1mC&\0211\003\005\002\007\003:L(+\0324\t\013UYA\021\001\f\002\rqJg.\033;?)\005I\001b\002\r\f\005\004%)!G\001\016'\026\023f+\022*`'\026\033%+\022+\026\003iy\021aG\021\0029\005\001\003\013[<[OZ\004Tg[)2'V#6\016\037+c!\036,\030k\023=4mfS8\017N'O\021\031q2\002)A\0075\005q1+\022*W\013J{6+R\"S\013R\003\003b\002\021\f\005\004%)!I\001\016\0072KUI\024+`'\026\033%+\022+\026\003\tz\021aI\021\002I\005\001#\016[<N\017Z\004Dg[\0337'V\0135\016\037+c!\036d\027k\023=9mfS8\017\016$S\021\03113\002)A\007E\005q1\tT%F\035R{6+R\"S\013R\003\003\"\002\025\f\t\003I\023\001C7bW\026\034\026n\0328\025\005)\n\004CA\026/\035\tyA&\003\002.!\0051\001K]3eK\032L!a\f\031\003\rM#(/\0338h\025\ti\003\003C\0033O\001\0071'\001\005v]&DH+[7f!\tyA'\003\0026!\t!Aj\0348h\021\025A3\002\"\0018)\tQ\003\bC\003:m\001\007!&A\002tiJDQaO\006\005\002q\na\"\\1lK\016c\027.\0328u'&<g\016\006\002+{!)\021H\017a\001U\001")
public final class SignUtils {
  public static String makeClientSign(String paramString) {
    return SignUtils$.MODULE$.makeClientSign(paramString);
  }
  
  public static String makeSign(String paramString) {
    return SignUtils$.MODULE$.makeSign(paramString);
  }
  
  public static String makeSign(long paramLong) {
    return SignUtils$.MODULE$.makeSign(paramLong);
  }
  
  public static String CLIENT_SECRET() {
    return SignUtils$.MODULE$.CLIENT_SECRET();
  }
  
  public static String SERVER_SECRET() {
    return SignUtils$.MODULE$.SERVER_SECRET();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvan\\util\SignUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */