package testing;

public class Finally_test {

	public static void main(String[] args) {
		int a = 10;
		int b =0;

		try {
			System.out.println("try block is started");
			int c = a / b;
			System.out.println(c);
			System.out.println("try block ended");
		} 
		catch (ArithmeticException e) {
			System.out.println(e);
		} 
		finally {
			System.out.println("finally block of code");
		}
	}
}
