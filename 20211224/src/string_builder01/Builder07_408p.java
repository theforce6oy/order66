package string_builder01;

public class Builder07_408p {

	public static void main(String[] args) {
		
		// toString()은 내부자료를 String으로 바꿔준다.
		
		StringBuilder str = new StringBuilder("가나다라마바사");
		
		//String hangul = (String)a; (X)
		String hangul = str.toString();
		
		System.out.println(hangul);
		
		//String to StringBuilder
		StringBuilder str2 = new StringBuilder(hangul);
		
		System.out.println(str2);

	}

}
