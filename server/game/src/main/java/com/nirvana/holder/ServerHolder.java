package com.nirvana.holder;

import com.nirvana.bean.ServerDef;
import com.nirvana.core.MapBean;
import scala.Enumeration;
import scala.Tuple2;
import scala.collection.immutable.List;
import scala.collection.mutable.Map;
import scala.collection.mutable.Set;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005%v!B\001\003\021\003I\021\001D*feZ,'\017S8mI\026\024(BA\002\005\003\031Aw\016\0343fe*\021QAB\001\b]&\024h/\0318b\025\0059\021aA2p[\016\001\001C\001\006\f\033\005\021a!\002\007\003\021\003i!\001D*feZ,'\017S8mI\026\0248cA\006\017)A\021qBE\007\002!)\t\021#A\003tG\006d\027-\003\002\024!\t1\021I\\=SK\032\004\"!\006\r\016\003YQ!a\006\003\002\t\r|'/Z\005\0033Y\021!\"\0238ji&\fG.\033>f\021\025Y2\002\"\001\035\003\031a\024N\\5u}Q\t\021\002C\004\037\027\001\007I\021A\020\002\013i|g.Z:\026\003\001\002B!\t\024)W5\t!E\003\002$I\0059Q.\036;bE2,'BA\023\021\003)\031w\016\0347fGRLwN\\\005\003O\t\0221!T1q!\ty\021&\003\002+!\t\031\021J\034;\021\005)a\023BA\027\003\005\035QvN\\3EK\032DqaL\006A\002\023\005\001'A\005{_:,7o\030\023fcR\021\021\007\016\t\003\037IJ!a\r\t\003\tUs\027\016\036\005\bk9\n\t\0211\001!\003\rAH%\r\005\007o-\001\013\025\002\021\002\ri|g.Z:!\021\035I4\0021A\005\002i\nqa]3sm\026\0248/F\001<!\021\tc\005\013\037\021\005u\002U\"\001 \013\005}\"\021\001\0022fC:L!!\021 \003\023M+'O^3s\t\0264\007bB\"\f\001\004%\t\001R\001\fg\026\024h/\032:t?\022*\027\017\006\0022\013\"9QGQA\001\002\004Y\004BB$\fA\003&1(\001\005tKJ4XM]:!\021\035I5\0021A\005\002)\013Ab\0315b]:,GNW8oKN,\022a\023\t\005C\031bu\n\005\003\020\033\"B\023B\001(\021\005\031!V\017\0357feA\021\001k\025\b\003\037EK!A\025\t\002\rA\023X\rZ3g\023\t!VK\001\004TiJLgn\032\006\003%BAqaV\006A\002\023\005\001,\001\tdQ\006tg.\0327[_:,7o\030\023fcR\021\021'\027\005\bkY\013\t\0211\001L\021\031Y6\002)Q\005\027\006i1\r[1o]\026d'l\0348fg\002Bq!X\006A\002\023\005!*\001\bdQ\006tg.\0327TKJ4XM]:\t\017}[\001\031!C\001A\006\0212\r[1o]\026d7+\032:wKJ\034x\fJ3r)\t\t\024\rC\0046=\006\005\t\031A&\t\r\r\\\001\025)\003L\003=\031\007.\0318oK2\034VM\035<feN\004\003bB3\f\001\004%\tAZ\001\fo\"LG/Z%q\031&\034H/F\001h!\021\tc\005\0135\021\007\005Jw*\003\002kE\t\0311+\032;\t\0171\\\001\031!C\001[\006yq\017[5uK&\003H*[:u?\022*\027\017\006\0022]\"9Qg[A\001\002\0049\007B\0029\fA\003&q-\001\007xQ&$X-\0239MSN$\b\005C\004s\027\001\007I\021A:\002\027\005\004\bO]8wC24VM]\013\002iB\021QO_\007\002m*\021q\017_\001\005Y\006twMC\001z\003\021Q\027M^1\n\005Q3\bb\002?\f\001\004%\t!`\001\020CB\004(o\034<bYZ+'o\030\023fcR\021\021G \005\bkm\f\t\0211\001u\021\035\t\ta\003Q!\nQ\fA\"\0319qe>4\030\r\034,fe\002Bq!!\002\f\t\003\t9!\001\003j]&$X#A\031\t\017\005-1\002\"\001\002\b\0051!/\0327pC\022Dq!a\004\f\t\003\t\t\"A\005hKR\034VM\035<feR\031A(a\005\t\017\005U\021Q\002a\001Q\005A1/\032:wKJLE\rC\004\002\032-!\t!a\007\002\033\035,GoU3sm\026\024H*[:u))\ti\"a\017\002V\005e\023Q\f\t\007\003?\ty#!\016\017\t\005\005\0221\006\b\005\003G\tI#\004\002\002&)\031\021q\005\005\002\rq\022xn\034;?\023\005\t\022bAA\027!\0059\001/Y2lC\036,\027\002BA\031\003g\021A\001T5ti*\031\021Q\006\t\021\007U\t9$C\002\002:Y\021q!T1q\005\026\fg\016\003\005\002>\005]\001\031AA \0031\001H.\031;g_JlG+\0379f!\021\t\t%!\024\017\t\005\r\023\021J\007\003\003\013R1!a\022\005\003!\001H.\031;g_Jl\027\002BA&\003\013\n\001#V:feBc\027\r\0364pe6$\026\020]3\n\t\005=\023\021\013\002\006-\006dW/Z\005\004\003'\002\"aC#ok6,'/\031;j_:Dq!a\026\002\030\001\007\001&A\005dQ\006tg.\0327JI\"9\0211LA\f\001\004y\025a\001<fe\"9\021qLA\f\001\004y\025AA5q\021\035\t\031g\003C\001\003K\nQ\"[:BaB\024xN^1m-\026\024H\003BA4\003[\0022aDA5\023\r\tY\007\005\002\b\005>|G.Z1o\021\035\tY&!\031A\002=Cq!!\035\f\t\003\t\031(A\004ja\016CWmY6\025\r\005\035\024QOA<\021\035\t)\"a\034A\002!Bq!a\030\002p\001\007q\nC\004\002|-!\t!! \002\037%\0348\t[1o]\026d7+\032:wKJ$b!a\032\002\000\005\005\005bBA\013\003s\002\r\001\013\005\b\003/\nI\b1\001)\021\035\t)i\003C\001\003\017\013!cZ3u\007\"\fgN\\3m5>tWMT1nKR)q*!#\002\016\"9\0211RAB\001\004A\023A\002>p]\026LE\rC\004\002X\005\r\005\031\001\025\t\017\005E5\002\"\001\002\024\006!r-\032;DQ\006tg.\0327TKJ4XM\035(b[\026$RaTAK\003/Cq!!\006\002\020\002\007\001\006C\004\002X\005=\005\031\001\025\t\017\005m5\002\"\001\002\036\006!Q.Y5o)\r\t\024q\024\005\t\003C\013I\n1\001\002$\006!\021M]4t!\021y\021QU(\n\007\005\035\006CA\003BeJ\f\027\020")
public final class ServerHolder {
  public static void main(String[] paramArrayOfString) {
    ServerHolder$.MODULE$.main(paramArrayOfString);
  }
  
  public static String getChannelServerName(int paramInt1, int paramInt2) {
    return ServerHolder$.MODULE$.getChannelServerName(paramInt1, paramInt2);
  }
  
  public static String getChannelZoneName(int paramInt1, int paramInt2) {
    return ServerHolder$.MODULE$.getChannelZoneName(paramInt1, paramInt2);
  }
  
  public static boolean isChannelServer(int paramInt1, int paramInt2) {
    return ServerHolder$.MODULE$.isChannelServer(paramInt1, paramInt2);
  }
  
  public static boolean ipCheck(int paramInt, String paramString) {
    return ServerHolder$.MODULE$.ipCheck(paramInt, paramString);
  }
  
  public static boolean isApprovalVer(String paramString) {
    return ServerHolder$.MODULE$.isApprovalVer(paramString);
  }
  
  public static List<MapBean> getServerList(Enumeration.Value paramValue, int paramInt, String paramString1, String paramString2) {
    return ServerHolder$.MODULE$.getServerList(paramValue, paramInt, paramString1, paramString2);
  }
  
  public static ServerDef getServer(int paramInt) {
    return ServerHolder$.MODULE$.getServer(paramInt);
  }
  
  public static void reload() {
    ServerHolder$.MODULE$.reload();
  }
  
  public static void init() {
    ServerHolder$.MODULE$.init();
  }
  
  public static void approvalVer_$eq(String paramString) {
    ServerHolder$.MODULE$.approvalVer_$eq(paramString);
  }
  
  public static String approvalVer() {
    return ServerHolder$.MODULE$.approvalVer();
  }
  
  public static void whiteIpList_$eq(Map<Object, Set<String>> paramMap) {
    ServerHolder$.MODULE$.whiteIpList_$eq(paramMap);
  }
  
  public static Map<Object, Set<String>> whiteIpList() {
    return ServerHolder$.MODULE$.whiteIpList();
  }
  
  public static void channelServers_$eq(Map<Tuple2<Object, Object>, String> paramMap) {
    ServerHolder$.MODULE$.channelServers_$eq(paramMap);
  }
  
  public static Map<Tuple2<Object, Object>, String> channelServers() {
    return ServerHolder$.MODULE$.channelServers();
  }
  
  public static void channelZones_$eq(Map<Tuple2<Object, Object>, String> paramMap) {
    ServerHolder$.MODULE$.channelZones_$eq(paramMap);
  }
  
  public static Map<Tuple2<Object, Object>, String> channelZones() {
    return ServerHolder$.MODULE$.channelZones();
  }
  
  public static void servers_$eq(Map<Object, ServerDef> paramMap) {
    ServerHolder$.MODULE$.servers_$eq(paramMap);
  }
  
  public static Map<Object, ServerDef> servers() {
    return ServerHolder$.MODULE$.servers();
  }
  
  public static void zones_$eq(Map<Object, ZoneDef> paramMap) {
    ServerHolder$.MODULE$.zones_$eq(paramMap);
  }
  
  public static Map<Object, ZoneDef> zones() {
    return ServerHolder$.MODULE$.zones();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\holder\ServerHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */