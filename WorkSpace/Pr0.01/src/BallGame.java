import java.awt.*;
import javax.swing.*;


public class BallGame extends JFrame{
	
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk= Toolkit.getDefaultToolkit().getImage("images/desk.png");
	
	
	double x=100;  //С��ĺ�����
	double y=100;  //С���������
	boolean right=true;  //��������
	
	//�����ڵķ������Ȼ������ڻ���
	public void paint(Graphics g) {
		System.out.println("������һ��");
	    g.drawImage(desk, 0, 0, null);
	    g.drawImage(ball, (int)x,(int)y, null);//��ball�������nullָ����
	   
	    if(right) {
	    	x=x+10;
	    }else
	    x=x-10;  //���ı�С�����꣬�ƶ�С�� �������ܡ���������ٶȡ�
	    if(x>856-40-30) {  //856�Ǵ��ڿ�ȣ�40�����ӱ߿�Ŀ�ȣ�30��С���ֱ��
	    	right=false;
	    } 
	    if(x<40)
	    	right=true;
	}
		
	    
	    //���ڼ���
		void launchFrame() {
				setSize(100,100); //���ڴ�С,��͸�,���е�������ʵĴ�С
				setLocation(50,50);//λ��
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
		BallGame game = new BallGame();
		game.launchFrame();
	}
}
