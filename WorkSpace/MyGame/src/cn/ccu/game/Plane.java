package cn.ccu.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.lang.invoke.SwitchPoint;

public class Plane extends GameObject {
	
	 boolean left,right,up,down;
	 boolean live = true;
	 public void drawSelf(Graphics g) {
		 if(live) {						//控制飞机的存活与死亡
		 //飞机的初位置
		 g.drawImage(img, (int)x, (int)y,null);
		//改变飞机的位置
		if(left) {							
			x = x - speed;
		}
		if(right) {
			x = x + speed;
		}
		if(up) {
			y = y - speed;
		}
		if(down) {
			y = y + speed;
		}
	}else {
	}
}
	 //按下一个键，增加相应的方向
	public void addDirection(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left = true;
			break;
		case KeyEvent.VK_UP:
			up = true ;
			break;
		case KeyEvent.VK_DOWN:
			down = true;
			break;
		case KeyEvent.VK_RIGHT:
			right = true;
			break;
		}
		
	}
	//抬起一个键，取消相应的方向
	public void minusDirection(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP:
			up = false;
			break;
		case KeyEvent.VK_DOWN:
			down = false;
			break;
		case KeyEvent.VK_RIGHT:
			right = false;
			break;
		case KeyEvent.VK_LEFT:
			left = false;
			break;
		
				}
			}
				
	public Plane(Image img,double x,double y) {
		this.img = img;
		this.x = x ;
		this.y = y ;
		this.width =img.getWidth(null);
		this.height = img.getHeight(null);
		this.speed = 3;
	}
}
