package 实验报告6;


	import javax.swing.JButton;
	import javax.swing.JCheckBox;
	import javax.swing.JComboBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JMenu;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;
	import javax.swing.JPasswordField;
	import javax.swing.JTextField;

	public class Test {
		
		JTextField field = new JTextField();
		
		public static void main(String[] args) {
			JFrame f = new JFrame();
			f.setLayout(null);
			
			JButton button = new JButton("登陆");
			button.setBounds(122, 342, 298, 44);
			f.add(button);
			
			JCheckBox box1 = new JCheckBox();
			box1.setBounds(122, 306, 17, 16);
			f.add(box1);
			
			JLabel jLabel1 = new JLabel("自动登陆");
			jLabel1.setBounds(143, 306, 64, 16);
			f.add(jLabel1);
			
			JCheckBox box2 = new JCheckBox();
			box2.setBounds(239, 306, 17, 16);
			f.add(box2);
			
			JLabel jLabel2 = new JLabel("记住密码");
			jLabel2.setBounds(260, 306, 64, 16);
			f.add(jLabel2);
			
			JLabel jLabel3 = new JLabel("找回密码");
			jLabel3.setBounds(355, 306, 64, 16);
			f.add(jLabel3);
			
			JLabel jLabel4 = new JLabel("找回密码");
			jLabel4.setBounds(12, 380, 64, 16);
			f.add(jLabel4);
			
			String a[]= {"123456789","567891234","567892345"};
			JComboBox comboBox = new JComboBox(a);
			comboBox.setBounds(121, 208, 300, 36);
			f.add(comboBox);
			
			JPasswordField jPasswordField = new JPasswordField();
			jPasswordField.setBounds(120, 255, 300, 37);
			f.add(jPasswordField);
			
			JMenuBar bar = new JMenuBar();
			JMenu JMenu1 = new JMenu("菜单一");
			JMenu JMenu2 = new JMenu("菜单二");
			JMenuItem item1 = new JMenuItem("aaaaaa");
			JMenuItem item2 = new JMenuItem("bbbbbb");
			JMenuItem item3 = new JMenuItem("cccccc");
			JMenu1.add(item1);
			JMenu1.add(item2);
			JMenu1.add(item3);
			f.setSize(554, 460);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setVisible(true);
}
}