package casting;

public class Cat extends Animal {
	
	public Cat(String name, int age) {
		
	super(name, age);	
}
	public void groom() {
		System.out.println(super.name+"가 그루밍을 합니다.");
		
	}
}
