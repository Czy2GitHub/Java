/**
 * 定义一个网络用户类，信息有用户 ID、用户密码、 email 地址。
 * 在建立类的实例时把以上三个信息都作为构造函数的参数输入，
 *  其中用户 ID 和用户密码时必须缺省时 email地址是用户 ID 加上字符串"@gameschool.com"。
 */
package cn.ccu;

public class Pro4_3 {
	int id;
	int pwd;
	String email;
	Pro4_3(int id,int pwd,String email){
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		System.out.println("该用户的信息有：\n"+id+"\n"+pwd+"\n"+email);
	}
	Pro4_3(String email){
		this.email = email;
		System.out.println("该用户的信息有："+email+"@gameschool.com");
	}
	public static void main(String[] args) {
		Pro4_3 user = new Pro4_3(7777,4396,"ClearLove@4396.com");
		Pro4_3 user2 = new Pro4_3("ClearLove7");
		
	}
}
