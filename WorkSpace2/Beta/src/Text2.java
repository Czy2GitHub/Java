/**
 * ��һ�δ���������double�͵���x��y�Ƿ���ȡ�
 * ����Ӧ�ֱܷ����������Ƿ�Ϊ�������Ƿ�Ϊ�ա����������ȣ���������ȷ��ʾ����������
 * @author dell
 *
 */

public class Text2 {
	boolean count(double n,double j){
		if(n == Double.NaN ) {
			System.out.println("����Ϊ��!");
		}else if(j == Double.NaN){
			System.out.println("����Ϊ��!");
		}else if(n == Double.POSITIVE_INFINITY) {
			System.out.println("���������");
		}else if(j == Double.NEGATIVE_INFINITY) {
			System.out.println("��������С��");
		}
		return n == j;
	}
	public static void main(String[] args) {
		double x = Double.POSITIVE_INFINITY; 
		double y = Double.NEGATIVE_INFINITY;
		Text2 i = new Text2();
		i.count( x,y);
	}
	
}
