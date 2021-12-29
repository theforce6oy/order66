import java.util.Scanner;

public class elseIf01_97p {

	public static void main(String[] args) {
		
		// else if는 추가적인 조건을 달 때 사용한다.
		// if문 다음에 작성하며, else문 이전에 작성한다.
		// else~if문은 if~else와 달리 조건식을 추가로 기입해야함.
		// else~if문은 몇개라도 작성 가능하다.
	
		Scanner scan = new Scanner(System.in);
		System.out.println("fuck 계산기");
		int fuck = scan.nextInt();
		
		if(fuck>0) {
			System.out.println("존나 크네!");
			
		}else if(fuck==0) {
			System.out.println("없노.");
		}else {
			System.out.println("작노.");
		}
		scan.close();
		}
	}


