/**
 * 测试对象和类；
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
	Computer camp;	//计算机；
	void study() {
		System.out.println("我正在学习有趣的Java呢，使用的电脑是："+camp.brand);
	}
	//构造方法，用于创建这个类的对象。无参的构造方法可以由系统自动创建
	Beta2019_3_14(){
		
	}
	public static void main(String[] args) {
		Beta2019_3_14 yd = new Beta2019_3_14();	
		yd.id = 7777777;
		yd.name = "宇哥";
		yd.age = 18;
		System.out.println(yd);
		Computer camp1 = new Computer();
		camp1.brand = "联想";
		yd.camp = camp1;
		yd.study();
		
	}
	
		
	}