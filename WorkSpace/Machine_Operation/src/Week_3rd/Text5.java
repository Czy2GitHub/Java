/**
 * 编程实现从键盘上输入三角形3个边长，判断其是否能构成三角形，若能构成三角形，则输出其周长和面积。

输入格式:
输入3个整数，作为3边长。
输出格式:
若这3个边不能构成三角形，则在一行中输出“Impossible”；若可以，则在一行中输出该三角形的周长和面积，格式为“L = 周长, A = 面积”，输出到小数点后2位。
输入样例1:
3 4 5
输出样例:
L = 12.00, A = 6.00

 */
package Week_3rd;
import java.util.*;
public class Text5 {
	void count(double x,double y,double z){
			if(x+y>z&&x+z>y&&z+y>x) {
				double c = x+y+z;
				double s = Math.sqrt((c/2)*(c/2-x)*(c/2-y)*(c/2-z));		
				System.out.printf("L = %.2f,A = %.2f",c,s);
			}else {
				System.out.println("Impossible");
			}
		}
	public static void main(String[] args) {
		Text5 i = new Text5();
		Scanner trilateral = new Scanner(System.in);
		System.out.println("请输入三个整数，作为三角形的三边长:");
		double long1 = trilateral.nextInt();
		double long2 = trilateral.nextInt();
		double long3 = trilateral.nextInt();
		i.count(long1,long2,long3);
	}
}

