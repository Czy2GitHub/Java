package Week_6th;
/**
 * 写出一个类People,并由该类做基类派生出子类Employee和Teacher。
 * 其中People类具有name、age两个保护成员变量,
 * 分别为String类型、整型,
 * 且具有公有的getAge 成员函数,
 * 用于返回age变量的值。Employee类具有保护成员变量empno,Teacher类有teano和zc成员变量。
 */
public class People {
		private String name ;
		private  int age;
		public int getAge() {
			return age;
		}
}
class Employee extends People{
		private  int empno;
		
}
class Teacher extends People{
		int teano;
		int zc;
}