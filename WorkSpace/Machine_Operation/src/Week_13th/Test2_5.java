package Week_13th;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
/**Map集合的使用：
现在有一个map集合如下：
Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
要求：
1.遍历集合，并将序号与对应人名打印。
2.向该map集合中插入一个编码为5姓名为李晓红的信息
       3.移除该map中的编号为1的信息
       4.将map集合中编号为2的姓名信息修改为"周林"

 * 
 * @author dell
 *
 */
public class Test2_5 {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
      for(Integer i : map.keySet()) {				//	打印编号人名
    	  System.out.println(i+" \t "+map.get(i));
      }
      map.put(5, "李晓红");						//插入
      map.remove(1);							//移除
      map.put(2,"周林");						//更改姓名
      	System.out.println("------------------------新--------------------------");
      for(Integer i : map.keySet()) {
      System.out.println(i + " \t "+map.get(i));
      }
	}
}
