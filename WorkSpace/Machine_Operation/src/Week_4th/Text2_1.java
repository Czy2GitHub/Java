package Week_4th;
/**
 * ʹ�ö�ά�����ӡ����������Σ�Ҫ���ӡ��6������ͼ��
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1

 * @author dell
 *
 */
import java.util.*;
public class Text2_1 {
public static void main(String[] args) {
		
		int [] []a = new int[6][6];
		type(a);
		}
	public static  void type(int [][]a) {
		
		for(int i = 0;i < a.length;i++) {		//��"�������"��������
			for(int k = 0;k <a.length-i;k++) {
				System.out.print(" ");
			}
		for(int j = 0;j <= i;j++) {
				if((j == 0)||(i == j)) {
					a[i][j] = 1;
				}else {
				a[i][j] = a[i-1][j] + a[i-1][j-1];
				
			}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
