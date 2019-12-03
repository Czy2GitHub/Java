package cn.ccu;
/**
 * 写一个彩票程序：
30选7  
随机(1~30中间)生成7个随机数，注意不能重复  
然后输入7个数，对比7个数是否与随机数有相同的，
如果有显示“中了几个号”  
如果中了7个号，显示一等奖  
如果中了6个号，显示二等奖  
如果中了5个号，显示三等奖

 * @author dell
 *
 */
import java.util.*;
public class Text {
	public static void main(String[] args) {
		//随机生成7个随机数
		int score = 0;
		int count = 0;
		boolean flag = true;
		int []a = new int[7];
		for(int i = 0 ;i < 7 ;i++) {
			a[i] = (int)(Math.random()*30+1);
		}
		//判断是否重复,并重新输入
		System.out.println("中奖号码为:");
		prove(a,count,flag); 
		for(int d=0;d<7;d++) {
			System.out.print(a[d]+" ");
		}
		System.out.println("input:");
		Scanner sc1 = new Scanner(System.in);
		int []b = new int[7];
		for(int k = 0;k <7;k++) {
			b[k] = sc1.nextInt();
		}
		for(int s = 0; s<7;s++) {
			for(int v = 0; v <7;v++) {
			if(a[s] == b [v]) {
				score++;
			}
			}	
		}
		print(score);
	}
		
	public static void prove(int []a,int count,boolean flag) {
		while(count < a.length) { 	
		for(int j = 0 ; j < 7;j++) {
			int rdm = (int)(Math.random()*30+1);	
			if(a[j] == rdm) {
					flag = false;
					break;
				}
				if(flag) {
					a[count] = rdm;
					count++;	
		}
			}
			
		}
	}
	public static void print(int score) {
		if(score <= 4) {
			System.out.println("没有中奖!");
		}
		if(score ==5) {
			System.out.println("三等奖!");
		}
		if(score == 6) {
			System.out.println("二等奖!");
		}
		if(score == 7) {
			System.out.println("一等奖!");
		}
	}
	
}
