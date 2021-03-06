package arrays01;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		
		// Arrays.sort()
		// 배열 내부 순서를 작은 숫자일수록 0번 인덱스에 가깝게
		// 큰 숫자일수록 마지막 인덱스에 가깝게 배치한다.
		
		int[] arr = {21,40,20,1,3,13,9,89};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// sort는 숫자뿐 아니라 순번을 정할수있는 다른 자료형에도 작동한다.
		// ASCII코드 규칙에 따라 정렬된다.
		// 문자열의 경우 맨 앞글자의 아스키코드 번호의 대소관계를 이용해 정렬된다.
		String[] arr2 = {"apple", "Apple", "banana", "giraffe", "Zet", "가나다", "하하","조까","씨발"};
		
		Arrays.sort(arr2);
		
		System.out.println(Arrays.toString(arr2));
		

	}

}
