package cn.ccu;
/**
 * 猎人类
 * @author dell
 *
 */
public class Hunter {
	private String name;	//名称
	private int life;		//生命值
	private String weapon;	//武器
	private boolean isLive;	//存活
	public Hunter(String name) {	//构造方法
		this.name = name;
		this.isLive = true;
		this.life = 100;
		this.weapon = "小刀";
	}	
	public String getName() {		//gettingandsetting
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public boolean isLive() {
		return isLive;
	}
	public void setLive(boolean isLive) {
		this.isLive = isLive;
	}
	//攻击
	public void fight(Monster m){
		if(m.isLive()) {
			if(this.getWeapon() == "小刀") {
				m.setLife(m.getLife()-20); 
			}
			if(this.getWeapon() == "长剑") {
				m.setLife(m.getLife()- 100);
			}
		}
		
	}
	//受伤
	public void injured() {
		this.life -= 80;
	}
	//死亡
	public void dead() {
		if(this.life <= 0) {
			this.isLive = false;
			System.out.println(this.name+"倒了!😭");
		}else {
			System.out.println(this.name+"还活着!");
		}		
	}
	//显示状态
	public void show() {
		if(isLive) {			
			System.out.println("猎人姓名:"+this.name);
			System.out.println("武器:"+this.weapon);
			System.out.println("当前生命值:"+this.life);
		}else {
			System.out.println("该角色已经死亡!");
		}
	}
	
}
