package cn.ccu;

import java.util.Arrays;

/**
 * 二分法查找
 * @author dell
 *
 */
public class TestBinarySearch {
public static void main(String[] args) {
	int []arr  = {10,20,30,40,50,60,70,80,90,100};
	System.out.println(Arrays.toString(arr));
	System.out.println(myBinarySearch(arr,40));
}
public static int myBinarySearch(int []arr ,int value) {
	int low = 0;
	int high = arr.length - 1;
	while(low <= high) {
		int mid = (low + high)/2;
		if(value < arr[mid]) {
			high = mid - 1;
		}
		if(value >arr[mid]) {
			low = mid + 1;
		}
		if(value == arr[mid])
			return mid;
	}
	return -1;
}
}
