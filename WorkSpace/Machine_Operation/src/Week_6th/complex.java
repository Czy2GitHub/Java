package Week_6th;
import java.util.Scanner;
/**
 * 定义一个复数类，在主函数中实现复数的相加运算
 * @author dell
 *
 */
public class complex {
		public static void main(String[] args) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("请输入复数的实部");
			int shibu1 = sc1.nextInt();
			System.out.println("请输入复数的虚部");
			int xubu1 = sc1.nextInt();
			System.out.println("请输入复数的实部");
			int shibu2 = sc1.nextInt();
			System.out.println("请输入复数的虚部");
			int xubu2 = sc1.nextInt();
			int sumshibu = shibu1 + shibu2;
			int sumxubu = xubu1 + xubu2;
			System.out.println("这两个复数的和为:"+sumshibu+"+"+sumxubu+"i");
		}
	
}
