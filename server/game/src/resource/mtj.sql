/*
Navicat MySQL Data Transfer

Source Server         : 192.168.0.8
Source Server Version : 50631
Source Host           : 192.168.0.8:3306
Source Database       : mtj

Target Server Type    : MYSQL
Target Server Version : 50631
File Encoding         : 65001

Date: 2017-09-01 21:53:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `achieve`
-- ----------------------------
DROP TABLE IF EXISTS `achieve`;
CREATE TABLE `achieve` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`achieve_id`  int(11) NOT NULL ,
`status`  tinyint(4) NOT NULL DEFAULT 0 COMMENT '1完成，2 已领奖励' ,
`num`  int(11) NOT NULL DEFAULT 0 ,
PRIMARY KEY (`player_id`, `achieve_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='成就表'

;

-- ----------------------------
-- Table structure for `activity_record`
-- ----------------------------
DROP TABLE IF EXISTS `activity_record`;
CREATE TABLE `activity_record` (
`player_id`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`active_id`  int(11) NOT NULL ,
`finish_times`  int(11) NOT NULL COMMENT '完成次数' ,
`last_finish_times`  int(11) NOT NULL COMMENT '昨天完成次数' ,
`replenish_times`  int(11) NOT NULL COMMENT '领取离线没有完成的次数' ,
`value`  int(11) NOT NULL COMMENT '活跃值' ,
PRIMARY KEY (`player_id`, `active_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `arena`
-- ----------------------------
DROP TABLE IF EXISTS `arena`;
CREATE TABLE `arena` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`times`  tinyint(4) NOT NULL ,
`buy_time`  tinyint(4) NOT NULL COMMENT '购买次数' ,
`max_rank`  int(11) NOT NULL COMMENT '历史最好排名' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `arena_rank`
-- ----------------------------
DROP TABLE IF EXISTS `arena_rank`;
CREATE TABLE `arena_rank` (
`rank`  int(11) NOT NULL ,
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`name`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`career`  int(11) NOT NULL COMMENT '角色类型' ,
`level`  int(11) NOT NULL ,
PRIMARY KEY (`rank`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `buff`
-- ----------------------------
DROP TABLE IF EXISTS `buff`;
CREATE TABLE `buff` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`data`  varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `daily_times`
-- ----------------------------
DROP TABLE IF EXISTS `daily_times`;
CREATE TABLE `daily_times` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`id`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`uc`  int(11) NULL DEFAULT 0 COMMENT '已用次数' ,
`bc`  int(11) NULL DEFAULT 0 COMMENT '购买次数' ,
`at_time`  datetime NOT NULL ,
PRIMARY KEY (`player_id`, `id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `drop_score`
-- ----------------------------
DROP TABLE IF EXISTS `drop_score`;
CREATE TABLE `drop_score` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`drop_id`  int(11) NOT NULL ,
`score`  int(11) NOT NULL ,
`skip_times`  int(11) NOT NULL COMMENT '极品掉落次数' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `equip_attr`
-- ----------------------------
DROP TABLE IF EXISTS `equip_attr`;
CREATE TABLE `equip_attr` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`plus_id`  tinyint(4) NOT NULL DEFAULT 0 COMMENT '强化套装属性' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='装备属性'

;

-- ----------------------------
-- Table structure for `equip_level`
-- ----------------------------
DROP TABLE IF EXISTS `equip_level`;
CREATE TABLE `equip_level` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`idx`  int(11) NOT NULL ,
`slv`  int(11) NOT NULL DEFAULT 0 COMMENT '强化等级' ,
`sexp`  int(11) NOT NULL DEFAULT 0 COMMENT '强化经验' ,
`rlv`  int(11) NOT NULL DEFAULT 0 COMMENT '精炼等级' ,
`gem`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '宝石镶嵌' ,
`plv`  int(11) NOT NULL DEFAULT 0 COMMENT '强化等级(新)' ,
`plck`  int(11) NULL DEFAULT 0 COMMENT '当前强化幸运值' ,
`plck_id`  int(11) NULL DEFAULT 0 COMMENT '幸运值上限对应的配置表id' ,
`suit_lev`  int(11) NULL DEFAULT 0 COMMENT '套装等级' ,
PRIMARY KEY (`player_id`, `idx`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='装备强化和精炼'

;

-- ----------------------------
-- Table structure for `ext_equip_level`
-- ----------------------------
DROP TABLE IF EXISTS `ext_equip_level`;
CREATE TABLE `ext_equip_level` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`idx`  int(11) NOT NULL ,
`data`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
PRIMARY KEY (`player_id`, `idx`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `farm`
-- ----------------------------
DROP TABLE IF EXISTS `farm`;
CREATE TABLE `farm` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`idx`  int(11) NOT NULL ,
`seed_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '种子ID' ,
`water_times`  int(11) NOT NULL COMMENT '浇水次数' ,
`water_player`  varchar(150) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`gain_time`  datetime NOT NULL COMMENT '收获时间' ,
`stolen_player`  varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '偷取的玩家（playerId1_playerId2...）' ,
`stolen_times`  int(11) NOT NULL COMMENT '被偷次数' ,
PRIMARY KEY (`player_id`, `idx`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `farm_log`
-- ----------------------------
DROP TABLE IF EXISTS `farm_log`;
CREATE TABLE `farm_log` (
`id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`message`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`add_time`  datetime NOT NULL ,
PRIMARY KEY (`id`),
INDEX `player_id` (`player_id`) USING BTREE ,
INDEX `add_time` (`add_time`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `field_boss_rank`
-- ----------------------------
DROP TABLE IF EXISTS `field_boss_rank`;
CREATE TABLE `field_boss_rank` (
`id`  int(11) NOT NULL COMMENT '轮数' ,
`time`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '时间字符串' ,
`kn`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '击杀者名称' ,
PRIMARY KEY (`id`, `time`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='野外boss每日英雄榜'

;

-- ----------------------------
-- Table structure for `field_boss_vip_rank`
-- ----------------------------
DROP TABLE IF EXISTS `field_boss_vip_rank`;
CREATE TABLE `field_boss_vip_rank` (
`id`  int(11) NOT NULL COMMENT '轮数' ,
`time`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '时间字符串' ,
`kn`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '击杀者名称' ,
PRIMARY KEY (`id`, `time`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='野外boss每日英雄榜'

;

-- ----------------------------
-- Table structure for `friend`
-- ----------------------------
DROP TABLE IF EXISTS `friend`;
CREATE TABLE `friend` (
`id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`friend_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`type`  int(11) NOT NULL COMMENT '1:好友 2：仇人 3:陌生人' ,
`last_touch_time`  datetime NOT NULL COMMENT '最近联系时间' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `func_cd`
-- ----------------------------
DROP TABLE IF EXISTS `func_cd`;
CREATE TABLE `func_cd` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`cd_key`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`start_time`  datetime NOT NULL ,
`online_second`  int(11) NULL DEFAULT '-1' COMMENT '在线时间（秒）,-1表示离线CD类型' ,
PRIMARY KEY (`player_id`, `cd_key`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='玩家倒计时功能表'

;

-- ----------------------------
-- Table structure for `growth_gift`
-- ----------------------------
DROP TABLE IF EXISTS `growth_gift`;
CREATE TABLE `growth_gift` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`growth_id`  int(4) NOT NULL ,
`rec_count`  int(4) UNSIGNED ZEROFILL NOT NULL ,
`buy_lv`  int(4) NOT NULL DEFAULT 1 COMMENT '玩家购买时的等级' ,
PRIMARY KEY (`player_id`, `growth_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `guaji`
-- ----------------------------
DROP TABLE IF EXISTS `guaji`;
CREATE TABLE `guaji` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`json`  varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`max_exp`  bigint(20) NOT NULL DEFAULT 0 COMMENT '挂机历史最大经验值' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='挂机设置'

;

-- ----------------------------
-- Table structure for `guaji_copy`
-- ----------------------------
DROP TABLE IF EXISTS `guaji_copy`;
CREATE TABLE `guaji_copy` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`json`  varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`max_exp`  bigint(20) NOT NULL DEFAULT 0 COMMENT '挂机历史最大经验值' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='挂机设置'

;

-- ----------------------------
-- Table structure for `hilarity_record`
-- ----------------------------
DROP TABLE IF EXISTS `hilarity_record`;
CREATE TABLE `hilarity_record` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`hilarity_id`  int(11) NOT NULL COMMENT '狂欢ID' ,
`value`  int(11) NOT NULL COMMENT '数值' ,
PRIMARY KEY (`player_id`, `hilarity_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `instance_rank`
-- ----------------------------
DROP TABLE IF EXISTS `instance_rank`;
CREATE TABLE `instance_rank` (
`instance_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`type`  tinyint(4) NOT NULL COMMENT '挑战者（1:用时最短）' ,
`rank_id`  int(11) NOT NULL COMMENT '名次' ,
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`player_name`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '玩家昵称' ,
`time`  int(11) NOT NULL COMMENT '用时' ,
PRIMARY KEY (`instance_id`, `type`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `instance_record`
-- ----------------------------
DROP TABLE IF EXISTS `instance_record`;
CREATE TABLE `instance_record` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`instance_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`time`  tinyint(4) NOT NULL COMMENT '当前完成挑战次数' ,
`sweep`  tinyint(4) NOT NULL COMMENT '当前扫荡次数' ,
`star`  int(11) NOT NULL COMMENT '(星级)(虚灵塔层数)' ,
`use_time`  int(11) NOT NULL COMMENT '使用时间' ,
`reset_times`  int(11) NOT NULL COMMENT '重置次数' ,
`dare_times`  int(11) NOT NULL COMMENT '购买挑战次数' ,
`sweep_times`  int(11) NOT NULL COMMENT '购买扫荡次数' ,
`first_reward`  int(11) NOT NULL COMMENT '0:为领取，1:已经领取' ,
PRIMARY KEY (`player_id`, `instance_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `instance_rewards`
-- ----------------------------
DROP TABLE IF EXISTS `instance_rewards`;
CREATE TABLE `instance_rewards` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`rewards_record`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '(副本星级奖励)type+kind_12_24_36_48,type+kind_12_24_36_48,...' ,
`tower_first_rewards`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '虚灵塔第一次通过奖励记录(层数1_0|层数2_0|层数3_0|)(0:未领取，1：已领取)' ,
`tower_sweep_end_time`  int(11) NOT NULL COMMENT '虚灵塔扫描结束时间' ,
`tower_sweep_rewards`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '虚灵塔扫荡奖励（spId_num|spId_num|....）' ,
`experience_rewards`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '宗门历练奖励发放奖励（奖励id_奖励次数,......）' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `item`
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
`id`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`position`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`status`  tinyint(4) NOT NULL ,
`spId`  int(11) NOT NULL ,
`amount`  smallint(5) UNSIGNED NOT NULL DEFAULT 1 COMMENT '' ,
`idx`  smallint(6) NOT NULL DEFAULT 0 COMMENT '' ,
`data`  varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
PRIMARY KEY (`id`),
INDEX `position` (`position`) USING BTREE ,
INDEX `sp_id` (`spId`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `letters`
-- ----------------------------
DROP TABLE IF EXISTS `letters`;
CREATE TABLE `letters` (
`id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`letter_type`  tinyint(4) NOT NULL DEFAULT 0 COMMENT '0普通,1系统发出, 2 系统群发信件,' ,
`created_at`  datetime NOT NULL ,
`title`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`content`  varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '内容' ,
`item_type`  int(11) NULL DEFAULT 0 ,
`attach`  varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '附件，jsonstring' ,
`level_limit`  int(11) NULL DEFAULT 0 COMMENT '群发邮件等级限制' ,
`start_time`  datetime NULL DEFAULT NULL COMMENT '群发邮件开始时间' ,
`end_time`  datetime NULL DEFAULT NULL COMMENT '群发邮件结束时间' ,
`player_ids`  varchar(2048) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '多个角色ID字母逗号分割' ,
PRIMARY KEY (`id`),
INDEX `created_at` (`created_at`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='信件'

;

-- ----------------------------
-- Table structure for `letters_last_check`
-- ----------------------------
DROP TABLE IF EXISTS `letters_last_check`;
CREATE TABLE `letters_last_check` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`last_time`  datetime NOT NULL ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='用户最后拉的系统群发信件时间'

;

-- ----------------------------
-- Table structure for `letters_player`
-- ----------------------------
DROP TABLE IF EXISTS `letters_player`;
CREATE TABLE `letters_player` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`letter_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`status`  tinyint(4) NOT NULL COMMENT '0未读，1已读，2已提取' ,
`expire`  datetime NULL DEFAULT NULL COMMENT '过期时间，为null表示无限制' ,
PRIMARY KEY (`player_id`, `letter_id`),
INDEX `expire` (`expire`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='用户信件'

;

-- ----------------------------
-- Table structure for `log_player_bgold`
-- ----------------------------
DROP TABLE IF EXISTS `log_player_bgold`;
CREATE TABLE `log_player_bgold` (
`id`  bigint(20) NOT NULL AUTO_INCREMENT ,
`at_time`  datetime NOT NULL ,
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`with_player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' ,
`bgold_type`  smallint(6) NOT NULL ,
`bgold_now`  int(11) NOT NULL DEFAULT 0 ,
`bgold_add`  int(11) NOT NULL DEFAULT 0 ,
`remarks`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' ,
PRIMARY KEY (`id`),
INDEX `at_time` (`at_time`) USING BTREE ,
INDEX `player_id` (`player_id`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Table structure for `log_player_gold`
-- ----------------------------
DROP TABLE IF EXISTS `log_player_gold`;
CREATE TABLE `log_player_gold` (
`id`  bigint(20) NOT NULL AUTO_INCREMENT ,
`at_time`  datetime NOT NULL ,
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`with_player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' ,
`gold_type`  smallint(6) NOT NULL ,
`gold_now`  int(11) NOT NULL DEFAULT 0 ,
`gold_add`  int(11) NOT NULL DEFAULT 0 ,
`remarks`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' ,
PRIMARY KEY (`id`),
INDEX `at_time` (`at_time`) USING BTREE ,
INDEX `player_id` (`player_id`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Table structure for `log_player_money`
-- ----------------------------
DROP TABLE IF EXISTS `log_player_money`;
CREATE TABLE `log_player_money` (
`id`  bigint(20) NOT NULL AUTO_INCREMENT ,
`at_time`  datetime NOT NULL ,
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`with_player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`money_type`  smallint(6) NOT NULL ,
`money_now`  int(11) NOT NULL DEFAULT 0 ,
`money_add`  int(11) NOT NULL DEFAULT 0 ,
`remarks`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' ,
PRIMARY KEY (`id`),
INDEX `at_time` (`at_time`) USING BTREE ,
INDEX `player_id` (`player_id`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Table structure for `log_sys_bgold`
-- ----------------------------
DROP TABLE IF EXISTS `log_sys_bgold`;
CREATE TABLE `log_sys_bgold` (
`id`  bigint(20) NOT NULL AUTO_INCREMENT ,
`at_time`  datetime NOT NULL ,
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`bgold_type`  smallint(6) NOT NULL ,
`bgold`  int(11) NOT NULL DEFAULT 0 ,
`remarks`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' ,
PRIMARY KEY (`id`),
INDEX `at_time` (`at_time`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Table structure for `log_sys_gold`
-- ----------------------------
DROP TABLE IF EXISTS `log_sys_gold`;
CREATE TABLE `log_sys_gold` (
`id`  bigint(20) NOT NULL AUTO_INCREMENT ,
`at_time`  datetime NOT NULL ,
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`gold_type`  smallint(6) NOT NULL ,
`gold`  int(11) NOT NULL DEFAULT 0 ,
`remarks`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' ,
PRIMARY KEY (`id`),
INDEX `at_time` (`at_time`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Table structure for `log_sys_money`
-- ----------------------------
DROP TABLE IF EXISTS `log_sys_money`;
CREATE TABLE `log_sys_money` (
`id`  bigint(20) NOT NULL AUTO_INCREMENT ,
`at_time`  datetime NOT NULL ,
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`money_type`  smallint(6) NOT NULL ,
`money`  int(11) NOT NULL DEFAULT 0 ,
`remarks`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' ,
PRIMARY KEY (`id`),
INDEX `at_time` (`at_time`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Table structure for `login`
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`login_time`  datetime NULL DEFAULT NULL ,
`logout_time`  datetime NULL DEFAULT NULL ,
`total_online_second`  bigint(20) NULL DEFAULT 0 COMMENT '总在线时长（秒）' ,
`offline_rm`  int(11) NULL DEFAULT 0 COMMENT '购买的离线时间（分钟）' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `message_record`
-- ----------------------------
DROP TABLE IF EXISTS `message_record`;
CREATE TABLE `message_record` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`stranger_times`  tinyint(4) NOT NULL COMMENT '给陌生人发送消息次数' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `minipack`
-- ----------------------------
DROP TABLE IF EXISTS `minipack`;
CREATE TABLE `minipack` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`pack_id`  int(2) NOT NULL DEFAULT 1 COMMENT '下载奖励配表id' ,
`rec_count`  int(2) NOT NULL DEFAULT 0 COMMENT '领取次数' ,
PRIMARY KEY (`player_id`, `pack_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `mobao`
-- ----------------------------
DROP TABLE IF EXISTS `mobao`;
CREATE TABLE `mobao` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`mobao_id`  int(11) NOT NULL ,
`status`  tinyint(4) NOT NULL DEFAULT 0 COMMENT '0未激活，1已激活' ,
PRIMARY KEY (`player_id`, `mobao_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='魔宝'

;

-- ----------------------------
-- Table structure for `mount`
-- ----------------------------
DROP TABLE IF EXISTS `mount`;
CREATE TABLE `mount` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`mount_id`  int(11) NOT NULL DEFAULT 0 ,
`expire_time`  datetime NULL DEFAULT NULL ,
`rid`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '飞行载具路径' ,
`per`  int(11) NULL DEFAULT 0 COMMENT '飞行载具进度' ,
PRIMARY KEY (`player_id`, `mount_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='载具'

;

-- ----------------------------
-- Table structure for `new_trump`
-- ----------------------------
DROP TABLE IF EXISTS `new_trump`;
CREATE TABLE `new_trump` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`trump_id`  int(11) NOT NULL ,
`status`  tinyint(4) NOT NULL DEFAULT 0 COMMENT '0未激活 1可激活 2已激活 3佩戴中' ,
PRIMARY KEY (`player_id`, `trump_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='新法宝'

;

-- ----------------------------
-- Table structure for `new_trump_fighting`
-- ----------------------------
DROP TABLE IF EXISTS `new_trump_fighting`;
CREATE TABLE `new_trump_fighting` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`fighting`  int(11) NULL DEFAULT 0 ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `new_trump_refine`
-- ----------------------------
DROP TABLE IF EXISTS `new_trump_refine`;
CREATE TABLE `new_trump_refine` (
`player_id`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`trump_id`  int(11) NOT NULL ,
`level`  int(11) NOT NULL DEFAULT 1 COMMENT '法宝重数' ,
`hp_max`  int(11) NULL DEFAULT 0 ,
`phy_att`  int(11) NULL DEFAULT 0 ,
`mag_att`  int(11) NULL DEFAULT 0 ,
`phy_def`  int(11) NULL DEFAULT 0 ,
`mag_def`  int(11) NULL DEFAULT 0 ,
`hit`  int(11) NULL DEFAULT 0 ,
`eva`  int(11) NULL DEFAULT 0 ,
`crit`  int(11) NULL DEFAULT 0 ,
`tough`  int(11) NULL DEFAULT 0 ,
`fatal`  int(11) NULL DEFAULT 0 ,
`block`  int(11) NULL DEFAULT 0 ,
`direct_dmg`  int(11) NULL DEFAULT 0 ,
PRIMARY KEY (`player_id`, `trump_id`, `level`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='新法宝精炼'

;

-- ----------------------------
-- Table structure for `notice`
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
`id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`notice_way`  tinyint(4) NOT NULL COMMENT '公告方式 1、弹出公告 2、时间安排播放 （在时间范围内登录，进行显示）' ,
`show_way`  tinyint(4) NOT NULL COMMENT '1、置顶 2、聊天栏' ,
`start_time`  datetime NOT NULL ,
`end_time`  datetime NOT NULL ,
`last_time`  datetime NOT NULL COMMENT '最后一次发送时间' ,
`intervals`  int(11) NOT NULL COMMENT '间隔' ,
`theme`  varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '主题' ,
`content`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内容' ,
PRIMARY KEY (`id`),
INDEX `start_time` (`start_time`, `end_time`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `open_level`
-- ----------------------------
DROP TABLE IF EXISTS `open_level`;
CREATE TABLE `open_level` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '角色id' ,
`level_id`  int(4) NOT NULL COMMENT '开服冲级配置表id' ,
`rec_count`  int(2) UNSIGNED ZEROFILL NOT NULL DEFAULT 00 COMMENT '对应等级领取次数' ,
PRIMARY KEY (`player_id`, `level_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `partner`
-- ----------------------------
DROP TABLE IF EXISTS `partner`;
CREATE TABLE `partner` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`level`  int(11) NOT NULL COMMENT '等级' ,
`exp`  bigint(11) NOT NULL COMMENT '经验' ,
`star`  int(11) NOT NULL COMMENT '阶数' ,
`adv_exp`  bigint(11) NOT NULL COMMENT '进阶经验' ,
`use_id`  int(11) NOT NULL COMMENT '使用中的外形ID' ,
`fight`  int(11) NULL DEFAULT 0 ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `partner_transform`
-- ----------------------------
DROP TABLE IF EXISTS `partner_transform`;
CREATE TABLE `partner_transform` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`id`  int(11) NOT NULL COMMENT '幻形ID' ,
`level`  int(11) NOT NULL COMMENT '幻形等级' ,
PRIMARY KEY (`player_id`, `id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `pay`
-- ----------------------------
DROP TABLE IF EXISTS `pay`;
CREATE TABLE `pay` (
`id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单号' ,
`at_time`  datetime NOT NULL ,
`order_id`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'sdk返回的订单号' ,
`username`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`pf`  int(11) NOT NULL DEFAULT 0 ,
`channel_id`  int(11) NOT NULL DEFAULT 0 ,
`rmb`  int(11) NOT NULL DEFAULT 0 COMMENT '单位分' ,
`product_id`  int(11) NOT NULL COMMENT '充值产品id' ,
PRIMARY KEY (`id`),
INDEX `at_time` (`at_time`) USING BTREE ,
INDEX `player_id` (`player_id`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player`
-- ----------------------------
DROP TABLE IF EXISTS `player`;
CREATE TABLE `player` (
  `id` varchar(20) NOT NULL,
  `username` varchar(50) NOT NULL,
  `server_id` int(11) NOT NULL DEFAULT '0',
  `name` varchar(20) NOT NULL,
  `kind` int(11) NOT NULL COMMENT '职业 ',
  `sex` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0 男性、1 女性',
  `create_at` datetime NOT NULL,
  `del_flag` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0 正常，1 删除中，2 已删除',
  `del_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `username` (`username`) USING BTREE,
  KEY `del_flag` (`del_flag`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `player_activity`
-- ----------------------------
DROP TABLE IF EXISTS `player_activity`;
CREATE TABLE `player_activity` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`active_value`  int(11) NOT NULL COMMENT '活跃度' ,
`reward_record`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '领取奖励记录(编号_活跃值1|编号_活跃值2.....)' ,
`active_value_total`  int(11) NOT NULL COMMENT '活跃历史总值' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_attr`
-- ----------------------------
DROP TABLE IF EXISTS `player_attr`;
CREATE TABLE `player_attr` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`level`  int(11) NULL DEFAULT 1 ,
`exp`  bigint(20) NULL DEFAULT 0 ,
`hp`  int(11) NULL DEFAULT 0 ,
`mp`  int(11) NULL DEFAULT 0 ,
`fighting`  int(11) NULL DEFAULT 0 COMMENT '战斗力' ,
`realm_lev`  int(11) NULL DEFAULT 0 COMMENT '境界等级' ,
`realm_compact_lev`  int(11) NULL DEFAULT 0 COMMENT '境界凝练等级' ,
`realm_skill`  varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '选择的境界技能，逗号分隔' ,
`realm_fighting`  int(11) NULL DEFAULT 0 COMMENT '境界战斗力' ,
`elixir`  varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '已使用的灵药' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_bag`
-- ----------------------------
DROP TABLE IF EXISTS `player_bag`;
CREATE TABLE `player_bag` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`size`  int(11) NOT NULL COMMENT '背包大小' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_ban`
-- ----------------------------
DROP TABLE IF EXISTS `player_ban`;
CREATE TABLE `player_ban` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`type`  int(11) NOT NULL COMMENT '封号类型' ,
`reason`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '原因描述' ,
`add_time`  datetime NOT NULL COMMENT '封号时间' ,
`end_time`  datetime NOT NULL COMMENT '结束时间' ,
`chat_time`  datetime NOT NULL COMMENT '可以说话时间' ,
`chat_reason`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '禁言原因' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_farm`
-- ----------------------------
DROP TABLE IF EXISTS `player_farm`;
CREATE TABLE `player_farm` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`exp`  int(11) NOT NULL ,
`level`  int(11) NOT NULL COMMENT '等级' ,
`water_times`  tinyint(4) NOT NULL COMMENT '浇水次数' ,
`guard_times`  tinyint(4) NOT NULL COMMENT '守护次数' ,
`guard_player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`guard_time`  datetime NOT NULL COMMENT '守护结束时间' ,
`stolen_times`  tinyint(4) NOT NULL COMMENT '每日偷药次数' ,
`stolen_time`  datetime NOT NULL COMMENT '最近投药时间' ,
`guard_odd`  int(11) NOT NULL COMMENT '添加守护概率' ,
`element`  tinyint(4) NOT NULL COMMENT '五行（1：金，2：木，3：水，4：火，5：土）' ,
`element_time`  datetime NULL DEFAULT NULL COMMENT '属性更新时间' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_fortune`
-- ----------------------------
DROP TABLE IF EXISTS `player_fortune`;
CREATE TABLE `player_fortune` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`arena_score`  int(11) NOT NULL DEFAULT 0 COMMENT '竞技场积分' ,
`vp`  int(11) NOT NULL DEFAULT 0 COMMENT 'MaxVP(真气)' ,
`spend`  int(11) NOT NULL DEFAULT 0 COMMENT '修为' ,
`battle_score`  int(11) NOT NULL DEFAULT 0 COMMENT '战场积分' ,
`tong_skill_capital`  int(11) NOT NULL DEFAULT 0 COMMENT '仙盟技能资金（用于升级帮会技能）' ,
`star_debris`  int(11) NOT NULL DEFAULT 0 COMMENT '命星碎片' ,
`star_coin`  int(11) NOT NULL DEFAULT 0 COMMENT '星辰精华' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='其他货币集合'

;

-- ----------------------------
-- Table structure for `player_friend`
-- ----------------------------
DROP TABLE IF EXISTS `player_friend`;
CREATE TABLE `player_friend` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`send_stranger_times`  int(11) NOT NULL COMMENT '向陌生人发送消息条数' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_gem_num`
-- ----------------------------
DROP TABLE IF EXISTS `player_gem_num`;
CREATE TABLE `player_gem_num` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`num`  int(11) NOT NULL COMMENT '所有镶嵌宝石的等级之和（排名时当宝石总等级相同时按照角色总战力进行排名）' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_gift`
-- ----------------------------
DROP TABLE IF EXISTS `player_gift`;
CREATE TABLE `player_gift` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`gift_id`  int(11) NOT NULL COMMENT '用 recharge_reward 的kind字段标示(kind字段是唯一的标示）' ,
`status`  int(11) NOT NULL COMMENT '礼包状态(0：未领取1：已领取2：邮件发送)' ,
`rewards`  varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '奖励(500001_1,500002_2）' ,
`add_time`  datetime NOT NULL COMMENT '添加时间' ,
`end_time`  datetime NOT NULL COMMENT '有效时间' ,
PRIMARY KEY (`player_id`, `gift_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_graphic`
-- ----------------------------
DROP TABLE IF EXISTS `player_graphic`;
CREATE TABLE `player_graphic` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`graphic_lev_1`  int(11) NOT NULL COMMENT 'id1_lev_exp|id2_lev_exp... (图阵位置_等级_经验)' ,
`graphic_exp_1`  int(11) NOT NULL ,
`graphic_lev_2`  int(11) NOT NULL ,
`graphic_exp_2`  int(11) NOT NULL ,
`graphic_lev_3`  int(11) NOT NULL ,
`graphic_exp_3`  int(11) NOT NULL ,
`graphic_lev_4`  int(11) NOT NULL ,
`graphic_exp_4`  int(11) NOT NULL ,
`fight`  int(11) NOT NULL COMMENT '图阵战斗力' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_hilarity`
-- ----------------------------
DROP TABLE IF EXISTS `player_hilarity`;
CREATE TABLE `player_hilarity` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`reward_record`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`hilarity_value`  int(11) NOT NULL COMMENT '狂欢值' ,
`hilarity_value_total`  int(11) NOT NULL COMMENT '历史狂欢总值' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_history`
-- ----------------------------
DROP TABLE IF EXISTS `player_history`;
CREATE TABLE `player_history` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`level`  int(11) NOT NULL COMMENT '玩家昨天的等级' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_last_scene`
-- ----------------------------
DROP TABLE IF EXISTS `player_last_scene`;
CREATE TABLE `player_last_scene` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`scene_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`x`  int(11) NULL DEFAULT NULL ,
`y`  int(11) NULL DEFAULT NULL ,
`z`  int(11) NULL DEFAULT NULL ,
`inst_scene_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '副本场景' ,
`inst_x`  int(11) NULL DEFAULT NULL ,
`inst_y`  int(11) NULL DEFAULT NULL ,
`inst_z`  int(11) NULL DEFAULT NULL ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_line`
-- ----------------------------
DROP TABLE IF EXISTS `player_line`;
CREATE TABLE `player_line` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`online_time`  bigint(20) NOT NULL COMMENT '累计在线时间（毫秒）' ,
`online_record`  int(11) NOT NULL COMMENT '在线领取奖励' ,
`login_days`  int(11) NOT NULL COMMENT '累计登陆天数' ,
`get_days`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '领取奖励天数(1_2_.....)' ,
`last_login`  datetime NOT NULL COMMENT '最近登陆日期' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_message`
-- ----------------------------
DROP TABLE IF EXISTS `player_message`;
CREATE TABLE `player_message` (
`id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`type`  tinyint(4) NOT NULL COMMENT '1：文字2：语音' ,
`send_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '发送者id' ,
`kind`  int(11) NOT NULL COMMENT '职业' ,
`send_name`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '发送者昵称' ,
`msg`  varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '消息体/语音翻译' ,
`url`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '翻译的语音文字' ,
`msg_time`  int(11) NOT NULL COMMENT '语音时长' ,
`crate_time`  datetime NOT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_money`
-- ----------------------------
DROP TABLE IF EXISTS `player_money`;
CREATE TABLE `player_money` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`money`  int(11) NOT NULL DEFAULT 0 ,
`gold`  int(11) NOT NULL DEFAULT 0 ,
`bgold`  int(11) NOT NULL DEFAULT 0 ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_newbie`
-- ----------------------------
DROP TABLE IF EXISTS `player_newbie`;
CREATE TABLE `player_newbie` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`id`  int(11) NOT NULL COMMENT '引导ID' ,
`st`  int(11) NOT NULL COMMENT '状态（1：获取，2开始，3：结束）' ,
`add_time`  datetime NOT NULL COMMENT '更新时间' ,
PRIMARY KEY (`player_id`, `id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_pk`
-- ----------------------------
DROP TABLE IF EXISTS `player_pk`;
CREATE TABLE `player_pk` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`pk_value`  int(11) NULL DEFAULT 0 ,
`yellow_time`  datetime NULL DEFAULT NULL COMMENT '黄名结束时间' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_rank`
-- ----------------------------
DROP TABLE IF EXISTS `player_rank`;
CREATE TABLE `player_rank` (
`pid`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '玩家ID' ,
`rfn`  int(11) NOT NULL COMMENT '收到花数量（receive_flower_num）' ,
`gfn`  int(11) NOT NULL COMMENT '送花数量（give_flower_num）' ,
`gpf`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '送花给玩家的记录（give_player_flower）' ,
PRIMARY KEY (`pid`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_realm`
-- ----------------------------
DROP TABLE IF EXISTS `player_realm`;
CREATE TABLE `player_realm` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`realm_lev`  int(11) NOT NULL DEFAULT 0 COMMENT '境界等级' ,
`realm_compact_lev`  int(11) NOT NULL DEFAULT 0 COMMENT '境界凝练等级' ,
`realm_id`  int(11) NOT NULL DEFAULT 1 COMMENT '选择的神通' ,
`realm_skill_one`  varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '神通一' ,
`realm_skill_two`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`realm_fighting`  int(11) NULL DEFAULT 0 COMMENT '境界战斗力' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_recharge_gift`
-- ----------------------------
DROP TABLE IF EXISTS `player_recharge_gift`;
CREATE TABLE `player_recharge_gift` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`recharge_id`  int(11) NOT NULL DEFAULT 0 ,
`num`  int(11) NOT NULL DEFAULT 0 COMMENT '可以领取次数' ,
`last_get_time`  datetime NULL DEFAULT NULL COMMENT '最近领取的日期' ,
PRIMARY KEY (`player_id`, `recharge_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_record`
-- ----------------------------
DROP TABLE IF EXISTS `player_record`;
CREATE TABLE `player_record` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`type`  int(11) NOT NULL COMMENT '类型（2：仙玉3：绑定仙玉）' ,
`num`  int(11) NOT NULL ,
PRIMARY KEY (`player_id`, `type`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_sign`
-- ----------------------------
DROP TABLE IF EXISTS `player_sign`;
CREATE TABLE `player_sign` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`sign_times`  int(11) NOT NULL COMMENT '签到次数' ,
`sign_expend_times`  int(11) NOT NULL COMMENT '补签次数' ,
`sign_time`  datetime NOT NULL COMMENT '签到时间' ,
`sign_total`  int(11) NOT NULL DEFAULT 0 COMMENT '累计签到次数' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_team`
-- ----------------------------
DROP TABLE IF EXISTS `player_team`;
CREATE TABLE `player_team` (
`player_id`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`invite`  tinyint(4) NOT NULL COMMENT '自动接受组队邀请' ,
`accept`  tinyint(4) NOT NULL COMMENT '自动接受入队申请' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `player_warn`
-- ----------------------------
DROP TABLE IF EXISTS `player_warn`;
CREATE TABLE `player_warn` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`money_t`  bigint(20) NOT NULL DEFAULT 0 COMMENT '30分钟累计铜钱' ,
`gold_t`  bigint(20) NOT NULL DEFAULT 0 COMMENT '30分钟累计仙玉' ,
`bind_gold_t`  bigint(20) NOT NULL DEFAULT 0 COMMENT '30分钟累计绑定仙玉' ,
`exp_t`  bigint(20) NOT NULL DEFAULT 0 COMMENT '30分钟累计经验' ,
`hurt_t`  bigint(20) NOT NULL DEFAULT 0 COMMENT '30分钟累计伤害' ,
`c_time`  datetime NOT NULL COMMENT '清空时间' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `rank_open_gift`
-- ----------------------------
DROP TABLE IF EXISTS `rank_open_gift`;
CREATE TABLE `rank_open_gift` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`type`  int(11) NOT NULL COMMENT 't:类型（1:等级榜,2:强化榜,3:宝石榜,4:法宝榜,5:充值榜,6:战力榜）' ,
`rank`  int(11) NOT NULL COMMENT '奖励档次' ,
`status`  int(11) NOT NULL COMMENT '0：可领取，1：标示已领取' ,
`kind`  int(11) NOT NULL COMMENT '职业' ,
PRIMARY KEY (`player_id`, `type`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `rank_open_server`
-- ----------------------------
DROP TABLE IF EXISTS `rank_open_server`;
CREATE TABLE `rank_open_server` (
`idx`  int(11) NOT NULL ,
`t`  int(11) NOT NULL COMMENT '（1:等级榜2:法宝榜3:境界榜4:宝石榜5:伙伴榜6:今日充值7:战力榜）' ,
`pid`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '玩家id' ,
`k`  int(11) NOT NULL COMMENT '玩家职业' ,
`name`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '玩家呢称' ,
`tn`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '帮会呢称' ,
`v`  int(11) NOT NULL ,
`v2`  int(11) NULL DEFAULT NULL ,
PRIMARY KEY (`idx`, `t`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `rank_partner_level`
-- ----------------------------
DROP TABLE IF EXISTS `rank_partner_level`;
CREATE TABLE `rank_partner_level` (
`id`  int(11) NOT NULL ,
`pi`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '玩家id' ,
`pn`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '玩家呢称' ,
`s`  int(11) NOT NULL COMMENT '星级' ,
`c`  int(11) NOT NULL COMMENT '职业' ,
`use_id`  int(11) NOT NULL COMMENT '当前使用中的宠物形象' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `rank_player_fight`
-- ----------------------------
DROP TABLE IF EXISTS `rank_player_fight`;
CREATE TABLE `rank_player_fight` (
`id`  int(11) NOT NULL COMMENT '排名' ,
`pi`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '玩家id' ,
`pn`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '玩家呢称' ,
`ft`  int(11) NOT NULL COMMENT '战斗力' ,
`c`  int(11) NOT NULL COMMENT 'career(职业)' ,
PRIMARY KEY (`id`),
INDEX `pi` (`pi`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `rank_player_gold`
-- ----------------------------
DROP TABLE IF EXISTS `rank_player_gold`;
CREATE TABLE `rank_player_gold` (
`id`  int(11) NOT NULL ,
`pi`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '玩家id' ,
`pn`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '玩家呢称' ,
`gold`  int(11) NOT NULL COMMENT '元宝' ,
`c`  int(11) NOT NULL COMMENT 'career(职业)' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `rank_player_guaji`
-- ----------------------------
DROP TABLE IF EXISTS `rank_player_guaji`;
CREATE TABLE `rank_player_guaji` (
`id`  int(11) NOT NULL ,
`pi`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`pn`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`exp`  bigint(20) NOT NULL ,
`c`  int(11) NOT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `rank_player_level`
-- ----------------------------
DROP TABLE IF EXISTS `rank_player_level`;
CREATE TABLE `rank_player_level` (
`id`  int(20) NOT NULL ,
`pi`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`pn`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`lv`  int(11) NOT NULL COMMENT '等级' ,
`c`  int(11) NOT NULL COMMENT '职业' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `rank_player_money`
-- ----------------------------
DROP TABLE IF EXISTS `rank_player_money`;
CREATE TABLE `rank_player_money` (
`id`  int(11) NOT NULL ,
`pi`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '玩家id' ,
`pn`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '玩家呢称' ,
`money`  int(11) NOT NULL COMMENT '金钱' ,
`c`  int(11) NOT NULL COMMENT 'career(职业)' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `rank_player_realm`
-- ----------------------------
DROP TABLE IF EXISTS `rank_player_realm`;
CREATE TABLE `rank_player_realm` (
`id`  int(11) NOT NULL ,
`pi`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '玩家id' ,
`pn`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '玩家呢称' ,
`lv`  int(11) NOT NULL COMMENT '境界等级' ,
`c`  int(11) NOT NULL COMMENT 'career(职业)' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `rank_tong_fight`
-- ----------------------------
DROP TABLE IF EXISTS `rank_tong_fight`;
CREATE TABLE `rank_tong_fight` (
`id`  int(11) NOT NULL ,
`tid`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '仙盟id(tong_id)' ,
`tn`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '帮会呢称（tong_name）' ,
`otn`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '盟主呢称（owner_tong_name）' ,
`ft`  int(11) NOT NULL COMMENT '战斗力' ,
`n`  int(11) NOT NULL COMMENT '人数number ' ,
`c`  int(11) NOT NULL COMMENT '职业（career）' ,
`lv`  int(11) NOT NULL COMMENT '帮会等级' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `rank_tong_level`
-- ----------------------------
DROP TABLE IF EXISTS `rank_tong_level`;
CREATE TABLE `rank_tong_level` (
`id`  int(11) NOT NULL ,
`tid`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '仙盟id(tong_id)' ,
`tn`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '帮会呢称（tong_name）' ,
`otn`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '盟主呢称（owner_tong_name）' ,
`lv`  int(11) NOT NULL COMMENT '帮会等级' ,
`n`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '人数number ' ,
`c`  int(11) NOT NULL COMMENT '职业（career）' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `rank_tower`
-- ----------------------------
DROP TABLE IF EXISTS `rank_tower`;
CREATE TABLE `rank_tower` (
`id`  int(11) NOT NULL ,
`pi`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '玩家id' ,
`pn`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '玩家呢称' ,
`lv`  int(11) NOT NULL COMMENT '等级' ,
`c`  int(11) NOT NULL COMMENT 'career(职业)' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `rank_wing`
-- ----------------------------
DROP TABLE IF EXISTS `rank_wing`;
CREATE TABLE `rank_wing` (
`id`  int(11) NOT NULL ,
`pi`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '玩家id' ,
`pn`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '玩家呢称' ,
`r`  int(11) NOT NULL COMMENT 'rank(阶数)' ,
`lv`  int(11) NOT NULL COMMENT 'level星级' ,
`c`  int(11) NOT NULL COMMENT 'career(职业)' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `rank_yunying_gold`
-- ----------------------------
DROP TABLE IF EXISTS `rank_yunying_gold`;
CREATE TABLE `rank_yunying_gold` (
`id`  int(11) NOT NULL COMMENT '排名' ,
`pi`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`pn`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`gold`  int(11) NOT NULL COMMENT '消耗仙玉数值' ,
`c`  int(11) NOT NULL COMMENT '职业' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `red_packet`
-- ----------------------------
DROP TABLE IF EXISTS `red_packet`;
CREATE TABLE `red_packet` (
`rpid`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`tong_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '-1' COMMENT '所属帮会，如果没有，则为-1' ,
`rptid`  tinyint(4) NOT NULL COMMENT '红包种类id' ,
`st`  tinyint(4) NOT NULL DEFAULT 0 COMMENT '状态：0未发，1已发' ,
`bgold`  int(11) NOT NULL COMMENT '总金币' ,
`num`  int(11) NOT NULL COMMENT '红包数量' ,
`rt_bgold`  int(11) NULL DEFAULT 0 COMMENT '剩余金币' ,
`rt_num`  int(11) NULL DEFAULT 0 COMMENT '剩余数量' ,
`at_time`  datetime NOT NULL ,
PRIMARY KEY (`rpid`),
INDEX `player_id` (`player_id`) USING BTREE ,
INDEX `tong_id` (`tong_id`) USING BTREE ,
INDEX `st` (`st`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='帮会红包'

;

-- ----------------------------
-- Table structure for `red_packet_detail`
-- ----------------------------
DROP TABLE IF EXISTS `red_packet_detail`;
CREATE TABLE `red_packet_detail` (
`rpid`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`bgold`  int(11) NOT NULL COMMENT '得到的金币' ,
`at_time`  datetime NOT NULL ,
PRIMARY KEY (`rpid`, `player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='红包明细'

;

-- ----------------------------
-- Table structure for `ride`
-- ----------------------------
DROP TABLE IF EXISTS `ride`;
CREATE TABLE `ride` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`ride_id`  int(11) NOT NULL ,
`status`  tinyint(4) NOT NULL DEFAULT 0 COMMENT '1 使用 0 未用' ,
`expire_time`  datetime NULL DEFAULT NULL ,
PRIMARY KEY (`player_id`, `ride_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='坐骑'

;

-- ----------------------------
-- Table structure for `ride_feed`
-- ----------------------------
DROP TABLE IF EXISTS `ride_feed`;
CREATE TABLE `ride_feed` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`level`  int(11) NOT NULL DEFAULT 1 ,
`exp`  int(11) NOT NULL DEFAULT 0 ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='坐骑养魂'

;

-- ----------------------------
-- Table structure for `sell_item`
-- ----------------------------
DROP TABLE IF EXISTS `sell_item`;
CREATE TABLE `sell_item` (
`id`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`spId`  int(11) NOT NULL ,
`amount`  smallint(6) NOT NULL ,
`price`  int(11) NOT NULL COMMENT '单价' ,
`put_on_time`  datetime NOT NULL COMMENT '上架时间' ,
`sold_out_time`  datetime NOT NULL COMMENT '下架时间' ,
`sell_time`  int(11) NOT NULL COMMENT '时间类型(24,48,72)' ,
`t`  int(11) NOT NULL COMMENT '类型' ,
`k`  int(11) NOT NULL COMMENT '类型' ,
`random`  int(11) NOT NULL DEFAULT 0 COMMENT '算法随机数' ,
PRIMARY KEY (`id`),
INDEX `player_id` (`player_id`) USING BTREE ,
INDEX `player_id_2` (`t`, `k`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `sell_item_income`
-- ----------------------------
DROP TABLE IF EXISTS `sell_item_income`;
CREATE TABLE `sell_item_income` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`bgold`  int(11) NOT NULL COMMENT '金币' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `sell_item_log`
-- ----------------------------
DROP TABLE IF EXISTS `sell_item_log`;
CREATE TABLE `sell_item_log` (
`id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`spId`  int(11) NOT NULL ,
`num`  int(11) NOT NULL COMMENT '成交金价' ,
`add_time`  datetime NOT NULL COMMENT '添加时间' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `sell_item_price`
-- ----------------------------
DROP TABLE IF EXISTS `sell_item_price`;
CREATE TABLE `sell_item_price` (
`spId`  int(11) NOT NULL COMMENT '物品ID' ,
`price`  int(11) NOT NULL COMMENT '最近成交价格' ,
PRIMARY KEY (`spId`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `sell_item_refresh`
-- ----------------------------
DROP TABLE IF EXISTS `sell_item_refresh`;
CREATE TABLE `sell_item_refresh` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`refresh_time`  datetime NOT NULL COMMENT '物品刷新时间' ,
`random`  int(11) NOT NULL DEFAULT 0 COMMENT '算法开始的随机数' ,
`tk_count`  varchar(2048) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '种类对应的随机数获得的数量列表，Map(t_k:count_list)' ,
PRIMARY KEY (`player_id`)
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
-- Table structure for `shop_record`
-- ----------------------------
DROP TABLE IF EXISTS `shop_record`;
CREATE TABLE `shop_record` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`shop_id`  int(11) NOT NULL ,
`product_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`time`  int(11) NOT NULL COMMENT '次数' ,
PRIMARY KEY (`player_id`, `shop_id`, `product_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `skill`
-- ----------------------------
DROP TABLE IF EXISTS `skill`;
CREATE TABLE `skill` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`skill_id`  int(11) NOT NULL ,
`level`  tinyint(4) NOT NULL ,
PRIMARY KEY (`player_id`, `skill_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `skill_set`
-- ----------------------------
DROP TABLE IF EXISTS `skill_set`;
CREATE TABLE `skill_set` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`config`  varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '技能配置' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='技能配置'

;

-- ----------------------------
-- Table structure for `store_record`
-- ----------------------------
DROP TABLE IF EXISTS `store_record`;
CREATE TABLE `store_record` (
`player_id`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`store_id`  int(11) NOT NULL COMMENT '商店编号ID' ,
`times`  int(11) NOT NULL DEFAULT 0 COMMENT '今日购买数量' ,
`total_times`  int(11) NOT NULL DEFAULT 0 COMMENT '总次数' ,
`week_times`  int(11) NOT NULL DEFAULT 0 COMMENT '本周购买数量' ,
PRIMARY KEY (`player_id`, `store_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `task`
-- ----------------------------
DROP TABLE IF EXISTS `task`;
CREATE TABLE `task` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`task_id`  int(11) NOT NULL ,
`task_type`  tinyint(4) NOT NULL DEFAULT 1 ,
`status`  tinyint(4) NOT NULL DEFAULT 0 ,
`num`  int(11) NOT NULL DEFAULT 0 COMMENT '目标数量' ,
`at_time`  datetime NOT NULL ,
PRIMARY KEY (`player_id`, `task_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `task_helper`
-- ----------------------------
DROP TABLE IF EXISTS `task_helper`;
CREATE TABLE `task_helper` (
`tong_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`task_id`  int(11) NOT NULL ,
PRIMARY KEY (`tong_id`, `player_id`, `task_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='任务求助表'

;

-- ----------------------------
-- Table structure for `test`
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
`id`  int(11) NOT NULL ,
`name`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`at_time`  datetime NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `time_record`
-- ----------------------------
DROP TABLE IF EXISTS `time_record`;
CREATE TABLE `time_record` (
`type`  int(11) NOT NULL COMMENT '标示类型' ,
`total`  int(11) NOT NULL COMMENT '总次数' ,
PRIMARY KEY (`type`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `title`
-- ----------------------------
DROP TABLE IF EXISTS `title`;
CREATE TABLE `title` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`title_id`  int(11) NOT NULL ,
`status`  tinyint(4) NOT NULL DEFAULT 0 COMMENT '0未获得，1已获得，2 使用中' ,
`num`  int(11) NOT NULL DEFAULT 0 ,
`expire_time`  datetime NULL DEFAULT NULL COMMENT '过期时间，null表示永久' ,
PRIMARY KEY (`player_id`, `title_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='称号表'

;

-- ----------------------------
-- Table structure for `tong`
-- ----------------------------
DROP TABLE IF EXISTS `tong`;
CREATE TABLE `tong` (
`id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`owner_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`name`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`owner_name`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`level`  int(11) NOT NULL COMMENT '等级' ,
`career`  int(11) NOT NULL COMMENT '职业' ,
`exp`  int(11) NOT NULL COMMENT '帮会经验' ,
`capital`  int(11) NOT NULL COMMENT '资金' ,
`capital_total`  int(11) NOT NULL COMMENT '累计资金（用于繁荣排行）' ,
`notice`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '公告' ,
`number`  int(11) NOT NULL COMMENT '帮会人数' ,
`create_time`  datetime NOT NULL ,
`ck`  int(11) NOT NULL COMMENT '0:检查，-1不检查' ,
`dec_capital_time`  datetime NOT NULL COMMENT '扣除帮会资金时间' ,
PRIMARY KEY (`id`),
INDEX `capital_total` (`capital_total`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `tong_app`
-- ----------------------------
DROP TABLE IF EXISTS `tong_app`;
CREATE TABLE `tong_app` (
`tong_id`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`player_name`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`level`  int(11) NOT NULL ,
`fight`  int(11) NOT NULL ,
`career`  int(11) NOT NULL COMMENT '职业' ,
`app_time`  datetime NOT NULL COMMENT '申请时间' ,
PRIMARY KEY (`tong_id`, `player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `tong_battle`
-- ----------------------------
DROP TABLE IF EXISTS `tong_battle`;
CREATE TABLE `tong_battle` (
`tong_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`point`  int(11) NOT NULL DEFAULT 0 ,
`fighting`  int(11) NOT NULL ,
`member_count`  int(11) NOT NULL DEFAULT 0 ,
`tong_rank`  int(11) NOT NULL DEFAULT 0 COMMENT '最终名次' ,
`first_tong_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '第一场比赛对手' ,
`second_tong_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '第二场比赛对手' ,
PRIMARY KEY (`tong_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='仙盟战'

;

-- ----------------------------
-- Table structure for `tong_boss`
-- ----------------------------
DROP TABLE IF EXISTS `tong_boss`;
CREATE TABLE `tong_boss` (
`tong_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`fight_boss_id`  int(11) NOT NULL COMMENT '挑战中的boss_id' ,
`boss_level`  int(11) NOT NULL COMMENT '当前挑战boss 的等级' ,
`boss_hp`  int(11) NOT NULL COMMENT '当前boss的hp' ,
`boss_max_hp`  int(11) NOT NULL COMMENT '挑战中boss最大血量' ,
`death_boss`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '挑战成功的boss(boss1_boss2_...)' ,
`create_time`  datetime NOT NULL COMMENT '挑战时间' ,
`rewards`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '仓库奖励(spid_num,spid_num）' ,
`obstacle`  varchar(150) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '障碍物（阻拦）' ,
PRIMARY KEY (`tong_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `tong_boss_chest`
-- ----------------------------
DROP TABLE IF EXISTS `tong_boss_chest`;
CREATE TABLE `tong_boss_chest` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`s`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'status(宝箱1_1,宝箱2_1，宝箱3_1)(0：没有获得，1：已领取)' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `tong_boss_rank`
-- ----------------------------
DROP TABLE IF EXISTS `tong_boss_rank`;
CREATE TABLE `tong_boss_rank` (
`tong_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '帮会ID' ,
`tong_name`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '帮会呢称' ,
`total_hart_value`  int(11) NOT NULL COMMENT '输出伤害值' ,
`total_hart_per`  int(11) NOT NULL COMMENT '总伤害(百分比89.9%)' ,
`total_time`  int(11) NOT NULL COMMENT '总时长（秒为单位）' ,
PRIMARY KEY (`tong_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `tong_boss_result`
-- ----------------------------
DROP TABLE IF EXISTS `tong_boss_result`;
CREATE TABLE `tong_boss_result` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`tong_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`player_name`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`career`  int(11) NOT NULL COMMENT '职业' ,
`value`  int(11) NOT NULL COMMENT '数值' ,
`rewards`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '仓库的奖励(spId_num,spId_num)' ,
PRIMARY KEY (`player_id`, `tong_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `tong_donate_log`
-- ----------------------------
DROP TABLE IF EXISTS `tong_donate_log`;
CREATE TABLE `tong_donate_log` (
`id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`t_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '帮会ID' ,
`msg`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '帮会日志记录' ,
`t`  datetime NOT NULL COMMENT '添加时间' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `tong_log`
-- ----------------------------
DROP TABLE IF EXISTS `tong_log`;
CREATE TABLE `tong_log` (
`id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`tong_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`message`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`add_time`  datetime NOT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `tong_member`
-- ----------------------------
DROP TABLE IF EXISTS `tong_member`;
CREATE TABLE `tong_member` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`tong_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`player_name`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`status`  int(11) NOT NULL COMMENT '身份：1：帮主2：副帮主，3:长老,4：普通成员,5:学徒' ,
`career`  int(11) NOT NULL COMMENT '职业' ,
`week_donate`  int(11) NOT NULL COMMENT '每周贡献' ,
`donate`  int(11) NOT NULL COMMENT '当日贡献' ,
`donate_total`  int(11) NOT NULL COMMENT '累计贡献' ,
`use_donate`  int(11) NOT NULL COMMENT '使用贡献' ,
`donate_item_total`  int(11) NOT NULL COMMENT '捐赠道具数量' ,
`donate_gold_total`  int(11) NOT NULL COMMENT '捐赠元宝数量' ,
`add_time`  datetime NOT NULL COMMENT '加入帮会时间' ,
`salary`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '帮会工资' ,
PRIMARY KEY (`player_id`),
INDEX `tong_id` (`tong_id`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `tong_player_skill`
-- ----------------------------
DROP TABLE IF EXISTS `tong_player_skill`;
CREATE TABLE `tong_player_skill` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`skill_id`  int(11) NOT NULL ,
`level`  int(11) NOT NULL ,
PRIMARY KEY (`player_id`, `skill_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `tong_relation`
-- ----------------------------
DROP TABLE IF EXISTS `tong_relation`;
CREATE TABLE `tong_relation` (
`tong_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`relation_tong_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '关系帮派' ,
`enemy_time`  datetime NOT NULL COMMENT '添加时间' ,
PRIMARY KEY (`tong_id`, `relation_tong_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `tong_salary`
-- ----------------------------
DROP TABLE IF EXISTS `tong_salary`;
CREATE TABLE `tong_salary` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `tong_skill`
-- ----------------------------
DROP TABLE IF EXISTS `tong_skill`;
CREATE TABLE `tong_skill` (
`tong_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`skill_id`  int(11) NOT NULL COMMENT '研究技能' ,
`level`  int(11) NOT NULL COMMENT '研究等级' ,
PRIMARY KEY (`tong_id`, `skill_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `tong_stronger`
-- ----------------------------
DROP TABLE IF EXISTS `tong_stronger`;
CREATE TABLE `tong_stronger` (
`tong_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '最强者' ,
`open_task`  tinyint(4) NULL DEFAULT 0 COMMENT '1开启额外仙盟次数' ,
PRIMARY KEY (`tong_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='仙盟最强者'

;

-- ----------------------------
-- Table structure for `tong_worship`
-- ----------------------------
DROP TABLE IF EXISTS `tong_worship`;
CREATE TABLE `tong_worship` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`worship_time`  datetime NULL DEFAULT NULL COMMENT '膜拜时间' ,
`task_time`  datetime NULL DEFAULT NULL COMMENT '领取任务次数时间' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='仙盟膜拜'

;

-- ----------------------------
-- Table structure for `tower_rank`
-- ----------------------------
DROP TABLE IF EXISTS `tower_rank`;
CREATE TABLE `tower_rank` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`player_level`  int(11) NOT NULL ,
`player_name`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`career`  int(11) NOT NULL COMMENT '职业' ,
`custom`  int(11) NOT NULL COMMENT '关卡' ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `treasure`
-- ----------------------------
DROP TABLE IF EXISTS `treasure`;
CREATE TABLE `treasure` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`id`  int(11) NOT NULL ,
`type`  int(11) NOT NULL COMMENT '类型（1：玄宝记录 2：玄宝额外记录）' ,
`st`  int(11) NOT NULL COMMENT '0未完成 1完成 2已领取奖励' ,
`num`  int(11) NOT NULL COMMENT '进度' ,
`progress`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '进度（用于特殊统计）1,2,3,....' ,
PRIMARY KEY (`player_id`, `id`, `type`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(50) NOT NULL,
  `server_id` int(11) NOT NULL DEFAULT '0',
  `pf` tinyint(4) NOT NULL DEFAULT '0' COMMENT '平台用户',
  `channel_id` int(11) DEFAULT '0' COMMENT '渠道id',
  `udid` varchar(50) DEFAULT '' COMMENT '设备唯一标示',
  `mac_addr` varchar(50) DEFAULT '',
  `ip` varchar(50) DEFAULT '',
  `create_time` datetime DEFAULT NULL,
  `last_player_id` varchar(20) DEFAULT '' COMMENT '最后登录用户',
  PRIMARY KEY (`username`,`server_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `user_ban`
-- ----------------------------
DROP TABLE IF EXISTS `user_ban`;
CREATE TABLE `user_ban` (
  `user_id` varchar(255) NOT NULL COMMENT '用户名|IP|MAC|UDID',
  `server_id` int(11) NOT NULL,
  `type` int(11) NOT NULL COMMENT '封号类型(0封禁账号,1封禁IP,2封禁MAC,3封禁UDID)',
  `add_time` datetime NOT NULL COMMENT '封号时间',
  `end_time` datetime NOT NULL COMMENT '结束时间',
  `reason` varchar(255) NOT NULL COMMENT '封号原因',
  PRIMARY KEY (`user_id`,`server_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `vip`
-- ----------------------------
DROP TABLE IF EXISTS `vip`;
CREATE TABLE `vip` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`lv`  tinyint(4) NOT NULL DEFAULT 0 ,
`exp`  int(11) NULL DEFAULT 0 ,
`rmb`  int(11) NULL DEFAULT 0 COMMENT '累计充值人民币（分）' ,
`first_recharge`  int(11) NULL DEFAULT 0 COMMENT '首充(0：没有首充，1：已首充，2：已领取）' ,
`first_30_recharge`  int(11) NULL DEFAULT 0 COMMENT '再充值30元(0：没有首充，1：已首充，2：已领取）' ,
`expire_time`  datetime NULL DEFAULT NULL ,
PRIMARY KEY (`player_id`),
INDEX `lv` (`lv`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `wing`
-- ----------------------------
DROP TABLE IF EXISTS `wing`;
CREATE TABLE `wing` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`wing_id`  int(11) NOT NULL DEFAULT 0 ,
`rank`  tinyint(4) NULL DEFAULT 1 COMMENT '阶数' ,
`level`  tinyint(4) NOT NULL DEFAULT 0 ,
`exp`  int(11) NOT NULL DEFAULT 0 ,
`upgrade_num`  int(11) NULL DEFAULT 0 ,
`crit_num`  int(11) NOT NULL DEFAULT 0 COMMENT '经验暴击次数' ,
`use_wing_id`  int(11) NOT NULL DEFAULT 0 COMMENT '正在使用的翅膀id' ,
`add_time`  datetime NULL DEFAULT NULL ,
PRIMARY KEY (`player_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `wing_fashion`
-- ----------------------------
DROP TABLE IF EXISTS `wing_fashion`;
CREATE TABLE `wing_fashion` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`fashion_id`  int(11) NOT NULL ,
`end_time`  bigint(20) NOT NULL COMMENT '结束时间' ,
PRIMARY KEY (`player_id`, `fashion_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `world_boss`
-- ----------------------------
DROP TABLE IF EXISTS `world_boss`;
CREATE TABLE `world_boss` (
`id`  tinyint(4) NOT NULL DEFAULT 1 ,
`boss_level`  int(11) NOT NULL DEFAULT 0 COMMENT '上次boss等级' ,
`kill_second`  int(11) NOT NULL DEFAULT 0 COMMENT '上次击杀秒数' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `yunying_buy_times`
-- ----------------------------
DROP TABLE IF EXISTS `yunying_buy_times`;
CREATE TABLE `yunying_buy_times` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`type`  int(11) NOT NULL COMMENT '限购ID(唯一标识符)' ,
`num`  int(11) NOT NULL COMMENT '当前购买次数' ,
PRIMARY KEY (`player_id`, `type`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `yunying_gift`
-- ----------------------------
DROP TABLE IF EXISTS `yunying_gift`;
CREATE TABLE `yunying_gift` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`gift_id`  int(11) NOT NULL ,
`status`  int(11) NOT NULL COMMENT '状态（0：可领取1：已领取）' ,
`career`  int(11) NOT NULL COMMENT '玩家职业' ,
PRIMARY KEY (`player_id`, `gift_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `yunying_seven_day`
-- ----------------------------
DROP TABLE IF EXISTS `yunying_seven_day`;
CREATE TABLE `yunying_seven_day` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`id`  int(11) NOT NULL ,
`yunying_id`  int(11) NOT NULL DEFAULT 0 ,
`status`  tinyint(4) NULL DEFAULT 0 COMMENT '0 未完成 1 已完成 2 已领奖' ,
`num`  int(11) NULL DEFAULT 0 ,
PRIMARY KEY (`player_id`, `id`),
INDEX `player_id` (`player_id`, `yunying_id`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='七天活动'

;

-- ----------------------------
-- Table structure for `yunying_seven_day_reward`
-- ----------------------------
DROP TABLE IF EXISTS `yunying_seven_day_reward`;
CREATE TABLE `yunying_seven_day_reward` (
`player_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`id`  int(11) NOT NULL ,
`yunying_id`  int(11) NOT NULL DEFAULT 0 ,
`status`  tinyint(4) NOT NULL DEFAULT 0 COMMENT '0 未领 1 已领' ,
PRIMARY KEY (`player_id`, `id`),
INDEX `player_id` (`player_id`, `yunying_id`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='七日活动奖励'

;

-- ----------------------------
-- Table structure for `yunying_time`
-- ----------------------------
DROP TABLE IF EXISTS `yunying_time`;
CREATE TABLE `yunying_time` (
`id`  int(11) NOT NULL ,
`open`  tinyint(4) NULL DEFAULT 0 COMMENT '开始状态：1已触发处理' ,
`effective`  tinyint(4) NULL DEFAULT 0 COMMENT '生效状态：1已触发处理' ,
`end`  tinyint(4) NULL DEFAULT 0 COMMENT '结束状态：1已触发处理' ,
`close`  tinyint(4) NULL DEFAULT 0 COMMENT '关闭状态：1已触发处理' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='运营时间表'

;

-- ----------------------------
-- Auto increment value for `log_player_bgold`
-- ----------------------------
ALTER TABLE `log_player_bgold` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `log_player_gold`
-- ----------------------------
ALTER TABLE `log_player_gold` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `log_player_money`
-- ----------------------------
ALTER TABLE `log_player_money` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `log_sys_bgold`
-- ----------------------------
ALTER TABLE `log_sys_bgold` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `log_sys_gold`
-- ----------------------------
ALTER TABLE `log_sys_gold` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `log_sys_money`
-- ----------------------------
ALTER TABLE `log_sys_money` AUTO_INCREMENT=1;
