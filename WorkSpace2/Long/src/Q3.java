import java.util.*;
public class Q3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("������һ�������ж��Ƿ�Ϊ��������");
		int a = input.nextInt();
		int[] b = new int[10];
		int n = 0;
		while (a != 0) { // ��һ�����ַֽ������Ž�������
			b[n++] = a % 10;
			a = a / 10;
		}
		int flag = 1; // ��������Ի����������ж�
		for (int i = 0; i <   n / 2; i++) {
			if (b[i] != b[n - 1 - i]) {
				flag = 0;
				break;
			}
		}
		if(flag == 0){
			System.out.println("��������ֲ��ǻ�������");
		}
		if(flag == 1) {
			System.out.println("����������ǻ�������");
		}
		input.close();
	}
}

	


