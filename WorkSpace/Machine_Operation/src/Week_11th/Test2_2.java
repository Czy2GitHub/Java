package Week_11th;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 对于表达式n^2+n+41，当n在（x,y）范围内取整数值时（包括x,y）(-39<=x<y<=50)，判定该表达式的值是否都为素数。
 * @author dell
 *
 */
public class Test2_2 {
	static int count = 0;
		public static void main(String[] args) {
			boolean bo = true;
			Scanner sc1 = new Scanner(System.in);
			List ni = new ArrayList();
			while(true) {
				int n = sc1.nextInt();
				int j = sc1.nextInt();
				ni.add(n);
				ni.add(j);
				if(n == 0 && j == 0) {
					break;
				}
			}
			for(int i = 0 ;i < ni.size();i++) {
				jisuan((int)ni.get(i)*(int)ni.get(i)+(int)ni.get(i)+41);			//判断素数
			}
			if(count > 0) {
				bo = false;
			}
			if(bo) {
				System.out.println("OK");
			}else {
				System.out.println("Sorry");
			}
		}
		public static void jisuan(int i) {
			for(int j = 2; j < i;j++) {
				if(i % j ==0) {
					count++;
				}
			}
		}
}
