/**
 * ��д����ʵ�ּ��������ε�������ܳ���
 */
package Week_3rd;
import java.util.*;
public class Text2 {
	public static void main(String[] args) {
		Scanner square = new Scanner(System.in);
		System.out.println("�����������εı߳�:");
		double length = square.nextDouble();
	    double area = length*length;
	    double perimeter = length*4;
	    System.out.println("�����ε������:"+area);
	    System.out.println("�����ε��ܳ���:"+perimeter);
	}
}
