package cn.ccu.o;

import java.util.Scanner;

/**
 * ������Ҳ���������һ������Ϊ10 ��һά�ַ������飬��ÿһ��Ԫ�ش��һ������;
 * Ȼ������ʱ������������һ�����ʣ�
 * �����ж������Ƿ������������ʣ�
 * ����������ʾʹ�ӡ����Yes����
 * �������ʹ�ӡ����No����
 * @author dell
 *
 */
public class Pro07_1 {
	public static void main(String[] args) {
		Scanner flag = new Scanner(System.in);
		 String []a = new String[] {"Love","I","am","is","are","binarySearch","Nice","ClearLove","Missaya","MissBear"};
		 System.out.println("������һ�����ʣ�");
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

