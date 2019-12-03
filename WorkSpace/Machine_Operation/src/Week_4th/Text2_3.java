package Week_4th;
import java.util.Scanner;
/**
 * 2.给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

 * @author dell
 *
 */
public class Text2_3 {
	public static void main(String[] args) {		//1,2,3,4,5 -->1,3,4,5
		Scanner sc1 = new Scanner(System.in);
		System.out.println("输入nums数组的长度：");
		int n = sc1.nextInt();				//控制数组长度
		System.out.println("输入想要删除的数：");
		int val = sc1.nextInt();			//指定数
		int []nums  = new int[n];
		System.out.println("输入数组成员：");
		for(int j = 0;j <nums.length ; j++) {
			nums[j] = sc1.nextInt();
		}
		for(int i = 0;i < nums.length;i++) {
			if(nums[i] == val) {
				if(i < nums.length-1) {
				nums[i] = nums[i+1];
				n--;
				}else if(i == nums.length-1) {
					n--;
				}
			}
		}
		System.out.println("移除该数后数组的长度是："+n);
	}
}
