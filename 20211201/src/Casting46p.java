
public class Casting46p {

	public static void main(String[] args) {
		
		// 원래는 서로 다른 자료형 간에는 연산이 불가능하다.
		// 편의상 컴퓨터가 자동으로 자료형을 보정해주는 경우가 있는데,
		// 이를 가리켜 자료형 변환이라 한다.
		// 자동형 변환인 Promotion과 강제형 변환인 Casting이 있다.
		// 자동형 변환 : 작은 데이터를 큰 데이터로 바꿀때 주로 발생됨.
		// 강제형 변환 : 큰 데이터를 작은 데이터로 바꿀때 주로 사용.
		int a= 5;
		double b = 7.12;
		System.out.println(a+b); // 자동변환(int -> double)
		
		// 강제형 변환 : 변환을 하고싶은 자료 왼쪽에 [(바꿀 자료형)자료]
		System.out.println(a+(int)b); // double -> int
		
	}

}
