package Week_5th;
import java.util.Scanner;
/**
 * 1.ʵ�� int sqrt(int x) ������
���㲢���� x ��ƽ���������� x �ǷǸ�������
���ڷ������������������ֻ���������Ĳ��֣�С�����ֽ�����ȥ��
 * @author dell
 *
 */
public class Text3 {
		public static void main(String[] args) {
				Scanner sc1 = new Scanner(System.in);
				int x = sc1.nextInt();
				System.out.println(mySqrt(x));
		}
		public static int mySqrt(int x) {
			   long r = x;
			while (r*r > x)
																			r = (r + x / r) / 2;
			return (int) r; 
			}
}
