/**
 * ��д����ʵ�֣���ǰ 20 ����Ȼ���������ܱ� 3 ���������ĺͣ�����ӡ��������
 */
package Week_3rd;

public class Text2_4 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i<=20;i++ ) {
			if(i % 3 ==0) {
				System.out.println(i);
				sum = i + sum;
			}
		}
		System.out.println("ǰ20����Ȼ���������ܱ�3���������ĺ���:"+sum);
	}
	
}
