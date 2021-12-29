package accessmodifier;

public class Warrior { // 정의부. 실제실행은 Main에서.
  
  /*public*/String name; //package friendly
  
    private int hp; // 변수를 막는 기능.
  //변수값은 현실에서도 특정한 물체나 사람의 상태가 
  //휙휙 바뀌지않으므로 외부에서 값을 함부로 고칠수없도록 private로 처리한다.
	public int mp;
	public int lv;
	public int atk;
	public int def;
	public int exp;
	
	public Warrior(String n) {
		
		name = n;
	    hp = 20;
		mp = 10;
		lv = 1;
		atk = 3;
		def = 0;
		exp = 0;
		
		System.out.println("아이디: "+ name);
		}
	
	// 생성자를 비롯한 메소드는 행동을 나타내고 
	// 행동의 성공/실패 여부는 
	// 오로지 정보(변수)에 의해 결정되며 시도 자체는 제한이 없다.
	public void hunt() {
		hp -= 2;
		exp += 10;
		System.out.println("사냥 결과");
		System.out.println("체력은 "+hp+"이(가) 되었고, "
				+ "누적경험치는 "+exp+"입니다.");
		
	}
}
