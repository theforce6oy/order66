package exception1;

public class Exception02_348p {

	public static void main(String[] args) {
		
		// 예외 발생 케이스 2.
		// 실행 예외는 실행하기 전까지는 예외를 인지할 수 없는 예외이다.
		// 대표적 예시로는 특정한 숫자를 0으로 나누는 것이다.
		
		int a = 1;
		int b = 0;
		System.out.println(a/b);
		/*Exception in thread "main" java.lang.ArithmeticException: / by zero
		* (Division by zero)*/

	}

}
