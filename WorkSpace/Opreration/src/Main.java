
public class Main {
	public static void main(String[] args) {
		Student stu1 = new Student("�ź�",10,1,"����");
		Teacher tea = new Teacher("����ʦ","�����","ʹ��Java�����������߼�",5);
		System.out.println(stu1.getName()+"\n"+"����:"+stu1.getAge()+"\n�Ͷ���:"+stu1.getClass1()+"\n����:"+stu1.getLikes());
		System.out.println(tea.getName()+"\nרҵ����:"+tea.getProfession()+"\n���ڿγ�:"+tea.getKecheng()+"\n����:"+tea.getJiaoling());
	}
}
