/**
 * �̳����˳齱�������ơ�
�齱����
      �˿͵���λ��Ա���ŵĸ�λ����֮�ʹ���20����Ϊ���˹˿͡�
���н������ͼ��ʾ��

 */
package Week_3rd;
import java.util.*;

public class Text8 {
		public static void main(String[] args) {
				System.out.println("��������Ļ�Ա����:");
				Scanner flag = new Scanner(System.in);
				int card  = flag.nextInt();
				int sum = (card/1000)%10+(card/100)%10+(card/10)%10+card%10;
				System.out.println("��Ա����"+card+"��λ֮��:"+sum);
				boolean i = true;
				System.out.print("�������û���?");
				if(sum > 20) {
					System.out.print(i);
				}else {
					i = false;
					System.out.print(i);
				}
		}
}
