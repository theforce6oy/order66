package structure;

public class Car {
	
	// 멤버 변수 : 클래스 안에 선언된 변수
	// 어떤 특정한 사물이나 객체의 '정보' 혹은 '상태'를 나타낸다.
	
	public String model;
	public int price;
	public String owner;
	
public void getInfo() {
		
	// 멤버 메소드 : 클래스안에 선언된 메소드
	// 어떤 특정한 사물이나 객체의 '동작'을 나타낸다.
	
	System.out.println(owner + "의 차량 정보입니다.\n");
	System.out.println("모델명: " + model +
		                   "\n가격:  " + price);
		
	System.out.println("---------------------");
}
}