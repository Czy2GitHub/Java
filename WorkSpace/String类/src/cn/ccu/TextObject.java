package cn.ccu;
/**
 * ����String����
 * @author dell
 *
 */
public class TextObject {
	public static void main(String[] args) {
		String str = "core Java";
		String str1 = "Core Java";
		System.out.println(str.charAt(3));		//����charָ����������ֵ
		System.out.println(str.length());		//	�ַ�������
		System.out.println(str.equals(str1));	//�Ƚ��ַ����Ƿ����
		System.out.println(str.equalsIgnoreCase(str1));		//���Դ�Сд�Ƚ��ַ����Ƿ����
		String s = str.replace(' ','$');					//�滻�ַ����е�Ԫ��
		System.out.println(str.indexOf("Java"));		// �����ַ���str���ַ�����Java����λ�ã�
		System.out.println(str.indexOf("apple"));		//��������ڵ��ַ�������ԭ�ַ����ڣ��򷵻�-1
		String s2 = "";
		String s1 = "How are you?";
		System.out.println(s1.startsWith("How"));	//�ж��ַ����Ƿ����������ַ�����ͷ
		System.out.println(s1.endsWith("you?"));	//�ж��ַ����Ƿ����������ַ�����β
		s = s1.substring(4);					//��ȡs1�ַ�������λ�����һλ���ַ����浽s��
		System.out.println(s);					
		s = s1.substring(4,7);					//��ȡs1�ַ�������λ������λ���ַ�����������7�����浽s��
		System.out.println(s);
		s = s1.toLowerCase();					//תСд
		System.out.println(s);
		s = s1.toUpperCase();					//ת��д
		System.out.println(s);
	}		
}
