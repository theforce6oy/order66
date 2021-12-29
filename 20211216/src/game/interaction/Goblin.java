package game.interaction;

public class Goblin {
	
	private int hp;
	private int atk;
	private int def;
	
	public Goblin() {
		
		this.hp = 10;
		this.atk = 4;
		this.def = 0;
	}
	public void doBattle(int uAtk) {
		
		hp = (hp + def) - uAtk;
		if(hp<=0) {
		    hp=0;
		    System.out.println("고블린이 죽었습니다.");
	    return;
	    }
		System.out.println("고블린의 남은체력:"+hp);
		}
	

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
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
	
}
