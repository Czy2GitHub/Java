package Beta2;

import java.security.Permission;

/**
 * ���Է�������д(override)/����
 * @author dell
 *
 */
public class Beta2019_3_21 {
		public static void main(String[] args) {
			Horse h1 = new Horse();
			h1.run();
		}
}
class Vehicle{
	public void run() {
		System.out.println("�ܣ�");
	}
	public void stop() {
		System.out.println("ֹͣ��");
	}
	public Point whoIsPsg() {			//���ð��е�������
		return new Point();
	}
}
class Horse extends Vehicle{
	public void run() {
		System.out.println("�����ܣ�");
	}
	public Point whoIsPsg() {				//��д����
		return  new Point();
	}
}