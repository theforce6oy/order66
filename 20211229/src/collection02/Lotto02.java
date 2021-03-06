package collection02;

import java.util.ArrayList;
import java.util.List;

public class Lotto02 {

	public static void main(String[] args) {
		
		// 리스트 역시 참조형 변수이기 때문에 주소값을 비교한다.
		// 따라서 단순 ==비교가 아닌 리스트1.equals(리스트2)
		// 를 이용해서 데이터를 비교해줘야한다.
		
        List<Integer> l1 = new ArrayList<>();
		
		List<Integer> l2 = new ArrayList<>();
		
		System.out.println("주소값비교: "+(l1 == l2));
		System.out.println(""+l1+l2);
		
		
		l1.add(1);
		l1.add(2);
		l2.add(1);
		l2.add(2);
		
		System.out.println(l1.equals(l2));
		
		l1.clear();
		l2.clear();
		
		l1.add(1);
		l1.add(2);
		l2.add(2);
		l2.add(1);
		
		System.out.println(l1.equals(l2));
		

	}

}
