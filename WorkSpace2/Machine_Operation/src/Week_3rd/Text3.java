/**
 * ��д���򣬴Ӽ�����������double���͵���x����y��
 * �ж�x�Ƿ����y����Ҫ������ܹ��ж������x��y�Ƿ����������Ƿ�Ϊ�ա�
 */
package Week_3rd;
import java.util.*;
public class Text3 {
		public static void main(String[] args) {
			System.out.println("��������������:");
			Scanner score = new Scanner(System.in);
			double x = score.nextDouble();
			double y = score.nextDouble();
			if(x == y) {
				System.out.println("�����������:"+x+"=="+y);
			}else if(x == Double.POSITIVE_INFINITY) {
				System.out.println("xΪ�����");
			}else if(y == Double.POSITIVE_INFINITY) {
				System.out.println("yΪ�����");
			}else if(x == Double.NaN){										//�ж��Ƿ�Ϊ��
				System.out.println("����xΪ�գ�");
			}else if(y == Double.NaN) {
				System.out.println("����yΪ�գ�");
			}
		}
}
