package Exception;

public class Ex03_trycatch {
	public static void main(String[] args) {
		System.out.println(1);
		
		try {
			System.out.println(2);
			System.out.println(0/0);
			System.out.println(3);
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println(6);
	}
}
