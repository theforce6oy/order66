package superclass;

public class Main_Air {

	public static void main(String[] args) {
		
		Airplane a = new Airplane("X-wing", 3, 300);
		
		a.getAir();
		
		a.fly();
		a.fly();
	
		a.breakSpeed();
		
		
		
		
		

	    SupersonicAirplane b = new SupersonicAirplane("M.Falcon", 4, 500);
		
        b.getAir();
		
		b.fly();
		b.fly();
	
		b.breakSpeed();
	
	
	}

}

