package game.interaction;

public class Main02 {
	public static void main(String[] args) {
		// 전사 생성
		Warrior w1 = new Warrior();
		// 트롤 생성
		Troll t1 = new Troll();
		// 교전 2번
		w1.huntTroll(t1);
		w1.huntTroll(t1);
		w1.huntTroll(t1);
		w1.huntTroll(t1);
	}
}
