package Week_10th;
/**
 * 设计一个类层次，定义一个抽象类--形状，其中包括有求形状的面积的抽象方法。
 * 继承该抽象类定义三个类：三角型、矩形、圆。
 *  再定义一个测试类，分别创建一个三角形、矩形、圆存入一个数组中，将数组中各类图形的面积输出。
注：三角形面积s=sqrt(p*(p-a)*(p-b)*(p-c)) 其中，a,b,c为三条边，p=(a+b+c)/2
 * @author dell
 *
 */
public class Test1 {					//测试类
		public static void main(String[] args) {
			int []a = new int[3];					//创建数组
			a[0]=new Triangle(6,6,6).area();					//将元素存进数组
			a[1] = new Rectangle(3,5).area();
			a[2]= new Circular(7).area();
			for(int i = 0; i < a.length ; i++) {
			System.out.println(a[i]);	//输出数组元素
			}
		}
}
abstract class shape{
	abstract int area();			//抽象类面积
}
class Triangle extends shape{				//三角形类
	int a;						//成员变量
	int b;
	int c;
	public Triangle(int a, int b, int c) {			//构造方法
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	int area() {						//实现抽象类
		int p = (a+b+c)/2;
		int s = (int)Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return s;
	}
	
}
class Rectangle extends shape{
	int a ;			//矩形长
	int b;			//矩形宽
	public Rectangle(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	int area() {
	int	s = a * b;
		return s;
	}
	
}
class Circular extends shape{				//圆形类
		int r;
	public Circular(int r) {
			super();
			this.r = r;
		}
	int area() {
		int s = (int)Math.PI*r*r;
		return s;
	}
	
}