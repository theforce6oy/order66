package exception2;

import java.util.Scanner;

public class TryCatch01 {

	public static void main(String[] args) {
        
		//Try~Catch 구문은 크게 
		//예외가 발생할 가능성이 있는 구문을 적어두는 try블럭과 
		//예외가 실제로 발생했을때 대처할 코드를 실행하는 catch블럭으로 나뉜다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("insert a below");
		int a = scan.nextInt();
		System.out.println("insert b below");
		int b = scan.nextInt(); 
		
		try {
			//(예외가 발생할 가능성이 있는) 실행할 구문을 전부 넣는다.
			System.out.println(a/b);
			System.out.println("계산 끝");
		}
		catch (Exception e) {
			//catch블록에는 (Exception e)가 기본으로 들어간다.
			//(Exception e)로 적는경우 예외 종류를 막론하고 전부 처리가 가능하다.
			//추후에 특정한 종류의 예외를 따로 처리하고 싶은 경우에는 다른 예외명을 적으면 된다.
			
			//예시에서는 a나 b의 값이 0인경우 a/b를 실행할 수 없으므로 try블럭에서
			//예외가 발생하여 catch블럭이 실행되었다.
		    System.out.println("나누는 숫자는 0이 될 수 없습니다.");	
		}
		finally {
			//모든 실행구문이 다 끝나고 실행할 코드는 
			//finally블럭 내부에 작성하면된다.(불필요 시 생략 가능)
			System.out.println("코 드 끝");
		}
	
	}

}
