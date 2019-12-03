package Week_6th;

import java.util.Scanner;
public class Text3{
	public static void main(String[] args) {
		int i, j, t, len, max = 1;
		int[][] d = new int[10][2];
		Scanner sc = new Scanner(System.in);
		d[0][0] = sc.nextInt();
		d[0][1] = 1;
		len = 1;
		for (i = 1; i < 10; i++) {
			t = sc.nextInt();
			for (j = 0; j < len; j++) {
				if (d[j][0] == t) {
					d[j][1]++;
					break;
				}
			}
			if (j >= len) {
				d[len][0] = t;
				d[len++][1] = 1;
			}
			if (d[j][1] > max)
				max = d[j][1];
		}
		for (i = 0; i < len; i++)
			if (d[i][1] == max)
				System.out.println("" + d[i][0] + " " + max);
		sc.close();
	}
}