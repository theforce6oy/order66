
public class UnaryQ1_65p {

	public static void main(String[] args) {
		
		int a = 15;
        System.out.println(--a);
        // 1. a값을 먼저 1 감소시킴 : a = a(15)- 1
        // 2. 감소된 a값을 출력.(작성 직후 바로 적용된다는 의미):sysout(a(2))
		
        System.out.println(a);  // 감소한 채로 유지됨.

		System.out.println(a--);
        // 1. a를 출력 sysout(a(2))
		// 2. a를 1 감소시킴 a = (a(2)) - 1
		
		System.out.println(a); // 감소된 a가 출력.
		
		System.out.println(a--);
		
		System.out.println(a);
		
		System.out.println(--a);
		
		System.out.println(a);

	}

}
