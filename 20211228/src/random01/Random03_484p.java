package random01;

import java.util.Random;

public class Random03_484p {

	public static void main(String[] args) {
		
		// NextInt()는 나올 숫자 범위를 지정할 수 있다.
		
		Random random = new Random();
		int result = random.nextInt();
		System.out.println(result);
		
		// 정수 숫자를 파라미터값으로 넣어주면 0<=결과값<=(파라미터값)
		
		int result2 = random.nextInt(5);
		System.out.println(result2);

	}

}
