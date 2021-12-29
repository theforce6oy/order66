package thiskeyword;

public class Person {
	
	private String name;
	private int age;
	private int money;
	private String major;
	
	public Person(String name, int age, int money, String major) {
	  /*name = name;
	    age = age;
	    money = money;
	    major = major; */
		
		this.name = name;
	    this.age = age;
	    this.money = money;
	    this.major = major;
	  //this.~는 생성자(메소드) 지역 내부의 변수(상단 괄호)를
	  //직접적으로 최상위 클래스의 변수로 가리킬때 this를 사용한다.
	}    
    public void getInfo() {
    
    	System.out.println("사람 생성\n");
    	System.out.println("이름: "+this.name+ //최상위 클래스의 변수를 가리키므로
    			         "\n나이: "+this.age+ //여기에도 this.~ 사용가능.
    			      "\n소지금액: "+money+
    			         "\n전공: "+major); 
    	System.out.println();
    	
    }
}

