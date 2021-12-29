package superclass;

public class Airplane {
	
	protected String name;
	private int num;
	protected int speed;
	
public Airplane(String name,int num,int speed) {
	
	this.name = name;
	this.num = num;
	this.speed = speed;
}
public void getAir() {	
	
	System.out.println(name+" "+num+"기 입니다.");
	System.out.println("속도는 시속 "+speed+"km/h 입니다.");
}
public void fly() {
	
	/*this.speed += 500;
	
	if(speed>900) {
		System.out.println(name+" "+num+"기");
		System.out.println("엔진과열");
		speed = 900;
	}*/
	if((speed+500)>900){
		speed = 900;
	}
	else {
		speed += 500;
	/*else {
		System.out.println(name+" "+num+"기");
		System.out.println("현재 속도는 "+speed+"입니다.");*/
	}
	System.out.println(name+" "+num+"기");
	System.out.println("현재 속도는 시속 "+speed+"km/h 입니다.");
}
public void breakSpeed() {
	
	/*this.speed -= 100;
	
	if(speed<=0) {
		System.out.println(name+" "+num+"기");
		System.out.println("최저속도 도달.");
		speed = 0;
	}
	else {
		System.out.println(name+" "+num+"기");
		System.out.println("현재 속도는 "+speed+"입니다.");*/
	
	if(speed - 100 < 0) {
		speed = 0;
    }
	else {
		speed -= 100;
	}
	System.out.println(name+" "+num+"기");
	System.out.println("현재 속도는 시속 "+speed+"km/h 입니다.");
}
}
