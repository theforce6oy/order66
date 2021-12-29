
public class Binary04_77p {

	public static void main(String[] args) {
		
		// 비트 이동 연산자는 숫자 >> (<<) 자리수 문법을 사용한다.
		// << 경우 : 왼쪽으로 자릿수만큼 밀어준다.
		// 이때 정수 숫자는 2의 자릿수 제곱만큼 증가
		// >> 경우 : 정수 숫자가 2의 자리수 제곱만큼 줄어든다.
		
		int a = 80;
		System.out.println(a>>3);
		// 결과값이 시뮬레이션되고 int a 자체의 값은 동일함
		System.out.println(a<<2); 
		
	}

}
