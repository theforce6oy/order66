package collection01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01_447p {
	
  
	public static void main(String[] args) {
		
		// List
		// ArrayList, LinkedList가 있고 기본적으로는 ArrayList를 쓰게된다.
		// java.util의 List나 ArrayList를 사용할 수 있다.
		
		// List는 생성시 List<자료형>을 적어넣어 해당 자료형을
		// 가변길이를 가진 배열형태로 받아줄 수 있다.
		// <>사이에는 기본형자료(int, double, boolean 등)를 넣을 수 없다.
		
		// 정수 자료를 받을 수 있는 리스트 생성 (길이는 가변적)
		
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println(list1);
		
		list1.add(10);
		System.out.println(list1);
		
		list1.add(1,100); // 1번에 100을 한칸 밀어내고 추가하겟다는 의미 (새치기)
		System.out.println(list1);
		
		list1.set(1, 99); // 1번에 99를 덮어씌워 추가하겟다는 의미 (교체)
		System.out.println(list1);
		
		
		
		
		
		
		
		
		
		
		
	}

}
