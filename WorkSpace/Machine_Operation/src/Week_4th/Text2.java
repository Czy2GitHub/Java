package Week_4th;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2.����һ�����֣�����洢��һλ�����У����������
 * @author dell
 *
 */
public class Text2 {
	public static void main(String[] args) {
		int [] a = new int[10];
		input(a);
		output(a);
	}
	public static void input(int [] arrays) {
		Scanner sc1 = new Scanner(System.in);
		for(int i = 0;i < arrays.length ; i++) {
			arrays[i] = sc1.nextInt();
		}
		System.out.println(Arrays.toString(arrays));
	}
	public static void output(int [] arrays) {
		System.out.println("��������������Ϊ:");
		for(int i = arrays.length-1; i >= 0;i--) {
			System.out.print(arrays[i]+" ");
		}
	}
}
