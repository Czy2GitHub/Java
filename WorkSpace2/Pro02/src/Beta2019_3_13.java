/**_
 * ���Է����Ļ���ʹ��
 * @author dell
 *
 */
public class Beta2019_3_13 {
	public static void main(String[] args) {
		//ͨ�����������ͨ����
		Beta2019_3_13 beta = new Beta2019_3_13();
		beta.printyg();
	    int i = beta.add(30, 40, 50)+1000;	
		System.out.println(i);
	}
void printyg() {
		System.out.println("���");
	}
int add(int a,int b, int c) {
	int sum = a + b + c;
	return sum;			//return�������ã�1.�������������С�2.����ֵ
}
}