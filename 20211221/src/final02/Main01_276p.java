package final02;

public class Main01_276p {

	public static void main(String[] args) {
		
		//final변수를 쓰기 위한 조건
		//1. Country.란 소속을 써줘야 함.
		// Country(국가) > 소속을 Categorized하여 가독성을 높임
		System.out.println(Country.KOREA);
		System.out.println(Country.CHINA);
		System.out.println(Country.STATES);
		System.out.println(Country.CANADA);
		
		//Country.KOREA = 1003;(X)
		//값의 재할당은 final 변수이기에 불가능하다.
		
        //Math(수학)
		System.out.println(Math.E);
		System.out.println(Math.PI);
	}

}
