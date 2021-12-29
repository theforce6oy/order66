import java.util.Scanner;

public class wihleQ3 {

	public static void main(String[] args) {
		
		// forQ5를 while문으로 만들
		  
               Scanner scan = new Scanner(System.in);
				
			   System.out.println("Import int below");
			  
			   int count = scan.nextInt();
			   
		int a = 0;
	  while(a<count){
		
			int b=0;
		  while(b<count){
				b++;
				
				System.out.print("*");
				}
		    a++;
		    System.out.println("");
				
		}
	}
	}


