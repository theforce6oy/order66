package overloading;

public class Parttimer {
	
	private String name;
	private boolean afternoon;//오전오후여부
	private int payperhr;//시급
	private String shopName;
	
	public Parttimer(String n,boolean a, int p, String s) {
		
		name = n;
		afternoon = a;
		payperhr = p;
		shopName = s;
		
		if(p<8720) {
			payperhr = 8720;
			System.out.println("구두쇠라 알바못합니다.");}
			else {
				payperhr = p;}
				
		System.out.println("알바생성 "+name);
		System.out.println();
		System.out.println("오후알바: "+afternoon);
		System.out.println("시급: "+payperhr);
		System.out.println("가게명: "+shopName);
		System.out.println();	
	}
	
	//오버로당은 이름은 같은데 파라미터값의 종류나 개수가 다르면 중복작성을 허용한다.
	public Parttimer(boolean a, String s, String n) {
		
		name = n;
		afternoon = a;
		payperhr = 8720;
		shopName = s;
		
		System.out.println("알바생성 "+name);
		System.out.println();
		System.out.println("오후알바: "+afternoon);
		System.out.println("시급: "+payperhr);
		System.out.println("가게명: "+shopName);
		System.out.println();
	}
	
}
