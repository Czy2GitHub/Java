package 睿智;

import java.util.Scanner;

public class Sui {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		double count = sc1.nextDouble();
		double ccu = 0;
		double count1 = count -2000;
		if(count1 < 0) {
			System.exit(0);
		}
		if(count1 > 100000) {
			ccu = (count1-100000)*0.45+20000*0.4+20000*0.35+20000*0.3+20000*0.25+15000*0.2+3000*0.15+1500*0.1+500*0.05;
		}
		if(count1 > 80000) {
			ccu = (count1-80000)*0.4+20000*0.35+20000*0.3+20000*0.25+15000*0.2+3000*0.15+1500*0.1+500*0.05;
		}
		if(count1 > 60000) {
			ccu = (count1-60000)*0.35+20000*0.3+20000*0.25+15000*0.2+3000*0.15+1500*0.1+500*0.05;
		}
		if(count1 > 40000) {
			ccu = (count1-40000)*0.3+20000*0.25+15000*0.2+3000*0.15+1500*0.1+500*0.05;
		}
		if(count1 > 20000) {
			ccu = (count1-20000)*0.25+15000*0.2+3000*0.15+1500*0.1+500*0.05;
		}
		if(count1 > 5000) {
			ccu = (count1-5000)*0.2+3000*0.15+1500*0.1+500*0.05;
		}
		if(count1 > 2000) {
			ccu = (count1-2000)*0.15+1500*0.1+500*0.05;
		}
		if(count1 > 500) {
			ccu = (count1-500)*0.1+500*0.05;
		}
		if(count1 < 500||count > 0) {
			ccu = count1*0.05;
		}
		ccu = ccu+2000;
		System.out.println("税后收入:"+ccu);
	}
}
