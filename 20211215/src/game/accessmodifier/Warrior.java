package game.accessmodifier;

public class Warrior extends Commoner {
	
	public Warrior() {
		super();
	}
	
	public void hunt() {
		System.out.println("전사가 사냥을 시작합니다.");
		setHp(getHp()-1);
		setExp(getExp()+10);
	
	}
	public void doubleAttack() {
		System.out.println("전사가 더블어택을(를) 시전");
		setHp(getHp()-4);
		setExp(getExp()+25);
	}
	public void cyonicSword() {
		System.out.println("전사가 사이오닉소드을(를) 시전");
		setMp(getMp()-5);
		setExp(getExp()+30);
	}
	
	public void getInfo() {
		System.out.println("전사");
		System.out.println("현재 체력:"+getHp());
		System.out.println("현재 마나:"+getMp());
		System.out.println("현재 경험치:"+getExp());
	}

}
