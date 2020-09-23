/*     */ package com.nirvana.action;
/*     */ import com.nirvana.aofei.AoFeiMasterLog$;
/*     */ import com.nirvana.exception.BusinessException;
/*     */ import com.nirvana.exception.BusinessException$;
/*     */ import com.nirvana.util.SignUtils$;
/*     */ import com.nirvana.xml.ChannelConfig$;
/*     */ import javax.servlet.ServletRequest;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import org.springframework.web.bind.ServletRequestUtils;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ 
/*     */ @Controller
/*     */ @RequestMapping({"/log"})
/*     */ @ScalaSignature(bytes = "\006\001y3A!\001\002\001\023\t\021\022i\034$fS2{wmQ8oiJ|G\016\\3s\025\t\031A!\001\004bGRLwN\034\006\003\013\031\tqA\\5sm\006t\027MC\001\b\003\r\031w.\\\002\001'\t\001!\002\005\002\f\0355\tAB\003\002\016\t\005\031q/\0322\n\005=a!AE!cgR\024\030m\031;D_:$(o\0347mKJDQ!\005\001\005\002I\ta\001P5oSRtD#A\n\021\005Q\001Q\"\001\002\t\013Y\001A\021A\f\002\025\005\034G/\033<bi&|g\016F\002\031=)\002\"!\007\017\016\003iQ\021aG\001\006g\016\fG.Y\005\003;i\021A!\0268ji\")q$\006a\001A\0059!/Z9vKN$\bCA\021)\033\005\021#BA\022%\003\021AG\017\0369\013\005\0252\023aB:feZdW\r\036\006\002O\005)!.\031<bq&\021\021F\t\002\023\021R$\boU3sm2,GOU3rk\026\034H\017C\003,+\001\007A&\001\005sKN\004xN\\:f!\t\tS&\003\002/E\t\031\002\n\036;q'\026\024h\017\\3u%\026\034\bo\0348tK\"\"Q\003M\037?!\t\t4(D\0013\025\t\031D'\001\006b]:|G/\031;j_:T!!\016\034\002\t\tLg\016\032\006\003\033]R!\001O\035\002\037M\004(/\0338hMJ\fW.Z<pe.T\021AO\001\004_J<\027B\001\0373\0059\021V-];fgRl\025\r\0359j]\036\fQA^1mk\026d\023aP\021\002\001\006Yq&Y2uSZ\fG/[8o\021\025\021\005\001\"\001D\003\031)\b\017Z1uKR\031\001\004R#\t\013}\t\005\031\001\021\t\013-\n\005\031\001\027)\t\005\003Th\022\027\002\021\006\n\021*A\0040kB$\027\r^3\t\013-\003A\021\001'\002\t1|\027\r\032\013\00415s\005\"B\020K\001\004\001\003\"B\026K\001\004a\003\006\002&1{Ac\023!U\021\002%\006)q\006\\8bI\"\"\001\001M\037UY\005)\026%\001,\002\t=bwn\032\025\003\001a\003\"!\027/\016\003iS!aW\034\002\025M$XM]3pif\004X-\003\002^5\nQ1i\0348ue>dG.\032:")
/*     */ public class AoFeiLogController extends AbstractController {
/*     */   @RequestMapping({"/activation"})
/*     */   public void activation(HttpServletRequest request, HttpServletResponse response) {
/*  19 */     webLogger().info("{},{},{}", new Object[] { request, request.getParameterMap(), request.getQueryString() });
/*     */     
/*  21 */     String sign = ServletRequestUtils.getStringParameter((ServletRequest)request, "sign");
/*     */     
/*  23 */     String ip = getRemoteIp(request);
/*  24 */     String device_model = ServletRequestUtils.getStringParameter((ServletRequest)request, "device_model");
/*  25 */     String os_name = ServletRequestUtils.getStringParameter((ServletRequest)request, "os_name");
/*  26 */     String os_ver = ServletRequestUtils.getStringParameter((ServletRequest)request, "os_ver");
/*  27 */     String mac_addr = ServletRequestUtils.getStringParameter((ServletRequest)request, "mac_addr");
/*  28 */     String udid = ServletRequestUtils.getStringParameter((ServletRequest)request, "udid");
/*     */     
/*  30 */     String app_ver = ServletRequestUtils.getStringParameter((ServletRequest)request, "app_ver");
/*  31 */     String network = ServletRequestUtils.getStringParameter((ServletRequest)request, "network");
/*  32 */     String platform_tag = ServletRequestUtils.getStringParameter((ServletRequest)request, "platform_tag");
/*  33 */     int group_id = ServletRequestUtils.getIntParameter((ServletRequest)request, "group_id", 2);
/*  34 */     int channel_id = ServletRequestUtils.getIntParameter((ServletRequest)request, "channel_id", 0);
/*  35 */     String app_channel = ChannelConfig$.MODULE$.getAppChannel(channel_id);
/*     */     
/*  37 */     String str1 = SignUtils$.MODULE$.makeClientSign(udid); if (sign == null) { if (str1 != null)
/*  38 */       { webLogger().error("校验失败:{},{},{}", new Object[] { request, request.getParameterMap(), request.getQueryString() });
/*  39 */         throw new BusinessException("校验失败", BusinessException$.MODULE$.$lessinit$greater$default$2()); }  } else if (!sign.equals(str1)) { webLogger().error("校验失败:{},{},{}", new Object[] { request, request.getParameterMap(), request.getQueryString() }); throw new BusinessException("校验失败", BusinessException$.MODULE$.$lessinit$greater$default$2()); }
/*     */     
/*  41 */     AoFeiMasterLog$.MODULE$.logActivation(ip, device_model, os_name, os_ver, mac_addr, udid, app_channel, app_ver, network, platform_tag, group_id, channel_id);
/*     */   }
/*     */ 
/*     */   
/*     */   @RequestMapping({"/update"})
/*     */   public void update(HttpServletRequest request, HttpServletResponse response) {
/*  47 */     webLogger().info("{},{},{}", new Object[] { request, request.getParameterMap(), request.getQueryString() });
/*     */     
/*  49 */     String sign = ServletRequestUtils.getStringParameter((ServletRequest)request, "sign");
/*     */     
/*  51 */     String ip = getRemoteIp(request);
/*  52 */     String device_model = ServletRequestUtils.getStringParameter((ServletRequest)request, "device_model");
/*  53 */     String os_name = ServletRequestUtils.getStringParameter((ServletRequest)request, "os_name");
/*  54 */     String os_ver = ServletRequestUtils.getStringParameter((ServletRequest)request, "os_ver");
/*  55 */     String mac_addr = ServletRequestUtils.getStringParameter((ServletRequest)request, "mac_addr");
/*  56 */     String udid = ServletRequestUtils.getStringParameter((ServletRequest)request, "udid");
/*     */     
/*  58 */     String app_ver = ServletRequestUtils.getStringParameter((ServletRequest)request, "app_ver");
/*  59 */     String network = ServletRequestUtils.getStringParameter((ServletRequest)request, "network");
/*  60 */     String platform_tag = ServletRequestUtils.getStringParameter((ServletRequest)request, "platform_tag");
/*  61 */     int group_id = ServletRequestUtils.getIntParameter((ServletRequest)request, "group_id", 2);
/*  62 */     int channel_id = ServletRequestUtils.getIntParameter((ServletRequest)request, "channel_id", 0);
/*  63 */     String app_channel = ChannelConfig$.MODULE$.getAppChannel(channel_id);
/*     */     
/*  65 */     int reach_update_time = ServletRequestUtils.getIntParameter((ServletRequest)request, "reach_update_time", 0);
/*  66 */     int update_status = ServletRequestUtils.getIntParameter((ServletRequest)request, "update_status", 0);
/*  67 */     int update_time = ServletRequestUtils.getIntParameter((ServletRequest)request, "update_time", 0);
/*  68 */     int use_time = ServletRequestUtils.getIntParameter((ServletRequest)request, "use_time", 0);
/*     */     
/*  70 */     String str1 = SignUtils$.MODULE$.makeClientSign(udid); if (sign == null) { if (str1 != null)
/*  71 */       { webLogger().error("校验失败:{},{},{}", new Object[] { request, request.getParameterMap(), request.getQueryString() });
/*  72 */         throw new BusinessException("校验失败", BusinessException$.MODULE$.$lessinit$greater$default$2()); }  } else if (!sign.equals(str1)) { webLogger().error("校验失败:{},{},{}", new Object[] { request, request.getParameterMap(), request.getQueryString() }); throw new BusinessException("校验失败", BusinessException$.MODULE$.$lessinit$greater$default$2()); }
/*     */     
/*  74 */     AoFeiMasterLog$.MODULE$.logUpdate(ip, device_model, os_name, os_ver, mac_addr, udid, app_channel, app_ver, network, platform_tag, group_id, channel_id, 
/*  75 */         reach_update_time, update_status, update_time, use_time);
/*     */   }
/*     */ 
/*     */   
/*     */   @RequestMapping({"/load"})
/*     */   public void load(HttpServletRequest request, HttpServletResponse response) {
/*  81 */     webLogger().info("{},{},{}", new Object[] { request, request.getParameterMap(), request.getQueryString() });
/*     */     
/*  83 */     String sign = ServletRequestUtils.getStringParameter((ServletRequest)request, "sign");
/*     */     
/*  85 */     String ip = getRemoteIp(request);
/*  86 */     String device_model = ServletRequestUtils.getStringParameter((ServletRequest)request, "device_model");
/*  87 */     String os_name = ServletRequestUtils.getStringParameter((ServletRequest)request, "os_name");
/*  88 */     String os_ver = ServletRequestUtils.getStringParameter((ServletRequest)request, "os_ver");
/*  89 */     String mac_addr = ServletRequestUtils.getStringParameter((ServletRequest)request, "mac_addr");
/*  90 */     String udid = ServletRequestUtils.getStringParameter((ServletRequest)request, "udid");
/*     */     
/*  92 */     String app_ver = ServletRequestUtils.getStringParameter((ServletRequest)request, "app_ver");
/*  93 */     String network = ServletRequestUtils.getStringParameter((ServletRequest)request, "network");
/*  94 */     String platform_tag = ServletRequestUtils.getStringParameter((ServletRequest)request, "platform_tag");
/*  95 */     int group_id = ServletRequestUtils.getIntParameter((ServletRequest)request, "group_id", 2);
/*  96 */     int channel_id = ServletRequestUtils.getIntParameter((ServletRequest)request, "channel_id", 0);
/*  97 */     String app_channel = ChannelConfig$.MODULE$.getAppChannel(channel_id);
/*     */     
/*  99 */     String str1 = SignUtils$.MODULE$.makeClientSign(udid); if (sign == null) { if (str1 != null)
/* 100 */       { webLogger().error("校验失败:{},{},{}", new Object[] { request, request.getParameterMap(), request.getQueryString() });
/* 101 */         throw new BusinessException("校验失败", BusinessException$.MODULE$.$lessinit$greater$default$2()); }  } else if (!sign.equals(str1)) { webLogger().error("校验失败:{},{},{}", new Object[] { request, request.getParameterMap(), request.getQueryString() }); throw new BusinessException("校验失败", BusinessException$.MODULE$.$lessinit$greater$default$2()); }
/*     */     
/* 103 */     AoFeiMasterLog$.MODULE$.logLoad(ip, device_model, os_name, os_ver, mac_addr, udid, app_channel, app_ver, network, platform_tag, group_id, channel_id);
/*     */   }
/*     */ }


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\action\AoFeiLogController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */