package arrays01;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		
		// Arrays.copyOfRange()는 copyOf()와 유사하지만
		// 시작이 0번 인덱스로 고정되지않고
		// copyOfRange(시작인덱스, 끝 인덱스+1);
		// 과 같이 시작점과 끝점의 범위를 정해줄수있다.
		
		int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
		
		int[] arrCopy = Arrays.copyOfRange(arr, 3, 7);
		System.out.println(Arrays.toString(arrCopy));
		
		int[] arrCopy2 = Arrays.copyOfRange(arr, 1, 15);
		System.out.println(Arrays.toString(arrCopy2));

	}

}
