/**
 * ���ʵ���ж�ѧ���ɼ��Ƿ�ͨ�����ԣ��ɼ�>=60��������ӡ����жϽ����
 */
package Week_3rd;
import java.util.*;
public class Text6 {
		public static void main(String[] args) {
			Scanner flag = new Scanner(System.in);
			System.out.println("��������Ҫ�ж��Ƿ񼰸��ѧ���ĳɼ���");
			int chengji = flag.nextInt();
			if(chengji >= 60) {
				System.out.println("��ͬѧ�ɹ�ͨ�����ԣ�");
			}else if(chengji <60) {
				System.out.println("��ͬѧ�ҿ��ˣ�");
			}
		}
}
