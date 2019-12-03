package Week_7th;
/**
 * 编写重载方法，分别实现输出字符串，字符串数组，整型数据和整形数组。
 * @author dell
 *
 */
public class Text2 {
		public static void print(String a) {
			System.out.println(a);
		}
		public static void print(String []a) {
			int i = 0;
			while(i <2) {
				System.out.println(a[i]);
				i++;
			}
		}
		public static void print(int a) {
			System.out.println(a);
		}
		public static void print(int []a) {
			int i = 0;
			while(i <5) {
				System.out.println(a[i]);
				i++;
			}
		}
		public static void main(String[] args) {
			String []a = {"addesq","dead"};
			int []a1 = new int[5]; 
			print("asdfg");
			print(a);
			print(3);
			print(a1);
		}
}
