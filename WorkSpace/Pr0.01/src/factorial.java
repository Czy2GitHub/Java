/*
 * 递归；阶乘
 */
public class factorial {
	public static void main(String[] args) {
		long time1 =  System.currentTimeMillis();	//记录当前时间
		System.out.printf("%d的阶乘是%s%n",10,factorial(10));
		long time2 = System.currentTimeMillis();
		System.out.printf("所耗时间为%d", time2-time1);
	}
	//利用递归计算阶乘
	static  int factorial(int n) {
	int	sum = 0;
		if(n==1) {
			return 1; 
		}else {
		 sum = n * factorial(n-1);
		}
		return sum;
	}
	
}
