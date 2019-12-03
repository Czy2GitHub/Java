/**
 * 编写Java程序，接受用户输入的1~12之间的整数，
 * 不符合条件则重新输入，利用switch语句输出对应月份的天数
 * @author Administrator
 *
 */
//问题：如何重新输入？？？？？？
import java.util.*;
public class New {	
	int month;	
	void count(int n) {			//最后输出结果；
			switch(n){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: System.out.println(n+"月的天数是31天");
			break;
			case 2: System.out.println(n+"月的天数是28天");
			break;
			case 4:
			case 6:
			case 9:System.out.println(n+"月的天数是30天");
			break;
			}
			
		}
	public static void main(String[] args){
		boolean text = true;									//用于终止while循环；
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		New ad = new New();									//创建对象；
		ad.month = input.nextInt();					
		while(true) {
		if(ad.month>0&&ad.month<12) {
			break;												//结束循环
		}else {												//重新输入
			System.out.println("输入错误！请重新输入：");
			ad.month = input.nextInt();
			
		}
	}
		ad.count(ad.month); 								//执行结果
	}
	
	
	
}
