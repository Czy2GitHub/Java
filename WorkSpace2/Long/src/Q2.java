import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int[10];
		in(a);
		out(a);
	}
	public static void in(int [] arrays) {
		Scanner sco1 = new Scanner(System.in);
		for(int i = 0;i < arrays.length ; i++) {
			arrays[i] = sco1.nextInt();
		}
		System.out.println(Arrays.toString(arrays));
	}
	public static void out(int [] arrays) {
		System.out.println("该数组的逆向输出为:");
		for(int i = arrays.length-1; i >= 0;i--) {
			System.out.print(arrays[i]+" ");
		}
	}


	}


