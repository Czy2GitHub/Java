/**
 * ��д����ʵ�֣����� 1��10 ֮����� 5 ����ĸ�����Ȼ���ĺ͡�
 */
package Week_3rd;

public class Text2_2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0;i <= 10;i++) {
		if(i ==5 ) {
			continue;	
		}else {
			sum = i + sum;	
		}
		}
		System.out.println("һ��ʮ֮�����������ĸ�����Ȼ���ĺ���:"+sum);
	}
}
