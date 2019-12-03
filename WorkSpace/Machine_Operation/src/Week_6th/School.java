package Week_6th;
/**[leetcode547]班上有 N 名学生。其中有些人是朋友，有些则不是。他们的友谊具有是传递性。如果已知 A 是 B 的朋友，B 是 C 的朋友，那么我们可以认为 A 也是 C 的朋友。所谓的朋友圈，是指所有朋友的集合。
给定一个 N * N 的矩阵 M，表示班级中学生之间的朋友关系。
如果M[i][j] = 1，表示已知第 i 个和 j 个学生互为朋友关系，否则为不知道。
你必须输出所有学生中的已知的朋友圈总数。
*/
import java.util.Scanner;
    public class School {
	    		public static int findCircleNum(int[][] M) {
	    	        int n = M.length;
	    	        int[] arr = new int[n + 1];			
	    	        int res = n;
	    	        for(int i = 1; i <= n; i++){		//为arr[]赋值
	    	            arr[i] = i;						
	    	        }
	    	        for(int i = 0; i < n; i++){			//
	    	            for(int j = 0; j < i; j++){
	    	                if(M[i][j] == 1){
	    	                    int xF = find(arr, i + 1);
	    	                    int yF = find(arr, j + 1);
	    	                    if(xF != yF){
	    	                        arr[xF] = yF;
	    	                        res--;
	    	                    }
	    	                }
	    	            }
	    	        }
	    	        return res;
	    	    } 
	    	    
	    	    public static int find(int[] arr, int n){
	    	        int res = n;
	    	        while(res != arr[res]){			
	    	            res = arr[res];
	    	        }
	    	        int temp;				
	    	        while(n != res){						
	    	            temp = arr[n];
	    	            arr[n] = res;
	    	            n = temp;
	    	        }
	    	        return res;
	    	    }
	    	public static void main(String[]args){
	    		Scanner input=new Scanner(System.in);
	    		System.out.println("请输入学生个数");
	    		int n=input.nextInt();
	    		int m[][]=new int[n][n];
	    		for(int i=0;i<n;i++)
	    			for(int j=0;j<n;j++)
	    			m[i][j]=input.nextInt();
	    		System.out.println(findCircleNum(m));
	    	}
	    	}
