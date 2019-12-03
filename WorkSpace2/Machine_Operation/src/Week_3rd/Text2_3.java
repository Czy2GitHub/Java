/**
 * 编写程序实现：依次输出 26 个字母，即 A~Z。
 */
package Week_3rd;

public class Text2_3 {
	public static void main(String[] args) {
		int score= 0;		//计数器
		for(int i = 0;i<26;i++) {
			System.out.print(((char)(65+i))+"\t");
			score++;
			if(score == 5) {
			System.out.println();
			score = 0;
			}
		}
		
	}
	
}
