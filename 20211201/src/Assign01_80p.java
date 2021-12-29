
public class Assign01_80p {

	public static void main(String[] args) {
		
		// 대입 연산자
		// 특정 변수값을 연산자 우측에 해당하는 값을 이용하여
		// 연산한 결과값으로 계산해 저장하는 기능을 수행합니다.
		// 단순 연산자인 = 이 있으며, 추가로 확장된
		// 복합대입연산자로 +-\=, -=, /=, *=, %=
		// 대입 연산자를 사용하는 경우 코드 실행방향이 [오른쪽에서 왼쪽].
		
		//ex)
		int a =10;
		
		System.out.println(a);
		a += 10;// a = a + 10;
		System.out.println(a);
		
		a -= 5;  // a = a - 5;
		System.out.println(a);
		
		a *= 3;  // a = a * 3;
		System.out.println(a);
		
		a /= 4;  // a = a / 4;
		System.out.println(a);
		System.out.println((double)a);
		
		a %= 1;  // a = a % 1;
		System.out.println(a);
		
	}

}
