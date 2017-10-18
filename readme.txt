工具使用方法

一 Table DTO/SQL/SqlMap的生成
1.将Tables设计书拷贝至 "gxt-service-tool/input/design-table" 目录，
  design-table目录下的第一层目录则默认是生成DTO的package名，例如：
  "co.jp.pprz.entity/PAPA-数据模型定义_v0.1.xlsx" 
  表示由"PAPA-数据模型定义_v0.1.xlsx"设计书生成的DTO代码的package名是"co.jp.pprz.entity"

2.运行"gxt-service-tool/src/main/java/co/jp/pprz/RunTableGenerator.java"中的主函数
  (Eclise中右键点击RunTableGenerator.java选择[Run As]-[Java Application])

3.运行成功后，生成代码至"gxt-service-tool/src/main/gen"目录，确认没有错误后，
  将生成的java代码拷贝至"ume-quickstart/src/main/java"
  将生成的ddl目录sql目录下的xml/sql文件拷贝至"ume-quickstart/src/main/resources"


