package Week_4th;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ����һ�����֣��ж���������ǲ��ǻ�����
 * @author dell
 *
 */
public class Text3 {
	public static void main(String[] args) {
		System.out.println("������һ����Ҫ�жϵ���:");
		Scanner sc1 = new Scanner(System.in);
		int number = sc1.nextInt();
		change(number,decide(number));
		
	}
	public static void change(int a,int n) {		//�����������ÿλ������������,�������ж�
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
			System.out.println(reserve+"��һ����������");
		}else {
			System.out.println("�������Ǹ���������");
		}
	}
	public static int decide(double a) {		//�ж��������ֵ�λ��
		int  n = 0;
		while(a/10 >0.1) {
			a = a/10;
			n++;
		}
		return n;
	}
	}


