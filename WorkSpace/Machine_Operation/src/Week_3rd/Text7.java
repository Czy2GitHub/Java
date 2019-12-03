/**
 * 编程实现求两个数的最大值。
 */
package Week_3rd;
import java.util.*;
public class Text7 {
		public static void main(String[] args) {
			Scanner flag = new Scanner(System.in);
			System.out.println("请输入两个需要求最大值的数");
			int number1 = flag.nextInt();
			int number2 = flag.nextInt();
			int c = Math.max(number1, number2);
			System.out.println(c);
		}
}
