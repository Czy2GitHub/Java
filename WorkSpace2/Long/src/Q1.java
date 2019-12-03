import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("学生成绩为：");
		int []a=new int [30];
		int sum=0;
		int num=0;
		double ave=0;
		Random q=new Random();
		for(int i=0;i<30;i++) {
			a[i]=q.nextInt(100);
			System.out.print(a[i]+"\t");
			sum=sum+a[i];
			num++;
			if(num==6) {
			System.out.println();
			num=0;
			}
		}
		ave=(double)(sum/30);
		System.out.println("学生平均成绩为："+ave);
	}

}
