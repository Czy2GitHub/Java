package Beta3;
/**
 * ���Զ�̬
 * ��̬�������������̳У���д���������ø���
 * @author dell
 *
 */
public class Beta2019_3_23_6 {
	public static void main(String[] args) {
		Animals a = new Animals();
		Cat c = new Cat();
		Dog d = new Dog();
		shout(a);
		shout(d);
		shout(c);
	}
		static void shout(Animals a) {		//��̬��Ӧ�ã��������������������ʱ����Ƕ�̬��ʹ�á�
			a.shout();
		}
}
class Animals{
	public void shout() {
		System.out.println("����һ����");
	}
	
}
class Dog extends Animals{
	public void shout() {
		System.out.println("��������");
	}
}
class Cat extends Animals{
	public void shout() {
		System.out.println("��������");
	}
}