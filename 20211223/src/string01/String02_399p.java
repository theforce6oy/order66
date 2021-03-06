package string01;

public class String02_399p {

	public static void main(String[] args) {
		
		//indexOf()는 특정 문자열의 시작 인덱스 값을 반환한다.
		//만약 특정 문자열이 포함되어 있지 않다면 -1을 리턴한다.
		
		String tomato = "tomato";
		int get = tomato.indexOf("to");
		System.out.println(get);
		
		//중복문자 집계 
		//(0이 아닌 1번 인덱스부터 조회하여 처음으로 나오는 "to"를 조회해보기
		get = tomato.indexOf("to",1);
		System.out.println(get);
		
		//없는 문자열 조회시 -1이라는 가상의 인덱스번호를 반환한다.
		get = tomato.indexOf("to",10);
		System.out.println(get);
		get = tomato.indexOf("bread");
		System.out.println(get);
		

	}

}
