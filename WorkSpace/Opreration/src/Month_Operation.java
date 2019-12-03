/**
 * 二维数组输出
 * 
 * @author dell
 *
 */
public class Month_Operation {
	public static void main(String[] args) {
		char [] []nums = new  char[18][18];
		for(int i = 0; i < nums.length;i+=2) {
			if(i<=9) {
			for(int j =0; j <=i ;j++) {
				nums[i][j] ='*';
			}
		}
		if(i>9) {
			for(int k = 0;k < nums.length-i-1;k++) {
				nums[i][k] = '*';
			}
		}
		}
		for(int p = 0;p <nums.length;p++) {
			for(int n = 0;n <=p;n++) {
				System.out.print(nums[p][n]);
			}
			System.out.println();
		}
	}
}
