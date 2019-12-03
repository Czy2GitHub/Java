/**
 * 编写 Java 程序用于显示人的姓名和年龄。
 * 定义一个人类Person。 该类中应该有两个私有属性： 姓名 (name) 和年龄 (age) 。
 * 定义构造方法用来初始化数据成员。再定义显示(display()) 方法将姓名和年龄打印出来。
 * 在 main 方法中创建人类的实例然后将信息显示。
 */
package cn.ccu;

public class Pro4_1 {
	String name ;
	int age;
	public Pro4_1(String name,int age) {		//构造器，
		this.name = name;
		this.age  = age;
}
	public void display() {
		System.out.println(name+"\t"+age);
	}
	public static void main(String[] args) {
		Pro4_1 Person = new Pro4_1("777",18);
		Person.display();
	}
}