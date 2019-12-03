package Week_4th;
/**
 * 峰值元素是指其值大于左右相邻值的元素。
给定一个输入数组 nums，其中 nums[i] ≠ nums[i+1]，找到峰值元素并返回其索引。
数组可能包含多个峰值，在这种情况下，返回任何一个峰值所在位置即可。
你可以假设 nums[-1] = nums[n] = -∞。

 * @author dell
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Text6 {
		public static void main(String[] args) {
			Scanner sc2 = new Scanner(System.in);
			System.out.println("请输入一个数组:"+"\t"+"nums = ");
			int []nums = new int[5];
			input(nums);			//输入
			chooseOne(nums);		//判断
			search(nums);			//索引
		}
		public static void search(int []a) {
	
			 for(int i = 1;i < a.length;i++) {
				 if(a[i] > a[i-1]&&a[i] > a[i+1]) {
					 System.out.println("该数组的一个峰值为"+a[i]+"\t"+"该峰值的索引为"+i);
				 }
			 }
		}
		public static void input(int a[]) {
			Scanner sc1 = new Scanner(System.in);
			for(int i = 0;i < a.length;i++) {
				 a[i] = sc1.nextInt();
			}
		}
		public static void chooseOne(int []a) {
			int temp = 0;
			for(int i = 0;i < a.length-1;i++) {
				if(a[i] == a[i+1]) {
					temp++;
				}
			}
			if(temp >0) {
				System.out.println("输入数组格式错误!");
			}
				
		}
}
