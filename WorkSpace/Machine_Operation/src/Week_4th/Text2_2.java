package Week_4th;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 1.�������������������� nums1 �� nums2���� nums2 �ϲ��� nums1 �У�ʹ�� num1 ��Ϊһ���������顣
 * @author dell
 *
 */
public class Text2_2 {
	public static void main(String[] args) {
		Scanner  sc1 = new Scanner(System.in);
		System.out.println("����nums1�����鳤��:");
		int m = sc1.nextInt();
		System.out.println("����nums2�����鳤��:");
		int n = sc1.nextInt();
		int []nums1 = new int[m];
		int []nums2 = new int[n];
		int k = 0;			//������
		if(m <= n){
			System.out.println("�����������������!");
		}
		System.out.println("��ʼ������nums2!");
		for(int j = 0 ;j < n;j++) {					//2���鸳ֵ
			nums2[j] = sc1.nextInt();
		}
		System.out.println("��ʼ������nums1!");
		for(int i = 0 ;i < m;i++ ) {			//1���鸳ֵ
			if(i < (m-n)) {
			nums1[i] =sc1.nextInt();
			}
			if(i >= (m-n)) {
			nums1[i] = nums2[k];
			k++;
			}
		}
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));	
	}
}
