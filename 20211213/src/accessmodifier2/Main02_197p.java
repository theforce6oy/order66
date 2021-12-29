package accessmodifier2;

import accessmodifier.Warrior;

public class Main02_197p {

	public static void main(String[] args) {
		
		Warrior a = new Warrior("Skywalker");
		
		a.hunt();
		a.hunt();
		a.hunt();

	// Warrior 변수값이 pakage friendly(default)일때는 
	// pakage가 달라서 위 구문이 실행이 되지않는다.
	// public의 경우 가능하다.
	}

}
