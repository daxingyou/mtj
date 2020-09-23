/*    */ package com.nirvana.aofei;
/*    */ import com.nirvana.core.ServerConfig$;
/*    */ import java.io.BufferedWriter;
/*    */ import java.io.File;
/*    */ import java.io.OutputStreamWriter;
/*    */ import java.util.Date;
/*    */ import java.util.concurrent.locks.ReentrantLock;
/*    */ import org.apache.commons.lang.time.DateUtils;
/*    */ import scala.Enumeration;
/*    */ import scala.collection.mutable.ListBuffer;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001Q4A!\001\002\001\023\tA\021i\034$fS2{wM\003\002\004\t\005)\021m\0344fS*\021QAB\001\b]&\024h/\0318b\025\0059\021aA2p[\016\0011C\001\001\013!\tYa\"D\001\r\025\005i\021!B:dC2\f\027BA\b\r\005\031\te.\037*fM\"A\021\003\001B\001B\003%!#\001\007b_\032+\027\016T8h)f\004X\r\005\002\02439\021AcF\007\002+)\021a\003B\001\006if\004Xm]\005\0031U\tA\"Q8GK&dun\032+za\026L!AG\016\003\013Y\013G.^3\n\005qa!aC#ok6,'/\031;j_:DQA\b\001\005\002}\ta\001P5oSRtDC\001\021#!\t\t\003!D\001\003\021\025\tR\0041\001\023\021\035!\003A1A\005\002\025\naAY;gM\026\024X#\001\024\021\007\035bc&D\001)\025\tI#&A\004nkR\f'\r\\3\013\005-b\021AC2pY2,7\r^5p]&\021Q\006\013\002\013\031&\034HOQ;gM\026\024\bCA\0303\035\tY\001'\003\0022\031\0051\001K]3eK\032L!a\r\033\003\rM#(/\0338h\025\t\tD\002\003\0047\001\001\006IAJ\001\bEV4g-\032:!\021%A\004\0011AA\002\023\005\021(A\004dkJ$\025\r^3\026\003i\002\"a\017!\016\003qR!!\020 \002\tU$\030\016\034\006\002\005!!.\031<b\023\t\tEH\001\003ECR,\007\"C\"\001\001\004\005\r\021\"\001E\003-\031WO\035#bi\026|F%Z9\025\005\025C\005CA\006G\023\t9EB\001\003V]&$\bbB%C\003\003\005\rAO\001\004q\022\n\004BB&\001A\003&!(\001\005dkJ$\025\r^3!\021%i\005\0011AA\002\023\005a*\001\003gS2,W#A(\021\005A\033V\"A)\013\005Is\024AA5p\023\t!\026K\001\003GS2,\007\"\003,\001\001\004\005\r\021\"\001X\003!1\027\016\\3`I\025\fHCA#Y\021\035IU+!AA\002=CaA\027\001!B\023y\025!\0024jY\026\004\003b\002/\001\005\004%\t!X\001\005Y>\0347.F\001_!\tyF-D\001a\025\t\t'-A\003m_\016\\7O\003\002dy\005Q1m\0348dkJ\024XM\034;\n\005\025\004'!\004*fK:$(/\0318u\031>\0347\016\003\004h\001\001\006IAX\001\006Y>\0347\016\t\005\006S\002!\tA[\001\006oJLG/\032\013\003\013.DQ\001\0345A\0029\nq!\\3tg\006<W\rC\003o\001\021\005q.A\buS6,Gk\\,sSR,g)\0337f+\005)\005\"B9\001\t\023y\027aC<sSR,Gk\034$jY\026DQa\035\001\005\n9\013\021BY;jY\0224\025\016\\3")
/*    */ public class AoFeiLog {
/* 17 */   private final ListBuffer<String> buffer = (ListBuffer<String>)ListBuffer$.MODULE$.empty(); private final Enumeration.Value aoFeiLogType; private Date curDate; private File file; public ListBuffer<String> buffer() { return this.buffer; }
/* 18 */   public Date curDate() { return this.curDate; } public void curDate_$eq(Date x$1) { this.curDate = x$1; }
/* 19 */   public File file() { return this.file; } public void file_$eq(File x$1) { this.file = x$1; }
/* 20 */    private final ReentrantLock lock = new ReentrantLock(); public ReentrantLock lock() { return this.lock; } public AoFeiLog(Enumeration.Value aoFeiLogType) {
/* 21 */     buildFile();
/*    */   }
/*    */   public void write(String message) {
/* 24 */     lock().lock();
/*    */     try {
/* 26 */       if (StringUtils.isNotBlank(message))
/* 27 */         if (DateUtils.isSameDay(curDate(), new Date())) {
/* 28 */           buffer().$plus$eq(message);
/* 29 */           if (buffer().size() >= 100) writeToFile(); 
/*    */         } else {
/* 31 */           writeToFile();
/* 32 */           buffer().$plus$eq(message);
/* 33 */           buildFile();
/*    */         }  
/*    */       return;
/*    */     } finally {
/* 37 */       lock().unlock();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void timeToWriteFile() {
/* 42 */     lock().lock();
/*    */     
/*    */     try {
/* 45 */       writeToFile();
/* 46 */       if (!buffer().isEmpty() && DateUtils.isSameDay(curDate(), new Date())) buildFile(); 
/*    */       return;
/*    */     } finally {
/* 49 */       lock().unlock();
/*    */     } 
/*    */   }
/*    */   
/*    */   private void writeToFile() {
/* 54 */     BufferedWriter writer = null;
/*    */     try {
/* 56 */       (file() == null) ? buildFile() : BoxedUnit.UNIT;
/* 57 */       file().exists() ? BoxedUnit.UNIT : BoxesRunTime.boxToBoolean(file().getParentFile().mkdirs());
/* 58 */       OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(file(), true), "UTF-8");
/* 59 */       writer = new BufferedWriter(out);
/* 60 */       String separator = System.getProperty("line.separator");
/* 61 */       while (!buffer().isEmpty()) {
/* 62 */         String message = (String)buffer().remove(0);
/* 63 */         writer.write((new StringBuilder()).append(message).append(separator).toString());
/*    */       } 
/*    */     } catch (Exception exception) {
/*    */     
/*    */     } finally {
/* 68 */       if (writer != null) writer.close(); 
/*    */     } 
/*    */   }
/*    */   
/*    */   private File buildFile() {
/* 73 */     File f1 = new File(ServerConfig$.MODULE$.aoFeiLogPath());
/* 74 */     curDate_$eq(new Date());
/* 75 */     String dateStr = (new SimpleDateFormat("yyyy_MM_dd")).format(curDate());
/* 76 */     File f2 = new File(f1, (new StringBuilder()).append("log/").append(dateStr).append("/").append(BoxesRunTime.boxToInteger(ServerConfig$.MODULE$.serverId())).append("/").append(this.aoFeiLogType).append(".log").toString());
/* 77 */     f2.exists() ? BoxedUnit.UNIT : BoxesRunTime.boxToBoolean(f2.getParentFile().mkdirs());
/* 78 */     file_$eq(f2);
/* 79 */     return f2;
/*    */   }
/*    */ }


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\aofei\AoFeiLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */