/**
 * ���Զ�����ࣻ
 * @author dell
 *
 */
	class Computer {
	String brand;
}
public class Beta2019_3_14 {
	int id;
	String name;
	int age;
	Computer camp;	//�������
	void study() {
		System.out.println("������ѧϰ��Ȥ��Java�أ�ʹ�õĵ����ǣ�"+camp.brand);
	}
	//���췽�������ڴ��������Ķ����޲εĹ��췽��������ϵͳ�Զ�����
	Beta2019_3_14(){
		
	}
	public static void main(String[] args) {
		Beta2019_3_14 yd = new Beta2019_3_14();	
		yd.id = 7777777;
		yd.name = "���";
		yd.age = 18;
		System.out.println(yd);
		Computer camp1 = new Computer();
		camp1.brand = "����";
		yd.camp = camp1;
		yd.study();
		
	}
	
		
	}