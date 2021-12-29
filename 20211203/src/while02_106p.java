

public class while02_106p {

	public static void main(String[] args) {
		
		// while문의 조건식이 어떻게 해석해도 true로 판단되는 조건식을 넣으면
		// 절대 끝나지 않는 무한루프문이 된다.
		// 이경우 강제 탈출구문인 break를 이용하여 종료.
		
		int num = 0;
		while(true) {
			num += 1;
			System.out.println("반복문 실행중입니다." + num);
			break;
		}
	}
}
