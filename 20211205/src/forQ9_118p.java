
public class forQ9_118p {

	public static void main(String[] args) {
		
		// 4x + 5y = 60 방정식의 
		// '양의 정수' 해를 모두 구하시오.
		// x, y 둘다 0이면 안됨.
		// x포문, y포문, if포문 필요함.
		
	for(int x=1; x<15; x++) {
		for(int y=1; y<12; y++){
			if(4*x + 5*y == 60) {
				System.out.println(x+ " 와 " +y);
			}
			
		}
	}
		
		

	}

}
