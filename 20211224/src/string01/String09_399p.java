package string01;

public class String09_399p {

	public static void main(String[] args) {
		
		// 기본적으로 문자열은 참조형 변수이기 때문에 
		// 비교를 할때 [주소값 비교]가 일어난다.
		
		String a = new String("테스트");
		String b = new String("테스트");
		System.out.println("new키워드로 각각의 문자열을 생성한 경우");
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a==b);
		System.out.println();
		
		System.out.println("주소값이 같아 하나의 문자열을 공유하는 경우");
		String c = "테스트";
		String d = "테스트";
		System.out.println(c==d);
		System.out.println();
		
		//이떄, .equals()를 이용하면 주소값 비교가 아닌 문자열간의 비교가 가능하다.
		System.out.println("equals를 이용하여 주소가 아닌 문자열을 비교");
	    System.out.println(b.equals(a));
		

	}

}
