/**
 * ���ʵ�ָ߿�׹�����⡣
Ƥ���ĳ�����߶��������£����غ󷴵���ԭ�߶ȵ�һ�룬�����£��ٷ�������������˷�����
��Ƥ���ڵ�nn�����ʱ���ڿ���һ���������پ��룿
��nn�η����ĸ߶��Ƕ��٣�
�����ʽ:
������һ���и��������Ǹ��������ֱ���Ƥ��ĳ�ʼ�߶Ⱥ�nn�����ڳ����ͷ�Χ�ڡ�
�����ʽ:
��һ����˳�����Ƥ���nn�����ʱ�ڿ��о����ľ��롢�Լ���nn�η����ĸ߶ȣ������һ���ո�ָ�������һλС������Ŀ��֤������������˫���ȷ�Χ��
��������:
33 5
�������:
94.9 1.0


 */
package Week_3rd;
import java.util.*;
public class Text2_7 {
	public static void main(String[] args) {
		Scanner flag = new Scanner(System.in);
		System.out.println("������Ƥ��ĳ�ʼ�߶Ⱥ���ط�������:");
		double sum = 0;
		 double height = flag.nextDouble();  	//Ƥ���ʼ�߶�
		 double nn = flag.nextDouble();	        //��nn��
		 for(int i = 1;i <= nn; i++) {
	    	 if(i == 1) {
	    		 sum = height;
	    		 height = height/2;
	    	 }else  {
	    		 sum = sum + height*2;
	    		 height = height/2;
	    	
	     }
		 }
	    System.out.printf("%.1f %.1f",sum,height);
	}
}
