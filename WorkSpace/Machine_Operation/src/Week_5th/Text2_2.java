package Week_5th;
/**
 *  一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 * @author dell
 *
 */
public class Text2_2 {
		public static void main(String[] args) {
			for(double i = 0;i < Double.POSITIVE_INFINITY;i++) {
				if(Math.sqrt(i+100)-(int)Math.sqrt(i+100) == 0 &&Math.sqrt(i+100+168) -(int) Math.sqrt(i+100+168) == 0) {
					System.out.println(i);
					break;
				}
			}
			
	}
}
