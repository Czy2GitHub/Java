package Week_4th;
import java.util.Scanner;
/**
 * 2.����һ������ nums ��һ��ֵ val������Ҫԭ���Ƴ�������ֵ���� val ��Ԫ�أ������Ƴ���������³��ȡ�
��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�

 * @author dell
 *
 */
public class Text2_3 {
	public static void main(String[] args) {		//1,2,3,4,5 -->1,3,4,5
		Scanner sc1 = new Scanner(System.in);
		System.out.println("����nums����ĳ��ȣ�");
		int n = sc1.nextInt();				//�������鳤��
		System.out.println("������Ҫɾ��������");
		int val = sc1.nextInt();			//ָ����
		int []nums  = new int[n];
		System.out.println("���������Ա��");
		for(int j = 0;j <nums.length ; j++) {
			nums[j] = sc1.nextInt();
		}
		for(int i = 0;i < nums.length;i++) {
			if(nums[i] == val) {
				if(i < nums.length-1) {
				nums[i] = nums[i+1];
				n--;
				}else if(i == nums.length-1) {
					n--;
				}
			}
		}
		System.out.println("�Ƴ�����������ĳ����ǣ�"+n);
	}
}
