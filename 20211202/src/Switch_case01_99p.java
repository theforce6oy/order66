
public class Switch_case01_99p {
	public static void main(String[] args) {
		
		// swith~case 구문은 변수에 들어있는 값 case문에 제시된
	    // 자료와 일치하는지 여부로 논리식을 판단한다.
		
	    // swith(변수) {
	    // case 값1:
	    //      실행문;
	    // case 값2...
	    // }
	    // 와 같이 작성합니다.
		
	    // 마지막에 defalut 문을 작성시if~else문의 else처럼 가능하다.
		// ** >= 등의 비교범위 지정이 까다로움. (비슷하게 흉내낼순있음.)
	
	int a = 3;
	switch(a) {
	case 1 :
		System.out.println("one"); 
		break; // 각 케이스만 출력을 원할시 브레이크 구문 작성하여 막는다. 
	case 2 :
		System.out.println("two"); 
		break;
	case 3 :
		System.out.println("three"); 
		break;
	case 4 :
		System.out.println("four"); 
		break;
	case 5 :
		System.out.println("five"); 
		break;
	default :
		System.out.println("not all"); 
		break; // default 구문에 브레이크는 필요없지만 가독성을 위해 작성하기도 한다.
	}
	
}
}

