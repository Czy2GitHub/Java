package cn.ccu;

public class Test {
	public static void main(String[] args) throws Exception {
		Hunter h = new Hunter("文龙🐎");
		h.show();
		Monster m = new Monster("金牌厨师");
		m.show();
		System.out.println("战斗开始！");
		Thread.sleep(2000);
		while(true) {
		System.out.println("我的回合，攻击!");
		h.fight(m); m.injured(h);m.dead();
		if(condition(m, h) == 0){
			break;
		}
		Thread.sleep(1000);
		System.out.println(m.getType()+"的回合");
		m.kill(h);h.dead();condition(m, h);
		if(condition(m, h) == 0){
			break;
		}
		Thread.sleep(1000);
		}
	}
	public static int condition(Monster m, Hunter h) {
		if(m.isLive() == false || h.isLive() == false) {
		return 0;
		}else {
			return 1;
		}
	}
}
