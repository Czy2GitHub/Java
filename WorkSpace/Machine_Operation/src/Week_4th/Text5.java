package Week_4th;
/**
 * ����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ
����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�
ʾ��:
���� nums = [2, 7, 11, 15], target = 9
��Ϊ nums[0] + nums[1] = 2 + 7 = 9
���Է��� [0, 1]

 * @author dell
 *
 */
public class Text5 {
			public static void main(String[] args) {
				int [] nums =  new int[] {2,7,11,15};
				int target = 9;
				Execute ex = new Execute();
				ex.count(nums, target);
				System.out.println("["+ex.ret1()+","+ex.ret()+"]");
			}
}
class Execute{
	private	int reserve;
	private	int reserve1;   				//��������
	public void count(int []a,int value) {				//a[i] + a[j] = value;
		int temp = 1;
		int k = 0;			//������
		int j = 0;
	for(int i = 0;i < a.length ;i++) {
		for(j = 0;j<a.length;j++) {
			if(i == j) {
				continue;
			}
			if(a[i] + a[j] == value) {
				reserve = i;
				reserve1 = j;
				temp--;
				break;
		}	
		}
		j = 0;
	}
	if(temp == 1) {
		System.out.println("��Ŀ��ֵ�����������е�Ԫ����ɣ�");
	}
	}
	public int ret() {
		return  reserve;
	}
	public int ret1() {
		return reserve1;
	}
}
	