package math01;

public class Math05Q {

	public static void main(String[] args) {
		
		// 주사위 게임 만들기
		// 내값과 컴퓨터 값을 난수발생 1~6으로 부여한 뒤
		// 값이 같으면 무승부, 혹은 승자가 누구인지 알려주기
		
		int myValue = (int)(Math.random()*6)+1;
		int comValue = (int)(Math.random()*6)+1;
		
		
		if(myValue == comValue) {
			System.out.println("무승부");
			System.out.println("내값: " + myValue);
			System.out.println("컴퓨터 값: " + comValue);
		}
		else {
		 if(myValue < comValue) {
			 System.out.println("컴퓨터가 승리함");
			 System.out.println("내값: " + myValue);
			 System.out.println("컴퓨터 값: " + comValue);
		}
		 else {
			 System.out.println("내가 승리함");
			 System.out.println("내값: " + myValue);
			 System.out.println("컴퓨터 값: " + comValue);
		}
      } 
	}
}

	
		
		

	


