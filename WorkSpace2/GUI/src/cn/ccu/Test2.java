package cn.ccu;
/**
 * ����ͼƬ�������У���˸��������
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class Test2 extends JFrame{
	public Test2() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawLine(0,0,500,500);
	}
	
	public void launchFrame() {
		this.setTitle("����GUI");
		this.setVisible(true);
		this.setLocation(300,300);
		this.setSize(500, 500);
		this.addWindowListener(new WindowAdapter() {				//���Ӵ��ڼ���
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
		});
	new PaintThread().start();
	}
	public static void main(String[] args) {
		new Test2().launchFrame();
	}
	class PaintThread extends Thread{					//Thread�߳�
		public void run() {
			while(true) {
				repaint();	//�ػ�
				try {										//1s ==1000ms ��ʮ�����ػ�һ��,
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
