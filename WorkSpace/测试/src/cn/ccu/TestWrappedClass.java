package cn.ccu;

/**
 * 测试包装类
 * @author dell
 *
 */
public class TestWrappedClass {
public static void main(String[] args) {
	//基本数据类型转化成包装类对象
	Integer a = Integer.valueOf(30);
	System.out.println(a);
	//把包装类对象转成基本数据类型
	int c = a.intValue();
	double b = a.intValue();
	//把包装类对象转换成字符串
	String str =a.toString();
	//常见常量
	System.out.println("int型最大的整数:"+Integer.MAX_VALUE);
}
}
