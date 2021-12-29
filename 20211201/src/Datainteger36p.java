
public class Datainteger36p {

	public static void main(String[] args) {
		// 정수는 자료형의 크기에 따른 비트갯수에 따라 표현범위가 달라집니다.
		// 2의 보수방식을 취하기 때문에 그렇습니다.
		// 범위를 넘지않도록 주의.
		
		byte a= -128; //byte -128 ~ +127
		System.out.println(a);

		// 그냥 숫자를 적으면 int로 간주
		// 따라서 int범위를 벗어난 값은 long형에는 대입이 되지않는다.
		// int범위를 벗어난 숫자를 대입할땐 숫자뒤에 L을 추가로 붙임.
		long b = 250000000L;
		System.out.println(b);
		
		
	}

}
