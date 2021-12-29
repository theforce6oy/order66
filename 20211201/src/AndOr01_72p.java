
public class AndOr01_72p {

	public static void main(String[] args) {
		
		// AND(&), OR(|)
		
		// 논리 연산자는 둘이상의 논리식을 나열해서 제시할때 사용.
		// 논리식1 & 논리식2 의 경우 양쪽 모두 true인 경우
		// 논리식1 | 논리식2 의 경우 한쪽 이상의 논리식이 다 true인 경우
		
		// -> 최종 조건식을 true로 판단.
		
		System.out.println((100>0) & (30>50));
		System.out.println(100>50 | 30>50);
		
		// Short Circuit Operator
		// &,|과 같되 왼쪽의 조건식 만으로 모든 결과가 확정되면 추가적 연산을 무시한다.
		// && : 논리식 왼쪽항이 거짓일 경우 오른쪽을 생략 후 false 출력
		// || : 논리식 왼쪽항이 참일 경우 오른쪽을 생략 후 true 출력 
		
		System.out.println(100<30 && 30<31);
		System.out.println(70>59 || 19>28);
		System.out.println((1+3>4)&&(0<3/0)); // 생략하지 않을경우 에러..
		System.out.println((5>4)||(0<2/0));
		
	}

}
