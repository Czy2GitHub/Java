package cn.ccu;
/**
 * （1）编写西游记人物类（XiYouJiRenWu） 
其中属性有：身高（height），名字（name），武器（weapon） 方法有：显示名字（printName)，显示武器（printWeapon) 
（2）在主类的main方法中创建二个对象：zhuBaJie，sunWuKong。并分别为他 们的两个属性（name,weapon）赋值，最后分别调用printName, printWeapon方法 显示二个对象的属性值。
 * @author dell
 *
 */
public class Text2 {
	public static void main(String[] args) {
		XiYouJiRenWu zhuBaJie = new XiYouJiRenWu("猪八戒","九齿钉耙");
		XiYouJiRenWu sunWuKong = new XiYouJiRenWu("孙悟空","金箍棒");
		zhuBaJie.printName();
		zhuBaJie.printWeapon();
		sunWuKong.printName();
		sunWuKong.printWeapon();
	}
}
class XiYouJiRenWu{
	int heigth;
	String name;
	String weapon;
	public void printName() {
		System.out.println(name);
	}
	public void printWeapon() {
		System.out.println(weapon);
	}
	public XiYouJiRenWu(String name, String weapon) {
		super();
		this.name = name;
		this.weapon = weapon;
	}
	
}