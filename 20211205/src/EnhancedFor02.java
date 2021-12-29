
public class EnhancedFor02 {

	public static void main(String[] args) {
		
		// 과목별 성적 평균점수 구하기
		
		int[] math={96, 23, 52, 82, 72, 31, 58};
		int[] eng={62, 42, 68, 31, 80, 77, 45};
		int[] com= {10, 28, 39, 74, 65, 90, 98};
		
		int total = 0;
		int total2 = 0;
		int total3 = 0;
		
		for(int a:math) {
			total += a; } // 총합수식 +=
			System.out.println("math 평균:" + total/math.length); 
		
		for(int b=0; b < eng.length; b++) {
			total2 += eng[b]; }
			System.out.println("eng 평균:" + total2/eng.length);
		
		
		for(int c:com) {
			total3 += c;}
			System.out.println("com 평균:" + total3/com.length);
		
			
			System.out.println("TOTAL:"+(total/math.length+total2/eng.length
					+total3/com.length)/3.00);
	}

}
