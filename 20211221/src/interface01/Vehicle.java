package interface01;

//인터페이스는 interface 선언을 사용한다.
//내부에는 상수인 값과 추상메소드만 선언할 수 있다.
//애초에 구현(implements)를 전제로 설계되기때문에
//일반 변수, 메소드를 내부에 선언할 수 없다.
//다형성에서는 부모클래스의 역할을 한다.
public interface Vehicle {
	
	int Air_MaxSpeed = 900;
	int Air_MAX_GAS = 1000;
	int Air_IncreaseSpeed = 400;
	int Air_DecreaseSpeed = 300;
	int Air_IncreaseGas = 500;
	int Air_DecreaseGas = 150;
	
	static int MAX_GAS = 100;
	int MinSpeed = 0;

//추상메소드 (추상)
public void accel();
public void breakSpeed();
public void reFuel();
public void status();
	
	

}
