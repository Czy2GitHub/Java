package Week_5th;
/**
 *  һ��������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣�
 * @author dell
 *
 */
public class Text2_2 {
		public static void main(String[] args) {
			for(double i = 0;i < Double.POSITIVE_INFINITY;i++) {
				if(Math.sqrt(i+100)-(int)Math.sqrt(i+100) == 0 &&Math.sqrt(i+100+168) -(int) Math.sqrt(i+100+168) == 0) {
					System.out.println(i);
					break;
				}
			}
			
	}
}
