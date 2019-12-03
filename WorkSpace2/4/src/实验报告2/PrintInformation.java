package 实验报告2;
/**
 * 输出所有图书的信息：包括每本书的编号、书名、单价、库存
 * @author dell
 *
 */
public class PrintInformation {
	public static void main(String[] args) {
		//调用Book类输出所有书的图书信息
		Book []book = new Book[3];
		book[0] = new Book(0001,"Java基础教程",88,99);
		book[1] = new Book(0002,"python教程",45,999);
		book[2] = new Book(0003,"c++,从入门到入土",777,66);
		System.out.println("\t\t\t\t"+"图书目录");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("图书名字"+"   \t"+"图书编号"+"   \t"+"图书价格"+"   \t"+"图书库存");
		for(int i = 0 ;i < book.length;i++) {
			System.out.println(book[i].getName()+"\t\t"+book[i].getId()+"\t\t"+book[i].getPrice()+"\t\t"+book[i].getStorage());
		}
	}
}
