package cn.ccu;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * 测试日期类的使用
 * @author dell
 *
 */
public abstract class TestCanlendar {
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar(2999,10,9,22,10,50);	//参数依次为年,月,日,时,分,秒		//Calendar类提供详尽的日期时间精确到秒
		System.out.println(calendar);			//打印calendar的所有成员
	int year = calendar.get(Calendar.YEAR);		//获取年的信息
	int month =	calendar.get(Calendar.MONTH);
	int weekday = calendar.get(Calendar.DAY_OF_WEEK);//星期几。1-7. 1：星期日 ，2：星期一 ，以此类推
	int day = calendar.get(Calendar.DATE);
	System.out.println(year);
	//0-11表示对应的月份。0是1月，1是2月，以此类推
	System.out.println(month);
	System.out.println(day);
	
	//设置日期的相关元素
	Calendar c2 = new GregorianCalendar();		//如果不设置参数，则所得时间为程序运行时的时间
	c2.set(Calendar.YEAR, 8012);				//设置年，将年变为8012年
	
	System.out.println(c2);
	
	//日期的计算
	Calendar c3 = new GregorianCalendar();
	c3.add(Calendar.YEAR,-100);					//往前一百年，时光倒流就取负值
	c3.add(Calendar.DATE, 100);					//往后一百天的计算
	System.out.println(c3);
	
	
	
	//日期对象和时间对象的转化
	Date d4 = c3.getTime();
	Calendar c4 = new GregorianCalendar();
	c4.setTime(new Date());
	printCalendar(c4);
 	}
	public static void printCalendar(Calendar c) {
		//模板:打印：1918年10月10日 11：23：45 周三
		int year  = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DAY_OF_MONTH);
		int dayweek = c.get(Calendar.DAY_OF_WEEK)-1;
		//用dayweek2来输出周日，用0-6六个数字来代表周一到周六
		String dayweek2 = dayweek == 0 ?"日":dayweek+"";
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println(year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+second+"秒"+"	周"+dayweek2);
	}
	
}

