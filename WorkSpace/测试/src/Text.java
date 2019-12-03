
public class Text{
	public static void main(String[] args) {
		System.out.println();
	}
	public Text chooseI(int i) {
		if (i == 0)
				return new Circle(1);
		if(i == 1)
				return new Rectangle(3, 2);
		if(i == 2)
				return new Square(2);
		return null;
	}
}

//圆
class Circle extends Text{
	int r = 0; //半径
	
	//构造方法
	public Circle(int r) {
		this.r = r;
	}
}

//矩形
class Rectangle extends Text{
	int height = 0;
	int width = 0;
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
}

//正方形
class Square extends Text{
	int side = 0;
	public Square(int side) {
		this.side = side;
	}
}