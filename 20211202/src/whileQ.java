import java.util.Scanner;

public class whileQ {

	public static void main(String[] args) {
		String Str = "1";
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("수치 입");
			  
			int num = Integer.parseInt(Str);
			
			num = scan.nextInt();
			
			while(num < 5) {
				num += 1;
				System.out.println( num + "번째 반복문을 실행중입니다."); }
	
		}
		
	}

}
