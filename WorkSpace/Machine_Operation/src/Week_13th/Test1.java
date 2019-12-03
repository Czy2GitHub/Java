package Week_13th;
import java.util.Scanner;
/**
 * 给定一个字符串,判断该字符串中是否包含某个子串.如果包含,求出子串的所有出现位置.
    如:"abcbcbabcb34bcbd"中,"bcb"子串的出现位置为: 1,7,12.字符串和子串均由用户输入
 * @author dell
 *
 */
public class Test1 {
	public static void main(String[] args) {
		int i = 0;
		Scanner sc1 = new Scanner(System.in);
		String str = sc1.nextLine();
		String str1 = sc1.nextLine();
		while(i < str.length()) {			
		int j = str.indexOf(str1, str.indexOf(str1)+i);
		if(j > -1) {
			System.out.print(j+" ");
		}
		i+=4;
		}
	}
}
