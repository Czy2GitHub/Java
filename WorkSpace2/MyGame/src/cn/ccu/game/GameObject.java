package cn.ccu.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

/**
 * 定义相似属性（飞机）（炮弹）（小车）
 * @author dell
 *
 */
public class GameObject {
		Image img;
		double x,y;
		double speed;
		int width,height;
		public void drawSelf(Graphics g) {					//画物体本身
			g.drawImage(img, (int)x,(int)y,null);
		}
		public GameObject(Image img, double x, double y, double speed, int width, int height) {
			super();
			this.img = img;
			this.x = x;
			this.y = y;
			this.speed = speed;
			this.width = width;
			this.height = height;
		}
		public GameObject(Image img, double x, double y) {
			super();
			this.img = img;
			this.x = x;
			this.y = y;
		}
		public GameObject() {
		}
		/**
		 * 用于碰撞检测；
		 */
		public Rectangle getRect() {
			return new Rectangle((int)x,(int)y,width,height);
		}
		
}
