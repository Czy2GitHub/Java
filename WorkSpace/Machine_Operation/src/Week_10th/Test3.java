package Week_10th;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 给定一个仅包含0或1的字符串，现在可以对其进行一种操作：
当有两个相邻的字符其中有一个是0另外一个是1的时候，可以消除掉这两个字符。   
这样的操作可以一直进行下去直到找不到相邻的0和1为止。
问这个字符串经历了操作以后的最短长度。
输入格式
第一行包含一个整数 n，表示字符串的初始长度。
第二行为所给字符串。
输出格式
输出共一行，包含一个整数，表示问题的解。

 * @author dell           111010101011
 *
 */
public class Test3 {
		public static void main(String[] args) {
			Scanner sc1 = new Scanner(System.in);
			int n = sc1.nextInt();					
			String str = sc1.next();
			while(true) {
			str= str.replaceAll("01", "");			//去除01
			str =str.replaceAll("10", "");			//去除10
			if(str.indexOf("01")==-1&&str.indexOf("10")==-1) {		//基线条件
				break;
			}
			}
			char [] a = str.toCharArray();				//转字符型数组
			System.out.println(a.length);				//输出字符数组长度
		}
}			
			/*
			for(int i = 0 ; i <a.length-1;i++) {
				if(a[i] == '1'&&a[i+1] == '0') {
				a[i] = a[a.length-2];
				a[i+1] = a[a.length-1];
				i =0;
				a = Arrays.copyOf(a, a.length-2);
				}
				if(a[i] == '0'&&a[i+1] == '1') {
					a[i] = a[a.length-2];
					a[i+1] = a[a.length -1];
					i = 0;
					a = Arrays.copyOf(a, a.length-2);
				}
			if(a.length == 0) {
				break;
			}
			}
			System.out.println(a.length);
		}
}
*/