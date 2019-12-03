import java.math.BigDecimal;
import java.math.*;
/**
 *测试专用！
 *2019/3/7  测试单行，多行，文档注释；
 * 			测试标识符使用规则规范；
 * 			测试局部，成员，静态变量；
 * 			测试常量；
 * 			测试整形变量；
 * 			测试浮点数；
 *			
 * @author dell
 *
 */
public class beta {
	/**
	 * 我是文档注释！
	 * @param args
	 */
	int  i=6;		//成员变量；
	static int j=5;		//静态变量；
	public static void main(String[] args/*参数，可以随意更换*/) {
		int $123;			//局部变量；
		int abc;
		int _hhh;
		int 测试;    //汉字可以作为标识符
		int clas; //不可与用关键字作为标识符
		final int k=13;		//用final定义的变量不可在被更改，为常量
		System.out.println("测试注释！"); //打印一行字
	    int a=15;		//十进制；
	    int b=015;		//以0开头是八进制；
	    int c=0x15;		//以0x开头是十六进制；
	    int d=0b1101;	//以0b开头是二进制；
	    long globalPopulation=740000000l;		//后面加L表示这是一个long类型的常量
	    float j=3.14F;					//3.14是一个浮点型常量，默认型为double要加F；
	    	//浮点数是不精确的，不能用于比较大小！
	    float e=0.1f;
	    double f=1.0/10;
	    System.out.println("f==e");		//结果为false
	    
	    float d1=4454545f;
	    float d2=d1+1;
	    if(d1==d2) {
	    	System.out.println("d1==d2");	//输出结果为d1==d2
	    }else {
	    	System.out.println("d1!=d2");
	    }
	}
}
