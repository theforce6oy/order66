package game.interaction;

public class Poisoner {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;
	
	private int pAtk;
	
	public Poisoner() {
		
		this.hp = 10;
		this.mp = 30;
		this.atk = 1;
		this.def = 1;
		this.exp = 0;
		this.pAtk = 15;
	}
	
public void huntOrc(Orc Orc) {
		
		System.out.println("독살전문가가 독기술로 오크를 공격합니다.");
		Orc.doBattle(this.pAtk);
		this.hp=(this.hp+this.def)-Orc.getAtk();
		 if(Orc.getHp()<=0) {
		    	System.out.println("오크를 처치했습니다.");
		   return; }
		    System.out.println("교전결과 독살전문가의 체력:"+this.hp);
	}
	
	public void huntTroll(Troll tr) {
		
		System.out.println("독살전문가가 트롤을 공격합니다.");
	    tr.doBattle(this.pAtk);
	    this.hp=(this.hp+this.def)-tr.getAtk();
	    
	    if(tr.getHp()<=0) {
	    	System.out.println("트롤을 처치했습니다.");
		return; }
	    System.out.println("교전결과 독살전문가의 체력:"+this.hp);
	}
	
public void huntGoblin(Goblin gb) {
		
		System.out.println("독살전문가가 고블린을 공격합니다.");
	    gb.doBattle(this.atk);
	    this.hp=(this.hp+this.def)-gb.getAtk();
	    
	    if(gb.getHp()<=0) {
	    	System.out.println("고블린을 처치했습니다."); 
	    return; }
	    System.out.println("교전결과 독살전문가의 체력:"+this.hp);
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

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getpAtk() {
		return pAtk;
	}

	public void setpAtk(int pAtk) {
		this.pAtk = pAtk;
	}
}
