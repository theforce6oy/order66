package random01;

import java.util.Random;
import java.util.Scanner;

public class Random02_484p {

	public static void main(String[] args) {
		
		// Random 객체를 생성하고 nextboolean()을 이용해 동전던지기 카운팅 만들기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("동전을 던질 횟수");
		
		int n = scan.nextInt();
		
		System.out.println(n+"바퀴 돌린 결과값");
		
        Random r = new Random();
       
        int nf = 0;
        int nb = 0;
   
		for(int a=0; a<n; a++) {
			
			// boolean bool = r.nextBoolean();
			// bool == true > nf++ / bool == false > nb++
			
			if (r.nextBoolean()) {
				nf += 1;
			}
			else {
				nb += 1;
			}
		
		}
		System.out.println("앞면:"+nf);
		System.out.println("뒷면:"+nb);
		
		scan.close();
	}
	

}
