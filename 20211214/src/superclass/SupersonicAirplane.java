package superclass;

public class SupersonicAirplane extends Airplane {
	                           //초음속 비행기가 비행기를 상속
	
	public SupersonicAirplane(String name,int num,int speed) {
		//부모의 생성자는 상속되지 않습니다.
		//따라서 자식쪽에서 부모쪽 생성자에 전달할 값까지
		//모두 처리해야합니다.
		//부모 생성자는 super();로 이름이 고정.
		
		super(name, num, speed); 
	    //super=Airplane sub=SupersonicAirplane
		//java에서는 부모생성자(super)가 무조건 1순위로 호출되어야 한다.
		
	   /* EX)System.out.println("입력받은 속도는 speed");
		  super(~~~); 순서는 불가  */
		
		System.out.println("초음속 비행기"+name+"의 속도는 "+speed+"km/h 입니다.");
        }
	
	// 초음속 비앵기는 속도가 900이상 1200이하인 경우 호출되게끔
	// 현재 SupersonicAiplane 지역의 내부이기 떄문에
	// public void fly() 작성시 오버라이딩이 일어나게되지만
	// 그럼에도 불구하고 일반 비행을 하게되는 구간인 경우 super.fly()를 호출하면 된다.
	
	public void fly() {
		// 기존속도 + 500 결과 속도가 900이하인 경우
		if((speed+500)<=900) {
			super.fly();
		} /*else if((speed+500)>=900) {
			// 속도가 900이상 1300 이하의경우 최속 1300 가속은 500씩 되게끔
			speed += 500;
		} else((speed+500)>=1300) {
			speed = 1300;*/
		else {
			if((speed + 500)>1300) {
				speed = 1300;
			}
			else {
				speed += 500;
			}
		}
		System.out.println("초음속 비행기"+name+"의 속도는 "+speed+"km/h 입니다.");
		}
	
	public void breakSpeed() {
		
		if((speed-100)<0) {
			super.breakSpeed();
		} else {
				speed -= 100;
		}
		System.out.println("초음속 비행기"+name+"의 속도는 "+speed+"km/h 입니다.");
	}
}

	
