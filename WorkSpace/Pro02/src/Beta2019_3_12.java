/**
 * 测试switch
 * @author dell
 *	多值判断时候使用switch
 */
public class Beta2019_3_12 {
	public static void main(String[] args) {
		char c = 'a';
		int rand = (int)(26*Math.random());
		char c2  = (char)(c+rand);
		System.out.println(c2+";");
		switch(c2) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println("元音");
		break;
		default:System.out.println("不是元音字母!");
		break;
		}
	}

}
