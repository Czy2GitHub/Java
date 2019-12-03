package cn.ccu;


/**
 * 让我们用字母 B 来表示“百”、字母 S 表示“十”，用 12...n 来表示不为零的个位数字 n（<10），换个格式来输出任一个不超过 3 位的正整数。
 * 例如 234 应该被输出为 BBSSS1234，因为它有 2 个“百”、3 个“十”、以及个位的 4。
 * @author dell
 *
 */
import java.util.Scanner;
public class Main_1006_1 {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Scanner sc1 = new Scanner(System.in);
		String score = sc1.nextLine();
		char[]	cha =  score.toCharArray();		//把String转化为char型数组
		int []arr = new int[cha.length];
		for(int  i = 0 ; i <cha.length;i++ ) {		//把输入的数转化为int型数组
		arr[i]  = Integer.parseInt(String.valueOf(cha[i]));
		}
		for(int i = 0 ; i < arr[0];i++) {
			System.out.print("B");
		}
		for(int i = 0; i< arr[1];i++) {
			System.out.print("S");
		}
		for(int i = 1; i <= arr[2];i++) {
			System.out.print(i);
		}
	}
}
