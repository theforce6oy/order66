import java.util.Scanner;

public class ContinueQ1_123p {

	public static void main(String[] args) {
		
	try (Scanner scan = new Scanner(System.in)) {
		System.out.println("import int below");
		int n = scan.nextInt();
		int a = 1;
		int t = 0;
		
		for(a=1; a<n; a++) {
			  if(a%2 != 0) { //a를 2로 나눈게 0이 아닌 값이므로 홀수를 찾는 조건성립
			  t += a;
			  System.out.println("1부터" + a + "까지 총합은 :" + t + "입니다.");
			   continue;
			   }
			   n++; // 다 돌았으면 바퀴수 증가
			   
	 /* while(a<n) {
			a += 1;
			  if(a%2 != 0) { //a를 2로 나눈게 0이 아닌 값이므로 홀수를 찾는 조건성립
			  t += a;
			  System.out.println("1부터" + a + "까지 총합은 :" + t + "입니다.");
			   continue;
			   }
			   n++; // 다 돌았으면 바퀴수 증가 */
		}
	}
	}
}