package Week_13th;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 定义一个方法listTest(ArrayList<Integer> al, Integer s)，要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
 * @author dell
 *
 */
public class Test2_2 {
		private static  int listTest(ArrayList<Integer>a1,Integer s) {
			return a1.indexOf(s);
		}
		public static void main(String[] args) {
			Scanner sc1 = new Scanner(System.in);
			ArrayList <Integer>arr = new ArrayList<Integer>();
			arr.add(sc1.nextInt());
			arr.add(sc1.nextInt());
			arr.add(sc1.nextInt());
			int s = sc1.nextInt();
			System.out.println(listTest(arr,s));
		}
}
