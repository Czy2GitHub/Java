package cn.ccu.o;
/**
 * Textextends
 * @author dell
 *
 */
public class Pro5_1 {
		public static void main(String[] args) {
			Students stu1  =new Students("���",777,"���");
			stu1.rest();
			System.out.println(new Person() instanceof Students);
		}
}
class Person {
	String name;
	int height;
	void rest(){
		System.out.println("��Ϣһ�ᣡ");
	}
}
class Students extends Person{				//Person�����࣬�̳���Person��������
	String major;
	public Students(String name,int height,String major){
		this.name = name;
		this.height = height;
		this.major = major;
	}
}