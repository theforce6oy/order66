package collection01;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

	public static void main(String[] args) {
		
		// LinkedList는 자료의 변경이 빈번할때 사용하면 성능향상이 있다.
		// ArrayList와 사용법의 차이는 없지만 작동로직이 다르다.
		
		List<String> list1 = new LinkedList<String>();
		
		list1.add("자바");
		list1.add("jsp");
		list1.add("스프링");
		list1.add("스프링부트");
		System.out.println(list1);
		
		// .remove()는 두 유형이 있음
		// .remove(번호)를 넣으면 해당 인덱스의 자료가 삭제되고
		// .remove("자료")를 넣으면 번호와 상관없이 해당 자료를 삭제한다.
		
		list1.remove(0);
		System.out.println(list1);
		
		list1.remove("스프링");
		System.out.println(list1);
		
		list1.clear(); // 리스트를 전부 비우기
		System.out.println(list1);
		
		list1.add("망고");
		list1.add("파인애플");
		list1.add("용과");
		list1.add("파파야");
		
		// 자료정렬은 Collections.sort(정렬대상)으로 작성한다.
		Collections.sort(list1);
		System.out.println(list1);
	}
	
	}


