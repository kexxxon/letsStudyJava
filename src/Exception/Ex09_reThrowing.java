package Exception;

public class Ex09_reThrowing {
	public static void main(String[] args) {
		
		try {
			method1();
		} catch(Exception e) {
			System.out.println("main메서드에서 예외가 처리됨");
		}
	}
	
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("method1메서드에서 예외가 처리됨");
			throw e;
		}
	}
}