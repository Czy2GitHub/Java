package Beta2;
/**
 * 测试构造器;
 * 计算两点之间的距离；
 * @author dell
 *
 */
class Point{
	double x,y;
	//构造方法名称和类名必须保持一致
	
	
	public double getDistance(Point x) {
		 return Math.sqrt((this.x - x.x)*(this.x - x.x)+(this.y - x.y)*(this.y - x.y));
	}
}
public class Beta2019_3_16 {
	public static void main(String[] args) {
		Point p = new Point();		//创建一个Point的对象；创造一个坐标为（3.0，4.0）的点；
		Point origin = new Point();//获取原点；
		p.x = 3.0;
		p.y = 4.0;
		origin.x = 0.0;
		origin.y = 0.0;
		System.out.println(p.getDistance(origin));
	}
}
