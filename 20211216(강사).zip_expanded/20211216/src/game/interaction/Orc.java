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
	
	// doBattle은 유저의 공격력을 받아 오크의 체력을 차감합니다.
	public void doBattle(int uAtk) {
		// Orc의 체력을 유저 공격력 만큼 차감시켜주세요.
		hp = (hp + def) - uAtk;
		System.out.println("오크의 남은 체력 : " + hp);
	}
	
	
	//getter/setter를 Warrior, Orc에 만들어주세요.
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
