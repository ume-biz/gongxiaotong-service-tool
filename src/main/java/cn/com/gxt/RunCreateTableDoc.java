package cn.com.gxt;

import org.umeframework.dora.tool.gen.sql.Excel2SqlGenerator;

/**
 * 1.根据Excel输入的Table列表信息及数据库连接信息，查询数据字典获取表定义的结构。<br> 
 * 2.根据上述结构生成数据库表设计文档。<br>
 * 
 * @author Yue MA
 */
public class RunCreateTableDoc {

	/**
	 * 主函数.<br>
	 * 允许方法：Eclipse中右键点击该类，选择[Run As] - [Java Application]选项执行.<br>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			new Excel2SqlGenerator().createTableDoc("input/create-table-doc");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
