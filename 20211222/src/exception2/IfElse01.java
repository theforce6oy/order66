package exception2;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		
		// int a, b에 스캐너로 각각 정수를 입력받기
		// a/b의 결과 콘솔출력
		// b가 0인지 검사하여 0인 경우, 0으로 숫자를 나눌 수 없습니다.출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("insert a below");
		int a = scan.nextInt();
		System.out.println("insert b below");
		int b = scan.nextInt(); 
		
		if(b == 0) {
			System.out.println("0 으로 숫자를 나눌 수 없다.");
		}
		else
		    System.out.println(a/b);
		
		scan.close();
	}

}
