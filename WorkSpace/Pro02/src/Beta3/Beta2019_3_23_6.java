package Beta3;
/**
 * 测试多态
 * 多态的三个条件：继承，重写，子类引用父类
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
		static void shout(Animals a) {		//多态的应用，输出汪汪汪和喵喵喵的时候就是多态的使用。
			a.shout();
		}
}
class Animals{
	public void shout() {
		System.out.println("叫了一声！");
	}
	
}
class Dog extends Animals{
	public void shout() {
		System.out.println("汪汪汪！");
	}
}
class Cat extends Animals{
	public void shout() {
		System.out.println("喵喵喵！");
	}
}