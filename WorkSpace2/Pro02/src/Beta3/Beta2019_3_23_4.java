package Beta3;
/**
 * 测试封装使用规则
 * @author dell
 *
 */
public class Beta2019_3_23_4 {
		private String name;
		private int age;
		public	void setAge(int age) {
			if(age>0&&age<=130) {
			this.age = age;
		}else {
			System.out.println("请输入正确的年龄!");
		}
		}
		public int getAge() {
		   return this.age;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return this.name;
		}
		
}
