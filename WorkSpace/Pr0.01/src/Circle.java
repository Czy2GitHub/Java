import java.lang.*;
public class Circle {
	public static void main(String[] args) {
		//随机生成(0,4]直接的数作为半径；
		double radius = 4*Math.random();
		//计算面积
		double area = Math.PI*Math.pow(radius,2);
		//计算周长
		double circle = 2*Math.PI*radius;
		System.out.println("圆的半径是："+radius);
		System.out.println("圆的面积是："+area);
		System.out.println("圆的周长是"+circle);
		//比较周长与面积
		if(area>=circle) {
			System.out.println("圆的面积大于周长");
		}else {
			System.out.println("圆的面积小于周长");
		}
	}

}
