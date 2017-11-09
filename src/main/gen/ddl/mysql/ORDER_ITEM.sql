
/* ORDER_ITEM : 需求发布明细信息表 */
DROP TABLE IF EXISTS `ORDER_ITEM` ;
CREATE TABLE `ORDER_ITEM` (
    `ORDER_CODE` VARCHAR(32) BINARY NOT NULL	 COMMENT '需求编号',
    `ORDER_ITEM_CODE` VARCHAR(32) BINARY 	 COMMENT '品类项目编号',
    `ORDER_ITEM_DESC` VARCHAR(256) BINARY 	 COMMENT '品类项目描述',
    `ORDER_ITEM_SPECS` VARCHAR(64) BINARY 	 COMMENT '品类项目规格',
    `ORDER_ITEM_QUANTITY` INT 	 COMMENT '品类项目数量',
    `ORDER_ITEM_ESTIMATION` INT 	 COMMENT '品类项目期望单价(MAX)',
    `ORDER_ITEM_LOGISTICS_CODE` VARCHAR(128) BINARY 	 COMMENT '物流单号',
    `ORDER_ITEM_LOGISTICS_DESC` VARCHAR(256) BINARY 	 COMMENT '物流描述/动态',
    `ORDER_ITEM_ORDER_STATUS` INT 	 COMMENT '物流签收状态',
    `ORDER_ITEM_COMMENT` VARCHAR(256) BINARY 	 COMMENT '备注',
    `CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者',
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者',
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT '需求发布明细信息表' ;
ALTER TABLE `ORDER_ITEM` ADD CONSTRAINT `PK_ORDER_ITEM` PRIMARY KEY ( ORDER_CODE ) ;

DROP TABLE IF EXISTS `ORDER_ITEM_HT` ;
CREATE TABLE `ORDER_ITEM_HT` (
    `OPERATION_HISTORY_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '操作时间',
    `OPERATION_HISTORY_CATEGORY` CHAR(1) COMMENT '操作类别',
    `ORDER_CODE` VARCHAR(32) COMMENT '需求编号',
    `ORDER_ITEM_CODE` VARCHAR(32) COMMENT '品类项目编号',
    `ORDER_ITEM_DESC` VARCHAR(256) COMMENT '品类项目描述',
    `ORDER_ITEM_SPECS` VARCHAR(64) COMMENT '品类项目规格',
    `ORDER_ITEM_QUANTITY` INT COMMENT '品类项目数量',
    `ORDER_ITEM_ESTIMATION` INT COMMENT '品类项目期望单价(MAX)',
    `ORDER_ITEM_LOGISTICS_CODE` VARCHAR(128) COMMENT '物流单号',
    `ORDER_ITEM_LOGISTICS_DESC` VARCHAR(256) COMMENT '物流描述/动态',
    `ORDER_ITEM_ORDER_STATUS` INT COMMENT '物流签收状态',
    `ORDER_ITEM_COMMENT` VARCHAR(256) COMMENT '备注',
    `CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者',
    `CREATE_DATETIME` TIMESTAMP COMMENT '创建时间',
    `UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者',
    `UPDATE_DATETIME` TIMESTAMP COMMENT '更新时间'
);
