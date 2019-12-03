package 实验报告4;
/**
 * 3．	声明三个整数变量num1、num2、num3，首先利用random()方法产生随机的0-100以内的整数，实现对num1、num2、num3的赋值。
 * 然后利用Math类的max()、min()方法，求得最大数和最小数，并输出结果。
 * @author dell
 *
 */
public class Test2 {
	public static void main(String[] args) {
		int num1,num2,num3;								//定义三个数，利用random方法求随机数
		num1 = (int)(Math.random()*100+1);				//由于没有四舍五入的缘故，在随机数的后面加上1
		num2 = (int)(Math.random()*100+1);
		num3 = (int)(Math.random()*100+1);
		System.out.print("最大值:");							//输出最大值最小值
		System.out.println(Math.max(Math.max(num1, num2),num3));
		System.out.print("最小值:");
		System.out.println(Math.min(Math.min(num1, num2), num3));
	}
}
