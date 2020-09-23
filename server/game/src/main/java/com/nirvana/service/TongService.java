package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import java.util.Date;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\021\rx!B\001\003\021\003I\021a\003+p]\036\034VM\035<jG\026T!a\001\003\002\017M,'O^5dK*\021QAB\001\b]&\024h/\0318b\025\0059\021aA2p[\016\001\001C\001\006\f\033\005\021a!\002\007\003\021\003i!a\003+p]\036\034VM\035<jG\026\034\"a\003\b\021\005)y\021B\001\t\003\005=\t%m\035;sC\016$8+\032:wS\016,\007\"\002\n\f\t\003\031\022A\002\037j]&$h\bF\001\n\021\025)2\002\"\001\027\003!9W\r\036+p]\036\034H#A\f\021\007aq\022E\004\002\03295\t!DC\001\034\003\025\0318-\0317b\023\ti\"$A\004qC\016\\\027mZ3\n\005}\001#\001\002'jgRT!!\b\016\021\005\t*S\"A\022\013\005\021\"\021\001B2pe\026L!AJ\022\003\0175\013\007OQ3b]\")\001f\003C\001-\005Yq-\032;U_:<'i\\:t\021\025Q3\002\"\001\027\003=9W\r\036+p]\036\024un]:SC:\\\007\"\002\026\f\t\003aCCA\f.\021\025q3\0061\0010\003\031qW/\0342feB\021\021\004M\005\003ci\0211!\0238u\021\025\0314\002\"\0015\003M9W\r\036+p]\036\024un]:SC:\\')_%e)\t\tS\007C\0037e\001\007q'A\004u_:<w,\0333\021\005aZdBA\r:\023\tQ$$\001\004Qe\026$WMZ\005\003yu\022aa\025;sS:<'B\001\036\033\021\025y4\002\"\001A\003=9W\r\036+p]\036\034()\037'fm\026dGCA\fB\021\025\021e\b1\0010\003\rqW/\034\005\006\t.!\t!R\001\rO\026$Hk\0348h\r&<\007\016\036\013\003_\031CQaR\"A\002]\na\001^8oO&#\007\"B%\f\t\003Q\025aB4fiR{gn\032\013\003C-CQa\022%A\002]BQ!F\006\005\0025#\"AT+\021\007=s\022E\004\002Q99\021\021\013V\007\002%*\0211\013C\001\007yI|w\016\036 \n\003mAQA\026'A\002]\013\001\002^8oO~KGm\035\t\004\037z9\004\"B-\f\t\003Q\026!E4fiR{gn\032\"z\035\006lWm\024:JIR\021qc\027\005\0069b\003\raN\001\tS\022|%OT1nK\")al\003C\001?\006iq-\032;U_:<W*Z7cKJ$\"!\t1\t\013\005l\006\031A\034\002\021Ad\027-_3s\023\022DQaY\006\005\002\021\f\001cZ3u)>twMQ8tg\016CWm\035;\025\005\005*\007\"B1c\001\0049\004\"B4\f\t\003A\027\001E1eIR{gn\032\"pgN\034\005.Z:u)\ry\023N\033\005\006C\032\004\ra\016\005\006W\032\004\raN\001\007gR\fG/^:\t\0135\\A\021\0018\002\035\035,G\017V8oO6+WNY3sgR!qc\\9s\021\025\001H\0161\0018\003%\001H.Y=fe~KG\rC\0037Y\002\007q\007C\003tY\002\007q&A\005sC:$w.\034(v[\")Qn\003C\001kR\031aJ^<\t\013Y#\b\031A,\t\013M$\b\031A\030\t\0135\\A\021A=\025\005]Q\b\"\002\034y\001\0049\004\"\002?\f\t\003i\030AF4fiR{gnZ'f[\n,'o\035\"z'R\fG/^:\025\013]qx0a\001\t\013YZ\b\031A\034\t\r\005\0051\0201\0010\003-\031H/\031;vgN#\030M\035;\t\r\005\0251\0201\0010\003%\031H/\031;vg\026sG\rC\004\002\n-!\t!a\003\002'\035,G\017V8oO6+WNY3s'R\fG/^:\025\013\005\ni!a\004\t\rY\n9\0011\0018\021\031\001\030q\001a\001o!9\0211C\006\005\002\005U\021!G4fiR{gnZ'f[\n,'o]!oI2{w-\0338PkR$2aFA\f\021\0311\024\021\003a\001o!9\0211D\006\005\002\005u\021aB1eIR{gn\032\013\030o\005}\021\021EA\023\003S\ti#!\r\0026\005e\022QHA!\003\007Ba!YA\r\001\0049\004bBA\022\0033\001\raN\001\005]\006lW\rC\004\002(\005e\001\031A\034\002\023=<h.\032:OC6,\007bBA\026\0033\001\raL\001\006Y\0264X\r\034\005\b\003_\tI\0021\0010\003\031\031\027M]3fe\"9\0211GA\r\001\004y\023aA3ya\"9\021qGA\r\001\004y\023aB2ba&$\030\r\034\005\b\003w\tI\0021\0010\0035\031\027\r]5uC2|Fo\034;bY\"9\021qHA\r\001\0049\024A\0028pi&\034W\r\003\004/\0033\001\ra\f\005\t\003\013\nI\0021\001\002H\005Q1M]3bi\026$\026.\\3\021\t\005%\0231K\007\003\003\027RA!!\024\002P\005!Q\017^5m\025\t\t\t&\001\003kCZ\f\027\002BA+\003\027\022A\001R1uK\"9\021\021L\006\005\002\005m\023!D;qI\006$X\rV8oO\026C\b\017F\0040\003;\n\t'a\031\t\017\005}\023q\013a\001o\005\021\021\016\032\005\b\003g\t9\0061\0010\021\035\tY#a\026A\002=Bq!a\032\f\t\003\tI'A\tva\022\fG/\032+p]\036\034\025\r]5uC2$\002\"a\033\002r\005M\024Q\017\t\0043\0055\024bAA85\t!QK\\5u\021\035\ty&!\032A\002]Bq!a\016\002f\001\007q\006C\004\002<\005\025\004\031A\030\t\017\005e4\002\"\001\002|\005i\021\r\0323U_:<W*Z7cKJ$B$a\033\002~\005}\024\021QAC\003\017\013I)!$\002\022\006U\025\021TAO\003C\013)\013\003\004q\003o\002\ra\016\005\007m\005]\004\031A\034\t\017\005\r\025q\017a\001o\005Y\001\017\\1zKJ|f.Y7f\021\031Y\027q\017a\001_!9\021qFA<\001\004y\003bBAF\003o\002\raL\001\fo\026,7n\0303p]\006$X\rC\004\002\020\006]\004\031A\030\002\r\021|g.\031;f\021\035\t\031*a\036A\002=\nA\002Z8oCR,w\f^8uC2Dq!a&\002x\001\007q&\001\006vg\026|Fm\0348bi\026Dq!a'\002x\001\007q&A\te_:\fG/Z0ji\026lw\f^8uC2Dq!a(\002x\001\007q&A\te_:\fG/Z0h_2$w\f^8uC2D\001\"a)\002x\001\007\021qI\001\bC\022$G+[7f\021\035\t9+a\036A\002]\naa]1mCJL\bbBAV\027\021\005\021QV\001\fSN,\0050[:u\035\006lW\r\006\003\0020\006U\006cA\r\0022&\031\0211\027\016\003\017\t{w\016\\3b]\"9\0211EAU\001\0049\004bBA]\027\021\005\0211X\001\027kB$\027\r^3U_:<W*Z7cKJ$uN\\1uKR\001\0221NA_\003\013\t-a1\002F\006\035\027\021\032\005\007a\006]\006\031A\034\t\017\005=\025q\027a\001_!9\0211RA\\\001\004y\003bBAJ\003o\003\ra\f\005\b\003/\0139\f1\0010\021\035\tY*a.A\002=Bq!a(\0028\002\007q\006C\004\002N.!\t!a4\002-U\004H-\031;f)>tw-T3nE\026\0248+\0317bef$b!a\033\002R\006M\007B\0029\002L\002\007q\007C\004\002(\006-\007\031A\034\t\017\005]7\002\"\001\002Z\006Y1\r\\3be\022{g.\031;f)\t\tY\007C\004\002^.!\t!!7\0021\rdW-\031:E_:\fG/Z!oI^+Wm\033#p]\006$X\rC\004\002b.!\t!a9\002#\rdW-\031:E_:\fG/\032*fG>\024H\rF\0010\021\035\t9o\003C\001\003S\f!\"\0313e)>tw-\0219q)A\tY'a;\002n\006=\030\021_Az\003o\fI\020\003\0047\003K\004\ra\016\005\007a\006\025\b\031A\034\t\017\005\r\025Q\035a\001o!9\0211FAs\001\004y\003bBA{\003K\004\raL\001\006M&<\007\016\036\005\b\003_\t)\0171\0010\021!\tY0!:A\002\005\035\023\001C1qa~#\030.\\3\t\017\005}8\002\"\001\003\002\005Qq-\032;U_:<\027\t\0359\025\013\005\022\031A!\002\t\rY\ni\0201\0018\021\031\001\030Q a\001o!9!\021B\006\005\002\t-\021aC4fiR{gnZ!qaN$2a\006B\007\021\0319%q\001a\001o!9!\021C\006\005\002\tM\021AD4fiR{gnZ!qaNtU/\034\013\004_\tU\001BB$\003\020\001\007q\007C\004\003\032-!\tAa\007\002\033\035,G\017V8oO:+XNY3s)\ry#Q\004\005\007m\t]\001\031A\034\t\017\t\0052\002\"\001\003$\005iA-\0327fi\026$vN\\4BaB$b!a\033\003&\t\035\002B\002\034\003 \001\007q\007\003\004q\005?\001\ra\016\005\b\005WYA\021\001B\027\0039!W\r\\3uKR{gnZ!qaN$B!a\033\0030!1aG!\013A\002]BqAa\r\f\t\003\021)$\001\thKR\004F.Y=feR{gnZ!qaR\031qCa\016\t\rA\024\t\0041\0018\021\035\021Yd\003C\001\005{\tQcZ3u)>twm\024:eKJ\024\025pQ1qSR\fG\016F\003\030\005\021\031\005C\004\003B\te\002\031A\030\002\013%tG-\032=\t\017\t\025#\021\ba\001_\005I\001/Y4f?NL'0\032\005\b\005\023ZA\021\001B&\003i9W\r^#oK6LHk\0348h\037J$WM\035\"z\007\006\004\030\016^1m)%9\"Q\nB(\005'\0229\006\003\0047\005\017\002\ra\016\005\b\005#\0229\0051\0010\003\025\031H/\031:u\021\035\021)Fa\022A\002=\n1!\0328e\021\035\021IFa\022A\002=\naA]1oI>l\007b\002B/\027\021\005!qL\001\rO\026$Hk\0348h\023:$W\r\037\013\004_\t\005\004BB$\003\\\001\007q\007C\004\003f-!\tAa\032\002-U\004H-\031;f)>tw-T3nE\026\0248\013^1ukN$\002\"a\033\003j\t-$Q\016\005\007a\n\r\004\031A\034\t\rY\022\031\0071\0018\021\031Y'1\ra\001_!9!\021O\006\005\002\tM\024aE;qI\006$X\rV8oO>;h.\032:OC6,G\003CA6\005k\0229Ha\037\t\rY\022y\0071\0018\021\035\021IHa\034A\002]\n\001b\\<oKJ|\026\016\032\005\b\005{\022y\0071\0018\003)ywO\\3s?:\fW.\032\005\b\005\003[A\021\001BB\0035)\b\017Z1uKR{gn\032(v[R1\0211\016BC\005\017CaA\016B@\001\0049\004B\002\030\003\000\001\007q\006C\004\003\f.!\tA!$\002\037\035,G\017V8oOJ+G.\031;j_:$2a\006BH\021\0311$\021\022a\001o!9!1S\006\005\002\tU\025aD;qI\006$X\rV8oO\016CWmY6\025\r\005-$q\023BM\021\0311$\021\023a\001o!9!1\024BI\001\004y\023!B2iK\016\\\007b\002BP\027\021\005!\021U\001\020C\022$Gk\0348h%\026d\027\r^5p]R9qFa)\003&\n%\006B\002\034\003\036\002\007q\007C\004\003(\nu\005\031A\034\002!I,G.\031;j_:|Fo\0348h?&$\007\002\003BV\005;\003\r!a\022\002\023\025tW-\\=US6,\007b\002BX\027\021\005!\021W\001\013O\026$Hk\0348h\031><G#B\f\0034\nU\006B\002\034\003.\002\007q\007C\004\003B\t5\006\031A\030\t\017\te6\002\"\001\003<\006\001B-\0327fi\026$vN\\4NK6\024WM\035\013\006_\tu&q\030\005\007m\t]\006\031A\034\t\rA\0249\f1\0018\021\035\021\031m\003C\001\005\013\f\021\003Z3mKR,Gk\0348h\033\026l'-\032:t)\ry#q\031\005\007m\t\005\007\031A\034\t\017\t-7\002\"\001\003N\006qA-\0327fi\026$vN\\4C_N\034H\003BA6\005\037DaA\016Be\001\0049\004b\002Bj\027\021\005\021\021\\\001\021G2,\027M]!mYR{gn\032\"pgNDqAa6\f\t\003\t\031/\001\013va\022\fG/\032+p]\036\024un]:SKN,H\016\036\005\b\0057\\A\021\001Bo\003I!W\r\\3uKR{gn\032\"pgN\024\026M\\6\025\t\005-$q\034\005\007m\te\007\031A\034\t\017\t\r8\002\"\001\003f\006!B-\0327fi\026$vN\\4C_N\034(+Z:vYR$B!a\033\003h\"1aG!9A\002]BqAa;\f\t\003\021i/\001\neK2,G/\032+p]\036\034FO]8oO\026\024H\003BA6\005_DaA\016Bu\001\0049\004b\002Bz\027\021\005!Q_\001\033I\026dW\r^3QY\006LXM\035+p]\036\024un]:SKN,H\016\036\013\005\003W\0229\020\003\004q\005c\004\ra\016\005\b\005w\\A\021\001B\003)!W\r\\3uKR{gn\032\013\005\003W\022y\020\003\0047\005s\004\ra\016\005\b\007\007YA\021AB\003\003I!W\r\\3uKR{gn\032*fY\006$\030n\0348\025\t\005-4q\001\005\b\005O\033\t\0011\0018\021\035\031\031a\003C\001\007\027!b!a\033\004\016\r=\001B\002\034\004\n\001\007q\007C\004\003(\016%\001\031A\034\t\017\rM1\002\"\001\004\026\005!B-\0327fi\026$vN\\4QY\006LXM]!qaN$B!a\033\004\030!1\001o!\005A\002]Bqaa\007\f\t\003\031i\"\001\tva\022\fG/\032+p]\036tu\016^5dKR1\0211NB\020\007CAaANB\r\001\0049\004bBA \0073\001\ra\016\005\b\007KYA\021AB\024\003U)\b\017Z1uKR{gn\032(v[\006sGMR5hQR$\002\"a\033\004*\r-2Q\006\005\007m\r\r\002\031A\034\t\r\t\033\031\0031\0010\021\035\t)pa\tA\002=Bqa!\r\f\t\003\031\031$\001\006bI\022$vN\\4M_\036$b!a\033\0046\r]\002B\002\034\0040\001\007q\007C\004\004:\r=\002\031A\034\002\0175,7o]1hK\"91QH\006\005\002\r}\022\001F;qI\006$X\rR3d\007\006\004\030\016^1m)&lW\rF\0030\007\003\032\031\005\003\0047\007w\001\ra\016\005\b\003o\031Y\0041\0010\021\035\0319e\003C\001\007\023\nq\"\0369eCR,Gk\0348h\031\0264X\r\034\013\t\003W\032Ye!\024\004P!1ag!\022A\002]Bq!a\013\004F\001\007q\006\003\005\004R\r\025\003\031AA$\003A!WmY0dCBLG/\0317`i&lW\rC\004\004V-!\taa\026\002\027\005$G\rV8oO\n{7o\035\013\025\003W\032Ifa\027\004`\r\r4qMB6\007_\032\031ha\036\t\rY\032\031\0061\0018\021\035\031ifa\025A\002=\nQBZ5hQR|&m\\:t?&$\007bBB1\007'\002\raL\001\013E>\0348o\0307fm\026d\007bBB3\007'\002\raL\001\bE>\0348o\0305q\021\035\031Iga\025A\002=\n1BY8tg~k\027\r_0ia\"91QNB*\001\0049\024A\0033fCRDwLY8tg\"A1\021OB*\001\004\t9%A\006de\026\fG/Z0uS6,\007bBB;\007'\002\raN\001\be\026<\030M\0353t\021\035\031Iha\025A\002]\n\001b\0342ti\006\034G.\032\005\b\007{ZA\021AB@\003=\tG\r\032+p]\036\024un]:SC:\\G\003DA6\007\003\033\031ia\"\004\f\016=\005B\002\034\004|\001\007q\007C\004\004\006\016m\004\031A\034\002\023Q|gnZ0oC6,\007bBBE\007w\002\raL\001\021i>$\030\r\\0iCJ$xL^1mk\026Dqa!$\004|\001\007q&\001\bu_R\fGn\0305beR|\006/\032:\t\017\rE51\020a\001_\005QAo\034;bY~#\030.\\3\t\017\rU5\002\"\001\004\030\0061R\017\0353bi\026$vN\\4C_N\034(j\\5o)&lW\rF\0030\0073\033i\n\003\005\004\034\016M\005\031AA$\003\021!\027\r^3\t\rY\032\031\n1\0018\021\035\031\tk\003C\001\007G\013A#\0369eCR,Gk\0348h\005>\0348OU3xCJ$G#B\030\004&\016\035\006bBB;\007?\003\ra\016\005\007m\r}\005\031A\034\t\017\r-6\002\"\001\004.\006QR\017\0353bi\026$vN\\4C_N\034h)[4ii6{gn\035;feR)qfa,\0042\"1ag!+A\002]Bqa!\030\004*\002\007q\006\003\004+\027\021\0051Q\027\013\006/\r]6\021\030\005\b\005#\032\031\f1\0010\021\035\021)fa-A\002=Baa!0\f\t\0031\022!F4fiR{gn\032\"pgN\024\026M\\6Cs\"\013'\017\036\005\b\0057\\A\021AAr\021\035\031\031m\003C\001\007\013\fa\"\0369eCR,7\013\036:p]\036,'\017F\0040\007\017\034Ima3\t\r\035\033\t\r1\0018\021\031\t7\021\031a\001o!91QZBa\001\004y\023\001C8qK:$\026m]6\t\017\rE7\002\"\001\004T\006Yq-\032;TiJ|gnZ3s)\r\t3Q\033\005\007\017\016=\007\031A\034\t\017\re7\002\"\001\004\\\006yq-\032;TiJ|gnZ3s\023:4w\016F\002\"\007;DaaRBl\001\0049\004bBBq\027\021\00511]\001\016O\026$\030\t\0347U_:<\027\nZ:\026\005\r\025\bc\001\r\037o!91\021^\006\005\002\r-\030A\0043fY\006cGn\025;s_:<WM]\013\002_!91q^\006\005\002\rE\030!\0042vS2$7\013\036:p]\036,'\017F\002\"\007gDaaRBw\001\0049\004bBB|\027\021\00511^\001\016I\026d\027\t\0347X_J\034\b.\0339\t\017\rm8\002\"\001\004~\006Qq-\032;X_J\034\b.\0339\025\007\005\032y\020\003\004b\007s\004\ra\016\005\b\t\007YA\021\001C\003\0035)\b\017Z1uK^{'o\0355jaRA\0211\016C\004\t\023!i\001\003\004b\t\003\001\ra\016\005\t\t\027!\t\0011\001\002H\005Yqo\034:tQ&\004H+[7f\021!!y\001\"\001A\002\005\035\023a\004:fcV,7\017\036+bg.$\026.\\3\t\017\021M1\002\"\001\002Z\006\031R\017\0353bi\026$vN\\4C_N\0348\t[3ti\"9AqC\006\005\002\021e\021aE;qI\006$X\rV8oO\n{7o\035'fm\026dGCBA6\t7!i\002\003\0047\t+\001\ra\016\005\b\007C\")\0021\0010\021\035!\tc\003C\001\tG\t\021dZ3u)>twMQ8tgJ+7/\0367u\005f\034\025M]3feR)q\003\"\n\005(!9\021q\006C\020\001\004y\003B\002\034\005 \001\007q\007C\004\005,-!\t\001\"\f\002+\035,G\017V8oO:\013W.\032\"z!2\f\0270\032:JIR\031q\007b\f\t\rA$I\0031\0018\021\035!\031d\003C\001\tk\t\001#\0313e)>tw\rR8oCR,Gj\\4\025\021\005-Dq\007C\035\t{AaA\016C\031\001\0049\004b\002C\036\tc\001\raN\001\004[N<\007\002\003C \tc\001\r!a\022\002\021\005$Gm\030;j[\026Dq\001b\021\f\t\003!)%\001\thKR$vN\\4E_:\fG/\032'pOR!Aq\tC+!\025!I\005b\025\"\033\t!YE\003\003\005N\021=\023!C5n[V$\030M\0317f\025\r!\tFG\001\013G>dG.Z2uS>t\027bA\020\005L!1a\007\"\021A\002]Ba\001\"\027\f\t\0031\022!D4fiR{gnZ*lS2d7\017C\004\005^-!\t\001b\030\002'\035,G\017V8oOBc\027-_3s'.LG\016\\:\025\007]!\t\007\003\004b\t7\002\ra\016\005\b\tKZA\021\001C4\003=)\b\017Z1uKR{gnZ*lS2dGcB\030\005j\021-Dq\016\005\007m\021\r\004\031A\034\t\017\0215D1\ra\001_\005A1o[5mY~KG\rC\004\002,\021\r\004\031A\030\t\017\021M4\002\"\001\005v\005)R\017\0353bi\026$vN\\4QY\006LXM]*lS2dGcB\030\005x\021eD1\020\005\007a\022E\004\031A\034\t\017\0215D\021\017a\001_!9\0211\006C9\001\004y\003b\002C@\027\021\005A\021Q\001\016C\022$Gk\0348h'\006d\027M]=\025\007=\"\031\t\003\004q\t{\002\ra\016\005\007\t\017[A\021\001\f\002\033\035,G\017V8oON\013G.\031:z\021\035!Yi\003C\001\003G\f\001\003Z3mKR,Gk\0348h'\006d\027M]=\t\017\021=5\002\"\001\005\022\006!R\017\0353bi\026$vN\\4QY\006LXM\035(b[\026$Ra\fCJ\t+Ca\001\035CG\001\0049\004bBA\022\t\033\003\ra\016\005\b\t3[A\021\001CN\003E9W\r\036+p]\036\024\025\r\036;mK2K7\017^\013\002/!9AqT\006\005\002\r-\030a\0053fY\026$X-\0217m)>twMQ1ui2,\007b\002CR\027\021\005AQU\001\021I\026dW\r^3U_:<')\031;uY\026$2a\fCT\021\0319E\021\025a\001o!9A1V\006\005\002\0215\026!D1eIR{gn\032\"biRdW\r\006\t\002l\021=F\021\027C[\ts#i\f\"1\005F\"1q\t\"+A\002]Bq\001b-\005*\002\007q&A\003q_&tG\017C\004\0058\022%\006\031A\030\002\021\031Lw\r\033;j]\036Dq\001b/\005*\002\007q&A\006nK6\024WM]\"pk:$\bb\002C`\tS\003\raL\001\ti>twMU1oW\"9A1\031CU\001\0049\024a\0034jeN$Hk\0348h\023\022Dq\001b2\005*\002\007q'\001\007tK\016|g\016\032+p]\036LE\rC\004\005L.!\t\001\"4\002+U\004H-\031;f)>twMQ1ui2,g)[4iiR1\0211\016Ch\t#Daa\022Ce\001\0049\004b\002C\\\t\023\004\ra\f\005\b\t+\\A\021\001Cl\003\021i\027-\0338\025\t\005-D\021\034\005\t\t7$\031\0161\001\005^\006!\021M]4t!\021IBq\\\034\n\007\021\005(DA\003BeJ\f\027\020")
public final class TongService {
  public static void main(String[] paramArrayOfString) {
    TongService$.MODULE$.main(paramArrayOfString);
  }
  
  public static void updateTongBattleFight(String paramString, int paramInt) {
    TongService$.MODULE$.updateTongBattleFight(paramString, paramInt);
  }
  
  public static void addTongBattle(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString2, String paramString3) {
    TongService$.MODULE$.addTongBattle(paramString1, paramInt1, paramInt2, paramInt3, paramInt4, paramString2, paramString3);
  }
  
  public static int deleteTongBattle(String paramString) {
    return TongService$.MODULE$.deleteTongBattle(paramString);
  }
  
  public static int deleteAllTongBattle() {
    return TongService$.MODULE$.deleteAllTongBattle();
  }
  
  public static List<MapBean> getTongBattleList() {
    return TongService$.MODULE$.getTongBattleList();
  }
  
  public static int updateTongPlayerName(String paramString1, String paramString2) {
    return TongService$.MODULE$.updateTongPlayerName(paramString1, paramString2);
  }
  
  public static int deleteTongSalary() {
    return TongService$.MODULE$.deleteTongSalary();
  }
  
  public static List<MapBean> getTongSalary() {
    return TongService$.MODULE$.getTongSalary();
  }
  
  public static int addTongSalary(String paramString) {
    return TongService$.MODULE$.addTongSalary(paramString);
  }
  
  public static int updateTongPlayerSkill(String paramString, int paramInt1, int paramInt2) {
    return TongService$.MODULE$.updateTongPlayerSkill(paramString, paramInt1, paramInt2);
  }
  
  public static int updateTongSkill(String paramString, int paramInt1, int paramInt2) {
    return TongService$.MODULE$.updateTongSkill(paramString, paramInt1, paramInt2);
  }
  
  public static List<MapBean> getTongPlayerSkills(String paramString) {
    return TongService$.MODULE$.getTongPlayerSkills(paramString);
  }
  
  public static List<MapBean> getTongSkills() {
    return TongService$.MODULE$.getTongSkills();
  }
  
  public static List<MapBean> getTongDonateLog(String paramString) {
    return TongService$.MODULE$.getTongDonateLog(paramString);
  }
  
  public static void addTongDonateLog(String paramString1, String paramString2, Date paramDate) {
    TongService$.MODULE$.addTongDonateLog(paramString1, paramString2, paramDate);
  }
  
  public static String getTongNameByPlayerId(String paramString) {
    return TongService$.MODULE$.getTongNameByPlayerId(paramString);
  }
  
  public static List<MapBean> getTongBossResultByCareer(int paramInt, String paramString) {
    return TongService$.MODULE$.getTongBossResultByCareer(paramInt, paramString);
  }
  
  public static void updateTongBossLevel(String paramString, int paramInt) {
    TongService$.MODULE$.updateTongBossLevel(paramString, paramInt);
  }
  
  public static void updateTongBossChest() {
    TongService$.MODULE$.updateTongBossChest();
  }
  
  public static void updateWorship(String paramString, Date paramDate1, Date paramDate2) {
    TongService$.MODULE$.updateWorship(paramString, paramDate1, paramDate2);
  }
  
  public static MapBean getWorship(String paramString) {
    return TongService$.MODULE$.getWorship(paramString);
  }
  
  public static int delAllWorship() {
    return TongService$.MODULE$.delAllWorship();
  }
  
  public static MapBean buildStronger(String paramString) {
    return TongService$.MODULE$.buildStronger(paramString);
  }
  
  public static int delAllStronger() {
    return TongService$.MODULE$.delAllStronger();
  }
  
  public static List<String> getAllTongIds() {
    return TongService$.MODULE$.getAllTongIds();
  }
  
  public static MapBean getStrongerInfo(String paramString) {
    return TongService$.MODULE$.getStrongerInfo(paramString);
  }
  
  public static MapBean getStronger(String paramString) {
    return TongService$.MODULE$.getStronger(paramString);
  }
  
  public static int updateStronger(String paramString1, String paramString2, int paramInt) {
    return TongService$.MODULE$.updateStronger(paramString1, paramString2, paramInt);
  }
  
  public static int deleteTongBossRank() {
    return TongService$.MODULE$.deleteTongBossRank();
  }
  
  public static List<MapBean> getTongBossRankByHart() {
    return TongService$.MODULE$.getTongBossRankByHart();
  }
  
  public static List<MapBean> getTongBossRank(int paramInt1, int paramInt2) {
    return TongService$.MODULE$.getTongBossRank(paramInt1, paramInt2);
  }
  
  public static int updateTongBossFightMonster(String paramString, int paramInt) {
    return TongService$.MODULE$.updateTongBossFightMonster(paramString, paramInt);
  }
  
  public static int updateTongBossReward(String paramString1, String paramString2) {
    return TongService$.MODULE$.updateTongBossReward(paramString1, paramString2);
  }
  
  public static int updateTongBossJoinTime(Date paramDate, String paramString) {
    return TongService$.MODULE$.updateTongBossJoinTime(paramDate, paramString);
  }
  
  public static void addTongBossRank(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3) {
    TongService$.MODULE$.addTongBossRank(paramString1, paramString2, paramInt1, paramInt2, paramInt3);
  }
  
  public static void addTongBoss(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString2, Date paramDate, String paramString3, String paramString4) {
    TongService$.MODULE$.addTongBoss(paramString1, paramInt1, paramInt2, paramInt3, paramInt4, paramString2, paramDate, paramString3, paramString4);
  }
  
  public static void updateTongLevel(String paramString, int paramInt, Date paramDate) {
    TongService$.MODULE$.updateTongLevel(paramString, paramInt, paramDate);
  }
  
  public static int updateDecCapitalTime(String paramString, int paramInt) {
    return TongService$.MODULE$.updateDecCapitalTime(paramString, paramInt);
  }
  
  public static void addTongLog(String paramString1, String paramString2) {
    TongService$.MODULE$.addTongLog(paramString1, paramString2);
  }
  
  public static void updateTongNumAndFight(String paramString, int paramInt1, int paramInt2) {
    TongService$.MODULE$.updateTongNumAndFight(paramString, paramInt1, paramInt2);
  }
  
  public static void updateTongNotice(String paramString1, String paramString2) {
    TongService$.MODULE$.updateTongNotice(paramString1, paramString2);
  }
  
  public static void deleteTongPlayerApps(String paramString) {
    TongService$.MODULE$.deleteTongPlayerApps(paramString);
  }
  
  public static void deleteTongRelation(String paramString1, String paramString2) {
    TongService$.MODULE$.deleteTongRelation(paramString1, paramString2);
  }
  
  public static void deleteTongRelation(String paramString) {
    TongService$.MODULE$.deleteTongRelation(paramString);
  }
  
  public static void deleteTong(String paramString) {
    TongService$.MODULE$.deleteTong(paramString);
  }
  
  public static void deletePlayerTongBossResult(String paramString) {
    TongService$.MODULE$.deletePlayerTongBossResult(paramString);
  }
  
  public static void deleteTongStronger(String paramString) {
    TongService$.MODULE$.deleteTongStronger(paramString);
  }
  
  public static void deleteTongBossResult(String paramString) {
    TongService$.MODULE$.deleteTongBossResult(paramString);
  }
  
  public static void deleteTongBossRank(String paramString) {
    TongService$.MODULE$.deleteTongBossRank(paramString);
  }
  
  public static int updateTongBossResult() {
    return TongService$.MODULE$.updateTongBossResult();
  }
  
  public static void clearAllTongBoss() {
    TongService$.MODULE$.clearAllTongBoss();
  }
  
  public static void deleteTongBoss(String paramString) {
    TongService$.MODULE$.deleteTongBoss(paramString);
  }
  
  public static int deleteTongMembers(String paramString) {
    return TongService$.MODULE$.deleteTongMembers(paramString);
  }
  
  public static int deleteTongMember(String paramString1, String paramString2) {
    return TongService$.MODULE$.deleteTongMember(paramString1, paramString2);
  }
  
  public static List<MapBean> getTongLog(String paramString, int paramInt) {
    return TongService$.MODULE$.getTongLog(paramString, paramInt);
  }
  
  public static int addTongRelation(String paramString1, String paramString2, Date paramDate) {
    return TongService$.MODULE$.addTongRelation(paramString1, paramString2, paramDate);
  }
  
  public static void updateTongCheck(String paramString, int paramInt) {
    TongService$.MODULE$.updateTongCheck(paramString, paramInt);
  }
  
  public static List<MapBean> getTongRelation(String paramString) {
    return TongService$.MODULE$.getTongRelation(paramString);
  }
  
  public static void updateTongNum(String paramString, int paramInt) {
    TongService$.MODULE$.updateTongNum(paramString, paramInt);
  }
  
  public static void updateTongOwnerName(String paramString1, String paramString2, String paramString3) {
    TongService$.MODULE$.updateTongOwnerName(paramString1, paramString2, paramString3);
  }
  
  public static void updateTongMemberStatus(String paramString1, String paramString2, int paramInt) {
    TongService$.MODULE$.updateTongMemberStatus(paramString1, paramString2, paramInt);
  }
  
  public static int getTongIndex(String paramString) {
    return TongService$.MODULE$.getTongIndex(paramString);
  }
  
  public static List<MapBean> getEnemyTongOrderByCapital(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    return TongService$.MODULE$.getEnemyTongOrderByCapital(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public static List<MapBean> getTongOrderByCapital(int paramInt1, int paramInt2) {
    return TongService$.MODULE$.getTongOrderByCapital(paramInt1, paramInt2);
  }
  
  public static List<MapBean> getPlayerTongApp(String paramString) {
    return TongService$.MODULE$.getPlayerTongApp(paramString);
  }
  
  public static void deleteTongApps(String paramString) {
    TongService$.MODULE$.deleteTongApps(paramString);
  }
  
  public static void deleteTongApp(String paramString1, String paramString2) {
    TongService$.MODULE$.deleteTongApp(paramString1, paramString2);
  }
  
  public static int getTongNumber(String paramString) {
    return TongService$.MODULE$.getTongNumber(paramString);
  }
  
  public static int getTongAppsNum(String paramString) {
    return TongService$.MODULE$.getTongAppsNum(paramString);
  }
  
  public static List<MapBean> getTongApps(String paramString) {
    return TongService$.MODULE$.getTongApps(paramString);
  }
  
  public static MapBean getTongApp(String paramString1, String paramString2) {
    return TongService$.MODULE$.getTongApp(paramString1, paramString2);
  }
  
  public static void addTongApp(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, Date paramDate) {
    TongService$.MODULE$.addTongApp(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramInt3, paramDate);
  }
  
  public static int clearDonateRecord() {
    return TongService$.MODULE$.clearDonateRecord();
  }
  
  public static void clearDonateAndWeekDonate() {
    TongService$.MODULE$.clearDonateAndWeekDonate();
  }
  
  public static void clearDonate() {
    TongService$.MODULE$.clearDonate();
  }
  
  public static void updateTongMemberSalary(String paramString1, String paramString2) {
    TongService$.MODULE$.updateTongMemberSalary(paramString1, paramString2);
  }
  
  public static void updateTongMemberDonate(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    TongService$.MODULE$.updateTongMemberDonate(paramString, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
  }
  
  public static boolean isExistName(String paramString) {
    return TongService$.MODULE$.isExistName(paramString);
  }
  
  public static void addTongMember(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, Date paramDate, String paramString4) {
    TongService$.MODULE$.addTongMember(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramDate, paramString4);
  }
  
  public static void updateTongCapital(String paramString, int paramInt1, int paramInt2) {
    TongService$.MODULE$.updateTongCapital(paramString, paramInt1, paramInt2);
  }
  
  public static int updateTongExp(String paramString, int paramInt1, int paramInt2) {
    return TongService$.MODULE$.updateTongExp(paramString, paramInt1, paramInt2);
  }
  
  public static String addTong(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString4, int paramInt6, Date paramDate) {
    return TongService$.MODULE$.addTong(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramString4, paramInt6, paramDate);
  }
  
  public static List<MapBean> getTongMembersAndLoginOut(String paramString) {
    return TongService$.MODULE$.getTongMembersAndLoginOut(paramString);
  }
  
  public static MapBean getTongMemberStatus(String paramString1, String paramString2) {
    return TongService$.MODULE$.getTongMemberStatus(paramString1, paramString2);
  }
  
  public static List<MapBean> getTongMembersByStatus(String paramString, int paramInt1, int paramInt2) {
    return TongService$.MODULE$.getTongMembersByStatus(paramString, paramInt1, paramInt2);
  }
  
  public static List<MapBean> getTongMembers(String paramString) {
    return TongService$.MODULE$.getTongMembers(paramString);
  }
  
  public static List<MapBean> getTongMembers(List<String> paramList, int paramInt) {
    return TongService$.MODULE$.getTongMembers(paramList, paramInt);
  }
  
  public static List<MapBean> getTongMembers(String paramString1, String paramString2, int paramInt) {
    return TongService$.MODULE$.getTongMembers(paramString1, paramString2, paramInt);
  }
  
  public static int addTongBossChest(String paramString1, String paramString2) {
    return TongService$.MODULE$.addTongBossChest(paramString1, paramString2);
  }
  
  public static MapBean getTongBossChest(String paramString) {
    return TongService$.MODULE$.getTongBossChest(paramString);
  }
  
  public static MapBean getTongMember(String paramString) {
    return TongService$.MODULE$.getTongMember(paramString);
  }
  
  public static List<MapBean> getTongByNameOrId(String paramString) {
    return TongService$.MODULE$.getTongByNameOrId(paramString);
  }
  
  public static List<MapBean> getTongs(List<String> paramList) {
    return TongService$.MODULE$.getTongs(paramList);
  }
  
  public static MapBean getTong(String paramString) {
    return TongService$.MODULE$.getTong(paramString);
  }
  
  public static int getTongFight(String paramString) {
    return TongService$.MODULE$.getTongFight(paramString);
  }
  
  public static List<MapBean> getTongsByLevel(int paramInt) {
    return TongService$.MODULE$.getTongsByLevel(paramInt);
  }
  
  public static MapBean getTongBossRankById(String paramString) {
    return TongService$.MODULE$.getTongBossRankById(paramString);
  }
  
  public static List<MapBean> getTongBossRank(int paramInt) {
    return TongService$.MODULE$.getTongBossRank(paramInt);
  }
  
  public static List<MapBean> getTongBossRank() {
    return TongService$.MODULE$.getTongBossRank();
  }
  
  public static List<MapBean> getTongBoss() {
    return TongService$.MODULE$.getTongBoss();
  }
  
  public static List<MapBean> getTongs() {
    return TongService$.MODULE$.getTongs();
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    TongService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    TongService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return TongService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    TongService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    TongService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return TongService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    TongService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    TongService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return TongService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    TongService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    TongService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return TongService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    TongService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    TongService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return TongService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return TongService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return TongService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\TongService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */