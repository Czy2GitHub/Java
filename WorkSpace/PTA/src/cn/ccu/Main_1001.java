package cn.ccu;

import java.util.Scanner;

/**
 * 而是对给定的任一不超过 1000 的正整数 n，简单地数一下，需要多少步（砍几下）才能得到 n=1？(偶数砍一半，奇数3n+1砍掉一半)
 * @author dell
 *
 */
public class Main_1001 {
	public static void main(String [] args) {
		Scanner sc1 = new Scanner(System.in);
		int counter = 0;	//计数器
		int n =  sc1.nextInt();
		while(n!=1) {
			if(n %2 == 0) {
				n = n/2;
				counter++;
			}else {
				n = (3*n+1)/2;
				counter++;
			}
		}
		System.out.println(counter);
	}
}
