package game.accessmodifier;

public class Main_access {

	public static void main(String[] args) {
		
		Magician a = new Magician();
		
		a.getInfo();
		
		a.hunt();
		a.hunt();
		
		a.getInfo();
		
		a.Fireball();
		
		a.heal();
		
		a.getInfo();
		
		
	    Warrior b = new Warrior();
	    
	    b.getInfo();
	    
	    b.doubleAttack();
	    b.doubleAttack();
	   
	    b.getInfo();
	    
	    b.cyonicSword();
	 
	    b.getInfo();
	    

	}

}
