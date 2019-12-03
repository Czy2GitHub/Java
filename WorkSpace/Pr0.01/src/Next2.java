/**
 * 
 * 输出一千以内的能被五整除的数
 * @author dell
 *
 */
public class Next2 {
	public static void main(String[] args) {
		int i = 1;
		int total = 0;		//计数器
		while(i<=1000) {
		if(i % 5 ==0) {
			System.out.print(i+"\t");
		}
		i++;
		total++;
		if(total % 10 == 0) {
			System.out.println();	//每两个数换行
		}
		}
		
	}
}
