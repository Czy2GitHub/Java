package ʵ�鱨��6;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * 1����дһ��Ӧ�ó���CalendarMain��Ҫ�󣺸ô�����CalendarFrameΪBroderLayout���֣�
 * �����������һ��JPanel����pCenter��pCenter��7��7�е�GridLayout���� 
 * ��pCenter�з���49����ǩ��������ʾ������
2�����ڱ������һ��JPanel����pNorth��pNorth��FlowLayout���֣�
 * pNorth����nextMonth��previousMonth������ť������nextMonth��ť��
 * ������ʾ��ǰ�µ���һ���µ�����������previousMonth��ť��������ʾ��ǰ�µ���һ���µ�������

 * @author dell
 *
 */
public class CalendarFrame extends JFrame {
	//��Ա����
	int temp = 6;
	JPanel	pCenter = new JPanel();
	JPanel  pNorth;
	JButton jb1,jb2;
	JButton []daysButton = new JButton[7];
	String []str = {"��","һ","��","��","��","��","��"};
	JLabel  lWorth;
	JLabel []days = new JLabel[49];;
	static int years = 2019;
	static int month = 6;
	int []sky =	{31,28,31,30,31,30,31,31,30,31,30,31};
	int count = 0 ;
	
	public void setPCenter() {
		for(JButton j : daysButton) {
			j = new JButton(" ");
		}
		for(JLabel j : days ) {
			j = new JLabel(" ");
		}
	}
	public void initialization() {
		switch(month) {
		case 1 :{
			count = 31;
			temp = 2;
			break;
		}
		case 3:{
			count = 31;
			temp = 5;
			break;
		}
		case 5:{
			count = 31;
			temp = 3;
			break;
		}
		case 7:{
			count = 31;
			temp = 1;
			break;
		}
		case 8:{
			count = 31;
			temp = 4;
			break;
		}
		case 10:{
			count = 31;
			temp = 2;
			break;
		}
		case 12:{
			count = 31;
			break;
		}
		case 2:{
			count = sky[1];
			temp = 5;
			break;
		}
		case 4:{
			count = 30;
			temp = 1;
			break;
		}
		case 6:{
			count = 30;
			temp = 6;
			break;
		}
		case 9:{
			count = 30;
			break;
		}
		case 11:{
			count = 30;
			temp = 5;
			break;
		}
		}
	}
	
	
	
	
	
	
	//���
	public void addPCenter() {
		int j = 1;
		pCenter.setLayout(new GridLayout(8,7));
		for(int i = 0 ;i < 7;i++) {
			daysButton[i] = new JButton(str[i]);
			pCenter.add(daysButton[i]);
		}
		for(int i = 0; i < temp ; i++ ) {
			days[i] = new JLabel(" ");
			pCenter.add(days[i]);
			days[i].setText(" ");
		}
		for(int i = temp ; i < 49;i++) {
			if(j <= sky[month]) {
			days[i] = new JLabel(Integer.toString(j));
			pCenter.add(days[i]);
			j++;
			}else {
				days[i] = new JLabel(" ");
				pCenter.add(days[i]);
			}
		}
		add(pCenter,BorderLayout.CENTER);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void updatePCenter() {
	
		
		
		
	}
	
	
	
	
	
	
	
	
	//�ж�����
	public void judge() {
		if((years % 4 == 0&&years % 100 !=0)||(years % 400 ==0)) {
			sky[1]++;
		}
	}
	public void test() {
		System.out.println("��������!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//��ӵ�����
	public void addPNorth() {
		pNorth = new JPanel();
		jb1 = new JButton("nextMonth");
		jb2 = new JButton("previousMonth");
		jb1.addActionListener(new ButtonListener());
		jb2.addActionListener(new ButtonListener());
		pNorth.setLayout(new FlowLayout(FlowLayout.CENTER));
		pNorth.add(jb1);
		pNorth.add(jb2);
		add(pNorth,BorderLayout.NORTH);
	}
	
	//��ʽ����
	public void LayOut() {
	setLayout(new BorderLayout(2,2));
	
	}
	
	
	
	










	//��ʼ������
	public CalendarFrame() {
			// TODO Auto-generated constructor stub
		setWindows();
		}
		public void setWindows() {
			setTitle("CalendarMain");
			setSize(600,600);
			setLocation(250,250);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLayout(new BorderLayout());
		}

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		





		//������
		public static void main(String[] args) {
			CalendarFrame cf =	new CalendarFrame();
			cf.LayOut();
			cf.addPNorth();
			cf.setPCenter();
			cf.addPCenter();
			cf.setVisible(true);
			
		}
		//Ϊ����������ť����¼�
		class ButtonListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				int j = 1;
				String massage = e.getActionCommand();
				if("previousMonth".equals(massage)) {
				month--;
				System.out.println("�·ݼ�һ!");
				if(month > 12) {
					month = 1;
					years++;
				}
				System.out.println(month);
				switch(month) {
				case 1 :{
					count = 31;
					temp = 2;
					break;
				}
				case 3:{
					count = 31;
					temp = 5;
					break;
				}
				case 5:{
					count = 31;
					temp = 3;
					break;
				}
				case 7:{
					count = 31;
					temp = 1;
					break;
				}
				case 8:{
					count = 31;
					temp = 4;
					break;
				}
				case 10:{
					count = 31;
					temp = 2;
					break;
				}
				case 12:{
					count = 31;
					break;
				}
				case 2:{
					count = sky[1];
					temp = 5;
					break;
				}
				case 4:{
					count = 30;
					temp = 1;
					break;
				}
				case 6:{
					count = 30;
					temp = 6;
					break;
				}
				case 9:{
					count = 30;
					break;
				}
				case 11:{
					count = 30;
					temp = 5;
					break;
				}
				}
				/*
				for(int i = 0 ; i < 49 - temp -1 ;i++) {
					if(i <= count ) {
						days[i+temp ].setText(Integer.toString(i));
					}else {
						days[i].setText(" ");
					}
				}
				*/
				for(int i = 0; i< temp ;i++) {
					days[i].setText(" ");
				}
				for(int i = temp ; i < 49;i++) {
					if(j <= sky[month]) {
					days[i].setText(Integer.toString(j));
					j++;
					}else {
						days[i].setText(" ");
					}
			}
				}else {
					month++;
					System.out.println("�·ݼ�һ��");
					System.out.println(month);
					switch(month) {
					case 1 :{
						count = 31;
						temp = 2;
						break;
					}
					case 3:{
						count = 31;
						temp = 5;
						break;
					}
					case 5:{
						count = 31;
						temp = 3;
						break;
					}
					case 7:{
						count = 31;
						temp = 1;
						break;
					}
					case 8:{
						count = 31;
						temp = 4;
						break;
					}
					case 10:{
						count = 31;
						temp = 2;
						break;
					}
					case 12:{
						count = 31;
						break;
					}
					case 2:{
						count = sky[1];
						temp = 5;
						break;
					}
					case 4:{
						count = 30;
						temp = 1;
						break;
					}
					case 6:{
						count = 30;
						temp = 6;
						break;
					}
					case 9:{
						count = 30;
						break;
					}
					case 11:{
						count = 30;
						temp = 5;
						break;
					}
					}
					/*
					for(int i = 0 ; i < 49 - temp -1 ;i++) {
						if(i <= count ) {
							days[i+temp ].setText(Integer.toString(i));
						}else {
							days[i].setText(" ");
						}
					}
					*/
					for(int i = 0; i< temp ;i++) {
						days[i].setText(" ");
					}
					for(int i = temp ; i < 49;i++) {
						if(j <= sky[month]) {
						days[i].setText(Integer.toString(j));
						j++;
						}else {
							days[i].setText(" ");
						}
				}
					
					
					
				}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}

