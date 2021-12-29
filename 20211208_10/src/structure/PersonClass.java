package structure;

   // 변수 클래스의 설계

public class PersonClass {

	public String name;
	public int age;
	public String pNum;
	public int uNum;
	public int heig;
	
	// 클래스 내부에 생성시엔 static을 쓰지않는다.
	public /*static*/ void getInfo() {
		
		System.out.println(name + "의 정보를 조회합니다.\n");
		System.out.println("이름 : "+ name +
		                   "\n식별번호 : " + uNum + 
		                   "\n신장 : " + heig + 
		                   "\n나이 : " + age +
		                   "\n폰번호 : " + pNum);
		
		System.out.println("-----------------------");
		
	}
}

