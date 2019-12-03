package Week_2nd;
/**
 *  实现一个数字加密器的程序设计，加密规则是：
 *加密结果 = （整数 * 10 + 5）/ 2 + 3.14159
 *要求加密结果仍为一整数。
 *提示：从控制台输入任意整数，应用加密规则对其进行加密，输出加密结果。
 * @author dell
 *
 */
import java.util.*;
public class Secondweeks_2nd_3 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("请输入需要加密的数字："); 
		if(obj.hasNextInt()) {
			int	number1 = obj.nextInt();
			number1 = (int)((number1*10+5)/2+3.14159);
			System.out.println("加密后的结果为："+number1);
		}else {
			System.out.println("输入错误！");
		}
	}
}
