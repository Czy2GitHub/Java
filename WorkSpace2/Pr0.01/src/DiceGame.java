
public class DiceGame {
		public static void main(String[] args) {
			double d = Math.random();
			System.out.println(d);	//返回{0，1）随机数；
			System.out.println((int)(6*Math.random())+1);
			int i = (int)(6*Math.random()+1);
			if(i>3) {
				System.out.println("大####"+i);
				
			}
		System.out.println("########################################");
		//通过掷三次骰子看看今天的手气；
		int a = (int)(6*Math.random())+1;
		int b = (int)(6*Math.random())+1;
		int c = (int)(6*Math.random())+1;
		int count = a+b+c;
		System.out.println(count);
		if(count>15) {
			System.out.println("手气不错");
		}
		if(count<=15&&count>=10) {
			System.out.println("手气一般");
		}
		if(count<10) {
			System.out.println("手气不怎么样");
		}
		
		
		}

	}

