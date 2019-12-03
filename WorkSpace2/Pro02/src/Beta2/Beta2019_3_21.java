package Beta2;

import java.security.Permission;

/**
 * 测试方法的重写(override)/覆盖
 * @author dell
 *
 */
public class Beta2019_3_21 {
		public static void main(String[] args) {
			Horse h1 = new Horse();
			h1.run();
		}
}
class Vehicle{
	public void run() {
		System.out.println("跑！");
	}
	public void stop() {
		System.out.println("停止！");
	}
	public Point whoIsPsg() {			//调用包中的其他类
		return new Point();
	}
}
class Horse extends Vehicle{
	public void run() {
		System.out.println("继续跑！");
	}
	public Point whoIsPsg() {				//重写函数
		return  new Point();
	}
}