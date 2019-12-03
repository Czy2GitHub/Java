package cn.ccu.o;

import java.util.Scanner;

/**
 * 获取数组最大值和最小值操作：利用Java的Math类的random()方法，编写函数得到0到n之间的随机数，n是参数。
 * 并找出产生50个这样的随机数中最大的、最小的数，并统计其中>=60的有多少个。
 *	提示：使用 int num=(int)(n*Math.random());获取随机数。
 * @author dell
 *
 */

public class Pro07_2 {
		public static void main(String[] args) {
			Scanner sc1 = new Scanner(System.in);
			int n = sc1.nextInt();
			create(n);
			max(create(n));
			min(create(n));
			score(create(n));		
		}
		public static int[] create( int n) {
			int []array = new int[50];
			for(int i = 0;i <array.length;i++) {
				array[i] = (int) (n*Math.random()+1);
			}
			return array;
		}
		public static void max(int []arrays) {
			int temp;
			for(int i = 0;i < arrays.length-1;i++) {
				for(int j = 0;j <arrays.length-1-i;i++) {
					if(arrays[j]<arrays[j+1]) {
						temp = arrays[j];
						arrays[j] = arrays[j+1];
						arrays[j+1] = temp;
					}
				}
				System.out.println("五十个数中最大的数是:"+arrays[arrays.length-1]);
			}
		}
		public static void min(int []arrays) {
			int temp;
			for(int i = 0;i < arrays.length-1;i++) {
				for(int j = 0;j <arrays.length-1-i;i++) {
					if(arrays[j]>arrays[j+1]) {
						temp = arrays[j];
						arrays[j] = arrays[j+1];
						arrays[j+1] = temp;
					}
				}
				System.out.println("五十个数中最大的数是:"+arrays[arrays.length-1]);
			}
		}
		public static void score(int []arrays) {
			int score = 0;
			for(int i = 0;i < arrays.length;i++) {
				if(arrays[i] >= 60) {
					score++;
				}
			}
			System.out.print("其中值大于六十的数是:"+score);
		}
}
