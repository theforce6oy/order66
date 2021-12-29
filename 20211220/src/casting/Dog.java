package casting;

public class Dog extends Animal {
	
	public Dog(String name, int age) {
		
	super(name, age);	
}
	public void bark() {
		System.out.println(super.name+"가 멍멍 짖습니다.");
		
	}
}