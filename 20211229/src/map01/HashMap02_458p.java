package map01;

import java.util.HashMap;
import java.util.Map;

public class HashMap02_458p {

	public static void main(String[] args) {
		
		// 메뉴판 만들기
		
		Map<String,Integer> menu = new HashMap<>();
		
		menu.put("에스프레소", 4000);
		menu.put("아메리카노", 4900);
		menu.put("카페라떼", 5200);
		menu.put("아포가토", 4700);
		menu.put("오렌지주스", 6000);
		
		System.out.println(menu.get("에스프레소"));
		System.out.println(menu.get("카페라떼"));
		System.out.println(menu.get("오렌지주스"));

	}

}
