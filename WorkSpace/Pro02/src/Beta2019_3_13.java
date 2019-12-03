/**_
 * 测试方法的基本使用
 * @author dell
 *
 */
public class Beta2019_3_13 {
	public static void main(String[] args) {
		//通过对象调用普通方法
		Beta2019_3_13 beta = new Beta2019_3_13();
		beta.printyg();
	    int i = beta.add(30, 40, 50)+1000;	
		System.out.println(i);
	}
void printyg() {
		System.out.println("宇哥");
	}
int add(int a,int b, int c) {
	int sum = a + b + c;
	return sum;			//return两个作用：1.结束方法的运行。2.返回值
}
}