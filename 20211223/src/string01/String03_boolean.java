package string01;

import java.util.Scanner;

public class String03_boolean {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("전체 문장을 입력");
		String sentence = scan.nextLine();
		
	    System.out.println("문장내에서 카운팅 할 단어를 입력");
	    String searchVoca = scan.nextLine();
		
		int count = 0; // 갯수 카운트
		int f = -1; // 인덱스 카운트 (인덱스가 마지막으로 조회된 지점)
		// indexOf를 실행 후 -1이 나오면 더 찾을 필요가 없다는 의미이다.
		
		boolean a = true;
		
	    while(a) { 
	    	
	    	int getIt = sentence.indexOf(searchVoca,f+1);
	    	// f가 마지막으로 조회된 지점이므로
	    	// f +1부터 단어를 찾기 시작해야함
	    	if(getIt == -1) {
	    	// getIt에 -1이 저장된다면 더이상 조회할 필요가 없으므로 구문을 탈출하게 한다.
	    	   a = false;
	    	}
	    	else {
	    		f = getIt;
	    	    count++;
                System.out.println(getIt+"번 인덱스에서 "+count+"번째 "+searchVoca+"이(가) 검출됨");
	    	}
	     }
		 System.out.println(searchVoca+"의 출현횟수는 총 "+count+"회 입니다.");
	        }
	}


