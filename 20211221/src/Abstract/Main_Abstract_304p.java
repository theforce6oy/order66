package Abstract;

public class Main_Abstract_304p {

	public static void main(String[] args) {
		
		//Parent a = new Parent();(X)
		//Parent는 추상클래스 이기때문에 new키워드로 생성이 불가능
		
		Parent a = new Child();//상속해야 생성
		
		a.getAge(); //추상메소드 오버라이딩
		
		a.getInfo(); //일반메소드
	}

}
