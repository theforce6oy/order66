package game.interaction;

public class Dragon {
	private int hp;
	private int atk;
	private int def;
	
	public Dragon() {
		this.hp = 10;
		this.atk = 5;
		this.def = 2;
	}
	
	// doBattle은 유저의 공격력을 받아 오크의 체력을 차감합니다.
	public void doBattle(int uAtk) {
		// Dragon의 체력을 유저 공격력 만큼 차감시켜주세요.
		hp = (hp + def) - uAtk;
		if(hp <= 0) {// 유저의 공격 결과 드래곤이 죽었다면(체력이 0이하라면)
			hp = 0;// 필수는 아님, 죽은 몬스터 체력은 0으로 보정
			System.out.println("드래곤이 죽어서 반응하지 않습니다.");
			return;// 메서드를 여기서 종료합니다.
		}
		System.out.println("드래곤의 남은 체력 : " + hp);//드래곤이 안 죽어야 실행됨
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
