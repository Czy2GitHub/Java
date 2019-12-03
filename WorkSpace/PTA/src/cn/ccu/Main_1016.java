package cn.ccu;


/**
 * 正整数 A 的“DA （为 1 位整数）部分”定义为由 A 中所有 DA组成的新整数 PA。例如：给定 A=3862767，DA​​ =6，则 A 的“6 部分”PA是 66，因为 A 中有 2 个 6。
 * 现给定 A、D​A、B、D​B，请编写程序计算 PA+PB。
 * @author dell
 *3862767 6 13530293 3
 */
import java.util.Scanner;
public class Main_1016 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int counter = 0;
		String A = sc1.next();
		int DA = sc1.nextInt();
		String B = sc1.next();
		int  DB = sc1.nextInt();
		char []A1 = A.toCharArray();
		int []a1 = new int[A1.length];
		for(int i = 0;i < a1.length;i++) {
			a1[i] = Integer.parseInt(String.valueOf(A1[i]));		//将字符串转化为int型数组
		}
		for(int i = 0;i < a1.length; i++) {
			if(a1[i] == DA) {
				counter++;
			}
		}
		int PA = 0;
		for(int i = 0; i<counter;i++) {
			PA = PA + (int)(DA*Math.pow(10, i));
		}
		
		counter = 0;
		char []B1 = B.toCharArray();
		int []b1 =new int[B1.length]; 
		for(int i = 0 ; i < b1.length;i++ ) {
			b1[i] = Integer.parseInt(String.valueOf(B1[i]));
		}
		for(int i = 0;i < b1.length; i++) {
			if(b1[i] == DB) {
				counter++;
			}
		}
		int	 PB = 0;
		for(int i = 0; i<counter;i++) {
			PB = PB + (int)(DB*Math.pow(10, i));
		}
	System.out.println(PA+PB);
	}
}
