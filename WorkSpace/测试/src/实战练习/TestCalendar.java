package 实战练习;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 可视化日历程序
 * @author dell
 *
 */
public class TestCalendar {
	public static void main(String[] args) throws ParseException {
		String str = "2020-9-10";					//字符串充当日期
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");		//规定日期格式
		Date date = df.parse(str);			//由给定字符串文本生成日期
		Calendar c = new GregorianCalendar();		//创建Calendar对象
		c.setTime(date);							//设置所需日期
		System.out.println("日\t一\t二\t三\t四\t五\t六");	//打印日历的星期部分
		c.set(Calendar.DAY_OF_MONTH, 1);					//设置当前为本月的第一天
		for(int i =0;i<c.get(Calendar.DAY_OF_WEEK)-1;i++) {	//循环，c.get(Calendar.DAY_OF_WEEK)为计算今天是周几，根据计算结果来控制缩进
			System.out.print("\t");
		}
		int days = c.getActualMaximum(Calendar.DATE);
		//打印日历主干
		for(int i = 1 ; i<=days;i++) {	//c.getActualMaximun(Calendar.DATE)为获取本月最大的天数，控制循环次数
		System.out.print(c.get(Calendar.DAY_OF_MONTH)+"\t");			//打印当前月份的第几天
		if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {							//判断今天是周几，若为周六则换行
			System.out.println();						
		}		
		c.add(Calendar.DAY_OF_MONTH,1);									//在本月的日期上面加一
		}
	}
	
	
}
