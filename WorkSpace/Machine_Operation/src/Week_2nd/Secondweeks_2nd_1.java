package Week_2nd;
/**
 * �Ӽ��������������������ʵ�ֽ���������������������
 * @author dell
 *
 */
import java.util.*;
public class Secondweeks_2nd_1 {
	public static void main(String[] args) {
		Scanner n1 = new Scanner(System.in);
		System.out.println("������������:");
		int number1 = n1.nextInt();
		int number2 = n1.nextInt();
		System.out.println("����ǰ���������ǣ�"+"\n"+number1+"\t"+number2);
		int temp;
		temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("�������������"+"\n"+number1+"\t"+number2);
	}
}
