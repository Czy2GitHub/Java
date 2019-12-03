package cn.ccu.game;
import java.awt.event.*;
import java.awt.*;
/**
 * ������Ϸ
 * @author dell
 *
 */
import javax.swing.JFrame;
public class MyGameFrame extends JFrame {
	Image bg = GameUtil.getImage("image/5.png");
	Image plane = GameUtil.getImage("image/211.jpg");	

	Plane plane1 = new Plane(plane,250,250);
	public void launchFrame() {				//��ʼ����Ϸ����
			this.setTitle("�������");			//����
			this.setVisible(true);				//ʹ���ڿ��ӻ�
			this.setSize(500, 500);				//���崰�ڴ�С
			this.setLocation(300,300);			//���崰�ڳ�ʼλ��
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			new PaintThread().start();				//��������
			addKeyListener(new KeyMonitor());		//���Ӽ��̵ļ���
		}
		public void paint(Graphics g) {			     //�Զ������ã�g�൱��һ֧����
			
			plane1.drawSelf(g);	g.drawImage(bg,0,0,null);
		} 
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
		
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
class KeyMonitor extends KeyAdapter {				//����һ�����̼������ڲ���
	public void keyPressed(KeyEvent e) {			//���İ���
		System.out.println(e.getKeyCode());
	}
	public void keyReleased(KeyEvent e) {			//����̧��
		System.out.println(e.getKeyCode());
	}
}
}