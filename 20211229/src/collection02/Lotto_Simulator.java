package collection02;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto_Simulator {

	public static void main(String[] args) {
		
	    DecimalFormat m = new DecimalFormat("###,###,###,###,###,###");
		
        List<Integer> lotto = new ArrayList<>();
		
		List<Integer> congrat = new ArrayList<>();
	
        int lotnum = 0;
        int congratnum = 0;
        
       /* while(lotto.size() != 6) { 
			  lotnum = (int)(Math.random()*45)+1;
			
			if(!lotto.contains(lotnum)) {
			    lotto.add(lotnum); 
			}  
        }*/
        
		while(congrat.size() != 6) { 
			congratnum = (int)(Math.random()*45)+1;
			
			if(!congrat.contains(congratnum)) {
				congrat.add(congratnum); 
			}
		}
		
		Collections.sort(congrat);
		
		long count = 0L;
		long ticket = 5000L;
		
		while (!lotto.equals(congrat)) {
			
			lotto.clear();
			
			while(lotto.size() != 6) { 
				  lotnum = (int)(Math.random()*45)+1;
				
				if(!lotto.contains(lotnum)) {
				    lotto.add(lotnum); 
				}  
	        }
			
            Collections.sort(lotto);
			System.out.println("뽑힌 번호 "+lotto);
			
			count++;
			
		}
		
		if (lotto.equals(congrat)) {
	
		System.out.println("\n추첨된 번호 "+ lotto);
		
		System.out.println("당첨번호: " + congrat);
		
		ticket = ticket*count;
		
		m.format(ticket);
		
		
		System.out.println("\n로또 도전 횟수 총 "+ count + "회");
		System.out.println("1등 당첨에 소모된 금액은 총 "+m.format(ticket)+"원 입니다.");
		}
		
	}
}

	


