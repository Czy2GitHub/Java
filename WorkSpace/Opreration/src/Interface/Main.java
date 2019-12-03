package Interface;

public class Main {
	public void print(Interduceable com,Interduceable tea , Interduceable stu) {
		com.showDetail();
		tea.showDetail();
		stu.showDetail();
	}
	public static void main(String[] args) {
		Main ma = new Main();
		ma.print(new ComputerCenter(),new Teacher(),new Students());
	}
}
