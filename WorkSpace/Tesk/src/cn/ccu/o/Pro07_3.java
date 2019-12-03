package cn.ccu.o;

import java.util.Arrays;

/**
 * 数组逆序操作：定义长度为10的数组，将数组元素对调，并输出对调前后的结果。
   思路：把0索引和arr.length-1的元素交换，把1索引和arr.length-2的元素交换…..
   只要交换到arr.length/2的时候即可。
 * @author dell
 *
 */
public class Pro07_3 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(create()));
		change(create());
		
}
	public static int[] create() {
		int []array = new int[] {1,5,6,9,8,7,4,3,2,0};
		return array;
	}
	public static void change(int []array) {
		int temp;
		for(int i = 0 ,j = 9;i <= array.length/2&&j >= array.length/2 ;i++,j--) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		System.out.println(Arrays.toString(array));
	}
}
