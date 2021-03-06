package date01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		
		// Date는 날짜를 표현하는 클래스로 DB등과 통신시
		// 날짜를 받아오거나 넘겨주는 것이 권장된다.
		// 사용시 java.util.Date를 임포트해야한다.
		
		Date now = new Date();
		
		String strnow = now.toString();
		/*String strnow = now.toGMTString();*/
		
		
		System.out.println(now);
		System.out.println(strnow);
		
		// 표현되는 양식을 바꿀때 simpledateformat을 임포트하여 활용한다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		String strnow2 = sdf.format(now);
		System.out.println(strnow2);
		
		// now 변수에 들어있는 출력양식을 2021년 12월 27일 시 분 초로 변경해서 출력해보기
		SimpleDateFormat whattimeisit = new SimpleDateFormat("yyyy년 MM월 dd일 h시 mm분 ss초");
		String strnow3 = whattimeisit.format(now);
		System.out.println(strnow3);
		
		
		

	}

}
