package ssas;
import java.util.*;
public class Text {
	public static void main(String[] args) {
		int count = 0;				//��������Чֵ��������
		int []a = new int[7];	
		System.out.println("�н�����Ϊ:");
		boolean flag = true;				//�����ж��Ƿ�Ϊ��Чֵ
		for(int i= 0;i <7;i++) {			//����ʼ��������7�����������ȫ����Чֵ
			a[i] = (int)(Math.random()*30+1);
		}
		
		//ѭ������Чֵ��������
		while(count<a.length) {				  //�ж���7�����Ƿ����ظ��ģ�����������
			//����һ���µ�������������������������ԭԪ�ضԱȣ�������ͬ���������Ϊ��Чֵ
			int rdm = (int)(Math.random()*30+1);		
			for(int k = 0;k <a.length;k++) {		//�Ƚ�
			if(rdm == a[k]) {
				flag = false;						//���ظ�����flag��Ϊfalse���ж�Ϊ��Чֵ
				break;
			}
			}
			if(flag) {								//���flagΪtrue������Ϊ�˴�ѭ��rdmΪ��Чֵ���������飻
				a[count] = rdm;
				System.out.print(rdm+" ");
				count++;
			}
		}
		int score = 0;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("������7����:");
		int []b = new int[7];
		for(int h = 0 ; h <7;h++) {
			b[h] = sc1.nextInt();
		}
		
		//����������������е������жԱ�
		for(int q = 0; q < 7 ;q++) {
				if(b[q] == a[q]) {
					score++;
				}
	
}
		switch(score) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("���ź�û���н�!");
			break;
		case 5:
			System.out.println("��ϲ������Ƚ�!");
			break;
		case 6:
			System.out.println("��ϲ��ö��Ƚ�!");
			break;
		case 7:
			System.out.println("��ϲ���һ�Ƚ�!");
		}
}
}
