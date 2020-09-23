create database mtj_center CHARSET=utf8;
grant all privileges on mtj_center.* to root@localhost identified by '123456';

create database mtj CHARSET=utf8;
grant all privileges on mtj.* to root@localhost identified by '123456';

-- 生成账号sql，请在mtj_mtj_center里运行
insert into user_center(username,password,pf,channel_id,udid,mac_addr,ip,create_time) values('test1',MD5('123456'),0,0,'','','',now());