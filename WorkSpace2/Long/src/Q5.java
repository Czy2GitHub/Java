
public class Q5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 1, 2, 3, 3, 4, 4, 6, 5 };
		int length = nums.length; // ����ĳ���
		if (length == 1) { // ���鳤��Ϊһʱ�����
			return;
		}
		int a = nums[0];
		int b = nums[1];
		int next; // �������һԪ��
		int index = 0; // �±�
		for (int i = 1; i <   length - 1; i++) { // ��һ�Ƚ�
			next = nums[i + 1];
			if (b > a && b > next) {
				index = i;
				break;
			}
			a = b;
			b = next;
		}
		if (nums[0] > nums[1]) { // ����ĵ�һ��Ԫ�ش��ڵڶ���Ԫ�ص����
			index = 0;
		}
		if (nums[length - 1] > nums[length - 2]) { // ��������һ��Ԫ�ش��ڵ����ڶ���Ԫ�ص����
			index = length - 1;
		}
		System.out.println("��Ԫ�ص�����Ϊ��" + index);
	}
}
