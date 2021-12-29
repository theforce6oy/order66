package interface01;

public class Main_interface_329p {

	public static void main(String[] args) {
		
		//인터페이스의 경우는 부모쪽에 멤버변수가 따로 없고
		//모든 메소드를 다 오버라이딩 해야하기 때문에
		//부모쪽에서 자식쪽의 기능을 실행하려 할 때
		//기본적으로 부모쪽에서 정의한 내용을 실행하는데 제약이 없다.
		
		Vehicle a = new Car("최영우");
		
		a.status();
		
		a.accel();
		a.accel();
		a.accel();
		
		a.status();
		
		a.breakSpeed();
		
		a.status();
		
		a.reFuel();
		
		a.status();
		
		Vehicle b = new Train("최아무개");
		
		b.status();
		
		b.accel();
		b.accel();
		b.accel();
		b.accel();
		
		b.status();
		
		b.breakSpeed();
		b.breakSpeed();
		
		b.status();
		
		b.reFuel();
		
		b.accel();
		
		b.status();
		
		Vehicle c = new Airplane("스카이워커");
		
		c.status();
		
		c.accel();
		c.accel();
		
		c.status();
		
		c.breakSpeed();
		c.status();
		c.breakSpeed();
		c.breakSpeed();
		
		c.status();
		
		c.reFuel();
		
		c.status();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
