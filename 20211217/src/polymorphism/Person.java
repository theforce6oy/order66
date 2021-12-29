package polymorphism;

public class Person {
	// 사람을 나타내는 클래스
	// 상속만을 목적으로 하는 클래스
	// Person을 상속받은 자식들은 전부
	// Person을 요구하는 자리에 대입될 수 있다.
	private String name;
	private int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		//Person클래스 전체 데이터를 콘솔에 찍어주는 showPerson()
		//Person타입으로 호출시 유일하게 호출 가능한 메소드
		// 이 메소드를 자식쪽에 오버라이딩하면 부모타입으로도
		// 자식쪽 showPerson()을 호출할 수 있다.
		System.out.println("인물정보");
		System.out.println("이름:"+name+" 나이:"+age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

