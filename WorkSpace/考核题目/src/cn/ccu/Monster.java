package cn.ccu;

public class Monster {
	private String type;			//僵尸类型
	private boolean isLive;			//是否存活
	private int life;				//生命值
	public String getType() {		//gettingandsetting
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isLive() {
		return isLive;
	}
	public void setLive(boolean isLive) {
		this.isLive = isLive;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	//受伤
	public Monster(String type) {
		this.type = type;
		this.isLive = true;
		this.life = 1000;
	}
	public void  injured(Hunter h) {
		if(h.getWeapon() == "小刀") {
			this.life -= 20; 
		}
		if(h.getWeapon() == "长剑") {
			this.life -= 100;
		}
	}
	//还击
	public void kill(Hunter h) {
		if(h.isLive()) {
			h.setLife(h.getLife()-80);
		}else {
			System.out.println("无法还击，该角色已经死亡!");
		}
	}
	//死亡
	public void dead() {
		if(this.life <= 0) {
			this.isLive = false;
			System.out.println(this.type+"倒了!😭");
		}else {
			System.out.println(this.type+"还活着!");
		}		
	}
	//显示状态
	public void show() {
		if(this.isLive) {
			System.out.println("类型:"+this.type);
			System.out.println("当前生命值:"+this.life);
		}
		
	}
	
	
}
