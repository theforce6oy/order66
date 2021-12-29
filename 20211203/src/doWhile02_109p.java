import java.util.Scanner;

public class doWhile02_109p {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("주문금액 :" );
			int order = scan.nextInt();

			do {
				System.out.println("주문금액은");
				System.out.println(order + "원 입니다.");
				System.out.println("배달을 완료했습니다.");
			    System.out.println(" ");
				System.out.println("다음 주문금액 :");
				order = scan.nextInt();    
			}
			while (order>=15000);
		}
		System.out.println("금액이 모자라서 종료되었습니다.");
		
	}

}
