package string01;

import java.util.Scanner;

public class String10_399p {

	public static void main(String[] args) {
		//로그인 로직만들기
		
		String id = "theforce6oy";
		String pw = "awdda12213124";
		
		Scanner scan = new Scanner(System.in);
		
		String uId;
		
		Scanner scan2 = new Scanner(System.in);
		
		String uPw;

		/*boolean a = true;
		
		while(a) {
			System.out.println("아이디 입력");
			uId = scan.nextLine();
		
	    	if(!id.equals(uId)) {
	    		System.out.println("그런 아이디는 없습니다");
	    	}
	    	else {
	    		System.out.println("패스워드 입력");
				uPw = scan2.nextLine();
	
			if(!pw.equals(uPw)) {
		    	System.out.println("비밀번호가 틀렸습니다.");
		    	
		    }
			else {
				a = false;
	    		System.out.println(id+"님 환영합니다.");
	    	}
	    }
	}*/
		System.out.println("아이디 입력");
		uId = scan.nextLine();
	
    	if(id.equals(uId)) {
    		System.out.println("패스워드 입력");
			uPw = scan.nextLine();
			
			if(!pw.equals(uPw)) {
		    	System.out.println(id+"님 환영합니다.");
		    }
			else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
    	}
		
		else {
			System.out.println("그런 아이디는 없습니다");
		}
    	}
    	
	}

      
	
		

	


