package cn.ccu;

import cn.ccu.Outer.Inner;

/**
 * 测试内部类
 * @author dell
 *
 */
public class TextInnerClass {
		public static void main(String[] args) {
			//创建非静态内部类对象
			Outer.Inner inner = new Outer().new Inner();
			inner.run();
			//创建静态内部类对象
			Outer.Inner2 inner2 = new Outer.Inner2();
			inner2.run();
		}
}

class Outer{
	private int age  = 10;
	public void textOuter() {
		System.out.println("测试成功!");
	}
		static class Inner2{
			void run() {
				System.out.println("静态内部类!");
			}
		}
		class Inner{					//即使Inner在Outer内部，编译时也会生成两个。class文件
			int age = 5;
			void run() {
				System.out.println(this.age+Outer.this.age);		//前一个this指的是Inner中的age，后一个this指的是Outer中的age;
			}
		}
}