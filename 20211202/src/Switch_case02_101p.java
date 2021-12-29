
public class Switch_case02_101p {

	public static void main(String[] args) {
		
		// Switch~case 구문을 사용하 범위 비교 구문처럼 작성하기.
		// 하나의 break에 여러 Case문을 연달아 작성하여 구현.
		// ** case 별로 매칭할때 break 구문의 역할을 이용해서 구간별로 걸리는 구문을 작성.
		
		int score = 2;
		
		switch(score) {
		case 10:
		case 9:
			System.out.println("수");
			break;
		case 8:
		case 7:
			System.out.println("우");
			break;
		case 6:
		case 5:
			System.out.println("미");
			break;
		case 4:
		case 3:
			System.out.println("양");
			break;
		default :
			System.out.println("가");
		}
	}

}
