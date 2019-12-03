package cn.ccu;


/**
 * 给定区间 [−2^31,2^31] 内的 3 个整数 A、B 和 C，请判断 A+B 是否大于 C。
 * @author dell
 *
 */
import java.util.Scanner;
public class Main_1011 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int counter = 1;
		int n = sc1.nextInt();
		long [][]a  =  new long[n][3];
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < 3;j++) {	
			a[i][j] = sc1.nextLong();
		}
		}
		
		for(int i = 0;i < n;i++) {
			boolean boo = a[i][0] + a[i][1] > a[i][2];
			if(boo) {
				System.out.println("Case #"+counter+": "+boo);
				counter++;
			}else {
				boo = false;
				System.out.println("Case #"+counter+": "+boo);
				counter++;
			}
		}
}
}