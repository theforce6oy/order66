package exception1;

public class Exception03_348p {

	public static void main(String[] args) {
		
		// 예외 발생 케이스 3.
		// 클래스 자료형을 생성할 때 
		// new로 힙 공간에 저장된 데이터를 제공하지 않은 경우.
		
		Scanner scan = null; //데이터 없음을 뜻하는 null 타입.
		/*Exception in thread "main" java.lang.Error: 
		 * Unresolved compilation problem: 
		 * Scanner cannot be resolved to a type */
		scan.nextInt();

	}

}
