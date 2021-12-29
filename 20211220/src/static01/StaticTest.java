package static01;

public class StaticTest {
	//static이 안붙은 변수는 객체가 개별적으로 가지는 변수이다.(붙으면 공용으로 사용하는 변수)
	
	public int num1;
	
	//static(정적)변수는 모든 객체가 공유하는 하나의 변수입니다.
	//static변수는 객체를 (new키워드로 자료를) 생성하기 전부터 존재한다.
	public static int num2 = 0;
	
	public StaticTest() {
		
		this.num1 += 5;
		
		num2 += 1; //생성자메소드이므로 생성될때마다 1씩 증가하도록 설정되었다. line 6 참고
		
		System.out.println("num1 변수는 변하지 않습니다.: "+num1);
		System.out.println("현재 가입자수: "+num2+"명.");
		
		/*public static int num1;
		this.num1 += 5;
		현재 예시에서 num1은 공용변수가 아니므로 +=5를 해도 생성될때마다 값이 변하지않는다.*/
		
	}
	
	public static void check() { // Main02 Line 17
		
		System.out.println("공용 메소드 체크완료");
	  /*System.out.println("체크완료"+num1); (X)
	    공용 메소드 내부에서 공용이 아닌 객체를 사용하면 호출 불가
	    Main,생성자,객체 호출 이전에 공용 메소드가 이미 생성이 되어있기 때문이다.*/
	}

}
