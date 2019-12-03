package Week_5th;
/**
 * .给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 * @author dell
 *
 */
import java.util.*;
public class Text4 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int []a = new int[5];
		int score = 0 ;
		System.out.println("请输入一个数组:");
		for(int i = 0 ;i < a.length - 1 ; i++) {
			a[i] = sc1.nextInt();		
}
		System.out.println("请输入想要寻找的数字:");
		int key = sc1.nextInt();
		for(int k = 0;k < a.length - 1;k++) {
			if(key != a[k]) {
				score++;
			}
		}
		if(score != 4) {
			System.out.println("所寻找数字的索引是:"+Arrays.binarySearch(a,key));
		}else if(score == 4) {
			a[4] = key;
			Arrays.sort(a);
			System.out.println(key);
		}
	}
}
