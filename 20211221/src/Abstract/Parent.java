package Abstract;
//추상 클래스
//abstract 선언이 붙은 클래스는 new를 이용한
//직접적인 객체 생성은 불가능하다.
public abstract class Parent {
       
	private int age;
	
public Parent() {
	this.age = 40;
	}

//추상메소드.
//아래와 같이 실행문 없이 선언부만 작성한다.
//실행문을 만들수없어서 오버라이딩이 강요된다.
public abstract void getAge();

//추상클래스 내부의 일반 메소드는 그냥 평범하게 작성
//일반메소드는 오버라이딩을 자율적으로 할수있다.
public void getInfo() {
	System.out.println("일반 메소드");
}

}
