package game.interaction;

public class Main01 {
	public static void main(String[] args) {
		// 전사를 만들어주세요.
		Warrior w1 = new Warrior();
		// 오크를 만들어주세요.
		Orc o1 = new Orc();
		// 전사의 huntOrc를 호출해주세요.
		w1.huntOrc(o1);
	}
}
