
public class Method02_204p {
	
	// 리턴구문에 int자료를 입력해야 에러가 나지 않는다!
	
	public static int add2(int a) {
		return a+1;
	}
	public static void main(String[] args) { // 무조건 최초실행은 메인부터 실행된다.  
		
		// 반환 자료가 void가 아닌 경우는 호출 위치에
		// return문 오른쪽 자료를 그대로 갖다놓는다.
		// 자료를 반환하는 것은 콘솔창에 표시한다하는 말과는 다른 의미이다.
		
		int b = add2(10);
		System.out.println(b);
	}

}
