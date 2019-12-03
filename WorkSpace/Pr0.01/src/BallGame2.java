import java.awt.*;
import javax.swing.*;


public class BallGame2 extends JFrame{
	
	Image ball= Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk= Toolkit.getDefaultToolkit().getImage("images/desk.png");
	
	
	double x=100;  //小球的横坐标
	double y=100;  //小球的纵坐标
	double degree = 3.14/3; //弧度。此处就是：60度
	
	//画窗口的方法，先画桌面在画球
	public void paint(Graphics g) {
		System.out.println("被画了一次");
	    g.drawImage(desk, 0, 0, null);
	    g.drawImage(ball, (int)x,(int)y, null);//画ball这个对象，null指空项
	   
	    x = x+10*Math.cos(degree);
	    y= y+10*Math.sin(degree);
	   //碰到上下边界
	    if(y>500-40-30||y<40+40) {   //500是窗口高度；40是桌子边框；30是球直径；最后一个40是标题栏的高度
	    	degree=-degree;
	    }
	    //碰到左右边界
	    if(x<0||x>856-30-40) {
	    	degree= 3.14-degree;
	    }
	}
		
	    
	    //窗口加载
		void launchFrame() {
				setSize(856,500); //窗口大小,宽和高,自行调试最合适的大小
				setLocation(400,400);//程序在文件上的位置
				setVisible(true);
			   //重画窗口
			    while(true){
			    	repaint();  //重画指令
			    	//java 异常处理机制
			    	try {
			    		Thread.sleep(40); //40ms,1s=1000ms,大约一秒画20次窗口；设置暂停，40ms画一次窗口，20桢
			    	}catch(Exception e) {
			    	e.printStackTrace();	
			    	} 
			    	}
		} 
	    
	
	    	
	
	
	
	
		//main方法是程序执行的入口
	public static void main(String[] args) {
		System.out.println("游戏项目2");
		BallGame2 game = new BallGame2();
		game.launchFrame();
	}
}
