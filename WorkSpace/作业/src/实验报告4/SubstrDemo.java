package 实验报告4;
/**
 * 1．	创建SubstrDemo类，利用String类indexOf()、lastIndexOf()、subString()来实现对字符串str=”I like java programming”取子串的操作
 * （s1为”java programming”、s2为 ”java”、s3为 ”programming”）。
 * @author dell
 *
 */
public class SubstrDemo {
	public static void main(String[] args) {
		String str = "I like java programming";									//创建字符串
		String s1 = str.substring(str.indexOf(' ')+1);							//通过indexof以及substring方法来获取s1,s2,s3
		String s2 = str.substring(str.indexOf(" ",str.indexOf(" ")+1)+1,str.lastIndexOf(" "));
		String s3 = str.substring(str.lastIndexOf(' ')+1);
		System.out.println("s1 ="+s1+ "\ns2 ="+ s2+ "\ns3 =" +s3);
	}
}
