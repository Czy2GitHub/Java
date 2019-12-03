package Beta3;
/**
 * ²âÊÔ³éÏóÀà
 * @author dell
 *
 */
public class Beta2019_3_24_2 {
	public static void main(String[] args) {
		Dog7 d1 = new Dog7();
		d1.shout();
		Cat7 c1 = new Cat7();
		c1.shout();
	}
}
abstract class Animal{
   abstract	void shout();
}
class Dog7 extends Animal{
	 void shout() {
		System.out.println("ÍôÍôÍô£¡");
	}
}
class Cat7 extends Animal{
	void shout() {
		System.out.println("ß÷ß÷ß÷£¿");
	}
}