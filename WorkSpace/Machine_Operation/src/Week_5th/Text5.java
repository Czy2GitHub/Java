package Week_5th;
import java.util.Scanner;
/**
 * ����һ���ַ����������ҳ����в������ظ��ַ��� ��Ӵ� �ĳ��ȡ�
 * @author dell
 *
 */
public class Text5 {
	public static void main(String[] args) {		
		Scanner sc1 = new Scanner (System.in);
		String  str = sc1.nextLine();
		lengthOfLongestSubstring(str);
	}
	public static int lengthOfLongestSubstring(String s) {     
		int size=0; 
		int start =0;  
		int pos;  
		String current="";   
		for(int i =0 ,j=0;i<s.length();i++){   
			if(current.indexOf(s.charAt(i))!=-1){      
				if(current.length()>size){      
					size=current.length();        		}        		
				pos = current.indexOf(s.charAt(i));        
				current = s.substring(start + current.indexOf(s.charAt(i))+1, i+1);     
				start = start + pos + 1; //start ��¼��ȡ�ַ�����ͷ��ԭ�ַ�����λ��   
				}        	
			else{        		
				current =current+s.charAt(i);        		
				if(current.length()>size){       
					size=current.length();        
					} 
				}        		      
			} 
		System.out.println(size);    
		return size; 
		}
	} 

