package cn.ccu;
 class Person {
		String name;
	static int age = 20;
		public Person(String name,int age) {
			this.name = name ;
			this.age = age;
		}
		public Person(String name) {
			this(name,age);
		}
		public void work() {
			System.out.println("人类正在工作！");
		}
}
class Student extends Person{
	public Student(String name) {
		super(name);
	}
	public void work() {
		System.out.println("学生正在学习!");
	}
}
class Teacher extends Person{
	public Teacher(String name) {
		super(name);
	}
	public void work() {
		System.out.println("教师正在授课！");
	}
}
public class TextPerson{
	public static void main(String[] args) {
		Person per = new Person("人类");
		Student stu = new Student("学生");
		Teacher tea = new Teacher("教师");
		per.work();
		stu.work();
		tea.work();
	}
	
}