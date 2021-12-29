package interaction;

public class Main01 {

	public static void main(String[] args) {
		
		Seller a = new Seller(20,10);
	
		Buyer b = new Buyer(100000); 
		
		a.showSeller();
		
		b.buyMango(a, 5);
		
		a.showSeller();
		
		b.buyMelon(a, 4);
		
		a.showSeller();
		
		b.showBuyer();
		
	}
}
	
		




	


