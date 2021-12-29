package constructor;

public class BasketballPlayer {
	
	public int height;
	public int jumpheight;
	
	public BasketballPlayer(int h, int j) {
		
		height = h;
		jumpheight = j;
		System.out.println("생성된 선수"+
		                   "\n키: "+ height+
		                   "\n점프력: "+ jumpheight);
	}
	
	public void dunkShoot(){
		
		if(height + jumpheight >= 300) {
			System.out.println("덩크슛 성공");
			System.out.println("---------");
		}
		else{
			System.out.println("골대에 닿지 않았습니다.");
			System.out.println("------------------");
		}
	
	}
	
}
