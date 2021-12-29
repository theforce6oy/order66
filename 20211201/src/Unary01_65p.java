
public class Unary01_65p {

	public static void main(String[] args) {
		// 단항 연산자 ++, --
		// ++, --는 숫자의 왼쪽 혹은 오른쪽에 붙을 수 있다.
		// 왼쪽에 붙는 경우를 전위수식, 오른쪽에 붙는 경우를 후위수식이라고 표현.
		// 어느방향에 붙냐에 따라 실행 순서가 달라진다.
		// ++는 대상 변수의 수치를 1 증가, --는 1 감소
		
		int a = 1;
		System.out.println(++a);// 전위수식. 실행전 먼저 a에서 1 증가
		// 1. a값을 먼저 1 증가시킴 : a = a(1) + 1
		// 2. 증가된 a값을 출력.(작성 직후 바로 적용된다는 의미):sysout(a(2))
		
		System.out.println(a); //증가한 채로 유지됨.
		
		System.out.println(a++);// 후위수식. 출력이후 1증가
		// 1. 현재 a 값 출력
		// 2. 출력된 a 값에 1 증가 a = a(2) + 1
		
		System.out.println(a); // a값이 증가한 채로 유지되어 출력
		
		 
		

	}

}
