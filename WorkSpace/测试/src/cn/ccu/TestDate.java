package cn.ccu;

import java.util.Date;

/**
 * 测试Date类的常见用法
 * @author dell
 *
 */
public class TestDate {
public static void main(String[] args) {
	Date d = new Date();
	System.out.println(d);
	System.out.println(d.getTime());	//获得毫秒数
	Date d2 = new Date();
	System.out.println(d2.after(d));		//比较时间前后
	
}
}
