package system01;

public class TimeCheck02_384p {

	public static void main(String[] args) {
		
		long strt = System.currentTimeMillis();
		System.out.println("시작시간 "+strt);
		try {
			throw new ArithmeticException();
		}
			catch (Exception e) {
				e.printStackTrace();	
			}
		
		long end = System.currentTimeMillis();
		
		System.out.println("끝난시간 "+end);
		System.out.println("소요시간 "+(end-strt));
	}

	}


