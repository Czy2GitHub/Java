package cn.ccu;
/**
 * 一个合法的身份证号码由17位地区、日期编号和顺序编号加1位校验码组成。校验码的计算规则如下：

首先对前17位数字加权求和，权重分配为：{7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2}；然后将计算的和对11取模得到值Z；最后按照以下关系对应Z值与校验码M的值：
 Z：0 1 2 3 4 5 6 7 8 9 10
M：1 0 X 9 8 7 6 5 4 3 2
现在给定一些身份证号码，请你验证校验码的有效性，并输出有问题的号码。
 */
import java.util.Scanner;

public class Main_first {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc1 = new Scanner(System.in);
			int n = sc1.nextInt();			//输入处理证件数量
			for(int  i = 0 ; i < n ; i++) {
				String s = sc1.next();
			count = count + jisuan(s,n);
			}
			if(count == n) {
				System.out.println("All passed");
			}
	}
	
	
	
	
	
	
	
	
	public static int jisuan(String s,int n) {
		int count =0;
		int []ar = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};		//权重
		char[]a = s.toCharArray();
		int []b = new int[a.length - 1];
		int sum = 0;
		for(int i = 0 ; i < a.length-2;i++) {				//将字符串转化成数组
		b[i] = Integer.parseInt(String.valueOf(a[i]));		
		}
		for(int i = 0; i < s.length();i++) {				//加权求和
				if(i == s.length() - 1) {
					break;
				}else {
				sum = b[i] * ar[i] + sum;
				}
				}
		int w = sum % 11;
		char h = ' ' ;
		switch(w) {
		case 0:
			h = 1 ;break;
		case 1:
			h = 0; break;
		case 2:
			h = 'X'; break;
		case 3:
			h = 9; break;
		case 4:
			h = 8; break;
		case 5:
			h = 7; break;
		case 6:
			h = 6; break;
		case 7:
			h = 5; break;
		case 8:
			h = 4; break;
		case 9:
			h = 3; break;
		case 10:
			h = 2; break;
		}
		if(s.charAt(s.length()-1) == h ) {				//比较
			return 1;
		}
		if(h == ' ') {
			System.out.println(s);
		}
		return 0;
	}
}