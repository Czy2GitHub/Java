package cn.ccu;
//BorderLayout_Exam.java BorderLayout���Ӧ��
import java.awt.*;
public class BorderLayout_Exam extends Frame{
	static Frame mainFrame = new Frame("�߽粼�ֹ��������Ӧ��ʾ��!"); 
	public static void main(String args[ ]){
		BorderLayout border=new BorderLayout(2,4);
		mainFrame.setLayout(border);             //����ҳ�沼��ΪBorderLayout
		mainFrame.setSize(250,250);
		mainFrame.setBackground(Color.green);   //���ô��ڵ�ɫΪ��ɫ
		mainFrame.setLocation(150,150);
		mainFrame.add(new Button("��"), BorderLayout.NORTH);
		mainFrame.add(new Button("��"), BorderLayout.SOUTH);
		mainFrame.add(new Button("��"), BorderLayout.EAST);
		mainFrame.add(new Button("��"), BorderLayout.WEST);
		mainFrame.add(new Button("����"), BorderLayout.CENTER);
		mainFrame.setVisible(true);
	}
}
