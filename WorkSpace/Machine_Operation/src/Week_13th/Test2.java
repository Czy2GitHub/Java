package Week_13th;
import java.util.Scanner;
/**
 * 给定一个长度,随机产生一个该长度的字符串,由大写,小写字母以及数字组成
Java中随机数的生成:
java.util.Random r = new java.util.Random();
int a = r.nextInt(100): a 0-99的随机数
大写字母: char(random()*26+65); 小写字母:char(random()*26+97);
 * @author dell
 *
 */
public class Test2 {
	public static String randomS(int n) {			//递归随机生成字符串
		if(n == 0) {				//如果传入长度为空，则返回“”
			return "";	
		}
		int a = (int)(Math.random()*3);					//设置三种方向
		if(a == 0) {									//a= 0随机生成数字
			return (int)Math.random()*10 + randomS(n-1);	
		}
		else if(a == 1) {								//a =1随机生成大写英文字母
			return (char)((int)(Math.random()*26+65)) + randomS(n - 1);
		}else {											//a = 2 随机生成小写英文字母
			return (char)((int)(Math.random()*26+97)) + randomS(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();			//字符数组长度
		System.out.println(randomS(n));
	}
}
