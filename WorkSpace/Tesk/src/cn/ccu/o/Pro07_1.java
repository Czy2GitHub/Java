package cn.ccu.o;

import java.util.Scanner;

/**
 * 数组查找操作：定义一个长度为10 的一维字符串数组，在每一个元素存放一个单词;
 * 然后运行时从命令行输入一个单词，
 * 程序判断数组是否包含有这个单词，
 * 包含这个单词就打印出“Yes”，
 * 不包含就打印出“No”。
 * @author dell
 *
 */
public class Pro07_1 {
	public static void main(String[] args) {
		Scanner flag = new Scanner(System.in);
		 String []a = new String[] {"Love","I","am","is","are","binarySearch","Nice","ClearLove","Missaya","MissBear"};
		 System.out.println("请输入一个单词，");
		 String keyWord  = flag.nextLine();
		search(a,keyWord);
	}
	public static void search(String[]arrays,String value) {
			int flag = 0;
	  for(int i = 0;i < arrays.length;i++) {
		  	if(value.equals(arrays[i])) {
		  		flag++;
		  	}
	  }
	  	if(flag == 0) {
	  		System.out.println("No");
	  }else {
		  System.out.println("Yes");
	  }
	  
	  
	 
	  
	}
}

