package cn.com.gxt;

import org.umeframework.dora.tool.gen.ServiceGenerator;

/**
 * ServiceGenerator
 *
 * @author MA YUE
 */
public class RunServiceGenerator {

	/**
	 * 主函数.<br>
	 * 允许方法：Eclipse中右键点击该类，选择[Run As] - [Java Application]选项执行.<br>
	 */
	public static void main(String[] args) {
		try {
			String inputPath = "input/design-service";
			new ServiceGenerator().execute(inputPath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
