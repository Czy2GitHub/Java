package cn.ccu.game;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
/**
 * ������Ϸ
 * @author dell
 *
 */
import javax.swing.JFrame;
public class MyGameFrame extends Frame {
	Image bg = GameUtil.getImage("image/1.png");
	Image plane = GameUtil.getImage("image/211.png");	
	Shell[] shells = new Shell[10];
	Plane plane1 = new Plane(plane,250,250);
	Explode bao;
	Date startTime = new Date();
	Date endTime ;
	int period ; 								//����ʱ��
	public void launchFrame() {				//��ʼ����Ϸ����
			this.setTitle("�������");			//����
			this.setVisible(true);				//ʹ���ڿ��ӻ�
			this.setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);				//���崰�ڴ�С
			this.setLocation(300,300);			//���崰�ڳ�ʼλ��
			this.addWindowListener(new WindowAdapter() {		// �ر���Ϸʱ�Զ��رմ���
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			new PaintThread().start();				//��������
			addKeyListener(new KeyMonitor());		//���Ӽ��̵ļ���
			for(int i = 0; i < shells.length ;i++) {
				shells[i] = new Shell();
				
			}
	}
		public void paint(Graphics g) {			     //�Զ������ã�g�൱��һ֧����
			g.drawImage(bg,0,0,null);	
			plane1.drawSelf(g);
		for(int i = 0 ;i < shells.length;i++) {				
			shells[i].draw(g);
			boolean peng = shells[i].getRect().intersects(plane1.getRect());				//��ȡ�ڵ���С��λ�ã����ж��Ƿ���ײ
			if(peng) {						//�����ײ���ı�ɻ�liveΪfalse
				plane1.live = false;
				if(bao == null) {						//ʵ�ַɻ�������ը����
					bao  = new Explode(plane1.x,plane1.y);
					endTime = new Date();
					period = (int)((endTime.getTime() - startTime.getTime())/1000); 
				}
				bao.draw(g);
			}
			if(plane1.live == false) {
				Font f = g.getFont();
				g.setFont(new Font("����",Font.BOLD,20));
				g.drawString("�������:"+period+"��",(int)plane1.x,(int) plane1.y);
				g.setFont(f);
			}
		}
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
	public void keyPressed(KeyEvent e) {			//���÷ɻ����İ���ִ��ָ��
		plane1.addDirection(e);
	}
	public void keyReleased(KeyEvent e) {			//���÷ɻ�����̧��ִ��ָ��
		plane1.minusDirection(e);
	}
}
private Image offScreenImage = null;				//˫��������˸

public void update(Graphics g) {
    if(offScreenImage == null)
        offScreenImage = this.createImage(500,500);//������Ϸ���ڵĿ�Ⱥ͸߶�
     
    Graphics gOff = offScreenImage.getGraphics();
    paint(gOff);
    g.drawImage(offScreenImage, 0, 0, null);
}   
}