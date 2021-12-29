package heapmemory;

public class StringComparison {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println(str1);
		System.out.println(str2);
		
	    System.out.println(str1.hashCode());
	    System.out.println(str2.hashCode());
	    // 일반 변수의 배정값 조회시 .hashCode()를 쓴다.
	    // 문자열은 같은 문자로 저장시 같은 주소를 공유하는것을 알 수있다.
	   
	    // 문자열은 아래와 같이 일부분만 변경이 불가하다. 
	    // str1[0] = "Q";
	    
	    // str1 == str2 와 같이 비교하는것은 문자열 비교가 아닌 주소비교이다.
	    // 주소비교로 진행할경우 2번째와 같이 같은 문자열임에도 false값이 나오므로..
	    
	    // new 키워드로 생성시 내용이 같은 문자열도 별개의 공간을 새로 배정해 만든다.
	    System.out.println(new String("Hello"));
	    System.out.println(str1 == new String("Hello"));
	    System.out.println(str1 == str2);
	    
	    // 문자열간 비교는(주소가 아닌 내용물간 비교) .equals()로 진행한다.
	    System.out.println(str1.equals(new String("Hello")));
	    System.out.println(str1.equals(str2));

	}

}
