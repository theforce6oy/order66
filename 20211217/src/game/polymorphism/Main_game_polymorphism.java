package game.polymorphism;

public class Main_game_polymorphism {

	public static void main(String[] args) {
		
		Commoner a = new Commoner("최아무개");
		
		Monster b = new Orc();
	  //Orc c = new Orc(); 
	  //오크(자식메소드)가 몬스터(부모메소드)를 상속받았기 때문에 Orc로 생성해도 정상적용
	
		Monster c = new Undead();
		
		Monster d = new Goblin();
		
		Monster e = new Dragon();

		a.hunt(b);
		a.hunt(b);
		
		a.hunt(c);
		a.hunt(d);
		a.hunt(e);
		a.hunt(e);
		
		
		

	}

}
