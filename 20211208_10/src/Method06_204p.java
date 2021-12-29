
public class Method06_204p {

	public static int mul(int a, int s, int w) {
		
		return a*s*w;
	}
	
	public static void info() {
		
		System.out.println("안녕하세요.");
		System.out.println("자바 메소드 학습중입니다.");
		System.out.println("1번의 호출로 3번줄을 콘솔에 작성합니다.");
	}
	
	public static void main(String[] args) {
		
		int r = mul(9,6,8);
		System.out.println(r);
		System.out.println();
		
		info();
	}
}
