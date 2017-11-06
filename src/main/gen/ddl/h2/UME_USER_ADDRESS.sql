
DROP TABLE IF EXISTS `UME_USER_ADDRESS` ;
CREATE TABLE `UME_USER_ADDRESS` (
    `USER_ID` VARCHAR(32) NOT NULL	,
    `SEQ` INT NOT NULL	,
    `ADDRESS_PROVINCE` VARCHAR(8) 	,
    `ADDRESS_CITY` VARCHAR(8) 	,
    `ADDRESS_DISTRICT` VARCHAR(8) 	,
    `ADDRESS_REST` VARCHAR(64) 	,
    `CONTACT_PERSON` VARCHAR(16) 	,
    `CONTACT_NUMBER` VARCHAR(16) 	,
    `ADDRESS_TYPE` VARCHAR(16) 	,
    `CREATE_AUTHOR` VARCHAR(32),
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `UPDATE_AUTHOR` VARCHAR(32),
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP
);
ALTER TABLE `UME_USER_ADDRESS` ADD CONSTRAINT `PK_UME_USER_ADDRESS` PRIMARY KEY ( USER_ID ,SEQ ) ;