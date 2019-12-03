package 实验报告2;
import java.util.Scanner;
/**
 * 2.顾客购买书：根据提示输入图书编号来购买书，并根据提示输入购买书的的数量
 * @author dell
 *
 */
public class PurchaseGoods {
	
	int []id = new int[3];
	int []score = new int[3];
	Book []book = new Book[3];
	//输出用户订单信息
	public void outPutOrder() {
		System.out.println("请输入要退货的书籍编号:");
		Scanner sc2 =new Scanner(System.in);
		int s = sc2.nextInt();
		for(int i = 0 ; i<3;i++){
				if(s == book[i].getId()) {
					System.out.println("退货成功！"+book[i].getName()+(book[i].getStorage()-score[i]));

				}
		}
	}
	public  void outPutAll() {
		Order ord = new Order(book,score);
		System.out.println("\t\t\t\t"+"订单信息"+"\t\t"+"订单号:"+ord.getOrderID());
		System.out.println("--------------------------------------------------------");
		for(int i = 0 ; i<3;i++){
		for(int j = 0; j<3;j++) {
			if(id[i] == book[j].getId()) {
			System.out.println("图书名字"+"\t\t"+book[j].getName()+"\t\t"+"商品数量"+score[i]+"\t\t"+"商品总价"+book[j].getPrice()*score[i]+"\t\t"+"剩余库存"+(book[j].getStorage()-score[i]));
			ord.setTotal(ord.getTotal() + book[j].getPrice()*score[i]);
		}
	}
}
	    System.out.println("总价:"+"\t\t\t\t"+ord.getTotal());
	    System.out.println("---------------------------------------------------------");
	}
	public  void outPutBook(){
		//调用Book类输出所有书的图书信息
		book[0] = new Book(0001,"Java基础教程",88,99);
		book[1] = new Book(0002,"python教程",45,999);
		book[2] = new Book(0003,"c++,从入门到入土",777,66);
		System.out.println("\t\t\t\t"+"图书目录");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("图书名字"+"   \t"+"图书编号"+"   \t"+"图书价格"+"   \t"+"图书库存");
		for(int i = 0 ;i < book.length;i++) {
			System.out.println(book[i].getName()+"\t\t"+book[i].getId()+"\t\t"+book[i].getPrice()+"\t\t"+(book[i].getStorage()-score[i]));
		}
	}
	public static void main(String[] args) {
		PurchaseGoods pur = new PurchaseGoods();
		Scanner sc1 = new Scanner(System.in);
			Counter con = new Counter();
			con.caidan();
			while(true) {
			System.out.println("请输入序号:");
			int q = sc1.nextInt();
			if(q == 1) {
				pur.outPutBook();
			}
			if(q == 2) {
			pur.outPutBook();
			for(int i = 0 ;i < 3;i++) {
				System.out.println("请输入图书编号来购买书");
				 pur.id[i] = sc1.nextInt();
				System.out.println("请输入购买书的数量");
				 pur.score[i] = sc1.nextInt();
				System.out.println("是否继续购买图书?Y/N");
				String str = sc1.next();
				if(str.equals("Y")) {
				 continue;
				}else {
				break;
				}
	}
			pur.outPutAll();
			}
			if(q == 3) {
				pur.outPutOrder();
			}
			if(q == 4) {
				System.exit(0);
			}
			}
}
}
