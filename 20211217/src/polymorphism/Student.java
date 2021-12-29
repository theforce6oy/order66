package polymorphism;

public class Student extends Person {
	
	private String collage;
	private int grade;
	
	public Student(String name, int age, String collage, int grade) {
		// 부모쪽 생성자에 name, age를 넘겨주기 위해
		// super(name, age);를 호출하고
		// 자식쪽에서
		
		super(name,age);
		
		this.collage = collage;
		this.grade = grade;
	}
    public void showPerson() {
    	super.showPerson();
		System.out.println("학교:"+collage+" 성적:"+grade);
    }
    
    // 신분을 밝히는 코드를 Student에만 작성해보자
    public void showStudent() {
    	System.out.println("저는 학생입니다.");
    }
}
