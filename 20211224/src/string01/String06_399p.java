package string01;

public class String06_399p {

	public static void main(String[] args) {
		
		// substring()은 인덱스 기준으로 앞 문자열을 삭제합니다.
		// 인덱스번호를 두개 주면 처음 인덱스번호~두번째 인덱스번호 사이만 남겨줍니다.
		
		String str = "자바자바JSPJSP스프링스프링";
		String result = str.substring(5);
		System.out.println(result);
		
		result = str.substring(10, 15);
		System.out.println(result);
		
		/*String str1 = "             Hello Java";
		System.out.println(str1.trim()); // 앞뒤 공백을 제거
		System.out.println(str1);
		System.out.println(str1.replace(" ","")); // 공백을 제거함*/
		
		
		/*String str2 = "                   Hello         Java    ";
		str2 = str2.trim();
		
		System.out.println(str2.replace("         "," "));*/
		
		String str2 = "                    Hello             Java    ";
		str2 = str2.replace("  " , "".trim());
		System.out.println(str2);
		
		

	}

}
