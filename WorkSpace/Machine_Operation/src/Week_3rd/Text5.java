/**
 * ���ʵ�ִӼ���������������3���߳����ж����Ƿ��ܹ��������Σ����ܹ��������Σ���������ܳ��������

�����ʽ:
����3����������Ϊ3�߳���
�����ʽ:
����3���߲��ܹ��������Σ�����һ���������Impossible���������ԣ�����һ��������������ε��ܳ����������ʽΪ��L = �ܳ�, A = ������������С�����2λ��
��������1:
3 4 5
�������:
L = 12.00, A = 6.00

 */
package Week_3rd;
import java.util.*;
public class Text5 {
	void count(double x,double y,double z){
			if(x+y>z&&x+z>y&&z+y>x) {
				double c = x+y+z;
				double s = Math.sqrt((c/2)*(c/2-x)*(c/2-y)*(c/2-z));		
				System.out.printf("L = %.2f,A = %.2f",c,s);
			}else {
				System.out.println("Impossible");
			}
		}
	public static void main(String[] args) {
		Text5 i = new Text5();
		Scanner trilateral = new Scanner(System.in);
		System.out.println("������������������Ϊ�����ε����߳�:");
		double long1 = trilateral.nextInt();
		double long2 = trilateral.nextInt();
		double long3 = trilateral.nextInt();
		i.count(long1,long2,long3);
	}
}

