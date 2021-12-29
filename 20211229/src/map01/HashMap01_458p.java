package map01;

import java.util.HashMap;
import java.util.Map;

public class HashMap01_458p {

	public static void main(String[] args) {
		
		// Map 인터페이스의 대표 규현체는 HashMap이다.
		// 제네릭 내부에는 <Key자료형, Value자료형>으로 작성한다.
		
		Map<String,String> map = new HashMap<>();
		//      Key     Value
		map.put("최영우", "자바");
		map.put("코로나", "백신");
		map.put("정은", "네일");
		
		System.out.println(map);
		
		// 자료 조회시에는 .get(key값)으로 조회한다.
		// map은 키로 벨류를 조회하는건 가능하지만 역으로 벨류로 키를 조회하는건 불가능하다.
		// 아날로그 사전에서 [뜻으로는 단어를 찾을 수 없지만 단어로는 뜻을 찾을 수 있는] 격.
		
		// 없는 키값으로 조회하면 null값 출력.
		// 인덱스 번호도 없다.
		
		System.out.println(map.get("정은"));
		System.out.println(map.get("백신")); //(X)
		
		// remove는 Key를 이용해서 Key = Value 전체를 삭제한다.
		map.remove("코로나");
		System.out.println(map);
		
		// .size()는 크기를 알려준다. 정수로 몇개의 key = value 쌍이 저장되어있는지 알수있다.
		System.out.println(map.size());

	}

}
