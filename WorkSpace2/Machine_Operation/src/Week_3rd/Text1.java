/**
 * ��д�����¶ȳ���ʵ�ִӼ������뻪�϶ȣ�������϶ȡ�
 */
package Week_3rd;
import java.util.*;
public class Text1 {
	public static void main(String[] args) {
	System.out.println("�����뻪���¶�:");
	Scanner temperature = new Scanner(System.in);
	double degree_Fahrenheit = temperature.nextDouble();
	double centigrade_Degree= (degree_Fahrenheit-32)*5/9;
	System.out.println("�û����¶ȶ�Ӧ�������¶��ǣ�"+centigrade_Degree);
	}
}
