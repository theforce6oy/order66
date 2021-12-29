package casting;

public class Main02 {

	public static void main(String[] args) {
		
		Animal aa = new Cat("네로", 3);
		
		System.out.println(aa instanceof Cat);
		//aa값과 연결된 heap쪽 자료가 Cat인지 확인하는 구문
		
		System.out.println(aa instanceof Dog);
		
		System.out.println(aa instanceof Animal);
		//Animal이 Cat 타입을 포함하고 있으므로 True값 출력
		
	}

}
