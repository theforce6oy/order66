package inheritance;

public class Main01P254 {

	public static void main(String[] args) {
		// Student가 Person을 상속했기 때문에
		// Student는 Person의 자원을 사용할 수 있습니다.
		Student s1 = new Student();
		s1.name = "채종훈";
		s1.age = 20;
		s1.stuNum = 15;
		
		s1.getInfo();
		s1.getStudentInfo();

	}

}
