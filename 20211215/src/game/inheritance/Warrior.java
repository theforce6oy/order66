package game.inheritance;

public class Warrior extends Commoner {
	
	private int pDam;
	
public Warrior(String id) {
	
	super(id); //생성자 내부에서 다른 코드에 앞서 1순위로 작성
	this.pDam = 88;
    
}
public void getInfo() {
	System.out.println(id+"님의 전사캐릭터");
	System.out.println("Lv."+lv+"\n현재상태는\n"+
			           "특수공격력:"+pDam+"\n"+
	                   "체력:"+hp+" 마나:"+mp+"입니다.\n"); 
	
	
}
	
}


