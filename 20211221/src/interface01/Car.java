package interface01;

//인터페이스 구현을 위해서는
//extends 대신 implements를 사용한다.

public class Car implements Vehicle {
//인터페이스 내부의 추상메소드는 무조건 전부 구현해야한다.
	
	// 자동차라면 가져야 하는 변수 설정
	// 현재속도, 연료량, 차주
	private int speed;
	private int gas;
	private String name;
	
	int MaxSpeed = 200;
	int IncreaseSpeed = 10;
	int DecreaseSpeed = 10;
	int IncreaseGas = 30;
	int DecreaseGas = 1;
	
	public Car(String name) {
		
		this.speed = 0;
		this.gas = MAX_GAS;
		
		this.name = name;
	}
	
	@Override
	public void accel() {
	//한번 가속시 속도는 10씩 증가,연료는 1씩 소비,최속은 200 조건으로 작성해보기
		if(speed + IncreaseSpeed >= MaxSpeed) {
			System.out.println("속도는 200을 초과할 수 없습니다.");
			speed = MaxSpeed;
		}
		else {
			speed += IncreaseSpeed;
		}
		gas -= DecreaseGas;
	}

	@Override
	public void breakSpeed() {
		
		if(speed - DecreaseSpeed <= MinSpeed) {
		    speed = MinSpeed;
		}
		else {
			speed -= DecreaseSpeed;
		}
	}

	@Override
	public void reFuel() {
		//gas = gas += 30 > MAX_GAS;
		if (gas + IncreaseGas > MAX_GAS) {
		    gas = MAX_GAS;
		}
		else {
			gas += IncreaseGas;
		}
		
	}

	@Override
	public void status() {
		System.out.println("드라이버이름: " + name);
		System.out.println("현재속도: " + speed + "Km/h");
		System.out.println("현재 연료량: " + gas + "L \n");
		
	}
	

}
