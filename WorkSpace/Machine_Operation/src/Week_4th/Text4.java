package Week_4th;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ��n��������ʹ��ǰ�����˳�������m��λ�ã�ʹ���m���������ǰ���m������
 * ��������ʾ��:move(int[] arr, int m)
 * @author dell
 *
 */
public class Text4 {
	public static void main(String[] args) {
		int [] a = new int[] {1,2,3,4,5,6,7,8,9,10};			//{9,10,1,2,3,4,5,6,7,8}
		Scanner sc1 = new Scanner(System.in);
		int m = sc1.nextInt();
		move(a,m);
	}
	public static void move(int [] arr,int m) {		//�ƶ�
		int j = 0;
		int i;
		int k = 0;
		int []b = new int[2];
		for( i= arr.length-1; i >= 0;i--) {											//���ƶ�����
			if(i <arr.length&&i>=arr.length-m) {
				b[j] = arr[i];
				j++;
			}
			if(i >= m) {
			arr[i] = arr[i-m];
		}
			if(i<m) {
					arr[i] = b[k];
					k++;
				
			}
		}
		System.out.println(Arrays.toString(arr));
}
}
