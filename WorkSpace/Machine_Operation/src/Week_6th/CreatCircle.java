package Week_6th;
import java.util.Scanner;
/**
 * 创建Circle类并添加静态属性r（成员变量）
 * ，并定义一个常量PI=3.142，
 * 在类Circle中添加两种方法，
 * 分别计算周长和面积；
 * 编写主类CreatCircle，
 * 利用类Circle输出r=2时圆的周长和面积。
 * @author dell
 *
 */
public class CreatCircle {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("请输入圆的半径:");
		int r = sc1.nextInt();
		Circle cir = new Circle(r);
		System.out.println("圆的周长是:"+cir.perimeter());
		System.out.println("圆的面积是:"+cir.Compare());
	}
}			
class Circle{
	static int r;
	final double PI = 3.142;
	public double perimeter() {			//计算周长
		double	per = 2*PI*r;
		return per;
	}
	public double Compare() {				//计算面积
		double com = PI*r*r;
		return com;
	}
	public Circle(int r) {
		this.r = r;
	}
}