/**
 * ��д�������б�Ϣ�������ʶ������£�
public class InterestComp {
	  public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  System.out.println("�����뱾��");
		     double pri_amt=Double.parseDouble(input.next());
 //���� 
		  double tot_amt=0;//��Ϣ�ܶ�
		  double rate1y = 2.25/100; //����1������
		  double rate2y = 2.7/100;//����2������
		  double rate3y = 3.24/100;//����3������
		  double rate5y = 3.6/100;//����5������
		  double interest;//��Ϣ
			..........;
			}
 */
package Week_3rd;
import java.util.*;
public class Text4 {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  System.out.println("������������:");
		  double n = input.nextDouble();
		  System.out.println("�����뱾��");
		     double pri_amt=Double.parseDouble(input.next());	 		//���� 
		  double tot_amt=0;//��Ϣ�ܶ�
		  double rate1y = 2.25/100; //����1������
		  double rate2y = 2.7/100;//����2������
		  double rate3y = 3.24/100;//����3������
		  double rate5y = 3.6/100;//����5������
		  double interest;//��Ϣ
		  if(n<=1) {
		  tot_amt = pri_amt*(rate1y+1);
		  }else if(n <= 2) {
		  tot_amt = pri_amt*(rate2y+1);
		  }else if(n <= 3) {
		  tot_amt = pri_amt*(rate3y+1);
		  }else if(n<=4) {
			  tot_amt = pri_amt*(rate1y+1);
		  }else {
			  tot_amt = pri_amt*(rate5y+1);
		  }
		  System.out.println("���õ��ı�Ϣ��:"+tot_amt);
	}
}