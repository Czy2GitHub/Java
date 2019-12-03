package cn.ccu;
/**
 * 冒泡排序法
 * 改进：利用布尔类型来终止程序
 * 将未完成排序的数组定义为“无序数组”，将完成排序的数组定义为“有序数组”
 * 通过布尔类型来判断数组是否被排列好.
 * @author dell
 *
 */
import java.util.Arrays;
public class Arrays01 {
		public static void main(String[] args) {
			int [] a = new int[] {1,5,6,4,2,3,0,8,9,7};
			change(a);
			System.out.println(Arrays.toString(a));
		}
		public static void change(int []arrays) {
			int temp;
			boolean flag = true;
			for(int i = 0;i<arrays.length-1;i++) {		//循环数组长度个次数
				for(int j = 0;j<arrays.length-1-i;j++) {	//第一个数循环9次，第二个数循环8次，以此类推		
				if(arrays[j]>arrays[j+1]) {			//交换a[j]与a[j+1]
					temp = arrays[j];
					arrays[j] = arrays[j+1];
					arrays[j+1] = temp;
					flag = false;
				
				if(flag ) {
					break;
				}
				}
				}
	Arrays.binarySearch(arrays, 2);
			}
}
}