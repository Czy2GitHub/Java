package cn.ccu;
import java.util.Scanner;

public class Main {
	private static String string;

	public static void main(String[] args) {
		int sum = 0;
		boolean r = false;
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();// ����Ҫ��֤���֤�ŵĸ���
		String f = scanner.nextLine();// �洢Enterֵ
		String[] string = new String[number];
		int[] array = new int[number];
		int[] arr = new int[number];

		for (int i = 0; i < number; i++) {// �������֤��
			string[i] = scanner.nextLine();
		}
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < 17; j++) {
				if (String.valueOf(string[i].charAt(j)).equals("X")) {
					r = true;
					System.out.println(11111);
				}
				else {
					try {
					int s1 = Integer.parseInt(String.valueOf(string[i].charAt(0))) * 7;
					int s2 = Integer.parseInt(String.valueOf(string[i].charAt(1))) * 9;
					int s3 = Integer.parseInt(String.valueOf(string[i].charAt(2))) * 10;
					int s4 = Integer.parseInt(String.valueOf(string[i].charAt(3))) * 5;
					int s5 = Integer.parseInt(String.valueOf(string[i].charAt(4))) * 8;
					int s6 = Integer.parseInt(String.valueOf(string[i].charAt(5))) * 4;
					int s7 = Integer.parseInt(String.valueOf(string[i].charAt(6))) * 2;
					int s8 = Integer.parseInt(String.valueOf(string[i].charAt(7))) * 1;
					int s9 = Integer.parseInt(String.valueOf(string[i].charAt(8))) * 6;
					int s10 = Integer.parseInt(String.valueOf(string[i].charAt(9))) * 3;
					int s11 = Integer.parseInt(String.valueOf(string[i].charAt(10))) * 7;
					int s12 = Integer.parseInt(String.valueOf(string[i].charAt(11))) * 9;
					int s13 = Integer.parseInt(String.valueOf(string[i].charAt(12))) * 10;
					int s14 = Integer.parseInt(String.valueOf(string[i].charAt(13))) * 5;
					int s15 = Integer.parseInt(String.valueOf(string[i].charAt(14))) * 8;
					int s16 = Integer.parseInt(String.valueOf(string[i].charAt(15))) * 4;
					int s17 = Integer.parseInt(String.valueOf(string[i].charAt(16))) * 2;
					array[i] = s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + s12 + s13 + s14 + s15 + s16+ s17;
					}catch(Exception e){
						System.out.println(e.getMessage());
					}

				}
			}
				
				r = false;
		}

		for (int i = 0; i < number; i++) {
			if ((array[i] % 11 == 0 && String.valueOf(string[i].charAt(17)).equals("1"))
					|| (array[i] % 11 == 1 && String.valueOf(string[i].charAt(17)).equals("0"))
					|| (array[i] % 11 == 2 && String.valueOf(string[i].charAt(17)).equals("X"))
					|| (array[i] % 11 == 3 && String.valueOf(string[i].charAt(17)).equals("9"))
					|| (array[i] % 11 == 4 && String.valueOf(string[i].charAt(17)).equals("8"))
					|| (array[i] % 11 == 5 && String.valueOf(string[i].charAt(17)).equals("7"))
					|| (array[i] % 11 == 6 && String.valueOf(string[i].charAt(17)).equals("6"))
					|| (array[i] % 11 == 7 && String.valueOf(string[i].charAt(17)).equals("5"))
					|| (array[i] % 11 == 8 && String.valueOf(string[i].charAt(17)).equals("4"))
					|| (array[i] % 11 == 9 && String.valueOf(string[i].charAt(17)).equals("3"))
					|| (array[i] % 11 == 10 && String.valueOf(string[i].charAt(17)).equals("2"))) {
				sum++;
			} else {
				System.out.println(string[i]);
			}
		}
		if (sum == number) {
			System.out.println("All passed");
		}
	}
}