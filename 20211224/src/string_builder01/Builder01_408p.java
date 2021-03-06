package string_builder01;

public class Builder01_408p {

	public static void main(String[] args) {
		
		//StringBuiler는 String과의 로직차이로 인해
		//속도 개선이 되었습니다. 일부 기능은 String의 기능과 겹칩니다.
		
		StringBuilder a = new StringBuilder("abefg");
		
		//인덱스 2번 이후의 모든 자료를 
		//다 1칸씩 뒤로 밀고 확보된 공간에 "cd"입력해보기
		
		a.insert(2, "cd");
		System.out.println(a);
	}

}
