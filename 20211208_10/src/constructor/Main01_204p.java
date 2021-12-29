package constructor;

public class Main01_204p {

	public static void main(String[] args) {
		
		Car a = new Car(100,0,"정은"); 
		//값을 무조건 넣어야 작동 하게끔 생성자 메소드를 적용.
		
		/*
		a.gas = 100;
		a.speed = 0;
		a.owner = "최영우";*/
	
	    a.getInfo();
	    // 차량 최초 상태
	    
	    a.accelSpeed();
	    a.accelSpeed();
	    // 엑셀 두번 밟았다
	    
	    a.getInfo();
	    // 상태확인
	    
	    a.breakSpeed();
	    // 브레이크 밟음
	    
	    a.getInfo();
	    // 상태확인
	    
	    a.putGas();
	    
	    a.getInfo();
	}
}
