package Week_3rd;
/**
 * ��д����,��������NNλˮ�ɻ�����
ˮ�ɻ�����ָһ��NNλ������������ÿ��λ�ϵ����ֵ�NN����֮�͵������������磺153 = 1^3 + 5^3+ 3^3��
�����ʽ:
������һ���и���һ��������NN��
�����ʽ:
������˳���������NNλˮ�ɻ�����ÿ������ռһ�С�
��������:
3
�������:
153
370
371
407

 * @author dell
 *
 */
import java.util.*;
public class Text2_8 {

		public static void main(String[] args) {
			Scanner flag = new Scanner(System.in);
			System.out.println("������ҪѰ�ҵ�ˮ�ɻ�����λ��:");
			int NN = flag.nextInt();
			if(NN == 2) {
			for(int i = 10;i>0&&i<100;i++) {
				if(i == ((i/10)%10)*((i/10)%10)*((i/10)%10)+(i%10)*(i%10)*(i%10)) {
				System.out.println(i);
			}
		}	
			}
			if(NN == 3) {
			for(int i = 101;i>100&&i<1000;i++) {
				if(i == ((i/100)%10)*((i/100)%10)*((i/100)%10)+((i/10)%10)*((i/10)%10)*((i/10)%10)+(i%10)*(i%10)*(i%10)){
					System.out.println(i);
				}
			}
		}
}
}
