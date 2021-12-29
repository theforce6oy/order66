package structure;

public class Structure01_190p {

	public static void main(String[] args) {
		
		// 실행코드와 정의코드의 분리
		// main이 있는 클래스만 실행하고
		// 실제 로직은 다른 파일에 저장
		// 아래와 같은 문법으로 생성
		
        Person p1 = new Person();

        
        // p1내부에 정의한 변수를 부여한다.
        // p1.변수명 = 대입할 값; 형태로 저장한다.
        
         p1.name = "forceboy";
         System.out.println(p1.name);
         
         p1.age = 20;
         System.out.println(p1.age);
         
         p1.pNum = "01082649668";
         System.out.println(p1.pNum);
         
         p1.uNum = 501;
         System.out.println(p1.uNum);
         
         Person p2 = new Person();
        // 독립적인 그룹으로 인식하는 Person 값 체크
         
          p2.name = "최영우";
          System.out.println(p2.name);
          
          p2.age = 32;
          System.out.println(p2.age);
          
          p2.pNum = "0106121212";
          System.out.println(p2.pNum);
          
          p2.uNum = 5012;
          System.out.println(p2.uNum);
          
          
          Person p3 = new Person();
           
            p3.name = "최일우";
            System.out.println(p3.name);
            
            p3.age = 92;
            System.out.println(p3.age);
            
            p3.pNum = "01012131242";
            System.out.println(p3.pNum);
            
            p3.uNum = 5013;
            System.out.println(p3.uNum);
         
	}
	
	

}
