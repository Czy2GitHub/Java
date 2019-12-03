package cn.ccu.game;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
/**
 * 制作游戏
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
	int period ; 								//计算时间
	public void launchFrame() {				//初始化游戏窗口
			this.setTitle("宇哥制作");			//标题
			this.setVisible(true);				//使窗口可视化
			this.setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);				//定义窗口大小
			this.setLocation(300,300);			//定义窗口初始位置
			this.addWindowListener(new WindowAdapter() {		// 关闭游戏时自动关闭窗口
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			new PaintThread().start();				//启动窗口
			addKeyListener(new KeyMonitor());		//增加键盘的监听
			for(int i = 0; i < shells.length ;i++) {
				shells[i] = new Shell();
				
			}
	}
		public void paint(Graphics g) {			     //自动被调用，g相当于一支画笔
			g.drawImage(bg,0,0,null);	
			plane1.drawSelf(g);
		for(int i = 0 ;i < shells.length;i++) {				
			shells[i].draw(g);
			boolean peng = shells[i].getRect().intersects(plane1.getRect());				//获取炮弹与小球位置，并判断是否碰撞
			if(peng) {						//如果碰撞，改变飞机live为false
				plane1.live = false;
				if(bao == null) {						//实现飞机死亡爆炸动画
					bao  = new Explode(plane1.x,plane1.y);
					endTime = new Date();
					period = (int)((endTime.getTime() - startTime.getTime())/1000); 
				}
				bao.draw(g);
			}
			if(plane1.live == false) {
				Font f = g.getFont();
				g.setFont(new Font("宋体",Font.BOLD,20));
				g.drawString("您坚持了:"+period+"秒",(int)plane1.x,(int) plane1.y);
				g.setFont(f);
			}
		}
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
	public void keyPressed(KeyEvent e) {			//调用飞机键的按下执行指令
		plane1.addDirection(e);
	}
	public void keyReleased(KeyEvent e) {			//调用飞机键的抬起执行指令
		plane1.minusDirection(e);
	}
}
private Image offScreenImage = null;				//双缓冲解决闪烁

public void update(Graphics g) {
    if(offScreenImage == null)
        offScreenImage = this.createImage(500,500);//这是游戏窗口的宽度和高度
     
    Graphics gOff = offScreenImage.getGraphics();
    paint(gOff);
    g.drawImage(offScreenImage, 0, 0, null);
}   
}