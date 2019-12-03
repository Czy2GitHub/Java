package Week_14th;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 对于字符串 S 和 T，只有在 S = T + ... + T（T 与自身连接 1 次或多次）时，我们才认定 “T 能除尽 S”。
返回字符串 X，要求满足 X 能除尽 str1 且 X 能除尽 str2。
 * @author dell
 *
 */
public class Test2 {
	String str1;			//字符串A
	String str2;			//字符串B
	int n = 0;				//字符串索引值
	int count = 0;			//计数器
	HashSet <Character> hs;
	char [] ch ;
	char [] ch1;
	public static void main(String[] args) {		//主函数
			Test2 te = new Test2();					
			te.input();								
			te.choose();
		}
	public void input() {					//输入函数
		Scanner sc1 = new Scanner(System.in);
		str1 = sc1.nextLine();
		str2 = sc1.nextLine();
		ch = str1.toCharArray();
		ch1 = str2.toCharArray();
		
	}
	public void choose() {				//进行判断，利用HashSet的不可重复性，输出最长子字符串
		hs = new HashSet<Character>();
		for(int i = 0 ; i < ch1.length;i++) {
			if(ch[i] == ch1[i]) {
				hs.add(ch[i]);
			}
		}
		for(Character i : hs) {
			System.out.print(i);
		}
	}
		
	}

