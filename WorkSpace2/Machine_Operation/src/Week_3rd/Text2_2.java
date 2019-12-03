/**
 * 编写程序实现：计算 1～10 之间除了 5 以外的各个自然数的和。
 */
package Week_3rd;

public class Text2_2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0;i <= 10;i++) {
		if(i ==5 ) {
			continue;	
		}else {
			sum = i + sum;	
		}
		}
		System.out.println("一到十之间除了五以外的各个自然数的和是:"+sum);
	}
}
