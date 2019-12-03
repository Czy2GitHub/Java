package cn.ccu;

public interface Text1 extends Text2,Text3{
		int A = 100;
		void run();
}
interface Text2{				//定义接口
	void run1();
}
interface Text3{
	void run2();
}