package game.polymorphism;

public class Commoner {
	
	private String name;
	private int hp;
	private int mp;
	private int atk;
	
	public Commoner(String name) {
		
		this.name = name;
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
	}
	//다형성을 적용하여 어떠한 몬스터를 공격하더라도 이 메소드 하나로 처리하기
	public void hunt(Monster monster) {
		System.out.println(monster.getName()+"에게 공격");
		
		monster.doBattle(this.atk);
		this.hp = hp - monster.getAtk();
		if(monster.getHp()>0) {
			if(this.hp<=0) {
				hp = 0;
				System.out.println(name+"이(가) 사망했습니다.");
				System.out.println("게임이 끝났습니다.");
			}
			else {
		
			System.out.println(name+"의 체력:"+this.hp);
		}
		}
	}
		

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}
}
