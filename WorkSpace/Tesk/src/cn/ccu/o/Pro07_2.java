package cn.ccu.o;

import java.util.Scanner;

/**
 * ��ȡ�������ֵ����Сֵ����������Java��Math���random()��������д�����õ�0��n֮����������n�ǲ�����
 * ���ҳ�����50������������������ġ���С��������ͳ������>=60���ж��ٸ���
 *	��ʾ��ʹ�� int num=(int)(n*Math.random());��ȡ�������
 * @author dell
 *
 */

public class Pro07_2 {
		public static void main(String[] args) {
			Scanner sc1 = new Scanner(System.in);
			int n = sc1.nextInt();
			create(n);
			max(create(n));
			min(create(n));
			score(create(n));		
		}
		public static int[] create( int n) {
			int []array = new int[50];
			for(int i = 0;i <array.length;i++) {
				array[i] = (int) (n*Math.random()+1);
			}
			return array;
		}
		public static void max(int []arrays) {
			int temp;
			for(int i = 0;i < arrays.length-1;i++) {
				for(int j = 0;j <arrays.length-1-i;i++) {
					if(arrays[j]<arrays[j+1]) {
						temp = arrays[j];
						arrays[j] = arrays[j+1];
						arrays[j+1] = temp;
					}
				}
				System.out.println("��ʮ��������������:"+arrays[arrays.length-1]);
			}
		}
		public static void min(int []arrays) {
			int temp;
			for(int i = 0;i < arrays.length-1;i++) {
				for(int j = 0;j <arrays.length-1-i;i++) {
					if(arrays[j]>arrays[j+1]) {
						temp = arrays[j];
						arrays[j] = arrays[j+1];
						arrays[j+1] = temp;
					}
				}
				System.out.println("��ʮ��������������:"+arrays[arrays.length-1]);
			}
		}
		public static void score(int []arrays) {
			int score = 0;
			for(int i = 0;i < arrays.length;i++) {
				if(arrays[i] >= 60) {
					score++;
				}
			}
			System.out.print("����ֵ������ʮ������:"+score);
		}
}
