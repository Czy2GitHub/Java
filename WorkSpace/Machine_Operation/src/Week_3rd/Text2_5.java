/**
 * 统计素数并求和。
要求统计给定整数MM和NN区间内素数的个数并对它们求和。
输入格式:
输入在一行中给出两个正整数MM和NN。
输出格式:
在一行中顺序输出MM和NN区间内素数的个数以及它们的和，数字间以空格分隔。

 */
package Week_3rd;
import java.util.*;
public class Text2_5 {
	public static void main(String[] args) {
		int sum = 0;
		int k = 0;					//换行用计数器
		int score = 0;			//计数器
		System.out.println("请输入要寻找素数的区间:");
		Scanner count = new Scanner(System.in);
		int MM = count.nextInt();
		int NN = count.nextInt();
		for(int i =MM;i<NN;i++) {
			if(i == 1) {
				continue;
			}
			int flag = 1;
			for(int j = 2;j <i;j++) {
				if(i % j == 0) {
					flag = 0;
					break;
				}
			}
				if(flag == 1) {	
			      System.out.print(i+" ");
			score++;	
			      sum = i + sum;
			      k++;
			      if(k == 5) {
			    	  System.out.println();
			    	  k = 0;
				}
				
			      }
		}		
		System.out.println();
	System.out.println(MM+"~"+NN+"区间内的素数个数是:"+score+"\n"+"它们的和是:"+sum);

	}
}