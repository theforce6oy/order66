
public class Break01 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int a =1;
		int[] arr = {9, 8, 7, 6, 1, 2, 3, 4, 5};
		
		
		for(int num : arr) {
			if(a == num) {
				System.out.println("1이 나와서 종료합니다.");
				break;
			}
				System.out.println("이번 숫자는" + num + "입니다.");
			}    
        }
    }