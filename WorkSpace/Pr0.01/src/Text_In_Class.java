import java.util.*;
public class Text_In_Class {
	public static void main(String[] args) {
		System.out.println("请输入会员积分：");
		Scanner points = new Scanner(System.in);
		int x = points.nextInt();
		if(x<2000) {
			System.out.println("该会员享受的折扣是：9.0");
		}else if(x<4000) {
			System.out.println("该会员享受的折扣是：8.0");
		}else if(x<8000) {
			System.out.println("该会员享受的折扣是：7.0");
		}else {
			System.out.println("该会员享受的折扣是：6.0");
		}
	}
}
