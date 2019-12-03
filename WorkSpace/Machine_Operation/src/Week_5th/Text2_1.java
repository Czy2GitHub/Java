package Week_5th;
/**
 * .有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？请输出数量和每一种的情况
 * @author dell
 *
 */
public class Text2_1 {
	public static void main(String[] args) {
		int score = 0;
		int num = 0;
		for(int i = 1 ;i <= 4 ;i++) {			//
			for(int j = 1 ;j <=4 ; j++) {
				for(int k = 1; k <=4 ; k++) {
					if(i != k&&i != j&& k != j) {
				num = i*100+j*10+k;
						System.out.println(num);
						score++;
					}
				}
			}
		}
	System.out.println("共有"+score+"种情况");
	}
}
