package game.interaction;

public class Main_interaction {

	public static void main(String[] args) {
		
		Warrior a = new Warrior();
		
		Orc b = new Orc();
		
		a.huntOrc(b); //입력 대상인 b(Orc)를 넣어준다.
		
		//호출순서
		//main > Warrior() > main 7의 우변값 좌변에 대입 >
		//huntOrc > Orc() > main 11의 우변값 좌변대입 > 
		//doBattle(uAtk) > doBattle(Warrior.Atk) > 
		//huntOrc 26 > main
		
		Troll c = new Troll();
		
		a.huntTroll(c);
		a.huntTroll(c);
		a.huntTroll(c);
		
		Tanker d = new Tanker();
		
		d.huntTroll(c);
		d.huntOrc(b);
		
        Poisoner g = new Poisoner();
		
		g.huntTroll(c);
		g.huntOrc(b);
		
		Goblin e = new Goblin();
		
		
		a.huntGoblin(e);
		
		d.huntGoblin(e);
		
		g.huntGoblin(e);

	}
	

}
