/**
 * 商场幸运抽奖活动程序设计。
抽奖规则：
      顾客的四位会员卡号的各位数字之和大于20，则为幸运顾客。
运行结果如下图所示：

 */
package Week_3rd;
import java.util.*;

public class Text8 {
		public static void main(String[] args) {
				System.out.println("请输入你的会员卡号:");
				Scanner flag = new Scanner(System.in);
				int card  = flag.nextInt();
				int sum = (card/1000)%10+(card/100)%10+(card/10)%10+card%10;
				System.out.println("会员卡号"+card+"各位之和:"+sum);
				boolean i = true;
				System.out.print("是幸运用户吗?");
				if(sum > 20) {
					System.out.print(i);
				}else {
					i = false;
					System.out.print(i);
				}
		}
}
