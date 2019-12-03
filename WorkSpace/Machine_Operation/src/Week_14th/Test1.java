package Week_14th;
/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。

 * @author dell
 *
 */
public class Test1 {
	int []a = {7,1,5,3,6,4};
	int flag = 0;
	int []count;
	int n;
	int sum;
	public static void main(String[] args) {
		Test1 te = new Test1();
		te.maxProfit();
	}
	public void maxProfit() {
		
		count = new int[a.length];					//储存利润
		for(int i = 0 ;i <a.length - 1;i++ ) {				//前后进行比较，比较值的大小
			if(a[i] < a[i + 1]) {
				count[n] = a[i +1 ] - a[i];
				n++;
			}
		}
		for(Integer i : count){
			sum = sum + i;
		}
		System.out.println(sum);
	}
	
}
