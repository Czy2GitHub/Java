package Week_13th;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * 站编号和站名对应关系如下：
         map.put(1, "朱辛庄");
        map.put(2, "育知路");
        map.put(3, "平西府");
        map.put(4, "回龙观东大街");
        map.put(5, "霍营");
        map.put(6, "育新");
         map.put(7, "西小口");
        map.put(8, "永泰庄");
        map.put(9, "林萃桥");
        map.put(10, "森林公园南门");
       map.put(11, "奥林匹克公园");
        map.put(12, "奥体中心");
        map.put(13, "北土城");
将以上对应关系的数据存储到map集合中，key：表示站编号，value：表示站名，并遍历打印(可以不按顺序打印)：
计算地铁票价规则：
       总行程 3站内（包含3站）收费3元，
            3站以上但不超过5站（包含5站）的收费4元，
            5站以上的，在4元的基础上，每多1站增加2元，
            10元封顶；
3.打印格式（需要对键盘录入的上车站和到达站进行判断，如果没有该站，提示重新输入，直到站名存在为止）：
       注意：每站需要2分钟
       请输入上车站：
       沙河
       您输入的上车站：沙河不存在，请重新输入上车站：
       上地
       您输入的上车站：上地不存在，请重新输入上车站：
       朱辛庄
       请输入到达站：
       沙河
       您输入的到达站：沙河不存在，请重新输入到达站：
       西二旗
       您输入的到达站：西二旗不存在，请重新输入到达站：
       西小口
       从朱辛庄到西小口共经过6站收费6元，大约需要 12分钟

 * @author dell
 *
 */
public class Test2_6 {
	public static void main(String[] args) {
		String inStation;
		String outStation;
		int inStation_key = 0 ;
		int outStation_key = 0;
		int change = 0;
		Scanner sc1 = new Scanner(System.in);
		Map<Integer,String>map = new HashMap<Integer,String>();
		int count = 0; 
		map.put(1, "朱辛庄");
	        map.put(2, "育知路");
	        map.put(3, "平西府");
	        map.put(4, "回龙观东大街");
	        map.put(5, "霍营");
	        map.put(6, "育新");
	         map.put(7, "西小口");
	        map.put(8, "永泰庄");
	        map.put(9, "林萃桥");
	        map.put(10, "森林公园南门");
	       map.put(11, "奥林匹克公园");
	        map.put(12, "奥体中心");
	        map.put(13, "北土城");
	        for(Integer i : map.keySet()) {
	        	System.out.println(i+" \t "+map.get(i));
	        }
	        while(true) {
	        	System.out.println("请输入上车站:");
	        	String k = sc1.nextLine();
	        	for(Integer i : map.keySet()) {
	        		if(k.equals(map.get(i)) ) {
	        			count++;
	        		}
	        	}
	        	if(count == 0 ) {
	        		System.out.println("您输入的上车站："+k+"不存在，请重新输入上车站：");
	        	continue;
	        	}
	        	count = 0;
	        	inStation = k;
	        	break;
	        }
	        while(true) {
	        	System.out.println("请输入到达站：");
	        	String str = sc1.nextLine();
	        	for(Integer i : map.keySet()) {
	        		if(str.equals(map.get(i)) ) {
	        			count++;
	        		}
	        	}
	        	if(count == 0 ) {
	        		System.out.println("您输入的到达站："+str+"不存在，请重新输入到达站：");
	        	continue;	
	        	}
	        	outStation = str;
	        	break;
	        }
	        for(int i = 1;i <map.size();i++) {
	        	if(map.get(i).equals(inStation)) {
	        		inStation_key = i;
	        		System.out.println(inStation_key);
	        	}
	        	if(map.get(i).equals(outStation)){
	        		outStation_key = i;
	        		System.out.println(outStation_key);
	        	}
	        }
	        change = outStation_key - inStation_key ; 
	        System.out.println("从"+inStation + "到"+outStation+"共经过"+change+"站收费"+piaoJia(change)+"元,大约需要"+time(change)+"分钟");
	}
	private static int piaoJia(int n) {						//票价
		int count ;
		int c;
		if(n <=3) {
			count = 3;
		}else if(n > 3 && n <= 5  ) {
			count = 4;
		}else {
			c = n - 5 ; 
			count = 4 + 2 * c; 
			if(count > 10) {
				count = 10;
			}
		}
		return count;
	}								
	private static int time(int n) {					//所用时间
		int time = n * 2;
		return time;
	}
}
