
public class Binary01_63p {

	public static void main(String[] args) {
		
		// 이항 연산자는 양 변에 하나씩 항목을 취하는 연산자입니다.
		// 산술 연산자는 우리가 잘 알고있는 사칙연산 등을 활용하기 위한 
		// 연산자이며, 연산의 우선순위도 그대로 계승.
		// 단, % 연산자의 우선순위는 *, / 와 동일하다.
		// +, -, *
		
		System.out.println(3+5);
		System.out.println(17-21);
		System.out.println(2*3);
		
		// "/(나누기)"는 왼쪽 수를 오른쪽 수로 나누어 몫을 구한다.(단, 정수/정수=정수)
		// 정수와 정수의 연산은 무조건 정수로 나온다.
		System.out.println(7/2); // 3.5를 정수로 바꿔 출력
		System.out.println(7/(double)2); // 실수로 출력하고 싶은 경우
		System.out.println(9/2);
		
		// &는 정수 최대 몫을 구하고 남은 값만 출력한다.
		System.out.println(10%3); // 10-(3*3)=1
		
		//연산의 우선순위는 실제와 그대로 존재한다.
		System.out.println(10+6%4); // (10+6)%4
		
		

	}

}
