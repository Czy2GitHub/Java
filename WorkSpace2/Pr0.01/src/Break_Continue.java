/**
 * ����Break��double��
 * @author dell
 *
 */
public class Break_Continue {
	public static void main(String[] args) {
			int total = 0;	//���������ƻ��У�
		for(int i =100;i>=100&&i<=150;i++ ) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.print(i+"��");
			total++;
			if(total % 5 ==0) {
				System.out.println();
				total = 0;		//���ü�������
			}
		}
	}

}
