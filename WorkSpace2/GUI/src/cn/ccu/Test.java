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
	//���췽��
	JFrame jf = new JFrame();
	public Test() {								
		// TODO Auto-generated constructor stub
		frame();
	}
	
	
	
	
	
	
	
	
	
	//���ӵ�½��ע�ᰴť
	JPanel jpButton;
	JButton jbSignIn = new JButton("��    ½");
	JButton jbregister = new JButton("ע    ��");
	
	
	
	//��̬��ʼ����½����
	static JPanel jp1;
	static JPanel jp2;
	static JPanel jp3;
	static JLabel signIn = new JLabel("��½����");
	static JLabel name = new JLabel("�û���:");
	static JLabel password = new JLabel("��  ��:");
	static JTextField nameText = new JTextField(20);
	static JPasswordField passWordText = new JPasswordField(20);
	static Box box ;
	//��̬�����������塢��ɫ
	static void adjustment() {
		signIn.setFont(new Font("����",Font.PLAIN,20));
		signIn.setForeground(Color.white);
		name.setFont(new Font("����",Font.PLAIN,15));
		name.setForeground(Color.white);
		password.setFont(new Font("����",Font.PLAIN,15));
		password.setForeground(Color.white);
	}
	
	
	//��̬��ʼ���˵������Ϣ
	static MenuBar mb = new MenuBar();			//���ò˵���
	static Menu mn1 = new Menu("����");			//���ò˵���ť
	static MenuItem mn1_1 = new MenuItem("��������");		//���ò˵�ѡ��
	static MenuItem mn1_2 = new MenuItem("������ɫ");
	static MenuItem mn1_3 = new MenuItem("���ñ���..");
	static Menu mn2 = new Menu("����");
	static MenuItem mn2_1 = new MenuItem("�ر�");
	static MenuItem mn2$ = new Menu("ȷ�Ϲر�");
	
	
	
	//��̬��ʼ������
	static GridBagLayout grid = new GridBagLayout();
	 static ImageIcon imgBackGround = new ImageIcon("images/timg.jpg");
	 static JLabel imgLabel = new JLabel(imgBackGround);
	 static JPanel jp ;			
	 
	 
	 
	 
	 
	 
	 //���ӽ��������Ϣ
	 public void addContainer() {
		 //�û������������
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
		 
		 
		 //��½&&ע�ᰴť
		 jpButton = new JPanel();
		 jpButton.setOpaque(false);
		 jpButton.setLayout(new FlowLayout(FlowLayout.CENTER));
		 jpButton.add(jbSignIn);
		 jpButton.add(jbregister);
		 jbSignIn.setOpaque(false);
		 jbregister.setOpaque(false);
		 jf.add(jpButton);
		 
	 }
	
	
	
	
	//���Ӳ˵������Ϣ
	public void addMenu() {		
		jf.setMenuBar(mb);				//����mbΪ�˵���
		//���Ӳ˵���ť
		mb.add(mn1);					//���Ӳ˵����
		mn1.add(mn1_1);
		mn1.add(mn1_2);
		mn1.add(mn1_3);
		mb.add(mn2);
		mn2.add(mn2_1);
		mn2.add(mn2$);
	}
	
	
	//���ӱ���ͼƬ
	public void frame() {			//ʡ����this
		jf.setVisible(true);
		jf.setBounds(500,500,300,300);
		jf.setTitle("��һ��GUI����");
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public void addBackGround() {
		jp = (JPanel)jf.getContentPane();				//��jp����Ϊ�������
		imgLabel.setBounds(0,0,imgBackGround.getIconWidth(),imgBackGround.getIconHeight());
		jp.setOpaque(false);
		jf.getLayeredPane().add(imgLabel,new Integer(Integer.MIN_VALUE));
		
	}

	
	
	
	
	
	
	
	
	//������
	public static void main(String[] args) {
		Test te = new Test();
		te.addBackGround();
		te.addContainer();
		te.addMenu();
		
	}
	
	
	
}