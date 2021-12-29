import java.util.Scanner;

public class forQ5_118p {
		
	public static void main(String[] args) {
			
		//입력받은 정수 제곱 형태의 직사각형이 찍히게 중첩반복문 만들기
		
	   try (Scanner scan = new Scanner(System.in)) {
		
		   System.out.println("Import int below");
		  
		   int count = scan.nextInt();
		   
		   for(int a = 0; a<count; a++){
			   for(int b = 0; b<count; b++) {
			   System.out.print("*"); // 가로길이를 담당하기에 ln이 붙지않음.
			   }
		   System.out.println(""); // 세로를 담당하기에 ln이 붙었다.
		   }
	}
	}
	
	

}
