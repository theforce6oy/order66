package collection01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02_447p {

	public static void main(String[] args) {
		
		// String 자료를 가변배열로 받을 수 있는 ArrayList 만들기
		
		List<String> strlist = new ArrayList</*String*/>();
		
		strlist.add("사과");
		strlist.add("딸기");
		strlist.add("망고");
		strlist.add("블루베리");
		strlist.add("파인애플");
		
		System.out.println(strlist);
		
		// .contains(자료)는 리스트내에 찾는 자료가 있으면 true
		// 없으면 false를 출력해준다.
		System.out.println(strlist.contains("사과"));
		System.out.println(strlist.contains("멜론"));
		
		// .get(번호)는 주어진 인덱스에 저장되어있는 자료를 조회해준다.
		System.out.println(strlist.get(2));
		System.out.println(strlist.get(4));
		
		// 없는 인덱스번호를 입력하면 예외가 발생하여 전체 코드가 종료된다.
		// System.out.println(strlist.get100);
		
		// .size()로 내부요소의 총 갯수를 확인할 수 있다.
		System.out.println(strlist.size());
		
		// .isEmpty()는 해당 리스트가 비어있는지 여부를 체크해준다.
		System.out.println(strlist.isEmpty());
		
		List<String> strlist2 = new ArrayList<String>();
		System.out.println();
		System.out.println(strlist2.isEmpty());
		System.out.println(strlist2.size());
		

	}

}
