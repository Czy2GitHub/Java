package cn.ccu;
/**
 * 导入图片，不可行，闪烁问题严重
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
		this.setTitle("测试GUI");
		this.setVisible(true);
		this.setLocation(300,300);
		this.setSize(500, 500);
		this.addWindowListener(new WindowAdapter() {				//增加窗口监听
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
		});
	new PaintThread().start();
	}
	public static void main(String[] args) {
		new Test2().launchFrame();
	}
	class PaintThread extends Thread{					//Thread线程
		public void run() {
			while(true) {
				repaint();	//重画
				try {										//1s ==1000ms 四十毫秒重画一次,
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
