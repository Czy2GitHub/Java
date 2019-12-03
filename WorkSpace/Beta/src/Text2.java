/**
 * 用一段代码检测两个double型的数x和y是否相等。
 * 代码应能分辨这两个数是否为无穷大或是否为空。如果它们相等，代码能正确显示这两个数。
 * @author dell
 *
 */

public class Text2 {
	boolean count(double n,double j){
		if(n == Double.NaN ) {
			System.out.println("该数为空!");
		}else if(j == Double.NaN){
			System.out.println("该数为空!");
		}else if(n == Double.POSITIVE_INFINITY) {
			System.out.println("该数无穷大！");
		}else if(j == Double.NEGATIVE_INFINITY) {
			System.out.println("该数无穷小！");
		}
		return n == j;
	}
	public static void main(String[] args) {
		double x = Double.POSITIVE_INFINITY; 
		double y = Double.NEGATIVE_INFINITY;
		Text2 i = new Text2();
		i.count( x,y);
	}
	
}
