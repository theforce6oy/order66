package exception3;

public class Throw01_361p {

	public static void main(String[] args) {
		
		// throw는 예외상황이 아니지만 예외를 강제로 발생시킨다.
		
		System.out.println(Math.random());
		// Math.random()은 '0 <= 난수 < 1' 범위를 가지는 '난수'를 발생시키는 값이다.
		
	    System.out.println(Math.random()*10);
	    // 범위를 0~9로 만들어 보았다.
	    
	    System.out.println((int)(Math.random()*10));
	    // 범위를 0~9의 정수로 만들어보았다.
	    
	    int a = (int)(Math.random()*10);
	    System.out.println(a);
	    // 범위를 0~9의 정수로 만들어 해당 값에 특정변수를 지정하여 출력해보았다.
	    
	    try{
	    	if(a > 3) {
	    		throw new ArrayIndexOutOfBoundsException();
	    		//발생하지 않은 ArrayIndexOutOfBoundsException 만들기
	    	}
	    	else {
	    		System.out.println("정상 범위 난수 발생");
	    	}
	    }
	    	catch (Exception e) {
	    		System.out.println("없던 예외를 만들었습니다.");
	    		
	    	    e.printStackTrace();
	    	   //콘솔에 상세 예외정보를 보여주는 구문 
	    	   //java.lang.ArrayIndexOutOfBoundsException
	    	    
	    	}
	    }

	}

