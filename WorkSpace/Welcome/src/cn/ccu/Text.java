package cn.ccu;
import java.util.Arrays;
/**
 某班级有30名学生参加英语训练,
 试用一维数组实现班级学生英语考试成绩的存储,
 并统计班级成绩平均分、
 最高分与最低分,
 并输出结果。
 要求英语成绩利用Math类中的random()方法随机生成,
 分数范围为0~100。
 * @author Administrator
 */
public class Text {
		public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		int []a = new int[30];
		while(i < 30){
		a[i] = (int)(Math.random()*100+1);
			i++;
			}
		i = 0;
		while(i < 30){
			sum = a[i] + sum;
			i++;
			}
			int	aver  =  sum / 30;				//平均分
			System.out.println("该班的平均分为:"+aver);
			Arrays.sort(a);				//升序排列
			int min = a[0];					//排列后数组中第一个元素一定是最小值
	System.out.println("该班的最低分为:"+min);
			int	max = a[29];				//排列后数组中最后一个数组一定是最大的
	System.out.println("该班的最高分为:"+max);
		}
}