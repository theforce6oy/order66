package structure;

public class ClassMain02_196p {

	public static void main(String[] args) {
		
		Car a = new Car();
		
		a.model = "Benz";
		a.price = 4000000;
		a.owner = "Forceboy";
				
        Car b = new Car();
		
		b.model = "Ford";
		b.price = 3000000;
		b.owner = "Wickboy";
				
		
		a.getInfo();
        b.getInfo(); 		
				
				

	}

}
