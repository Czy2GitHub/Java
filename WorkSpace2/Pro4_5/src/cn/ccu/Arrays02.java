package cn.ccu;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ���ַ���������Ԫ��
 * @author dell
 *
 */
public class Arrays02 {
	public static void main(String[] args) {
		int [] beta = new int[] {1,2,6,5,4,9,8,7,3};
		Arrays.sort(beta);
		System.out.println(Arrays.toString(beta));
		Scanner flag = new Scanner(System.in);
		System.out.println("��������Ҫ���ҵ���:");
		int searchWord = flag.nextInt();
		System.out.println(searchWord+"Ԫ�ص�����:"+binarySearch(beta,searchWord));
	}
	public  static int binarySearch(int []arrays,int value) {
		int low = 0;
		int high = arrays.length-1;
		while(low <= high) {
			int middle = (low + high)/2;
			if(value == arrays[middle]) {
				return middle;
			}
			if(value < arrays[middle]) {
				high = middle -1;
			}
			if(value > arrays[middle]) {
				low = middle + 1;
			}
		}
			return -1;
	}
	
}
