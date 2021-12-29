package exception2;

import java.util.Arrays;

public class TryCatch02_353p {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		//exception1 패키지 내부의 여러 예외 유형 중 하나를 골라
		//예외가 발생할 수 있는 코드를 작성해보고 Try~Catch블럭으로 처리하기
	    try {
		System.out.println(arr[5]);
	    }
	    catch (Exception e) {
		System.out.println(Arrays.toString(arr));
		System.out.println("해당 배열은 총 5개이므로 6번째 값을 출력할 수 없습니다.");
	    }
	    
	}

}
