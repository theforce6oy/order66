import java.util.Scanner;

public class Method07 {

	public static double FtoC(double f) {
		
		double r = (f - 32) / 1.8;
		return r;
		
	}
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			{
				
				System.out.println("오늘의 화씨 below");
				
				double f = scan.nextDouble();
			
				
			    double r = FtoC(f);
			    System.out.println("오늘의 섭씨 온도는:"+r+"도 입니다.");
			    
			   

}
		}

}
}
