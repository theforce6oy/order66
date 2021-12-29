package structure;

public class Structure03_190p {


	public static void Catfo(Cat c) {
		System.out.println(c.name + "의 정보입니다.");
		System.out.println("나이: "+ c.age +
				           "\n종: "+ c.reg +
				           "\n털색: "+ c.cor);
	}
	public static void main(String[] args) {
		 
		Cat a = new Cat(); // 앞서 설계한 Cat과 같은 클래스 이름

	         a.name = "Anakin Skywalker";
	         
	         a.age = 3;
	         
	         a.reg = "페르시안";
	         
	         a.cor = "네로";

	         
	         
	    Cat b = new Cat();
	    
	        
	          b.name = "Boba Fett";

	          b.age = 9;
	          
	          b.reg = "코리안 숏헤어";
	          
	          b.cor = "갈색";
	          
	    Catfo(a);
	    System.out.println();
	    Catfo(b);

	}

}
