package cn.ccu;
//BorderLayout_Exam.java BorderLayout类的应用
import java.awt.*;
public class BorderLayout_Exam extends Frame{
	static Frame mainFrame = new Frame("边界布局管理器类的应用示例!"); 
	public static void main(String args[ ]){
		BorderLayout border=new BorderLayout(2,4);
		mainFrame.setLayout(border);             //设置页面布局为BorderLayout
		mainFrame.setSize(250,250);
		mainFrame.setBackground(Color.green);   //设置窗口底色为绿色
		mainFrame.setLocation(150,150);
		mainFrame.add(new Button("北"), BorderLayout.NORTH);
		mainFrame.add(new Button("南"), BorderLayout.SOUTH);
		mainFrame.add(new Button("东"), BorderLayout.EAST);
		mainFrame.add(new Button("西"), BorderLayout.WEST);
		mainFrame.add(new Button("中央"), BorderLayout.CENTER);
		mainFrame.setVisible(true);
	}
}
