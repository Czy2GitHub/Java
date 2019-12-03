package Week_5th;
import java.util.Scanner;
/**
 * 2. 自己建立一个3*3矩阵(二维数组)并赋值，求出3*3矩阵对角线元素之和
 * @author dell
 *
 */
public class Text2 {
		public static void main(String[] args) {
			int[][] a = new int[3][3];
			int sum = 0;
			Scanner sc1 = new Scanner(System.in);
			for(int i = 0;i < a.length ; i++) {
				for(int j = 0 ; j < a.length ;j++) {
					a[i][j] = sc1.nextInt();
					if(i == j) {
					sum = sum + a[i][j];
					}
				}
			}
			System.out.println(sum);
		}
}
