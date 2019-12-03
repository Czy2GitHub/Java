package Week_11th;
import java.util.Scanner;
/**
 * 统计每个元音字母在字符串中出现的次数。
 * @author dell
 *
 */
public class Problem_Description {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int in = sc1.nextInt();
		int []a = new int[5];
		String []str = new String[in];
		String s = sc1.nextLine();
		for(int i = 0 ; i <str.length;i++) {
			str[i] = sc1.nextLine();
		}
		for(int j = 0 ; j < str.length;j++) {
		for(int i = 0;i < str[j].length();i++) {
			switch(str[j].charAt(i)) {
			case 'a':{
				a[0]++;
				break;
			}
			case 'e':{
				a[1]++;
				break;
			}
			case 'i':{
				a[2]++;
				break;
			}
			case 'o':{
				a[3]++;
				break;
			}
			case 'u':{
				a[4]++;
				break;
			}
			}
		}
		System.out.println("a:"+a[0]);
		System.out.println("e:"+a[1]);
		System.out.println("i:"+a[2]);
		System.out.println("o:"+a[3]);
		System.out.println("u:"+a[4]);
		System.out.println();
		for(int c = 0; c < a.length;c++ ) {
			a[c] = 0;
		}
		
		}
	}
	}
