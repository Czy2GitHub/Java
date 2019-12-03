/**
 * 编程实现判断学生成绩是否通过考试（成绩>=60），并打印输出判断结果。
 */
package Week_3rd;
import java.util.*;
public class Text6 {
		public static void main(String[] args) {
			Scanner flag = new Scanner(System.in);
			System.out.println("请输入需要判断是否及格的学生的成绩；");
			int chengji = flag.nextInt();
			if(chengji >= 60) {
				System.out.println("该同学成功通过考试！");
			}else if(chengji <60) {
				System.out.println("该同学挂科了！");
			}
		}
}
