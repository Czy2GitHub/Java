package cn.ccu;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Test {
	//构造方法
	JFrame jf = new JFrame();
	public Test() {								
		// TODO Auto-generated constructor stub
		frame();
	}
	
	
	
	
	
	
	
	
	
	//添加登陆及注册按钮
	JPanel jpButton;
	JButton jbSignIn = new JButton("登    陆");
	JButton jbregister = new JButton("注    册");
	
	
	
	//静态初始化登陆界面
	static JPanel jp1;
	static JPanel jp2;
	static JPanel jp3;
	static JLabel signIn = new JLabel("登陆界面");
	static JLabel name = new JLabel("用户名:");
	static JLabel password = new JLabel("密  码:");
	static JTextField nameText = new JTextField(20);
	static JPasswordField passWordText = new JPasswordField(20);
	static Box box ;
	//静态调整界面字体、颜色
	static void adjustment() {
		signIn.setFont(new Font("宋体",Font.PLAIN,20));
		signIn.setForeground(Color.white);
		name.setFont(new Font("宋体",Font.PLAIN,15));
		name.setForeground(Color.white);
		password.setFont(new Font("宋体",Font.PLAIN,15));
		password.setForeground(Color.white);
	}
	
	
	//静态初始化菜单相关信息
	static MenuBar mb = new MenuBar();			//设置菜单栏
	static Menu mn1 = new Menu("设置");			//设置菜单按钮
	static MenuItem mn1_1 = new MenuItem("设置字体");		//设置菜单选项
	static MenuItem mn1_2 = new MenuItem("设置颜色");
	static MenuItem mn1_3 = new MenuItem("设置背景..");
	static Menu mn2 = new Menu("窗口");
	static MenuItem mn2_1 = new MenuItem("关闭");
	static MenuItem mn2$ = new Menu("确认关闭");
	
	
	
	//静态初始化背景
	static GridBagLayout grid = new GridBagLayout();
	 static ImageIcon imgBackGround = new ImageIcon("images/timg.jpg");
	 static JLabel imgLabel = new JLabel(imgBackGround);
	 static JPanel jp ;			
	 
	 
	 
	 
	 
	 
	 //添加界面相关信息
	 public void addContainer() {
		 //用户名、密码相关
		 adjustment();
		 jf.setLayout(new FlowLayout(FlowLayout.CENTER));
		 jp1 = new JPanel();
		 jp2 = new JPanel();
		 jp3 = new JPanel();
		 jp1.setOpaque(false);
		 jp1.setLayout(new GridBagLayout());
		 jp1.add(signIn);
		 
		 jp2.setOpaque(false);
		 jp2.add(name);
		 jp2.add(nameText);
		 jp2.setLayout(new GridBagLayout());
		
		 jp3.setOpaque(false);
		 jp3.add(password);
		 jp3.add(passWordText);
		 jp3.setLayout(new GridBagLayout());
		 jf.add(jp1);
		 jf.add(jp2);
		 jf.add(jp3);
		 
		 
		 //登陆&&注册按钮
		 jpButton = new JPanel();
		 jpButton.setOpaque(false);
		 jpButton.setLayout(new FlowLayout(FlowLayout.CENTER));
		 jpButton.add(jbSignIn);
		 jpButton.add(jbregister);
		 jbSignIn.setOpaque(false);
		 jbregister.setOpaque(false);
		 jf.add(jpButton);
		 
	 }
	
	
	
	
	//添加菜单相关信息
	public void addMenu() {		
		jf.setMenuBar(mb);				//设置mb为菜单栏
		//添加菜单按钮
		mb.add(mn1);					//添加菜单组件
		mn1.add(mn1_1);
		mn1.add(mn1_2);
		mn1.add(mn1_3);
		mb.add(mn2);
		mn2.add(mn2_1);
		mn2.add(mn2$);
	}
	
	
	//添加背景图片
	public void frame() {			//省略了this
		jf.setVisible(true);
		jf.setBounds(500,500,300,300);
		jf.setTitle("第一个GUI界面");
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public void addBackGround() {
		jp = (JPanel)jf.getContentPane();				//将jp设置为内容面版
		imgLabel.setBounds(0,0,imgBackGround.getIconWidth(),imgBackGround.getIconHeight());
		jp.setOpaque(false);
		jf.getLayeredPane().add(imgLabel,new Integer(Integer.MIN_VALUE));
		
	}

	
	
	
	
	
	
	
	
	//主函数
	public static void main(String[] args) {
		Test te = new Test();
		te.addBackGround();
		te.addContainer();
		te.addMenu();
		
	}
	
	
	
}
