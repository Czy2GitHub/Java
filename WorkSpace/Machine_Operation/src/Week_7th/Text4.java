package Week_7th;
import java.util.Scanner;
/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * @author dell
 *
 */
public class Text4 {
		public static void main(String[] args) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("请输入楼梯的阶数:");
			int n = sc1.nextInt();
		System.out.println("共有"+climbStairs(n)+"种方法");
		
			}
		public static int climbStairs(int n) {					//递归
				int re = 0;
					if(n == 0 ||n == 1 ) {						//基线条件
						return 1;
					}else {									//递归条件
					re = climbStairs(n-1) + climbStairs(n-2);
				}
				return re;
		}
}
