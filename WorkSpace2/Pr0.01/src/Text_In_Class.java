import java.util.*;
public class Text_In_Class {
	public static void main(String[] args) {
		System.out.println("�������Ա���֣�");
		Scanner points = new Scanner(System.in);
		int x = points.nextInt();
		if(x<2000) {
			System.out.println("�û�Ա���ܵ��ۿ��ǣ�9.0");
		}else if(x<4000) {
			System.out.println("�û�Ա���ܵ��ۿ��ǣ�8.0");
		}else if(x<8000) {
			System.out.println("�û�Ա���ܵ��ۿ��ǣ�7.0");
		}else {
			System.out.println("�û�Ա���ܵ��ۿ��ǣ�6.0");
		}
	}
}
