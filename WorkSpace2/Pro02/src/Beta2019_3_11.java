/**
 * ����if-else-if-else
 *
 * @author dell
 *
 */
public class Beta2019_3_11 {
	public static void main(String[] args) {
		int age = (int)(100*Math.random()+1);
		System.out.println("������:"+age+"����");
		if(age<15) {
			System.out.println("��ͯ��ϲ���棡");
		}else if(age<25) {
			System.out.println("���꣬Ҫѧϰ��");
		}else if(age<45) {
			System.out.println("���꣬Ҫ����!");
		}else if(age<65) {
			System.out.println("�����꣬Ҫ���ƣ�");
		}else if(age<85) {
			System.out.println("���꣬���˶���");
		}else {
			System.out.println("�����ǣ�����ϡ��");
		}
	}

}
