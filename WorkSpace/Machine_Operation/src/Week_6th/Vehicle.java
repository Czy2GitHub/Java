package Week_6th;
import java.util.Scanner;
/**
 * 1.请定义一个交通工具(Vehicle)的类，其中有: 
⦁ 属性：速度(speed)，体积(size)等
⦁ 方法：移动(move())，设置速度(setSpeed(int speed))，设置体积（setSize(int size)）加速speedUp(),减速speedDown()等
在测试类Vehicle中的main()中实例化一个交通工具对象，通过方法给它初始化speed,size的值，并打印出来。另外，调用加速，减速的方法对速度进行改变。

 * @author dell
 *
 */
public class Vehicle {
	int speed;
	int size;
	public void move() {
		System.out.println("移动");
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void speedUp() {
		speed++;
	}
	public void speedDown() {
		speed--;
	}
	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		car.setSize(5);
		car.setSpeed(10);
		System.out.println("当前速度"+car.speed+"车的大小"+car.size);
		car.speedUp();
		System.out.println("当前速度"+car.speed+"车的大小"+car.size);
		car.speedDown();
		System.out.println("当前速度"+car.speed+"车的大小"+car.size);
	}
}
