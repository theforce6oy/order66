import java.util.Scanner;

public class ifQ1_93p {

	public static void main(String[] args) {
		// 주어진 변수 a에 스캐너로 정수값을 받도록 만들기
		
		try (Scanner scan = new Scanner(System.in)) {
			int su;
				System.out.println("정수를 입력 : ");
				su = scan.nextInt();
				
				if(su >= 0) {
					System.out.println("입력된 수는");
					System.out.println("0보다 크거나 같습니다.");}
				if(su < 0) {
					System.out.println("입력된 수는");
					System.out.println("0보다 작습니다.");
				}
		}
		}

	}

