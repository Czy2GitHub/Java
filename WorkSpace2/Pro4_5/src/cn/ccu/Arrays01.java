package cn.ccu;
/**
 * ð������
 * �Ľ������ò�����������ֹ����
 * ��δ�����������鶨��Ϊ���������顱���������������鶨��Ϊ���������顱
 * ͨ�������������ж������Ƿ����к�.
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
			for(int i = 0;i<arrays.length-1;i++) {		//ѭ�����鳤�ȸ�����
				for(int j = 0;j<arrays.length-1-i;j++) {	//��һ����ѭ��9�Σ��ڶ�����ѭ��8�Σ��Դ�����		
				if(arrays[j]>arrays[j+1]) {			//����a[j]��a[j+1]
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