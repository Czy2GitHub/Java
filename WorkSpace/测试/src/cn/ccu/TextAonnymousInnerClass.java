package cn.ccu;
/**
 * ���������ڲ���
 * @author dell
 *
 */
public class TextAonnymousInnerClass {
	public static void run(AA a) {
		a.aa();
	}
	public static void main(String[] args) {
		run(new AA() {

			@Override
			public void aa() {
				// TODO Auto-generated method stub
				System.out.println("ʵ�������ڲ���!");
			}
			
		});
	}
}
interface AA{
	void aa();
}