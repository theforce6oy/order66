import java.util.Scanner;

public class BreakQ01_120p {

	public static void main(String[] args) {
		
		//  
		
		Scanner scan = new Scanner(System.in);
		System.out.println("count up below");
		
		int a = scan.nextInt();
		
		int count = 1;
	    
		int total = 0;
		
		while(true) {
			total += count; //+= 더한 
			 System.out.println("1부터" + count + "까지 총합은 :" +total+"입니다.");
			 
			 if(total >= a) {
				   System.out.println("목표값:"+a);
				   System.out.println("총 합:"+total);
				   System.out.println("몇까지?:"+count);
				   break;
			   } 
			 count++; // 다 돌았으면 바퀴수 증
			}
		}
	}


