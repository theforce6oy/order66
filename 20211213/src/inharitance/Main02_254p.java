package inharitance;

public class Main02_254p {

	public static void main(String[] args) {
		
		Salaryman a = new Salaryman();
		
		a.name = "최영우";
		a.age = 32;
		a.salary = 60000000;
		
		a.getInfo();
		a.getSalaryInfo();
		
		Student g = new Student();
		
		g.name = "최영우";
		g.age = 20;
		g.stuNum = 29;
		
		g.getInfo();
		g.getStudentInfo();
		
		
		
		

	}

}
