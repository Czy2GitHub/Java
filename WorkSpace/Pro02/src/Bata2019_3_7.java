import java.math.*;
/**
 * 		����BigDecimalָ�
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
			System.out.println(bd);		//���Ϊ0.5��
			
	}

}
*/
public class Bata2019_3_7{
	public static void main(String[] args) {
		System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);  //���Ϊ0.50000001������
	}
}