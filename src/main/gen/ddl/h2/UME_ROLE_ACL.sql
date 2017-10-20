
DROP TABLE IF EXISTS `UME_ROLE_ACL` ;
CREATE TABLE `UME_ROLE_ACL` (
    `ROLE_ID` VARCHAR(32) NOT NULL	,
    `ACC_RES_ID` VARCHAR(32) NOT NULL	,
    `ACC_RES_TYPE` INT(2) NOT NULL	,
    `ACC_LEVEL` INT(2) NOT NULL	DEFAULT 1,
    `CREATE_AUTHOR` VARCHAR(32),
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `UPDATE_AUTHOR` VARCHAR(32),
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP
);
ALTER TABLE `UME_ROLE_ACL` ADD CONSTRAINT `PK_UME_ROLE_ACL` PRIMARY KEY ( ROLE_ID ,ACC_RES_ID ,ACC_RES_TYPE ,ACC_LEVEL ) ;
