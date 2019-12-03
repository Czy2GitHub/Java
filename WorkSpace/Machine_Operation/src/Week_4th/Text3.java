package Week_4th;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入一个数字，判断这个数字是不是回文数
 * @author dell
 *
 */
public class Text3 {
	public static void main(String[] args) {
		System.out.println("请输入一个需要判断的数:");
		Scanner sc1 = new Scanner(System.in);
		int number = sc1.nextInt();
		change(number,decide(number));
		
	}
	public static void change(int a,int n) {		//将输入的数字每位储存在数组里,并进行判断
		int temp;
		int reserve = a;
		
		int [] ar = new int[n];
		for(int i = 0;i < ar.length ;i++) {
		    temp = a%10;
		    ar[i] = temp;
		    a = a/10;
		}
		int [] arr = new int[n];
		for(int i = ar.length-1,j = 0;i >= 0&&j < arr.length;i--,j++) {
			arr[i] = ar[j];
		}
		if(	Arrays.equals(arr,ar) == true) {
			System.out.println(reserve+"是一个回文数！");
		}else {
			System.out.println("该数不是个回文数！");
		}
	}
	public static int decide(double a) {		//判断输入数字的位数
		int  n = 0;
		while(a/10 >0.1) {
			a = a/10;
			n++;
		}
		return n;
	}
	}


