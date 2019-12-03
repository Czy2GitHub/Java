package cn.ccu;
/**
 * 
 * @author dell
 *
 */
public class TestString {
	public static void main(String[] args) {
		
		String str = "aaabbb";
		String str2 = str.substring(3,5);
		String str3 = "hello"+" java";	//相当于str3 = "hello java"
		String str4 = "hello java";
		System.out.println(str3.equals(str4));		//true
	}	
		
}
