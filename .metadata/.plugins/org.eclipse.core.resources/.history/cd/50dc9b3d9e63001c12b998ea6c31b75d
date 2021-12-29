package system01;

public class TimeCheck01_384p {

	public static void main(String[] args) {
		
		//currentTimeMills의 자료는 long형에 저장해야한다.
		long strt = System.currentTimeMillis();
		System.out.println("시작시간 "+strt);
		
		long all = 0;
		
		for (int a = 0; a<200000000; a++) {
			all+=a;
		}
		
		long end = System.currentTimeMillis();
		System.out.println("끝난시간 "+end);
		System.out.println("소요시간 "+(end-strt));
	}

}
