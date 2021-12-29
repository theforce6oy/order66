
public class DataDouble43p {
	public static void main(String[] args) {
		
		// 실수 표현을 할 때는 float, double 자료형을 사용.
		// 기본적으로 대입할 목적으로 숫자를 실수로 적으면 double로 간주.
		// 만약 float형으로 실수를 적고 싶다면, 숫자 가장오른쪽에 F를 적어준다.
		
		float a = 1.1f; // a변수에 double 1.1을 넣으려해서 에러발생(f기입하여 픽스)
		double b = 1.1;
		System.out.println(a);
		System.out.println(b);
		
		// 제대로 표현되지 않는 실수
		// 이진수로 표현되지 않는 실수가 결과값인 경우는 정확한 값이 나오지 않는 경우도 있다.
		
		double c = 1-(0.1*7); // * ex) 0.3은 이진수로 표현할 수 없음
		System.out.println(c);
		
		// 
	}
}
