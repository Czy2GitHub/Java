package cn.ccu;

import cn.ccu.Outer.Inner;

/**
 * �����ڲ���
 * @author dell
 *
 */
public class TextInnerClass {
		public static void main(String[] args) {
			//�����Ǿ�̬�ڲ������
			Outer.Inner inner = new Outer().new Inner();
			inner.run();
			//������̬�ڲ������
			Outer.Inner2 inner2 = new Outer.Inner2();
			inner2.run();
		}
}

class Outer{
	private int age  = 10;
	public void textOuter() {
		System.out.println("���Գɹ�!");
	}
		static class Inner2{
			void run() {
				System.out.println("��̬�ڲ���!");
			}
		}
		class Inner{					//��ʹInner��Outer�ڲ�������ʱҲ������������class�ļ�
			int age = 5;
			void run() {
				System.out.println(this.age+Outer.this.age);		//ǰһ��thisָ����Inner�е�age����һ��thisָ����Outer�е�age;
			}
		}
}