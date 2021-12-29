package game.inheritance;

public class Main01_commoner {

	public static void main(String[] args) {
		
		Commoner a = new Commoner("theforce6oy");
	  //코드 호출 순서
	  //main > (String)Commoner > 
	  //(getInfo)Commoner > main > 호출
		
	  /* a.id = "나초보"; (X)
	   * System.out.println(a.id+a.lv); (X)
	   * 생성자를 private로 접근제한을 하면
	   * 사용자가 main에서 임의로 변수를 고칠수 없다*/
		
		a.getInfo();
		
		Warrior b = new Warrior("darkforce");
      //코드 호출 순서
      //main > (String)Warrior > (super)Commoner > 
      //(getInfo)Warrior > main > 호출
		
		b.getInfo();
		
		Magician c = new Magician("order66");
			
		c.getInfo();
	    
		Archer d = new Archer("bobabova");
	    
	    d.getInfo();
		
		}
	}



