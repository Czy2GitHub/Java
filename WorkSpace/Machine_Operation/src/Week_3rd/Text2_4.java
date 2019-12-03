/**
 * 编写程序实现：求前 20 个自然数中所有能被 3 整除的数的和，并打印输出结果。
 */
package Week_3rd;

public class Text2_4 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i<=20;i++ ) {
			if(i % 3 ==0) {
				System.out.println(i);
				sum = i + sum;
			}
		}
		System.out.println("前20个自然数中所有能被3整出的数的和是:"+sum);
	}
	
}
