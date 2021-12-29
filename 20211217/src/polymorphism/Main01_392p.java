package polymorphism;

public class Main01_392p {

	public static void main(String[] args) {
		
		Person a = new Person("최영우",10);
		Person b = new Student("최학생",20,"으뜸대학교",100);
		Person c = new Police("최영구",28,3);
		Person d = new Doctor("최현무",40,"순풍병원",true);
		// a와 d의 showPerson은 다르게 돌아갑니다.
	    
		a.showPerson();
		b.showPerson();
		c.showPerson();
		d.showPerson();
		
		//b는 Person타입이므로 Person에 소속된 자원만 호출할 수 있다.
		//b.showStudent();


	}

	
}

