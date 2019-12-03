/**
 * 测试Break、double：
 * @author dell
 *
 */
public class Break_Continue {
	public static void main(String[] args) {
			int total = 0;	//计数器控制换行；
		for(int i =100;i>=100&&i<=150;i++ ) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.print(i+"、");
			total++;
			if(total % 5 ==0) {
				System.out.println();
				total = 0;		//重置计数器；
			}
		}
	}

}
