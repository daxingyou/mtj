/*     */ package com.nirvana.platform;
/*     */ 
/*     */ import scala.reflect.ScalaSignature;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001U3A!\001\002\001\023\tI\001+Y2lKRL\025\r\035\006\003\007\021\t\001\002\0357bi\032|'/\034\006\003\013\031\tqA\\5sm\006t\027MC\001\b\003\r\031w.\\\002\001'\t\001!\002\005\002\f\0315\t!!\003\002\016\005\tQ\001+Y2lKR\024\025m]3\t\013=\001A\021\001\t\002\rqJg.\033;?)\005\t\002CA\006\001\021%\031\002\0011AA\002\023\005A#\001\004Vg\026\024\030\nZ\013\002+A\021a\003\b\b\003/ii\021\001\007\006\0023\005)1oY1mC&\0211\004G\001\007!J,G-\0324\n\005uq\"AB*ue&twM\003\002\0341!I\001\005\001a\001\002\004%\t!I\001\013+N,'/\0233`I\025\fHC\001\022&!\t92%\003\002%1\t!QK\\5u\021\0351s$!AA\002U\t1\001\037\0232\021\031A\003\001)Q\005+\0059Qk]3s\023\022\004\003\"\003\026\001\001\004\005\r\021\"\001\025\003-\001\026mY6bO\026t\025-\\3\t\0231\002\001\031!a\001\n\003i\023a\004)bG.\fw-\032(b[\026|F%Z9\025\005\tr\003b\002\024,\003\003\005\r!\006\005\007a\001\001\013\025B\013\002\031A\0137m[1hK:\013W.\032\021\t\023I\002\001\031!a\001\n\003!\022aC(sI\026\024h*^7cKJD\021\002\016\001A\002\003\007I\021A\033\002\037=\023H-\032:Ok6\024WM]0%KF$\"A\t\034\t\017\031\032\024\021!a\001+!1\001\b\001Q!\nU\tAb\024:eKJtU/\0342fe\002B\021B\017\001A\002\003\007I\021\001\013\002\023A\023x\016Z;di&#\007\"\003\037\001\001\004\005\r\021\"\001>\0035\001&o\0343vGRLEm\030\023fcR\021!E\020\005\bMm\n\t\0211\001\026\021\031\001\005\001)Q\005+\005Q\001K]8ek\016$\030\n\032\021\t\023\t\003\001\031!a\001\n\003!\022!\004)ve\016D\027m]3U_.,g\016C\005E\001\001\007\t\031!C\001\013\006\t\002+\036:dQ\006\034X\rV8lK:|F%Z9\025\005\t2\005b\002\024D\003\003\005\r!\006\005\007\021\002\001\013\025B\013\002\035A+(o\0315bg\026$vn[3oA!9!\n\001a\001\n\003Y\025\001\003+fgR\034u\016Z3\026\0031\003\"aF'\n\0059C\"a\002\"p_2,\027M\034\005\b!\002\001\r\021\"\001R\0031!Vm\035;D_\022,w\fJ3r)\t\021#\013C\004'\037\006\005\t\031\001'\t\rQ\003\001\025)\003M\003%!Vm\035;D_\022,\007\005")
/*     */ public class PacketIap
/*     */   extends PacketBase
/*     */ {
/*     */   private String UserId;
/*     */   private String PackageName;
/*     */   private String OrderNumber;
/*     */   private String ProductId;
/*     */   private String PurchaseToken;
/*     */   private boolean TestCode;
/*     */   
/*     */   public String UserId() {
/*     */     return this.UserId;
/*     */   }
/*     */   
/*     */   public void UserId_$eq(String x$1) {
/*     */     this.UserId = x$1;
/*     */   }
/*     */   
/*     */   public String PackageName() {
/*     */     return this.PackageName;
/*     */   }
/*     */   
/*     */   public void PackageName_$eq(String x$1) {
/*     */     this.PackageName = x$1;
/*     */   }
/*     */   
/*     */   public String OrderNumber() {
/*     */     return this.OrderNumber;
/*     */   }
/*     */   
/*     */   public void OrderNumber_$eq(String x$1) {
/*     */     this.OrderNumber = x$1;
/*     */   }
/*     */   
/*     */   public String ProductId() {
/*     */     return this.ProductId;
/*     */   }
/*     */   
/*     */   public void ProductId_$eq(String x$1) {
/*     */     this.ProductId = x$1;
/*     */   }
/*     */   
/*     */   public String PurchaseToken() {
/*     */     return this.PurchaseToken;
/*     */   }
/*     */   
/*     */   public void PurchaseToken_$eq(String x$1) {
/*     */     this.PurchaseToken = x$1;
/*     */   }
/*     */   
/*     */   public PacketIap() {
/* 166 */     PacketType_$eq(0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 172 */     this.TestCode = false; } public boolean TestCode() { return this.TestCode; } public void TestCode_$eq(boolean x$1) { this.TestCode = x$1; }
/*     */ 
/*     */ }


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\platform\PacketIap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */