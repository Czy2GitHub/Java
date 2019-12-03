package cn.ccu;
/**
 * 测试String方法
 * @author dell
 *
 */
public class TextObject {
	public static void main(String[] args) {
		String str = "core Java";
		String str1 = "Core Java";
		System.out.println(str.charAt(3));		//返回char指定索引处的值
		System.out.println(str.length());		//	字符串长度
		System.out.println(str.equals(str1));	//比较字符串是否相等
		System.out.println(str.equalsIgnoreCase(str1));		//忽略大小写比较字符串是否相等
		String s = str.replace(' ','$');					//替换字符串中的元素
		System.out.println(str.indexOf("Java"));		// 返回字符串str中字符串“Java”的位置；
		System.out.println(str.indexOf("apple"));		//如果括号内的字符串不在原字符串内，则返回-1
		String s2 = "";
		String s1 = "How are you?";
		System.out.println(s1.startsWith("How"));	//判断字符串是否以括号内字符串开头
		System.out.println(s1.endsWith("you?"));	//判断字符串是否以括号内字符串结尾
		s = s1.substring(4);					//提取s1字符串第四位到最后一位的字符储存到s中
		System.out.println(s);					
		s = s1.substring(4,7);					//提取s1字符串第四位到第七位的字符串（不包括7）储存到s中
		System.out.println(s);
		s = s1.toLowerCase();					//转小写
		System.out.println(s);
		s = s1.toUpperCase();					//转大写
		System.out.println(s);
	}		
}
