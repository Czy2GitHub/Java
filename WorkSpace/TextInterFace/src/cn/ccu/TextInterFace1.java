package cn.ccu;
/**
 * 接口会使程序更加规范且安全，使用interface定义接口,使用implements来实现接口中的方法
 * 在接口中，所有方法为抽象方法，所有定义的量均为常量
 * @author dell
 *
 */
public class TextInterFace1 implements Text1 {			//定义一个类来实现接口
	public static void main(String[] args) {
		TextInterFace1 ti = new TextInterFace1();
		ti.run1();
		ti.run();
	}			
	@Override
	public void run() {						
		// TODO Auto-generated method stub
		System.out.println("11");
	}

	@Override
	public void run1() {
		// TODO Auto-generated method stub
		System.out.println("11");
	}

	@Override
	public void run2() {
		// TODO Auto-generated method stub
		System.out.println("11");
	}
				
}
