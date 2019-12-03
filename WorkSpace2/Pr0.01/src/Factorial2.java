/**
 *Ñ­»·£»½×³Ë
 *
 *
 */
public class Factorial2 {
	public static void main(String[] args) {
		System.out.printf("%dµÄ½×³ËÊÇ%s",10,factorial(10));
		
	}
	static int factorial(int n) {
		int sum = 1;
		for(int i =n;i>=1;i-=2) {
			sum = i*(i-1)*sum;
		}
		return sum;
	}
}
