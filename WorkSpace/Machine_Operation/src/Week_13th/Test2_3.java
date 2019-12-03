package Week_13th;
import java.util.Iterator;
import java.util.LinkedList;
/**
 * 已知数组存放一批QQ号码，QQ号码最长为11位，
 * 最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
 * 将该数组里面的所有qq号都存放在LinkedList中，
 * 将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。
 * @author dell
 *
 */
public class Test2_3 {
		public static void main(String[] args) {
			LinkedList <String>link = new LinkedList<String>();
			String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
			for(String s : strs) {							//将数组导入框架
				link.add(s);
			}
			for(int i = 0 ;i  < link.size();i++) {						//双重for循环查找
				for(int j = i + 1 ; j <link.size() ;j++) {
					if(link.get(i).equals(link.get(j))) {
						link.remove(j);									//删除元素
					}
				}
			}
			for(String lin : link) {										//增强for循环打印
				System.out.print(lin+" ");
			}
			System.out.println();
			Iterator <String>it = link.iterator();							//迭代器打印
			while(it.hasNext()) {										//如果迭代中有更多元素
				String value = it.next();								//将it下一位置元素值存入value
				System.out.print(value+" ");							//打印
			}
		}
}
