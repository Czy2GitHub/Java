package 实验报告4;
/**
 * 2．	创建一个StringBuffer类对象name，利用append方法向name对象添加元素，
 * 将name转变为String类型变量str1并输出，根据str创建StringBuffer对象b并调用reverse()方法，
 * 将b输出显示。
 * @author dell
 *
 */
public class TestStringBuffer {
	public static void main(String[] args) {
		StringBuffer name = new StringBuffer();			//创建名字为name的StringBuffer对象
		name.append("我是一个莫得感情的杀手，");			//利用.append添加字符串对象
		name.append("也莫得钱");						
		String str1 = name.toString();					//创建String对象str1储存name转化成name的toString对象
		StringBuffer b = new StringBuffer(str1);		//将str1转化成StringBuffer对象b
		b.reverse();									//调用.reverse()方法反序
		System.out.println(b.toString());				//输出b
	}
}
