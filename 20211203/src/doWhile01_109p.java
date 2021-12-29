
public class doWhile01_109p {

	public static void main(String[] args) {
		
		// do ~ while 문은 나중에 조건식이  false 라고 해도
		// [첫번째 바퀴는 조건비교 없이 바로 실행]하고,
		// 두번째부터 조건비교를 통해 추가 실행여부를 결정한다.
		
	    int a = 6;
	    
	    do { // 구문작성 후 하단에 실행문 작성.
	    	a += 2;
	    	System.out.println("a는 5보다 작나요?");} 
	    while(a < 5); // 일반 while문과 달리 마지막에 ;를 붙인다.

	}

}
