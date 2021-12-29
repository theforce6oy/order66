package game.inheritance;

public class Commoner {
	
	protected int lv;//기본값1
	protected int hp;//기본값20
	protected String id;//그때그때 입력받는 변수로 설정
	protected int mp;//기본값10
	
public Commoner(String id) {
//생성자 내부에서 멤버변수를 초기화할때는 this.를 붙이는 경우가 많다.
	this.lv = 1;
	this.hp = 20;
	this.id = id;//직접적으로 입력받는 멤버변수이므로 this.를 꼭
	this.mp = 10;
}
public void getInfo() {
	System.out.println(id+"님의 캐릭터");
	System.out.println("Lv."+lv+"\n현재상태는\n"+
	                   "체력:"+hp+" 마나:"+mp+"입니다.\n"); 
}

}
