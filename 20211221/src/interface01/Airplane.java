package interface01;

public class Airplane implements Vehicle {
	
	private int speed;
	private int gas;
	private String poilot;
	
	public Airplane(String poilot) {
		this.speed = 0;
		this.gas = Air_MAX_GAS;
		this.poilot = poilot;
		
	}
	@Override
	public void accel() {	
		if(speed + Air_IncreaseSpeed > Air_MaxSpeed) {
			speed = Air_MaxSpeed;
		}
		else {
			speed += Air_IncreaseSpeed;
		}
		gas -= Air_DecreaseGas;
		
	}
	@Override
	public void breakSpeed() {
	   	if(speed - Air_DecreaseSpeed < MinSpeed) {
		    speed = MinSpeed;
	    }
	    else {
		    speed -= Air_DecreaseSpeed;
	    }
	}
	@Override
	public void reFuel() {		
		if (gas + Air_IncreaseGas > Air_MAX_GAS) {
		    gas = Air_MAX_GAS;
		}
		else {
			gas += Air_IncreaseGas;
		}	
	}
	@Override
	public void status() {
		System.out.println("파일럿 이름: " + poilot);
		System.out.println("현재 속도: " + speed + "Km/h");
		System.out.println("현재 연료량: " + gas + "L \n");
	}
	
}

