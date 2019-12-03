package Week_13th;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/**
 * 双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
 * 红色球号码从1—33中选择；
 * 蓝色球号码从1—16中选择；
 * 请随机生成一注双色球号码。
 * （要求同色号码不重复）
 * @author dell
 *
 */
public class Test2_4 {
	private static void inputRed(HashSet<String> ha,int a) {					//生成红球						
		for(int i = 0 ; i < a ; i++) {
			ha.add("红球 "+(int)(Math.random()*33+1));
		}
	}
	private static String inputBlue() {					//生成篮球
		int s = (int)(Math.random()*16+1);
		return "蓝球 "+s;
	}
	private static int shunxu() {					//蓝球位置
		int i = (int)(Math.random()*7+1);
		return i;
	}
	public static void main(String[] args) {
		HashSet <String>ha = new HashSet<String>();
		inputRed(ha,6);			
		List<String> li = new ArrayList();				
		for(String i : ha) {					//将红球先行导入
			li.add(i);	
		}
		li.add(shunxu(),inputBlue());				//将篮球插入其中
		for(String j : li) {						//输出数组
			System.out.println(j);
		}
	}
}
