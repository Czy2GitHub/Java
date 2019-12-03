package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import entity.Items;
import util.DBHelper;

//商品的业务逻辑类
public class ItemsDAO {
	//获得所有商品信息
	public ArrayList<Items> getAllItems(){
		Connection conn = null;				
		PreparedStatement stmt = null;				
		ResultSet rs = null;					//数据表指针
		ArrayList<Items> list = new ArrayList<Items>();
		try {
			conn = DBHelper.getConnection();
			String sql = "SELECT * FROM items;";//执行的SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();			//SQL语句已预编译并存储在PreparedStatement对象中  返回ResuitSet对象
			while(rs.next()) {
				Items item = new Items();
				item.setId(rs.getInt("id"));
				item.setName(rs.getString("name"));
				item.setCity(rs.getString("city"));
				item.setNumber(rs.getInt("number"));
				item.setPrice(rs.getInt("price"));
				item.setPicture(rs.getString("picture"));
				list.add(item);	//把一个商品加入集合
				System.out.println("添加成功");
			}
			return list;
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}finally{
			//释放数据集对象
			if(rs!=null) {
				try {
					rs.close();
					rs = null;
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}		
			
			///释放语句对象
			if(stmt!=null) {
				try {
				stmt.close();
				stmt=null;
			}
			catch(Exception ex) {
				ex.printStackTrace();	
				}
			}
		}
	}
	public Items getItemsById(int id) {
		Connection conn = null;				
		PreparedStatement stmt = null;				
		ResultSet rs = null;					//数据表指针
		try {
			conn = DBHelper.getConnection();
			String sql = "SELECT * FROM items where id=?;";//执行的SQL语句
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1,id);
			rs = stmt.executeQuery();			//SQL语句已预编译并存储在PreparedStatement对象中  返回ResuitSet对象
			if(rs.next()) {
				Items item = new Items();
				item.setId(rs.getInt("id"));
				item.setName(rs.getString("name"));
				item.setCity(rs.getString("city"));
				item.setNumber(rs.getInt("number"));
				item.setPrice(rs.getInt("price"));
				item.setPicture(rs.getString("picture"));
				return item;
			}else {
				return null;
			}
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}finally{
			//释放数据集对象
			if(rs!=null) {
				try {
					rs.close();
					rs = null;
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}		
			
			///释放语句对象
			if(stmt!=null) {
				try {
				stmt.close();
				stmt=null;
			}
			catch(Exception ex) {
				ex.printStackTrace();	
				}
			}

	}
	}
	
	//获取最近浏览的前五条商品信息
	public ArrayList<Items> getViewList(String list){
		System.out.println("list:"+list);
		ArrayList<Items> itemslist = new ArrayList<Items>();
		int iCount = 5;	//返回前五条商品信息
		//通过“，”来分割商品信息
		if(list!=null&&list.length()>0) {
			String[] arr =list.split(",");
			System.out.println("arr.length="+arr.length);
			//
			if(arr.length >= 5) {
				//如果客户端传来五条信息及以上
				for(int i = arr.length-1; i>=arr.length-5-iCount;i--) {
					itemslist.add(getItemsById(Integer.parseInt(arr[i])));
				}
			}else {
				//不足五条信息
				for(int i=arr.length-1;i>=0;i--)
			    	{
			    		itemslist.add(getItemsById(Integer.parseInt(arr[i])));
			    	}
			}
			return itemslist;
		}
		else {
			return null;
		}
	}
	
	
}
