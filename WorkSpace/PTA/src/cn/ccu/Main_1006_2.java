package cn.ccu;

import java.util.Scanner;

public class Main_1006_2 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int score = sc1.nextInt();
		int ge = 	score%10;
		int shi =  (score/10)%10;
		int bai = (score/100)%10;
		for(int i = 0; i < bai; i++ ) {
			System.out.print("B");
		}
		for(int i = 0; i < shi; i++ ) {
			System.out.print("S");
		}
		for(int i = 1; i <= ge; i++ ) {
			System.out.print(i);
		}
	}	
}
