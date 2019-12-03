package cn.ccu;

public class TextString {
	public static void main(String[] args) {
		String str = "abc";
		String str1 = new String("dce");
		String str3 = "abc" + "dce";
		String str4 = "18" + 19;		//不是加法，是字符串连接符,输出1819
		System.out.println(str4);
		String str10 = "gaoqi";
		String str11 = "gaoqi";
		String str12 = new String("gaoqi");
		System.out.println(str11 == str12);
		System.out.println(str10 == str11);
}
}
