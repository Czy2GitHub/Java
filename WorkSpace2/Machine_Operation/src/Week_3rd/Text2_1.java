/**
 * 编写程序实现：1-100的自然数的累加和。
 */
package Week_3rd;

public class Text2_1 {
		public static void main(String[] args) {
			int	sum = 0;
			for(int i = 0;i<=100;i++) {
				sum = i + sum;
			}
			System.out.println("一到一百的自然数的累加和是:"+sum);
		}
}
