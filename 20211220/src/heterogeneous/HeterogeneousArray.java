package heterogeneous;

public class HeterogeneousArray {

	public static void main(String[] args) {
		// int[]에는 정수만 넣을 수 있다.
		int[] a = {1,2,3,4,5,6,7,8,9,10};
	  //int[] b = {"a","b",1,2} 문자열이 있어 에러가 발생.
		
		for(int value : a) {
			System.out.println(","+ value);
		}
		System.out.println();
		
	    Object [] b = {"a","b", 1,2,3.0,5.1};
		// 여러 자료형을 받을 수 있도록 모든 클래스의 부모인 object로 배열을 생성.
		// 다형성의 원리에 의해 모든 자료를 저장받을수있다.
		for(Object Value : b) {
			System.out.println(","+Value);
		}
		
	}

}
