package collection01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto01 {

	public static void main(String[] args) {
		
		List<Integer> lotto = new ArrayList<>();
		
		List<Integer> congrat = new ArrayList<>();
		

        int lotnum = 0;
        int congratnum = 0;
        
		while(congrat.size() != 6) { 
			congratnum = (int)(Math.random()*45)+1;
			
			if(!congrat.contains(congratnum)) {
				congrat.add(congratnum); 
			}
		}
	
		
	   /* if(!lotto.contains(lotnum2)) { 
	     	lotnum2 = (int)(Math.random()*45)+1;	
		}*/
		
		int count = 0;
		int ticket = 5000;
		
		while (!lotto.equals(congrat)) {
			
			count++;
				
            while(lotto.size() != 6) { //반복횟수를 알면 for 그렇지않으면 while을 쓴다.
  			  lotnum = (int)(Math.random()*45)+1;
  			
  			if(!lotto.contains(lotnum)) {
  			    lotto.add(lotnum); 
  			}  
          }
            Collections.sort(lotto);
			System.out.println("이번에 뽑힌 번호 "+lotto);
			
		}
		
		if (lotto.equals(congrat)) {
	
		System.out.println("추첨된 번호 "+lotto);
		
		/*while(lotto.contains(lotnum)) {
			lotnum = (int)(Math.random()*45)+1;
		}*/
		Collections.sort(congrat);
		System.out.println("당첨번호: " + congrat);
		
		ticket = ticket*count;
		
		String str = String.format("$%,d",ticket);
		System.out.println("이번에 뽑힌 번호 "+ count);
		System.out.println("1등 당첨에 소모된 금액은 총 "+str+"입니다");
		}
		
		}
	}





	
	


