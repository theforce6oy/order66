package collection02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoSim {

	public static void main(String[] args) {
		
		    List<Integer> lotto2 = new ArrayList<>();
			
			List<Integer> congrat2 = new ArrayList<>();
		
	        int lotnum = 0;
	        int congratnum = 0;
	        
	        
			while(congrat2.size() != 2) { 
				congratnum = (int)(Math.random()*45)+1;
				
				if(!congrat2.contains(congratnum)) {
					congrat2.add(congratnum); 
				}
			}		
			
			int count = 0;
			
			while(!lotto2.equals(congrat2)) {
			
				lotto2.clear();
			
			    while(lotto2.size() != 2) { 
				  lotnum = (int)(Math.random()*45)+1;
				
				if(!lotto2.contains(lotnum)) {
				    lotto2.add(lotnum); 
			     	}  
	            }
			
			    Collections.sort(lotto2);
			
		        System.out.println(""+lotto2+congrat2);
		        //모든 로직이 끝난 시점 = 번호를 1세트 뽑은 시점
		        // 마지막에 1을 더해줌
		        count++;
		       
			}
			// 반복문 탈출후 총 반복횟수 출력
			System.out.println("로또 구매 횟수" + count +"회");
		    

	}

}

/*if (lotto.equals(congrat)) {
	
	System.out.println("추첨된 번호 "+ lotto);
	System.out.println("당첨번호: " + congrat);
	System.out.println("당첨되었습니다.");
}
else {
	System.out.println("다시 도전하세요.");
}*/
