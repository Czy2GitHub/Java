package Beta2;
/**
 * 测试重写objetc类中的，equals类；
 * @author dell
 *
 */
public class Beta2019_3_22 {
	public static void main(String[] args) {
	Object obj;
	String str;
	
	User u1 = new User(77777,"宇哥",77777);
	User u2 = new User(77777,"宇哥",66666);
	System.out.println(u1 == u2);
	System.out.println(u1.equals(u2));
}
}
class User{
	int id;
	String name;
	int  pwd;
	public User(int id, String name, int  pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}
}