/**
 * 编写程序实现计算正方形的面积和周长。
 */
package Week_3rd;
import java.util.*;
public class Text2 {
	public static void main(String[] args) {
		Scanner square = new Scanner(System.in);
		System.out.println("请输入正方形的边长:");
		double length = square.nextDouble();
	    double area = length*length;
	    double perimeter = length*4;
	    System.out.println("正方形的面积是:"+area);
	    System.out.println("正方形的周长是:"+perimeter);
	}
}
