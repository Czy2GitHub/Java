/**
 *  ����һ��Բ�ࡪ��Circle��������ڲ��ṩһ�����ԣ��뾶(r)��
 * ͬʱ �ṩ ���� �� �� �� ���� ��� ( getArea() ) �� ���� �ܳ�(getPerimeter()) ��
 * ͨ��������������Բ���ܳ���������ҶԼ��������������
 * �����һ��������� Circle �����ʹ�á�
 */
package cn.ccu;
import static java.lang.Math.PI;
public class Pro4_2 {
	public static void main(String[] args) {
		Circle a = new Circle(2);
		a.getArea();
		a.getPerimeter();
	}
	
}

	class Circle{
		double r;
		public Circle(double r) {
			this.r = r; 
		}
		public void getArea() {				//���������
			double s = r*r*PI;
			System.out.println("��Բ������ǣ�"+s);
		}
		public void getPerimeter() {
			double c = 2*r*PI;
			System.out.println("��Բ���ܳ��ǣ�"+c);
		}
		
	}