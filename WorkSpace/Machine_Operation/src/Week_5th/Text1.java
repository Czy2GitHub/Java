package Week_5th;

import java.text.DecimalFormat;

/**
 * ��Ŀ����һ�������У�2/1��3/2��5/3��8/5��13/8��21/13...���������е�ǰ20��֮�͡�
�����������ץס�������ĸ�ı仯���ɡ�
��һ����2/1
ǰ��һ����Ӻͷ�ĸ��ӵĺͣ�Ϊ��һ��ķ���
ǰ��һ����ӣ�Ϊ��һ��ķ�ĸ

 * @author dell
 *
 */
public class Text1 {
	public static void main(String[] args) {
	sum();
}
	public static void sum() {
		DecimalFormat df = new DecimalFormat("#.00");	//��ȷ��С�������λ
		double sum = 0;
		for(double i =  1;i <= 20;i+=2) {
			sum = sum + (i+1)/i + (2*i+1)/(i+1);
		}
		System.out.println(df.format(sum));
	}
}