/**
 * ͳ����������͡�
Ҫ��ͳ�Ƹ�������MM��NN�����������ĸ�������������͡�
�����ʽ:
������һ���и�������������MM��NN��
�����ʽ:
��һ����˳�����MM��NN�����������ĸ����Լ����ǵĺͣ����ּ��Կո�ָ���

 */
package Week_3rd;
import java.util.*;
public class Text2_5 {
	public static void main(String[] args) {
		int sum = 0;
		int k = 0;					//�����ü�����
		int score = 0;			//������
		System.out.println("������ҪѰ������������:");
		Scanner count = new Scanner(System.in);
		int MM = count.nextInt();
		int NN = count.nextInt();
		for(int i =MM;i<NN;i++) {
			if(i == 1) {
				continue;
			}
			int flag = 1;
			for(int j = 2;j <i;j++) {
				if(i % j == 0) {
					flag = 0;
					break;
				}
			}
				if(flag == 1) {	
			      System.out.print(i+" ");
			score++;	
			      sum = i + sum;
			      k++;
			      if(k == 5) {
			    	  System.out.println();
			    	  k = 0;
				}
				
			      }
		}		
		System.out.println();
	System.out.println(MM+"~"+NN+"�����ڵ�����������:"+score+"\n"+"���ǵĺ���:"+sum);

	}
}