package cn.ccu;
/**
 * 测试可变字符序列和不可变字符序列的使用陷阱
 * @author dell
 *
 */
public class TestStringBuilder3 {
		public static void main(String[] args) {
		/*使用String进行字符串的拼接*/
			String str = "";
			for(int i = 0 ; i < 5000 ;i++) {
				str = str + i;//相当于产生了10000个对象
			}
			StringBuilder sb = new StringBuilder("");
			for(int i = 0; i < 5000 ; i++) {
				sb.append(i);
			}
			
}
}
