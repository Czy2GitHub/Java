package Beta2;
/**
 * ����static;
 * @author dell
 *
 */
public class Beta2019_3_16_2{
	int id;	//������
	String name;	//�˻���
	String puw;		//����
	
	static String company = "������ѧ";	//ѧУ���ƣ�
	public Beta2019_3_16_2(int id,String name) {
		this.id = id;
		this.name = name;
	}
	public void login() {
		printCompany();
		System.out.println(company);
		System.out.println("��½"+ name);
	}
	public static void printCompany() {
		//login();���÷Ǿ�̬��Ա������ͻᱨ��
		System.out.println(company);
	}
	public static void main(String[] args) {
		Beta2019_3_16_2 u = new Beta2019_3_16_2(777,"���");
		Beta2019_3_16_2.printCompany();
		Beta2019_3_16_2.company = "������ͷ��";
		Beta2019_3_16_2.printCompany();
	}
}

