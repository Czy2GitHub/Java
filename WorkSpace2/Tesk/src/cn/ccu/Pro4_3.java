/**
 * ����һ�������û��࣬��Ϣ���û� ID���û����롢 email ��ַ��
 * �ڽ������ʵ��ʱ������������Ϣ����Ϊ���캯���Ĳ������룬
 *  �����û� ID ���û�����ʱ����ȱʡʱ email��ַ���û� ID �����ַ���"@gameschool.com"��
 */
package cn.ccu;

public class Pro4_3 {
	int id;
	int pwd;
	String email;
	Pro4_3(int id,int pwd,String email){
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		System.out.println("���û�����Ϣ�У�\n"+id+"\n"+pwd+"\n"+email);
	}
	Pro4_3(String email){
		this.email = email;
		System.out.println("���û�����Ϣ�У�"+email+"@gameschool.com");
	}
	public static void main(String[] args) {
		Pro4_3 user = new Pro4_3(7777,4396,"ClearLove@4396.com");
		Pro4_3 user2 = new Pro4_3("ClearLove7");
		
	}
}
