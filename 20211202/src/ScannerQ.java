import java.util.Scanner;

public class ScannerQ {
	public static void main(String[] args) {
		// 환율 계산기 만들기
		
	   Scanner scan = new Scanner(System.in);
	    
	   double rate = 1177.6;
	   
	   System.out.println("미국 달러의 환율은 " + rate + "입니다.");
	  
	   int won = scan.nextInt(); //원화 입력줄 
	   // won/ratefmf math.round()로 감싼다음, 10^n승을 곱하고 10.0^n승으로 나누면
	   // n승에 해당하는 자릿수만큼 소숫점이 출력
	   
	   System.out.println("원화" + won + "원을 미국 달러로 환전 시");
	   System.out.println(Math.round(won/rate *100) / 100.0+ "usd입니다.");
	   // 소수점 제한 없는 코드 : system.out.printIn(won/rate + "usd 입니다.");
	   
	   scan.close();
	   //다 사용한 scan변수는 닫아줘야 메모리가 회수됨.
	}
}
