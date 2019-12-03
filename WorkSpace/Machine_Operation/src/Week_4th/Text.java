package Week_4th;
/**
 * 1.某班级有30名学生参加英语考试，试用一维数组实现班级学生英语考试成绩的存储并统计其班级平均分。
 * 	要求英语成绩是利用Math类中的random()方法随机生成，分数的范围为0～100分
 * @author dell
 *
 */
public class Text {
	public static void main(String[] args) {
		int [] array = new int[30];
		arerage(array);
	}
	public static  void arerage(int [] arrays) {
		int arerage = 0;
		int sum = 0;
		for(int i = 0;i < arrays.length ;i++ ) {
			arrays[i] = (int)(Math.random()*100+1);
			sum = sum + arrays[i];
		}
		arerage = sum/arrays.length;
		System.out.println("班级的平均分为:"+arerage);
}
}