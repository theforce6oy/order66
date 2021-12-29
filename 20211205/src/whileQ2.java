
public class whileQ2 {

	public static void main(String[] args) {
		
		// 반복문의 3개 조건
		// 1. 조건식 (참 거짓 판단해 실행여부 결정)
		// 2. 변수 (필요에 의해 true -> false로 만들기 위한)
		// 3. 변수의 증감 
		// for문의 경우 위 3요소를 한줄에 담는다면,
		// while은 따로 떨어드려 놓는것이 특징
		// 한줄에 있냐, 떨어져있냐만 빼면 사실상 같은 구문.
		
		// 구구단 만들기
		
		// 변수 생성
		int a = 2;
		// 조건식 생성
		while(a<=9) { // 구구단 이므로 2~9
			
		   int b = 1; // a 곱하기 X단이므로 1부터
		 while(b<9) {
			   b++; // 사실상 for(int b=1; b<10; b++)와 같다!!!
			   
			   System.out.println(a + "*" + b + "=" + a * b);
		   }
		   System.out.println("-------------");
		
		 // for구문은 b를 다 돌고나서 a값을 증가시킨다.
		   a++; // or 'a = a+1;' , 'a += 1;'
		// 사실상 for(int a=0; a<10; a++)와 같다!!!
		   
		}

	}

}
