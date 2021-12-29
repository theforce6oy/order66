package game.interaction;

public class Troll {
	
	private int atk;
	private int def;
	private int hp;
	
	public Troll() {
		
		this.atk = 2;
		this.def = 0;
		this.hp = 30;
	}
	
	public void doBattle(int uAtk) {
		
		hp = (hp + def) - uAtk;
		if(hp<=0) {
		    return;}
		else {
			System.out.println("트롤의 남은체력:"+hp);
		}
	}
	

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	

}
