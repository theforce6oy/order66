package constructor;

public class Webtoon {

	public String name;
	public int series;
	public String painter;
	public boolean complete;
	
	public Webtoon(String n, int s, String p, boolean c) {
	// 생성자 
	// 생성자는 반드시 클래스 안에 하나 이상 선언해야 함.
	// 생성자를 만들지 않을경우 자동으로 빈 생성자 하나를 자바가 생성함.
		
		name = n;
		series = s;
		painter = p;
		complete = c;
        // 지역변수
	}
	public void getInfo() {
		System.out.println("제목은 "+name+"입니다.");
		System.out.println("회차는 " +series+"회 입니다.");
	}
	public void uploadWebtoon() {
		series += 1;
	}
    public void completeWebtoon() {
    	complete = true;
    	System.out.println(name+"은");
		System.out.println(series+"회로 완결되었습니다.");
    }
}

