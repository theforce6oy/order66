package casting;

public class Main_animal {

	public static void main(String[] args) {
		
		Animal a = new Cat("냥이", 3);
		
		Animal b = new Dog("멍멍이", 2);
		
		Animal c = new Animal("어흥이" , 10);
		
		a.sit(); /*부모와 상속자 모두에 동시 존재하는 자원*/
		
		((Cat) a).groom(); 
		
		b.sit();
		
		((Dog) b).bark();
		
		c.sit();
     /* c.bark(); Dog에만 있는 자원이라 접근불가 */
	 
		//Cat cat = a; (x)
		Cat cat = (Cat) a;
		//a는 Animal 타입이지만 힙에 저장된 데이터인 Cat으로 변환가능
		
		cat.groom();
		
        Dog dog = (Dog)b;
		
		dog.bark();
		
	
	}

}
