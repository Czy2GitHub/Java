package Week_6th;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 创建MaxArray类，并利用该类的对象求一维数组中的最大值
 * @author dell
 *
 */
public class MaxArrays {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("请规定数组长度:");
		int n = sc1.nextInt();
		int []a = new int[n];		//规定数组长度
		MaxArrays ma = new MaxArrays();				//创建函数
		ma.input(a);
		ma.MaxA(a);						//调用函数
	}
	public void  MaxA(int []a) {
		Arrays.sort(a);		//使数组中元素升序排列
		System.out.println("该数组的最大值是:"+a[a.length-1]);	//输出数组的最后一位元素
	}
	public void input(int []a) {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("请输入数组元素:");
		for(int i = 0;i < a.length;i++ ) {
			a[i] = sc2.nextInt();
		}
	}
}
