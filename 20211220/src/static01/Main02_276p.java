package static01;

public class Main02_276p {

	public static void main(String[] args) {
		
	  //static 변수는 생성 없이도 활용할 수 있다.
		System.out.println(StaticTest.num2); //static 적용시 이탤릭체로 폰트가 변함..
	 
	  //System.out.println(StaticTest.mum1);(X)
      //현재 예시에서 num1은 static변수가 아니므로 Main에서 생성 후 불러올수있다.
		
	  //System.out.println(num2);(X)
	  //현재 예시에서 num2는 메인 생성 이전에 이미 메모리단에서 생성이 되어있으나
	  //StaticTest. 라는 소속을 기재해야 정상적으로 출력이 가능하다.
		
		StaticTest.check(); //StaticTest.java Line 27
      //생성자가 아닌 메소드 역시 static으로 설정 가능하다.
		
		StaticTest s1 = new StaticTest();
	    s1.check();
      //기존의 경우 변수값 s1을 생성후 해당 메소드를 생성 가능했다.
		
	}

}
