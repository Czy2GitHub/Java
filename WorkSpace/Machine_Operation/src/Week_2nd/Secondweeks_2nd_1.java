package Week_2nd;
/**
 * 从键盘输入两个整数，编程实现交换两个数，并输出结果。
 * @author dell
 *
 */
import java.util.*;
public class Secondweeks_2nd_1 {
	public static void main(String[] args) {
		Scanner n1 = new Scanner(System.in);
		System.out.println("请输入两个数:");
		int number1 = n1.nextInt();
		int number2 = n1.nextInt();
		System.out.println("交换前的两个数是："+"\n"+number1+"\t"+number2);
		int temp;
		temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("交换后的两数是"+"\n"+number1+"\t"+number2);
	}
}
