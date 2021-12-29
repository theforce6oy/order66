package string01;

import java.util.Scanner;

public class String05_399p {

	public static void main(String[] args) {
		
		//.length()와 charAt을 활용하여 입력된 전체 문자열을
		// 한 글자씩 처리해보기
		
	   Scanner scan = new Scanner(System.in);
	   
	   System.out.println("문자열 입력");
	   
	   String str = scan.nextLine();
	   
	   str.length();
	   
	   for(int a = 0; a < str.length(); a++) {
		   
		   System.out.println(str.charAt(a));
	   }
	   
	}

}
