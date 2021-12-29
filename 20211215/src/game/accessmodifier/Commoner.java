package game.accessmodifier;

public class Commoner {
 
	//private 요소는 자식쪽에서도 조회나 수정이 불가능.
    //보안성이 뛰어나기 때문에 private를 무조건 써야한다면
    //setter, getter라는 것들을 이용하여 보조한다.
	private int hp;
	private int mp;
	private int lv;
	private int exp;
	
	public Commoner() {
		
		this.hp = 20;
		this.mp = 10;
		this.lv = 1;
		this.exp = 0;
	}
	//setter/getter 기본 자동작성 요령
	//마우스 우클릭 > Source > Generate Getters/Setters

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

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
}
