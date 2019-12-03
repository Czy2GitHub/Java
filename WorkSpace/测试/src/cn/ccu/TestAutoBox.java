package cn.ccu;
/*
 * 测试自动装箱、自动拆箱
 */
public class TestAutoBox {
public static void main(String[] args) {
	Integer a = 100; //Integer a = Integer.valueOf(100);
	int b = a; //编译器会修改成 ：int b = a.intValue();
	
	//缓存[-128,127]之间的数字，实际就是系统初始的时候，创建了[-128,127]之间的一个缓存数组
	//当我们调用valueOf()的时候，首先检查是否存在[-128,127]之间，如果在这个范围直接从缓存数组拿出来
	Integer in1 = 1234;
	Integer in2 = 1234;
	System.out.println(in1 == in2);			//不存在缓存问题，false
	System.out.println(in1.equals(in2));	//true
	Integer in3 = -128;
	Integer in4 = -128;
	System.out.println(in3 == in4);			//存在缓存，true
	System.out.println(in3.equals(in4));	//true
}
}
