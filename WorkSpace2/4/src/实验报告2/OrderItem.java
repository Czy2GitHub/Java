package 实验报告2;
/**
 * 购买完毕后输出顾客的订单信息：包括订单号、订单明细、订单总额该系统中必须包括3个实体类，类名及属性设置如下：
 * （1）图书类（Book）：图书编号（id）、图书名称（name）、图书单价（price）、 库存数量（storage）；
 * （2）订单项类（OrderItem）：图书（book）、购买数量（num）；　　　　　　
 * （3）订单类（Order）：订单号（orderID）、订单总额（total）、订单项列表（items）
 * @author dell
 *
 */
public class OrderItem {
		Book []book = new Book[3] ;
		int []num;
 		public OrderItem(Book []book,int []num) {
			this.book = book;
			this.num  = num;
		}
}
class Order{
	//订单号
	private int  orderID;
	//总额
	private int total = 0;
	//订单项列表
	private OrderItem items;
	public Order(Book []book,int[] score) {
		this.orderID = 0001;
		this.items = new OrderItem(book,score);
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public OrderItem getItems() {
		return items;
	}
	public void setItems(OrderItem items) {
		this.items = items;
	}
}
class Book{
	//封装并定义内部成员变量
	private int id;						
	private String name;
	private int price;
	private int storage;
	//构造函数
	
	//为封装变量创建set/get函数
	public int getId() {
		return id;
	}
	public Book(int id, String name, int price, int storage) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.storage = storage;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	
}