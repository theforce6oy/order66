package overriding;

public class Main01_265p {

	public static void main(String[] args) {
		
		Animal a = new Tiger();
		
	    
		a.big = 3;
	    a.eatmeat = true;
	    
		a.animalInfo("호랑이");
		
		Animal b = new Cow();
		
		
		a.big = 7;
	    a.eatmeat = false;
	    
		b.animalInfo("황소");
		

	}

}
