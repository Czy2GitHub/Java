package cn.ccu;
/**
 * �ӿڻ�ʹ������ӹ淶�Ұ�ȫ��ʹ��interface����ӿ�,ʹ��implements��ʵ�ֽӿ��еķ���
 * �ڽӿ��У����з���Ϊ���󷽷������ж��������Ϊ����
 * @author dell
 *
 */
public class TextInterFace1 implements Text1 {			//����һ������ʵ�ֽӿ�
	public static void main(String[] args) {
		TextInterFace1 ti = new TextInterFace1();
		ti.run1();
		ti.run();
	}			
	@Override
	public void run() {						
		// TODO Auto-generated method stub
		System.out.println("11");
	}

	@Override
	public void run1() {
		// TODO Auto-generated method stub
		System.out.println("11");
	}

	@Override
	public void run2() {
		// TODO Auto-generated method stub
		System.out.println("11");
	}
				
}
