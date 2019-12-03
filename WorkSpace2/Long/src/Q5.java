
public class Q5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 1, 2, 3, 3, 4, 4, 6, 5 };
		int length = nums.length; // 数组的长度
		if (length == 1) { // 数组长度为一时的情况
			return;
		}
		int a = nums[0];
		int b = nums[1];
		int next; // 数组的下一元素
		int index = 0; // 下标
		for (int i = 1; i <   length - 1; i++) { // 逐一比较
			next = nums[i + 1];
			if (b > a && b > next) {
				index = i;
				break;
			}
			a = b;
			b = next;
		}
		if (nums[0] > nums[1]) { // 数组的第一个元素大于第二个元素的情况
			index = 0;
		}
		if (nums[length - 1] > nums[length - 2]) { // 数组的最后一个元素大于倒数第二个元素的情况
			index = length - 1;
		}
		System.out.println("该元素的索引为：" + index);
	}
}
