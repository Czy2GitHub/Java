package Week_10th;
public class Test1_1{
	public static void main(String[] args) {
		ClassA A = new ClassA();
		ClassB B = new ClassB();
		System.out.println(A.method(4));
		System.out.println(B.method(4));
	}
}
 class ClassA  implements InterfaceA{
	public int method(int n) {
		int sum = 0;
		for(int i = 1;i <= n;i++) {
			sum = sum + i;
		}
		return sum;
	}
		
}
class ClassB implements InterfaceA{
	int factorial = 1;
	public int method(int n) {
		if(n == 1) {
		return factorial;
	}
		factorial = factorial * method(n-1);
	return n;
}
}
interface InterfaceA {
	int method(int n);
}
