package string_builder01;

public class Builder03_408p {

	public static void main(String[] args) {
		
        //delete는 말 그대로 문자열의 일부, 혹은 전체를 삭제한다.
		//delete(시작인덱스번호, 끝인덱스번호)를 입력하면
		//시작지점부터 끝지점 사이를 삭제해준다.
		
		StringBuilder a = new StringBuilder("abcdefghijk");
		System.out.println(a);
		a.delete(3, 10);
		
      	System.out.println(a);
      	
      	
      	
      	

	}

}
