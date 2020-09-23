package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import java.util.Date;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\r-r!B\001\003\021\003I\021a\003*b].\034VM\035<jG\026T!a\001\003\002\017M,'O^5dK*\021QAB\001\b]&\024h/\0318b\025\0059\021aA2p[\016\001\001C\001\006\f\033\005\021a!\002\007\003\021\003i!a\003*b].\034VM\035<jG\026\034\"a\003\b\021\005)y\021B\001\t\003\005=\t%m\035;sC\016$8+\032:wS\016,\007\"\002\n\f\t\003\031\022A\002\037j]&$h\bF\001\n\021\035)2\0021A\005\002Y\tq#_;os&twmR8mI~+\b\017Z1uK~#\030.\\3\026\003]\001\"\001G\016\016\003eQ\021AG\001\006g\016\fG.Y\005\0039e\021A\001T8oO\"9ad\003a\001\n\003y\022aG=v]fLgnZ$pY\022|V\017\0353bi\026|F/[7f?\022*\027\017\006\002!GA\021\001$I\005\003Ee\021A!\0268ji\"9A%HA\001\002\0049\022a\001=%c!1ae\003Q!\n]\t\001$_;os&twmR8mI~+\b\017Z1uK~#\030.\\3!\021\035A3\0021A\005\n%\na\"\031<h!2\f\0270\032:MKZ,G.F\001+!\tA2&\003\002-3\t\031\021J\034;\t\0179Z\001\031!C\005_\005\021\022M^4QY\006LXM\035'fm\026dw\fJ3r)\t\001\003\007C\004%[\005\005\t\031\001\026\t\rIZ\001\025)\003+\003=\tgo\032)mCf,'\017T3wK2\004\003\"\002\033\f\t\003)\024!B2mK\006\024H#\001\021\t\013]ZA\021\001\035\002#\035,G/\021<h!2\f\0270\032:MKZ,G\016F\001+\021\025Q4\002\"\0016\0035)\b\017Z1uK\006cGNU1oW\")Ah\003C\001{\005\001r-\032;U_B\034D*\032<fYJ\013gn[\013\002}A\031qHQ#\017\005a\001\025BA!\032\003\035\001\030mY6bO\026L!a\021#\003\t1K7\017\036\006\003\003f\001\"AR%\016\003\035S!\001\023\003\002\t\r|'/Z\005\003\025\036\023q!T1q\005\026\fg\016C\003M\027\021\005Q(A\nhKR$v\016]\032GS\036DG/\0338h%\006t7\016C\003O\027\021\005Q(\001\fhKR$v\016]\0311aA2\025n\0325uS:<'+\0318l\021\025\0016\002\"\001>\003U9W\r\036+paJ\002\004GR5hQRLgn\032*b].DQAU\006\005\002M\013a\"\0338jiBc\027-_3s%\006t7\016\006\002F)\")Q+\025a\001-\006I\001\017\\1zKJ|\026\016\032\t\003/js!\001\007-\n\005eK\022A\002)sK\022,g-\003\002\\9\n11\013\036:j]\036T!!W\r\t\013y[A\021A0\002\033\005$G\r\0257bs\026\024(+\0318l)\025\001\003-Y2f\021\025)V\f1\001W\021\025\021W\f1\001+\003I\021XmY3jm\026|f\r\\8xKJ|f.^7\t\013\021l\006\031\001\026\002\037\035Lg/Z0gY><XM]0ok6DQAZ/A\002Y\013!cZ5wK~\003H.Y=fe~3Gn\\<fe\")\001n\003C\001S\006y\001\017\\1zKJ4\025n\0325u%\006t7\016\006\002!U\")1n\032a\001Y\006!A-\031;f!\ti'/D\001o\025\ty\007/\001\003vi&d'\"A9\002\t)\fg/Y\005\003g:\024A\001R1uK\")Qo\003C\001m\0069r-\032;QY\006LXM\035$jO\"$(+\0318l\023:$W\r\037\013\003}]DQ\001\037;A\002)\nQ!\0338eKbDQA_\006\005\002m\f!cZ3u!2\f\0270\032:GS\036DGOU1oWR\021Q\t \005\006+f\004\rA\026\005\006}.!\ta`\001\020a2\f\0270\032:MKZ,GNU1oWR\031\001%!\001\t\013-l\b\031\0017\t\017\005\0251\002\"\001\002\b\005\t2/\032;Bm\036\004F.Y=fe2+g/\0327\026\003\001Bq!a\003\f\t\003\ti!A\fhKR\004F.Y=fe2+g/\0327SC:\\\027J\0343fqR\031a(a\004\t\ra\fI\0011\001+\021\035\t\031b\003C\001\003+\t!cZ3u!2\f\0270\032:MKZ,GNU1oWR\031Q)a\006\t\rU\013\t\0021\001W\021\035\tYb\003C\001\003;\tQbZ3u!2\f\0270\032:SC:\\GcA#\002 !1Q+!\007A\002YCa!a\t\f\t\003)\024aD2mK\006\024\b\013\\1zKJ\024\026M\\6\t\017\005\0352\002\"\001\002*\0051R\017\0353bi\026\024VmY3jm\0264En\\<fe:+X\016F\003!\003W\ti\003\003\004V\003K\001\rA\026\005\007E\006\025\002\031\001\026\t\017\005E2\002\"\001\0024\005\031R\017\0353bi\026<\025N^3GY><XM\035(v[R9\001%!\016\0028\005e\002BB+\0020\001\007a\013\003\004e\003_\001\rA\013\005\007M\006=\002\031\001,\t\017\005u2\002\"\001\002@\005y\001\017\\1zKJluN\\3z%\006t7\016F\002!\003\003Baa[A\036\001\004a\007bBA#\027\021\005\021qI\001\030O\026$\b\013\\1zKJluN\\3z%\006t7.\0238eKb$2APA%\021\031A\0301\ta\001U!9\021QJ\006\005\002\005=\023AE4fiBc\027-_3s\033>tW-\037*b].$2!RA)\021\031)\0261\na\001-\"9\021QK\006\005\002\005]\023\001\0059beRtWM\035'fm\026d'+\0318l)\r\001\023\021\f\005\007W\006M\003\031\0017\t\017\005u3\002\"\001\002`\005Ar-\032;QCJ$h.\032:MKZ,GNU1oW&sG-\032=\025\007y\n\t\007\003\004y\0037\002\rA\013\005\b\003KZA\021AA4\003M9W\r\036)beRtWM\035'fm\026d'+\0318l)\r)\025\021\016\005\007+\006\r\004\031\001,\t\017\00554\002\"\001\002p\005!\002\017\\1zKJ\024V-\0317n\031\0264X\r\034*b].$2\001IA9\021\031Y\0271\016a\001Y\"9\021QO\006\005\002\005]\024\001H4fiBc\027-_3s%\026\fG.\034'fm\026d'+\0318l\023:$W\r\037\013\004}\005e\004B\002=\002t\001\007!\006C\004\002~-!\t!a \002/\035,G\017\0257bs\026\024(+Z1m[2+g/\0327SC:\\GcA#\002\002\"1Q+a\037A\002YCq!!\"\f\t\003\t9)\001\005xS:<'+\0318l)\r\001\023\021\022\005\007W\006\r\005\031\0017\t\017\00555\002\"\001\002\020\006\001r-\032;XS:<'+\0318l\023:$W\r\037\013\004}\005E\005B\002=\002\f\002\007!\006C\004\002\026.!\t!a&\002\027\035,GoV5oOJ\013gn\033\013\004\013\006e\005BB+\002\024\002\007a\013\003\004\002\036.!\t!N\001\016i>twMR5hQR\024\026M\\6\t\017\005\0056\002\"\001\002$\006)r-\032;U_:<g)[4iiJ\013gn[%oI\026DHc\001 \002&\"1\0010a(A\002)Bq!!+\f\t\003\tY+\001\thKR$vN\\4GS\036DGOU1oWR\031Q)!,\t\017\005=\026q\025a\001-\0069Ao\0348h?&$\007bBAZ\027\021\005\021QW\001\021O\026$Hk\0348h\r&<\007\016\036'jgR,\"!a.\021\t\005e&)\022\b\004\003w\003e\002BA_\003\007l!!a0\013\007\005\005\007\"\001\004=e>|GOP\005\0025!1\021qY\006\005\002U\nQ\002^8oO2+g/\0327SC:\\\007BBAf\027\021\005Q'A\006hk*LW\t\0379SC:\\\007bBAh\027\021\005\021\021[\001\025O\026$x)^1KS\026C\bOU1oW&sG-\032=\025\007y\n\031\016\003\004y\003\033\004\rA\013\005\b\003/\\A\021AAm\003=9W\r^$vC*KW\t\0379SC:\\GcA#\002\\\"1Q+!6A\002YCq!a8\f\t\003\t\t/A\013hKR$vN\\4MKZ,GNU1oW&sG-\032=\025\007y\n\031\017\003\004y\003;\004\rA\013\005\b\003O\\A\021AAu\003A9W\r\036+p]\036dUM^3m%\006t7\016F\002F\003WDq!a,\002f\002\007a\013C\004\002p.!\t!!=\002\023Q|w/\032:SC:\\Gc\001\021\002t\"11.!<A\0021Dq!a>\f\t\003\tI0A\thKR$vn^3s%\006t7.\0238eKb$2APA~\021\031A\030Q\037a\001U!9\021q_\006\005\002\005}Hc\001\026\003\002!1Q+!@A\002YCqA!\002\f\t\003\0219!\001\007hKR$vn^3s%\006t7\016F\002F\005\023Aa!\026B\002\001\0041\006B\002B\007\027\021\005\021&A\007hKR<vN\0357e\031\0264X\r\034\005\b\005#YA\021\001B\n\003E9W\r^(qK:\034VM\035<feJ\013gn\033\013\002}!9!qC\006\005\002\te\021\001G4fi>\003XM\\*feZ,'\017\0257bs\026\024H*\032<fYR\031aHa\007\t\023\tu!Q\003I\001\002\004Q\023A\0028v[\n,'\017C\004\003\"-!\tAa\t\002#\005$Gm\0249f]N+'O^3s%\006t7\016F\t!\005K\021IC!\f\0032\tU\"\021\bB\037\005\003BqAa\n\003 \001\007!&A\002jIbDqAa\013\003 \001\007!&A\001u\021\035\021yCa\bA\002Y\0131\001]5e\021\035\021\031Da\bA\002Y\013AA\\1nK\"9!q\007B\020\001\0041\026A\001;o\021\035\021YDa\bA\002)\n\021A\036\005\b\005\021y\0021\001+\003\005Y\007b\002B\"\005?\001\rAK\001\003mJBqAa\022\f\t\003\021I%\001\tbI\022\004F.Y=fe\036+Wn\025;beR1!1\nB)\005'\0022\001\007B'\023\r\021y%\007\002\007\003:Lh+\0317\t\rU\023)\0051\001W\021\035\021)F!\022A\002)\nQa\035;beNDqA!\027\f\t\003\021Y&\001\thKR|\005/\0328TKJ4XM]$f[R\031aH!\030\t\023\tu!q\013I\001\002\004Q\003b\002B1\027\021\005!1M\001\023O\026$x\n]3o'\026\024h/\032:UeVl\007\017F\002?\005KB\021B!\b\003`A\005\t\031\001\026\t\017\t%4\002\"\001\003l\005!r-\032;Pa\026t7+\032:wKJ\004\026M\035;oKJ$2A\020B7\021%\021iBa\032\021\002\003\007!\006C\004\003r-!\tAa\035\002/\035,Go\0249f]N+'O^3s\013F,\030\016\035'fm\026dGc\001 \003v!I!Q\004B8!\003\005\rA\013\005\b\005sZA\021\001B>\003I9W\r^(qK:\034VM\035<feJ+\027\r\\7\025\007y\022i\bC\005\003\036\t]\004\023!a\001U!9!\021Q\006\005\002\t\r\025\001E4fi>\003XM\\*feZ,'\017U3u)\rq$Q\021\005\n\005;\021y\b%AA\002)BqA!#\f\t\003\021Y)A\rhKR|\005/\0328TKJ4XM\035)fi\032{'/\\1uS>tGc\001 \003\016\"I!Q\004BD!\003\005\rA\013\005\b\005#[A\021\001BJ\003E9W\r^(qK:\034VM\035<fe^Kgn\032\013\004}\tU\005\"\003B\017\005\037\003\n\0211\001+\021\035\021Ij\003C\001\0057\013\001cZ3u\037B,gnU3sm\026\024\b+Y=\025\017y\022iJ!)\003&\"9!q\024BL\001\004a\027AC:uCJ$x\f^5nK\"9!1\025BL\001\004a\027\001C3oI~#\030.\\3\t\023\tu!q\023I\001\002\004Q\003b\002BU\027\021\005!1V\001\031O\026$x\n]3o'\026\024h/\032:QY\006LXM\035$jO\"$Hc\001 \003.\"I!Q\004BT!\003\005\rA\013\005\b\005c[A\021\001BZ\003E\tG\rZ(qK:\034VM\035<fe\036Kg\r\036\013\fA\tU&\021\030B_\005\023\031\rC\004\0038\n=\006\031\001\026\002\tQL\b/\032\005\b\005w\023y\0131\001+\003-\021Xm^1sI~\023\030M\\6\t\rU\023y\0131\001W\021\035\021\tMa,A\002)\naa\035;biV\034\bb\002Bc\005_\003\rAK\001\005W&tG\rC\004\003J.!\tAa3\002\027\035,GOU1oW\036Kg\r\036\013\004}\t5\007BB+\003H\002\007a\013\003\004\003R.!\t\001O\001\fsVt\0270\0338h\017>dG\rC\004\003V.!\tAa\005\002'\035,G/W;o3&twmR8mI&sG-\032=\t\017\te7\002\"\001\003\\\006\021r-\032;Zk:L\026N\\4H_2$'+\0318l)\r)%Q\034\005\007+\n]\007\031\001,\t\017\t\0058\002\"\001\003d\006)r-\032;Zk:L\026N\\4H_2$'+\0318lS:<GcA#\003f\"9!q\035Bp\001\004Q\023\001\002:b].D\021Ba;\f#\003%\tA!<\002E\035,Go\0249f]N+'O^3s!2\f\0270\032:MKZ,G\016\n3fM\006,H\016\036\0232+\t\021yOK\002+\005c\\#Aa=\021\t\tU(q`\007\003\005oTAA!?\003|\006IQO\\2iK\016\\W\r\032\006\004\005{L\022AC1o]>$\030\r^5p]&!1\021\001B|\005E)hn\0315fG.,GMV1sS\006t7-\032\005\n\007\013Y\021\023!C\001\005[\f!dZ3u\037B,gnU3sm\026\024x)Z7%I\0264\027-\0367uIEB\021b!\003\f#\003%\tA!<\0029\035,Go\0249f]N+'O^3s)J,X\016\035\023eK\032\fW\017\034;%c!I1QB\006\022\002\023\005!Q^\001\037O\026$x\n]3o'\026\024h/\032:QCJ$h.\032:%I\0264\027-\0367uIEB\021b!\005\f#\003%\tA!<\002C\035,Go\0249f]N+'O^3s\013F,\030\016\035'fm\026dG\005Z3gCVdG\017J\031\t\023\rU1\"%A\005\002\t5\030\001H4fi>\003XM\\*feZ,'OU3bY6$C-\0324bk2$H%\r\005\n\0073Y\021\023!C\001\005[\f!dZ3u\037B,gnU3sm\026\024\b+\032;%I\0264\027-\0367uIEB\021b!\b\f#\003%\tA!<\002G\035,Go\0249f]N+'O^3s!\026$hi\034:nCRLwN\034\023eK\032\fW\017\034;%c!I1\021E\006\022\002\023\005!Q^\001\034O\026$x\n]3o'\026\024h/\032:XS:<G\005Z3gCVdG\017J\031\t\023\r\0252\"%A\005\002\t5\030AG4fi>\003XM\\*feZ,'\017U1zI\021,g-Y;mi\022\032\004\"CB\025\027E\005I\021\001Bw\003\t:W\r^(qK:\034VM\035<feBc\027-_3s\r&<\007\016\036\023eK\032\fW\017\034;%c\001")
public final class RankService {
  public static int getOpenServerPlayerFight$default$1() {
    return RankService$.MODULE$.getOpenServerPlayerFight$default$1();
  }
  
  public static int getOpenServerPay$default$3() {
    return RankService$.MODULE$.getOpenServerPay$default$3();
  }
  
  public static int getOpenServerWing$default$1() {
    return RankService$.MODULE$.getOpenServerWing$default$1();
  }
  
  public static int getOpenServerPetFormation$default$1() {
    return RankService$.MODULE$.getOpenServerPetFormation$default$1();
  }
  
  public static int getOpenServerPet$default$1() {
    return RankService$.MODULE$.getOpenServerPet$default$1();
  }
  
  public static int getOpenServerRealm$default$1() {
    return RankService$.MODULE$.getOpenServerRealm$default$1();
  }
  
  public static int getOpenServerEquipLevel$default$1() {
    return RankService$.MODULE$.getOpenServerEquipLevel$default$1();
  }
  
  public static int getOpenServerPartner$default$1() {
    return RankService$.MODULE$.getOpenServerPartner$default$1();
  }
  
  public static int getOpenServerTrump$default$1() {
    return RankService$.MODULE$.getOpenServerTrump$default$1();
  }
  
  public static int getOpenServerGem$default$1() {
    return RankService$.MODULE$.getOpenServerGem$default$1();
  }
  
  public static int getOpenServerPlayerLevel$default$1() {
    return RankService$.MODULE$.getOpenServerPlayerLevel$default$1();
  }
  
  public static MapBean getYunYingGoldRanking(int paramInt) {
    return RankService$.MODULE$.getYunYingGoldRanking(paramInt);
  }
  
  public static MapBean getYunYingGoldRank(String paramString) {
    return RankService$.MODULE$.getYunYingGoldRank(paramString);
  }
  
  public static List<MapBean> getYunYingGoldIndex() {
    return RankService$.MODULE$.getYunYingGoldIndex();
  }
  
  public static int yunyingGold() {
    return RankService$.MODULE$.yunyingGold();
  }
  
  public static List<MapBean> getRankGift(String paramString) {
    return RankService$.MODULE$.getRankGift(paramString);
  }
  
  public static void addOpenServerGift(int paramInt1, int paramInt2, String paramString, int paramInt3, int paramInt4) {
    RankService$.MODULE$.addOpenServerGift(paramInt1, paramInt2, paramString, paramInt3, paramInt4);
  }
  
  public static List<MapBean> getOpenServerPlayerFight(int paramInt) {
    return RankService$.MODULE$.getOpenServerPlayerFight(paramInt);
  }
  
  public static List<MapBean> getOpenServerPay(Date paramDate1, Date paramDate2, int paramInt) {
    return RankService$.MODULE$.getOpenServerPay(paramDate1, paramDate2, paramInt);
  }
  
  public static List<MapBean> getOpenServerWing(int paramInt) {
    return RankService$.MODULE$.getOpenServerWing(paramInt);
  }
  
  public static List<MapBean> getOpenServerPetFormation(int paramInt) {
    return RankService$.MODULE$.getOpenServerPetFormation(paramInt);
  }
  
  public static List<MapBean> getOpenServerPet(int paramInt) {
    return RankService$.MODULE$.getOpenServerPet(paramInt);
  }
  
  public static List<MapBean> getOpenServerRealm(int paramInt) {
    return RankService$.MODULE$.getOpenServerRealm(paramInt);
  }
  
  public static List<MapBean> getOpenServerEquipLevel(int paramInt) {
    return RankService$.MODULE$.getOpenServerEquipLevel(paramInt);
  }
  
  public static List<MapBean> getOpenServerPartner(int paramInt) {
    return RankService$.MODULE$.getOpenServerPartner(paramInt);
  }
  
  public static List<MapBean> getOpenServerTrump(int paramInt) {
    return RankService$.MODULE$.getOpenServerTrump(paramInt);
  }
  
  public static List<MapBean> getOpenServerGem(int paramInt) {
    return RankService$.MODULE$.getOpenServerGem(paramInt);
  }
  
  public static Object addPlayerGemStar(String paramString, int paramInt) {
    return RankService$.MODULE$.addPlayerGemStar(paramString, paramInt);
  }
  
  public static void addOpenServerRank(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, int paramInt3, int paramInt4, int paramInt5) {
    RankService$.MODULE$.addOpenServerRank(paramInt1, paramInt2, paramString1, paramString2, paramString3, paramInt3, paramInt4, paramInt5);
  }
  
  public static List<MapBean> getOpenServerPlayerLevel(int paramInt) {
    return RankService$.MODULE$.getOpenServerPlayerLevel(paramInt);
  }
  
  public static List<MapBean> getOpenServerRank() {
    return RankService$.MODULE$.getOpenServerRank();
  }
  
  public static int getWorldLevel() {
    return RankService$.MODULE$.getWorldLevel();
  }
  
  public static MapBean getTowerRank(String paramString) {
    return RankService$.MODULE$.getTowerRank(paramString);
  }
  
  public static int getTowerRankIndex(String paramString) {
    return RankService$.MODULE$.getTowerRankIndex(paramString);
  }
  
  public static List<MapBean> getTowerRankIndex(int paramInt) {
    return RankService$.MODULE$.getTowerRankIndex(paramInt);
  }
  
  public static void towerRank(Date paramDate) {
    RankService$.MODULE$.towerRank(paramDate);
  }
  
  public static MapBean getTongLevelRank(String paramString) {
    return RankService$.MODULE$.getTongLevelRank(paramString);
  }
  
  public static List<MapBean> getTongLevelRankIndex(int paramInt) {
    return RankService$.MODULE$.getTongLevelRankIndex(paramInt);
  }
  
  public static MapBean getGuaJiExpRank(String paramString) {
    return RankService$.MODULE$.getGuaJiExpRank(paramString);
  }
  
  public static List<MapBean> getGuaJiExpRankIndex(int paramInt) {
    return RankService$.MODULE$.getGuaJiExpRankIndex(paramInt);
  }
  
  public static void gujiExpRank() {
    RankService$.MODULE$.gujiExpRank();
  }
  
  public static void tongLevelRank() {
    RankService$.MODULE$.tongLevelRank();
  }
  
  public static List<MapBean> getTongFightList() {
    return RankService$.MODULE$.getTongFightList();
  }
  
  public static MapBean getTongFightRank(String paramString) {
    return RankService$.MODULE$.getTongFightRank(paramString);
  }
  
  public static List<MapBean> getTongFightRankIndex(int paramInt) {
    return RankService$.MODULE$.getTongFightRankIndex(paramInt);
  }
  
  public static void tongFightRank() {
    RankService$.MODULE$.tongFightRank();
  }
  
  public static MapBean getWingRank(String paramString) {
    return RankService$.MODULE$.getWingRank(paramString);
  }
  
  public static List<MapBean> getWingRankIndex(int paramInt) {
    return RankService$.MODULE$.getWingRankIndex(paramInt);
  }
  
  public static void wingRank(Date paramDate) {
    RankService$.MODULE$.wingRank(paramDate);
  }
  
  public static MapBean getPlayerRealmLevelRank(String paramString) {
    return RankService$.MODULE$.getPlayerRealmLevelRank(paramString);
  }
  
  public static List<MapBean> getPlayerRealmLevelRankIndex(int paramInt) {
    return RankService$.MODULE$.getPlayerRealmLevelRankIndex(paramInt);
  }
  
  public static void playerRealmLevelRank(Date paramDate) {
    RankService$.MODULE$.playerRealmLevelRank(paramDate);
  }
  
  public static MapBean getPartnerLevelRank(String paramString) {
    return RankService$.MODULE$.getPartnerLevelRank(paramString);
  }
  
  public static List<MapBean> getPartnerLevelRankIndex(int paramInt) {
    return RankService$.MODULE$.getPartnerLevelRankIndex(paramInt);
  }
  
  public static void partnerLevelRank(Date paramDate) {
    RankService$.MODULE$.partnerLevelRank(paramDate);
  }
  
  public static MapBean getPlayerMoneyRank(String paramString) {
    return RankService$.MODULE$.getPlayerMoneyRank(paramString);
  }
  
  public static List<MapBean> getPlayerMoneyRankIndex(int paramInt) {
    return RankService$.MODULE$.getPlayerMoneyRankIndex(paramInt);
  }
  
  public static void playerMoneyRank(Date paramDate) {
    RankService$.MODULE$.playerMoneyRank(paramDate);
  }
  
  public static void updateGiveFlowerNum(String paramString1, int paramInt, String paramString2) {
    RankService$.MODULE$.updateGiveFlowerNum(paramString1, paramInt, paramString2);
  }
  
  public static void updateReceiveFlowerNum(String paramString, int paramInt) {
    RankService$.MODULE$.updateReceiveFlowerNum(paramString, paramInt);
  }
  
  public static void clearPlayerRank() {
    RankService$.MODULE$.clearPlayerRank();
  }
  
  public static MapBean getPlayerRank(String paramString) {
    return RankService$.MODULE$.getPlayerRank(paramString);
  }
  
  public static MapBean getPlayerLevelRank(String paramString) {
    return RankService$.MODULE$.getPlayerLevelRank(paramString);
  }
  
  public static List<MapBean> getPlayerLevelRankIndex(int paramInt) {
    return RankService$.MODULE$.getPlayerLevelRankIndex(paramInt);
  }
  
  public static void setAvgPlayerLevel() {
    RankService$.MODULE$.setAvgPlayerLevel();
  }
  
  public static void playerLevelRank(Date paramDate) {
    RankService$.MODULE$.playerLevelRank(paramDate);
  }
  
  public static MapBean getPlayerFightRank(String paramString) {
    return RankService$.MODULE$.getPlayerFightRank(paramString);
  }
  
  public static List<MapBean> getPlayerFightRankIndex(int paramInt) {
    return RankService$.MODULE$.getPlayerFightRankIndex(paramInt);
  }
  
  public static void playerFightRank(Date paramDate) {
    RankService$.MODULE$.playerFightRank(paramDate);
  }
  
  public static void addPlayerRank(String paramString1, int paramInt1, int paramInt2, String paramString2) {
    RankService$.MODULE$.addPlayerRank(paramString1, paramInt1, paramInt2, paramString2);
  }
  
  public static MapBean initPlayerRank(String paramString) {
    return RankService$.MODULE$.initPlayerRank(paramString);
  }
  
  public static List<MapBean> getTop200FightingRank() {
    return RankService$.MODULE$.getTop200FightingRank();
  }
  
  public static List<MapBean> getTop1000FightingRank() {
    return RankService$.MODULE$.getTop1000FightingRank();
  }
  
  public static List<MapBean> getTop3FightingRank() {
    return RankService$.MODULE$.getTop3FightingRank();
  }
  
  public static List<MapBean> getTop3LevelRank() {
    return RankService$.MODULE$.getTop3LevelRank();
  }
  
  public static void updateAllRank() {
    RankService$.MODULE$.updateAllRank();
  }
  
  public static int getAvgPlayerLevel() {
    return RankService$.MODULE$.getAvgPlayerLevel();
  }
  
  public static void clear() {
    RankService$.MODULE$.clear();
  }
  
  public static void yunyingGold_update_time_$eq(long paramLong) {
    RankService$.MODULE$.yunyingGold_update_time_$eq(paramLong);
  }
  
  public static long yunyingGold_update_time() {
    return RankService$.MODULE$.yunyingGold_update_time();
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    RankService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    RankService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return RankService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    RankService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    RankService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return RankService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    RankService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    RankService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return RankService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    RankService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    RankService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return RankService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    RankService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    RankService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return RankService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return RankService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return RankService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\RankService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */