package Week_5th;

import java.util.Scanner;

/**
 * .	在柠檬水摊上，每一杯柠檬水的售价为 5 美元。
	顾客排队购买你的产品，（按账单 bills 支付的顺序）一次购买一杯。
	每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 5 美元。
	注意，一开始你手头没有任何零钱。
	如果你能给每位顾客正确找零，返回 true ，否则返回 false 。
	示例 1：
	输入：[5,5,5,10,20]
	输出：true
	解释：
	前 3 位顾客那里，我们按顺序收取 3 张 5 美元的钞票。
	第 4 位顾客那里，我们收取一张 10 美元的钞票，并返还 5 美元。
	第 5 位顾客那里，我们找还一张 10 美元的钞票和一张 5 美元的钞票。
	由于所有客户都得到了正确的找零，所以我们输出 true。
 * @author dell
 *
 */
public class Text2_3 {
	public static void main(String[] args) {
		int [] a = new int[input()];
		
	}
	public static int input() {							//确定数组个数
		Scanner sc1 = new Scanner(System.in);
		System.out.println("请输入排队购买的人数:");
		int people = sc1.nextInt();
		return people;
	}
	public static void input(int people,int []a) {		//初始化数组
		Scanner sc2 = new Scanner(System.in);
		System.out.println("请输入人们支付的金额:");
		for(int i = 0 ; i < a.length ; i++) {
			a[i] = sc2.nextInt();
		}
	}
}