package Week_4th;
/**
 * 1.ĳ�༶��30��ѧ���μ�Ӣ�￼�ԣ�����һά����ʵ�ְ༶ѧ��Ӣ�￼�Գɼ��Ĵ洢��ͳ����༶ƽ���֡�
 * 	Ҫ��Ӣ��ɼ�������Math���е�random()����������ɣ������ķ�ΧΪ0��100��
 * @author dell
 *
 */
public class Text {
	public static void main(String[] args) {
		int [] array = new int[30];
		arerage(array);
	}
	public static  void arerage(int [] arrays) {
		int arerage = 0;
		int sum = 0;
		for(int i = 0;i < arrays.length ;i++ ) {
			arrays[i] = (int)(Math.random()*100+1);
			sum = sum + arrays[i];
		}
		arerage = sum/arrays.length;
		System.out.println("�༶��ƽ����Ϊ:"+arerage);
}
}