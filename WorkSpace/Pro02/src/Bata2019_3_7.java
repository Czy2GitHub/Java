import java.math.*;
/**
 * 		测试BigDecimal指令；
 * @author dell
 *
 */
/*
public class Bata2019_3_7 {
	public static void main(String[] args) {
			BigDecimal bd = BigDecimal.valueOf(1.0);
			bd = bd.subtract(BigDecimal.valueOf(0.1));
			bd = bd.subtract(BigDecimal.valueOf(0.1));
			bd = bd.subtract(BigDecimal.valueOf(0.1));
			bd = bd.subtract(BigDecimal.valueOf(0.1));
			bd = bd.subtract(BigDecimal.valueOf(0.1));
			System.out.println(bd);		//结果为0.5；
			
	}

}
*/
public class Bata2019_3_7{
	public static void main(String[] args) {
		System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);  //结果为0.50000001，有误差；
	}
}