package Week_2nd;
/**
 *  ʵ��һ�����ּ������ĳ�����ƣ����ܹ����ǣ�
 *���ܽ�� = ������ * 10 + 5��/ 2 + 3.14159
 *Ҫ����ܽ����Ϊһ������
 *��ʾ���ӿ���̨��������������Ӧ�ü��ܹ��������м��ܣ�������ܽ����
 * @author dell
 *
 */
import java.util.*;
public class Secondweeks_2nd_3 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("��������Ҫ���ܵ����֣�"); 
		if(obj.hasNextInt()) {
			int	number1 = obj.nextInt();
			number1 = (int)((number1*10+5)/2+3.14159);
			System.out.println("���ܺ�Ľ��Ϊ��"+number1);
		}else {
			System.out.println("�������");
		}
	}
}
