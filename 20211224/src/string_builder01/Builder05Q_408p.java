package string_builder01;

public class Builder05Q_408p {

	public static void main(String[] args) {
		
		//다음 문자열의 문자를 0번부터 시작해서 3번쨰마다 삭제해보기
		
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		
		for(int i = 0; i < a.length(); i+=2) {
			a.deleteCharAt(i);
		}
	    System.out.println(a);
	}

}

