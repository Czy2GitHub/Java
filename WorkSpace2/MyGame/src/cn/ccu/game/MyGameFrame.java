package cn.ccu.game;
import java.awt.event.*;
import java.awt.*;
/**
 * 制作游戏
 * @author dell
 *
 */
import javax.swing.JFrame;
public class MyGameFrame extends JFrame {
	Image bg = GameUtil.getImage("image/5.png");
	Image plane = GameUtil.getImage("image/211.jpg");	

	Plane plane1 = new Plane(plane,250,250);
	public void launchFrame() {				//初始化游戏窗口
			this.setTitle("宇哥制作");			//标题
			this.setVisible(true);				//使窗口可视化
			this.setSize(500, 500);				//定义窗口大小
			this.setLocation(300,300);			//定义窗口初始位置
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			new PaintThread().start();				//启动窗口
			addKeyListener(new KeyMonitor());		//增加键盘的监听
		}
		public void paint(Graphics g) {			     //自动被调用，g相当于一支画笔
			
			plane1.drawSelf(g);	g.drawImage(bg,0,0,null);
		} 
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
		
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
class KeyMonitor extends KeyAdapter {				//定义一个键盘监听的内部类
	public void keyPressed(KeyEvent e) {			//键的按下
		System.out.println(e.getKeyCode());
	}
	public void keyReleased(KeyEvent e) {			//键的抬起
		System.out.println(e.getKeyCode());
	}
}
}