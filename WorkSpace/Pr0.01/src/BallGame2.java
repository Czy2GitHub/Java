import java.awt.*;
import javax.swing.*;


public class BallGame2 extends JFrame{
	
	Image ball= Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk= Toolkit.getDefaultToolkit().getImage("images/desk.png");
	
	
	double x=100;  //С��ĺ�����
	double y=100;  //С���������
	double degree = 3.14/3; //���ȡ��˴����ǣ�60��
	
	//�����ڵķ������Ȼ������ڻ���
	public void paint(Graphics g) {
		System.out.println("������һ��");
	    g.drawImage(desk, 0, 0, null);
	    g.drawImage(ball, (int)x,(int)y, null);//��ball�������nullָ����
	   
	    x = x+10*Math.cos(degree);
	    y= y+10*Math.sin(degree);
	   //�������±߽�
	    if(y>500-40-30||y<40+40) {   //500�Ǵ��ڸ߶ȣ�40�����ӱ߿�30����ֱ�������һ��40�Ǳ������ĸ߶�
	    	degree=-degree;
	    }
	    //�������ұ߽�
	    if(x<0||x>856-30-40) {
	    	degree= 3.14-degree;
	    }
	}
		
	    
	    //���ڼ���
		void launchFrame() {
				setSize(856,500); //���ڴ�С,��͸�,���е�������ʵĴ�С
				setLocation(400,400);//�������ļ��ϵ�λ��
				setVisible(true);
			   //�ػ�����
			    while(true){
			    	repaint();  //�ػ�ָ��
			    	//java �쳣�������
			    	try {
			    		Thread.sleep(40); //40ms,1s=1000ms,��Լһ�뻭20�δ��ڣ�������ͣ��40ms��һ�δ��ڣ�20��
			    	}catch(Exception e) {
			    	e.printStackTrace();	
			    	} 
			    	}
		} 
	    
	
	    	
	
	
	
	
		//main�����ǳ���ִ�е����
	public static void main(String[] args) {
		System.out.println("��Ϸ��Ŀ2");
		BallGame2 game = new BallGame2();
		game.launchFrame();
	}
}
