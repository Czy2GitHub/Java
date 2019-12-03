package Week_5th;

import java.text.DecimalFormat;

/**
 * 题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
程序分析：请抓住分子与分母的变化规律。
第一项是2/1
前面一项分子和分母相加的和，为下一项的分子
前面一项分子，为下一项的分母

 * @author dell
 *
 */
public class Text1 {
	public static void main(String[] args) {
	sum();
}
	public static void sum() {
		DecimalFormat df = new DecimalFormat("#.00");	//精确到小数点后两位
		double sum = 0;
		for(double i =  1;i <= 20;i+=2) {
			sum = sum + (i+1)/i + (2*i+1)/(i+1);
		}
		System.out.println(df.format(sum));
	}
}