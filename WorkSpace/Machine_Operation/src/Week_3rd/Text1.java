/**
 * 编写计算温度程序，实现从键盘输入华氏度，输出摄氏度。
 */
package Week_3rd;
import java.util.*;
public class Text1 {
	public static void main(String[] args) {
	System.out.println("请输入华氏温度:");
	Scanner temperature = new Scanner(System.in);
	double degree_Fahrenheit = temperature.nextDouble();
	double centigrade_Degree= (degree_Fahrenheit-32)*5/9;
	System.out.println("该华氏温度对应的摄氏温度是："+centigrade_Degree);
	}
}
