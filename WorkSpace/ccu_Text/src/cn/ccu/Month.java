package cn.ccu;
import java.util.Scanner;
/**
 * 编写Java程序,接受用户输入的年份及1~12之间的整数,若不符合条件,则重新输入,利用switch语句办出对应月份天数,请考虑闰年问题。
 * @author dell
 *闰年：能被4整除但不能被100整除的年份为普通闰年.
 *每个月的天数:1,3,5,7,8,10,12 这几月永远31天。2月平年28天，闰年（一般年份能整除4或百年年份能整除400的是闰年，）29天，其他月份30天。
 */
public class Month {
		public static int inputYear() {
			System.out.println("请输入年份:");
			Scanner sc1 = new Scanner(System.in);
			int i = sc1.nextInt();
			return i;
		}
		public static int inputMonth() {
			System.out.println("请输入月份:");
			Scanner sc2 = new Scanner(System.in);
			int i = sc2.nextInt();
			if(i < 1&& i > 12) {
				System.out.println("输入错误！");
				i = 1;
			}
			return i;
		}
		public static void choose(int i,int j) {
			switch(i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			{
				System.out.println("该月份的天数是三十一天");
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11:
			{
				System.out.println("该月份有三十天");
				break;
			}
			case 2 :
			{
				if(j % 100 != 0 && j % 4 == 0) {			//若为闰年
					System.out.println("该月份有二十九天");
					break;
				}else {
					System.out.println("该月份有二十八天");
				}
			}
		}
		}
		public static void main(String[] args) {
			choose(inputMonth(),inputYear());
		}
}
