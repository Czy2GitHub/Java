package Week_5th;

import java.util.Scanner;

public class Text5_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in);
		String s = input.nextLine();
		System.out.println(lengthOfLongestSubstring(s));
		}
		public static int lengthOfLongestSubstring(String s) {
		if(s.length() == 1)						//�ַ�������Ϊ1��ֱ�ӷ���һ���ų��������
		return 1;								
		if(s.length() == 0)						//�ַ�������Ϊ0��ֱ�ӷ����㣬�ų��������
		return 0;	
		char str[] = s.toCharArray();				//���ַ�����Ϊ�ַ�����
		int i =0;			 								//��ʼ��
		int j = i +1;										//��ʼ��									
		int max = 0;
		boolean t = true;
		while(i <  s.length() - 1) {					
		int length = 1;
		if(j == s.length()) {
		break;
}
		for(int k = i;k< j;k++) {				
				if(str[j]!=str[k]){			//�ȽϺ�һ��ʹ����Ƿ���ͬ��length++;
						length++;
			}else {
				t = false;
				break;
		}
}
		if(length > max) {					//��length�����ֵ����max
			max = length;
}
		if(t) {								//��j��ֵ���
			j++;
	}
		else {								//��ԭt�����������length
		t = true;								
		i++;								
		j = i+1;
		length = 1;
	}
}
		return max;
		}
}
