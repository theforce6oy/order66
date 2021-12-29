package string_builder01;

public class Builder04_408p {

	public static void main(String[] args) {
		
		// String에서 CharAt은 기본적으로 한 글자를 의미한다,
		// deleteCharAt()은 문자열 내부에서 저장된 인덱스번호에 해당하는
		// 한 글자만 삭제하는 로직을 의미한다.
		
		StringBuilder a = new StringBuilder("abcde");
		
		System.out.println(a);
		
		a.deleteCharAt(0);
		
		System.out.println(a);

	}

}
