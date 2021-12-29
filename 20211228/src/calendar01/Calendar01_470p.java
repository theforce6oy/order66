package calendar01;

import java.util.Calendar;

public class Calendar01_470p {

	public static void main(String[] args) {
		
		// 현재 시간을 요일, 오전/오후 등으로 표기하는 Calendar
		// Calendar.getInstance();를 이용해 사용한다.
		// 추상 클래스 이므로 new 키워드를 쓸 수 없다.
		
		Calendar now = Calendar.getInstance();
		
		// now.get(Calendar.얻고싶은정보);
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)); //월은 0부터 시작'
		System.out.println(now.get(Calendar.DAY_OF_MONTH)); 
		System.out.println(now.get(Calendar.DAY_OF_WEEK)); // 요일은 1이 일요일, 7이 토요일
		System.out.println(now.get(Calendar.AM_PM)); // 오전 0 오후 1
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
		
		
		

	}

}
