package cn.ccu.o;

import java.util.Arrays;

/**
 * ����������������峤��Ϊ10�����飬������Ԫ�ضԵ���������Ե�ǰ��Ľ����
   ˼·����0������arr.length-1��Ԫ�ؽ�������1������arr.length-2��Ԫ�ؽ�����..
   ֻҪ������arr.length/2��ʱ�򼴿ɡ�
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
