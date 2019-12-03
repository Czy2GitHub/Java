package Week_7th;
import java.util.Scanner;
/**
 * 编写重载方法分别计算一个整数，一个浮点数的各位数字之和。
 * @author dell
 *
 */
public class Text3 {
		public static void jisuan(int a) {
			int n = 0;			//计算输入的数的位数
			int q = a;
			while(a >0.1) {
				a = a /10;
				n++;
			}
			a = q;
			int []arr = new int[n];
			for(int j = 0 ;j < arr.length;j++) {
				arr[j] = a % 10;			//各位i
				a = a/10;
				System.out.println(arr[j]);
			}
			int chengji = 1;
			for(int i = 0;i <arr.length;i++) {
					chengji = chengji+arr[i];
			}
			System.out.println("整数各位的和为:"+chengji);
		}
		public static void main(String[] args) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("请输入一个数:");
			double count = sc1.nextDouble();
			if(count == (int)count) {
			jisuan((int)count);
			}else {
				jisuan(count);
			}
		}
		public static void jisuan(double a) {
			int s = 0;
			int n = 0;
			int o = 0;
			double q = a;
			while(a >1) {
				a = a /10;
				o++;
			}
			a = q;
			while(a >0.01) {
				a = a /10;
				n++;
			}
			a = q;
			double []arr = new double[n];
			for(int j = 0 ;j < arr.length;j++) {
				if(a > 1 ) {
				arr[j] = (int)(a % 10);			//各位i
				a = a/10;
				}else if(a > 0.01) {
					arr[j] = (int)(a*10*(Math.pow(10, o))%10);
					o++;
				}
				System.out.println(arr[j]);
			}
			double chengji = 1;
			for(int i = 0;i <arr.length;i++) {
					chengji = chengji+arr[i];
			}
			System.out.println("浮点数各位的和为:"+chengji);
		}
}
