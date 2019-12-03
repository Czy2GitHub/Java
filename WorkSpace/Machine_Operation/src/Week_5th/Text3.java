package Week_5th;
import java.util.Scanner;
/**
 * 1.实现 int sqrt(int x) 函数。
计算并返回 x 的平方根，其中 x 是非负整数。
由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * @author dell
 *
 */
public class Text3 {
		public static void main(String[] args) {
				Scanner sc1 = new Scanner(System.in);
				int x = sc1.nextInt();
				System.out.println(mySqrt(x));
		}
		public static int mySqrt(int x) {
			   long r = x;
			while (r*r > x)
																			r = (r + x / r) / 2;
			return (int) r; 
			}
}
