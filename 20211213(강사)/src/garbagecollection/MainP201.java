package garbagecollection;

public class MainP201 {

	public static void main(String[] args) {
		// 6개 객체생성
		Item i1 = new Item(1);
		Item i2 = new Item(2);
		i2 = null;
		Item i3 = new Item(3);
		// 메모리 중간에 회수하도록 강제 명령
		System.gc();
		Item i4 = new Item(4);
		i4 = null;
		Item i5 = new Item(5);
		i1 = null;
		System.gc();
		Item i6 = new Item(6);
		
	}

}
