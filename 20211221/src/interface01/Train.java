package interface01;

public class Train implements Vehicle {
	private int speed;
	private int gas;
	private String driver;
	
	int MaxSpeed = 300;
	int IncreaseSpeed = 50;
	int DecreaseSpeed = 50;
	int IncreaseGas = 70;
	int DecreaseGas = 7;
	
	public Train(String driver) {
		this.speed = 0;
		this.gas = MAX_GAS;
		this.driver = driver;
		
	}
	@Override
	public void accel() {	
		if(speed + IncreaseSpeed > MaxSpeed) {
			System.out.println("최대 속도입니다.");
			speed = MaxSpeed;
		}
		else {
			speed += IncreaseSpeed;
		}
		gas -= DecreaseGas;
		
	}
	@Override
	public void breakSpeed() {
	   	if(speed - DecreaseSpeed < MinSpeed) {
		    speed = MinSpeed;
	    }
	    else {
		    speed -= DecreaseSpeed;
	    }
	}
	@Override
	public void reFuel() {		
		if (gas + IncreaseGas > MAX_GAS) {
		    gas = MAX_GAS;
		}
		else {
			gas += IncreaseGas;
		}	
	}
	@Override
	public void status() {
		System.out.println("기관사 이름: " + driver);
		System.out.println("현재 속도: " + speed + "Km/h");
		System.out.println("현재 연료량: " + gas + "L \n");
	}
	
}

