package game.accessmodifier;

public class Magician extends Commoner {
	
	public void hunt() {
		
		System.out.println("마법사가 사냥을 시작합니다.");
		
		//hp -= 2;를 직접 실행할 수 없으므로 (private)
		//public값인 Setter(setHp)를 이용합니다.
		//setHp(5)인 경우, 기존 (부모클래스의)hp 값에 5가 대입되는 요청구문.
		
		//그러나 [-= 2]를 적용하고 싶은 경우
		//아래와 같이 식을 변경하여 적용이 가능하다.
		//set(메소드)은 [get(현재체력)-2]과 같이 식을 응용 적용
        setHp(getHp()-2);
		setExp(getExp()+10);
		
	}
	
	public void Fireball() {
		System.out.println("마법사가 화염구를 시전");
		setMp(getMp()-3);
		setExp(getExp()+20);
	}
	
	public void heal() {
		System.out.println("마법사가 치료을 시작합니다.");
		setMp(getMp()-2);
		setHp(getHp()+10);
	}
  //심지어 private요소는 수정뿐만아니라 조회조차 불가능하다. 
	public void getInfo() {
		System.out.println("마법사");
		System.out.println("현재 체력:"+getHp());
		System.out.println("현재 마나:"+getMp());
		System.out.println("현재 경험치:"+getExp());
	}
	
}
