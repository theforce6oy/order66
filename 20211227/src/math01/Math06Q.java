package math01;

public class Math06Q {
	

	public static void main(String[] args) {
		
		
		// 가위바위보 게임 만들기
		// 0 = 가위 1 = 바위 2 = 보
		
		int myValue = (int)(Math.random()*3);
		int comValue = (int)(Math.random()*3);
		
	  /*String my = null;
		String com = null;*/
		
		String[] items = {"가위","바위","보"};
		
		if (myValue == 0 && comValue == 2 || 
		    myValue == 1 && comValue == 0 || 
		    myValue == 2 && comValue == 1) {
			System.out.println("내가 승리함");
		}
		else if (myValue == 1 && comValue == 2 ||
				 myValue == 2 && comValue == 0 || 
				 myValue == 0 && comValue == 1) {
			System.out.println("컴퓨터가 승리함");
		}
		else if (myValue == comValue) {
			System.out.println("무승부");
			
		}
		System.out.println("내값: " + items[myValue]);
		System.out.println("컴퓨터 값: " + items[comValue]);
		
	      /*if(my.equals("가위") && com.equals("보") || my.equals("바위") && com.equals("가위") || my.equals("보") && com.equals("바위")) {
	    	    System.out.println("내가 승리함");
	    	    System.out.println("내값: " + my);
				System.out.println("컴퓨터 값: " + com);
	        }
	        else if (my.equals("바위") && com.equals("보") || my.equals("보") && com.equals("가위") || my.equals("가위") && com.equals("바위")) {
	        	System.out.println("컴퓨터가 승리함");
	        	System.out.println("내값: " + my);
				System.out.println("컴퓨터 값: " + com);
	        }
	        else if (my.equals("보") && com.equals("보") || my.equals("가위") && com.equals("가위") || my.equals("바위") && com.equals("바위")) {
	        	System.out.println("무승부");
	        	System.out.println("내값: " + my);
				System.out.println("컴퓨터 값: " + com);
	        }
	        */
	        	
	}
	
	}

