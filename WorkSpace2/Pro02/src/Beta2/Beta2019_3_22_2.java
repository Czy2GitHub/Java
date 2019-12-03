package Beta2;
/**
 * ²âÊÔsuperµÄµ÷ÓÃ;
 * @author dell
 *
 */
public class Beta2019_3_22_2 {
	public static void main(String[] args) {
		ClidClass c1 = new ClidClass();
		c1.f();
	}
}
class FatherClass {
	int value;
 public	void f() {
		value = 100;
		System.out.println("FatherClass.value" + value);
		
	}
}
class ClidClass extends FatherClass{
	int value;
	public void f() {
		super.f();
		
		value = 200;
		System.out.println("ClidClass.value=" + value);
		System.out.println(super.value);
	}
}