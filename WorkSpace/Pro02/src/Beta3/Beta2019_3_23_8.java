package Beta3;
/**
 * 测试自定义数组;
 * @author dell
 *
 */
public class Beta2019_3_23_8 {
	public static void main(String[] args) {
		Person [] arr01 = new Person[3];
		 arr01[0] = new Person(7777,"7酱") ;
		 arr01[1] = new Person(777,"4396");
		 arr01[2] = new Person(77777,"世界聚焦于你");
		 for(int i = 0 ; i < arr01.length; i++) {
			 System.out.println(arr01[i].getName());
		 }
	}
}
class Person{
	private int id;
	private String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}