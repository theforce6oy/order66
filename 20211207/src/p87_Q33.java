
public class p87_Q33 {

	public static void main(String[] args) {
		
		boolean su01 = true;
		boolean su02 = false;
		int k = 0;
		
		System.out.println(su01 && su02);
		System.out.println(su01 || su02);
		
		System.out.println(!su01);
		System.out.println(!(!su01));
		
		k = (su01 && su02) ? 0 : 3; //거짓이므로 콜론 3
		k = (k != 0) ? 10 : 5; // 참이므로 ? 10
		
		k %= 10;
		System.out.println(++k); //먼저 ++한후 프린

	}

}
