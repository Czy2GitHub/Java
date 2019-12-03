package cn.ccu;
/**
 * 测试TestStringBuilder
 * @author dell
 *
 */
public class TestStringBuilder {
	public static void main(String[] args) {
		String str;
		//StringBuilder线程不安全，效率高（一般使用它）；StringBuffer线程安全，效率低
		StringBuilder sb = new StringBuilder("abcdefg");
		System.out.println(sb);
		
		sb.setCharAt(2, 'M');
	//就是把对象的hashcode值用16进制表示出来。不过这个16进制是个字符串哦，
		System.out.println(Integer.toHexString(sb.hashCode()));	
		System.out.println(sb);
	}
	
}
