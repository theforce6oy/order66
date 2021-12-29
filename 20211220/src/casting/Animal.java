package casting;

public class Animal {
	
	protected String name;
	protected int age;

	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void sit() {
		System.out.println(name+"가 앉습니다.");
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
