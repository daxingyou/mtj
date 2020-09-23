/*
Navicat MySQL Data Transfer

Source Server         : 192.168.0.8
Source Server Version : 50631
Source Host           : 192.168.0.8:3306
Source Database       : mtj_center

Target Server Type    : MYSQL
Target Server Version : 50631
File Encoding         : 65001

Date: 2017-09-01 21:54:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin_log`
-- ----------------------------
DROP TABLE IF EXISTS `admin_log`;
CREATE TABLE `admin_log` (
`id`  int(11) NOT NULL AUTO_INCREMENT ,
`user_name`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员' ,
`server_name`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`cmd`  varchar(2048) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`result`  varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '执行结果' ,
`add_time`  datetime NOT NULL COMMENT '执行时间' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;


-- ----------------------------
-- Table structure for `ban_gag`
-- ----------------------------
DROP TABLE IF EXISTS `ban_gag`;
CREATE TABLE `ban_gag` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`server_id`  int(11) NOT NULL ,
`ban_time`  int(11) NOT NULL ,
`cause`  varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`create_time`  datetime NOT NULL ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `ban_role`
-- ----------------------------
DROP TABLE IF EXISTS `ban_role`;
CREATE TABLE `ban_role` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '玩家id' ,
`server_id`  int(11) NOT NULL COMMENT '服务器id' ,
`ban_time`  int(11) NOT NULL COMMENT '封禁时间间隔(分)' ,
`cause`  varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '封禁原因' ,
`create_time`  datetime NOT NULL ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `ban_user`
-- ----------------------------
DROP TABLE IF EXISTS `ban_user`;
CREATE TABLE `ban_user` (
  `user_id` varchar(50) NOT NULL COMMENT '用户名|IP|MAC|UDID',
  `server_id` int(11) NOT NULL,
  `ban_time` int(11) NOT NULL,
  `cause` varchar(512) NOT NULL,
  `create_time` datetime NOT NULL,
  `ban_type` int(11) NOT NULL DEFAULT '0' COMMENT '封号类型(0封禁账号,1封禁IP,2封禁MAC,3封禁UDID)',
  PRIMARY KEY (`user_id`,`server_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for `mail`
-- ----------------------------
DROP TABLE IF EXISTS `mail`;
CREATE TABLE `mail` (
`id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`type`  tinyint(4) NULL DEFAULT 0 ,
`server_id`  int(11) NULL DEFAULT 0 ,
`player_ids`  varchar(2048) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '玩家id列表，逗号分隔' ,
`created_at`  datetime NOT NULL ,
`title`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`content`  varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '内容' ,
`attach`  varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '附件，jsonstring' ,
`level_limit`  int(11) NULL DEFAULT 0 COMMENT '群发邮件等级限制' ,
`start_time`  datetime NULL DEFAULT NULL COMMENT '群发邮件开始时间' ,
`end_time`  datetime NULL DEFAULT NULL COMMENT '群发邮件结束时间' ,
`admin`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' ,
`result`  varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='信件'

;



-- ----------------------------
-- Table structure for `pay_order`
-- ----------------------------
DROP TABLE IF EXISTS `pay_order`;
CREATE TABLE `pay_order` (
`id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单号' ,
`at_time`  datetime NOT NULL ,
`order_id`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'sdk返回的订单号' ,
`server_id`  int(11) NOT NULL ,
`username`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`pf`  int(11) NOT NULL DEFAULT 0 ,
`channel_id`  int(11) NOT NULL DEFAULT 0 ,
`rmb`  int(11) NOT NULL DEFAULT 0 COMMENT '单位分' ,
`product_id`  int(11) NOT NULL COMMENT '充值产品id' ,
`status`  tinyint(4) NOT NULL DEFAULT 0 COMMENT '0发起，1 成功' ,
`flag`  tinyint(4) NULL DEFAULT 0 COMMENT '0 未发货，1 已发货' ,
PRIMARY KEY (`id`),
INDEX `at_time` (`at_time`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_center`
-- ----------------------------
DROP TABLE IF EXISTS `player_center`;
CREATE TABLE `player_center` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`username`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`server_id`  int(11) NOT NULL ,
`name`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`kind`  int(11) NOT NULL COMMENT '职业 ' ,
`sex`  tinyint(4) NOT NULL DEFAULT 0 COMMENT '0 男性、1 女性' ,
`level`  int(11) NOT NULL DEFAULT 1 ,
`create_at`  datetime NOT NULL ,
`del_flag`  tinyint(4) NOT NULL DEFAULT 0 COMMENT '0 正常，1 删除中，2 已删除' ,
`del_time`  datetime NULL DEFAULT NULL ,
PRIMARY KEY (`player_id`),
INDEX `username` (`username`) USING BTREE ,
INDEX `del_flag` (`del_flag`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `sequence`
-- ----------------------------
DROP TABLE IF EXISTS `sequence`;
CREATE TABLE `sequence` (
`name`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`id`  int(11) NOT NULL DEFAULT 1 ,
PRIMARY KEY (`name`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;


-- ----------------------------
-- Table structure for `tblTestCode`
-- ----------------------------
DROP TABLE IF EXISTS `tblTestCode`;
CREATE TABLE `tblTestCode` (
`fldChannel`  int(11) NOT NULL ,
`fldCode`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`username`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' ,
`at_time`  datetime NULL DEFAULT NULL ,
PRIMARY KEY (`fldCode`),
INDEX `username` (`username`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='测试码'

;

-- ----------------------------
-- Table structure for `user_center`
-- ----------------------------
DROP TABLE IF EXISTS `user_center`;
CREATE TABLE `user_center` (
`username`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`password`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`pf`  tinyint(4) NOT NULL DEFAULT 0 COMMENT '平台用户' ,
`channel_id`  int(11) NULL DEFAULT 0 COMMENT '渠道id' ,
`udid`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '设备唯一标示' ,
`mac_addr`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' ,
`ip`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' ,
`create_time`  datetime NULL DEFAULT NULL ,
PRIMARY KEY (`username`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `user_token`
-- ----------------------------
DROP TABLE IF EXISTS `user_token`;
CREATE TABLE `user_token` (
`username`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`token`  varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`at_time`  datetime NOT NULL ,
PRIMARY KEY (`username`),
INDEX `token` (`token`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='登陆token表'

;

DROP TABLE IF EXISTS `pay_other`;
CREATE TABLE `pay_other` (
  `pay_id` varchar(20) NOT NULL,
  `content` text COMMENT '充值时其他需要记录的信息，非必要，看平台接口',
  PRIMARY KEY (`pay_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='充值时其他需要记录的信息';


