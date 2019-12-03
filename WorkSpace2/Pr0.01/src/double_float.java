/**
 * 
 * @author dell
 *
 */
public class double_float {
	public static void main(String[] args) {
		int i = 1;
		int j = 2;
	    int	sum = 0;
	    int sum1 = 0;
		while(i <= 100) {
			i = i+2;
			sum = i + sum;
		}
		while(j<=100) {
			j = j+2;
			sum1 = j + sum1;
		}
	System.out.println(sum);
	System.out.println(sum1);
	}
}
