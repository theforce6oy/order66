package random01;

import java.util.Random;

public class Random01 {

	public static void main(String[] args) {
		
		// Random 클래스는 Math.random()보다 간단히
		// 다양한 종류의 난수값을 얻을 수 있도록 한다.
		// java.util.Random;을 통해 임포트할 수 있다.
		
		Random random = new Random();
		
		boolean result = random.nextBoolean();
		
		System.out.println(result);
		
		

	}

}
