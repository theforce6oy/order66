
public class Break02 {

	public static void main(String[] args) {
	
		for(int b =2; b<=9; b++) {
	        System.out.println(b+"단 출력");
	            for(int c = 1; c<=9; c++) {
	            	if(c>3) {
	            		System.out.println("4부터는 직접해요");
	            		break;
	            	    }
	            	System.out.println(b+"*"+c+"="+b*c);
	                }
	        System.out.println("------------");
	        }
	}

}
