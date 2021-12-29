
public class Parseint01 {

	public static void main(String[] args) {
		
		// 정수자료는 문자로 바꾸고 싶을떄
		// "문자열" + 정수자료를 적용하면 문자로 변경된다.
		// 그러나 문자 전체가 정수로만 이루어진 문자열을
		// 정수로 치환하기 위해서는 별도의 문법을 사용한다.
		
		String str = "2021";
		int year = Integer.parseInt(str);
		// Integer.ParseInt(문자열)을 집어넣으면 정수로 바꿔준다.
		
		// 정수 2021 + 정수 1 == 2022
	    System.out.println(year + 1);
	    
	    // 문자 2021 + 정수 1 == 20211
	    System.out.println(str + 1);

	}

}
