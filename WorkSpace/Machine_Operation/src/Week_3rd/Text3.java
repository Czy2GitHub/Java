/**
 * 编写程序，从键盘输入两个double类型的数x和数y，
 * 判断x是否等于y，并要求代码能够判断输入的x和y是否是无穷大或是否为空。
 */
package Week_3rd;
import java.util.*;
public class Text3 {
		public static void main(String[] args) {
			System.out.println("请输入两个数字:");
			Scanner score = new Scanner(System.in);
			double x = score.nextDouble();
			double y = score.nextDouble();
			if(x == y) {
				System.out.println("输入的两个数:"+x+"=="+y);
			}else if(x == Double.POSITIVE_INFINITY) {
				System.out.println("x为无穷大！");
			}else if(y == Double.POSITIVE_INFINITY) {
				System.out.println("y为无穷大！");
			}else if(x == Double.NaN){										//判断是否为空
				System.out.println("输入x为空！");
			}else if(y == Double.NaN) {
				System.out.println("输入y为空！");
			}
		}
}
