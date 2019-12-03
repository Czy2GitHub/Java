package ssas;
import java.util.*;
public class Text {
	public static void main(String[] args) {
		int count = 0;				//用来将有效值存入数组
		int []a = new int[7];	
		System.out.println("中奖数字为:");
		boolean flag = true;				//用来判断是否为有效值
		for(int i= 0;i <7;i++) {			//，初始化，生成7个随机数，不全是有效值
			a[i] = (int)(Math.random()*30+1);
		}
		
		//循环将有效值存入数组
		while(count<a.length) {				  //判断这7个数是否有重复的，并重新输入
			//创造一个新的随机数，将此随机数与数组中原元素对比，若无相同的情况，则为有效值
			int rdm = (int)(Math.random()*30+1);		
			for(int k = 0;k <a.length;k++) {		//比较
			if(rdm == a[k]) {
				flag = false;						//若重复，则flag变为false，判断为无效值
				break;
			}
			}
			if(flag) {								//如果flag为true，则视为此次循环rdm为有效值。存入数组；
				a[count] = rdm;
				System.out.print(rdm+" ");
				count++;
			}
		}
		int score = 0;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("请输入7个数:");
		int []b = new int[7];
		for(int h = 0 ; h <7;h++) {
			b[h] = sc1.nextInt();
		}
		
		//将输入的数与数组中的数进行对比
		for(int q = 0; q < 7 ;q++) {
				if(b[q] == a[q]) {
					score++;
				}
	
}
		switch(score) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("很遗憾没有中奖!");
			break;
		case 5:
			System.out.println("恭喜获得三等奖!");
			break;
		case 6:
			System.out.println("恭喜获得二等奖!");
			break;
		case 7:
			System.out.println("恭喜获得一等奖!");
		}
}
}
