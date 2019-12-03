package cn.ccu;
/**
 * 2．	实现九九乘法表输出。
 * @author dell
 *
 */
public class Text3 {
		public static void main(String[] args) {
			int [][]a = new int[9][9];
			for(int i = 0;i <a.length;i++) {
				for(int j = 0; j <= i;j++) {
					a[i][j] = (i+1) * (j+1);
					System.out.print((i+1)+"X"+(j+1)+"="+a[i][j]+" ");
				}
				System.out.println();
			}
		}
}
