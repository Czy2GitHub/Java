package Week_4th;


	import java.util.Arrays;
	import java.util.Scanner;
	/**
	 * ��дһ����Ч���㷨���ж�M*N�����У��Ƿ����һ��Ŀ��ֵ
	 * �þ��������������
	 * ÿ���е����������Ұ���������
	 * ÿ�еĵ�һ����������ǰһ�е����һ������
	 * @author Administrator
	 *
	 */
	public class Text2_5{	
	public static void main(String[] args) {
			Scanner sc1 = new Scanner(System.in);
			int M = 3;
			int N = 2;
			int k = 0;		//������
			int temp;
			int [] []a = new int[M][N];
			int target = sc1.nextInt();
			for(int i =0 ;i <a.length;i++){		//��������
				for(int j = 0;j < N;j++){
				a[i][j] = sc1.nextInt();
				}
			}
		//��������	
			for(int i =0 ;i <a.length;i++){						//���ıȽ϶���
				for(int j = 0;j < N;j++){						//���ıȽ̶���
					for(int n = 0 ;n < a.length;n++){			//������	
						for(int m = 0;m < N;m++){				//������
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
