import java.lang.*;
public class Circle {
	public static void main(String[] args) {
		//�������(0,4]ֱ�ӵ�����Ϊ�뾶��
		double radius = 4*Math.random();
		//�������
		double area = Math.PI*Math.pow(radius,2);
		//�����ܳ�
		double circle = 2*Math.PI*radius;
		System.out.println("Բ�İ뾶�ǣ�"+radius);
		System.out.println("Բ������ǣ�"+area);
		System.out.println("Բ���ܳ���"+circle);
		//�Ƚ��ܳ������
		if(area>=circle) {
			System.out.println("Բ����������ܳ�");
		}else {
			System.out.println("Բ�����С���ܳ�");
		}
	}

}
