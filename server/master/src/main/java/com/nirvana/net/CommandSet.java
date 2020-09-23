package com.nirvana.net;

import java.lang.reflect.Method;
import scala.Tuple2;
import scala.collection.Seq;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001-;Q!\001\002\t\002%\t!bQ8n[\006tGmU3u\025\t\031A!A\002oKRT!!\002\004\002\0179L'O^1oC*\tq!A\002d_6\034\001\001\005\002\013\0275\t!AB\003\r\005!\005QB\001\006D_6l\027M\0343TKR\034\"a\003\b\021\005=\021R\"\001\t\013\003E\tQa]2bY\006L!a\005\t\003\r\005s\027PU3g\021\025)2\002\"\001\027\003\031a\024N\\5u}Q\t\021\002C\004\031\027\t\007I\021B\r\002\025\r|W.\\1oI6\013\007/F\001\033!\021Y\002EI\023\016\003qQ!!\b\020\002\0175,H/\0312mK*\021q\004E\001\013G>dG.Z2uS>t\027BA\021\035\005\ri\025\r\035\t\003\037\rJ!\001\n\t\003\007%sG\017\005\003\020M9A\023BA\024\021\005\031!V\017\0357feA\021\021\006M\007\002U)\0211\006L\001\be\0264G.Z2u\025\tic&\001\003mC:<'\"A\030\002\t)\fg/Y\005\003c)\022a!T3uQ>$\007BB\032\fA\003%!$A\006d_6l\027M\0343NCB\004\003\"B\033\f\t\0031\024a\004:fO&\034H/\032:D_6l\027M\0343\025\005]R\004CA\b9\023\tI\004C\001\003V]&$\b\"B\0365\001\004a\024AD2p[6\fg\016Z(cU\026\034Go\035\t\004\037ur\021B\001 \021\005)a$/\0329fCR,GM\020\005\006\001.!\t!Q\001\020SN\034\026p\035;f[\016{W.\\1oIR\021!)\022\t\003\037\rK!\001\022\t\003\017\t{w\016\\3b]\")ai\020a\001E\00591m\\7nC:$\007\"\002%\f\t\003I\025AC4fiJ+g\r\\3diR\021QE\023\005\006\r\036\003\rA\t")
public final class CommandSet {
  public static Tuple2<Object, Method> getReflect(int paramInt) {
    return CommandSet$.MODULE$.getReflect(paramInt);
  }
  
  public static boolean isSystemCommand(int paramInt) {
    return CommandSet$.MODULE$.isSystemCommand(paramInt);
  }
  
  public static void registerCommand(Seq<Object> paramSeq) {
    CommandSet$.MODULE$.registerCommand(paramSeq);
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\net\CommandSet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */