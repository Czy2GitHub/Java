package Week_13th;
import java.util.Scanner;
/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。

 * @author dell
 *
 */
public class Test4 {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc1 =new Scanner(System.in);			//输入
		String s = sc1.nextLine();
		String str = sc1.nextLine();
		String str1 = sc1.nextLine();
		int i =Math.min((Math.min(str.length(),s.length())),str1.length());			//获得三个字符串中长度最短的长度值
		for (int j = 0 ; j < i; j++) {											//进行判断，公共前缀
			if(s.charAt(j) == str.charAt(j) &&s.charAt(j) == str1.charAt(j)) {
				count++;
				System.out.print(s.charAt(j));
			}
		}
		if(count == 0) {														//如果没有公共前缀，返回“”
			System.out.println("");
		}
	}
}
