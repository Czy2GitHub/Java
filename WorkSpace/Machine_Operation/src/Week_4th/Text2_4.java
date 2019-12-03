package Week_4th;
import java.util.*;
/**
 * 给定两个整数 A 和 B，返回任意字符串 S，要求满足：
•	S 的长度为 A + B，且正好包含 A 个 'a' 字母与 B 个 'b' 字母；
•	子串 'aaa' 没有出现在 S 中；
•	子串 'bbb' 没有出现在 S 中。
示例 1：
•	输入：A = 1, B = 2
•	输出："abb"
•	解释："abb", "bab" 和 "bba" 都是正确答案。
示例 2：
输入：A = 4, B = 1
输出："aabaa"
提示：
1.	0 <= A <= 100
2.	0 <= B <= 100
3.	对于给定的 A 和 B，保证存在满足要求的 S。
 * @author dell
 *
 */
public class Text2_4 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int A;
		A = sc1.nextInt();
		int B;
		B = sc1.nextInt();
		String S;											//字符串
		char []aa = new char[A];
		for(int i = 0; i < aa.length;i++) {
			aa[i] = 'a';
		}
		char []bb = new char[B];
		for(int j = 0; j < bb.length;j++) {
			bb[j] = 'b';
	}
		StringBuilder sb = new StringBuilder();
		S = String.valueOf(aa)+String.valueOf(bb);
		System.out.println(S);
}
}
