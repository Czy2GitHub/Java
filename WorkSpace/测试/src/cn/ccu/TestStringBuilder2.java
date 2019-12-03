package cn.ccu;

public class TestStringBuilder2 {
public static void main(String[] args) {
	StringBuilder sb = new StringBuilder();
	for(int i = 0;i<26;i++) {
		sb.append((char)('a'+i));
	}
	System.out.println(sb);
	sb.reverse();	//倒序
	System.out.println(sb);
	sb.insert(0,'我').insert(6, '你');//链式调用。核心就是:该方法调用了return this;
	System.out.println(sb);
	
	sb.delete(20, 23);			//删除
	System.out.println(sb);
}
}
