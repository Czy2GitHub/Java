/**
 * ��дJava���򣬽����û������1~12֮���������
 * �������������������룬����switch��������Ӧ�·ݵ�����
 * @author Administrator
 *
 */
//���⣺����������룿����������
import java.util.*;
public class New {	
	int month;	
	void count(int n) {			//�����������
			switch(n){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: System.out.println(n+"�µ�������31��");
			break;
			case 2: System.out.println(n+"�µ�������28��");
			break;
			case 4:
			case 6:
			case 9:System.out.println(n+"�µ�������30��");
			break;
			}
			
		}
	public static void main(String[] args){
		boolean text = true;									//������ֹwhileѭ����
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��������");
		New ad = new New();									//��������
		ad.month = input.nextInt();					
		while(true) {
		if(ad.month>0&&ad.month<12) {
			break;												//����ѭ��
		}else {												//��������
			System.out.println("����������������룺");
			ad.month = input.nextInt();
			
		}
	}
		ad.count(ad.month); 								//ִ�н��
	}
	
	
	
}
