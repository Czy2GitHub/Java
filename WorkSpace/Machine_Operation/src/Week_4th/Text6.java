package Week_4th;
/**
 * ��ֵԪ����ָ��ֵ������������ֵ��Ԫ�ء�
����һ���������� nums������ nums[i] �� nums[i+1]���ҵ���ֵԪ�ز�������������
������ܰ��������ֵ������������£������κ�һ����ֵ����λ�ü��ɡ�
����Լ��� nums[-1] = nums[n] = -�ޡ�

 * @author dell
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Text6 {
		public static void main(String[] args) {
			Scanner sc2 = new Scanner(System.in);
			System.out.println("������һ������:"+"\t"+"nums = ");
			int []nums = new int[5];
			input(nums);			//����
			chooseOne(nums);		//�ж�
			search(nums);			//����
		}
		public static void search(int []a) {
	
			 for(int i = 1;i < a.length;i++) {
				 if(a[i] > a[i-1]&&a[i] > a[i+1]) {
					 System.out.println("�������һ����ֵΪ"+a[i]+"\t"+"�÷�ֵ������Ϊ"+i);
				 }
			 }
		}
		public static void input(int a[]) {
			Scanner sc1 = new Scanner(System.in);
			for(int i = 0;i < a.length;i++) {
				 a[i] = sc1.nextInt();
			}
		}
		public static void chooseOne(int []a) {
			int temp = 0;
			for(int i = 0;i < a.length-1;i++) {
				if(a[i] == a[i+1]) {
					temp++;
				}
			}
			if(temp >0) {
				System.out.println("���������ʽ����!");
			}
				
		}
}
