package game.inheritance;

public class Magician extends Commoner{
	
	private int mDam;
	
public Magician(String id) {
	super(id);
    this.mDam = 56;
}
public void getInfo() {
	System.out.println(id+"님의 마법사캐릭터");
	System.out.println("Lv."+lv+"\n현재상태는\n"+
			           "마법공격력:"+mDam+"\n"+
	                   "체력:"+hp+" 마나:"+mp+"입니다.\n");
}
}
