/**
 * 测试算术运算符；
 * 测试逻辑运算符；
 * 测试位运算；
 * 字符串运算符；
 * 条件运算符；
 * 测试类型转换常见问题；
 * @author dell
 *
 */
public class Beta2019_3_9 {
	public static void main(String[] args) {
		System.out.println(-9%5);	//结果为-4；
		int a = 3;
		int b = a++;	//执行完后，b=3，先给b赋值，再自增；
		System.out.println("a="+a+"\nb="+b);
	boolean b1 = true;
	boolean b2 = false;
	System.out.println(b1&b2);	//结果为false；
	System.out.println(b1|b2);	//结果为true;
	System.out.println(b1^b2);	//结果为true；
	System.out.println(!b2);	//结果为true；
	//短路
	// int c = 3/0；
	boolean b3 = 1>2&&2<(3/0);	//短路与，第一个操作数的值为false，则不需要计算后面的操作数
	System.out.println(b3);
	//移位
	System.out.println(12<<2); 		//向左移两位，相当于12*4；结果为48；
	System.out.println(12>>2);		//向右移两位，相当于12/4，结果为3；	
	//字符串
	String n = "3";
	int m = 4;
	int x = 5;
	char z = 'a';
	System.out.println(n+m+x);		//结果为345；
	System.out.println(m+x+n);		//结果为93；
	System.out.println(z+4);		//特殊，a的Ascli码为97，与4相加为101；
	//条件运算符
	int score = 80;
	int l = -100;
	String type = score<60?"不及格":"及格";
	System.out.println(type);
	if(score<60) {
		System.out.println("不及格");
	}else{
		System.out.println("及格");
	}
	System.out.println(l>0?1:(x==0?0:-1));	//结果为-1；

	
	//类型转换常见问题
	int money = 1000000000;	//十亿；
	int years = 20;
	//返回的total是负数，超过了int的范围；
	int total = money*years;
	System.out.println("total="+total);
	//返回的total仍是负数，默认是int，因此结果会转成int值，再转成long，但是已经发生了数据丢失；
	long total1 = money*years;
	System.out.println("total1="+total1);
	//返回的total2正确先将一个因子变成long，整个表达式发生提升，全部用long来计算
	long total2 = money*((long)years);
	System.out.println("total2="+total2);
	
	
	//命名问题
	int I = 2;		//分不清L还是1；
	long k = 23451l;		//建议使用大写L			
	System.out.println(I+1);
	}	
	
}
