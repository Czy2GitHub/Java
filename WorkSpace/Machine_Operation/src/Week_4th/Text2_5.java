package Week_4th;


	import java.util.Arrays;
	import java.util.Scanner;
	/**
	 * 编写一个高效的算法爱判断M*N矩阵中，是否存在一个目标值
	 * 该矩阵具有如下特性
	 * 每行中的整数从左到右按升序排列
	 * 每行的第一个整数大于前一行的最后一个整数
	 * @author Administrator
	 *
	 */
	public class Text2_5{	
	public static void main(String[] args) {
			Scanner sc1 = new Scanner(System.in);
			int M = 3;
			int N = 2;
			int k = 0;		//计数器
			int temp;
			int [] []a = new int[M][N];
			int target = sc1.nextInt();
			for(int i =0 ;i <a.length;i++){		//输入数据
				for(int j = 0;j < N;j++){
				a[i][j] = sc1.nextInt();
				}
			}
		//数组排序	
			for(int i =0 ;i <a.length;i++){						//更改比较对象
				for(int j = 0;j < N;j++){						//更改比教对象
					for(int n = 0 ;n < a.length;n++){			//列排序	
						for(int m = 0;m < N;m++){				//行排序
							if(a[i][j] < a[n][m]){				
								temp = a[i][j];
								a[i][j] = a[n][m];
								a[n][m] =temp;
								}
						}			
					}
				}			
			}
			for(int s =0 ;s<a.length;s++){
				for(int f = 0;f<N;f++){
					System.out.print(a[s][f]);
				}
				System.out.println();
			}
			for(int i =0 ;i <a.length;i++){		
				for(int j = 0;j < 2;j++){
					if(a[i][j] == target){
						k++;
					}
				}
		}
			if(k == 0){
				System.out.println(false);
			}else if(k > 0){
				System.out.println(true);
			}
		}
	}
