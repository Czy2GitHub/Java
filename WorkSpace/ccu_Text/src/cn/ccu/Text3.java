package cn.ccu;
/**
 * （1）建立一个名叫Cat的类：  属性：姓名、毛色、年龄  行为：显示姓名、喊叫 
（2）编写主类：  创建一个对象猫，姓名为“妮妮”，毛色为“灰色”，年龄为2岁，在屏幕上输 出该对象的毛色和年龄，让该对象调用显示姓名和喊叫两个方法。
 * @author dell
 *
 */
public class Text3 {
	public static void main(String[] args) {
		Cat cat = new Cat("妮妮","灰色",2);
		System.out.println(cat.maose +"\t"+cat.age);
		cat.printName();
		cat.shout();
	}
	
}
class Cat{
	String name;
	String maose;
	int age;
	public void printName() {
		System.out.println(name);
	}
	public void shout() {
		System.out.println("喵喵喵!");
	}
	public Cat(String name, String maose, int age) {
		super();
		this.name = name;
		this.maose = maose;
		this.age = age;
	}
	
}