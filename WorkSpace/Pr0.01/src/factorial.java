/*
 * �ݹ飻�׳�
 */
public class factorial {
	public static void main(String[] args) {
		long time1 =  System.currentTimeMillis();	//��¼��ǰʱ��
		System.out.printf("%d�Ľ׳���%s%n",10,factorial(10));
		long time2 = System.currentTimeMillis();
		System.out.printf("����ʱ��Ϊ%d", time2-time1);
	}
	//���õݹ����׳�
	static  int factorial(int n) {
	int	sum = 0;
		if(n==1) {
			return 1; 
		}else {
		 sum = n * factorial(n-1);
		}
		return sum;
	}
	
}
