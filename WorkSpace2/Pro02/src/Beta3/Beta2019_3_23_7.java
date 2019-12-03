package Beta3;
/**
 * 测试向上自动转型，向下强制转型；
 * @author dell
 *
 */
public class Beta2019_3_23_7 {
	public static void main(String[] args) {
		Animals1 a = new Dog1();				//自动向上转型，在编译器中a的类型是Animals1;但实质上运行时认为a是以Dog1的类型
		shout(a);
		//a.seeDoor;		//在编译器时认为a变量是Animals,只会调用Animals类中的内容
		Dog1 d =(Dog1)a;	//向下强制转型,强制将a转换成Dog1型；
		d.seeDoor();
		
	}
  static	public void shout(Animals1 a) {
		a.shout();
	}
}
class Animals1{
	public void shout() {
		System.out.println("叫了一声!");
	}
}
class Dog1 extends Animals1{
	public void shout() {
		System.out.println("汪汪汪！");
	}
	public void seeDoor() {
		System.out.println("看门!!!");
	}
}
class Cat1 extends Animals1{
	public void shout() {
		System.out.println("喵喵喵!");
	}
}