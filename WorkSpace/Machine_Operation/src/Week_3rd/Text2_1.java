/**
 * ��д����ʵ�֣�1-100����Ȼ�����ۼӺ͡�
 */
package Week_3rd;

public class Text2_1 {
		public static void main(String[] args) {
			int	sum = 0;
			for(int i = 0;i<=100;i++) {
				sum = i + sum;
			}
			System.out.println("һ��һ�ٵ���Ȼ�����ۼӺ���:"+sum);
		}
}
