package cn.ccu;
/**
 * 设计图形类及圆、矩形子类,要具有求面积方法。主要采用多态完成。其他属性和方法自定。
 * @author dell
 *
 */
 abstract class Shape{					//图形抽象类
		public abstract double area();	
}
class Circular extends Shape{				//圆类
	double r ;
	public double area() {
	double s = r * r * Math.PI;
		return s;
		}
	public Circular(double r) {
		this.r = r;
	}
}
class Rectangle extends Shape{				//矩形类
	double l;
	double w;
	public double area() {
		double s = l * w;
		return s;
	}
	public Rectangle(double l, double w) {
		this.l = l;
		this.w = w;
	}
}
public class TextShape{							//测试图形类
	public static void main(String[] args) {
		Circular cir = new Circular(3);
		Rectangle rec = new Rectangle(4,5);
		System.out.println(cir.area());
		System.out.println(rec.area());
	}
}