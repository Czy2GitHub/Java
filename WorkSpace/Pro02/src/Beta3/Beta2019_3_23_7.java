package Beta3;
/**
 * ���������Զ�ת�ͣ�����ǿ��ת�ͣ�
 * @author dell
 *
 */
public class Beta2019_3_23_7 {
	public static void main(String[] args) {
		Animals1 a = new Dog1();				//�Զ�����ת�ͣ��ڱ�������a��������Animals1;��ʵ��������ʱ��Ϊa����Dog1������
		shout(a);
		//a.seeDoor;		//�ڱ�����ʱ��Ϊa������Animals,ֻ�����Animals���е�����
		Dog1 d =(Dog1)a;	//����ǿ��ת��,ǿ�ƽ�aת����Dog1�ͣ�
		d.seeDoor();
		
	}
  static	public void shout(Animals1 a) {
		a.shout();
	}
}
class Animals1{
	public void shout() {
		System.out.println("����һ��!");
	}
}
class Dog1 extends Animals1{
	public void shout() {
		System.out.println("��������");
	}
	public void seeDoor() {
		System.out.println("����!!!");
	}
}
class Cat1 extends Animals1{
	public void shout() {
		System.out.println("������!");
	}
}