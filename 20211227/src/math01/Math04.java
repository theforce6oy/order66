package math01;

public class Math04 {

	public static void main(String[] args) {
		
		// 0 이상 1 미만의 난수를 구해주는 random()
		
		double a = Math.random();
		System.out.println(a);
		
		if(Math.random() < 0.2) {
			System.out.println("강화에 성공했습니다.");
		}
		else {
			System.out.println("강화에 실패했습니다.");
		}

		// 범위를 제한하고 싶은 경우(0 이상 6 미만)
		int b = (int)(Math.random()*6);
		System.out.println(b);
		
	}

}
