import java.awt.*;
import javax.swing.*;


public class BallGame extends JFrame{
	
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk= Toolkit.getDefaultToolkit().getImage("images/desk.png");
	
	
	double x=100;  //小球的横坐标
	double y=100;  //小球的纵坐标
	boolean right=true;  //方向，向右
	
	//画窗口的方法，先画桌面在画球
	public void paint(Graphics g) {
		System.out.println("被画了一次");
	    g.drawImage(desk, 0, 0, null);
	    g.drawImage(ball, (int)x,(int)y, null);//画ball这个对象，null指空项
	   
	    if(right) {
	    	x=x+10;
	    }else
	    x=x-10;  //，改变小球坐标，移动小球 ，数字能“控制球的速度“
	    if(x>856-40-30) {  //856是窗口宽度，40是桌子边框的宽度，30是小球的直径
	    	right=false;
	    } 
	    if(x<40)
	    	right=true;
	}
		
	    
	    //窗口加载
		void launchFrame() {
				setSize(100,100); //窗口大小,宽和高,自行调试最合适的大小
				setLocation(50,50);//位置
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
		BallGame game = new BallGame();
		game.launchFrame();
	}
}
