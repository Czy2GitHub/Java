package Week_4th;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 1.给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * @author dell
 *
 */
public class Text2_2 {
	public static void main(String[] args) {
		Scanner  sc1 = new Scanner(System.in);
		System.out.println("输入nums1的数组长度:");
		int m = sc1.nextInt();
		System.out.println("输入nums2的数组长度:");
		int n = sc1.nextInt();
		int []nums1 = new int[m];
		int []nums2 = new int[n];
		int k = 0;			//计数器
		if(m <= n){
			System.out.println("输入错误请重新输入!");
		}
		System.out.println("初始化数组nums2!");
		for(int j = 0 ;j < n;j++) {					//2数组赋值
			nums2[j] = sc1.nextInt();
		}
		System.out.println("初始化数组nums1!");
		for(int i = 0 ;i < m;i++ ) {			//1数组赋值
			if(i < (m-n)) {
			nums1[i] =sc1.nextInt();
			}
			if(i >= (m-n)) {
			nums1[i] = nums2[k];
			k++;
			}
		}
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));	
	}
}
