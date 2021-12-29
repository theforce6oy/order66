package structure;

public class ClassMain01_196p {
	// PersonClass.java 내부에 
	// 필요한 메소드를 이미 작성했기에 Main에 또 다시 작성할 필요가 없다.
	
	public static void main(String[] args) {
		
		PersonClass c = new PersonClass(); // 앞서 설계한 PersonClass와 같은 클래스이름

        c.name = "Obiwan Kennobi";
        
        c.age = 76;
        
        c.pNum = "010-8832-9667";
        
        c.uNum = 344;
        
        c.heig = 179;
        
  
        PersonClass f = new PersonClass();

        f.name = "Bo Katan";
        
        f.age = 41;
        
        f.pNum = "010-2345-9664";
        
        f.uNum = 706;
        
        f.heig = 168;
        
        
        c.getInfo(); // 작성 흐름:'PersonClass c'의 getInfo를 호출한다. 
        f.getInfo(); // 'PersonClass f' 역시 같은 getInfo 구역에 해당하기 떄문에 클래스를 특정하지않고도 역시 호출가능.
                     // structure02 와 구문을 비교해 차이를 보자.
        // 같은 클래스 내 설계들이 'getInfo'라는 메소드로 묶여 인식되는 것을 체크.
        
       
	}


}
