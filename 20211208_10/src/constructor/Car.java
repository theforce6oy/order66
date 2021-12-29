package constructor;

public class Car {

	public int speed;
	public int gas;
	public String owner;
	
	//자동차 생성자 (new 키워드로 생성시 실행될 메소드)
	//리턴타입은 기입하지않는다.
	//클래스 이름인 Car로 매소드 명이 고정됨
	//생성시 자동으로 호출되기 때문에 무시하고 넘어갈 수 없다.
	public Car(int g, int s, String o) {
		gas = g;
		speed = s;
		owner = o;
		System.out.println("자동차 생성 완료!");
		System.out.println("연료: "+gas+" 속도: "+speed+" 드라이버: "+owner);
	}

public void getInfo() {
	System.out.println("현재연료: " + gas);
	System.out.println("현재속도: " + speed);
	System.out.println("드라이버: " + owner);
	System.out.println("-----------");
	}
public void accelSpeed() {
	gas -= 2;
	speed += 10;
}
public void breakSpeed() {
	speed -= 10;
}
public void putGas() {
    speed = 0;
	gas += 10;
}

}
