package Week_13th;

import java.util.Scanner;

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
如果不存在最后一个单词，请返回 0 。
 * @author dell
 *
 */
public class Test3 {
		public static void main(String[] args) {
			int j = 0;
			int count = 0;				//计算最后一个字符长度
			Scanner sc1 =new Scanner(System.in);
			String str = sc1.nextLine();
			for(int i = 0 ; i < str.length();i++) {			//用循环的方式找到最后一次空格出现的位置
				j = str.indexOf(" ");	
			}
			for(int a = j+1 ; a < str.length(); a++) {		//计算
				count++;
			}
			System.out.println(count);						//输出
		}
}
