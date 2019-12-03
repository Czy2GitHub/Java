/**
 * 求分数序列前N项和
要求编写程序，计算序列 2/1+3/2+5/3+8/5+... 的前N项之和。注意该序列从第2项起，每一项的分子是前一项分子与分母的和，分母是前一项的分子。
输入格式:
输入在一行中给出一个正整数N。
输出格式:
在一行中输出部分和的值，精确到小数点后两位。题目保证计算结果不超过双精度范围。
输入样例:
20
输出样例:
32.66

 */
package Week_3rd;
import java.util.*;
public class Text2_6 {
	public static void main(String[] args) {
		double s = 2;
		Scanner flag = new Scanner(System.in);
		double t = 0;
		double i;
		int N = flag.nextInt();
		for( i = 1;i<N&&s>0.01;i+=2) {
				s = s + (i+1)/i+(2*i+1)/(i+1);
			}
		System.out.printf("前%d项的和是%.2f",N,s);
		}
	}
