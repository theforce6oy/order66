package string01;

public class String11_399p {

	public static void main(String[] args) {
		
		//String.valueOf()는 괄호 사이의 자료를 문자열로 바꿔준다.
		String a = String.valueOf(1000);
		//int a = 1000;
		System.out.println(a);
		System.out.println(a+1);
		
		// 실수 하나를 임의로 문자열로 바꿔서 저장해보기
		String b = String.valueOf(0.2);
		//double b = 0.2;
		System.out.println(b);
		System.out.println(b+1);
		
		//String.valueOf()를 쓰지않고도
		//+"문자열"만으로도 문자열로 만들수있다.
		//자바는 문자열+다른자료형이 오는 경우 전부 문자로 치환하여 처리한다.
		
		String c = 1000+"";
		System.out.println(c);
		System.out.println(c+1);
		
		String d = String.valueOf(true);
		String e = false +"";
		System.out.println(d+2);
		System.out.println(e+3);

	}

}
