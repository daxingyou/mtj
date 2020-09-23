package com.nirvana.service;

import com.nirvana.core.MapBean;
import grizzled.slf4j.Logger;
import java.util.Date;
import scala.Function0;
import scala.collection.immutable.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\031}s!B\001\003\021\003I\021!\004)mCf,'oU3sm&\034WM\003\002\004\t\00591/\032:wS\016,'BA\003\007\003\035q\027N\035<b]\006T\021aB\001\004G>l7\001\001\t\003\025-i\021A\001\004\006\031\tA\t!\004\002\016!2\f\0270\032:TKJ4\030nY3\024\005-q\001C\001\006\020\023\t\001\"AA\bBEN$(/Y2u'\026\024h/[2f\021\025\0212\002\"\001\024\003\031a\024N\\5u}Q\t\021\002C\003\026\027\021\005a#A\005oK^\004F.Y=feRAq#I\022)U1r\003\007\005\002\031=9\021\021\004H\007\0025)\t1$A\003tG\006d\027-\003\002\0365\0051\001K]3eK\032L!a\b\021\003\rM#(/\0338h\025\ti\"\004C\003#)\001\007q#\001\005vg\026\024h.Y7f\021\025!C\0031\001&\003!\031XM\035<fe&#\007CA\r'\023\t9#DA\002J]RDQ!\013\013A\002]\tAA\\1nK\")1\006\006a\001K\005!1.\0338e\021\025iC\0031\001&\003\r\031X\r\037\005\006_Q\001\r!J\001\003QBDQ!\r\013A\002\025\n!!\0349\t\013MZA\021\002\033\002\031%t\027\016\036#C!2\f\0270\032:\025\tUB$h\017\t\0033YJ!a\016\016\003\tUs\027\016\036\005\006sI\002\raF\001\ta2\f\0270\032:JI\")qF\ra\001K!)\021G\ra\001K!)Qh\003C\001}\005qq-\032;OK^\004F.Y=fe&#G#B\f@\001\006\023\005\"\002\022=\001\0049\002\"B\025=\001\0049\002\"B\026=\001\004)\003\"B\027=\001\004)\003\"\002#\f\t\003)\025!C4fiBc\027-_3s)\t1E\n\005\002H\0256\t\001J\003\002J\t\005!1m\034:f\023\tY\005JA\004NCB\024U-\0318\t\013e\032\005\031A\f\t\0139[A\021A(\002)\035,G\017\0257bs\026\0248OQ=Vg\026\024h.Y7f)\r\001v\013\027\t\004#R3eBA\rS\023\t\031&$A\004qC\016\\\027mZ3\n\005U3&\001\002'jgRT!a\025\016\t\013\tj\005\031A\f\t\013\021j\005\031A\023\t\013i[A\021A.\002\037\035,G\017\0257bs\026\024()\037(b[\026$\"A\022/\t\013%J\006\031A\f\t\013y[A\021A0\0021\035,G\017\0257bs\026\0248i\\;oi\nKXk]3s]\006lW\rF\002&A\006DQAI/A\002]AQ\001J/A\002\025BQaY\006\005\002\021\f\001\"Y;u_:\013W.\032\013\003/\025DQ!\f2A\002\025BQaZ\006\005\002!\f1\"[:Fq&\034HOT1nKR\021\021\016\034\t\0033)L!a\033\016\003\017\t{w\016\\3b]\")\021F\032a\001/!)1m\003C\005]R\031qc\0349\t\0135j\007\031A\023\t\013El\007\031A\023\002\013QLW.Z:\t\013M\\A\021\001;\002\021\035,G\017T8hS:$\"AR;\t\013e\022\b\031A\f\t\013]\\A\021\001=\002\025\035,GOT3xE&,7\017\006\002Qs\")\021H\036a\001/!)1p\003C\001y\006iQ\017\0353bi\026tUm\0362jKN$r!J?\003\003\t)\001C\003:u\002\007q\003C\003\000u\002\007Q%\001\002jI\"1\0211\001>A\002\025\n!a\035;\t\017\005\035!\0201\001\002\n\005A\021\r\0323`i&lW\r\005\003\002\f\005UQBAA\007\025\021\ty!!\005\002\tU$\030\016\034\006\003\003'\tAA[1wC&!\021qCA\007\005\021!\025\r^3\t\017\005m1\002\"\001\002\036\005yQ\017\0353bi\026dunZ5o)&lW\rF\0026\003?Aa!OA\r\001\0049\002bBA\022\027\021\005\021QE\001\021kB$\027\r^3M_\036|W\017\036+j[\026$R!NA\024\003SAa!OA\021\001\0049\002\002CA\026\003C\001\r!!\f\002\037\r,(o\0248mS:,7+Z2p]\022\0042!GA\030\023\r\t\tD\007\002\005\031>tw\rC\004\0026-!\t!a\016\0023U\004H-\031;f\037\0324G.\0338f%\026l\027-\0338NS:,H/\032\013\006k\005e\0221\b\005\007s\005M\002\031A\f\t\017\005u\0221\007a\001K\005\031rN\0324mS:,'+Z7bS:l\025N\\;uK\"9\021\021I\006\005\002\005\r\023aC;qI\006$X\rT3wK2$r!JA#\003\017\nY\005\003\004:\003\001\ra\006\005\t\003\023\ny\0041\001\002.\005\031Q\r\0379\t\017\0055\023q\ba\001K\005)A.\032<fY\"9\021\021K\006\005\002\005M\023!C;qI\006$X-\022=q)\025)\023QKA,\021\031I\024q\na\001/!A\021\021JA(\001\004\ti\003C\004\002\\-!\t!!\030\002\017\035,G/\021;ueR\031a)a\030\t\re\nI\0061\001\030\021\035\t\031g\003C\001\003K\n\001bZ3u\031\0264X\r\034\013\004K\005\035\004BB\035\002b\001\007q\003C\004\002l-!\t!!\034\002\023U\004H-\031;f\025>\024G#B\023\002p\005E\004BB\035\002j\001\007q\003C\004\002t\005%\004\031A\023\002\007)|'\rC\004\002x-!\t!!\037\002\025U\004H-\031;f\023\016|g\016F\003&\003w\ni\b\003\004:\003k\002\ra\006\005\b\003\n)\b1\001\030\003\021I7m\0348\t\017\005\r5\002\"\001\002\006\006qQ\017\0353bi\0264\025n\0325uS:<G#B\023\002\b\006%\005BB\035\002\002\002\007q\003C\004\002\f\006\005\005\031A\023\002\021\031Lw\r\033;j]\036Dq!a$\f\t\003\t\t*\001\007hKR$vN\\4GS\036DG\017F\002&\003'Cq!!&\002\016\002\007q#\001\004u_:<\027\n\032\005\b\0033[A\021AAN\003))\b\017Z1uK\"\003X\n\035\013\bK\005u\025qTAQ\021\031I\024q\023a\001/!1q&a&A\002\025Ba!MAL\001\004)\003bBAS\027\021\005\021qU\001\021kB$\027\r^3SK\006dW\016T3wK2$r!JAU\003W\013y\013\003\004:\003G\003\ra\006\005\b\003[\013\031\0131\001&\003)\021X-\0317n\031\0264X\r\034\005\b\003c\013\031\0131\001\030\003!\0318.\0337m'R\024\bbBA[\027\021\005\021qW\001\024kB$\027\r^3SK\006dWNR5hQRLgn\032\013\006k\005e\0261\030\005\007s\005M\006\031A\f\t\017\005-\0251\027a\001K!9\021qX\006\005\002\005\005\027aF;qI\006$XMU3bY6\034u.\0349bGRdUM^3m)\025)\0231YAc\021\031I\024Q\030a\001/!9\021qYA_\001\004)\023!\005:fC2l7i\\7qC\016$H*\032<fY\"9\0211Z\006\005\002\0055\027\001D;qI\006$X-\0227jq&\024H#B\023\002P\006E\007BB\035\002J\002\007q\003C\004\002T\006%\007\031A\f\002\023\025d\027\016_5s'R\024\bbBAl\027\021\005\021\021\\\001\rO\026$H*Y:u'\016,g.\032\013\004\r\006m\007BB\035\002V\002\007q\003C\004\002`.!\t!!9\002\037U\004H-\031;f\031\006\034HoU2f]\026$2#NAr\003K\fI/!<\002r\006U\030\021`A\005\003Aa!OAo\001\0049\002bBAt\003;\004\raF\001\bg\016,g.Z%e\021\035\tY/!8A\002\025\n\021\001\037\005\b\003_\fi\0161\001&\003\005I\bbBAz\003;\004\r!J\001\002u\"9\021q_Ao\001\0049\022aC5ogR\0346-\0328f\023\022Dq!a?\002^\002\007Q%A\003j]N$\b\fC\004\002\000\006u\007\031A\023\002\013%t7\017^-\t\017\t\r\021Q\034a\001K\005)\021N\\:u5\"9!qA\006\005\002\t%\021aF;qI\006$X\rT1ti&s7\017^1oG\026\0346-\0328f)-)$1\002B\007\005\037\021\tBa\005\t\re\022)\0011\001\030\021\035\t9P!\002A\002]Aq!a?\003\006\001\007Q\005C\004\002\000\n\025\001\031A\023\t\017\t\r!Q\001a\001K!9!qC\006\005\002\te\021\001D4fiBc\027-_3s\005\006<Gc\001$\003\034!1\021H!\006A\002]AqAa\b\f\t\003\021\t#A\bj]N,'\017\036)mCf,'OQ1h)\025)#1\005B\023\021\031I$Q\004a\001/!9!q\005B\017\001\004)\023\001B:ju\026DqAa\013\f\t\003\021i#A\thKRLen\035;b]\016,'+Z2pe\022$2\001\025B\030\021\031I$\021\006a\001/!9!1G\006\005\002\tU\022!E4fi&s7\017^1oG\026\024Vm^1sIR\031aIa\016\t\re\022\t\0041\001\030\021\035\021Yd\003C\001\005{\tA#\0338tKJ$\030J\\:uC:\034WMU3d_J$G#F\023\003@\t\005#Q\tB%\005\033\022\tF!\026\003Z\tu#\021\r\005\007s\te\002\031A\f\t\017\t\r#\021\ba\001/\005Q\021N\\:uC:\034W-\0233\t\017\t\035#\021\ba\001K\005!A/[7f\021\035\021YE!\017A\002\025\nQa]<fKBDqAa\024\003:\001\007Q%\001\003ti\006\024\bb\002B*\005s\001\r!J\001\bkN,G+[7f\021\035\0219F!\017A\002\025\n1B]3tKR|F/[7fg\"9!1\fB\035\001\004)\023A\0033be\026|F/[7fg\"9!q\fB\035\001\004)\023aC:xK\026\004x\f^5nKNDqAa\031\003:\001\007Q%\001\007gSJ\034Ho\030:fo\006\024H\rC\004\003h-!\tA!\033\0023U\004H-\031;f\023:\034H/\0318dKJ+7m\034:e)&lWm\035\013\bk\t-$Q\016B8\021\031I$Q\ra\001/!9!1\tB3\001\0049\002b\002B$\005K\002\r!\n\005\b\005gZA\021\001B;\003UIgn]3si&s7\017^1oG\026\024Vm^1sIN$R\"\nB<\005s\022iH!!\003\006\n%\005BB\035\003r\001\007q\003C\004\003|\tE\004\031A\f\002\035I,w/\031:eg~\023XmY8sI\"9!q\020B9\001\0049\022a\005;po\026\024xLZ5sgR|&/Z<be\022\034\bb\002BB\005c\002\r!J\001\025i><XM]0to\026,\007oX3oI~#\030.\\3\t\017\t\035%\021\017a\001/\005\031Bo\\<fe~\033x/Z3q?J,w/\031:eg\"9!1\022B9\001\0049\022AE3ya\026\024\030.\0328dK~\023Xm^1sINDqAa$\f\t\003\021\t*\001\fsKN,G/\022=qKJLWM\\2f%\026<\030M\0353t)\005)\003b\002BK\027\021\005!qS\001\025kB$\027\r^3J]N$\030M\\2f%\026\034wN\0353\025\033\025\022IJa'\003\036\n}%\021\025BR\021\031I$1\023a\001/!9!1\tBJ\001\0049\002b\002B$\005'\003\r!\n\005\b\005?\022\031\n1\001&\021\035\021yEa%A\002\025BqAa\025\003\024\002\007Q\005C\004\003(.!\tA!%\0021I,7/\032;J]N$\030M\\2f%\026\034wN\0353US6,7\017C\004\003,.!\tA!,\002!\035,G/\0238ti\006t7-\032*b].\034Hc\001)\0030\"9!\021\027BU\001\004)\023\001\002;za\026DqA!.\f\t\003\0219,\001\nva\022\fG/Z%ogR\fgnY3SC:\\G#D\023\003:\nm&Q\030Ba\005\007\0249\rC\004\003D\tM\006\031A\f\t\017\tE&1\027a\001K!9!q\030BZ\001\004)\023A\002:b].LE\r\003\004:\005g\003\ra\006\005\b\005\013\024\031\f1\001\030\003)\001H.Y=fe:\013W.\032\005\b\005\017\022\031\f1\001&\021\035\021Ym\003C\001\005\033\fA\"\0313e)><XM\035*b].$2\"\nBh\005#\024)Na6\003\\\"1\021H!3A\002]AqAa5\003J\002\007Q%A\006qY\006LXM\035'fm\026d\007b\002Bc\005\023\004\ra\006\005\b\0053\024I\r1\001&\003\031\031\027M]3fe\"9!Q\034Be\001\004)\023AB2vgR|W\016C\004\003b.!\tAa9\002\037\021,G.\032;f)><XM\035*b].$2!\nBs\021\031I$q\034a\001/!9!\021^\006\005\002\tE\025aD2mK\006\024\b\013\\1zKJd\025N\\3\t\017\t58\002\"\001\003p\006iq-\032;QY\006LXM\035+fC6$2A\022By\021\031I$1\036a\001/!9!Q_\006\005\002\t]\030\001E;qI\006$X\r\0257bs\026\024H+Z1n)\035)#\021 B~\005Da!\017Bz\001\0049\002b\002B\005g\004\r!J\001\007S:4\030\016^3\t\017\r\005!1\037a\001K\0051\021mY2faRDqa!\002\f\t\003\0319!A\007hKR\034\006n\0349SK\016|'\017\032\013\004!\016%\001BB\035\004\004\001\007q\003C\004\004\016-!\taa\004\002!U\004H-\031;f'\"|\007OU3d_J$G#C\023\004\022\rM1qCB\016\021\031I41\002a\001/!91QCB\006\001\004)\023AB:i_BLE\rC\004\004\032\r-\001\031A\023\002\023A\024x\016Z;di&#\007b\002B$\007\027\001\r!\n\005\b\007?YA\021AB\021\003!9W\r^$vC*KGc\001$\004$!1\021h!\bA\002]Aqaa\n\f\t\003\031I#A\bva\022\fG/Z$vC*K'j]8o)\025)31FB\027\021\031I4Q\005a\001/!91qFB\023\001\0049\022\001\0026t_:Dqaa\r\f\t\003\031)$A\tva\022\fG/Z$vC*KW*\031=FqB$R!JB\034\007sAa!OB\031\001\0049\002\002CB\036\007c\001\r!!\f\002\0175\f\007pX3ya\"91qH\006\005\002\r\005\023!D4fi\022\023x\016]*d_J,7\017F\002Q\007\007Ba!OB\037\001\0049\002bBB$\027\021\0051\021J\001\021kB$\027\r^3Ee>\0048kY8sKN$\022\"JB&\007\033\032\tf!\026\t\re\032)\0051\001\030\021\035\031ye!\022A\002\025\na\001\032:pa&#\007bBB*\007\013\002\r!J\001\006g\016|'/\032\005\b\007/\032)\0051\001&\003)\0318.\0339`i&lWm\035\005\b\0077ZA\021AB/\003E9W\r\036)mCf,'/Q2uSZLG/\037\013\004\r\016}\003BB\035\004Z\001\007q\003C\004\004d-!\ta!\032\002%\035,G/Q2uSZLG/\037*fG>\024Hm\035\013\004!\016\035\004BB\035\004b\001\007q\003C\004\004l-!\ta!\034\002)U\004H-\031;f\003\016$\030N^5usJ+7m\034:e)5)3qNB:\007o\032Yha \004\004\"91\021OB5\001\0049\022!\0039mCf,'oX5e\021\035\031)h!\033A\002\025\n\021\"Y2uSZ,w,\0333\t\017\re4\021\016a\001K\005aa-\0338jg\"|F/[7fg\"91QPB5\001\004)\023!\0057bgR|f-\0338jg\"|F/[7fg\"91\021QB5\001\004)\023a\004:fa2,g.[:i?RLW.Z:\t\017\r\0255\021\016a\001K\005)a/\0317vK\"91\021R\006\005\002\tE\025!\006:fG>\024Hm\0244gY&tW-Q2uSZLG/\037\005\b\007\033[A\021ABH\003Q)\b\017Z1uKBc\027-_3s\003\016$\030N^5usRIQe!%\004\024\016]51\024\005\b\007c\032Y\t1\001\030\021\035\031)ja#A\002\025\nA\"Y2uSZ,wL^1mk\026Dqa!'\004\f\002\007q#A\007sK^\f'\017Z0sK\016|'\017\032\005\b\007;\033Y\t1\001&\003I\t7\r^5wK~3\030\r\\;f?R|G/\0317\t\017\r\0056\002\"\001\003\022\006\031\"/Z:fiBc\027-_3s\003\016$\030N^5us\"91QU\006\005\002\tE\025a\005:fg\026$\030i\031;jm&$\030PU3d_J$\007bBBU\027\021\00511V\001\022O\026$\b\013\\1zKJD\025\016\\1sSRLHc\001$\004.\"1\021ha*A\002]Aqa!-\f\t\003\031\031,\001\nhKRD\025\016\\1sSRL(+Z2pe\022\034Hc\001)\0046\"1\021ha,A\002]Aqa!/\f\t\003\031Y,\001\013va\022\fG/\032%jY\006\024\030\016^=SK\016|'\017\032\013\bK\ru6qXBb\021\035\031\tha.A\002]Aqa!1\0048\002\007Q%A\006iS2\f'/\033;z?&$\007bBBC\007o\003\r!\n\005\b\007\017\\A\021ABe\003Q)\b\017Z1uKBc\027-_3s\021&d\027M]5usRIQea3\004N\016=71\033\005\b\007c\032)\r1\001\030\021\035\031Ij!2A\002]Aqa!5\004F\002\007Q%\001\biS2\f'/\033;z?Z\fG.^3\t\017\rU7Q\031a\001K\005!\002.\0337be&$\030p\030<bYV,w\f^8uC2Dqa!7\f\t\003\021\t*\001\013eK2,G/\032%jY\006\024\030\016^=SK\016|'\017\032\005\b\007;\\A\021\001BI\003M\021Xm]3u!2\f\0270\032:IS2\f'/\033;z\021\035\031\to\003C\001\007G\fQaZ3u!.#2ARBs\021\031I4q\034a\001/!91\021^\006\005\002\r-\030\001C;qI\006$X\rU&\025\017\025\032ioa<\004t\"1\021ha:A\002]Aqa!=\004h\002\007Q%A\004qWZ\013G.^3\t\021\rU8q\035a\001\003\023\t!\"_3mY><H+[7f\021\035\031Ip\003C\001\007w\f\021dZ3u\007\026tG/\032:QY\006LXM\035\"z+N,'O\\1nKR!1Q C\006!\021\031y\020\026$\017\007\021\005!K\004\003\005\004\021%QB\001C\003\025\r!9\001C\001\007yI|w\016\036 \n\003mAaAIB|\001\0049\002b\002C\b\027\021\005A\021C\001\023kB$\027\r^3DK:$XM\035)mCf,'\017F\b6\t'!)\002b\006\005\032\021mAQ\004C\020\021\031IDQ\002a\001/!1!\005\"\004A\002]Aa\001\nC\007\001\004)\003BB\025\005\016\001\007q\003\003\004,\t\033\001\r!\n\005\007[\0215\001\031A\023\t\017\0055CQ\002a\001K!9A1E\006\005\002\021\025\022a\0043fY\016+g\016^3s!2\f\0270\032:\025\007\025\"9\003\003\004:\tC\001\ra\006\005\b\tWYA\021\001C\027\003Y\001xn\035;Va\022\fG/Z\"f]R,'\017\0257bs\026\024HcD\033\0050\021EB1\007C\033\to!I\004b\017\t\re\"I\0031\001\030\021\031\021C\021\006a\001/!1A\005\"\013A\002\025Ba!\013C\025\001\0049\002BB\026\005*\001\007Q\005\003\004.\tS\001\r!\n\005\b\003\033\"I\0031\001&\021\035!yd\003C\001\t\003\nqb\0317fCJ\034\006n\0349SK\016|'\017\032\013\002k!9AQI\006\005\002\tE\025!F2mK\006\0248\013^8sK\022\013\027\016\\=SK\016|'\017\032\005\b\t\023ZA\021\001BI\003Q\031G.Z1s'R|'/Z,fK.\024VmY8sI\"9AQJ\006\005\002\021=\023aE4fiBc\027-_3s'&l\007\017\\3J]\032|Gc\001$\005R!1\021\bb\023A\002]Aq\001\"\026\f\t\003!9&A\bhKR\034Fo\034:f%\026\034wN\0353t)\r\001F\021\f\005\007s\021M\003\031A\f\t\017\021u3\002\"\001\005`\005y\021\r\0323Ti>\024XMU3d_J$7\017F\006&\tC\"\031\007b\032\005j\0215\004BB\035\005\\\001\007q\003C\004\005f\021m\003\031A\023\002\021M$xN]3`S\022Da!\035C.\001\004)\003b\002C6\t7\002\r!J\001\fi>$\030\r\\0uS6,7\017C\004\005p\021m\003\031A\023\002\025],Wm[0uS6,7\017C\004\005t-!\t\001\"\036\002\033\035,G\017\0257bs\026\0248+[4o)\r1Eq\017\005\b\007c\"\t\b1\001\030\021\035!Yh\003C\001\t{\nQbZ3u!2\f\0270\032:MS:,Gc\001$\005\000!91\021\017C=\001\0049\002b\002CB\027\021\005AQQ\001\016C\022$\007\013\\1zKJd\025N\\3\025\033U\"9\t\"#\005\016\022EEQ\023CM\021\035\031\t\b\"!A\002]A\001\002b#\005\002\002\007\021QF\001\f_:d\027N\\3`i&lW\rC\004\005\020\022\005\005\031A\023\002\033=tG.\0338f?J,7m\034:e\021\035!\031\n\"!A\002\025\n!\002\\8hS:|F-Y=t\021\035!9\n\"!A\002]\t\001bZ3u?\022\f\027p\035\005\t\t7#\t\t1\001\002\n\005QA.Y:u?2|w-\0338\t\017\021}5\002\"\001\005\"\006i\021\r\0323QY\006LXM]*jO:$2\"\nCR\tK#I\013\",\0052\"91\021\017CO\001\0049\002b\002CT\t;\003\r!J\001\013g&<gn\030;j[\026\034\bb\002CV\t;\003\r!J\001\022g&<gnX3ya\026tGm\030;j[\026\034\bb\002CX\t;\003\r!J\001\013g&<gn\030;pi\006d\007\002\003CZ\t;\003\r!!\003\002\023MLwM\\0uS6,\007b\002C\\\027\021\005!\021S\001\020G2,\027M\035)mCf,'oU5h]\"9A1X\006\005\002\tE\025\001E2mK\006\024\b\013\\1zKJ\0346m\034:f\021\035!yl\003C\001\t\003\fq\"\0369eCR,\007\013\\1zKJ\024\025M\034\013\020k\021\rGQ\031Cd\t\027$i\r\"5\005V\"91\021\017C_\001\0049\002b\002BY\t{\003\r!\n\005\b\t\023$i\f1\001\030\003\031\021X-Y:p]\"A\021q\001C_\001\004\tI\001\003\005\005P\022u\006\031AA\005\003!)g\016Z0uS6,\007\002\003Cj\t{\003\r!!\003\002\023\rD\027\r^0uS6,\007b\002Cl\t{\003\raF\001\fG\"\fGo\030:fCN|g\016C\004\005\\.!\t\001\"8\002\037\021,G.\032;f!2\f\0270\032:CC:$2!\016Cp\021\035\031\t\b\"7A\002]Aq\001b9\f\t\003!)/A\007va\022\fG/Z+tKJ\024\025M\034\013\016k\021\035H1\036Cw\t_$\t\020b=\t\017\021%H\021\035a\001/\005IQo]3s?:\fW.\032\005\007I\021\005\b\031A\023\t\017\tEF\021\035a\001K!9A\021\032Cq\001\0049\002\002CA\004\tC\004\r!!\003\t\021\021=G\021\035a\001\003\023Aq\001b>\f\t\003!I0A\007eK2,G/Z+tKJ\024\025M\034\013\006k\021mHq \005\b\t{$)\0201\001\030\003\035)8/\032:`S\022Da\001\nC{\001\004)\003bBC\002\027\021\005QQA\001\rO\026$\b\013\\1zKJ\024\025M\034\013\004\r\026\035\001bBB9\013\003\001\ra\006\005\b\013\027YA\021AC\007\003)9W\r^+tKJ\024\025M\034\013\006\r\026=Q\021\003\005\b\t{,I\0011\001\030\021\031!S\021\002a\001K!9QQC\006\005\002\025]\021aD4fiV\033XM\035\"b]\nK8*Z=\025\023A+I\"\"\b\006\"\025\025\002bBC\016\013'\001\raF\001\003SBDq!b\b\006\024\001\007q#A\002nC\016Dq!b\t\006\024\001\007q#\001\003vI&$\007B\002\023\006\024\001\007Q\005C\004\006*-!\t!b\013\002\037\035,GOU3dQ\006\024x-Z$jMR$RARC\027\013_Aa!OC\024\001\0049\002bBC\031\013O\001\r!J\001\013e\026\034\007.\031:hK&#\007bBC\033\027\021\005QqG\001\023O\026$\030\t\0347SK\016D\027M]4f\017&4G\017F\002Q\013sAa!OC\032\001\0049\002bBC\037\027\021\005QqH\001\031S:\034\007\013\\1zKJ\024Vm\0315be\036,w)\0334u\035VlGcB\023\006B\025\rSQ\t\005\007s\025m\002\031A\f\t\017\025ER1\ba\001K!9QqIC\036\001\004)\023a\0018v[\"9Q1J\006\005\002\0255\023\001\0073fGBc\027-_3s%\026\034\007.\031:hK\036Kg\r\036(v[R9Q%b\024\006R\025M\003BB\035\006J\001\007q\003C\004\0062\025%\003\031A\023\t\021\025US\021\na\001\003\023\t\001\002\\1tiRKW.\032\005\b\0133ZA\021\001C!\003I\031G.Z1s!2\f\0270\032:ISN$xN]=\t\017\025u3\002\"\001\005B\005\t2/\031<f!2\f\0270\032:ISN$xN]=\t\017\025\0054\002\"\001\006d\005Qq-\032;ISN$xN]=\025\007\031+)\007C\004\004r\025}\003\031A\f\t\017\025%4\002\"\001\006l\005q\021\r\0323QY\006LXM\035*fC2lGcD\023\006n\025=T1OC<\013w*y(b!\t\017\rETq\ra\001/!9Q\021OC4\001\004)\023!\003:fC2lw\f\\3w\021\035))(b\032A\002\025\n\021C]3bY6|6m\\7qC\016$x\f\\3w\021\035)I(b\032A\002\025\n\001B]3bY6|\026\016\032\005\b\013{*9\0071\001\030\003=\021X-\0317n?N\\\027\016\0347`_:,\007bBCA\013O\002\raF\001\020e\026\fG.\\0tW&dGn\030;x_\"9QQQC4\001\004)\023A\004:fC2lwLZ5hQRLgn\032\005\b\013\023[A\021ACF\00399W\r\036)mCf,'OU3bY6$2ARCG\021\035\031\t(b\"A\002]Aq!\"%\f\t\003)\031*\001\fva\022\fG/\032)mCf,'OU3bY6\0346.\0337m)=)SQSCL\0133+Y*\"(\006 \026\005\006bBB9\013\037\003\ra\006\005\b\013c*y\t1\001&\021\035))(b$A\002\025Bq!\"\037\006\020\002\007Q\005C\004\006~\025=\005\031A\f\t\017\025\005Uq\022a\001/!9QQQCH\001\004)\003bBCS\027\021\005QqU\001\036kB$\027\r^3QY\006LXM\035*fC2l7i\\7qC\016$H*\032<fYR)Q%\"+\006,\"91\021OCR\001\0049\002bBC;\013G\003\r!\n\005\b\013_[A\021ACY\003A)\b\017Z1uKBc\027-_3s\035\006lW\rF\0036\013g+)\fC\004\004r\0255\006\031A\f\t\r%*i\0131\001\030\021\035)Il\003C\001\013w\013abZ3u!2\f\0270\032:Hk\006T\025\016F\002G\013{Cqa!\035\0068\002\007q\003C\004\006B.!\t!b1\002\033U\004H-\031;f\017J\f\007\017[5d)U)TQYCd\013\027,y-b5\006X\026mWq\\Cr\013ODqa!\035\006@\002\007q\003C\004\006J\026}\006\031A\023\002\033\035\024\030\r\0355jG~cWM^02\021\035)i-b0A\002\025\nQb\032:ba\"L7mX3ya~\013\004bBCi\013\003\r!J\001\016OJ\f\007\017[5d?2,go\030\032\t\017\025UWq\030a\001K\005iqM]1qQ&\034w,\032=q?JBq!\"7\006@\002\007Q%A\007he\006\004\b.[2`Y\0264xl\r\005\b\013;,y\f1\001&\00359'/\0319iS\016|V\r\0379`g!9Q\021]C`\001\004)\023!D4sCBD\027nY0mKZ|F\007C\004\006f\026}\006\031A\023\002\033\035\024\030\r\0355jG~+\007\020]05\021\035)I/b0A\002\025\nQAZ5hQRDq!\"<\f\t\003)y/\001\006hKR<%/\0319iS\016$2ARCy\021\035\031\t(b;A\002]Aq!\">\f\t\003)90A\bhKR$&/Z1tkJ,G*[:u)\r\001V\021 \005\b\007c*\031\0201\001\030\021\035)ip\003C\001\013\f1\"\0313e)J,\027m];sKRiQG\"\001\007\004\031\025aq\001D\005\r\027Aqa!\035\006|\002\007q\003\003\004\000\013w\004\r!\n\005\b\005c+Y\0201\001&\021\035\t\031!b?A\002\025B\021\"b\022\006|B\005\t\031A\023\t\023\0315Q1 I\001\002\0049\022\001\0039s_\036\024Xm]:\t\017\031E1\002\"\001\007\024\005Ar-\032;U_^,'/Q2uSZ,\007\013\\1zKJd\025n\035;\026\003ACqAb\006\f\t\0031I\"A\007hKR\004F.Y=fe^\013'O\034\013\004\r\032m\001bBB9\r+\001\ra\006\005\b\r?YA\021\001D\021\003A)\b\017Z1uKBc\027-_3s/\006\024h\016F\b&\rG1)C\"\013\007.\031EbQ\007D\035\021\035\031\tH\"\bA\002]A\001Bb\n\007\036\001\007\021QF\001\b[>tW-_0u\021!1YC\"\bA\002\0055\022AB4pY\022|F\017\003\005\0070\031u\001\031AA\027\003-\021\027N\0343`O>dGm\030;\t\021\031MbQ\004a\001\003[\tQ!\032=q?RD\001Bb\016\007\036\001\007\021QF\001\007QV\024Ho\030;\t\021\031mbQ\004a\001\003\023\taaY0uS6,\007\"\003D \027E\005I\021\001D!\003U\tG\r\032+sK\006\034XO]3%I\0264\027-\0367uIU*\"Ab\021+\007\0252)e\013\002\007HA!a\021\nD*\033\t1YE\003\003\007N\031=\023!C;oG\",7m[3e\025\r1\tFG\001\013C:tw\016^1uS>t\027\002\002D+\r\027\022\021#\0368dQ\026\0347.\0323WCJL\027M\\2f\021%1IfCI\001\n\0031Y&A\013bI\022$&/Z1tkJ,G\005Z3gCVdG\017\n\034\026\005\031u#fA\f\007F\001")
public final class PlayerService {
  public static String addTreasure$default$6() {
    return PlayerService$.MODULE$.addTreasure$default$6();
  }
  
  public static int addTreasure$default$5() {
    return PlayerService$.MODULE$.addTreasure$default$5();
  }
  
  public static int updatePlayerWarn(String paramString, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, Date paramDate) {
    return PlayerService$.MODULE$.updatePlayerWarn(paramString, paramLong1, paramLong2, paramLong3, paramLong4, paramLong5, paramDate);
  }
  
  public static MapBean getPlayerWarn(String paramString) {
    return PlayerService$.MODULE$.getPlayerWarn(paramString);
  }
  
  public static List<MapBean> getTowerActivePlayerList() {
    return PlayerService$.MODULE$.getTowerActivePlayerList();
  }
  
  public static void addTreasure(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString2) {
    PlayerService$.MODULE$.addTreasure(paramString1, paramInt1, paramInt2, paramInt3, paramInt4, paramString2);
  }
  
  public static List<MapBean> getTreasureList(String paramString) {
    return PlayerService$.MODULE$.getTreasureList(paramString);
  }
  
  public static MapBean getGraphic(String paramString) {
    return PlayerService$.MODULE$.getGraphic(paramString);
  }
  
  public static void updateGraphic(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9) {
    PlayerService$.MODULE$.updateGraphic(paramString, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9);
  }
  
  public static MapBean getPlayerGuaJi(String paramString) {
    return PlayerService$.MODULE$.getPlayerGuaJi(paramString);
  }
  
  public static void updatePlayerName(String paramString1, String paramString2) {
    PlayerService$.MODULE$.updatePlayerName(paramString1, paramString2);
  }
  
  public static int updatePlayerRealmCompactLevel(String paramString, int paramInt) {
    return PlayerService$.MODULE$.updatePlayerRealmCompactLevel(paramString, paramInt);
  }
  
  public static int updatePlayerRealmSkill(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, String paramString3, int paramInt4) {
    return PlayerService$.MODULE$.updatePlayerRealmSkill(paramString1, paramInt1, paramInt2, paramInt3, paramString2, paramString3, paramInt4);
  }
  
  public static MapBean getPlayerRealm(String paramString) {
    return PlayerService$.MODULE$.getPlayerRealm(paramString);
  }
  
  public static int addPlayerRealm(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, String paramString3, int paramInt4) {
    return PlayerService$.MODULE$.addPlayerRealm(paramString1, paramInt1, paramInt2, paramInt3, paramString2, paramString3, paramInt4);
  }
  
  public static MapBean getHistory(String paramString) {
    return PlayerService$.MODULE$.getHistory(paramString);
  }
  
  public static void savePlayerHistory() {
    PlayerService$.MODULE$.savePlayerHistory();
  }
  
  public static void clearPlayerHistory() {
    PlayerService$.MODULE$.clearPlayerHistory();
  }
  
  public static int decPlayerRechargeGiftNum(String paramString, int paramInt, Date paramDate) {
    return PlayerService$.MODULE$.decPlayerRechargeGiftNum(paramString, paramInt, paramDate);
  }
  
  public static int incPlayerRechargeGiftNum(String paramString, int paramInt1, int paramInt2) {
    return PlayerService$.MODULE$.incPlayerRechargeGiftNum(paramString, paramInt1, paramInt2);
  }
  
  public static List<MapBean> getAllRechargeGift(String paramString) {
    return PlayerService$.MODULE$.getAllRechargeGift(paramString);
  }
  
  public static MapBean getRechargeGift(String paramString, int paramInt) {
    return PlayerService$.MODULE$.getRechargeGift(paramString, paramInt);
  }
  
  public static List<MapBean> getUserBanByKey(String paramString1, String paramString2, String paramString3, int paramInt) {
    return PlayerService$.MODULE$.getUserBanByKey(paramString1, paramString2, paramString3, paramInt);
  }
  
  public static MapBean getUserBan(String paramString, int paramInt) {
    return PlayerService$.MODULE$.getUserBan(paramString, paramInt);
  }
  
  public static MapBean getPlayerBan(String paramString) {
    return PlayerService$.MODULE$.getPlayerBan(paramString);
  }
  
  public static void deleteUserBan(String paramString, int paramInt) {
    PlayerService$.MODULE$.deleteUserBan(paramString, paramInt);
  }
  
  public static void updateUserBan(String paramString1, int paramInt1, int paramInt2, String paramString2, Date paramDate1, Date paramDate2) {
    PlayerService$.MODULE$.updateUserBan(paramString1, paramInt1, paramInt2, paramString2, paramDate1, paramDate2);
  }
  
  public static void deletePlayerBan(String paramString) {
    PlayerService$.MODULE$.deletePlayerBan(paramString);
  }
  
  public static void updatePlayerBan(String paramString1, int paramInt, String paramString2, Date paramDate1, Date paramDate2, Date paramDate3, String paramString3) {
    PlayerService$.MODULE$.updatePlayerBan(paramString1, paramInt, paramString2, paramDate1, paramDate2, paramDate3, paramString3);
  }
  
  public static int clearPlayerScore() {
    return PlayerService$.MODULE$.clearPlayerScore();
  }
  
  public static int clearPlayerSign() {
    return PlayerService$.MODULE$.clearPlayerSign();
  }
  
  public static int addPlayerSign(String paramString, int paramInt1, int paramInt2, int paramInt3, Date paramDate) {
    return PlayerService$.MODULE$.addPlayerSign(paramString, paramInt1, paramInt2, paramInt3, paramDate);
  }
  
  public static void addPlayerLine(String paramString1, long paramLong, int paramInt1, int paramInt2, String paramString2, Date paramDate) {
    PlayerService$.MODULE$.addPlayerLine(paramString1, paramLong, paramInt1, paramInt2, paramString2, paramDate);
  }
  
  public static MapBean getPlayerLine(String paramString) {
    return PlayerService$.MODULE$.getPlayerLine(paramString);
  }
  
  public static MapBean getPlayerSign(String paramString) {
    return PlayerService$.MODULE$.getPlayerSign(paramString);
  }
  
  public static int addStoreRecords(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return PlayerService$.MODULE$.addStoreRecords(paramString, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static List<MapBean> getStoreRecords(String paramString) {
    return PlayerService$.MODULE$.getStoreRecords(paramString);
  }
  
  public static MapBean getPlayerSimpleInfo(String paramString) {
    return PlayerService$.MODULE$.getPlayerSimpleInfo(paramString);
  }
  
  public static int clearStoreWeekRecord() {
    return PlayerService$.MODULE$.clearStoreWeekRecord();
  }
  
  public static int clearStoreDailyRecord() {
    return PlayerService$.MODULE$.clearStoreDailyRecord();
  }
  
  public static void clearShopRecord() {
    PlayerService$.MODULE$.clearShopRecord();
  }
  
  public static void postUpdateCenterPlayer(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2, int paramInt3, int paramInt4) {
    PlayerService$.MODULE$.postUpdateCenterPlayer(paramString1, paramString2, paramInt1, paramString3, paramInt2, paramInt3, paramInt4);
  }
  
  public static int delCenterPlayer(String paramString) {
    return PlayerService$.MODULE$.delCenterPlayer(paramString);
  }
  
  public static void updateCenterPlayer(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2, int paramInt3, int paramInt4) {
    PlayerService$.MODULE$.updateCenterPlayer(paramString1, paramString2, paramInt1, paramString3, paramInt2, paramInt3, paramInt4);
  }
  
  public static List<MapBean> getCenterPlayerByUsername(String paramString) {
    return PlayerService$.MODULE$.getCenterPlayerByUsername(paramString);
  }
  
  public static int updatePK(String paramString, int paramInt, Date paramDate) {
    return PlayerService$.MODULE$.updatePK(paramString, paramInt, paramDate);
  }
  
  public static MapBean getPK(String paramString) {
    return PlayerService$.MODULE$.getPK(paramString);
  }
  
  public static int resetPlayerHilarity() {
    return PlayerService$.MODULE$.resetPlayerHilarity();
  }
  
  public static int deleteHilarityRecord() {
    return PlayerService$.MODULE$.deleteHilarityRecord();
  }
  
  public static int updatePlayerHilarity(String paramString1, String paramString2, int paramInt1, int paramInt2) {
    return PlayerService$.MODULE$.updatePlayerHilarity(paramString1, paramString2, paramInt1, paramInt2);
  }
  
  public static int updateHilarityRecord(String paramString, int paramInt1, int paramInt2) {
    return PlayerService$.MODULE$.updateHilarityRecord(paramString, paramInt1, paramInt2);
  }
  
  public static List<MapBean> getHilarityRecords(String paramString) {
    return PlayerService$.MODULE$.getHilarityRecords(paramString);
  }
  
  public static MapBean getPlayerHilarity(String paramString) {
    return PlayerService$.MODULE$.getPlayerHilarity(paramString);
  }
  
  public static int resetActivityRecord() {
    return PlayerService$.MODULE$.resetActivityRecord();
  }
  
  public static int resetPlayerActivity() {
    return PlayerService$.MODULE$.resetPlayerActivity();
  }
  
  public static int updatePlayerActivity(String paramString1, int paramInt1, String paramString2, int paramInt2) {
    return PlayerService$.MODULE$.updatePlayerActivity(paramString1, paramInt1, paramString2, paramInt2);
  }
  
  public static int recordOfflineActivity() {
    return PlayerService$.MODULE$.recordOfflineActivity();
  }
  
  public static int updateActivityRecord(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    return PlayerService$.MODULE$.updateActivityRecord(paramString, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public static List<MapBean> getActivityRecords(String paramString) {
    return PlayerService$.MODULE$.getActivityRecords(paramString);
  }
  
  public static MapBean getPlayerActivity(String paramString) {
    return PlayerService$.MODULE$.getPlayerActivity(paramString);
  }
  
  public static int updateDropScores(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    return PlayerService$.MODULE$.updateDropScores(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public static List<MapBean> getDropScores(String paramString) {
    return PlayerService$.MODULE$.getDropScores(paramString);
  }
  
  public static int updateGuaJiMaxExp(String paramString, long paramLong) {
    return PlayerService$.MODULE$.updateGuaJiMaxExp(paramString, paramLong);
  }
  
  public static int updateGuaJiJson(String paramString1, String paramString2) {
    return PlayerService$.MODULE$.updateGuaJiJson(paramString1, paramString2);
  }
  
  public static MapBean getGuaJi(String paramString) {
    return PlayerService$.MODULE$.getGuaJi(paramString);
  }
  
  public static int updateShopRecord(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    return PlayerService$.MODULE$.updateShopRecord(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public static List<MapBean> getShopRecord(String paramString) {
    return PlayerService$.MODULE$.getShopRecord(paramString);
  }
  
  public static int updatePlayerTeam(String paramString, int paramInt1, int paramInt2) {
    return PlayerService$.MODULE$.updatePlayerTeam(paramString, paramInt1, paramInt2);
  }
  
  public static MapBean getPlayerTeam(String paramString) {
    return PlayerService$.MODULE$.getPlayerTeam(paramString);
  }
  
  public static int clearPlayerLine() {
    return PlayerService$.MODULE$.clearPlayerLine();
  }
  
  public static int deleteTowerRank(String paramString) {
    return PlayerService$.MODULE$.deleteTowerRank(paramString);
  }
  
  public static int addTowerRank(String paramString1, int paramInt1, String paramString2, int paramInt2, int paramInt3) {
    return PlayerService$.MODULE$.addTowerRank(paramString1, paramInt1, paramString2, paramInt2, paramInt3);
  }
  
  public static int updateInstanceRank(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, int paramInt3) {
    return PlayerService$.MODULE$.updateInstanceRank(paramString1, paramInt1, paramInt2, paramString2, paramString3, paramInt3);
  }
  
  public static List<MapBean> getInstanceRanks(int paramInt) {
    return PlayerService$.MODULE$.getInstanceRanks(paramInt);
  }
  
  public static int resetInstanceRecordTimes() {
    return PlayerService$.MODULE$.resetInstanceRecordTimes();
  }
  
  public static int updateInstanceRecord(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return PlayerService$.MODULE$.updateInstanceRecord(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static int resetExperienceRewards() {
    return PlayerService$.MODULE$.resetExperienceRewards();
  }
  
  public static int insertInstanceRewards(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, String paramString5) {
    return PlayerService$.MODULE$.insertInstanceRewards(paramString1, paramString2, paramString3, paramInt, paramString4, paramString5);
  }
  
  public static void updateInstanceRecordTimes(String paramString1, String paramString2, int paramInt) {
    PlayerService$.MODULE$.updateInstanceRecordTimes(paramString1, paramString2, paramInt);
  }
  
  public static int insertInstanceRecord(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    return PlayerService$.MODULE$.insertInstanceRecord(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
  }
  
  public static MapBean getInstanceReward(String paramString) {
    return PlayerService$.MODULE$.getInstanceReward(paramString);
  }
  
  public static List<MapBean> getInstanceRecord(String paramString) {
    return PlayerService$.MODULE$.getInstanceRecord(paramString);
  }
  
  public static int insertPlayerBag(String paramString, int paramInt) {
    return PlayerService$.MODULE$.insertPlayerBag(paramString, paramInt);
  }
  
  public static MapBean getPlayerBag(String paramString) {
    return PlayerService$.MODULE$.getPlayerBag(paramString);
  }
  
  public static void updateLastInstanceScene(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3) {
    PlayerService$.MODULE$.updateLastInstanceScene(paramString1, paramString2, paramInt1, paramInt2, paramInt3);
  }
  
  public static void updateLastScene(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, int paramInt4, int paramInt5, int paramInt6) {
    PlayerService$.MODULE$.updateLastScene(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramString3, paramInt4, paramInt5, paramInt6);
  }
  
  public static MapBean getLastScene(String paramString) {
    return PlayerService$.MODULE$.getLastScene(paramString);
  }
  
  public static int updateElixir(String paramString1, String paramString2) {
    return PlayerService$.MODULE$.updateElixir(paramString1, paramString2);
  }
  
  public static int updateRealmCompactLevel(String paramString, int paramInt) {
    return PlayerService$.MODULE$.updateRealmCompactLevel(paramString, paramInt);
  }
  
  public static void updateRealmFighting(String paramString, int paramInt) {
    PlayerService$.MODULE$.updateRealmFighting(paramString, paramInt);
  }
  
  public static int updateRealmLevel(String paramString1, int paramInt, String paramString2) {
    return PlayerService$.MODULE$.updateRealmLevel(paramString1, paramInt, paramString2);
  }
  
  public static int updateHpMp(String paramString, int paramInt1, int paramInt2) {
    return PlayerService$.MODULE$.updateHpMp(paramString, paramInt1, paramInt2);
  }
  
  public static int getTongFight(String paramString) {
    return PlayerService$.MODULE$.getTongFight(paramString);
  }
  
  public static int updateFighting(String paramString, int paramInt) {
    return PlayerService$.MODULE$.updateFighting(paramString, paramInt);
  }
  
  public static int updateIcon(String paramString1, String paramString2) {
    return PlayerService$.MODULE$.updateIcon(paramString1, paramString2);
  }
  
  public static int updateJob(String paramString, int paramInt) {
    return PlayerService$.MODULE$.updateJob(paramString, paramInt);
  }
  
  public static int getLevel(String paramString) {
    return PlayerService$.MODULE$.getLevel(paramString);
  }
  
  public static MapBean getAttr(String paramString) {
    return PlayerService$.MODULE$.getAttr(paramString);
  }
  
  public static int updateExp(String paramString, long paramLong) {
    return PlayerService$.MODULE$.updateExp(paramString, paramLong);
  }
  
  public static int updateLevel(String paramString, long paramLong, int paramInt) {
    return PlayerService$.MODULE$.updateLevel(paramString, paramLong, paramInt);
  }
  
  public static void updateOfflineRemainMinute(String paramString, int paramInt) {
    PlayerService$.MODULE$.updateOfflineRemainMinute(paramString, paramInt);
  }
  
  public static void updateLogoutTime(String paramString, long paramLong) {
    PlayerService$.MODULE$.updateLogoutTime(paramString, paramLong);
  }
  
  public static void updateLoginTime(String paramString) {
    PlayerService$.MODULE$.updateLoginTime(paramString);
  }
  
  public static int updateNewbies(String paramString, int paramInt1, int paramInt2, Date paramDate) {
    return PlayerService$.MODULE$.updateNewbies(paramString, paramInt1, paramInt2, paramDate);
  }
  
  public static List<MapBean> getNewbies(String paramString) {
    return PlayerService$.MODULE$.getNewbies(paramString);
  }
  
  public static MapBean getLogin(String paramString) {
    return PlayerService$.MODULE$.getLogin(paramString);
  }
  
  public static boolean isExistName(String paramString) {
    return PlayerService$.MODULE$.isExistName(paramString);
  }
  
  public static String autoName(int paramInt) {
    return PlayerService$.MODULE$.autoName(paramInt);
  }
  
  public static int getPlayerCountByUsername(String paramString, int paramInt) {
    return PlayerService$.MODULE$.getPlayerCountByUsername(paramString, paramInt);
  }
  
  public static MapBean getPlayerByName(String paramString) {
    return PlayerService$.MODULE$.getPlayerByName(paramString);
  }
  
  public static List<MapBean> getPlayersByUsername(String paramString, int paramInt) {
    return PlayerService$.MODULE$.getPlayersByUsername(paramString, paramInt);
  }
  
  public static MapBean getPlayer(String paramString) {
    return PlayerService$.MODULE$.getPlayer(paramString);
  }
  
  public static String getNewPlayerId(String paramString1, String paramString2, int paramInt1, int paramInt2) {
    return PlayerService$.MODULE$.getNewPlayerId(paramString1, paramString2, paramInt1, paramInt2);
  }
  
  public static String newPlayer(String paramString1, int paramInt1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    return PlayerService$.MODULE$.newPlayer(paramString1, paramInt1, paramString2, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public static void warn(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    PlayerService$.MODULE$.warn(paramFunction0, paramFunction01);
  }
  
  public static void warn(Function0<Object> paramFunction0) {
    PlayerService$.MODULE$.warn(paramFunction0);
  }
  
  public static boolean isWarnEnabled() {
    return PlayerService$.MODULE$.isWarnEnabled();
  }
  
  public static void info(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    PlayerService$.MODULE$.info(paramFunction0, paramFunction01);
  }
  
  public static void info(Function0<Object> paramFunction0) {
    PlayerService$.MODULE$.info(paramFunction0);
  }
  
  public static boolean isInfoEnabled() {
    return PlayerService$.MODULE$.isInfoEnabled();
  }
  
  public static void error(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    PlayerService$.MODULE$.error(paramFunction0, paramFunction01);
  }
  
  public static void error(Function0<Object> paramFunction0) {
    PlayerService$.MODULE$.error(paramFunction0);
  }
  
  public static boolean isErrorEnabled() {
    return PlayerService$.MODULE$.isErrorEnabled();
  }
  
  public static void debug(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    PlayerService$.MODULE$.debug(paramFunction0, paramFunction01);
  }
  
  public static void debug(Function0<Object> paramFunction0) {
    PlayerService$.MODULE$.debug(paramFunction0);
  }
  
  public static boolean isDebugEnabled() {
    return PlayerService$.MODULE$.isDebugEnabled();
  }
  
  public static void trace(Function0<Object> paramFunction0, Function0<Throwable> paramFunction01) {
    PlayerService$.MODULE$.trace(paramFunction0, paramFunction01);
  }
  
  public static void trace(Function0<Object> paramFunction0) {
    PlayerService$.MODULE$.trace(paramFunction0);
  }
  
  public static boolean isTraceEnabled() {
    return PlayerService$.MODULE$.isTraceEnabled();
  }
  
  public static String loggerName() {
    return PlayerService$.MODULE$.loggerName();
  }
  
  public static Logger logger() {
    return PlayerService$.MODULE$.logger();
  }
}


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\PlayerService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */