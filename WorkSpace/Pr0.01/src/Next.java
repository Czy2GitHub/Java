/**
 *利用嵌套进行九九乘法表
 * @author dell
 *
 */
public class Next {
	public static void main(String[] args) {
		for(int i = 1;i<=9;i++) {
			for(int j = 1;j<=i;j++) {
				int k = i*j;
				System.out.print(j+"*"+i+"="+k+"\t");
			}
			System.out.println();
		}
			
	}

}
