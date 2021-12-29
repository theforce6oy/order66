import java.util.Arrays;

public class EnhancedFor01 {

	public static void main(String[] args) {
		
		// 향상된 for문은 반복문 진행시 타겟으로 배열을 넣니다.
		// 이 경우 반복실행횟수는 배열 내부요소의 갯수만큼 넣습니다.
		
		// 아래의 예시는 7개의 요소를 묶어 arr1에 저장한 구문.
		
		int[] arr1 = {100,211,339,475,591,600,700};
		// arr1[순번]을 입력하여 내부요소를 하나만 꺼낼수있음.
		// [ 0 ~ ]*0부터 카운트.
		
	    System.out.println(arr1[3]);
	    
	    System.out.println(Arrays.toString(arr1));
	
	
	    for(int item:arr1) {
	    	// for (하나씩 받을 변수 : 배열){
	    	// 실행문...
	    	// 배열 내의 각값을 순회.
	    	System.out.println(item);}
	    
	    // for(int i = 0; i<8; i++) {
	    // Sysout.println(arr1[i]); }
	
	    // 배열명.length 는 내부요소의 갯수를 대신하여 쓸수있다.
		// for(int a = 0; a<arr1.length; a++); {
	    // sysout.println(arr1.[a]); }
		    
	}
	    
	}



