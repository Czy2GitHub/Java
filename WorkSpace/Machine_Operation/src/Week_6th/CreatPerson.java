package Week_6th;
/**
 * 1������MyProject3��Ŀ������Person�࣬
 * ������name��sex��age��Ա��
 * ���ô��ι��췽�����޲ι��췽����
 * ����output�������ƿ��Զ��壩���������3����Ա����ʾ�����
 * ��������CreatPerson��ͨ��Person�ഴ��������ʾ����ö���ĸ������ԡ�
 * @author dell
 *
 */
public class CreatPerson {
			public static void main(String[] args) {
				Person per = new Person("������","Ů",25);
				per.output();
			}
}
	class Person{
		String name;
		String sex;
		int age;
		public Person(){
			
		}
		public Person(String name,String sex,int age) {
			this.name = name;
			this.sex = sex;
			this.age = age;
		}
		public void output() {
			System.out.println(name+"\t"+sex+"\t"+age);
		}
	}