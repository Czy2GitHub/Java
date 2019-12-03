package Week_11th;
import java.util.Scanner;
/**
 * 回旋镖定义为一组三个点，这些点各不相同且不在一条直线上。
给出平面上三个点组成的列表，判断这些点是否可以构成回旋镖。
 * @author dell
 *
 */
public class Test2_3 {
	public static void main(String[] args) {
		boolean bo = true;
		int [][] a = new int[3][2];
			Scanner sc1 = new Scanner(System.in);
			for(int i = 0 ; i <a.length;i++) {
				for(int j = 0 ;j < 2;j++) {
					a[i][j] = sc1.nextInt();
				}
			}
			for(int i = 0 ; i <a.length;i++) {
				for(int j = 0 ;j < 2;j++) {
					for(int p = 0; p <a.length;p++) {
						for(int k = 0;k <2 ;k++) {
							if(a[i][j] == a[p][k]) {
								bo = false;
							}
						}
					}
				}
				}
			System.out.println(bo);	
	}	
	}
