/**
 * ���������������
 * �����߼��������
 * ����λ���㣻
 * �ַ����������
 * �����������
 * ��������ת���������⣻
 * @author dell
 *
 */
public class Beta2019_3_9 {
	public static void main(String[] args) {
		System.out.println(-9%5);	//���Ϊ-4��
		int a = 3;
		int b = a++;	//ִ�����b=3���ȸ�b��ֵ����������
		System.out.println("a="+a+"\nb="+b);
	boolean b1 = true;
	boolean b2 = false;
	System.out.println(b1&b2);	//���Ϊfalse��
	System.out.println(b1|b2);	//���Ϊtrue;
	System.out.println(b1^b2);	//���Ϊtrue��
	System.out.println(!b2);	//���Ϊtrue��
	//��·
	// int c = 3/0��
	boolean b3 = 1>2&&2<(3/0);	//��·�룬��һ����������ֵΪfalse������Ҫ�������Ĳ�����
	System.out.println(b3);
	//��λ
	System.out.println(12<<2); 		//��������λ���൱��12*4�����Ϊ48��
	System.out.println(12>>2);		//��������λ���൱��12/4�����Ϊ3��	
	//�ַ���
	String n = "3";
	int m = 4;
	int x = 5;
	char z = 'a';
	System.out.println(n+m+x);		//���Ϊ345��
	System.out.println(m+x+n);		//���Ϊ93��
	System.out.println(z+4);		//���⣬a��Ascli��Ϊ97����4���Ϊ101��
	//���������
	int score = 80;
	int l = -100;
	String type = score<60?"������":"����";
	System.out.println(type);
	if(score<60) {
		System.out.println("������");
	}else{
		System.out.println("����");
	}
	System.out.println(l>0?1:(x==0?0:-1));	//���Ϊ-1��

	
	//����ת����������
	int money = 1000000000;	//ʮ�ڣ�
	int years = 20;
	//���ص�total�Ǹ�����������int�ķ�Χ��
	int total = money*years;
	System.out.println("total="+total);
	//���ص�total���Ǹ�����Ĭ����int����˽����ת��intֵ����ת��long�������Ѿ����������ݶ�ʧ��
	long total1 = money*years;
	System.out.println("total1="+total1);
	//���ص�total2��ȷ�Ƚ�һ�����ӱ��long���������ʽ����������ȫ����long������
	long total2 = money*((long)years);
	System.out.println("total2="+total2);
	
	
	//��������
	int I = 2;		//�ֲ���L����1��
	long k = 23451l;		//����ʹ�ô�дL			
	System.out.println(I+1);
	}	
	
}
