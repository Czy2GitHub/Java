import java.util.*;
public class Q3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数，判断是否为回文数：");
		int a = input.nextInt();
		int[] b = new int[10];
		int n = 0;
		while (a != 0) { // 将一串数字分解后逐个放进数组中
			b[n++] = a % 10;
			a = a / 10;
		}
		int flag = 1; // 方便下面对回文数进行判断
		for (int i = 0; i <   n / 2; i++) {
			if (b[i] != b[n - 1 - i]) {
				flag = 0;
				break;
			}
		}
		if(flag == 0){
			System.out.println("输入的数字不是回文数！");
		}
		if(flag == 1) {
			System.out.println("输入的数字是回文数！");
		}
		input.close();
	}
}

	


