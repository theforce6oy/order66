
public class Continue01_123p {

	public static void main(String[] args) {
		
		// continue 문은 스킵기능을 생각하시면 됩니다.
		// 돌던 바퀴를 즉시 종료하고, 다음바퀴를 이어서 실행합니다.
		// 전체 반복문을 종료시키는 break와 헷갈리지않도록 주의.
		
		for(int a = 1; a<10; a++) {
			if(a==6 || a==8) { // ||: or
				System.out.println("stop");
				continue; // a가 6이거나 8일때 해당 바퀴만 즉시 종료 후 다음 바퀴로
				}
			System.out.println("이번 숫자는"+a+"입니다.");
		}

	}

}
