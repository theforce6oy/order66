import java.util.Scanner;

public class ifElseIfQ1_97p {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성적판독");
		int score = scan.nextInt();
		
		if (score>=95) {
			System.out.println("A+");
		} else if(score>=90) {
			System.out.println("A0");
		} else if(score>=85) {
			System.out.println("B+");
		} else if(score>=80) {
			System.out.println("B0");
		} else if(score>=75) {
			System.out.println("C+"); 
		} else if(score>=70) {
			System.out.println("C0");
		} else if(score>=65) {
			System.out.println("D+");
		} else if(score>=60) {
			System.out.println("D0");
		} else{ 
			System.out.println("F");
	    }
		scan.close();
		}
}
