package exception3;

public class Exception03_353p {

	public static void main(String[] args) {
		
		// 다중 catch는 블럭 내부에서 [여러유형의 예외가 발생할 수 있을 때]
		// 각각의 예외유형을 [다르게 처리할 때] 사용한다.
		// 이때 [catch 구문을 여러번] 사용할 수 있다.
		
		int[] number = {1,2,3,4,5,0};
		
		// 예외가 발생할지도 모르는 코드부터 try블럭에 넣는다.
		try {
			for(int i=0; i<6; i++) { 
				System.out.println(number[i]);
			}
			System.out.println("0으로 나누기를 시도해보겟습니다.");
			System.out.println(number[4]/number[5]);
		}
		
		//for(int i=0; i<7; i++)
		//배열 범위가 6개인데 7개까지 원하는 상황 > ArrayOutOfBoundsException
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("범위를 벗어난 인덱스 번호를 입력했습니다.");
		}
		
		//System.out.println("0으로 나누기를 시도해보겟습니다.");
		//System.out.println(number[4]/number[5]);
		//배열 범위는 정상이지만 0으로 나누려하는 상황 > ArithmeticException
		catch(ArithmeticException b) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		catch(Exception e) {
		   // Exception e 는 만능처리구문으로 어떠한 예외도 다 일괄적으로 처리해준다.
			System.out.println("예외가 발생했습니다.");
		}
	}
}


