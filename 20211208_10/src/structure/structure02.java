package structure;

public class structure02 {

	public static void Info(Person p) {
		System.out.println(p.name + "의 정보입니다.");
		System.out.println("나이: "+ p.age +
				           "\n연락처: "+ p.pNum + 
				           "\n식별번호: "+ p.uNum);
	}
	public static void main(String[] args) {
		 
		Person a = new Person(); // 앞서 설계한 Person과 같은 클래스 이름

	         a.name = "Anakin Skywalker";
	         
	         a.age = 28;
	         
	         a.pNum = "010-8264-9666";
	         
	         a.uNum = 5011;
	         
	         a.heig = 187;
	         
	         
	         Person b = new Person();
	        
	          b.name = "Boba Fett";

	          b.age = 39;
	          
	          b.pNum = "010-6123-1245";
	  
	          b.uNum = 408;

	          
	          Info(a);
	          System.out.println();
	          Info(b);
	          
	          
	}

}
