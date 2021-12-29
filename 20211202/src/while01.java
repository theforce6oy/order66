
public class while01 {

	public static void main(String[] args) {
		
		// while 문은 타겟이 되는 실행문을 반복하여 실행하는 구문이다.
		// while 문은 실행여부를 조건식 비교를 통해 결정한다.
		// 한번 실행하기로 결정되면 모든 타겟 실행문을 실행.
		// 실행이 끝나면 다시 while 구문으로 복귀한다.
		// 추가비교를 통해 실행/탈출 여부가 결정된다.
		// ** java tutor로 확인해보자
		
		int a = 0;
		//반복되는 서클의 탈출 주기를 잘봐라. 추가 실행여부는 while구문에서 결정된다. 1,2
		while(a < 2) {
			a += 1;
			System.out.println(a + "번째 반복문을 실행중입니다."); }
			
	    int b = 1;
	  //반복되는 서클의 탈출 주기를 잘봐라. 추가 실행여부는 while구문에서 결정된다. 3,5
        while(b < 4) {
			b += 2;
			System.out.println(b + "번째 반복을 표시입니다.");    }

	}

}
