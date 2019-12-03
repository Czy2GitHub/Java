package Interface;

public class Type {
	public void type(Students stu) {
	System.out.print("打印!");
	 stu.showDetail();
	}
	public void type(Teacher tea) {
		System.out.println("打印!");
		tea.showDetail();
	}
}
