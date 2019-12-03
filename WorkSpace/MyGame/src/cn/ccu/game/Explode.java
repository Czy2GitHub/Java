package cn.ccu.game;
 
import java.awt.Graphics;
import java.awt.Image;
 
/**
 * 爆炸类
 */
public class Explode {
    double x,y;
    static Image[] imgs = new Image[16];
    static {
        for(int i=0;i<16;i++){
            imgs[i] = GameUtil.getImage("image/explode/e"+(i+1)+".gif");		//将图片依次存入数组
            imgs[i].getWidth(null);
        }
    }
     
    int count;
     
    public void draw(Graphics g){							//输出数组，十六张图片
        if(count<=15){
            g.drawImage(imgs[count], (int)x, (int)y, null);
            count++;
        }
    }
     
    public Explode(double x,double y){
        this.x = x;
        this.y = y;
    }
}