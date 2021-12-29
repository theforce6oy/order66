import java.util.Scanner;

public class IF02_93p {

	public static void main(String[] args) {
		// 교본 9p 4-1
		Scanner scan = new Scanner(System.in);
		// 변수 선언
		
		int su;
		
		System.out.println("정수 입력 : "); 
		su = scan.nextInt();
		
	    if(su > 0) {
	    	System.out.println("양수입니다.");
	    }
		if(su < 0) System.out.println("음수입니다.");
		// 만약 IF 구문의 실행문이 한줄이라면 { }생략가능
	}

}
