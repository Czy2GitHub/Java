package Week_5th;

import java.util.Scanner;

/**
 * .	������ˮ̯�ϣ�ÿһ������ˮ���ۼ�Ϊ 5 ��Ԫ��
	�˿��Ŷӹ�����Ĳ�Ʒ�������˵� bills ֧����˳��һ�ι���һ����
	ÿλ�˿�ֻ��һ������ˮ��Ȼ�����㸶 5 ��Ԫ��10 ��Ԫ�� 20 ��Ԫ��������ÿ���˿���ȷ���㣬Ҳ����˵��������ÿλ�˿�����֧�� 5 ��Ԫ��
	ע�⣬һ��ʼ����ͷû���κ���Ǯ��
	������ܸ�ÿλ�˿���ȷ���㣬���� true �����򷵻� false ��
	ʾ�� 1��
	���룺[5,5,5,10,20]
	�����true
	���ͣ�
	ǰ 3 λ�˿�������ǰ�˳����ȡ 3 �� 5 ��Ԫ�ĳ�Ʊ��
	�� 4 λ�˿����������ȡһ�� 10 ��Ԫ�ĳ�Ʊ�������� 5 ��Ԫ��
	�� 5 λ�˿���������һ�һ�� 10 ��Ԫ�ĳ�Ʊ��һ�� 5 ��Ԫ�ĳ�Ʊ��
	�������пͻ����õ�����ȷ�����㣬����������� true��
 * @author dell
 *
 */
public class Text2_3 {
	public static void main(String[] args) {
		int [] a = new int[input()];
		
	}
	public static int input() {							//ȷ���������
		Scanner sc1 = new Scanner(System.in);
		System.out.println("�������Ŷӹ��������:");
		int people = sc1.nextInt();
		return people;
	}
	public static void input(int people,int []a) {		//��ʼ������
		Scanner sc2 = new Scanner(System.in);
		System.out.println("����������֧���Ľ��:");
		for(int i = 0 ; i < a.length ; i++) {
			a[i] = sc2.nextInt();
		}
	}
}