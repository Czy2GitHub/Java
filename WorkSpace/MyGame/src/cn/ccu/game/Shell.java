package cn.ccu.game;

import java.awt.Color;
import java.awt.Graphics;

/**
 * 定义炮弹
 * @author dell
 *
 */
public class Shell extends GameObject {
	double degree;	
	public Shell(){
			x = 100;
			y = 100;
			width = 10;
			speed = 4;
			height = 10;
			degree = Math.random()*Math.PI*2;
		}
	public void draw(Graphics g) {
		Color c =g.getColor();
		g.setColor(Color.YELLOW);
		g.fillOval((int)x, (int)y, width, height);
		//控制炮弹飞行角度
		
		x = x + speed*Math.cos(degree);
		y = y + speed*Math.sin(degree);
		if(x < 10 ||x > Constant.GAME_WIDTH - 10 - 10) {
			degree = Math.PI - degree;
		}
		if(y < 40||y > Constant.GAME_HEIGHT - 10 - 10) {
			degree = -degree; 
		}
		g.setColor(c);
	}
}
