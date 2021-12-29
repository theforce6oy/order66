package constructor;

public class Main03_204p {

	public static void main(String[] args) {
		
		Webtoon a = new Webtoon("카우보이비밥", 1, "선라이즈", false);
		
		a.getInfo();
		
		a.uploadWebtoon();
		
		a.getInfo();
		
		a.uploadWebtoon();
		
		a.getInfo();
		
		a.completeWebtoon();

		a.getInfo();
	}

}
