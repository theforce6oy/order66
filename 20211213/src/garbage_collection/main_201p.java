package garbage_collection;

public class main_201p {

	public static void main(String[] args) {
		
		item i1 = new item(1);
		item i2 = new item(2);
		i2 = null;
		item i3 = new item(3);
		System.gc();
		// 메모리를 중간에 회수하도록 강제명령
		item i4 = new item(4);
		i4 = null;
		item i5 = new item(5);
		i1 = null;
		System.gc();
		item i6 = new item(6);

	}

}
