
public class DiceGame {
		public static void main(String[] args) {
			double d = Math.random();
			System.out.println(d);	//����{0��1���������
			System.out.println((int)(6*Math.random())+1);
			int i = (int)(6*Math.random()+1);
			if(i>3) {
				System.out.println("��####"+i);
				
			}
		System.out.println("########################################");
		//ͨ�����������ӿ��������������
		int a = (int)(6*Math.random())+1;
		int b = (int)(6*Math.random())+1;
		int c = (int)(6*Math.random())+1;
		int count = a+b+c;
		System.out.println(count);
		if(count>15) {
			System.out.println("��������");
		}
		if(count<=15&&count>=10) {
			System.out.println("����һ��");
		}
		if(count<10) {
			System.out.println("��������ô��");
		}
		
		
		}

	}

