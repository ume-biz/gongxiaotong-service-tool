
DROP TABLE IF EXISTS `ORDER_ITEM_PROP` ;
CREATE TABLE `ORDER_ITEM_PROP` (
    `ORDER_CODE` VARCHAR(32) NOT NULL	,
    `ORDER_ITEM_CODE` VARCHAR(32) 	,
    `ORDER_ITEM_PROP_GROUP` VARCHAR(256) 	,
    `ORDER_ITEM_PROP_KEY` VARCHAR(256) 	,
    `ORDER_ITEM_PROP_VALUE` VARCHAR(64) 	,
    `ORDER_ITEM_PROP_OPTION` INT 	,
    `CREATE_AUTHOR` VARCHAR(32),
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `UPDATE_AUTHOR` VARCHAR(32),
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP
);
ALTER TABLE `ORDER_ITEM_PROP` ADD CONSTRAINT `PK_ORDER_ITEM_PROP` PRIMARY KEY ( ORDER_CODE ) ;

DROP TABLE IF EXISTS `ORDER_ITEM_PROP_HT` ;
CREATE TABLE `ORDER_ITEM_PROP_HT` (
    `OPERATION_HISTORY_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `OPERATION_HISTORY_CATEGORY` CHAR(1),
    `ORDER_CODE` VARCHAR(32),
    `ORDER_ITEM_CODE` VARCHAR(32),
    `ORDER_ITEM_PROP_GROUP` VARCHAR(256),
    `ORDER_ITEM_PROP_KEY` VARCHAR(256),
    `ORDER_ITEM_PROP_VALUE` VARCHAR(64),
    `ORDER_ITEM_PROP_OPTION` INT,
    `CREATE_AUTHOR` VARCHAR(32),
    `CREATE_DATETIME` TIMESTAMP,
    `UPDATE_AUTHOR` VARCHAR(32),
    `UPDATE_DATETIME` TIMESTAMP
);