package final01;

public class Final_main02_278p {

	public static void main(String[] args) {
		
		//일반 숫자를 이용한 출력요소
		//System.out.println("전사의 체력:"+50);
		System.out.println(50);
		//System.out.println("몬스터의 경험치:"+20);
		System.out.println(20);
		
		//자주 사용하게될 고정값은 아래와 같이 
		//상수를 처리해서 코드에 대입해준다.
		//이렇게하면 변수명만으로도 어떤 의미를 가진 수치인지
		//바로 유추가 가능하기 때문에 코드 가독성이 높아진다.
		
		final int WARRIOR_HP = 50;
		final int MONSTER_EXP = 20;
		System.out.println(WARRIOR_HP);
		System.out.println(MONSTER_EXP);
		//상수값은 대문자로만 적을시 단어사이는 _(언더바)로 연결
		
		System.out.println(WARRIOR_HP);
		System.out.println(MONSTER_EXP);
		System.out.println(WARRIOR_HP);
		System.out.println(MONSTER_EXP);
		System.out.println(WARRIOR_HP);
		System.out.println(MONSTER_EXP);
		//상수를 굳이 쓰는 2번째 이유
		//값을 일괄적으로 바꾸기 편하기 때문이다.
		//예시와 같이 여러개의 프린팅시 50,20이라는 값을 일괄적으로 변경
	}

}
