package Week_7th;
import javax.swing.plaf.synth.SynthSeparatorUI;
/**
 * 创建一个类为该类定义三个构造函数分别执行下列操作
1、传递两个整数值并找出其中较大的一个值
2、传递三个double值并求出其乘积 
3、传递两个字符串值并检查其是否相同 
4、在main方法中测试构造函数的调用

 * @author dell
 *
 */
public class Text1 {
		public static void main(String[] args) {
			new Text(5,10);
			new Text(10.00,11.00,12.00);
			new Text("qwer","asdff");
		}
}
class Text{
	public Text(int x,int y) {
		System.out.println("两个数中的最大值为"+Math.max(x,y));
	}
	public Text(double x,double y,double z) {
		System.out.println("这三个数的乘积为:"+x*y*z);
	}
	public Text(String str,String str1) {
		if(str.equals(str1)) {
			System.out.println(str);
		}else {
			System.out.println(str1);
		}
	}
}