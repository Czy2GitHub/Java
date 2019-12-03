package Week_13th;


import java.util.ArrayList;
import java.util.List;

/**
 * Collection集合练习：产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台
 * @author dell
 *
 */
public class Test2_1 {
	public static void main(String[] args) {
		int []a = new int[10];	
		List <Integer>li = new ArrayList<Integer>();
		for(int i = 0 ; i <a.length;i++) {
			a[i] = (int)(Math.random()*100+1);
		if(a[i] > 10) {
			li.add(a[i]);
		}
		}
				for(int l : li) {
					System.out.print(l+" ");			
		}
		
	}
}
