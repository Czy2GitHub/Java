
public class Student {
	private String name;
	private  int age;
	private  int class1;
	private  String likes;
	public Student(String name, int age, int class1, String likes) {
		super();
		this.name = name;
		this.age = age;
		this.class1 = class1;
		this.likes = likes;
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
	public int getClass1() {
		return class1;
	}
	public void setClass1(int class1) {
		this.class1 = class1;
	}
	public String getLikes() {
		return likes;
	}
	public void setLikes(String likes) {
		this.likes = likes;
	}
	
}
