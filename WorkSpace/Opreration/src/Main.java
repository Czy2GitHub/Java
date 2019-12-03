
public class Main {
	public static void main(String[] args) {
		Student stu1 = new Student("张浩",10,1,"篮球");
		Teacher tea = new Teacher("王老师","计算机","使用Java语言理解程序逻辑",5);
		System.out.println(stu1.getName()+"\n"+"年龄:"+stu1.getAge()+"\n就读于:"+stu1.getClass1()+"\n爱好:"+stu1.getLikes());
		System.out.println(tea.getName()+"\n专业方向:"+tea.getProfession()+"\n教授课程:"+tea.getKecheng()+"\n教龄:"+tea.getJiaoling());
	}
}
