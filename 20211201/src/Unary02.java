
public class Unary02 {

	public static void main(String[] args) {
		// 단항 연산자로 쓰인 +,-는 양수 음수 표기에 사용된다.
		System.out.println(+50); // 양수50, 실제로는 그냥 50
		
		System.out.println(-22); // -22
		
		// 비트 반전 연산자 ~는 비트단위 값을 0to1 1to0으로 바꿔줌
		System.out.println(~1);
		
		// 논리반전 연산자 !는 true to false 
		System.out.println(!true);
		
		// 자료형을 바꿔주는 cast연산자
		System.out.println((double)21);
		
	}
	

}
