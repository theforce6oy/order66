
public class DataInteger {

	public static void main(String[] args) {
		
		// 정수형을 나타낼 수 있는 자료는 크게 4가지로 구분한다.
		// byte, short, int, long (1,2,4,8 바이트)
		// 변수 선언시 자료형을 위의 키워드로 입력
		// byte 형 자료 생성 및 초기화 (변수 만들고 바로 값 삽입)
		
		byte a = 127; // 8비트 (0~2의 8승 -1) (0~255)
		short b = 32000; // 16비트 (0~2의 16승 -1)
		int c = 210000000; // 32비트 (0~2의 32승 -1)
		long d = 2041894; // 64비트 (0~2의 64승 -1)
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}
