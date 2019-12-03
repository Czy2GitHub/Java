package Week_5th;

import java.util.Scanner;

public class Text5_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in);
		String s = input.nextLine();
		System.out.println(lengthOfLongestSubstring(s));
		}
		public static int lengthOfLongestSubstring(String s) {
		if(s.length() == 1)						//字符串长度为1，直接返回一，排除特殊情况
		return 1;								
		if(s.length() == 0)						//字符串长度为0，直接返回零，排除特殊情况
		return 0;	
		char str[] = s.toCharArray();				//将字符串变为字符数组
		int i =0;			 								//初始化
		int j = i +1;										//初始化									
		int max = 0;
		boolean t = true;
		while(i <  s.length() - 1) {					
		int length = 1;
		if(j == s.length()) {
		break;
}
		for(int k = i;k< j;k++) {				
				if(str[j]!=str[k]){			//比较后一项和此项是否相同，length++;
						length++;
			}else {
				t = false;
				break;
		}
}
		if(length > max) {					//将length的最大值赋给max
			max = length;
}
		if(t) {								//将j的值变大
			j++;
	}
		else {								//还原t，将变大，重置length
		t = true;								
		i++;								
		j = i+1;
		length = 1;
	}
}
		return max;
		}
}
