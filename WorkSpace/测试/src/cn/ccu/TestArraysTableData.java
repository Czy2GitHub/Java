package cn.ccu;

import java.util.Arrays;

/**
 * 测试数组存储表格数据
 * @author dell
 *
 */
public class TestArraysTableData {
	public static void main(String[] args) {
	Object[] emp1 = {1001,"睿智",18,"金牌讲师","2008.06.04"};
	Object[] emp2 = {1002,"睿2智",15,"讲师","2018.06.04"};
	Object[] emp3 = {1003,"睿3智",19,"金讲师","2009.06.04"};
	Object[][] emps = new Object[3][];
	emps[0] = emp1;
	emps[1] = emp2;
	emps[2] = emp3;
	for(Object[]temp:emps) {
		System.out.println(Arrays.toString(temp));
	}
}
}
