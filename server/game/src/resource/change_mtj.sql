
ALTER TABLE `player_attr`
ADD COLUMN `job`  tinyint NULL DEFAULT 0 COMMENT '转职' AFTER `exp`,
ADD COLUMN `icon`  varchar(20) NULL DEFAULT '' AFTER `job`;

CREATE TABLE `yunying_recharge_day` (
  `player_id` varchar(255) NOT NULL,
  `yunying_id` int(11) NOT NULL,
  `days` int(11) NOT NULL,
  `id` int(11) NOT NULL DEFAULT '0',
  `type` int(11) NOT NULL,
  `times` int(11) NOT NULL,
  KEY `idx1` (`player_id`,`yunying_id`),
  KEY `idx2` (`yunying_id`,`days`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `yunying_weekcard` (
  `player_id` varchar(255) NOT NULL COMMENT '用户id',
  `counts` int(11) NOT NULL COMMENT '剩余的天数',
  `lastday` int(11) NOT NULL DEFAULT '0' COMMENT '最后领取月卡奖励的日期',
  PRIMARY KEY (`player_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;