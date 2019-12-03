package Beta3;
/**
 * ≤‚ ‘for-each”√∑®
 * @author dell
 *
 */
public class Beta2019_3_23_9 {
	public static void main(String[] args) {
		User [] u1 = new User[3];
		for(int i = 0;i < u1.length ; i++) {
			u1[i] = new User("77",i);
		}
		for(User m : u1) {
			System.out.println(m.getAge());
		}
	}
}
class User{
	private String name;
	private int age;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}