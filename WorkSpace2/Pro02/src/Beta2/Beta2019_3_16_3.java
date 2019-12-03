package Beta2;
/**
 * 测试静态初始化块；
 * @author dell
 *
 */
public class Beta2019_3_16_3 {
	int id;		//id;
	String name ; 		//账户名；
	String pwd;		//密码；
	static String company;	//学校名称；
static {				
	System.out.println("执行类的初始化工作");
	company = "长春大学";
	printCompany();
}
	public static void printCompany() {
		System.out.println(company);
}
	public static void main(String[] args) {
		Beta2019_3_16_3 i = null;
	}
					
}	
