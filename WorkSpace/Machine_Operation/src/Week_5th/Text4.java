package Week_5th;
/**
 * .����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�
 * ����Լ������������ظ�Ԫ�ء�
 * @author dell
 *
 */
import java.util.*;
public class Text4 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int []a = new int[5];
		int score = 0 ;
		System.out.println("������һ������:");
		for(int i = 0 ;i < a.length - 1 ; i++) {
			a[i] = sc1.nextInt();		
}
		System.out.println("��������ҪѰ�ҵ�����:");
		int key = sc1.nextInt();
		for(int k = 0;k < a.length - 1;k++) {
			if(key != a[k]) {
				score++;
			}
		}
		if(score != 4) {
			System.out.println("��Ѱ�����ֵ�������:"+Arrays.binarySearch(a,key));
		}else if(score == 4) {
			a[4] = key;
			Arrays.sort(a);
			System.out.println(key);
		}
	}
}
