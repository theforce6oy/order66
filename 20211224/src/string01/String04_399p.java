package string01;

public class String04_399p {

	public static void main(String[] args) {
		
		// length()는 문자열의 길이를 알 수 있습니다.
		// 정수로 몇 글자인지 알려준다.
	String name = "김수한무거북이와두루미어쩌고저쩌고시발시바리시발";
	System.out.println(name.length());
	
	//replace는 찾아바꾸기이다.
	//바꿀스트링 = 바꿀스트링.replace("찾을단어","바꿔줄단어"); 순으로 입력.
	String report = "안녕하세요. 리포트 보고자는 김영수입니다.";
	report = report.replace("김영수", "최영우");
	//report.replace("김영수", "최영우");(X) > 좌변에 꼭 저장을 해줘야 적용된다.
	System.out.println(report);

	}

}
