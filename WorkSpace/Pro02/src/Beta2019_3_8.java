/**
 * 测试	转义字符；
 * @author dell
 *
 */
public class Beta2019_3_8 {

	public static void main(String[] args) {
	char a = 'T';
	char c = '宇';
			//转义字符；
	System.out.println(""+'a'+'c');		//结果为ac；
	System.out.println('a'+'c');		//结果为196；char类遇到“+”会自动把其他字符转换成数字运算；
	System.out.println(""+'a'+'\''+'c');	//结果为a'c;
	System.out.println(""+'a'+'\t'+'c');	//结果为a	c；
	System.out.println(""+'a'+'\\'+'c');		//结果为a\c;
	}
}
