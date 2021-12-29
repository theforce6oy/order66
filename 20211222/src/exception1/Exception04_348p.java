package exception1;

public class Exception04_348p {

	public static void main(String[] args) {
		
		// 예외 발생 케이스 4.
		// 특정 배열을 만들었을때 배열 인덱스를 초과해서 입력하는 경우.
		
		int[] arr = new int[5]; //[0],[1],[2],[3],[4]
		System.out.println(arr[5]); //배열길이는 총 5개인데 6번째 값을 얻으려고 하여 오류가 발생
		
		/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
		 * Index 5 out of bounds for length 5
		 */

	}

}
