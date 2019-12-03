/**
 * 编程实现高空坠球问题。
皮球从某给定高度自由落下，触地后反弹到原高度的一半，再落下，再反弹，……，如此反复。
问皮球在第nn次落地时，在空中一共经过多少距离？
第nn次反弹的高度是多少？
输入格式:
输入在一行中给出两个非负整数，分别是皮球的初始高度和nn，均在长整型范围内。
输出格式:
在一行中顺序输出皮球第nn次落地时在空中经过的距离、以及第nn次反弹的高度，其间以一个空格分隔，保留一位小数。题目保证计算结果不超过双精度范围。
输入样例:
33 5
输出样例:
94.9 1.0


 */
package Week_3rd;
import java.util.*;
public class Text2_7 {
	public static void main(String[] args) {
		Scanner flag = new Scanner(System.in);
		System.out.println("请输入皮球的初始高度和落地反弹次数:");
		double sum = 0;
		 double height = flag.nextDouble();  	//皮球初始高度
		 double nn = flag.nextDouble();	        //第nn次
		 for(int i = 1;i <= nn; i++) {
	    	 if(i == 1) {
	    		 sum = height;
	    		 height = height/2;
	    	 }else  {
	    		 sum = sum + height*2;
	    		 height = height/2;
	    	
	     }
		 }
	    System.out.printf("%.1f %.1f",sum,height);
	}
}
