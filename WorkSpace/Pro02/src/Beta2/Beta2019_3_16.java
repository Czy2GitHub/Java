package Beta2;
/**
 * ���Թ�����;
 * ��������֮��ľ��룻
 * @author dell
 *
 */
class Point{
	double x,y;
	//���췽�����ƺ��������뱣��һ��
	
	
	public double getDistance(Point x) {
		 return Math.sqrt((this.x - x.x)*(this.x - x.x)+(this.y - x.y)*(this.y - x.y));
	}
}
public class Beta2019_3_16 {
	public static void main(String[] args) {
		Point p = new Point();		//����һ��Point�Ķ��󣻴���һ������Ϊ��3.0��4.0���ĵ㣻
		Point origin = new Point();//��ȡԭ�㣻
		p.x = 3.0;
		p.y = 4.0;
		origin.x = 0.0;
		origin.y = 0.0;
		System.out.println(p.getDistance(origin));
	}
}
