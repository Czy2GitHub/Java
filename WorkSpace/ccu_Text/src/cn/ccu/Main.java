package cn.ccu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
		public static void main(String[] args) 
		{
			ArrayList<Integer> l=new ArrayList<Integer>();
			for(int i=0;i<31;i++)
			{
				l.add(i);
			}
			Collections.shuffle(l);//对容器中的数字随机排序；
			System.out.println("7个中奖数字是：  ");
			int []a=new int[7];
			for(int i=0;i<7;i++)
			{
				a[i]=l.get(i);
				System.out.print(l.get(i)+" ");
			}
			System.out.println("");
			Scanner scan=new Scanner(System.in);
			System.out.println("您所挑选的7个数字是：    ");
			int sum=0;
			for(int i=0;i<7;i++)
			{
				int in=scan.nextInt();
				for(int j=0;j<7;j++)
				{
					if(in==a[j]) sum+=1;
				}
			}
			System.out.println("总共中了"+sum+"个号");
			if(sum==7) System.out.println("恭喜您中了一等奖");
			else if(sum==6)System.out.println("恭喜您中了二等奖");
			else if(sum==5)System.out.println("恭喜您中了三等奖");
		}
	}


