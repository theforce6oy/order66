
public class overflow {
	public static void main(String[] args) {
		
		// 오버플로우
		// 표현할 수 있는 최대 숫자를 넘겨 표현 시 
		// 그 자료형으로 표현할 수 있는 최소 값으로 초기화되는 현상.
		// 아래와 같이 -128~127 사이의 범위를 표현할 수 있는 byte의
		// 최대값을 넘기면 최소 표현값인 -128이 출력됨을 볼 수 있다.
		
		byte a = 127;
		byte b = 1;
		System.out.println((byte)(a+b));

	}
}
