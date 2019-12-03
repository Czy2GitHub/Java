package 实验报告2;
/**
 * 在实验二基础上，完成以下实验内容。
（1）设置抽象顾客类。其中普通顾客类和VIP顾客类是抽象顾客类的子类。顾客类包括两个抽象方法，分别是购买和退货。
（2）设置顾客类的子类，普通顾客类和VIP顾客类。子类均要实现父类的抽象方法。VIP顾客类包括顾客编号、姓名、性别、年龄、联系电话、打折级别，累计购买金额。
（3）顾客退货根据图书编号完成，需要修改库存量。
（4）设置菜单类，用于操作人员进行菜单项目选择：①输出图书信息②购买图书③退货④退出系统。
（5）图书类信息可以采用对象数组完成信息初始化。
（6）可根据以上要求进行适当功能扩展，并在主要程序段及总结中说明增加功能。

 * @author dell
 *
 */
public class Counter {
	public void caidan() {
		System.out.println("###########################################################");
		System.out.println("                         菜单列表                                                ");
		System.out.println("1.图书信息");
		System.out.println("2.购买图书");
		System.out.println("3.退货");
		System.out.println("4.退出系统");
		System.out.println("###########################################################");
	}
}
abstract class OrderNew{
	public abstract void Buy();
	public abstract void exit();
}
class NormalOrder extends OrderNew {
	public void Buy() {
		
	}
	public void exit() {

	}
	
}
class VipOrder extends OrderNew{
	private int OrderId;
	private String name;
	private int age;
	private int phoneNumber;
	private int cut;
	private int cash;
	@Override
	public void Buy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		
	}
	
}