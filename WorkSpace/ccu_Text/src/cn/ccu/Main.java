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
			Collections.shuffle(l);//�������е������������
			System.out.println("7���н������ǣ�  ");
			int []a=new int[7];
			for(int i=0;i<7;i++)
			{
				a[i]=l.get(i);
				System.out.print(l.get(i)+" ");
			}
			System.out.println("");
			Scanner scan=new Scanner(System.in);
			System.out.println("������ѡ��7�������ǣ�    ");
			int sum=0;
			for(int i=0;i<7;i++)
			{
				int in=scan.nextInt();
				for(int j=0;j<7;j++)
				{
					if(in==a[j]) sum+=1;
				}
			}
			System.out.println("�ܹ�����"+sum+"����");
			if(sum==7) System.out.println("��ϲ������һ�Ƚ�");
			else if(sum==6)System.out.println("��ϲ�����˶��Ƚ�");
			else if(sum==5)System.out.println("��ϲ���������Ƚ�");
		}
	}


