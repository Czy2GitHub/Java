package Beta2;
/**
 * 测试static;
 * @author dell
 *
 */
public class Beta2019_3_16_2{
	int id;	//姓名；
	String name;	//账户名
	String puw;		//密码
	
	static String company = "长春大学";	//学校名称；
	public Beta2019_3_16_2(int id,String name) {
		this.id = id;
		this.name = name;
	}
	public void login() {
		printCompany();
		System.out.println(company);
		System.out.println("登陆"+ name);
	}
	public static void printCompany() {
		//login();调用非静态成员，编译就会报错
		System.out.println(company);
	}
	public static void main(String[] args) {
		Beta2019_3_16_2 u = new Beta2019_3_16_2(777,"宇哥");
		Beta2019_3_16_2.printCompany();
		Beta2019_3_16_2.company = "长春地头龙";
		Beta2019_3_16_2.printCompany();
	}
}

