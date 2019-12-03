package 睿智;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuyCar {
		public static void main(String[] args) {
			try {
			Scanner sc1 = new Scanner(System.in);			
			List<Integer> a = new ArrayList<Integer>();		//创建集合框架
			System.out.println("请输入您的存款");			//提示
			a.add(sc1.nextInt());							//将键盘输入添加到ArrayList中
			new Count(a.get(0)).finish();					//匿名内部类调用Count类finish方法
		}catch(Exception e) {								//捕获异常
			System.out.println("输入不能为字母！");
		}
		}
}
class Count {	
	private int c;											//封装
	public Count() {										//空构造方法
		
	}
	public Count(int c) {									//有参构造方法
		this.c = c;
	}
	public void finish() {									//判断条件
	try {
		if(c > 5000000) {
			System.out.println("我要买凯迪拉克！");
		}
		if(c > 1000000) {
			System.out.println("我要买帕斯特！");
		}
		if(c > 500000) {
			System.out.println("我要买伊兰特！:");
		}
		if(c > 100000) {
			System.out.println("我要买奥托！");
		}
		if(c > 0) {
			System.out.println("存款不多,不买车了！");
		}
		if(c <= 0) {										//抛出异常
			throw new Exception();
		}
	}catch(Exception e) {									//异常处理
		System.out.println("输入不能为小于等于0的数！");
	}
	}
}