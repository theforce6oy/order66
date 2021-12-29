				
public class for03_117p {

	public static void main(String[] args) {
		
		// 중첩 반복문은 반복문을 반복하는 구문이다.
		// 다중 for문이라고도 하는 이 구문은
		// for 문 내부에 추가로 for문을 작성하여 구성하며
		
		// 실행횟수는 바깥쪽 반복문의 반복횟수 * 안쪽 반복문 반복횟수 입니다.
		// 굉장히 많은 분야에서 응용되고 있으므로 반드시 잘 익혀두셔야 합니다.
		
		for(int j=0; j<4; j++) {
			for(int a =0; a <2; a++) {
				System.out.println("Hello");
			}
		}
	}

}
