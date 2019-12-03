package cn.ccu;
import java.util.Scanner;
/**
 * 1．	实现从键盘输入十个成绩，并对成绩完成相应等级转换，并输出成绩及对应等级。应考虑数据的合理性问题。
 * @author dell
 *
 */
public class Text2 {
		public static void main(String[] args) {
			int []a = new int[10];
			inputAndChange(a);
			
		}
		public static void  inputAndChange(int []a) {				//完成程序的输入
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			for(int i = 0;i <a.length;i++) {
			a[i] = sc1.nextInt();
				choose(a[i]);
				if(a[i]<0||a[i]>100) {
				System.out.println("输入错误请重新输入!");
				a[i] = sc2.nextInt();
				choose(a[i]);
			}
			}
		}
		public static void choose(int a) {
			if(a >=90&&a <= 100) {
				System.out.println(a+"的等级为"+"A");
			}
			if(a>=80&&a<90) {
				System.out.println(a+"的等级为B");
			}
			if(a>=60&&a<80) {
				System.out.println(a+"的等级为C");
			}
			if(a<60&&a>=0) {
				System.out.println(a+"的等级为D");
			}
		}
}
