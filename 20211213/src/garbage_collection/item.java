package garbage_collection;

public class item {

	public int num;
	
	public item(int n) {
		num = n;
		System.out.println(num+"번째 객체생성");
	}
	
	//소멸자 (finalize)
	//생성자는 객체가 생성될때 반드시 호출되고
	//소멸자는 객체가 소멸될때 호출된다.
	protected void finalize() {
		System.out.println(num + "번째 객체삭제");
	}


}
