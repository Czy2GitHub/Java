package Week_6th;
/**
 * 1.时钟
在所给的时钟程序的基础上修改。
这一周的编程题是需要你在课程所给的时钟程序的基础上修改而成。但是我们并不直接给你时钟程序的代码，请自己输入时钟程序的Display和Clock类的代码，然后来做这个题目。
我们需要给时钟程序加上一个表示秒的Display，然后为Clock增加以下public的成员函数：

 * @author dell
 *
 */
/*	 class Clock {
			//设置小时的极限值
		private Display hour=new Display(24);
		//设置分钟的极限值
		private Display minute=new Display(60);
		//设置秒的极限值
		private Display second=new Display(60);
			//闹钟构造器
		public Clock(int hour, int minute, int second) {
		this.hour.setValue(hour);
		this.minute.setValue(minute);
		this.second.setValue(second);
		}
		//初始化时间
		public void tick() {
			//判断秒是否到达极限
		second.increase();
			
		if(second.getValue()==0){
			//判断分是否到达极限
		minute.increase();;
			
		if(minute.getValue()==0){
			//判断小时是否到达极限
		hour.increase();
		}
	}
}
		// 时间走秒
		public String toString(){
				//设置格式
		String time=String.format("%02d:%02d:%02d",hour.getValue(),minute.getValue(),second.getValue());
		return time;
	}
}
		 class Display {
		private int value=0;	//用于计数
		private int limit=0;	//用于极限的判断
			//构造器初始极限
		public Display(int limit) {
		this.limit = limit;
		}
			//存储数据
		public void setValue(int value) {
		this.value = value;
		}
		//用于判断达到极限进位
		public void increase(){
		value++;
		if(value==limit){
		value=0;
	}
}
		//输出数
		public int getValue() {
		return value;
	}
}
		 //主类
		public class Main {
		public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}
}

*/