package cn.ccu;

import java.util.Arrays;

/**
 * 
 * 测试冒牌排序法及优化
 * @author dell
 *
 */
public class TestBubbleSort {
	public static void main(String[] args) {
	int []values = {3,1,6,2,9,0,7,4,5,8};
	int temp = 0;
	for(int i = 0;i < values.length;i++) {
		boolean flag = true;						//用于提前结束循环，减少排序时间
	for(int j = 0; j <values.length-1-i;j++) {
		if(values[j] > values[j+1]) {					//发生交换
		temp = values[j];	
		values[j] = values[j+1];
		values[j+1] = temp;
		flag= false;									//如果发生交换，则flag为false
		System.out.println(Arrays.toString(values));
		}
	}
	if(flag) {											//如果未发生交换，则结束循环
		break;
	}
	System.out.println("###");
	}
}
}
