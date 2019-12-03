package 睿智;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OutPut {
		public static void main(String[] args) {
			Scanner sc1 = new Scanner(System.in);
			int []score = new int[3];
			for(int i = 0; i<score.length;i++) {
				score[i] = sc1.nextInt();
			}
			System.out.println("平均分:"+aver(sum(score),score));
			System.out.println("最低分:"+min(sum(score),score));
			System.out.println("最高分:"+max(sum(score),score));
		}
		public static int sum(int []a) {
			int count = 0;
			for(int i = 0; i < a.length;i++) {
				count = count + a[i];
			}
			return count;
		}
		public static int aver(int a,int []b) {
		a =	a / b.length;
		return a;
		}
		public static int max(int a, int []b) {
				int count = 0;
			for(int i = 0; i<b.length;i++) {
				if(b[i] > count ) {
					count = b[i];
				}
			}
			return count;
		}
		public static int min(int a,int []b) {
			int count = 0;
			for(int i = 0; i<b.length;i++) {
				if(i == 0) {
					count = b[i];
					continue;
				}
				if(b[i] <= count) {
					count = b[i];
				}
			}
			return count;
		}
}

