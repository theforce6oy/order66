
public class binary03_75p {

	public static void main(String[] args) {
		
		// 5 -> 00000000 00000000 00000000 00000101
		// 3 -> 00000000 00000000 00000000 00000011
		// 비트 연산자는 비트 행 위 아래를 따져 비트단위로 연산이 이루어짐.
		
		// &(and)    : 위아래가 모두 1인 경우만 1 AND
		// |(bar)    : 위 아래가 모두 0인 경우만 0 OR
		// ^(Carrot) : 위 아래가 다를때만 1을 부여 XOR
		
		System.out.println(5&3); // 1
		System.out.println(5|3); // 7
		System.out.println(5^3); // 6
	
	}

}
