package 睿智;

import java.util.Arrays;

public class Test {
		public static void main(String[] args) {
			int []a = {1,2,3,4,5,6};
			int temp = 0;
			for(int i = 0 ; i < a.length/2 ; i++) {
				temp = a[a.length - 1 - i];
				a[a.length - 1 - i] = a[i];
				a[i] = temp;
			}
			System.out.println(Arrays.toString(a));
		}
}
