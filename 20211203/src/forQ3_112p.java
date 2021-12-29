import java.util.Scanner;

public class forQ3_112p {
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("IMPORT NUM :");
			int dan = scan.nextInt();
		
		if(dan > 1 && dan < 10) {
		for(int a=1; a<10; a++) {
			System.out.println(dan+" X "+a+" = "+dan*a);}
		}
		else {
			System.out.println("구구단의 유효범위는 2~9단입니다.");}
		}
	}
}



