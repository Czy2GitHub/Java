package Week_3rd;
/**
 *  ��д����,��������NNλˮ�ɻ�����
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
public class Text_3 {
	public static void main(String[] args) {
		Scanner flag = new Scanner(System.in);
		int a = 0;	
		int b = 0; 
		int c = 0;
		int NN = flag.nextInt();
		for(int i = (int)Math.pow(10,NN-1);i<Math.pow(10, NN);i++) {
			a = i;			//���ڷ������ĸ�ʮ��λ
		for(int j = 0;j < NN;j++) {				//����ˮ�ɻ�����
			b = a%10;					//���λ����
			a = a/10;					//��ʮλ����ת��Ϊ��λ;
			c +=Math.pow(b, NN);			//�ж�ˮ�ɻ���
		}
			if(i == c) {
				System.out.println(i);
			}
			c = 0;
		}
	}
}
