package game.interaction;

public class Orc {
	
	private int hp;
	private int atk;
	private int def;
	
	public Orc() {
		
		this.hp = 5;
		this.atk = 3;
		this.def = 0;
	}

	public void doBattle(int uAtk) {
		//유저의 공격력을 받아 오크의 체력을 차감
		hp = (hp + def) - uAtk;
		if(hp<=0) {
		    hp=0;
		    System.out.println("오크가 죽었습니다.");
	    return;
	    }
		System.out.println("오크의 남은체력:"+hp);
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
