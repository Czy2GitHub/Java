package Week_5th;
/**
 * .��1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ���������������ÿһ�ֵ����
 * @author dell
 *
 */
public class Text2_1 {
	public static void main(String[] args) {
		int score = 0;
		int num = 0;
		for(int i = 1 ;i <= 4 ;i++) {			//
			for(int j = 1 ;j <=4 ; j++) {
				for(int k = 1; k <=4 ; k++) {
					if(i != k&&i != j&& k != j) {
				num = i*100+j*10+k;
						System.out.println(num);
						score++;
					}
				}
			}
		}
	System.out.println("����"+score+"�����");
	}
}
