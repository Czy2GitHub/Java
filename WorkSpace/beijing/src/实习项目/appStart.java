package 实习项目;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class appStart {
	static int n =0;
	static Scanner sc1 = new Scanner(System.in);
	static String input1 ;
	static String input2 ; 
	static String input3 ;
	static int change1;
	static int change2;
	static int change3;
	static Map<Integer,Car> map;
	static Car [] car = new Car[5];
	int count = 1;
	static {
		
	}
	//汽车基本信息
	static Car car1 = new Car(1001,"捷豹","未出租");
	static Car car2 = new Car(1002,"劳斯莱斯","未出租");
	static Car car3 = new Car(1003,"迈巴赫","未出租");
	static Car car4 = new Car(1004,"捷达","未出租");
	static Car car5 = new Car(1005,"奥迪","未出租");
	public static void main(String[] args) {
	do {
		car();
		printMenu();
		chooseMenu();
		n++;
	}while(n < 7);
	}
	//判断，执行功能
	public static void chooseMenu() {
		System.out.println("请输入您要进入的功能项");
		input1 = sc1.nextLine();
		if(!input1.equals("") && input1!=null) {
			change1 = Integer.parseInt(input1);
			switch(change1) {
			case 1:{
				for(Car i :car) {
				System.out.println(i.toString());
				}
			break;
			}
			case 2:{
				printMenu();
				System.out.println("请输入您要租赁车辆的编号:");
				input2 = sc1.nextLine();
				change2 = Integer.parseInt(input2);
				for(Car i : car) {
					if(change2 == i.getId()) {
						System.out.println("您要租赁的汽车是:"+i.getName());
						if(i.getState().equals("未出租")) {
							System.out.println("租赁成功！");
							i.setState("已租出");
						}else {
							System.out.println("该车已被租出!");
						}
					}
					
				}
				break;
			}
			case 3:{
				printMenu();
				System.out.println("请输入您要归还的汽车编号");
				input3 = sc1.nextLine();
				change3 = Integer.parseInt(input3);
				for(int i = 0 ; i < 5 ;i++) {
					if(car[i].getState().equals("已租出")) {
						car[i].setState("未租出");
						System.out.println("归还成功!");
					}
				}
				break;
			}
			}
		}
	
		
	}
	
	//存储车帘关信息
	public  static void setMap() {
		map = new HashMap();
		for(int i = 0 ; i < 5 ; i++) {
			map.put(car[i].getId(), car[i]);
		}
	}
	//初始化汽车数组
	public static void car() {
		car[0] = car1;
		car[1] = car2;
		car[2] = car3;
		car[3] = car4;
		car[4] = car5;
	}
	
	
	
	//打印菜单
	public static void printMenu() {
		System.out.println("***欢迎使用汽车租赁系统");
		System.out.println("1、查看汽车");
		System.out.println("2、租赁汽车");
		System.out.println("3、归还汽车");
		System.out.println("4、新增汽车");
		System.out.println("5、删除汽车");
		System.out.println("6、退出系统");
		
	}
	//保存数据到数据库里
	
}
