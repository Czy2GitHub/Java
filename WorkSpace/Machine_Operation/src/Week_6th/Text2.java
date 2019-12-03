package Week_6th;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * @author dell
 *
 */
public class Text2 {
	static	int count=0;	
	public static void main(String[] args) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("请规定数组的长度:");
			int n = sc1.nextInt();
			int []a = new int[n];
			input(a);
			mode(a);
		}
		public static void input(int []a) {			//输入
			Scanner sc2  = new Scanner(System.in);
			System.out.println("请输入数组元素:");
			for(int i = 0;i <a.length;i++ ) {
				 a[i] = sc2.nextInt();
			}
		}
		public static void mode(int []a) {			//求众数
			int [] b = new int[a.length];
			int [] c = new int[a.length];
			Arrays.sort(a);			//先对数组排序
			for(int i = 0 ;i <a.length;i++) {
				for(int j = 0 ; j<b.length;j++) {
					if(a[i] == a[j]) {
						 count++;	 
					}
					b[i] = count;
					c[i] = i;
				}
				 count = 0;
				 if(i == a.length-1) {
					 System.out.println(space(b,a)+"是数组的众数，共出现:"+max(b)+"次");
				 }
			}
		}
		public static int max(int []a) {
			int temp;
			temp = a[0];
			for(int i = 0;i < a.length;i++) {
				if(temp < a[i]) {
					temp = a[i];
				}
			}
			return temp;
		}
		public static int space(int []b,int []a) {
			int j = 0;
			for(int i = 0; i < b.length;i++) {
				if(b[i] == max(b)) {
					 j = a[i];
				}
			}
			return j;
		}
}
