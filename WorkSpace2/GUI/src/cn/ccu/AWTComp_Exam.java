package cn.ccu;
import java.awt.*;
import java.awt.event.*;
public class AWTComp_Exam extends Frame implements ItemListener{
        static AWTComp_Exam mainFrame = new AWTComp_Exam();
        //��ѡ�����
        static Checkbox chk1=new Checkbox("����");
        static Checkbox chk2=new Checkbox("����");
        static Checkbox chk3=new Checkbox("б��");
        static Checkbox chk_g1=new Checkbox("��ɫ");
        static Checkbox chk_g2=new Checkbox("��ɫ");
        static Checkbox chk_g3=new Checkbox("��ɫ");
        static TextArea ta1=new TextArea("ѡ���¼���ItemEvent��ʹ�÷���",5,20);
        //�����б��
        static Choice cho=new Choice();
        //�˵����
        static MenuBar mb=new MenuBar();               //����MenuBar���� mb
        static Menu mn1=new Menu("��ɫ");             //����Menu���� mn1
        static Menu mn2=new Menu("��ʽ");            //����Menu���� mn2
        static Menu mn3=new Menu("����");           //����Menu���� mn3
        static MenuItem mi1=new MenuItem("��ɫ");  //����MenuItem���� mi1
        static MenuItem mi2=new MenuItem("��ɫ");
        static MenuItem mi3=new MenuItem("��ɫ");
        static CheckboxMenuItem cbmi1=new CheckboxMenuItem("����");    //��ѡ��˵���
        static CheckboxMenuItem cbmi2=new CheckboxMenuItem("����");    //��ѡ��˵���
        static CheckboxMenuItem cbmi3=new CheckboxMenuItem("б��");  //��ѡ��˵���
        static MenuItem mi4=new MenuItem("�ر�");
        static PopupMenu pm=new PopupMenu("����ʽ�˵�");     //��������ʽ�˵�
        static MenuItem Pop_m1, Pop_m2, Pop_m3;            //�����˵���
        public static void main(String args[ ]){
              mainFrame.setTitle("����AWT����ۺ�Ӧ��");
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
              Label labl1=new Label("�����ı���ʽ��");
              gridbag.setConstraints(labl1,constraints);
              mainFrame.add(labl1);
              constraints.weightx=1;
              constraints.gridwidth=1;
              CheckboxGroup grp=new CheckboxGroup();
              chk_g1.setCheckboxGroup(grp);
              chk_g2.setCheckboxGroup(grp);
              chk_g3.setCheckboxGroup(grp);
              chk1.addItemListener(mainFrame);   //���¼�������mainFrame��chk1ע��
              chk2.addItemListener(mainFrame);   //���¼�������mainFrame��chk2ע��
              chk3.addItemListener(mainFrame);   //���¼�������mainFrame��chk3ע��
              chk_g1.addItemListener(mainFrame);  //���¼�������mainFrame��chk_g1ע��
              chk_g2.addItemListener(mainFrame);  //���¼�������mainFrame��chk_g2ע��
              chk_g3.addItemListener(mainFrame);  //���¼�������mainFrame��chk_g3ע��
              gridbag.setConstraints(chk1,constraints);
              mainFrame.add(chk1);                 
              gridbag.setConstraints(chk2,constraints);
              mainFrame.add(chk2);		
              constraints.gridwidth=GridBagConstraints.REMAINDER;
              gridbag.setConstraints(chk3,constraints);
              mainFrame.add(chk3);

              constraints.weightx=1;
              constraints.gridwidth=1;
              Label labl2=new Label("�����ı���ɫ��");
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
              Label labl3=new Label("���ñ�����ɫ��");
              gridbag.setConstraints(labl3,constraints);
              mainFrame.add(labl3);
              cho.add("��ɫ");                   //��ѡ����뵽�б����
              cho.add("��ɫ");
              cho.add("��ɫ");
              cho.add("��ɫ");
              cho.addItemListener(new MyChoItemListener());     //�����ڲ������Ϊcho�ļ�����

              constraints.gridwidth=GridBagConstraints.REMAINDER;
              gridbag.setConstraints(cho,constraints);
              mainFrame.add(cho);

              constraints.weightx=1;
              constraints.gridwidth=1;
              Label labl4=new Label("���ú�Ч��:");
              gridbag.setConstraints(labl4,constraints);
              mainFrame.add(labl4);

              constraints.weightx=1;
              constraints.gridwidth=GridBagConstraints.REMAINDER;;
              gridbag.setConstraints(ta1,constraints);
              mainFrame.add(ta1);
              //�˵����
		mb.add(mn1);              //��mn1����mb��
		mb.add(mn2);
	        mb.add(mn3);
		mn1.addSeparator();          //��һ�ָ���
		mn1.add(mi1);               //��mi1���뵽mn1��
		mn1.add(mi2);
		mn1.add(mi3);
		mn1.addSeparator(); 
		mn2.addSeparator(); 
		mn2.add(cbmi1);             //��Ӵ���ѡ��Ĳ˵���
		mn2.add(cbmi2);       
		mn2.add(cbmi3);         
		mn2.addSeparator(); 
		mn3.addSeparator(); 
		mn3.add(mi4);                 // ��mi4���뵽mn2��
		mn3.addSeparator(); 
		mainFrame.setMenuBar(mb);    //����mainFrame�Ĳ˵���Ϊmb
		Pop_m1=new MenuItem("��ɫ");
		Pop_m2=new MenuItem("��ɫ");
		Pop_m3=new MenuItem("��ɫ");
		pm.add(Pop_m1);              //�򵯳�ʽ�˵�����Ӳ˵���
		pm.add(Pop_m2);
		pm.add(Pop_m3);
		//�����ڲ���Ϊ�����˵���ļ�����
		Pop_m1.addActionListener(new MyMenuActionListener());
		Pop_m2.addActionListener(new MyMenuActionListener());
		Pop_m3.addActionListener(new MyMenuActionListener());
		mainFrame.add(pm);                //������ʽ�˵�������mainFrame��
		ta1.addMouseListener(new MyMenuMouseListener());  //�����ڲ���Ϊta1�ļ�����
		mi1.addActionListener(new MyMenuActionListener()); 
		mi2.addActionListener(new MyMenuActionListener());
		mi3.addActionListener(new MyMenuActionListener());
		cbmi1.addItemListener(new MyMenuCbItemListener());
	    cbmi2.addItemListener(new MyMenuCbItemListener());
	    cbmi3.addItemListener(new MyMenuCbItemListener());
		mi4.addActionListener(new MyMenuActionListener());
		mainFrame.setVisible(true);
	}
	 //��ѡ��ѡ���¼��ദ�����
	 public void itemStateChanged(ItemEvent e){    //�¼�����ʱ�Ĵ������
	 	Checkbox chk=(Checkbox)e.getSource();   //����¼�Դ��ǿ�ƽ���ת����Checkbox����
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
	//�����б���¼��������
	 static class MyChoItemListener implements ItemListener
	 { 	public void itemStateChanged(ItemEvent e)   //�������¼��ĳ������
	 	{	String clr=cho.getSelectedItem();     //ȡ�ñ�ѡ��ѡ�������
	 		if (clr=="��ɫ") ta1.setBackground(Color.RED);
	 		else if (clr=="��ɫ") ta1.setBackground(Color.GREEN);
	 		else if (clr=="��ɫ") ta1.setBackground(Color.BLUE);
	 		else if (clr=="��ɫ") ta1.setBackground(Color.YELLOW);
	 		mainFrame.setTitle("��ѡ����["+clr+"]��ɫ");   //���ô��ڵı���
	 		ta1.setText(clr);
	 	}
	 }
	  //�˵����¼�����
	 static class MyMenuActionListener implements ActionListener{
	 	public void actionPerformed(ActionEvent e)   //�����¼��ĳ������
	 	{	MenuItem mi=(MenuItem)e.getSource();   //ȡ�������¼��Ķ���
	 		String miLab=mi.getLabel();            //ȡ�ò˵�������ֱ���
	 		if (miLab =="��ɫ") ta1.setBackground(Color.RED);
	 		else if (miLab =="��ɫ") ta1.setBackground(Color.GREEN);
	 		else if (miLab =="��ɫ") ta1.setBackground(Color.BLUE);
	 		else if (mi ==mi4) mainFrame.dispose();               //�رմ��ڣ��ͷ���Դ
	 		mainFrame.setTitle("����������ɫΪ["+ miLab +"]��ɫ");   //���ô��ڵı���
	 	}
	 }
      //����ѡ��˵����¼��ĳ������
	static class MyMenuCbItemListener implements ItemListener {
	  	public void itemStateChanged(ItemEvent e) 
	 	{    boolean yn1=cbmi1.getState();
	 		boolean yn2=cbmi2.getState();
	 		boolean yn3=cbmi3.getState();
	 		int state=0;
	 		if (yn1) state= Font.PLAIN;
	 		if (yn2) state= state+Font.BOLD;
	 		if (yn3) state=state+Font.ITALIC;	 		
	 		if (yn1||yn2||yn3)ta1.setFont(new Font("����_GB2312",state,15));
	 		else ta1.setFont(new Font("����",Font.PLAIN,15));
	 		chk1.setState(cbmi1.getState());
	 		chk2.setState(cbmi2.getState());
	 		chk3.setState(cbmi3.getState());
	 	}
	} 
       //�ı�������¼��������
	 static class MyMenuMouseListener extends MouseAdapter{
	 	public void mouseReleased(MouseEvent mce)     //�ͷ����ʱ�������¼�
	 	{	if(mce.isPopupTrigger())         //�ж�����¼��Ƿ����ɵ����˵�����
	 		pm.show((Component)mce.getSource(),mce.getX(),mce.getY());
	 	}
	 }
}
