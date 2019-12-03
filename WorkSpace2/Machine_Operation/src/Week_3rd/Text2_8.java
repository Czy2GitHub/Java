package Week_3rd;
/**
 * 编写程序,计算所有NN位水仙花数。
水仙花数是指一个NN位正整数，它的每个位上的数字的NN次幂之和等于它本身。例如：153 = 1^3 + 5^3+ 3^3。
输入格式:
输入在一行中给出一个正整数NN。
输出格式:
按递增顺序输出所有NN位水仙花数，每个数字占一行。
输入样例:
3
输出样例:
153
370
371
407

 * @author dell
 *
 */
import java.util.*;
public class Text2_8 {

		public static void main(String[] args) {
			Scanner flag = new Scanner(System.in);
			System.out.println("请输入要寻找的水仙花数的位数:");
			int NN = flag.nextInt();
			if(NN == 2) {
			for(int i = 10;i>0&&i<100;i++) {
				if(i == ((i/10)%10)*((i/10)%10)*((i/10)%10)+(i%10)*(i%10)*(i%10)) {
				System.out.println(i);
			}
		}	
			}
			if(NN == 3) {
			for(int i = 101;i>100&&i<1000;i++) {
				if(i == ((i/100)%10)*((i/100)%10)*((i/100)%10)+((i/10)%10)*((i/10)%10)*((i/10)%10)+(i%10)*(i%10)*(i%10)){
					System.out.println(i);
				}
			}
		}
}
}
