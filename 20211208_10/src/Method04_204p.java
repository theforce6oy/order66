
public class Method04_204p {
	
	public static void info() {
		
		// 만약 내부 실행구문이 추가입력을 받지않아도
		// 완성된 구문이라면 굳이 값을 받지 않아도된다.
		
		System.out.println("123");
		System.out.println("456");
	}

	public static void main(String[] args) {
		
		// 한번에 값을 입력받아야 하는 경우 (반복 등)에 유용.
		
		info();
		System.out.println("---");
		info();
	}

}
