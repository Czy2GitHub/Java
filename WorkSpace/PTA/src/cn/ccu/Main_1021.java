package cn.ccu;


/**
 * 给定一个 k 位整数 N=dk−1 10k−1​​ +⋯+d​1​​ 10​1​​ +d​0(0≤di≤9, i=0,⋯,k−1, dk−1​​ >0)，
 * 请编写程序统计每种不同的个位数字出现的次数。例如：给定 N=100311，则有 2 个 0，3 个 1，和 1 个 3。
 * @author dell
 *
 */
import java.util.Scanner;
public class Main_1021 {
	public static void main(String[] args) {	
		Scanner sc1 = new Scanner(System.in);
		String s = sc1.nextLine();
		int []a = new int[10];
		for(int i = 0;i<a.length;i++) {
			a[i] = 0;
		}
		for(int i = 0 ;i <s.length();i++) {
			switch(s.charAt(i)) {
			case '0':{
				a[0]++;
				break;
			}
			case '1':{
				a[1]++;
				break;
			}
			case '2':{
				a[2]++;
				break;
			}
			case '3':{
				a[3]++;
				break;
			}
			case '4':{
				a[4]++;
				break;
			}
			case '5':{
				a[5]++;
				break;
			}
			case '6':{
				a[6]++;
				break;
			}
			case '7':{
				a[7]++;
				break;
			}
			case '8':{
				a[8]++;
				break;
			}
			case '9':{
				a[9]++;
				break;
			}
			}
		}
		for(int i = 0; i <a.length;i++) {
			if(a[i] != 0) {
				System.out.println(i+":"+a[i]);
			}
		}
	}
}
