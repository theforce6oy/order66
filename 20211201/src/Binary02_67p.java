
public class Binary02_67p {

	public static void main(String[] args) {
		
		// 비교 연산자는 크게 대소비교와 단순비교로 나뉩.
		// 단순비교 : ==,!= 숫자가 아닌 자료형간 비교도 가능
		// 대소비교 : >,<,>=,<= 숫자끼리만 비교가능
		// 컴퓨터는 비교연산자를 명제로 인식함.
		// 참(true), 거짓(False)를 판단해 결과로 나타냄
		
		System.out.println(3>5);
		System.out.println(12<=12);
		System.out.println("a"!="b");
		System.out.println("a"=="a");
		System.out.println(5 == 5.0);
		System.out.println(5==(double)5.0);
		
	}

}
