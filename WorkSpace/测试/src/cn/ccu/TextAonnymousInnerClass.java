package cn.ccu;
/**
 * 测试匿名内部类
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
				System.out.println("实现匿名内部类!");
			}
			
		});
	}
}
interface AA{
	void aa();
}