package cn.ccu;
import java.awt.*;
import java.awt.event.*;
public class AWTComp_Exam extends Frame implements ItemListener{
        static AWTComp_Exam mainFrame = new AWTComp_Exam();
        //复选框组件
        static Checkbox chk1=new Checkbox("常规");
        static Checkbox chk2=new Checkbox("粗体");
        static Checkbox chk3=new Checkbox("斜体");
        static Checkbox chk_g1=new Checkbox("红色");
        static Checkbox chk_g2=new Checkbox("绿色");
        static Checkbox chk_g3=new Checkbox("蓝色");
        static TextArea ta1=new TextArea("选项事件类ItemEvent的使用方法",5,20);
        //下拉列表框
        static Choice cho=new Choice();
        //菜单组件
        static MenuBar mb=new MenuBar();               //创建MenuBar对象 mb
        static Menu mn1=new Menu("颜色");             //创建Menu对象 mn1
        static Menu mn2=new Menu("样式");            //创建Menu对象 mn2
        static Menu mn3=new Menu("窗口");           //创建Menu对象 mn3
        static MenuItem mi1=new MenuItem("红色");  //创建MenuItem对象 mi1
        static MenuItem mi2=new MenuItem("绿色");
        static MenuItem mi3=new MenuItem("蓝色");
        static CheckboxMenuItem cbmi1=new CheckboxMenuItem("常规");    //复选框菜单项
        static CheckboxMenuItem cbmi2=new CheckboxMenuItem("粗体");    //复选框菜单项
        static CheckboxMenuItem cbmi3=new CheckboxMenuItem("斜体");  //复选框菜单项
        static MenuItem mi4=new MenuItem("关闭");
        static PopupMenu pm=new PopupMenu("弹出式菜单");     //创建弹出式菜单
        static MenuItem Pop_m1, Pop_m2, Pop_m3;            //弹出菜单项
        public static void main(String args[ ]){
              mainFrame.setTitle("常用AWT组件综合应用");
              mainFrame.setBounds(150,150,350,300);
              mainFrame.setBackground(Color.pink); 
              GridBagLayout gridbag=new GridBagLayout();
              GridBagConstraints constraints=new GridBagConstraints();
              mainFrame.setLayout(gridbag);
              mainFrame.setFont(new Font("Helvetica",Font.PLAIN,16));
              constraints.fill=GridBagConstraints.NONE;
              constraints.anchor=constraints.NORTHWEST;

              constraints.weightx=1;
              constraints.gridwidth=1;
              Label labl1=new Label("设置文本样式：");
              gridbag.setConstraints(labl1,constraints);
              mainFrame.add(labl1);
              constraints.weightx=1;
              constraints.gridwidth=1;
              CheckboxGroup grp=new CheckboxGroup();
              chk_g1.setCheckboxGroup(grp);
              chk_g2.setCheckboxGroup(grp);
              chk_g3.setCheckboxGroup(grp);
              chk1.addItemListener(mainFrame);   //把事件监听者mainFrame向chk1注册
              chk2.addItemListener(mainFrame);   //把事件监听者mainFrame向chk2注册
              chk3.addItemListener(mainFrame);   //把事件监听者mainFrame向chk3注册
              chk_g1.addItemListener(mainFrame);  //把事件监听者mainFrame向chk_g1注册
              chk_g2.addItemListener(mainFrame);  //把事件监听者mainFrame向chk_g2注册
              chk_g3.addItemListener(mainFrame);  //把事件监听者mainFrame向chk_g3注册
              gridbag.setConstraints(chk1,constraints);
              mainFrame.add(chk1);                 
              gridbag.setConstraints(chk2,constraints);
              mainFrame.add(chk2);		
              constraints.gridwidth=GridBagConstraints.REMAINDER;
              gridbag.setConstraints(chk3,constraints);
              mainFrame.add(chk3);

              constraints.weightx=1;
              constraints.gridwidth=1;
              Label labl2=new Label("设置文本颜色：");
              gridbag.setConstraints(labl2,constraints);
              mainFrame.add(labl2);
 
              constraints.weightx=1;
              constraints.gridwidth=1;
              gridbag.setConstraints(chk_g1,constraints);
              mainFrame.add(chk_g1);
              gridbag.setConstraints(chk_g2,constraints);
              mainFrame.add(chk_g2);
              constraints.gridwidth=GridBagConstraints.REMAINDER;
              gridbag.setConstraints(chk_g3,constraints);
              mainFrame.add(chk_g3);

              constraints.weightx=1;
              constraints.gridwidth=1;
              Label labl3=new Label("设置背景颜色：");
              gridbag.setConstraints(labl3,constraints);
              mainFrame.add(labl3);
              cho.add("红色");                   //将选项加入到列表框中
              cho.add("绿色");
              cho.add("蓝色");
              cho.add("黄色");
              cho.addItemListener(new MyChoItemListener());     //设置内部类对象为cho的监听者

              constraints.gridwidth=GridBagConstraints.REMAINDER;
              gridbag.setConstraints(cho,constraints);
              mainFrame.add(cho);

              constraints.weightx=1;
              constraints.gridwidth=1;
              Label labl4=new Label("设置后效果:");
              gridbag.setConstraints(labl4,constraints);
              mainFrame.add(labl4);

              constraints.weightx=1;
              constraints.gridwidth=GridBagConstraints.REMAINDER;;
              gridbag.setConstraints(ta1,constraints);
              mainFrame.add(ta1);
              //菜单设计
		mb.add(mn1);              //将mn1加入mb中
		mb.add(mn2);
	        mb.add(mn3);
		mn1.addSeparator();          //加一分隔线
		mn1.add(mi1);               //将mi1加入到mn1中
		mn1.add(mi2);
		mn1.add(mi3);
		mn1.addSeparator(); 
		mn2.addSeparator(); 
		mn2.add(cbmi1);             //添加带复选框的菜单项
		mn2.add(cbmi2);       
		mn2.add(cbmi3);         
		mn2.addSeparator(); 
		mn3.addSeparator(); 
		mn3.add(mi4);                 // 将mi4加入到mn2中
		mn3.addSeparator(); 
		mainFrame.setMenuBar(mb);    //设置mainFrame的菜单栏为mb
		Pop_m1=new MenuItem("红色");
		Pop_m2=new MenuItem("绿色");
		Pop_m3=new MenuItem("蓝色");
		pm.add(Pop_m1);              //向弹出式菜单中添加菜单项
		pm.add(Pop_m2);
		pm.add(Pop_m3);
		//设置内部类为弹出菜单项的监听者
		Pop_m1.addActionListener(new MyMenuActionListener());
		Pop_m2.addActionListener(new MyMenuActionListener());
		Pop_m3.addActionListener(new MyMenuActionListener());
		mainFrame.add(pm);                //将弹出式菜单附加在mainFrame上
		ta1.addMouseListener(new MyMenuMouseListener());  //设置内部类为ta1的监听者
		mi1.addActionListener(new MyMenuActionListener()); 
		mi2.addActionListener(new MyMenuActionListener());
		mi3.addActionListener(new MyMenuActionListener());
		cbmi1.addItemListener(new MyMenuCbItemListener());
	    cbmi2.addItemListener(new MyMenuCbItemListener());
	    cbmi3.addItemListener(new MyMenuCbItemListener());
		mi4.addActionListener(new MyMenuActionListener());
		mainFrame.setVisible(true);
	}
	 //复选框选项事件类处理程序
	 public void itemStateChanged(ItemEvent e){    //事件发生时的处理操作
	 	Checkbox chk=(Checkbox)e.getSource();   //获得事件源并强制将其转换成Checkbox类型
	 	Font font1=ta1.getFont();
	 	int style1=0;
	 	if(chk==chk_g1) ta1.setForeground(Color.RED);
	 	else  if(chk==chk_g2) ta1.setForeground(Color.GREEN);
	 	else  if(chk==chk_g3) ta1.setForeground(Color.BLUE);
	 	else if((chk==chk1)|| (chk==chk2)|| (chk==chk3))
	 	{	if(chk1.getState())  style1=style1+Font.PLAIN;
	 	   	if(chk2.getState())  style1=style1+Font.BOLD;
	 		if(chk3.getState())  style1=style1+Font.ITALIC;	
	 	  	ta1.setFont(new Font(font1.getName(),style1,font1.getSize()));
	 		ta1.append("\nstyle="+style1+" "+e.getItem()+""+chk.getState());
	 	}
	 	cbmi1.setState(chk1.getState());
	 	cbmi2.setState(chk2.getState());	 	
	 	cbmi3.setState(chk3.getState());	 	 
	 }
	//下拉列表框事件处理程序
	 static class MyChoItemListener implements ItemListener
	 { 	public void itemStateChanged(ItemEvent e)   //处理单击事件的程序代码
	 	{	String clr=cho.getSelectedItem();     //取得被选中选项的名称
	 		if (clr=="红色") ta1.setBackground(Color.RED);
	 		else if (clr=="绿色") ta1.setBackground(Color.GREEN);
	 		else if (clr=="蓝色") ta1.setBackground(Color.BLUE);
	 		else if (clr=="黄色") ta1.setBackground(Color.YELLOW);
	 		mainFrame.setTitle("您选择了["+clr+"]颜色");   //设置窗口的标题
	 		ta1.setText(clr);
	 	}
	 }
	  //菜单栏事件处理
	 static class MyMenuActionListener implements ActionListener{
	 	public void actionPerformed(ActionEvent e)   //处理事件的程序代码
	 	{	MenuItem mi=(MenuItem)e.getSource();   //取得引发事件的对象
	 		String miLab=mi.getLabel();            //取得菜单项的文字标题
	 		if (miLab =="红色") ta1.setBackground(Color.RED);
	 		else if (miLab =="绿色") ta1.setBackground(Color.GREEN);
	 		else if (miLab =="蓝色") ta1.setBackground(Color.BLUE);
	 		else if (mi ==mi4) mainFrame.dispose();               //关闭窗口，释放资源
	 		mainFrame.setTitle("设置文字颜色为["+ miLab +"]颜色");   //设置窗口的标题
	 	}
	 }
      //处理复选框菜单项事件的程序代码
	static class MyMenuCbItemListener implements ItemListener {
	  	public void itemStateChanged(ItemEvent e) 
	 	{    boolean yn1=cbmi1.getState();
	 		boolean yn2=cbmi2.getState();
	 		boolean yn3=cbmi3.getState();
	 		int state=0;
	 		if (yn1) state= Font.PLAIN;
	 		if (yn2) state= state+Font.BOLD;
	 		if (yn3) state=state+Font.ITALIC;	 		
	 		if (yn1||yn2||yn3)ta1.setFont(new Font("楷体_GB2312",state,15));
	 		else ta1.setFont(new Font("宋体",Font.PLAIN,15));
	 		chk1.setState(cbmi1.getState());
	 		chk2.setState(cbmi2.getState());
	 		chk3.setState(cbmi3.getState());
	 	}
	} 
       //文本区鼠标事件处理程序
	 static class MyMenuMouseListener extends MouseAdapter{
	 	public void mouseReleased(MouseEvent mce)     //释放鼠标时触发的事件
	 	{	if(mce.isPopupTrigger())         //判断鼠标事件是否是由弹出菜单引发
	 		pm.show((Component)mce.getSource(),mce.getX(),mce.getY());
	 	}
	 }
}
