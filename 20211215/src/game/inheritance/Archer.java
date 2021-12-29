package game.inheritance;

public class Archer extends Commoner{
	
	private int rDam;
	
	public Archer(String id) {
		super(id);
	    this.rDam = 20;
	}
	public void getInfo() {
		System.out.println(id+"님의 궁수캐릭터");
		System.out.println("Lv."+lv+"\n현재상태는\n"+
				           "원거리공격력:"+rDam+"\n"+
		                   "체력:"+hp+" 마나:"+mp+"입니다.\n");
	}
	}


