/**
 * ��д Java ����������ʾ�˵����������䡣
 * ����һ������Person�� ������Ӧ��������˽�����ԣ� ���� (name) ������ (age) ��
 * ���幹�췽��������ʼ�����ݳ�Ա���ٶ�����ʾ(display()) �����������������ӡ������
 * �� main �����д��������ʵ��Ȼ����Ϣ��ʾ��
 */
package cn.ccu;

public class Pro4_1 {
	String name ;
	int age;
	public Pro4_1(String name,int age) {		//��������
		this.name = name;
		this.age  = age;
}
	public void display() {
		System.out.println(name+"\t"+age);
	}
	public static void main(String[] args) {
		Pro4_1 Person = new Pro4_1("777",18);
		Person.display();
	}
}