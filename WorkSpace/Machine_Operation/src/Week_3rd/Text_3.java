package Week_3rd;
/**
 *  编写程序,计算所有NN位水仙花数。
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
public class Text_3 {
	public static void main(String[] args) {
		Scanner flag = new Scanner(System.in);
		int a = 0;	
		int b = 0; 
		int c = 0;
		int NN = flag.nextInt();
		for(int i = (int)Math.pow(10,NN-1);i<Math.pow(10, NN);i++) {
			a = i;			//用于分离数的个十百位
		for(int j = 0;j < NN;j++) {				//计算水仙花数；
			b = a%10;					//求个位数字
			a = a/10;					//将十位数字转化为个位;
			c +=Math.pow(b, NN);			//判断水仙花数
		}
			if(i == c) {
				System.out.println(i);
			}
			c = 0;
		}
	}
}
