package 睿智;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		int []a = {1,7,5,7,9,21,13,45};
		int []b = {2,5,8,14,21};
		int []c = new int[a.length + b.length];
		for(int i = 0 ; i < a.length ;i++) {
			c[i] = a[i];
		}
		for(int j = 0; j < b.length; j++) {
		c[a.length+j] = b[j]  ;
		}
		System.out.println(Arrays.toString(c));
	}
}
