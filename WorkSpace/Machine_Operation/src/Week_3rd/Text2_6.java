/**
 * ���������ǰN���
Ҫ���д���򣬼������� 2/1+3/2+5/3+8/5+... ��ǰN��֮�͡�ע������дӵ�2����ÿһ��ķ�����ǰһ��������ĸ�ĺͣ���ĸ��ǰһ��ķ��ӡ�
�����ʽ:
������һ���и���һ��������N��
�����ʽ:
��һ����������ֺ͵�ֵ����ȷ��С�������λ����Ŀ��֤������������˫���ȷ�Χ��
��������:
20
�������:
32.66

 */
package Week_3rd;
import java.util.*;
public class Text2_6 {
	public static void main(String[] args) {
		double s = 2;
		Scanner flag = new Scanner(System.in);
		double t = 0;
		double i;
		int N = flag.nextInt();
		for( i = 1;i<N&&s>0.01;i+=2) {
				s = s + (i+1)/i+(2*i+1)/(i+1);
			}
		System.out.printf("ǰ%d��ĺ���%.2f",N,s);
		}
	}
