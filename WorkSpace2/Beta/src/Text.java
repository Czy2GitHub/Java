/**
 * 
 * @author Administrator
 *
 */
class Text3{
	int thousand ;
	int hundred ;
	int ten ;
	int i;
}
public class Text {
	Arr yg;
	public static void main(String[] args){
		int n = 1678;
		System.out.println("n="+n);
		Text yd = new Text();
		Arr yg = new Arr();
		yg.thousand = (n/1000)%10;
		yg.hundred =(n/100)%10; 
		yg.ten = (n/10)%10;
		yg.i = n%10;
		yd.yg = yg;
		System.out.println("n的每位数字为"+yg.thousand+","+yg.hundred+","+yg.ten+","+yg.i);
	}
}
