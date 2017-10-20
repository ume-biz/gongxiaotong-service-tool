

DROP TABLE IF EXISTS `WECHAT_USER` ;
CREATE TABLE `WECHAT_USER` (
    `UID` VARCHAR(16) NOT NULL	,
    `WECHAT_OPENID` VARCHAR(32) 	,
    `WECHAT_CITY` VARCHAR(64) 	,
    `WECHAT_COUNTRY` VARCHAR(64) 	,
    `WECHAT_HEADIMGURL` VARCHAR(512) 	,
    `WECHAT_LANGUAGE` VARCHAR(64) 	,
    `WECHAT_NICKNAME` VARCHAR(1024) 	,
    `WECHAT_PROVINCE` VARCHAR(64) 	,
    `WECHAT_SEX` VARCHAR(8) 	,
    `WECHAT_UNIONID` VARCHAR(64) 	,
    `WECHAT_PRIVILEGE` VARCHAR(20) 	,
    `WECHAT_GROUPID` INT 	,
    `WECHAT_TAGID_LIST` VARCHAR(512) 	,
    `WECHAT_SUBSCRIBE` INT 	,
	`WECHAT_SUBSCRIBE_TIME` TIMESTAMP 	NULL DEFAULT NULL,
    `CREATE_AUTHOR` VARCHAR(32),
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `UPDATE_AUTHOR` VARCHAR(32),
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP
);
ALTER TABLE `WECHAT_USER` ADD CONSTRAINT `PK_WECHAT_USER` PRIMARY KEY ( UID ) ;

