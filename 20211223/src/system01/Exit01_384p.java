package system01;

public class Exit01_384p {

	public static void main(String[] args) {
		
		// System.exit()은 break문 처럼 실행즉시 프로그램을 강제로 종료한다.
		System.out.println("실행중 1");
		System.out.println("실행중 2");
		System.out.println("실행중 3");
		System.out.println("실행중 4");
		
		System.exit(0); //0: 정상종료 0이외: 비정상종료(에러 등)
		
		System.out.println("실행중 5");

	}

}
