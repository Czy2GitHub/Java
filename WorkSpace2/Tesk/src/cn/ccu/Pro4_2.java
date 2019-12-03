/**
 *  定义一个圆类——Circle，在类的内部提供一个属性：半径(r)，
 * 同时 提供 两个 方 法 ： 计算 面积 ( getArea() ) 和 计算 周长(getPerimeter()) 。
 * 通过两个方法计算圆的周长和面积并且对计算结果进行输出。
 * 最后定义一个测试类对 Circle 类进行使用。
 */
package cn.ccu;
import static java.lang.Math.PI;
public class Pro4_2 {
	public static void main(String[] args) {
		Circle a = new Circle(2);
		a.getArea();
		a.getPerimeter();
	}
	
}

	class Circle{
		double r;
		public Circle(double r) {
			this.r = r; 
		}
		public void getArea() {				//计算面积；
			double s = r*r*PI;
			System.out.println("该圆的面积是："+s);
		}
		public void getPerimeter() {
			double c = 2*r*PI;
			System.out.println("该圆的周长是："+c);
		}
		
	}