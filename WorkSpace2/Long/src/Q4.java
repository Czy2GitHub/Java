import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("������m��ֵ��");
		int m;
		m = input.nextInt();
		int b[] = new int[10];
		//���ı�������˳���ȴ����b�����У�����ٸ���a����
		for (int i = 0; i < m; i++) {
			b[i] = a[10 - m + i];
		}
		
		for (int i = m; i < 10; i++) {
			b[i] = a[i - m];
		}
		
		for (int i = 0; i < 10; i++) {
			a[i] = b[i];
		}
		
		for (int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		input.close();
	}
}


