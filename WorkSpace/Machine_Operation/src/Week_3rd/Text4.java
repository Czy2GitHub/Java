/**
 * 编写计算银行本息程序，利率定义如下：
public class InterestComp {
	  public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  System.out.println("请输入本金：");
		     double pri_amt=Double.parseDouble(input.next());
 //本金 
		  double tot_amt=0;//本息总额
		  double rate1y = 2.25/100; //存期1年利率
		  double rate2y = 2.7/100;//存期2年利率
		  double rate3y = 3.24/100;//存期3年利率
		  double rate5y = 3.6/100;//存期5年利率
		  double interest;//利息
			..........;
			}
 */
package Week_3rd;
import java.util.*;
public class Text4 {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  System.out.println("请输入存款年数:");
		  double n = input.nextDouble();
		  System.out.println("请输入本金：");
		     double pri_amt=Double.parseDouble(input.next());	 		//本金 
		  double tot_amt=0;//本息总额
		  double rate1y = 2.25/100; //存期1年利率
		  double rate2y = 2.7/100;//存期2年利率
		  double rate3y = 3.24/100;//存期3年利率
		  double rate5y = 3.6/100;//存期5年利率
		  double interest;//利息
		  if(n<=1) {
		  tot_amt = pri_amt*(rate1y+1);
		  }else if(n <= 2) {
		  tot_amt = pri_amt*(rate2y+1);
		  }else if(n <= 3) {
		  tot_amt = pri_amt*(rate3y+1);
		  }else if(n<=4) {
			  tot_amt = pri_amt*(rate1y+1);
		  }else {
			  tot_amt = pri_amt*(rate5y+1);
		  }
		  System.out.println("所得到的本息是:"+tot_amt);
	}
}